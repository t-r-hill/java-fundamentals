package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_02

    For this challenge, please research and implement a custom Trie data structure (https://en.wikipedia.org/wiki/Trie).

    Trie's are very interesting and useful data structures. Many interview questions, and real-world scenario's
    can be properly addressed using a Trie. We use Tries to store things like words and numbers in a highly
    efficient manner. See here: http://theoryofprogramming.com/wp-content/uploads/2015/06/trie12.jpg

    Understanding and implement a Trie is a fantastic step in thinking creatively as a developer to
    accomplish goals as efficiently as possible.

    Here is a fantastic set of relevant interview questions: https://www.techiedelight.com/trie-interview-questions/

 */

import java.util.HashMap;
import java.util.Map;

class Exercise_02{
    public static void main(String[] args) {
        Trie dict = new Trie();
        dict.insert("this");
        dict.insert("that");
        dict.insert("the");
        dict.insert("thin");
        dict.insert("think");
        dict.insert("thought");

        System.out.println(dict.search("this"));
        System.out.println(dict.search("that"));
        System.out.println(dict.search("than"));

        System.out.println(dict.printInOrder());

        System.out.println(dict.predict("thi"));

        dict.remove("than");
        System.out.println(dict.printInOrder());

        dict.remove("thought");
        System.out.println(dict.printInOrder());

        dict.remove("thin");
        System.out.println(dict.printInOrder());
    }
}
class Trie{
    TrieNode root;

    Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            if (!node.children.containsKey(ch)){
                node.children.put(ch, new TrieNode());
            }

            node = node.children.get(ch);
        }
        node.isLeaf = true;
    }

    public String printInOrder(){
        String output = "";
        output = printInOrderRecursively("", root, output);
        return output;
    }

    private String printInOrderRecursively(String str, TrieNode node, String output){
        if (node.isLeaf){
            output += str + " ";
        }
        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            Character k = entry.getKey();
            TrieNode v = entry.getValue();
            output = printInOrderRecursively(str + k, v, output);
        }
        return output;
    }

    public String predict(String subString){
        TrieNode subNode = getNodeRecursively(subString, root);
        if (subNode.equals(root)){
            return "Substring is not in dictionary";
        } else{
            return printInOrderRecursively(subString, subNode, "");
        }
    }

    public boolean search(String word){
        return getNodeRecursively(word, root).isLeaf;
    }

    private TrieNode getNodeRecursively(String word, TrieNode node){
        if (word.isEmpty()){
            return node;
        }
        char ch = word.toCharArray()[0];
        if (node.children.getOrDefault(ch, null) != null){
            return getNodeRecursively(word.substring(1), node.children.get(ch));
        } else return root;
    }

    public void remove(String word){
        removeRecursively(word, root);
    }

    private TrieNode removeRecursively(String word, TrieNode node){
        if (word.isEmpty()){
            if (node.isLeaf){
                node.isLeaf = false;
                if (node.children.values().isEmpty()){
                    node = null;
                }
            } else {
                System.out.println("Word could not be found");
            }
            return node;
        }

        char ch = word.toCharArray()[0];
        if (node.children.getOrDefault(ch, null) != null){
            node.children.replace(ch, removeRecursively(word.substring(1), node.children.get(ch)));
        } else {
            System.out.println("Word could not be found");
            return node;
        }

        node.children.entrySet().removeIf(characterTrieNodeEntry -> characterTrieNodeEntry.getValue() == null);

        if (node.children.values().isEmpty() & !node.isLeaf){
            node = null;
        }
        return node;
    }
}

class TrieNode{
    boolean isLeaf;
    Map<Character, TrieNode> children;

    TrieNode(){
        isLeaf = false;
        children = new HashMap<>();
    }
}
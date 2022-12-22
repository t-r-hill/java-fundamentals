package labs_examples.datastructures.hashmap.labs;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomHashMap2<K, V> {

    // create the underlying Entry array with the initial size of 10
    private Entry<K, V>[] entryArray = new Entry[10];

    // track the current number of elements in the hashmap
    private int numEntries = 0;


    /**
     * Hashes the given key and returns a table index
     *
     * @param key to be hashed
     * @return a table index
     */
    private int modHash(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index = Math.abs(key.hashCode() % entryArray.length);
        // the result will be the index where we can find and/or place entries
        return index;
    }

    /**
     * Adds the key-value pair to the hashmap
     *
     * @param key   a key Object
     * @param value a value Object
     */
    public void putEntry(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = modHash(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        Entry<K,V> entry = new Entry(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (entryArray[index] == null) {

            entryArray[index] = entry;
            numEntries++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index and assign to variable
            Entry<K, V> p = entryArray[index];

            // replace the Entry wihtin the array
            entryArray[index] = entry;

            // assign the previous entry as next of the new entry
            entry.next = p;
            numEntries++;
        }

        // check for resize
        if (numEntries > entryArray.length * .5) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resizeMap();
        }
    }

    /**
     * Resizes the underlying array to double its previous size and copies the old values into it
     */
    private void resizeMap() {
        // make a copy of the existing table and call it "old"
        Entry<K, V>[] old = entryArray;
        // create a new Entry[] that is twice the size of the old one
        entryArray = new Entry[old.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry entry = old[i];
                // call the put() method passing the key and value to add this element to the new table
                putEntry((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    putEntry((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    public void replaceEntry(K key, V newValue){
        if (getEntry(key) == null){
            return;
        }

        int index = modHash(key);

        Entry<K,V> entry = entryArray[index];

        if (entry.getKey().equals(key)){
            entry.setValue(newValue);
            return;
        } else{
            while (entry.next != null){
                if (entry.getKey().equals(key)){
                    entry.setValue(newValue);
                    return;
                } entry = entry.next;
            }
        }

    }

    /**
     * Removes the pair at the given key from the hashmap
     *
     * @param key of the pair to be removed
     */
    public void removeEntry(K key) {

        // ensure key exists by calling the get() method
        if (getEntry(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index = modHash(key);

        // get the Entry at the index
        Entry<K, V> entry = entryArray[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)){
            entryArray[index] = null;
            numEntries--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry.next.next != null){
            entry.next = entry.next.next;
            numEntries--;
            return;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry.next = null;
            numEntries--;
            return;
        }
    }

    /**
     * Finds the value of a key
     *
     * @param key to search for
     * @return value of the given key
     */
    public V getEntry(K key) {
        // call the hash() method to get the index for the key
        int index = modHash(key);

        // nothing at key - return null
        if (entryArray[index] == null) {
            System.out.println("The key - " + key + " does not exist");
            return null;
        }

        // otherwise, get the Entry at the index
        Entry<K, V> entry = entryArray[index];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getValue();
    }

    /**
     * For Testing: gets the size of the underlying array
     *
     * @return int storage size
     */
    public int getStorage() {
        return entryArray.length;
    }

}

/**
 * A Key-Value Pair
 */
 class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */
        ReadData readData = new ReadData("air_travel");

        String passenger7 = readData.readPassenger(7);
        String flight4 = readData.readFlight(4);

        System.out.println(passenger7);
        System.out.println(flight4);

        CreateUpdateData createUpdateData = new CreateUpdateData("air_travel");

        createUpdateData.createFlight(1,1,2,"2023-01-01", 1111);
        createUpdateData.createPassenger("Vitalik", "Buterin", "bigv@eth.com");

        createUpdateData.updatePassenger(14, "Satoshi", "Nakamoto", "bigs@btc.com");
        createUpdateData.updateFlight(15,1,1, 3,"2023-01-01", 1112);

        DeleteData deleteData = new DeleteData("air_travel");

        deleteData.deletePassenger(14);
        deleteData.deleteFlight(16);
    }

}
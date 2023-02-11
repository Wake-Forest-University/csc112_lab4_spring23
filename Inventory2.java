/**
 * CSC 112 Lab4 (Updated Exceptionally Unique Inventory) Spring 2023
 * This program reads inventory and update files, and creates a database (list)
 * of unique ID numbers. Statistics about the database and file contents
 * are then displayed. The maximum list size and file name are read
 * from the user.
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Feb. 10, 2023
 */
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Inventory2 {
    public static void main(String[] args) {
        int maxListSize;        // physical (maximum) size of the database
        String inFileName;      // inventory file name
        String upFileName;      // update file name
        var keyboard = new Scanner(System.in); // keyboard
        Scanner inFile = null;  // inventory file scanner
        Scanner upFile = null;  // update file scanner

        // read listSize, inFileName, and upFileName from the user
        System.out.print("Enter database size, inventory file name, and update file name  -> ");
        maxListSize = keyboard.nextInt();
        inFileName = keyboard.next();
        upFileName = keyboard.next();

        // open the scanners (if possible)
        inFile = openFileScanner(inFileName);
        upFile = openFileScanner(upFileName);

        var list = new int[maxListSize];  // the database
        var size = 0;                     // database logical size

        // process inventory file
        System.out.println("processing: " + inFileName);
        size = readInventoryFile(inFile, list);
        // print in ascending order the unique IDs stored in list
        System.out.println(Arrays.toString(Arrays.copyOf(list, size)));

        // process update file
        System.out.println("processing: " + upFileName);
        size = readUpdateFile(upFile, list, size);
        // print in ascending order the unique IDs stored in list
        System.out.println(Arrays.toString(Arrays.copyOf(list, size)));
    }


    /**
     * Opens the file fileName and returns an associated scanner if
     * possible.
     *
     * @param fileName String is the file name
     * @return Scanner for the file if is can be opened
     */
    private static Scanner openFileScanner(String fileName) {
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e) {
            System.out.println("Error in opening " + fileName);
            System.exit(0);
        }
        return fileScanner;
    }


    /**
     * Reads the contents of inFileName and stores the unique IDs in
     * list. Maintains statistics about the items.
     *
     * @param inFileName String is the inventory file name
     * @param list int[] is the static list of unique IDs
     * @return size is int logical size of list
     */
    private static int readInventoryFile(Scanner inFile, int[] list) {
        var size = 0;  // number of items stored in list (logical size)

        inFile.close();
        return size;
    }


    /**
     * Reads the contents of upFileName an processes the actions while updating
     * the list. Maintains statistics about the items.
     *
     * @param upFileName String is the update file name
     * @param list int[] is the static list of unique IDs
     * @return size is int logical size of list
     */
    private static int readUpdateFile(Scanner upFile, int[] list, int size) {

        upFile.close();
        return size;
    }

    // more code would certainly follow...
}


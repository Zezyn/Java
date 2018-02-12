/*
A text editor for the final
Created by Martin Hernandez
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    private static ArrayList<String> txt = new ArrayList<String>();
    static int wordIndex = 1;

    public static void main(String[] args) {
        //create new()
        newEditor();
        //create edit()
        edit();
    }

    public static void menu() {
        //Display user menu
        System.out.println("*****************************************************************");
        System.out.println("                     Line        Editor                     ");
        System.out.println("*****************************************************************");
        System.out.println("!N = Blank Page | !E = Edit | !O = Open | !S = Save | !Q to quit");
        System.out.println("*****************************************************************");
    }

    public static void newEditor() {
        //Displays menu, clears array list and sets wordIndex back to 1 before resuming to editor
        menu();
        txt.clear();
        wordIndex = 1;
        edit();
    }

    public static void edit() {
        //Used for user input
        Scanner userInput = new Scanner(System.in);

        //Accepts user input all the while scanning for menu commands
        while(txt.add(userInput.next())) {
            for (String word : txt) {
                wordIndex++;
                if (word.equals("!N")) {
                    txt.remove(txt.size()-1);
                    newEditor();
                    System.out.println("*** New Document ***");
                }
                else if (word.equals("!E")) {
                    txt.remove(txt.size()-1);
                    edit();
                    System.out.println("*** Editing Document ***");
                }
                else if (word.equals("!O")) {
                    txt.remove(txt.size()-1);
                    load();
                    }
                else if (word.equals("!S")) {
                    txt.remove(txt.size()-1);
                    save();
                    break;
                }
                else if (word.equals("!Q")) {
                    txt.remove(txt.size()-1);
                    System.out.println("Good Bye");
                    exit(1);
                }
            }
        }
    }

    public static void load() { //THIS ISNT WRITING INTO THE ARRAY FOR SOME REASON
        // Prompt for the input file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();

        // Construct the Scanner and objects for reading
        File inputFile = new File(inputFileName);
        Scanner in = null;
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Insures array is empty for file input
        txt.clear();

        // Read the input and write to arraylist txt
        while (in.hasNext()) {
            txt.add(in.next());
        }
        //Prints contests to screen
        print();
        in.close();
        }

    public static void save() {
        // Prompt for the user for output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Output file: ");
        String outputFileName = console.next();

        // Construct the Scanner and PrintWriter objects for writing
        PrintWriter out = null;
        try {
            out = new PrintWriter(outputFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //write the output
        for (String word : txt) {
            out.print(word + " ");
        }
        out.close();
        print();
    }

    public static void print() {
        //Used to print arrayList to screen
        for (String word : txt) {
            System.out.print(word + " ");
        }
    }
}

import java.util.Random;        //Random successfully been implemented by the system (see Line 10)

public class Main {             //creating class Main

    static char minValue = 990; //set static var "minValue", declare MIN random value

    static char maxValue = 1510; //set static var "maxValue", declare MAX random value

    static Random rand = new Random();
    //set static object Random-type with name "rand" -> using by the SYSTEM for generating random values;
    // operator "new" -> possibility to create new objects;
    //Random is implementing by the system (see Line 1) automatically;

    static char getRandomValue() {
        //implement object "getRandomValue" which calculates a some value as follows
        //calculating new value each run

        // ==== FIRST WAY ==== //
        return (char) (minValue + rand.nextInt(maxValue - minValue));
        //return random value calculating according to the formula and converting it to "char" type

        // ==== SECOND WAY ==== //
//        int a = rand.nextInt(maxValue -minValue);
//        char value = (char) (a % Character.MAX_VALUE);
//        return value;
    }

    static void printArray(char[] mySymbol) { //method "printArray" receive the char-type array to the input, with "mySymbol" var name
        int n = 0;  //since we use "do while" loop there is necessity to implement an iterator - var "n"
        do {        // execute the code followed below in { } while ....
            System.out.println(n + " :: " + mySymbol[n] + " :: " + Integer.valueOf(mySymbol[n])); //output using new line iterator value and var "mySymbol" and value of var "mySymbol"
            n++;    //iterator "n" should be incremented
        } while (n < mySymbol.length); // ....while iterator "n" < length of var "mySymbol"
    }

    public static void main(String[] args) { // start of main method == "entry point" == take for input array of strings, named "args"
        String lineSeparator = System.lineSeparator(); //declare string-type var "lineSeparator" - system returns line-separator
        int arrayLength = 19; //declare int-type var with name "arrayLength" and its property

        System.out.println("---=== BUBBLE SORTING ===---"); //Print the Title declared in the quotes

        char[] arrayToSort; //declare char-type array "Array to sort"
        arrayToSort = new char[arrayLength]; //create memory for the array
        for (int a =0; a < arrayLength; a++) { //initialises the array
            arrayToSort[a] = getRandomValue(); //put some value to the array
        }
        System.out.println("=== ARRAY BEFORE SORTING ==="); //Print the Title declared in the quotes
        printArray(arrayToSort); //Print the current sorted Array

        for (int c = 1; c < arrayToSort.length; c++) { // outer loop, passing whole array, the iterations qty is 1 less than array's length
            for (int d = 0; d < c; d++) { // inner loop, passing not-sorting part of array, compare a pair of variables "c" and "d"
                if (arrayToSort[c] > arrayToSort[d]) { //implements condition -> when the element with index "c" greater than "d"
                    var tmp = arrayToSort[c]; //implements 3-rd temporary var "tmp", for  element index "c" put inside
                    arrayToSort[c] = arrayToSort[d]; //then element with index "c" get value of element with index "d"
                    arrayToSort[d] = tmp; //and then element with index "d" get the value from temporary var, which was originally the value of "c"
                } //Sorting completed
            }
        }
        System.out.println("=== ARRAY AFTER SORTING ==="); //Print the Title declared in the quotes
        printArray(arrayToSort); //Print the current sorted Array
    }
}

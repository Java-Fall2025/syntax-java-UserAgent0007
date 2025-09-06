package ua.university;


/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        
        int sum = a + b + c;
        float average = ( a + b + c ) / 3.0f;

        double[] list = {sum, average};
        
        return list;
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        
        if (a > b){
            return a;
        }

        else if (b > a && b > c){

            return b;
        }

        else{
            return c;
        }
        
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        
        if (score >= 90 && score <= 100){
            // char letter = 'a';
            
            return 'A';
        }
        // throw new назва error (message)
        
        // return 'a';

        else if (score >=80 && score <= 89){

            return 'B';
        }

        else if (score >= 70 && score <= 79){

            return 'C';
        }

        else if (score >= 60 && score <= 69){

            return 'D';
        }

        else if (score >= 50 && score <= 59){

            return 'E';
        }

        else if (score >= 0 && score <= 49){

            return 'F';
        }

        else {

            throw new IllegalArgumentException("error");
        }

    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        switch (day){

            case 1:{
                return "Monday";
            }

            case 2:{
                return "Tuesday";
            }

            case 3:{
                return "Wednesday";
            }

            case 4:{
                return "Thursday";
            }

            case 5:{
                return "Friday";
            }

            case 6:{
                return "Saturday";
            }

            case 7:{
                return "Sunday";
            }

            default:{
                throw new IllegalArgumentException("error");
            }
        }
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        
        if (n < 0){

            throw new IllegalArgumentException("error");
            
        }
        
        int [] array = new int[n];
        int j = 0;

        

        for (int i = n; i >= 1; i--){
            array[j] = i;

            j++;
        }

        return array;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        
        if (n < 0){
            throw new IllegalArgumentException("error");
        }

        if (n == 1 || n == 0){
            return 1;
        }

        else{

            return n * factorial(n - 1);
        }

    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {

        if (arr == null){
            throw new IllegalArgumentException("error");
        }

        int n = arr.length;
        int counter = n / 2;

        int copy;

        for (int i = 0; i < counter; i++){

            copy = arr[i];

            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = copy;
        }

        return arr;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        
        if (matrix == null){
            throw new IllegalArgumentException("error");
        }

        int sum = 0;

        int i = 0, n, n1;
        n = matrix.length;

        while (i < n){
            n1 = matrix[i].length;

            for (int j = 0; j < n1; j++){
                sum += matrix[i][j];
            }

            i++;
        }
        
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        
        if (s == null){
            throw new IllegalArgumentException("error");
        }

        int n = s.length();
        int counter = n / 2;
        char[] arr;

        arr = s.toCharArray();

        for (int i = 0; i < counter; i++){

            if (arr[i] == arr[n - 1 - i]){
                continue;
            }

            else{
                return false;
            }
            
        }

        return true;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("error");
        }
        
        int max = arr[0];
        int min = arr[0];
        int n = arr.length;
        int[] result = new int[2];

        for (int i = 1; i < n; i++){
            if (arr[i] > max){

                max = arr[i];
            }

            else if (arr[i] < min){
                min = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("error");
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        return matrix;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        
        int n1 = n / 2;

        int[] arr = new int[n1];

        int j = 0;
        for (int i = 2; i <= n; i+=2){
            arr[j] = i;
            j++;
        }
        return arr;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        

        for (int i = 2; i <= Math.sqrt(n); i++){

            if (n % i == 0){

                return false;
            }
        }

        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        
        s = s.toLowerCase();
        char[] array = s.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int n_array = array.length, n_vowels = 5;
        int count = 0;

        for (int i = 0; i < n_array; i++){

            for (int j = 0; j < n_vowels; j++){

                if (array[i] == vowels[j]){

                    count++;
                }
            }
        }

        return count;

    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        
        if (n <= 0){

            throw new IllegalArgumentException("error");
        }

        int prev = 0, present = 1, next;
        int[] res = new int [n];
        res[0] = 0;
        res[1] = 1;

        for( int i = 2; i < n; i++){

            next = prev + present;
            res[i] = next;

            prev = present;
            present = next;
        }

        return res;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        int n1 = matrix.length;
        int n2 = matrix[0].length;

        int[][] result = new int [n2][n1];

        

        for (int i = 0; i < n1; i++){

            for (int j = 0; j < n2; j++){

                result[j][i] = matrix[i][j];
            }
        }

        int i = 5;

        if (i == 5){
            i = 4;
        }

        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        
        int n = arr.length;
        int temp;
        int[] new_array = arr.clone();
        for(int i = 0; i < n; i++){

                                for(int j = 1; j < n - i; j++){

                                                            if ( new_array[j-1] > new_array[j] ){
                                                                                        temp = new_array[j];
                                                                                        new_array[j] = new_array[j-1];
                                                                                        new_array[j-1] = temp;
                                                            }
                                
                                }
        }

        return new_array;
    }

}
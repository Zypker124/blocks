
/*
ID: angusjy1
LANG: JAVA
TASK: blocks
*/
import java.io.*;
import java.util.*;

class blocks {
	
	
	//For comparing doubles (floating point error)
	public double marginOfError = 0.0001;
	
	/*
	 st = new StringTokenizer(reader.readLine());
	 Integer.parseInt(st.nextToken());
	 Double.parseDouble(st.nextToken());
	 ArrayList<String> name = new ArrayList<String>();
	 ArrayList<Double> name = new ArrayList<Double>();
	 ArrayList<Integer> name = new ArrayList<Integer>();
	 System.out.println();
	 * */
	
  public static void main (String [] args) throws IOException {
	  blocks obj = new blocks();
	  obj.run();
  }
  
  public void run() throws IOException {
	//Use BufferedReader rather than RandomAccessFile; it's much faster
	    BufferedReader reader = new BufferedReader(new FileReader("blocks.in"));
	                                                  // input file name goes above
	  PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
	    StringTokenizer st = new StringTokenizer(reader.readLine());
	    
	    int[] finalLetters = new int[26];
	    
	    int N = Integer.parseInt(st.nextToken());
	    String[] face1 = new String[N];
	    String[] face2 = new String[N];
	    for(int line = 0; line < N; line++){
	    	st = new StringTokenizer(reader.readLine());
	    	face1[line] = st.nextToken();
	    	face2[line] = st.nextToken();
	    }
	    
	    for(int set = 0; set < N; set++){
	    	int[] letters1 = new int[26];
		    int[] letters2 = new int[26];
	    	String word1 = face1[set];
	    	for(int let = 0; let < word1.length(); let++){
	    		char letter = word1.charAt(let);
	    		letters1[letter-'a']++;
	    	}
	    	String word2 = face2[set];
	    	for(int let = 0; let < word2.length(); let++){
	    		char letter = word2.charAt(let);
	    		letters2[letter-'a']++;
	    	}
	    	
	    	for(int i = 0; i < finalLetters.length; i++){
	    		if(letters1[i]>=letters2[i]){
	    			finalLetters[i]+=letters1[i];
	    		}else{
	    			finalLetters[i]+=letters2[i];
	    		}
	    	}
	    }
	    
	    for(int i = 0; i < finalLetters.length; i++){
	    	writer.println(finalLetters[i]);
	    }
	    writer.close();
  }
  
  
  //Prime and Composite (With help from BeginnersBook.com)
  
  public boolean isPrime(int n) {
	  if(n < 2)
		  return false;
	    if(n > 2 && (n % 2) == 0)
	       return false;
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
	    return true;
  }
  
  public boolean isComposite(int n) {
	  if(n > 2 && isPrime(n)==false)
		  return true;
	  return false;
  }
  
  
  //Printing 1-D Arrays
  
  public void printIA(int[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(i+": "+arr[i]);
	  }
  }
  
  public void printBA(boolean[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(i+": "+arr[i]);
	  }
  }
  
  public void printDA(double[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(i+": "+arr[i]);
	  }
  }
  
  public void printCA(char[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(i+": "+arr[i]);
	  }
  }
  
  public void printSA(String[] arr){
	  for(int i = 0; i < arr.length; i++){
		  System.out.println(i+": "+arr[i]);
	  }
  }

  
  //Printing 2-D Arrays
  
  public void printIA2(int[][] arr){
	  for(int r = 0; r < arr.length; r++){
		  System.out.print(r+": ");
		  for(int c = 0; c < arr[0].length; c++){
			  System.out.print(arr[r][c]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printBA2(boolean[][] arr){
	  for(int r = 0; r < arr.length; r++){
		  System.out.print(r+": ");
		  for(int c = 0; c < arr[0].length; c++){
			  System.out.print(arr[r][c]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printDA2(double[][] arr){
	  for(int r = 0; r < arr.length; r++){
		  System.out.print(r+": ");
		  for(int c = 0; c < arr[0].length; c++){
			  System.out.print(arr[r][c]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printCA2(char[][] arr){
	  for(int r = 0; r < arr.length; r++){
		  System.out.print(r+": ");
		  for(int c = 0; c < arr[0].length; c++){
			  System.out.print(arr[r][c]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printSA2(String[][] arr){
	  for(int r = 0; r < arr.length; r++){
		  System.out.print(r+": ");
		  for(int c = 0; c < arr[0].length; c++){
			  System.out.print(arr[r][c]+" ");
		  }
		  System.out.println();
	  }
  }
  
  
  //Printing 1-D Lists
  
  public void printIL(ArrayList<Integer> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(i+": "+arr.get(i));
	  }
  }
  
  public void printDL(ArrayList<Double> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(i+": "+arr.get(i));
	  }
  }
  
  public void printSL(ArrayList<String> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.println(i+": "+arr.get(i));
	  }
  }
  
  
  //Printing 2-D Lists
  
  public void printIL2(ArrayList<int[]> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.print(i+": ");
		  int[] arr2 = arr.get(i);
		  for(int j = 0; j < arr2.length; j++){
			  System.out.print(arr2[j]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printDL2(ArrayList<double[]> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.print(i+": ");
		  double[] arr2 = arr.get(i);
		  for(int j = 0; j < arr2.length; j++){
			  System.out.print(arr2[j]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printBL2(ArrayList<boolean[]> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.print(i+": ");
		  boolean[] arr2 = arr.get(i);
		  for(int j = 0; j < arr2.length; j++){
			  System.out.print(arr2[j]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printSL2(ArrayList<String[]> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.print(i+": ");
		  String[] arr2 = arr.get(i);
		  for(int j = 0; j < arr2.length; j++){
			  System.out.print(arr2[j]+" ");
		  }
		  System.out.println();
	  }
  }
  
  public void printCL2(ArrayList<char[]> arr){
	  for(int i = 0; i < arr.size(); i++){
		  System.out.print(i+": ");
		  char[] arr2 = arr.get(i);
		  for(int j = 0; j < arr2.length; j++){
			  System.out.print(arr2[j]+" ");
		  }
		  System.out.println();
	  }
  }
  
  
  //Binary Search - 1-D Arrays
  
  public int binarySearchIA(int arr[], int lowerIndex, int higherIndex, int find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (arr[mid] == find)
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (arr[mid] > find)
             return binarySearchIA(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchIA(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchDA(double arr[], int lowerIndex, int higherIndex, double find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself arr[mid] == find
          if((Math.abs(arr[mid]-find))<=marginOfError)
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (arr[mid] > find)
             return binarySearchDA(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchDA(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchCA(char arr[], int lowerIndex, int higherIndex, char find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (arr[mid] == find)
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (arr[mid] > find)
             return binarySearchCA(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchCA(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchSA(String arr[], int lowerIndex, int higherIndex, String find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (arr[mid].equals(find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (arr[mid].compareTo(find)>0)
             return binarySearchSA(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchSA(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  
  //Binary Search - 1-D Lists
  
  public int binarySearchIL(ArrayList<Integer> arr, int lowerIndex, int higherIndex, int find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (arr.get(mid) == find)
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (arr.get(mid) > find)
             return binarySearchIL(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchIL(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchDL(ArrayList<Double> arr, int lowerIndex, int higherIndex, double find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself arr[mid] == find
          if((Math.abs(arr.get(mid)-find))<=marginOfError)
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (arr.get(mid) > find)
             return binarySearchDL(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchDL(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchSL(ArrayList<String> arr, int lowerIndex, int higherIndex, String find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (arr.get(mid).equals(find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (arr.get(mid).compareTo(find)>0)
             return binarySearchSL(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchSL(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  
  //Binary Search - 2-D Arrays
  
  public int binarySearchIA2(int arr[][], int lowerIndex, int higherIndex, int[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanIA(arr[mid], find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (greaterThanIA(arr[mid], find))
             return binarySearchIA2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchIA2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchDA2(double arr[][], int lowerIndex, int higherIndex, double[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself arr[mid] == find
          if(equalsThanDA(arr[mid], find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (greaterThanDA(arr[mid], find))
             return binarySearchDA2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchDA2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchCA2(char arr[][], int lowerIndex, int higherIndex, char[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanCA(arr[mid], find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (greaterThanCA(arr[mid], find))
             return binarySearchCA2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchCA2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchSA2(String arr[][], int lowerIndex, int higherIndex, String[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanSA(arr[mid], find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (greaterThanSA(arr[mid], find))
             return binarySearchSA2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchSA2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  
  //Binary Search - 2-D Lists
  
  public int binarySearchIL2(ArrayList<int[]> arr, int lowerIndex, int higherIndex, int[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanIA(arr.get(mid), find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (greaterThanIA(arr.get(mid), find))
             return binarySearchIL2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchIL2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchDL2(ArrayList<double[]> arr, int lowerIndex, int higherIndex, double[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself arr[mid] == find
          if(equalsThanDA(arr.get(mid), find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (greaterThanDA(arr.get(mid), find))
             return binarySearchDL2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchDL2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchCL2(ArrayList<char[]> arr, int lowerIndex, int higherIndex, char[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanCA(arr.get(mid), find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray
          if (greaterThanCA(arr.get(mid), find))
             return binarySearchCL2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchCL2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  public int binarySearchSL2(ArrayList<String[]> arr, int lowerIndex, int higherIndex, String[] find)
  {
      if (higherIndex>=lowerIndex)
      {
          int mid = lowerIndex + (higherIndex - lowerIndex)/2;

          // If the element is present at the middle itself
          if (equalsThanSA(arr.get(mid), find))
             return mid;

          // If element is smaller than mid, then it can only
          // be present in left subarray arr[mid] > find
          if (greaterThanSA(arr.get(mid), find))
             return binarySearchSL2(arr, lowerIndex, mid-1, find);

          // Else the element can only be present in right
          // subarray
          return binarySearchSL2(arr, mid+1, higherIndex, find);
      }

      // We reach here when element is not present in array
      return -1;
  }
  
  
  //QuickSort - 1-D Arrays (With help from Geeksforgeeks.org)
  
  public int[] sortIA(int[] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortIA(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortIA(int lowerIndex, int higherIndex, int[] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      int pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (inputArr[i] < pivot) {
              i++;
          }
          while (inputArr[j] > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersIA(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortIA(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortIA(i, higherIndex, inputArr);
  }

  public void exchangeNumbersIA(int i, int j, int[] inputArr) {
      int temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public String[] sortSA(String[] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortSA(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortSA(int lowerIndex, int higherIndex, String[] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      String pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (inputArr[i].compareTo(pivot) < 0) {
              i++;
          }
          while (inputArr[j].compareTo(pivot) > 0) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersSA(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortSA(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortSA(i, higherIndex, inputArr);
  }

  public void exchangeNumbersSA(int i, int j, String[] inputArr) {
      String temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public double[] sortDA(double[] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortDA(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortDA(int lowerIndex, int higherIndex, double[] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      double pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (inputArr[i] < pivot) {
              i++;
          }
          while (inputArr[j] > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersDA(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortDA(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortDA(i, higherIndex, inputArr);
  }

  public void exchangeNumbersDA(int i, int j, double[] inputArr) {
	  double temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public char[] sortCA(char[] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortCA(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortCA(int lowerIndex, int higherIndex, char[] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      char pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (inputArr[i] < pivot) {
              i++;
          }
          while (inputArr[j] > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersCA(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortCA(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortCA(i, higherIndex, inputArr);
  }

  public void exchangeNumbersCA(int i, int j, char[] inputArr) {
	  char temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  
  //QuickSort - 1-D Lists
  
  public ArrayList<Integer> sortIL(ArrayList<Integer> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortIL(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortIL(int lowerIndex, int higherIndex, ArrayList<Integer> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      int pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (inputArr.get(i) < pivot) {
              i++;
          }
          while (inputArr.get(j) > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersIL(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortIL(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortIL(i, higherIndex, inputArr);
  }

  public void exchangeNumbersIL(int i, int j, ArrayList<Integer> inputArr) {
      int temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  public ArrayList<Double> sortDL(ArrayList<Double> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortDL(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortDL(int lowerIndex, int higherIndex, ArrayList<Double> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      double pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
          while (inputArr.get(i) < pivot) {
              i++;
          }
          while (inputArr.get(j) > pivot) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersDL(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortDL(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortDL(i, higherIndex, inputArr);
  }

  public void exchangeNumbersDL(int i, int j, ArrayList<Double> inputArr) {
	  double temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  public ArrayList<String> sortSL(ArrayList<String> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortSL(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortSL(int lowerIndex, int higherIndex, ArrayList<String> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      String pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (inputArr.get(i).compareTo(pivot) < 0) {
              i++;
          }
          while (inputArr.get(j).compareTo(pivot) > 0) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersSL(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortSL(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortSL(i, higherIndex, inputArr);
  }

  public void exchangeNumbersSL(int i, int j, ArrayList<String> inputArr) {
      String temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
 
  
  //GreaterThan - 1-D Arrays
  
  public boolean greaterThanIA(int[] arr1, int[] arr2){
	  if(arr1.length >= arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	  }else{
		  for(int ind = 0; ind < arr1.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return false;
	  }
  }
  
  public boolean greaterThanDA(double[] arr1, double[] arr2){
	  if(arr1.length >= arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  //arr1[ind]!=arr2[ind]
			  if(Math.abs(arr1[ind]-arr2[ind])>=marginOfError){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	  }else{
		  for(int ind = 0; ind < arr1.length; ind++){
			  if(Math.abs(arr1[ind]-arr2[ind])>=marginOfError){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return false;
	  }
  }
  
  public boolean greaterThanSA(String[] arr1, String[] arr2){
	  if(arr1.length >= arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  //arr1[ind]!=arr2[ind]
			  if(arr1[ind].compareTo(arr2[ind])!=0){
				  if(arr1[ind].compareTo(arr2[ind])>0){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
	  }else{
		  for(int ind = 0; ind < arr1.length; ind++){
			  if(arr1[ind].compareTo(arr2[ind])!=0){
				  if(arr1[ind].compareTo(arr2[ind])>0){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
	  }
	  return false;
  }
  
  public boolean greaterThanCA(char[] arr1, char[] arr2){
	  if(arr1.length >= arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
	  }else{
		  for(int ind = 0; ind < arr1.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  if(arr1[ind]>arr2[ind]){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
	  }
	  return false;
  }
  
  
  //EqualsThan - 1-D Arrays
  
  public boolean equalsThanIA(int[] arr1, int[] arr2){
	  if(arr1.length==arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  public boolean equalsThanDA(double[] arr1, double[] arr2){
	  if(arr1.length==arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(Math.abs(arr1[ind]-arr2[ind])>=marginOfError){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  public boolean equalsThanSA(String[] arr1, String[] arr2){
	  if(arr1.length==arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(!arr1[ind].equals(arr2[ind])){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }

  public boolean equalsThanCA(char[] arr1, char[] arr2){
	  if(arr1.length==arr2.length){
		  for(int ind = 0; ind < arr2.length; ind++){
			  if(arr1[ind]!=arr2[ind]){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  
  //LessThan - 1-D Arrays
  
  public boolean lessThanIA(int[] arr1, int[] arr2){
	 if(!greaterThanIA(arr1, arr2) && !equalsThanIA(arr1, arr2)){
		 return true;
	 }
	 return false;
  }
  
  public boolean lessThanDA(double[] arr1, double[] arr2){
		 if(!greaterThanDA(arr1, arr2) && !equalsThanDA(arr1, arr2)){
			 return true;
		 }
		 return false;
  }
  
  public boolean lessThanSA(String[] arr1, String[] arr2){
		 if(!greaterThanSA(arr1, arr2) && !equalsThanSA(arr1, arr2)){
			 return true;
		 }
		 return false;
  }
  
  public boolean lessThanCA(char[] arr1, char[] arr2){
		 if(!greaterThanCA(arr1, arr2) && !equalsThanCA(arr1, arr2)){
			 return true;
		 }
		 return false;
}
  
  
  //GreaterThan - 1-D Lists
  
  public boolean greaterThanIL(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
	  if(arr1.size() >= arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(arr1.get(ind)!=arr2.get(ind)){
				  if(arr1.get(ind)>arr2.get(ind)){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	  }else{
		  for(int ind = 0; ind < arr1.size(); ind++){
			  if(arr1.get(ind)!=arr2.get(ind)){
				  if(arr1.get(ind)>arr2.get(ind)){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return false;
	  }
  }
  
  public boolean greaterThanDL(ArrayList<Double> arr1, ArrayList<Double> arr2){
	  if(arr1.size() >= arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(Math.abs(arr1.get(ind)-arr2.get(ind))>=marginOfError){
				  if(arr1.get(ind)>arr2.get(ind)){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	  }else{
		  for(int ind = 0; ind < arr1.size(); ind++){
			  if(Math.abs(arr1.get(ind)-arr2.get(ind))>=marginOfError){
				  if(arr1.get(ind)>arr2.get(ind)){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return false;
	  }
  }
  
  public boolean greaterThanSL(ArrayList<String> arr1, ArrayList<String> arr2){
	  if(arr1.size() >= arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(!arr1.get(ind).equals(arr2.get(ind))){
				  if(arr1.get(ind).compareTo(arr2.get(ind))>0){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return true;
	  }else{
		  for(int ind = 0; ind < arr1.size(); ind++){
			  if(!arr1.get(ind).equals(arr2.get(ind))){
				  if(arr1.get(ind).compareTo(arr2.get(ind))>0){
					  return true;
				  }else{
					  return false;
				  }
			  }
		  }
		  return false;
	  }
  }

  
  //EqualThan - 1-D Lists
  
  public boolean equalsThanIL(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
	  if(arr1.size()==arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(arr1.get(ind)!=arr2.get(ind)){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  public boolean equalsThanDL(ArrayList<Double> arr1, ArrayList<Double> arr2){
	  if(arr1.size()==arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(Math.abs(arr1.get(ind)-arr2.get(ind))>=marginOfError){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }
  
  public boolean equalsThanSL(ArrayList<String> arr1, ArrayList<String> arr2){
	  if(arr1.size()==arr2.size()){
		  for(int ind = 0; ind < arr2.size(); ind++){
			  if(!arr1.get(ind).equals(arr2.get(ind))){
				  return false;
			  }
		  }
		  return true;
	  }
	  return false;
  }


  //LessThan - 1-D Lists
  
  public boolean lessThanIL(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		 if(!greaterThanIL(arr1, arr2) && !equalsThanIL(arr1, arr2)){
			 return true;
		 }
		 return false;
  }
	  
  public boolean lessThanDL(ArrayList<Double> arr1, ArrayList<Double> arr2){
	if(!greaterThanDL(arr1, arr2) && !equalsThanDL(arr1, arr2)){
		return true;
	}
	return false;
  }
	  
  public boolean lessThanSL(ArrayList<String> arr1, ArrayList<String> arr2){
	  if(!greaterThanSL(arr1, arr2) && !equalsThanSL(arr1, arr2)){
		  return true;
	  }
	return false;
  }
  
  
  //QuickSort - 2-D Arrays
  
  public int[][] sortIA2(int[][] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortIA2(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortIA2(int lowerIndex, int higherIndex, int[][] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      int[] pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanIA(inputArr[i], pivot)) {
              i++;
          }
          while (greaterThanIA(inputArr[i], pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersIA2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortIA2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortIA2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersIA2(int i, int j, int[][] inputArr) {
      int[] temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public double[][] sortDA2(double[][] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortDA2(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortDA2(int lowerIndex, int higherIndex, double[][] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      double[] pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanDA(inputArr[i], pivot)) {
              i++;
          }
          while (greaterThanDA(inputArr[i], pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersDA2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortDA2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortDA2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersDA2(int i, int j, double[][] inputArr) {
	  double[] temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public String[][] sortSA2(String[][] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortSA2(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortSA2(int lowerIndex, int higherIndex, String[][] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      String[] pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanSA(inputArr[i], pivot)) {
              i++;
          }
          while (greaterThanSA(inputArr[i], pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersSA2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortSA2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortSA2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersSA2(int i, int j, String[][] inputArr) {
	  String[] temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  public String[][] sortCA2(String[][] inputArr) { 
      if (inputArr == null || inputArr.length == 0) {
          return null;
      }
      quickSortSA2(0, inputArr.length - 1, inputArr);
      return inputArr;
  }

  public void quickSortCA2(int lowerIndex, int higherIndex, char[][] inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      char[] pivot = inputArr[lowerIndex+(higherIndex-lowerIndex)/2];
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanCA(inputArr[i], pivot)) {
              i++;
          }
          while (greaterThanCA(inputArr[i], pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersCA2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortCA2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortCA2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersCA2(int i, int j, char[][] inputArr) {
	  char[] temp = inputArr[i];
      inputArr[i] = inputArr[j];
      inputArr[j] = temp;
  }
  
  
  //QuickSort - 2-D Lists
  
  public ArrayList<int[]> sortIL2(ArrayList<int[]> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortIL2(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortIL2(int lowerIndex, int higherIndex, ArrayList<int[]> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      int[] pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanIA(inputArr.get(i), pivot)) {
              i++;
          }
          while (greaterThanIA(inputArr.get(i), pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersIL2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortIL2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortIL2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersIL2(int i, int j, ArrayList<int[]> inputArr) {
      int[] temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  public ArrayList<double[]> sortDL2(ArrayList<double[]> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortDL2(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortDL2(int lowerIndex, int higherIndex, ArrayList<double[]> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      double[] pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanDA(inputArr.get(i), pivot)) {
              i++;
          }
          while (greaterThanDA(inputArr.get(i), pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersDL2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortDL2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortDL2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersDL2(int i, int j, ArrayList<double[]> inputArr) {
	  double[] temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  public ArrayList<String[]> sortSL2(ArrayList<String[]> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortSL2(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortSL2(int lowerIndex, int higherIndex, ArrayList<String[]> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      String[] pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanSA(inputArr.get(i), pivot)) {
              i++;
          }
          while (greaterThanSA(inputArr.get(i), pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersSL2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortSL2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortSL2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersSL2(int i, int j, ArrayList<String[]> inputArr) {
      String[] temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  public ArrayList<char[]> sortCL2(ArrayList<char[]> inputArr) { 
      if (inputArr == null || inputArr.size() == 0) {
          return null;
      }
      quickSortCL2(0, inputArr.size() - 1, inputArr);
      return inputArr;
  }

  public void quickSortCL2(int lowerIndex, int higherIndex, ArrayList<char[]> inputArr) {
       
      int i = lowerIndex;
      int j = higherIndex;
      // calculate pivot number, I am taking pivot as middle index number
      char[] pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
      // Divide into two arrays
      while (i <= j) {
          /**
           * In each iteration, we will identify a number from left side which 
           * is greater then the pivot value, and also we will identify a number 
           * from right side which is less then the pivot value. Once the search 
           * is done, then we exchange both numbers.
           */
    	  //inputArr[i] < pivot
          while (lessThanCA(inputArr.get(i), pivot)) {
              i++;
          }
          while (greaterThanCA(inputArr.get(i), pivot)) {
              j--;
          }
          if (i <= j) {
              exchangeNumbersCL2(i, j, inputArr);
              //move index to next position on both sides
              i++;
              j--;
          }
      }
      // call quickSort() method recursively
      if (lowerIndex < j)
          quickSortCL2(lowerIndex, j, inputArr);
      if (i < higherIndex)
          quickSortCL2(i, higherIndex, inputArr);
  }

  public void exchangeNumbersCL2(int i, int j, ArrayList<char[]> inputArr) {
	  char[] temp = inputArr.get(i);
      inputArr.set(i, inputArr.get(j));
      inputArr.set(j, temp);
  }
  
  
  
}
<Challenging>
@ remove ele (X alter size, after removal last ele exist twice)
for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }

@ Insert ele (specific position)
for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;

@ Find duplicate
for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j)) //(my_array[i].equals(my_array[j])) for string
                { //print my_array[j]

@ Remove duplicate
int no_unique_elements = my_array.length;                           //assume all ele unique
 for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
              if(my_array[i] == my_array[j])                        //2 eles found equal
                {
                    my_array[j] = my_array[no_unique_elements-1];   //replace duplicate ele with last unique
                    no_unique_elements--; 
                    j--; }}}
int[] array1 = Arrays.copyOf(my_array, no_unique_elements);  //Copying only unique elements to newArr

@ Find common (int)
for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                { //print array1[i]

@ Find common (str)
HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]); }}} //print (set)

@ Find all pairs of eles sum = specified num
for (int i =  0; i < inputArray.length; i++)
  {
  for (int j  = i+1; j < inputArray.length; j++)
  {
  if(inputArray[i]+inputArray[j] == inputNumber)
  { //then print arr[i], arr[j]

@ find missing num in arr (using smallest & largest)
int expected_num_sum = total_num * ((total_num + 1) / 2);       //total num is num of ele
int num_sum = 0;
   for (int i: numbers) {
    num_sum += i;
   }
       System.out.print( expected_num_sum - num_sum);

@ move all zero to right
        for(int j = 0, l = array_nums.length; j < l;) {
            if(array_nums[j] == 0)                      //if is 0, continue increase index
                j++;
            else {
                int temp = array_nums[i];               //if not 0, swap the value with front is 0
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i ++;
                j ++;
            }
        }

@ check contains 2 specified num
public static boolean result(int[] array_nums, int num1, int num2) {
    for (int number : array_nums) {
      boolean r = number != num1 && number != num2;                     //#
      if (r) {                                                          //#
        return false;
        }
     }
        return true;
   }

@ remove duplicate ele & return new length
public static int array_sort(int[] nums) {
         int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1])               //# only if not same with b4 we add, index-1 can be used if arr sorted
                nums[index++] = nums[i];                
        }
	  return index;                                 //count til unique ele
    }

@ print all leaders ( An element is leader if it is greater than all the elements to its right side.)
 for(int i = 0; i < arr.length; i++){
            boolean big = true;
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] <= arr[j]){
                    big = false;
                }
            }
            if(big) {System.out.println(arr[i]);}
        }
OR
int size = arr.length;
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }

@ find smallest & 2nd smallest
first_element = second_element = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* Update both first and second if current element is smaller than first. */
            if (arr[i] < first_element)
            {
                second_element = first_element;
                first_element = arr[i];
            }
 
            /* Update second if arr[i] is between first and second
               elements.*/
            else if (arr[i] < second_element && arr[i] != first_element)
                second_element = arr[i];
        }

@ to segregate all 0s on left side & all 1s on right side
int i,  nums_size = nums.length;
int left = 0, right = nums_size - 1;
while (left < right) 
        {
            /* While  0 at left increment left index  */
            while (nums[left] == 0 && left < right)
               left++;
 
            /* While we see 1 at right decrement right index*/
            while (nums[right] == 1 && left < right)
                right--;
 
           
            if (left < right) 
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }


<Random>
@ Sort
Arrays.sort(arrName)

@ sum
for (int i : my_array)
    sum += i;
@ average = sum/numbers.length;

@ contains value
for (int n : arr) {
         if (item == n) {
            return true;
         }
      }

@ find index of ele
int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }

@ copy by iterating
for(int i=0; i < my_array.length; i++) {
    new_array[i] = my_array[i];
}

@ reverse
for(int i = 0; i < my_array1.length / 2; i++)
  {
    int temp = my_array1[i];
    my_array1[i] = my_array1[my_array1.length - i - 1];   //#
    my_array1[my_array1.length - i - 1] = temp;
  }

@ max min
int len = my_array.length;
        if (len < 1) {
            max = -1;
            min = -1;
        }
        if (len >= 1) {
            max = my_array[0];
            min = my_array[0];
            for (int i = 1; i < len; i++) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
        }

@ find 2nd largest ele
Arrays.sort(arr)
//print (arr[arr.length - 1 -1]);

@ find 2nd smallest ele
Arrays.sort(arr)
// print (arr[1]);

@ add 2 matrices of same size
for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 

@ find sum of 2 elements equal to given int
for(int i = 0; i<arr.length; i++){
             for(int j = 0; j<arr.length; j++){
                 if(arr[i] + arr[j] == target){}}}

@ to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero. 
     //size<2 : invalid input
      int size = arr.length;
      min_l_num = 0;
      min_r_num = 1;
      min_sum = arr[0] + arr[1];
      
      for(l = 0; l < size - 1; l++)
      {
        for(r = l+1; r < size; r++)
        {
          sum = arr[l] + arr[r];
          if(Math.abs(min_sum) > Math.abs(sum))
          {
            min_sum = sum;
            min_l_num = l;
            min_r_num = r;
          }
        }
      }

@ To find all combination of 4 elements whose sum equal given value
// Find other three elements after fixing first element
        for (int i = 0; i < n - 3; i++) 
        {
          // Find other two elements after fixing second element
            for (int j = i + 1; j < n - 2; j++) 
            {
           // Find the fourth element after fixing third element    
              for (int k = j + 1; k < n - 1; k++) 
                {
            // find the fourth
                    for (int l = k + 1; l < n; l++) 
                    {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == s) {} }}}}

@ Cyclically rotate a given array clockwise by one
 static void rotate_array()
    {
       int a = arra[arra.length-1], i;
       for (i = arra.length-1; i > 0; i--)
          arra[i] = arra[i-1];
       arra[0] = a;
    }

@ -ve int b4 +ve int
[?QTA A 48] https://www.w3resource.com/java-exercises/array/java-array-exercise-48.php
public static void sort_nums(int[] nums) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }

@ +ve int b4 -ve int

		
<QTA>
[44] https://www.w3resource.com/java-exercises/array/java-array-exercise-44.php
@ to count the number of possible triangles from a given unsorted array of positive integers.
Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.

import java.util.*;
import java.lang.*;
public class Main
{
   public static void main (String[] args) 
    {  
        int nums[] = {6, 7, 9, 16, 25, 12, 30, 40};
        int n = nums.length;
        System.out.println("Original Array : "+Arrays.toString(nums));  

        // Sort the array elements in non-decreasing order
        Arrays.sort(nums);
        
        // Initialize count of triangles
        int ctr = 0;
 
        for (int i = 0; i < n-2; ++i)
        {
          int x = i + 2;
 
          for (int j = i+1; j < n; ++j)
            {
               while (x < n && nums[i] + nums[j] > nums[x])
               ++x;
                 ctr += x - j - 1;
            }
        }
    System.out.println("Total number of triangles:  " +ctr);
    }
}

[47] https://www.w3resource.com/java-exercises/array/java-array-exercise-47.php
@ to find the rotation count in a given rotated sorted array of integers
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
  static int count_rotations(int arr_int[], int n)
    {
       int min_val = arr_int[0], min_index = -1;
        for (int i = 0; i < n; i++)
        {
            if (min_val > arr_int[i])
            {
                min_val = arr_int[i];
                min_index = i;
            }
        } 
        return min_index;
    }
    public static void main (String[] args) 
    {
          int arr_int[] = {35, 32, 30, 14, 18, 21, 27};
      // int arr_int[] = {35, 32, 14, 18, 21, 27};
      // int arr_int[] = {35, 14, 18, 21, 27};
           int n = arr_int.length;
            System.out.println(count_rotations(arr_int, n));
    }
}




<OutTopic>

@ Convert to ArrayList
 ArrayList<String>  list = new ArrayList<String>(Arrays.asList(oriArrName));

@ Convert from ArrayList
String[]  my_array = new String[list.size()];
  list.toArray(my_array);

@ test equality
boolean  equalOrNot = true;
  
  if(my_array1.length == my_array2.length)
  {
  for (int i  = 0; i < my_array1.length; i++)
  {
  if(my_array1[i] != my_array2[i])
  {
  equalOrNot = false;

@ compute avg value except largest & smallest
float x = ((sum-max-min) / (array_nums.length - 2));

@ check without 0 & -1
for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }

@ check if sum of all search_num's in arr is exactly fixed_num
public static boolean result(int[] numbers, int search_num, int fixed_sum) {
   int temp_sum = 0;
   for (int number : numbers) {
      if (number == search_num) {
        temp_sum += search_num;
      }

      if (temp_sum > fixed_sum) {
        break;
      }
    }
    return temp_sum == fixed_sum;
  }  
}

@ Find length of longest consecutive elements sequence
Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i< arr.length-1; i++){
            if (arr[i] == arr[i+1]-1){
                count ++;
            }
        }


<Exception>
if (arr == null) return -1;

<SHAPE>
@
- - - -
- - - -
- - - -
- - - -
int [][]a = new int[4][4];    
 for(int i = 0; i < 4; i++)
   {
      for(int j = 0; j < 4; j++)
      {
         System.out.printf("%2d ", a[i][j]);   //print the char
      }
      System.out.println(); //new line after every 4 column
   }

<ArrayList>
@ Find common elements from 3 sorted (in non-decreasing order) arrays
ArrayList<Integer> common = new ArrayList<Integer>();
while (x < array1.length && y < array2.length && z < array3.length){
            if (array1[x] == array2[y] && array2[y] == array3[z]){
                common.add(array1[x]);
                x++;
                y++;
                z++;
            }
            //to still increase the index (while if cond not meet) to avoid infinity loop
            else if (array1[x] < array2[y])
                x++;
            else if (array2[y] < array3[z])
                y++;
            else
                z++;
        }

<HashSet>
@ Find length of longest consecutive elements sequence from a given unsorted array of int
 public static int longest_sequence(int[] nums) {
      final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);

        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
    
<HashMap>
@to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6.

import java.util.*;
public class Exercise35
{
        public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
        
        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(my_map.containsKey(a.get(i))){
                int index = my_map.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(b - a.get(i), i);
            }
        }
        
        return result;
    }
  
    public static void main(String[] args){
        ArrayList<Integer> my_array = new ArrayList<Integer>();
        my_array.add(1);
        my_array.add(2);
        my_array.add(4);
        my_array.add(5);
		my_array.add(6);
		int target = 6;
        ArrayList<Integer> result = two_sum_array_target(my_array, target);
        for(int i : result)
            System.out.print("Index: "+i + " ");
    }
}

@ to get the majority element from a given array of integers containing duplicates.
Majority element: A majority element is an element that appears more than n/2 times where n is the size of the array.
https://www.w3resource.com/java-exercises/array/java-array-exercise-38.php

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays; 

public class Main
{
  	public static void main (String[] args)
	{
		// Array - test majority element
		int nums[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
                                 System.out.println("Original Array : "+Arrays.toString(nums));  
		int result = MajorityElement(nums);
		if (result != -1)
			System.out.println("Majority element is " + result);
		else
			System.out.println("Majority element does not exist");
	}
  
  
	public static int MajorityElement(int arra1[])
	{
		int n = arra1.length;

		// Hash Map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
		// Element's frequency in a map
		for (int i = 0; i < n; i++)
		{
			if (map.get(arra1[i]) == null)
				map.put(arra1[i], 0);
			
			map.put(arra1[i], map.get(arra1[i]) + 1);
		}

		// Return the element if its count is more than n/2
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry pair = (Map.Entry)it.next();
			if ((int)pair.getValue() > n/2)
				return (int)pair.getKey();

			it.remove(); 
		}

		// no majority element
		return -1;
	}
}


<List>
?@ to find all the unique triplets such that sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2.
https://www.w3resource.com/java-exercises/array/java-array-exercise-37.php

import java.util.ArrayList;
import java.util.List;
public class Exercise36 {
    public static void main(String[] args) {
        int[] input = {1, -2, 0, 5, -1, -4};
		int target = 2;
		Exercise36 r = new Exercise36();
        System.out.println(r.threeSum(input,target));       
    }
    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length ;j++){
                for(int k = j; k<nums.length;k++){
                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)){
                        List<Integer> inner_List = new ArrayList<Integer>(3);
                        inner_List.add(nums[i]);
                        inner_List.add(nums[j]);
                        inner_List.add(nums[k]);
                        my_List.add(inner_List);
                    }
                }
            }
        }
       return my_List;
    }
  }








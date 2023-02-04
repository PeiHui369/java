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

@ return missing letter
public static String test (String[] str_arra){
	int c = str_arra[0].charAt(0)+1;
	for (int i = 1; i<str_arra.length; i++, c++_
	     if(str_arra[i].charAt(0) != c)
	     	return String.valueOf((char)c);
	 return "";
}

@ all triplets equal to given sum
//main: Arrays.sort(arr);
	public static void find_and_print_all_Triplets(int[] nums, int sum, int alen)
		{
		System.out.println("\nTriplets of sum "+sum);
		for (int i = 0; i <= alen - 3; i++)
			{
				int k = sum - nums[i];
				int l_index = i + 1, h_index = nums.length - 1;
	
				while (l_index < h_index)
				{
					if (nums[l_index] + nums[h_index] < k) {
						l_index++;
					}
	
				else if (nums[l_index] + nums[h_index] > k) {
						h_index--;
					}
	
					else {
						System.out.println("(" + nums[i] + " " + nums[l_index] + " " + nums[h_index] + ")");
						l_index++;
						h_index--;
					}
				}
			}
		}

	     //--> find end if smaller than alr     <-- find start if bigger than alr
@ find and print one continuous subarray (from a given array of integers) that if you only sort the said subarray in ascending order then the entire array will be sorted in ascending order.
public static int[] findUnsortedSubarray(int[] nums) {
			int[] result = new int[3];
            int n = nums.length;
            int start = -1;
            int end = -2;
            int min = nums[n - 1];		//last ele
            int max = nums[0];			//first ele
            for (int i = 1; i < n; i++) {
                max = Math.max(max, nums[i]);		//compare max ascendingly
                min = Math.min(min, nums[n - 1 - i]);	//compare min descendingly
                if (nums[i] < max) {			//this<max, end at this
                    end = i;
                }
                if (nums[n - 1 - i] > min) {		//
                    start = n - 1 - i;
                }
            }
           		result[0] = start;
		    result[1] = end;

			return result;
        }
//MAIN: 
	for(int i=result2[0]; i<=result2[1]; i++){
        System.out.print(nums2[i] +" ");
        }     
	     
@ Write a Java program to form the largest number from a given list of non negative integers.
private static String largest_Numbers(int[] nums) {
        Arrays.sort(nums);
        int[] reversed = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            reversed[i] = nums[nums.length-1-i];
        }
        String s = "";
        for(int i = 0; i < reversed.length; i++){
            s += Integer.toString(reversed[i]);
        }
        return s;
    }
OR
String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
        return Arrays.stream(array_nums).reduce((a, b) -> a.equals("0") ? b : a + b).get();
    
@
public static int min_SubArray_length(int s, int[] nums) {
    int sum = 0, ctr = 0, min_len = Integer.MAX_VALUE;
    for (int i = 0, j = 0; j < nums.length; ) {
       //if this = sum
      if (nums[j] >= s) {
        return 1;
      } else {
	//cumulative sum from index 0
        sum += nums[j];
	//increase count for length
        ctr++;
	//if sum exceeds
        if (sum >= s) {
	  //remove the num[i] that causes exceed until sum < toFind
          min_len = Math.min(min_len, ctr);
          while (j > i) {
            sum -= nums[i];
            ctr--;
            i++;	//move to next ele when whle loop break
            if (sum < s) break;
            min_len = Math.min(min_len, ctr);
          }
        }
      }
      j++;
    }
    if (min_len == Integer.MAX_VALUE) {
      return 0;
    }
    return min_len;
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

@ test negative dominance
public static boolean test(int[] nums) {
        int countNeg=0, countPo=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0){countNeg++;}
            else if (nums[i] > 0){countPo++;}
        }
        if (countNeg>countPo){return true;}
        return false;
    }
[?QTA A78 Arrays.stream] https://www.w3resource.com/java-exercises/array/java-array-exercise-78.php

@ check alternates between +ve & -ve
	public static boolean test(int[] nums) {
        int i = 0;
        if(nums[0] > 0) {
            for (; i < nums.length; i += 2) {
                if (nums[i] < 0 || nums[i+1]>0) {
                    return false;
                }
            }
        }
        else{
                i = 1;
                for (; i < nums.length; i += 2) {
                    if (nums[i] < 0 || nums[i-1]>0){
                        return false;
                    }
                }
            }
        return true;
    }
OR
public static boolean test(int[] nums) {
    for (int n: nums) {
      if (n == 0)
        return false;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > 0 && nums[i] > 0) {
        return false;
      } else if (nums[i - 1] < 0 && nums[i] < 0) {
        return false;
      }
    }
    return true;
  }

@ Largest gap between sorted ele
public static int test(int[] nums) {
    Arrays.sort(nums);
    int max_val = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      max_val = Math.max(nums[i + 1] - nums[i], max_val);
    }
    return max_val;
  }

@ to find contiguous subarray within a given array of integers which has the largest sum
public static int largest_sum(int[] A)
	{
		int max_ele_val = 0;
		int max_end = 0;
		for (int i: A)
		{
			max_end = max_end + i;
			max_end = Integer.max(max_end, 0);

			max_ele_val = Integer.max(max_ele_val, max_end);
		}
		return max_ele_val;
	}
		
@ to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.
public static int diff_between_two_elemnts(int[] nums)
	{
		int diff_two_elemnts = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				diff_two_elemnts = Integer.max(diff_two_elemnts,nums[j] - nums[i]);
			}
		}

		return diff_two_elemnts;
	}

//print from ori: left min, right max
@ 1st ele : max; 2nd ele: min; 3rd: 2nd max; 4th: 2nd min
     static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
     
        return temp;
    }

//count no. of 0, print front all count index as 0, leftover print 1
@ separate 0s on left & 1s on right
 static int [] separate_0_1(int arr[], int n)
     {
        int count = 0;   
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        for (int i = count; i < n; i++)
            arr[i] = 1;
    
         return arr;
     }       

//while left even & right odd, else swap value with current index values
@ separate odd & even
 static int [] separate_odd_even(int arr[])
    {
        int left_side = 0, right_side = arr.length - 1;
        while (left_side < right_side)
        {
            while (arr[left_side]%2 == 0 && left_side < right_side)
                left_side++;
 
            while (arr[right_side]%2 == 1 && left_side < right_side)
                right_side--;
 
            if (left_side < right_side)
            {
                int temp = arr[left_side];
                arr[left_side] = arr[right_side];
                arr[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        return arr;
    }

@ shuffle
public static void shuffle(int nums[])
	{
		for (int i = nums.length - 1; i >= 1; i--)
		{
			Random rand = new Random();

			int j = rand.nextInt(i + 1);

			swap_elements(nums, i, j);
		}
	}
        private static void swap_elements(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

@ max product
public static void find_max_product(int[] nums)
	{
		int max_pair_product = Integer.MIN_VALUE;
		int max_i = -1, max_j = -1;

		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (max_pair_product < nums[i] * nums[j])
				{
					max_pair_product = nums[i] * nums[j];
					max_i = i;
					max_j = j;
				}
			}
		}

		System.out.print("Pair is (" + nums[max_i] + ", " + nums[max_j] + "), Maximum Product: " + (nums[max_i]*nums[max_j]));
	}

@ A & B of size p & q, merge A & B by maintaining sorted order


<QTA>
[61 https://www.w3resource.com/java-exercises/array/java-array-exercise-61.php]
@ Rearrange unique elements array -> every 2nd ele greater than its left & right
private static void swap_nums(int[] nums, int i, int j) {
		int t_nums = nums[i];
		nums[i] = nums[j];
		nums[j] = t_nums;
	}

	public static void rearrange_Array_nums(int[] nums)
	{
		for (int i = 1; i < nums.length; i += 2)
		{
			if (nums[i - 1] > nums[i]) {
				swap_nums(nums, i - 1, i);
			}

			if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
				swap_nums(nums, i + 1, i);
			}
		}
	}
	
[62  https://www.w3resource.com/java-exercises/array/java-array-exercise-62.php]
@ to find the equilibrium indices from a given array of integers : leftSum == rightSum
public static void equlibrium_indices(int[] nums){
		//find total sum
		int totalSum = 0;
		for (int n : nums) {
			totalSum += n;
		}
		//compare running sum to remaining sum to find equlibrium indices
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (totalSum - runningSum - n == runningSum) {
				System.out.println("Equilibrium indices found at : "+i);
			}
			runningSum += n;
		}
	}
	
[63 https://www.w3resource.com/java-exercises/array/java-array-exercise-63.php]
@  to replace each element of the array with product of every other element in a given array of integers.

[67 https://www.w3resource.com/java-exercises/array/java-array-exercise-67.php]
@ to find subarray which has the largest sum in a given circular array of integers.

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

[68 https://www.w3resource.com/java-exercises/array/java-array-exercise-68.php]  
@ to create all possible permutations of a given array of distinct integers ]
import java.util.*;
import java.util.List;

 public class solution {
 public static void main(String[] args) throws Exception {
    int[] nums1 = {1, 2, 3, 4};
	System.out.println("\nOriginal array: "+Arrays.toString(nums1));
    List<List<Integer>> result1 = new solution().permute(nums1);
	System.out.println("\nPossible permutations of the said array:");
	result1.forEach(System.out::println);
    int[] nums2 = {1, 2, 3};
	System.out.println("\nOriginal array: "+Arrays.toString(nums2));
    List<List<Integer>> result2 = new solution().permute(nums2);
	System.out.println("\nPossible permutations of the said array:");
	result2.forEach(System.out::println);	
	  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Permutation(0, nums, result);
    return result;
  }

  private void Permutation(int i, int[] nums, List<List<Integer>> result) {
    if (i == nums.length - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : nums) list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = nums.length; j < l; j++) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Permutation(i + 1, nums, result);
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }
}

[64 https://www.w3resource.com/java-exercises/array/java-array-exercise-64.php]
@  to find Longest Bitonic Subarray in a given array
 A bitonic subarray is a subarray of a given array where elements are first sorted in increasing order, then in decreasing order. A strictly increasing or strictly decreasing subarray is also accepted as bitonic subarray.

Example:
Input :
nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 }
Output:
The longest bitonic subarray is [3,9]
Elements of the said sub-array: 5 6 10 11 9 6 4
The length of longest bitonic subarray is 7

 import java.util.Arrays;
class solution
{
	public static int find_Bitonic_Subarray(int[] nums)
	{
		int[] incre_array = new int[nums.length];
		incre_array[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			incre_array[i] = 1;
			if (nums[i - 1] < nums[i]) {
				incre_array[i] = incre_array[i - 1] + 1;
			}
		}

		int[] decre_array = new int[nums.length];
		decre_array[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			decre_array[i] = 1;
			if (nums[i] > nums[i + 1]) {
				decre_array[i] = decre_array[i + 1] + 1;
			}
		}

		int lbs_len = 1;
		int start = 0, end = 0;

		for (int i = 0; i < nums.length; i++)
		{
			if (lbs_len < incre_array[i] + decre_array[i] - 1)
			{
				lbs_len = incre_array[i] + decre_array[i] - 1;
				start = i - incre_array[i] + 1;
				end = i + decre_array[i] - 1;
			}
		}

		// print longest bitonic sub-array
		System.out.println("The longest bitonic subarray is [" + start + "," + end + "]");
		System.out.print("Elements of the said sub-array: ");
	    for (int x = start; x <= end; x++)
	     {
			
		  System.out.print(nums[x]+" ");			
		 }	

		System.out.println("\nThe length of longest bitonic subarray is " + lbs_len);

		return lbs_len;
	}

	public static void main(String[] args)
	{
		int[] nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
		System.out.println("\nOriginal array: "+Arrays.toString(nums));
		find_Bitonic_Subarray(nums);
	}
}

 [63 https://www.w3resource.com/java-exercises/array/java-array-exercise-63.php]
  
Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]

import java.util.Arrays;

class solution
{
	public static int[] find_Product_in_array(int[] nums)
	{
		int n = nums.length;

		int[] left_element = new int[n];
		int[] right_element = new int[n];

		left_element[0] = 1;
		for (int i = 1; i < n; i++) {
			left_element[i] = nums[i - 1] * left_element[i - 1];
		}

		right_element[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right_element[j] = nums[j + 1] * right_element[j + 1];
		}

		for (int i = 0; i < n; i++) {
			nums[i] = left_element[i] * right_element[i];
		}
	return nums;	
	}

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7};
		System.out.println("Original array:\n"+Arrays.toString(nums1));
		int[] result1 = find_Product_in_array(nums1);
		System.out.println("Array with product of every other element:\n" + Arrays.toString(result1));

		int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7};
		System.out.println("\nOriginal array:\n"+Arrays.toString(nums2));
		int[] result2 = find_Product_in_array(nums2);
		System.out.println("Array with product of every other element:\n" + Arrays.toString(result2));

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

@ Function just like Arrays.sort(arr) [Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.]
https://www.w3resource.com/java-exercises/array/java-array-exercise-73.php
	  
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








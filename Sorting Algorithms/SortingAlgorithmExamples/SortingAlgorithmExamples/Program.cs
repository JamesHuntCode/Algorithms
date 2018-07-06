using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SortingAlgorithmExamples
{
    class Program
    {
        /// <summary>
        /// Program to demonstrate the implementation of a few different and popular ways of sorting an unordered dataset. 
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            // Log the sorted arrays & the initial dataset:
            Console.WriteLine("\nOriginal dataset: \n");

            int[] mixedNumbers = GetRandomArray();   

            for (int i = 0; i < mixedNumbers.Length; i++)
            {
                Console.Write(mixedNumbers[i].ToString() + " ");
            }

            // Different sorting methods:
            Console.WriteLine("\n\nSelection sort - O(n^2):\n");
            LogElements(SelectionSort(GetRandomArray()));
            Console.WriteLine("\n\nBubble sort - O(n^2):\n");
            LogElements(BubbleSort(GetRandomArray()));
            Console.WriteLine("\n\nInsertion sort - O(n^2):\n");
            LogElements(InsertionSort(GetRandomArray()));
            Console.WriteLine("\n\nMerge sort - O(n log n):\n");
            LogElements(MergeSort(GetRandomArray()));
            Console.WriteLine("\n\nQuick sort - O(n log n):\n");
            LogElements(QuickSort(GetRandomArray(), 0, GetRandomArray().Length));
            Console.WriteLine("\n\nCounting sort: \n");
            LogElements(CountingSort(GetRandomArray()));
            Console.WriteLine("\n\nHeap sort: \n");
            LogElements(HeapSort(GetRandomArray()));

            // Program finished.
            Console.Read();
        }

        /// <summary>
        /// Selection sort.
        /// O(n^2) time complexity.
        /// Two 'halves', pick smallest element from right and insert it into the left.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] SelectionSort(int[] array)
        {
            int length = array.Length;

            // Move across the array indexes.
            for (int i = 0; i < (length - 1); i++)
            {
                int minValue = i;

                // Find the smallest value in the array.
                for (int j = (i + 1); j < length; j++)
                {
                    if (array[j] < array[minValue])
                    {
                        minValue = j;
                    }
                }

                // Swap the smallest located element with the next slot to be sorted in the array.
                int tempValue = array[minValue];
                array[minValue] = array[i];
                array[i] = tempValue;

            }

            return array;
        }

        /// <summary>
        /// Bubble sort.
        /// O(n^2) time complexity.
        /// Pick two elements at a time, compare them and put the smaller to the left. Repeat this until no shifts are required.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] BubbleSort(int[] array)
        {
            int length = array.Length;

            // Loop over the entire dataset.
            for (int i = 0; i < (length - 1); i++)
            {
                // Compare all indexes with the index one shift to the right.
                for (int j = 0; j < (length - i - 1); j++)
                {
                    // Interchange them if the left is smaller than the right.
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            
            return array;
        }

        /// <summary>
        /// Insertion sort.
        /// O(n^2) time complexity.
        /// Move across the array, insert the next element into the correct index by shifting the other elements.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] InsertionSort(int[] array)
        {
            int length = array.Length;

            // Iterate over the array starting at the second index.
            for (int i = 1; i < length; ++i)
            {
                int key = array[i];
                int j = (i - 1);

                // Move elements that are greater than key one index to the right.
                while ((j >= 0) && (array[j] > key))
                {
                    array[j + 1] = array[j];
                    j = (j - 1);
                }

                array[j + 1] = key;
            }

            return array;
        }

        /// <summary>
        /// Merge sort.
        /// O(n log n) time complexity.
        /// Splits one array into two sub-arrays and then merges the two sorted sub-array back into one sorted array.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] MergeSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Partition method needed to execute the quicksort algorithm.
        /// </summary>
        /// <returns></returns>
        static int QuickSortPartition(int[] array, int low, int hight)
        {
            return -1;
        }

        /// <summary>
        /// Quick sort.
        /// O(n log n) time complexity.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] QuickSort(int[] array, int low, int hight)
        {
            return array;
        }

        /// <summary>
        /// Counting sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] CountingSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Heap sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] HeapSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Method to iterate over an array and log the elements to the console.
        /// </summary>
        /// <param name="array"></param>
        static void LogElements(int[] array)
        {
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i].ToString() + " ");
            }
        }

        /// <summary>
        /// Method to return an array of random integer values.
        /// </summary>
        /// <returns></returns>
        static int[] GetRandomArray()
        {
            int[] mixedNumbers = new int[10];

            mixedNumbers[0] = 5;
            mixedNumbers[1] = 7;
            mixedNumbers[2] = 1;
            mixedNumbers[3] = 11;
            mixedNumbers[4] = 14;
            mixedNumbers[5] = 3;
            mixedNumbers[6] = 2;
            mixedNumbers[7] = 9;
            mixedNumbers[8] = 10;
            mixedNumbers[9] = 17;

            return mixedNumbers;
        }
    }
}

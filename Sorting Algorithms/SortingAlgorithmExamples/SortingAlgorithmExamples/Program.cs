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
            Console.WriteLine("Original dataset: \n\n");

            int[] mixedNumbers = new int[10];
            Random rnd = new Random();

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

            for (int i = 0; i < mixedNumbers.Length; i++)
            {
                Console.Write(mixedNumbers[i].ToString() + " ");
            }

            // Different sorting methods:
            Console.WriteLine("\n\nSelection sort: \n\n");
            Console.WriteLine("Bubble sort: \n\n");
            Console.WriteLine("Insertion sort: \n\n");
            Console.WriteLine("Merge sort: \n\n");
            Console.WriteLine("Quick sort: \n\n");
            Console.WriteLine("Counting sort: \n\n");
            Console.WriteLine("Heap sort: \n\n");

            // Program finished.
            Console.Read();
        }

        /// <summary>
        /// Selection sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] SelectionSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Bubble sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] BubbleSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Insertion sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] InsertionSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Merge sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] MergeSort(int[] array)
        {
            return array;
        }

        /// <summary>
        /// Quick sort.
        /// </summary>
        /// <param name="array"></param>
        /// <returns></returns>
        static int[] QuickSort(int[] array)
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
    }
}

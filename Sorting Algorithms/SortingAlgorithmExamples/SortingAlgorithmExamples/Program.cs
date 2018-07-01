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
            Console.WriteLine("\n\nSelection sort: \n");
            LogElements(SelectionSort(mixedNumbers));
            Console.WriteLine("\n\nBubble sort: \n");
            LogElements(BubbleSort(mixedNumbers));
            Console.WriteLine("\n\nInsertion sort: \n");
            LogElements(InsertionSort(mixedNumbers));
            Console.WriteLine("\n\nMerge sort: \n");
            LogElements(MergeSort(mixedNumbers));
            Console.WriteLine("\n\nQuick sort: \n");
            LogElements(QuickSort(mixedNumbers));
            Console.WriteLine("\n\nCounting sort: \n");
            LogElements(CountingSort(mixedNumbers));
            Console.WriteLine("\n\nHeap sort: \n");
            LogElements(HeapSort(mixedNumbers));

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
            int[] sortedDataset = new int[array.Length - 1];



            return sortedDataset;
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
    }
}

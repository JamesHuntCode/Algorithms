using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SearchingAlgorithms
{
    /// <summary>
    /// Program to implement linear and binary search algorithms.
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            // Integer array to be searched.
            int[] searchMe = new int[100];

            for (int i = 0; i < 100; i++)
            {
                searchMe[i] = i;
            }

            // Linear Search:
            Console.WriteLine("\nLINEAR SEARCH:\n");

            int indexLocated = LinearSearch(searchMe, 50);

            if (indexLocated == -1)
            {
                Console.WriteLine("\nElement not in array.\n");
            }
            else
            {
                Console.WriteLine("\nElement located at index: " + indexLocated + ".\n");
            }

            // Iterative Binary Search:
            Console.WriteLine("\nITERATIVE BINARY SEARCH:\n");

            indexLocated = IterativeBinarySearch(searchMe, 67);

            if (indexLocated == -1)
            {
                Console.WriteLine("\nElement not in array.\n");
            }
            else
            {
                Console.WriteLine("\nElement located at index: " + indexLocated + ".\n");
            }

            // Recursive Binary Search:
            Console.WriteLine("\nRECURSIVE BINARY SEARCH:\n");

            indexLocated = RecursiveBinarySearch(searchMe, 75, 0, searchMe.Length);

            if (indexLocated == -1)
            {
                Console.WriteLine("\nElement not in array.\n");
            }
            else
            {
                Console.WriteLine("\nElement located at index: " + indexLocated + ".\n");
            }

            // Wait to close program.
            Console.Read();
        }

        /// <summary>
        /// Method to execute a linear search on an array of integers.
        /// </summary>
        /// <param name="dataset"></param>
        /// <param name="searchingFor"></param>
        /// <returns></returns>
        static int LinearSearch(int[] dataset, int searchingFor)
        {
            for (int i = 0; i < dataset.Length; i++)
            {
                if (searchingFor == dataset[i]) return i;
            }

            return -1;
        }

        /// <summary>
        /// Method to execute an iterative binary search on an array of integers.
        /// </summary>
        /// <param name="dataset"></param>
        /// <param name="searchingFor"></param>
        /// <returns></returns>
        static int IterativeBinarySearch(int[] dataset, int searchingFor)
        {
            int top = dataset.Length;
            int bottom = 0;
            bool isFound = false;

            while ((bottom < top) && (!isFound))
            {
                int mid = (bottom + top) / 2;

                if (searchingFor == dataset[mid])
                {
                    return mid;
                }
                else if (searchingFor < dataset[mid])
                {
                    top = mid;
                }
                else
                {
                    bottom = (mid + 1);
                }
            }
            
            return -1;
        }

        /// <summary>
        /// Method to execute a recursive binary search on an array of integers.
        /// </summary>
        /// <param name="dataset"></param>
        /// <param name="searchingFor"></param>
        /// <param name="bottom"></param>
        /// <param name="top"></param>
        /// <returns></returns>
        static int RecursiveBinarySearch(int[] dataset, int searchingFor, int bottom, int top)
        {
            int mid = (bottom + top) / 2;

            if (searchingFor == dataset[mid])
            {
                return mid;
            }
            else if (searchingFor < dataset[mid])
            {
                return RecursiveBinarySearch(dataset, searchingFor, bottom, mid);
            }
            else
            {
                return RecursiveBinarySearch(dataset, searchingFor, mid, top);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HashTableDemo
{
    /// <summary>
    /// A program where the hash table contains index names.
    /// </summary>
    class Program
    {
        /// <summary>
        /// Program to demonstrate simple implementation of a hash table in C#.NET.
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {

        }
    }

    /// <summary>
    /// Hash-Table data structure.
    /// </summary>
    class HashTable
    {
        /// <summary>
        /// Index of all possible letters in the alphabet pointing to indexes in the entries list.
        /// </summary>
        int[] indexes = new int[26];

        /// <summary>
        /// List of strings that indexes in the index array will point too.
        /// </summary>
        List<string> entries = new List<string>();

        /// <summary>
        /// Determine if the hash table contains any elements.
        /// </summary>
        /// <returns></returns>
        public bool IsEmpty()
        {
            return true;
        }

        /// <summary>
        /// Return the number of elements inside the hash table.
        /// </summary>
        /// <returns></returns>
        public int Size()
        {
            return -1;
        }

        /// <summary>
        /// Check hash table for element, if located, return index, else, return -1.
        /// </summary>
        /// <param name="searchingfor"></param>
        /// <returns></returns>
        public int Search(string searchingfor)
        {
            return -1;
        }

        /// <summary>
        /// Visit every entry of the hash table (using the index array) and log the data element to the console.
        /// </summary>
        public void Traverse()
        {

        }
    }
}

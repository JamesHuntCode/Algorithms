﻿using System;
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
            // Create new hash table.
            HashTable myTable = new HashTable();

            // Add some data to the table (in this case, names).
            myTable.AddEntry("James");
            myTable.AddEntry("Samuel");
            myTable.AddEntry("Alex");
            myTable.AddEntry("Kanye");
            myTable.AddEntry("Callum");
            myTable.AddEntry("Alan");
            myTable.AddEntry("Derek");
            myTable.AddEntry("Sampson");
            myTable.AddEntry("Joshua");
            myTable.AddEntry("Dominic");
            myTable.AddEntry("Lewis");

            // Log all data entries to the console.
            Console.WriteLine("Data currently in the hash table is as follows: \n");

            myTable.FetchEntries();

            Console.Read();
        }
    }

    /// <summary>
    /// Hash-Table data structure.
    /// </summary>
    class HashTable
    {
        /// <summary>
        /// Index of all possible letters in the alphabet pointing to indexes (buckets of data) in the entries list.
        /// </summary>
        List<int[,]> bucketIndecies = new List<int[,]>();

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
            return (entries.Count == 0);
        }

        /// <summary>
        /// Add a new entry into the hash table.
        /// </summary>
        /// <param name="entry"></param>
        public void AddEntry(string entry)
        {
            entries.Add(entry);
        }

        /// <summary>
        /// Return the number of elements inside the hash table.
        /// </summary>
        /// <returns></returns>
        public int Size()
        {
            return (entries.Count);
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
        /// Visit every entry of the hash table and log the data element to the console.
        /// </summary>
        public void FetchEntries()
        {
            for (int i = 0; i < entries.Count; i++)
            {
                Console.WriteLine(entries[i]);
            }
        }

        /// <summary>
        /// Visit every entry in the hash table with the same first letter as the letter passed in.
        /// </summary>
        /// <param name="letter"></param>
        public void TraverseSection(string letter)
        {

        }

        /// <summary>
        /// Return the string entry at the index passed in.
        /// </summary>
        /// <param name="index"></param>
        /// <returns></returns>
        public string GetPreciseEntryAt(int index)
        {
            try
            {
                return entries[index];
            }
            catch (Exception)
            {
                return String.Empty;
            }
        }

        /// <summary>
        /// Log all data (including keys) to the console.
        /// </summary>
        public void LogAll()
        {

        }
    }
}

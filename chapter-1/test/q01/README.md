> All questions were extracted from the book "Java Coding Problems" by Anghel Leonard

# Question 01

**Counting duplicate characters: Write a program that counts duplicate characters from a given string.**

In this question, I made the following steps:

1. At first, I initializated an array called _freq_ to save all the frequences from a given string.

2. Second, I knew that every character is a number based in ASCII table, so, based on that I went to the _freq array_ index where ASCII character belongs, e.g: character 'a' is represented as 98 in ASCII table, so, I went to the 98 position in freq array and incremented.

3. The second array was made for couting the duplicate characters, if the element where character position in freq array was more than 1 (indicates that has more than one)




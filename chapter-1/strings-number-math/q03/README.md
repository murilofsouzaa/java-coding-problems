All questions were extracted from the book "Java Coding Problems" by Anghel Leonard

# Question 03

**Reversing letters and words: Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.**

In this question, I made the following steps:

1. I "converted" the given string for an array of chars, since strings are immutable. So, for me manipulate the string and reverse it, I needed to perform a transformation.

2. I started by reversing the words, **e.g:** "Hello World" -> "dlrdoW olleH". For this, I only set one pointer in the start and another to end. I passed through the array, and was replacing the _reversedWordAndLetters[k]_ (k represents start) by _string.charAt(i)_  (i represents the end). This first part, was basically this, without any secrets.

3. In this step was more difficult. Because I have to reverse each word separately. *e.g:*** "Hello World" -> "olleH dlroW". To do this, I checked if the word had reached the end or the space. If it was true, I reversed the word and then the start will be replaced by the next letter after the space, until reach the end of the word.

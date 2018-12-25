package com.katas;

import java.util.List;

public interface Kata1 {

    /**
     * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
     * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
     * For example, there are a set of socks with colors sockColors = [1,2,1,2,1,3,2].
     * There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
     *
     * @param sockColors
     * @return number of pairs
     */
    int numberOfPairs(List<Integer> sockColors);

    /**
     * Lilah has a string, word, of lowercase English letters that she repeated infinitely many times.
     * Given an integer, firstCharactersOfInfiniteString, find the number of letter a's in the first letters of Lilah's infinite string.
     * For example, if the string word = 'abcac' and firstCharactersOfInfiniteString = 10, the substring we consider is 'abcacabcac', the first 10 characters of her infinite string.
     * There are 4 occurrences of a in the substring.
     *
     * @param word
     * @param firstCharactersOfInfiniteString
     * @return number of letter a's in the first letters
     */
    int numberOfAs(String word, int firstCharactersOfInfiniteString);
}

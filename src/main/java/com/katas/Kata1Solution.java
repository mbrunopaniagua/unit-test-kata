package com.katas;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kata1Solution implements Kata1 {

    @Override
    public int numberOfPairs(List<Integer> sockColors) {
        if (CollectionUtils.isEmpty(sockColors)) throw new IllegalArgumentException();
        if (sockColors.size() == 1) return 0;

        Integer pairOfSocks = 0;
        Set<Integer> singleSocks = new HashSet<>(sockColors);
        for (Integer singleSock : singleSocks) {
            pairOfSocks += Collections.frequency(sockColors, singleSock)/2;
        }
        return pairOfSocks;
    }

    @Override
    public int numberOfAs(String word, int firstCharactersOfInfiniteString) {
        return 0;
    }
}

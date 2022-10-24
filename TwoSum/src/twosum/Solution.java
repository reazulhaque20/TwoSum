/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twosum;

import java.util.HashMap;

/**
 *
 * @author Reazul-System
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}

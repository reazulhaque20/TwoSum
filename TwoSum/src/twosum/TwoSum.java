/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosum;

import java.util.Arrays;

/**
 *
 * @author Reazul-System
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {7,2,13,11,8};
        int target = 24;
        Solution solution = new Solution();
        System.out.println("Output: " + Arrays.toString(solution.twoSum(list, target)));
    }
    
}

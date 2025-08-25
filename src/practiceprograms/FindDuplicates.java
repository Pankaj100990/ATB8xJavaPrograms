package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
        public static void main(String[] args) {
            int[] inputArr={2,6,5,7,6,11,1,8,2,4,5,9,11};
//key=2, value =occurances
                Map<Integer,Integer> hm= new HashMap();
                for(int x : inputArr){
                    if(!hm.containsKey(x)){
                        hm.put(x,1);
                    }
                        else{
                        hm.put(x,hm.get(x)+1);
                        }
                }
                for (Integer x: hm.keySet()){
                    if(hm.get(x)>1){
                        System.out.println("Duplicate elements is: " + x);
                }
            }




//            int[] numbers = {1, 2, 3, 4, 5, 1, 2};
//
//            // Create a HashMap to store the frequencies of each element
//            Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//            // Calculate the frequencies
//            for (int num : numbers) {
//                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//            }
//
//            // Print duplicate elements
//            System.out.print("Duplicate elements: ");
//            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//                if (entry.getValue() > 1) {
//                    System.out.print(entry.getKey() + " ");
//                }
//            }
       }
    }


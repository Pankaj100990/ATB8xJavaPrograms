package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount_Duplicate_HashMap {
    public static void main(String[] args) {
        int[] arr={2,6,5,7,6,11,1,8,2,4,5,6,11};
//key=2,value =2 , k=6,value=3
        HashMap<Integer,Integer> hm= new HashMap();
        for(int i=0 ; i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry entry: hm.entrySet()){
                System.out.println("Elements | Frequency");
                System.out.println(entry.getKey()+"      "+entry.getValue());
                
            }
        }
    }
//TimeComplexity is O(n)
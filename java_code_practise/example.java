package java_code_practise;

import java.util.HashSet;
import java.util.Set;

public class example {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int find=1;
        boolean found=false;
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for(int a: A){
            if(a>0){
                set.add(a);
            }
        }
        for(int i=1;i<=N+1 && !found ;i++){
            if(!set.contains(i)){
                find=i;
                found = true;
            }
        }
        System.out.println(find);
    }
    }

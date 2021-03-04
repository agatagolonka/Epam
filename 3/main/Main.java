package com.epam.test.automation.java.practice3;

public class Main {

    private Main(){
        
    }
    public static int[] task1(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] % 2 == 0 && arr[arr.length - 1 - i] % 2 == 0) {
                tmp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = tmp;
            }
        }
           return arr;
        
        
     
    }

    
    public static int task2(int[] arr) {
        
        int max=arr[0];
        
        int firstIndex = 0;
        int lastIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
                firstIndex=i;
            }
            
        }
       
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j]==max) {
                lastIndex = j;
                break;
            }
        }

        return lastIndex - firstIndex;
       
        

    }

    public static int[][] task3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                    if(i>j){
                        arr[i][j] = 0;
                    }
                if(i<j){
                    arr[i][j] = 1;
                }

                }
            }


        
  return arr;
        
      
    }

}

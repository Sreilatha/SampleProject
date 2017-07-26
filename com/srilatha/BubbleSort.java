package com.srilatha;

        public class BubbleSort {

        public static void main(String[] args) {
            int arr[]= {65,100,8,3,11,32,17};
            System.out.println("Before Sorting");
            for(int i=0;i<arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
            bubble(arr);

            System.out.println("After Sorting");

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");

            }

            }

        public static void bubble(int[] arr){
            int temp=0;
            int n= arr.length;

            for(int i = 0; i<n;i++){
                for(int j=1;j<(n-i);j++){
                    if(arr[j-1]>arr[j]){
                        temp= arr[j-1];
                        arr[j-1]=arr[j];
                         arr[j]= temp ;

                    }

                }
            }
        }
    }

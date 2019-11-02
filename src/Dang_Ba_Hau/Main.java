package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("Array list :");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nEnter number push");
        int number = input.nextInt();
        System.out.println("Enter index push");
        int index = input.nextInt();
        if(index>0 && index < array.length +1){
            array[index-1] = number;
        }else {
            System.out.println("exceed limits array");
        }
        System.out.println("List after :");
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + "\t");
        }

    }
}

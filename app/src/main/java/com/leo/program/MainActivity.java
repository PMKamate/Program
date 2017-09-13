package com.leo.program;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static int x = 11;
    private int y = 33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // check_increment_op();
        // method1(5);

        //For_Each_maxno();

        // mult_array();

        // oned_array();

        // reverseNumber(125);

        //printBinaryFormat(25);
       // System.out.println("i1: ");
      //  isPerfectNumber(30);

      //  arrayListRemoveduplicateElements();

        findUppercaseletters();
    }

    public void check_increment_op() {
        int i = 10;
        System.out.println("i1: " + i);
        i++;
        System.out.println("i2: " + i);
        ++i;
        System.out.println("i3: " + i);

        int k, x;

        k = 2;
        x = ++k;
        System.out.println("k: " + k + "-----" + "x: " + x);
// now i = 3, x = 3

        k = 2;
        x = k++;
        System.out.println("k1: " + k + "-----" + "x1: " + x);
// now i = 3, x = 2
    }


    public void method1(int x) {

        x = 22;
        y = 44;

        System.out.println("Test.x: " + x);
        System.out.println("t.x: " + x);
        System.out.println("t.y: " + y);
        System.out.println("y: " + y);
    }

    public void For_Each_maxno() {
        int[] marks = {101, 102, 990, 100};
        String max_no = find_maximun_no(marks);
        System.out.println("max_no: " + max_no);
    }

    public String find_maximun_no(int[] marks) {
        int max_no = marks[0];

        int min_no = marks[0];

        for (Integer num : marks) {
            if (num >= max_no) {
                max_no = num;
            } else if (num <= min_no) {
                min_no = num;
            }
        }

            /*for (Integer num:marks )
            {
                if(num<=min_no)
                {
                    min_no=num;
                }
            }*/
        return "max_no: " + max_no + "----" + "min_no: " + min_no;
    }

    public void mult_array() {

        //int arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
        int arr1[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
//traversing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void oned_array() {
        int a[] = {60, 30, 70, 50, 30};
        int num1 = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("num: " + a[i]);
                }
            }
        }
    }

    public int reverseNumber(int number) {

        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            System.out.println("reverse: " + reverse);
            number = number / 10;
            System.out.println("number: " + number);
        }
        return reverse;
    }

  /*  public void print_binaryno(int num)
    {
        int binary[]=new int[25];
        int index=0;
        while (num>0)
        {
            binary[index++]=num%2;
            num=num/2;
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        }
        printBinaryFormat(25);
    }

    public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
*/

    public void printBinaryFormat(int number) {
        //System.out.print("dara"+number);
        int binary[] = new int[25];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        // System.out.print("dara"+number);
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public boolean isPerfectNumber(int number) {

        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
                System.out.println(temp);
            }
        }
        System.out.println(temp);
        if (temp == number) {
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
    }

    public void arrayListRemoveduplicateElements() {
        ArrayList<Object> al = new ArrayList<Object>();

        al.add("java");
        al.add('a');
        al.add('b');
        al.add('a');
        al.add("java");
        al.add(10.3);
        al.add('c');
        al.add(14);
        al.add("java");
        al.add(12);

        System.out.println("Before Remove Duplicate elements:" + al);

        for (int i = 0; i < al.size(); i++) {

            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }
            }

        }

        System.out.println("After Removing duplicate elements:" + al);

    }

    public void findUppercaseletters()
    {
        String str= "How to Print Uppercase Letters in Java";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i));
            }

            char character = str.charAt(i); // This gives the character 'a'
            int ascii = (int) character; // ascii is now 97.
            if(ascii>=65&&ascii<=90)
            {
                System.out.println(str.charAt(i));

            }

        }
    }
 }



package lab2;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args){
         //ค่างวดผ่อนรถ ราคารถ x เงินดาวน์ Y ดอกเบี้ย z ค่างวด w วันนับงวด
        Scanner scanner = new Scanner(System.in) ;
        //รับค่าราคารถ
        System.out.print("ราคารถ: ");
        double x = scanner.nextDouble();

        //รับค่าเงินดาวน์
        System.out.print("ราคาเงินดาวน์: ");
        double y = scanner.nextDouble();
        //รับค่าดอกเบี้ย
        System.out.print("ดอกเบี้ย: ");
        double z = scanner.nextDouble();
        //รับค่างวด
        System.out.print("ค่างวด: ");
        int w = scanner.nextInt();
        double a = x - y ;
        double b = a * (z/100)* w;
        double c = a + b;
        double d = c / (w*12);
       //display
        System.out.println(d);












    }//main



}//class

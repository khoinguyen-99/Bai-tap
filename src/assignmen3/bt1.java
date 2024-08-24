
package assignmen3;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        String ten= keyboard.nextLine();
        
        System.out.println("Nhap tuoi: ");
        int tuoi= keyboard.nextInt();
        
        System.out.println("Nhap nam sinh: ");
        int namsinh= keyboard.nextInt();
        
        keyboard.nextLine();
        
        System.out.println("Nhap gioi tinh: ");
        String gioitinh= keyboard.nextLine();
        
        System.out.println("Nhap chuyen nganh: ");
        String chuyennganh= keyboard.nextLine();
        
        System.out.println("Nhap GPA: ");
        Float gpa= keyboard.nextFloat();
        
        keyboard.nextLine();
        
        System.out.println("Nhap que quan: ");
        String quequan= keyboard.nextLine();
        
        System.out.println("====Thong Tin Sinh Vien====");
                
        System.out.println("Ten: "+ ten);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Nam sinh: "+ namsinh);
        System.out.println("Gioi tinh: "+ gioitinh);
        System.out.println("Chuyen Nganh: "+ chuyennganh);
        System.out.println("GPA: "+ gpa);
        System.out.println("Que Quan: "+ quequan);
    }
}

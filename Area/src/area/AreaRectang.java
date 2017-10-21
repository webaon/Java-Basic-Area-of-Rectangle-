
package area;
import java.util.Scanner; 
public class AreaRectang {

    public static void main(String[] args) {
        
/*
หาพื้นที่สี่เหลี่ยมผืนผ้า แบบเลือกสูตรความระเอียดได้ (แบบง่าย)
        ** Width คือ ตัวแปรชนิด int เก็บค่า ความกว้าง
        ** Height คือ ตัวแปรชนิด int เก็บค่า ความยาว
        ** Width * Height คือ คำนวณหาพื้นที่สี่เหลี่ยมผืนผ้าตามสูตร (กว้าง x ยาว)
        ** หาก Width กับ Height มีค่าเท่ากัน จะแจ้งว่าเป็นสี่เหลี่ยม จัตุรัส
*/       
        int width ;
        int height ;
        int area ;
        Scanner num = new Scanner(System.in); //สร้าง Object Scanner ขึ้นมาเพื่อรับค่าทางคีย์บอร์ด
        System.out.println("Calculate the area of a rectangle...");
        
        System.out.print("Enter Width: "); //ข้อความแจ้งให้ป้อนค่าความกว้าง
        width = num.nextInt(); //หยุดรับข้อความทางคีย์บอร์ด
        
        System.out.print("Enter Height: "); //ข้อความแจ้งให้ป้อนค่าความสูง(ความยาว)
        height = num.nextInt(); //หยุดรับข้อความทางคีย์บอร์ด
        if (width == height){ //ตรวจสอบว่าเป็นสี่เหลี่ยมผืนผ้าหรือสี่เหลี่มจัตุรัส
            System.out.print("Is not area fo rectangle\nIt is area fo square => ");
        }else{
            System.out.print("Rectangle of ");
        }
        area = width * height; //คำนวณหาพื้นที่
        System.out.println("Area = " + area);
        
        
    }
    
}

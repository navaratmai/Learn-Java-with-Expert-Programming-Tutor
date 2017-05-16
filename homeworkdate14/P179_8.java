package homeworkdate14;

import java.util.Scanner;

public class P179_8
{

	public static void main(String[] args)
	{
		 long id = 0;
	        while(true){ //วนจนกว่าจะป้อนค่าที่ถูกต้อง
	            try {
	                Scanner in = new Scanner(System.in); //สร้างตัวแปร scanner เพื่อรับค่าทางแป้นพิมพ์
	                System.out.print("กรุณากรอกรหัสประจำตัว 12 หลัก "); //แสดงให้ผู้กรอกรู้ว่าต้องกรอกตัวเลข
	                id = in.nextLong(); //รับค่าจากแป้นพิมพ์เป็นชนิด long
	                String checkbit = id + ""; //สร้างตัวแปร checkbit เป็นชนิดสตริงเพื่อตรวจสอบความยาวของตัวเลข
	                if(checkbit.length() == 12) break; //check ว่าค่าที่รับเข้ามามีขนาดกี่หลัก ถ้ามีสิบสองหลักให้ break ออกจาก loop
	            }catch (Exception e) {
	            }
	        }
	        long base = 100000000000l; //สร้างตัวแปร เพื่อสำหรับให้หารเพื่อเอาหลักที่ต้องการ
	        int basenow; //สร้างตัวแปรเพื่อเก็บค่าประจำหลัก
	        int sum = 0; //สร้างตัวแปรเริ่มตัวผลบวกให้เท่ากับ 0
	        for(int i = 13; i > 1; i--) { //วนรอบตั้งแต่ 13 ลงมาจนถึง 2
	            basenow = (int)Math.floor(id/base); //หาค่าประจำตำแหน่งนั้น ๆ
	            id = id - basenow*base; //ลดค่า id ลงทีละหลัก
	            System.out.println(basenow + "x" + i + " = " + (basenow*i)); //แสดงค่าเมื่อคูณแล้วของแต่ละหลัก
	            sum += basenow*i; //บวกค่า sum ไปเรื่อย ๆ ทีละหลัก
	            base = base/10; //ตัดค่าที่ใช้สำหรับการหาเลขแต่ละหลัก
	        }
	        System.out.println("Sum is " + sum); //แสดงค่า sum
	        int checkbit = (11 - (sum%11))%10; //คำนวณค่า checkbit
	        System.out.println("Check bit is " + checkbit); //แสดงค่า checkbit ที่ได้
	}

}

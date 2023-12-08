package TongHop;

import java.util.Scanner;

public class CNguoi {
	private String id;
	private String hten;
	private String ngay;
	private char phai;
	
	public CNguoi() {
		id= new String();
		hten = new String();
		ngay= new String();
		phai='M';
	}
	
	public CNguoi(CNguoi c) {
		id= new String(c.id);
		hten= new String(c.hten);
		ngay=new String(c.ngay);
		phai=c.phai;
	}
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so passport hay CMND: ");
		id=sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten=sc.nextLine();
		System.out.println("Nhap ngay-thang-nam: ");
		ngay=sc.nextLine();
		System.out.println("Nhap 'M' neu la NAM - nhap 'F' neu la NU: ");
		phai=sc.nextLine().charAt(0);
		
	}
	
	public void in() {
		System.out.println("-Id la: "+id);
		System.out.println("-Ho ten la: "+hten);
		System.out.println("-Ngay-thang-nam sinh la: "+ngay);
		if(phai=='M') System.out.println("-La Nam ");
		else System.out.println("-La Nu ");
		
	}
	
	//tinh tuoi
	public int layNgay() {
		String ngayt= this.ngay;
		String tuoi=ngayt.substring(ngayt.length()-4);
		int t=Integer.parseInt(tuoi);
		return 2023-t;
		
		
	}
	
	
	public static void main(String[]args) {
		
		CNguoi c1= new CNguoi();
		System.out.println("Nhap thong tin doi tuong c1: ");
		c1.nhap();
		System.out.println("\nThong tin doi tuong c1 la: ");
		c1.in();
		

		CNguoi c2= new CNguoi(c1);
		System.out.println("\nThong tin doi tuong c2 la: ");
		c2.in();
		
	}
	
}

package TongHop;

import java.util.Scanner;
public class Xe {
	private String soxe;
	private String loai;
	private String ngay;
	private char tthai;

	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai='C';
	}
	
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai=x.tthai;
	}
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so xe: ");
		soxe=sc.nextLine();
		System.out.println("Nhap laoi xe: ");
		loai=sc.nextLine();
		System.out.println("Nhap ngay-thang-nam dang kiem: ");
		ngay=sc.nextLine();
		System.out.println("Nhap 'C' xe duoc phep luu hanh. Nhap 'K' xe khong duoc phep luu hanh: ");
		tthai=sc.nextLine().charAt(0);
	}
	
	public void in() {
		System.out.println("-So xe la: "+soxe);
		System.out.println("-Loai xe la: "+loai);
		System.out.println("-Ngay-thang-nam dang kiem la: "+ngay);
		if(tthai=='C') System.out.println("-Trang thai duoc phep luu hanh. ");
		else System.out.println("-Trang thai khong duoc phep luu hanh. ");
		
	}
	
	public String toString() {
		return "-So xe la: "+soxe+" ,Loai xe la: "+loai+" ,Ngay-thang-nam dang kiem la: "+ngay+" ,Trang thai la: "+tthai;
		
	}
	
	public char layTT() {
		return this.tthai;
	}
	
	public String layNgay() {
		String ngay[]= this.ngay.split("-");
		return ngay[1]+"-"+ngay[2];
	}
	
	public String layL() {
		return this.loai;
	}
	
	
	public static void main(String[]args) {
		Xe x1=new Xe();
		System.out.println("Nhap thong tin cho doi tuong x1: ");
		x1.nhap();
		System.out.println("\nThong tin cho doi tuong x1 la: ");
		x1.in();
		
		Xe x2=new Xe(x1);
		System.out.println("\nThong tin cho doi tuong x2 la: ");
		x2.in();
		
		
	}
}


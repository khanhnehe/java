package TongHop;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private float so;
	private String hten;
	private String ngay;
	private String cv;
	private boolean tthai;
	
	
	public GDich() {
		mgd=0;
		so=(float) 0.0;
		hten=new String();
		ngay= new String();
		cv= new String();
		tthai=true;
		
	}
	
	public GDich(GDich g) {
		mgd=g.mgd;
		so=g.so;
		hten=new String(g.hten);
		ngay= new String(g.ngay);
		cv= new String(g.cv);
		tthai=g.tthai;
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ma giao dich");
		mgd=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so giao dich");
		so=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap ho ten: ");
		hten=sc.nextLine();
		System.out.println("Nhap ngay thang nam giao dich");
		ngay=sc.nextLine();
		System.out.println("Nhap cv: ");
		cv=sc.nextLine();
		System.out.println("Nhap 'true' trang thai giao dich thanh cong"
				+ ".Nhap 'false' trang thai giao dich that bai: ");
		tthai=sc.nextBoolean();		
		
	}
	
	public void in() {
		System.out.println("Ma giao dich la: "+mgd);
		System.out.println("Nhap so giao dich"+so);
		System.out.println("Ho ten nguoi giao dich la: "+hten);
		System.out.println("ngay-thang-nam giao dich la: "+ngay);
		System.out.println("cv la: "+cv);
		if (tthai==true) System.out.println("Giao dich thanh cong.");
			else System.out.println("Giao dich that bai.");
		
		
	}
	
	public String ToString() {
		return "["+mgd+"ma giao dịh la: "+hten+" ho ten la "+ngay+" ngay la: "+tthai+" thai thai la: "+cv+" cv la:"+"]";
	}
	
	//lay ma so
	public int layMGD() {
		return mgd;
	}
		
	public boolean layTThai() {
		
		return tthai;
	}
	//thangnam
	public String layNgay() {
		String tnam[]= this.ngay.split("-");
		return tnam[1]+"-"+tnam[2];
	}
	
	public String layCV() {
		return this.cv;
	}
	
	public float laySo() {
		return so;
	}
	
	public long layGT() {
	    return 0; // Hoặc giá trị tính toán thực tế của giá trị giao dịch
	}
	
	public long tinhSO() {
	    return 0; // Hoặc giá trị tính toán thực tế của giá trị giao dịch
	}
	
	public long tinhTien() {
		return 0;
		
	}
	public static void main(String[] args) {

		GDich g1= new GDich();
		System.out.println("Nhap thong tin giao dich doi tuong g1: ");
		g1.nhap();
		System.out.println("\nThong tin giao dich doi tuong g1: ");
		g1.in();
		
		
		GDich g2= new GDich(g1);
		System.out.println("\nThong tin giao dich doi tuong g2: ");
		g2.in();
		
		

	}

	
}

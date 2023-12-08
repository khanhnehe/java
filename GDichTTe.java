package TongHop;

import java.util.Scanner;

public class GDichTTe extends GDich{
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	
	public GDichTTe() {
		super();
		dgia=(float) 0.0;
		sluong=0;
		loai='c';
		tgia=(float) 0.0;
	}
	
	public GDichTTe(GDichTTe gd) {
		super(gd);
		dgia=gd.dgia;
		sluong=gd.sluong;
		loai=gd.loai;
		tgia=gd.tgia;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap don gia giao dich: ");
		dgia=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap so luong giao dich: ");
		sluong=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap 'V' la tien Viet Nam, nhap 'U' la tien USE, nhap 'E' la Euro: ");
		loai=sc.nextLine().charAt(0);
		System.out.println("Nhap ti gia: ");
		tgia=Float.parseFloat(sc.nextLine());	
		
	}
	public void in() {
		super.in();
		System.out.println("Don gia giao dich la: "+dgia);
		System.out.println("So luong giao dich la: "+sluong);
		if(loai=='V') System.out.println("Tien Viet Nam");
		if(loai=='U') System.out.println("Tien USE");
		if(loai=='E') System.out.println("Tien EURO");
		System.out.println("Ti gia giao dich la: "+tgia);
		
		
		
	}
	
	//tinh gia tr gd
	public long layGT() {
		long t = (long) (sluong*dgia*tgia);
		return t;
	}
	
	
	public long tinhTien() {
		long t= (long)(sluong *dgia *tgia);
		return t;
	}
	 //tinh so
	public long tinhSO() {
		long t = 0;
		float b = laySo();
		
		t= (long) (tgia+b);
		return t;
		}
	
	
	public static void main(String[] args) {
		System.out.print("Nhap so doi tuong: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		GDich[] ds = new GDich[n];
		for( int i=0;i<n;i++) {
			System.out.println("Nhap thong tin giao dich thu: "+(i+1));
			ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		
		
		for( int i=0;i<n;i++) {
			System.out.println("\nThong tin giao dich thu: "+(i+1));
			ds[i].in();
		}
		
		for(int i=0;i<n;i++) {
			if(ds[i].layGT()>100000 && ds[i].layTThai()==true) 
			System.out.println("\nma giao dich tren 100000 " + ds[i].layMGD());
		
		}//	
		
		
		for( int i=0;i<n;i++) {
			if (ds[i].layCV().equals("giao vien")) {
			    System.out.println("\nday la giao vien "+ds[i].layMGD());
			}
		}
		
		//tinhso
		for( int i=0;i<n;i++) {
			System.out.println("\nSo la: "+ds[i].tinhSO());
		}
		
		
		for( int i=0;i<n;i++) {
			System.out.println("\nSo tien cua cac giao dich la: "+ds[i].tinhTien()+" theo thang nam la: "+ds[i].layNgay());
		}
	}
}
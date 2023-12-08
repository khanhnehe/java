package TongHop;

import java.util.Scanner;

public class CThu extends CNguoi{
	private int soao;
	private String vtri;
	private long bthang;
	private String mua;
	private String clbo;
	
	
	public CThu() {
		super();
		soao = 0;
		vtri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
		
		
	}
	
	public CThu(CThu c) {
		super(c);
		soao=c.soao;
		vtri = new String(c.vtri);
		bthang = c.bthang;
		mua = new String(c.mua);
		clbo = new String(c.clbo);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhap so ao:");
		soao=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Vi tri: ");
		vtri=sc.nextLine();
		System.out.println("Nhap ban thang:");
		bthang=Long.parseLong(sc.nextLine());
		System.out.println("Nhap mua giai:");
		mua=sc.nextLine();
		System.out.println("Nhapcau la bo:");
		clbo=sc.nextLine();
		
	}

	public void in() {
		super.in();
		System.out.println("-So ao la: "+soao);
		System.out.println("-Vi tri la: "+vtri);
		System.out.println("-Ban thang la: "+bthang);
		System.out.println("-Mua giai la: "+mua);
		System.out.println("-Cau lac bo la: "+clbo);
	
	}
	
	//;luong cb 7000000
	//luong tang them ??
	//luong 500.000
	
	public long tinhLuong() {
		long cb=7000000;
		long tt=0;
		
		if(vtri.equalsIgnoreCase("thu mon")) {
			tt = cb+3000000;
		}
		if(vtri.equalsIgnoreCase("hau ve")) {
			tt = cb+4000000;
		}
		if(vtri.equalsIgnoreCase("trung ve")) {
			tt = cb+4500000;
		}
		if(vtri.equalsIgnoreCase("tien ve")) {
			tt = cb+5000000;
		}
		if(vtri.equalsIgnoreCase("tien dao")) {
			tt = cb+7000000;
		}
		
		tt= tt+bthang*500000;
		
		tt= (long) (tt -(tt*0.1));
		
		return tt;
	}
	public String layVTri() {
		return vtri;
	}
	
	public long layBT() {
		return bthang;
	}
	
	public static void main (String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhap so doi tuong:");
		
		int n= sc.nextInt();
		CThu ds[]=new CThu[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin doi tuong thu:"+(i+1));
			ds[i]=new CThu();
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nThong tin doi tuong thu la:"+(i+1));
			ds[i].in();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nDanh sach tien cua cau thu "+ds[i].layVTri()+" la: "+ds[i].tinhLuong());
		
	}
		for(int i=0;i<n;i++) {
			if(ds[i].layNgay()>=18 && ds[i].layNgay()<=24 ) {
			System.out.println("\nThong ke cac cau thu tu 18 -24 tuoi co so bang thang la:  "+ds[i].layBT());
			}
			if(ds[i].layNgay()>=25 && ds[i].layNgay()<=28 ) {
				System.out.println("\nThong ke cac cau thu tu 25-28 tuoi co so bang thang la:  "+ds[i].layBT()); 
				}
			if(ds[i].layNgay()>28 ) {
				System.out.println("\nThong ke cac cau thu tren 28 tuoi co so bang thang la:  "+ds[i].layBT()); 
				}
	}
	}
	
	
}
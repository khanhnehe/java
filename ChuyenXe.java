package TongHop;

import java.util.Scanner;

public class ChuyenXe {
	private Xe x;
	private int msc;
	private String tentx;
	private String nden;
	private float dthu;
	
	public ChuyenXe() {
		x=new Xe();
		msc=0;
		tentx=new String();
		nden= new String();
		dthu=(float) 0.0;
	}
	public ChuyenXe(ChuyenXe cx) {
		x=new Xe(cx.x);
		msc=cx.msc;
		tentx=new String(cx.tentx);
		nden=new String(cx.nden);
		dthu=cx.dthu;
	}
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap thong tin xe: ");
		x.nhap();
		System.out.println("Nhap ma so chuyen xe: ");
		msc=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ten tai xe: ");
		tentx=sc.nextLine();
		System.out.println("Nhap noi den: ");
		nden=sc.nextLine();
		System.out.println("Nhap doanh thu: ");
		dthu=Float.parseFloat(sc.nextLine());
		
	}
	
	public void in() {
		System.out.println("Thong tin xe la: \n"+x);
		System.out.println("-Thong tin xe la: "+msc);
		System.out.println("-Ten tai xe la: "+tentx);
		System.out.println("-Noi den la: "+nden);
		System.out.println("-Doanh thu la: "+dthu);
		
	}
	
	public String toString() {
		return "-Thong tin xe la: "+x+"-Ten tai xe la: "+tentx+"-Noi den la: "+nden+"-Doanh thu la: "+dthu;
	}
	
	//doanh thu <1000000
	public float layDThu() {
		return dthu;
	}
	public char layTThai() {
		return this.x.layTT();
	}
	
	public int layMSC() {
		return msc;
	}
	
	public float layLoiN() {
		return (float) (dthu*0.3);
	}
	public String layLoai() {
		return this.x.layL();
	}
	
	public String layThangN() {
		return this.x.layNgay();
	}
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so doi tuong: ");
		int m=sc.nextInt();
		ChuyenXe ds1[]=new ChuyenXe[m];
		
		for(int i=0;i<m;i++) {
			System.out.println("Nhap thong tin doi tuong thu: "+(i+1));
			ds1[i]=new ChuyenXe();
			ds1[i].nhap();
		}
		
		for(int i=0;i<m;i++) {
			System.out.println("\nThong tin doi tuong thu: "+(i+1));
			ds1[i].in();
		}
		
		
		//ko dc luu hanh , dthu <100000
		for(int i=0;i<m;i++) {
			if(ds1[i].layTThai()=='K' || ds1[i].layDThu()<100000) {
				System.out.println("\nThong tin chuyen xe bi huy do khong duoc phep luu hanh hoac co doanh thu duoi 100000: "+ds1[i].layMSC());
			}
		
		}
		
		for(int i=0;i<m;i++) {
			System.out.println("\nLoi nhuan cua loai xe: "+ds1[i].layLoai()+" la "+ds1[i].layLoiN()+" theo thang nam: "+ds1[i].layThangN());
		
		}
		
		
	}
}

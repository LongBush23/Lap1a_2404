import java.util.Scanner;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thuePhaiNop;
	
	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.thuePhaiNop = thuePhaiNop;
	}
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public double getThuePhaiNop() {
		return thuePhaiNop;
	}
	public void setThuePhaiNop(double thuePhaiNop) {
		this.thuePhaiNop = thuePhaiNop;
	}
	
	@Override
	public String toString() {
		return tenChuXe + "				" + loaiXe + "				" + dungTich + "				" + triGia + "				" + thuePhaiNop ;
	}
	Scanner sc = new Scanner(System.in);

	public void nhap() {
		System.out.println("Nhap ten chu xe: ");
		tenChuXe = sc.nextLine();
		
		System.out.println("Nhap ten loai xe: ");
		loaiXe = sc.nextLine();
		
		System.out.println("Nhap dung tich xe: ");
		dungTich = sc.nextInt();
		
		System.out.println("Nhap gia tri xe :");
		triGia = sc.nextDouble();
			
	}
	public double thuePhaiDong() {
		thuePhaiNop = 0;
		if(dungTich < 100) {
			thuePhaiNop = 0.01* triGia;	
		}if (dungTich >= 100 && dungTich < 200) {
			thuePhaiNop = 0.03 * triGia;
		}if (dungTich > 200 ) {
			thuePhaiNop = 0.05 * triGia;
		}
		return thuePhaiNop;
	}
	public void xuat() {

	    System.out.printf("%-25s %-20s %-15s %-15.0f %-15.0f%n", this.tenChuXe, this.loaiXe, this.dungTich, this.triGia, this.thuePhaiNop);
	    System.out.println("\n");
	}

	
}































import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTaiLieu ql = new QuanLyTaiLieu();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---------------- MENU QUAN LY THU VIEN ----------------");
            System.out.println("1. Them moi tai lieu (Sach, Tap chi, Bao)");
            System.out.println("2. Xoa tai lieu theo ma");
            System.out.println("3. Hien thi thong tin tat ca tai lieu");
            System.out.println("4. Tim kiem tai lieu theo loai");
            System.out.println("0. Thoat khoi chuong trinh");
            System.out.print("Chon chuc nang (0-4): ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Chon loai (1: Sach | 2: Tap chi | 3: Bao): ");
                    int loai = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ma tai lieu: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap ten nha xuat ban: ");
                    String nxb = sc.nextLine();
                    System.out.print("Nhap so ban phat hanh: ");
                    int soBan = sc.nextInt();
                    sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Nhap ten tac gia: ");
                        String tacGia = sc.nextLine();
                        System.out.print("Nhap so trang: ");
                        int soTrang = sc.nextInt();
                        ql.themTaiLieu(new Sach(ma, nxb, soBan, tacGia, soTrang));
                    } else if (loai == 2) {
                        System.out.print("Nhap so phat hanh: ");
                        int soPH = sc.nextInt();
                        System.out.print("Nhap thang phat hanh: ");
                        int thangPH = sc.nextInt();
                        ql.themTaiLieu(new TapChi(ma, nxb, soBan, soPH, thangPH));
                    } else if (loai == 3) {
                        System.out.print("Nhap ngay phat hanh: ");
                        int ngayPH = sc.nextInt();
                        ql.themTaiLieu(new Bao(ma, nxb, soBan, ngayPH));
                    } else {
                        System.out.println("Loai khong hop le!");
                    }
                    break;

                case 2:
                    System.out.print("Nhap ma tai lieu can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaTaiLieu(maXoa);
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.println("Chon loai can tim (1: Sach | 2: Tap chi | 3: Bao): ");
                    int loaiTim = sc.nextInt();
                    ql.timKiemTheoLoai(loaiTim);
                    break;

                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
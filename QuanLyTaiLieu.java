import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> dsTaiLieu;

    public QuanLyTaiLieu() {
        dsTaiLieu = new ArrayList<>();
    }

    public boolean themTaiLieu(TaiLieu taiLieu) {
        for (TaiLieu tl : dsTaiLieu) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(taiLieu.getMaTaiLieu())) {
                System.out.println("Loi: Ma tai lieu da ton tai!");
                return false;
            }
        }
        dsTaiLieu.add(taiLieu);
        System.out.println("Them thanh cong!");
        return true;
    }

    public boolean xoaTaiLieu(String maTaiLieu) {
        TaiLieu tlCanXoa = null;
        for (TaiLieu tl : dsTaiLieu) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                tlCanXoa = tl;
                break;
            }
        }
        if (tlCanXoa != null) {
            dsTaiLieu.remove(tlCanXoa);
            System.out.println("Da xoa tai lieu co ma: " + maTaiLieu);
            return true;
        } else {
            System.out.println("Khong tim thay tai lieu co ma: " + maTaiLieu);
            return false;
        }
    }

    public void hienThiDanhSach() {
        if (dsTaiLieu.isEmpty()) {
            System.out.println("Danh sach tai lieu dang trong!");
            return;
        }
        System.out.println("=== DANH SACH TAI LIEU ===");
        for (TaiLieu tl : dsTaiLieu) {
            tl.hienThiThongTin();
        }
    }

    public void timKiemTheoLoai(int loai) {
        boolean timThay = false;
        for (TaiLieu tl : dsTaiLieu) {
            if (loai == 1 && tl instanceof Sach) {
                tl.hienThiThongTin();
                timThay = true;
            } else if (loai == 2 && tl instanceof TapChi) {
                tl.hienThiThongTin();
                timThay = true;
            } else if (loai == 3 && tl instanceof Bao) {
                tl.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay tai lieu thuoc loai nay!");
        }
    }
}
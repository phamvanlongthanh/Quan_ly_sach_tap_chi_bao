public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() { return ngayPhatHanh; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("   [Bao] Ngay PH: " + ngayPhatHanh);
    }
}
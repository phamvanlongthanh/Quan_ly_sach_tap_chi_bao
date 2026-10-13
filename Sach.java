public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() { return tenTacGia; }
    public int getSoTrang() { return soTrang; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("   [Sach] Tac gia: " + tenTacGia + " | So trang: " + soTrang);
    }
}
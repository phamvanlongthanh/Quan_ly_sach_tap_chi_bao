public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNXB;
    protected int soBanPhatHanh;

    public TaiLieu() {}

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() { return maTaiLieu; }
    public void setMaTaiLieu(String maTaiLieu) { this.maTaiLieu = maTaiLieu; }

    public String getTenNXB() { return tenNXB; }
    public void setTenNXB(String tenNXB) { this.tenNXB = tenNXB; }

    public int getSoBanPhatHanh() { return soBanPhatHanh; }
    public void setSoBanPhatHanh(int soBanPhatHanh) { this.soBanPhatHanh = soBanPhatHanh; }

    public void hienThiThongTin() {
        System.out.println("---------------------------------Thong_tin_tai_lieu--------------------------");
        System.out.println("Ma TL: " + maTaiLieu + " | NXB: " + tenNXB + " | So ban PH: " + soBanPhatHanh);
    }
}
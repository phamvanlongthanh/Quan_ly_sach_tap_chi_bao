public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() { return soPhatHanh; }
    public int getThangPhatHanh() { return thangPhatHanh; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("   [Tap chi] So PH: " + soPhatHanh + " | Thang PH: " + thangPhatHanh);
    }
}
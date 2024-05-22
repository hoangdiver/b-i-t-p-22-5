package advance.dev.model;

public class CongNhan extends CanBo {
    // Thuộc tính riêng của lớp CongNhan
    private int bac; // Bậc (1 đến 10)

    // Constructor không đối số
    public CongNhan() {
        super();
    }

    // Constructor có đối số
    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    // Getter và Setter cho thuộc tính 'bac'
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    // Phương thức toString để hiển thị thông tin của CongNhan
    @Override
    public String toString() {
        return "CongNhan{" +
                "ten='" + getTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", bac=" + bac +
                '}';
    }
}

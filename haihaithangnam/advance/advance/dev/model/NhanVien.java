package advance.dev.model;

public class NhanVien extends CanBo {
    // Thuộc tính riêng của lớp NhanVien
    private String congViec; // Công việc

    // Constructor không đối số
    public NhanVien() {
        super();
    }

    // Constructor có đối số
    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    // Getter và Setter cho thuộc tính 'congViec'
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    // Phương thức toString để hiển thị thông tin của NhanVien
    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + getTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", congViec='" + congViec + '\'' +
                '}';
    }
}

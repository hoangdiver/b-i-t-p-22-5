package advance.dev.model;

public class KySu extends CanBo {
    // Thuộc tính riêng của lớp KySu
    private String nganhDaoTao; // Ngành đào tạo

    // Constructor không đối số
    public KySu() {
        super();
    }

    // Constructor có đối số
    public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    // Getter và Setter cho thuộc tính 'nganhDaoTao'
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    // Phương thức toString để hiển thị thông tin của KySu
    @Override
    public String toString() {
        return "KySu{" +
                "ten='" + getTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}

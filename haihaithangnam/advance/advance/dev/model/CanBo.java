package advance.dev.model;

public class CanBo {
    // Các thuộc tính của lớp CanBo
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    // Constructor không đối số
    public CanBo() {}

    // Constructor có đối số
    public CanBo(String ten, int tuoi, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // Getter và Setter cho thuộc tính 'ten'
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // Getter và Setter cho thuộc tính 'tuoi'
    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    // Getter và Setter cho thuộc tính 'gioiTinh'
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // Getter và Setter cho thuộc tính 'diaChi'
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}

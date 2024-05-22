package advance.dev.model;

public interface IManager {
    void add(CanBo cb); // Thêm cán bộ
    void print(); // In danh sách
    void sortByName(int order); // Sắp xếp tên
}

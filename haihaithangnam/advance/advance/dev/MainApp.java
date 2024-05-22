package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.CanBo;
import advance.dev.model.CongNhan;
import advance.dev.model.KySu;
import advance.dev.model.NhanVien;
import advance.dev.model.IManager;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        IManager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        // Nhập CongNhan
        System.out.println("Nhập thông tin công nhân (Nhấn Enter để dừng):");
        while (true) {
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) break;

            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();

            System.out.print("Bậc: ");
            int bac = Integer.parseInt(scanner.nextLine());

            CanBo congNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, bac);
            manager.add(congNhan);
        }

        // Nhập KySu
        System.out.println("Nhập thông tin kỹ sư (Nhấn Enter để dừng):");
        while (true) {
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) break;

            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();

            System.out.print("Ngành đào tạo: ");
            String nganhDaoTao = scanner.nextLine();

            CanBo kySu = new KySu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
            manager.add(kySu);
        }

        // Nhập NhanVien
        System.out.println("Nhập thông tin nhân viên (Nhấn Enter để dừng):");
        while (true) {
            System.out.print("Tên: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) break;

            System.out.print("Tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();

            System.out.print("Công việc: ");
            String congViec = scanner.nextLine();

            CanBo nhanVien = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
            manager.add(nhanVien);
        }

        // In danh sách cán bộ
        System.out.println("Danh sách cán bộ:");
        manager.print();

        // Sắp xếp tên tăng dần
        System.out.println("\nDanh sách cán bộ sắp xếp tên tăng dần:");
        manager.sortByName(1);
        manager.print();

        // Sắp xếp tên giảm dần
        System.out.println("\nDanh sách cán bộ sắp xếp tên giảm dần:");
        manager.sortByName(-1);
        manager.print();

        scanner.close();
    }
}

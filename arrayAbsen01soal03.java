import java.util.Scanner;
public class arrayAbsen01soal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
                "nasi goreng",
                "mie goreng",
                "roti bakar",
                "mie ayam spesial",
                "es teh",
                "kopi",
                "mie ayam"
        };
        System.out.print("Masukkan nama makanan : ");
        String key = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Makanan tersedia di menu.");
        } else {
            System.out.println("makanan tidak ada di menu.");
        }
    }
}

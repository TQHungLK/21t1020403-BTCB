import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lc;
        do{
            System.out.println("---------------------MENU--------------------");
            System.out.println("Nhan 1:Phuong Trinh Bac 2");
            System.out.println("Nhan 2:Giai Thua");
            System.out.println("Nhan 3:So Fibonaci");
            System.out.println("Nhan 4:Tim UCLN va BCNN");
            System.out.println("Nhan 5:Liet ke cac so nguyen to nho hon n");
            System.out.println("Nhan 6:Liet ke n so nguyen to dau tien");
            System.out.println("Nhan 7:Liet ke cac so nguyen to co 5 chu so");
            System.out.println("Nhan 8:Tong cac chu so cua mot so nguyen");
            System.out.println("Nhan 9:So thuan nghich");
            System.out.println("Nhan 10:Liet ke so fibonaci nho hon n la so nguyen to");
            System.out.println("Nhan 0:Thoat chuong trinh.");
            System.out.println("---------------------------------------------");
            System.out.print("Lua chon thao tac: ");
            lc=Main.scanner.nextInt();
            System.out.println("---------------------------------------------");
            switch(lc){
                case 1:
                    System.out.println("[1]:Phuong Trinh Bac 2");
                    System.out.print("Nhap a: ");
                    float a = Main.scanner.nextFloat();
                    System.out.print("Nhap a: ");
                    float b = Main.scanner.nextFloat();
                    System.out.print("Nhap a: ");
                    float c = Main.scanner.nextFloat();
                    BTCB.Bai1(a, b, c);
                    break;
                case 2:
                    System.out.println("[2]:Giai Thua");
                    System.out.print("Nhap n: ");
                    int n=Main.scanner.nextInt();
                    System.out.print("Giai thua cua n la: ");
                    System.out.println(BTCB.Bai2(n));
                    break;
                case 3:
                    System.out.println("[3]:So Fibonaci");
                    System.out.print("Nhap n: ");
                    int z=Main.scanner.nextInt();
                    System.out.print("So fibonaci thu n la: ");
                    System.out.println(BTCB.Bai3(z));
                    break;
                case 4:
                    System.out.println("[4]:Tim UCLN va BCNN");
                    System.out.print("Nhap so thu nhat: ");
                    long e=Main.scanner.nextLong();
                    System.out.print("Nhap so thu hai: ");
                    long f=Main.scanner.nextLong();
                    System.out.print("UCLN cua 2 so la: ");
                    System.out.println(BTCB.Bai4(e, f));
                    System.out.print("BCNN cua 2 so la: ");
                    System.out.println(BTCB.Bai4b(e, f));
                    break;
                case 5:
                    System.out.println("[5]:Liet ke cac so nguyen to nho hon n");
                    System.out.print("Nhap n: ");
                    int y=Main.scanner.nextInt();
                    System.out.print("Cac so nguyen to nho hon n la: ");
                    System.out.println(BTCB.Bai5(y));
                    break;
                case 6:
                    System.out.println("[6]:Liet ke n so nguyen to dau tien");
                    System.out.print("Nhap n: ");
                    int m=Main.scanner.nextInt();
                    System.out.print("n cac so nguyen to dau tien la: ");
                    System.out.println(BTCB.Bai6(m));
                    break;
                case 7:
                    System.out.println("[7]:Liet ke cac so nguyen to co 5 chu so");
                    System.out.print("Nhap so co 5 chu so: ");
                    int l=Main.scanner.nextInt();
                    System.out.print("Cac so nguyen to co 5 chu so la: ");
                    System.out.println(BTCB.Bai7(l));
                    break;
                case 8:
                    System.out.println("[8]:Tong cac chu so cua mot so nguyen");
                    System.out.print("Nhap so nguyen: ");
                    int u=Main.scanner.nextInt();
                    System.out.print("Tong la: ");
                    System.out.println(BTCB.Bai8(u));
                    break;
                case 9:
                    System.out.println("[9]:So thuan nghich");
                    System.out.print("Nhap so nguyen co 6 chu so: ");
                    int k=Main.scanner.nextInt();
                    System.out.print("Day cac so thuan nghich co 6 chu so la: ");
                    System.out.println(BTCB.Bai9(k));
                    break;
                case 10:
                    System.out.println("[10]:Liet ke so fibonaci nho hon n la so nguyen to");
                    System.out.print("Nhap so tu nhien n: ");
                    int o=Main.scanner.nextInt();
                    System.out.print("Cac so fibonaci nho hon n la so nguyen to la: ");
                    System.out.println(BTCB.bai10(o));
                    break;
                case 0: break;

            }
        }while(lc!=0);
    }
}
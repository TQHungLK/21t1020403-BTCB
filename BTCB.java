public class BTCB {
    /*
     * 
     */
    public static void Bai1(float a, float b, float c) {
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("Phuong Trinh Vo nghiem");
        }
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("Pt co vo so nghiem");
        }
        double denta = Math.pow(b, 2) - 4 * a * c;
        if (denta < 0) {
            System.out.println("Phuong Trinh Vo nghiem");
        }
        if (denta == 0) {
            double x = (-b) / (2 * a);
            System.out.print("Phuong trinh co nghiem kep: ");
            System.out.format("%.4f%n", x);
        }
        if (denta > 0) {
            double x1 = ((-b) + Math.sqrt(denta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(denta)) / (2 * a);
            System.out.print("Nghiem thu nhat: ");
            System.out.format("%.4f%n", x1);
            System.out.print("Nghiem thu hai: ");
            System.out.format("%.4f%n", x2);
        }
    }
    public static long Bai2(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else
            return Bai2(n - 2) * n;
    }
    public static long Bai3(int z){
        long f0=0,f1=1,f2=1;
        if(z<1){
            return 0;
        }
        for(int i=2;i<=z;i++){
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        return f2;
    }
    public static long Bai4(long e, long f){
        while (e != f){ 
            if (e > f){
                e -= f; 
            }else{
                f -= e;
            }
        }
        return e; 
    }
    public static long Bai4b(long e, long f){
        return e*f/Bai4(e, f);
    }
    public static boolean snt(Integer n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static String Bai5(int y){
        String rs="";
        for(int i=2;i<y;i++){
            if(snt(i)==true)
                rs = rs + i + "_";
        }
        return rs;
    }
    public static String Bai6(int m){
        String r="";
        for(int i=2;i<=m;i++){
            if(snt(i)==true)
                r = r + i + "_";
        }
        return r;
    }
    public static int kt(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static String Bai7(int l){
        String r="";
        for(int i=2;i<=l;i++){
            if(snt(i) && kt(i)==5)
                r = r + i+"_";
        }
        return r;
    }
    public static int Bai8(int u){
        int t=0;
        int sd;
        while(u!=0){
            sd=u%10;
            t=t+sd;
            u=u/10;
        }
        return t;
    }
    public static int kttn(int k){
        int tmp;
        int res=0;
        while(k>0){
            tmp=k%10;
            res=res*10+tmp;
            k=k/10;
        }
        return res;
    }
    public static String Bai9(int k){
        String f="";
        for(int i=0;i<k;i++){
            if(kt(i)==6){
                if(i==kttn(i)){
                    f=f+kttn(i)+"_";
                }
            }
        }
        return f;
    }
    public static String bai10(int o){
        String f="";
        for(int i=2;i<o;i++){
            if(Bai3(i)<o){
                if(snt(i)){
                    f=f+Bai3(i)+"_";
                }
            }
        }
        return f;
    }
}

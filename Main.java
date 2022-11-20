public class Main {
    public static void main(String[] args){
        
        Integer pilihan = 0;
//        Integer noTlp,jml_ank;
//        String nama, nik, alamat,status;
//        String job;
        Pendataan p = new Pendataan();
        
        
        System.out.println("========================================");
        System.out.println("Pendataan dan Pembayaran Iuran warga");
        System.out.println("========================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("");
        System.out.print("PILIHAN MENU: ");
        pilihan = sc.nextInt();
        System.out.println("----------------------------------------");
        
        if(pilihan == 1){
            
            System.out.println("* Data Warga *");
            System.out.println("Masukan Nama: ");
            p.nama = s.nextLine();
            System.out.println("Masukan Nik: ");
            p.nik = s.nextLine();
            System.out.println("Masukan Alamat: ");
            p.alamat= s.nextLine();
            System.out.println("Masukan No.Tlp; ");
            p.noTlp = s.nextInt();
            System.out.println("-------------------------------------");
            System.out.println("* Data Pekerjaan *");
            System.out.println("Masukan Pekerjaan: ");
            p.job = s.nextLine();
            System.out.println("Masukan Alamat Kantor: ");
            p.alamat = s.nextLine();
            System.out.println("-------------------------------------");
            System.out.println("* Data Status *");
            System.out.println("Masukan Nama Suami/Istri");
            p.nama = s.nextLine();
            
            
            
        }  
    }
}
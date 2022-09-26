public class survey {
    public static void main(String[] args) {
        //Head
        String bio = "BIODATA";
        System.out.println(bio);

        //nama lengkap
        String namaDepan = "KIKI";
        String namaBelakang = "HAERANI";
        String namaLengkap = namaDepan+" "+namaBelakang;
        System.out.println("Nama Lengkap : "+namaLengkap);

        //tempat tanggal lahir
        String tem = "PUYUNG";
        int tgl = 23;
        int bln = 02;
        int thn = 2000;
        System.out.println("TTL : "+tem+"/"+tgl+"/"+bln+"/"+thn);

        //umur
        int tahuna = 2000;
        int tahunb = 2022;
        int umur = 2022-2000;
        System.out.println("Umur : "+umur+" Tahun");

        //jenis kelamin
        char jk = 'P';
        System.out.println("Jenis Kelamin : "+jk);

        //alamat
        String alamat = "Dusun Bangket Tengak, Desa Puyung, Kecamatan Jonggat";
        System.out.println("Alamat : "+alamat);

        //pendidikan
        String sd = "Sekolah Dasar Negeri 1 Waker";
        String smp = "MTS NW Puyung";
        String smk = "SMKN 1 Kuripan";
        String kuliah1 = "AKN(Akademi Komunitas Negri) Lombok Barat";
        String kuliah2 = "STMIK Lombok";
        System.out.println("Riwayat Pendidikan");
        System.out.println("Sekolah Dasar : "+sd);
        System.out.println("Sekolah Menengah Pertama : "+smp);
        System.out.println("Sekolah Menengah Kejuruan : "+smk);
        System.out.println("Sekolah Tinggi : "+kuliah1);
        System.out.println("Sekolah Tinggi : "+kuliah2);


    }



}

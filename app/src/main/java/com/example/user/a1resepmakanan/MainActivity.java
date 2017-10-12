package com.example.user.a1resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView judulresep;
    TextView Deskripsi;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        judulresep=(TextView)findViewById(R.id.resep);
        Deskripsi=(TextView)findViewById(R.id.desk);
        recyclerView=(RecyclerView)findViewById(R.id.Recycler);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[] title={"Lontong","olos","sambal","soto tegal","sayur asem"};
        String[] deskrip={"Lontong adalah makanan khas yang berkembang di pulau jawa, makanan yang terbuat dari berasa yang dibungkus daun pisang dan dikukus selama beberapa jam",
                "olos adalah gorengan berbentuk bulat khas tegal yang dibuat dari tepung kanji yang dicampur tepung terigu dan didalamnya ada campuran sayur kol dan cabai",
        "sambal adalah saus pedas yang bahan utamanya adalah cabai yang dihaluskan",
        "soto yang mempunyai ciri khas tegal, seperti soto pada umumnya soto tegal mempunyai ciri khas terdapat tauco nya",
        "sayur khas indonesia"};
        String[] judulbarr={"Lontong","Olos","Sambal","Soto Tegal","Sayur Asem"};
        String[] detailres={"5 porsi \n" +
                "1.\t1 papan tempe, iris kecil kemudian rebus sebentar. sisihkan \n" +
                "2.\tbumbu uleg: \n" +
                "3.\t5 siung bawang merah \n" +
                "4.\t2 siung bawang putih \n" +
                "5.\t2 cm kunyit,bakar \n" +
                "6.\t2 butir kemiri \n" +
                "7.\t1 sdt ketumbar butiran \n" +
                "8.\tsecukupnya terasi yg sdh digoreng/bakar \n" +
                "9.\tsecukupnya garam dan gula \n" +
                "10.\tkeprek : \n" +
                "11.\t1 batang sereh \n" +
                "12.\t2 cm lengkuas \n" +
                "13.\t2 buah daun salam \n" +
                "14.\tsantan : \n" +
                "15.\t200 ml santan kental \n" +
                "16.\t700 ml santan encer \n" +
                "17.\tsambal: \n" +
                "18.\t4 buah cabe merah besar+4 buah cabe rawit merah+1 bawang putih+1bawang merah \n" +
                "Langkah\n" +
                "1.\tSiapkan tempe potong kecil dan rebus sebentar, sisihkan\n" +
                "2.\tUleg bumbu halus hingga rata,kemudian tumis hingga harum masukkan juga lengkuas daun salam dan sereh masak hingga matang\n" +
                "3.\tKemudian masukkan santan encer tunggu hingga mendidih kemudian masukkan tempe masak hingga agak susut\n" +
                "4.\tKemudian masukkan santan kental,beri garam dan gula. tes rasa\n" +
                "5.\tSambal merah: goreng ulekan cabe dan bawang beri air sedikit, gula dan garam\n" +
                "6.\tSajikan dengan pelengkap lontong/kupat, telur rebus dan kerupuk mie. selamat menikmati...\n","1.\t150 grm tepung kanji \n" +
                "2.\t75 grm tepung terigu \n" +
                "3.\tsecukupnya kol \n" +
                "4.\tsesuai selera cabe (tergantung suka pedes apa enggak) \n" +
                "5.\tsecukupnya air panas \n" +
                "6.\tbumbu : \n" +
                "7.\t6 siung bawang putih \n" +
                "8.\t1 bungkus merica bubuk \n" +
                "9.\t1 bungkus royco \n" +
                "10.\tsecukupnya garam \n" +
                "11.\t1/2 sdm gula pasir \n" +
                "12.\tsecukupnya minyak goreng (untuk menggoreng) \n" +
                "Langkah\n" +
                "1.\tHaluskan 3 siung bawang, dan cabe putih, bersihkan kol dan iris seperti bikin isian tahu isi. Note (boleh di tambah irisan cabe hijau)\n" +
                "2.\tSiapkan wajan dan goreng bumbu sampai harum. Masukkan irisan kol. Masak sampai layu. Tambahka setengah bungkus merica bubuk\n" +
                "3.\tSiapkan wadah. Masukkan tepung. Masukkan air panas sedikit demi sedikit. Aduk dengan sendok, kalo sudah bisa di tekan2 pakai tangan uleni seperti bikin cilok. Uleni sampai kalis ya bun\n" +
                "4.\tAmbil sedikit adonan bulat dan pipihkan. Isi dengan isian kol tadi dan bentuk bulat2. Lakukan sampai adonan habis\n" +
                "5.\tSiapkan wajan untuk menggoreng, goreng dengan api kecil ya. Masukkan dan goreng sampai matang.\n" +
                "6.\tSelamat mencoba\n","1-5 porsi \n" +
                "1.\t15 buah cabai merah besar \n" +
                "2.\t20 buah cabai keriting orange \n" +
                "3.\t3 buah bawang putih \n" +
                "4.\t4 buah bawang merah \n" +
                "5.\t1/2 bungkus terasi bakar \n" +
                "6.\t1/2 sdt mecin \n" +
                "7.\t1 sdt garam \n" +
                "8.\t1 sdm gula \n" +
                "9.\t5 sdm minyak goreng untuk menumis \n" +
                "10.\tsecukupnya air untuk rebus cabai dkk \n" +
                "11.\t1 buah tomat \n" +
                "Langkah\n" +
                "1-15 menit \n" +
                "1.\tRebus tomat. Bawang merah. Bawang putih. Cabai rawit. Cabai merah besar\n" +
                "2.\tSiapkan cobek. Ulek semua bumbu yang sudah di rebus.\n" +
                "3.\tJika sudah halus kasar. Masukan bumbu pelengkap (garam. Mecin. Gula)\n" +
                "4.\tSiapkan wajan dan minyak. Tumis bumbu yang sudah di ulek tadi goreng goreng sampai harum dan menyusut. Tes rasa.\n" +
                "5.\tJika sudah. masukan ke tempat sambal. Jika mo di makan untuk waktu lama. Sebaiknya di awetkan di freezer ya bunda.\n" +
                "6.\tSelamat mencoba\n","1.\tsesuai selera Daging ayam / daging sapi \n" +
                "2.\tBumbu kuah haluskan : \n" +
                "3.\t2 siung bawang merah \n" +
                "4.\t2 siung bawang putih \n" +
                "5.\t1/2 butir kemiri sangrai \n" +
                "6.\tSecukupnya lada bubuk \n" +
                "7.\t1 batang sereh geprek \n" +
                "8.\t1 lembar daun salam \n" +
                "9.\tSecukupnya kaldu bubuk \n" +
                "10.\tSecukupnya garam \n" +
                "11.\tBumbu tauco haluskan : \n" +
                "12.\t8 buah cabe merah (campur rawit di rebus) \n" +
                "13.\t2 siung bawang merah \n" +
                "14.\t2 siung bawang putih \n" +
                "15.\t5 sendok tauco \n" +
                "16.\tsecukupnya Gula, garam \n" +
                "17.\tPelengkap \n" +
                "18.\t1 bgks Soun (siram air panas) \n" +
                "19.\t1 genggam Toge (siram air panas) \n" +
                "20.\t1 batang Daun bawang \n" +
                "21.\tsesuai selera Bawang goreng \n" +
                "22.\tsesuai selera Bakso \n" +
                "Langkah\n" +
                "1.\tRebus daging ayam /sapi\n" +
                "2.\tTumis bumbu kuah sampai wangi masukan ke dalam rebusan daging\n" +
                "3.\tTumis bumbu tauco, masukan tauco\n" +
                "4.\tTata di mangkok bihun, toge, tauco, ayam suwir, daun bawang, bawang goreng kuah\n","1.\tSayuran utama (porsinya sesuai selera) : \n" +
                "2.\tJagung manis atau jagung putren \n" +
                "3.\tLabu siam \n" +
                "4.\tKacang panjang atau buncis \n" +
                "5.\tDaun melinjo \n" +
                "6.\tSayuran tambahan : \n" +
                "7.\tWortel \n" +
                "8.\tsesuai selera atau sayuran lain \n" +
                "9.\t3 buah asem belimbing besar atau asem kandis \n" +
                "10.\t1 lbr daun salam \n" +
                "11.\tSedikit lengkuas yang dikeprek \n" +
                "12.\tBumbu : \n" +
                "13.\t1 butir kemiri \n" +
                "14.\t2 siung bawang merah besar \n" +
                "15.\tSecukupnya : garam, penyedap rasa, gula/ micin \n" +
                "16.\tNB : pemakaian penyedap rasa dan gula/micin (optional) \n" +
                "17.\t500 ml air \n" +
                "Langkah\n" +
                "20 menit \n" +
                "1.\tBersihkan dan potong sayuran sesuai selera.\n" +
                "2.\tRebus air dengan panci hingga mendidih. Jika sudah mendidih, masukkan asem belimbing, jagung, labu siam, wortel (untuk asemnya rebus selama 7 menit atau sampai lunak).\n" +
                "3.\tSambil menunggu asemnya lunak, haluskan kemiri, bawang merah, dan garam dengan menggunakan cobek. Setelah asemnya lunak, tambahkan asem ke bumbu halus tersebut dan uleg sampai halus.\n" +
                "4.\tMasukkan kacang panjang/ buncis, daun melinjo, serta bumbu yang telah dihaluskan ke dalam panci. Tambahkan penyedap rasa dan gula/ micin sesuai selera. Masak hingga matang.\n"};
        int[] gambr={R.drawable.lontong,R.drawable.olos,R.drawable.sambel,R.drawable.soto,R.drawable.sayurasem};


        ArrayList<resep> resepbaru=new ArrayList<>();

        for (int i=0;i<title.length;i++){
            resep masakan = new resep(title[i],deskrip[i],judulbarr[i],gambr[i],detailres[i]);
            resepbaru.add(masakan);
        }
        Adapter adapter=new Adapter(this,resepbaru);
        recyclerView.setAdapter(adapter);
    }
}

package geometri;

public class PersegiPanjang {
     //membuat variabel
    private double panjang,lebar;
    
    //membuat constructor
    public PersegiPanjang (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    double setLuas(){
        return panjang * lebar;
    }
    
    double setKeliling(){
        return 2*(panjang+lebar);
    }
    
    public static void main(String[] args) {
        PersegiPanjang luas = new PersegiPanjang(4,8);
        PersegiPanjang keliling = new PersegiPanjang(4,8);
        
        System.out.println("Hasil Luas Persegi Panjang = "+luas.setLuas());
        System.out.println("Hasil Keliling Persegi Panjang = "+luas.setKeliling());
        
    }
}

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
}

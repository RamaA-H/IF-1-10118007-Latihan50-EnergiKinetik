
package EnergiKinetik;

public class Energi {
    
  private double massa;
  private double kecepatan;
  private double kecepatanAwal;
  private double kecepatanAkhir;
  

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public void setKecepatanAkhir(double kecepatanAkhir) {
        this.kecepatanAkhir = kecepatanAkhir;
    }

    
  
   
    public double hitungEnergiKinetik(double massa, double kecepatan) {
      
        return 0.5 * massa * kecepatan * kecepatan ;
        
    }
    
     public double hitungUsaha(double kecepatanAwal, double kecepatanAkhir) {
     
    double ekAwal,ekAkhir,hasil;
    
    ekAwal = 0.5 * massa * kecepatanAwal * kecepatanAwal  ;
    ekAkhir = 0.5 * massa * kecepatanAkhir * kecepatanAkhir  ;
    hasil = ekAkhir - ekAwal;
        
    return hasil ;
    }
    
}

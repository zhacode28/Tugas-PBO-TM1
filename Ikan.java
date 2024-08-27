/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
class Ikan extends Hewan {
    private String berkembangbiak;
  
    
    public Ikan() {
        System.out.println("Saya adalah ikan");
    }
    
     @Override
    public void gerak() {
        System.out.println("Saya bergerak dengan cara Berenang");
    }
    public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
    
}

    


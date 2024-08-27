/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */

class Monokotil extends Tumbuhan {
    private String berkembangbiak;
  
    public Monokotil() {
        System.out.println("Saya adalah tumbuhan monokotil");
    }
      @Override
    public void gerak() {
        System.out.println("Saya bergerak secara pasif");
    }
    
    public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
    
}


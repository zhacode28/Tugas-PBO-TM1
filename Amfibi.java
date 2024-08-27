/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
class Amfibi extends Hewan {
    private String berkembangbiak;
   
    public Amfibi() {
        System.out.println("Saya adalah amfibi");
    }
    
     @Override
    public void gerak() {
        System.out.println("Saya bergerak dengan cara melompat");
    }
    
     public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
    
    
}


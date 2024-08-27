/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
class Mamalia extends Hewan {
    private String berkembangbiak;
    
    
    public Mamalia() {
        System.out.println("Saya adalah mamalia");
    }
   
     @Override
    public void gerak() {
        System.out.println("Saya bergerak dengan cara Berpegangan di ranting pohon");
    }
    
    public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
}


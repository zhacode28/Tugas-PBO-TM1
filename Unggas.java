/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
class Unggas extends Hewan {
    private String berkembangbiak;
    
    public Unggas() {
        System.out.println("Saya adalah unggas");
    }

    @Override
    public void gerak() {
        System.out.println("Saya bergerak dengan cara Terbang");
    }
    
    public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
class Reptil extends Hewan {
    private String berkembangbiak;
    
    public Reptil() {
        System.out.println("Saya adalah reptil");
    }

     @Override
    public void gerak() {
        System.out.println("Saya bergerak dengan cara Merayap");
    }
    
    public String getBerkembangbiak() {
        return berkembangbiak;
    }

    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
}


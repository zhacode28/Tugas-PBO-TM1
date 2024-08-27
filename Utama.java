/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg2;

/**
 *
 * @author zahidahhanumalzahra
 */
public class Utama {
    public static void main(String[] args) {
      
        // Contoh Hewan
        Mamalia koala = new Mamalia();
        System.out.println("Nama saya Koala");
        koala.setPemakan("Daun");
        koala.setBerkembangbiak("melahirkan"); 
        System.out.println("Saya berkembang biak dengan cara " + koala.getBerkembangbiak());
        System.out.println("Saya adalah pemakan " + koala.getPemakan());
        koala.gerak();
        System.out.println();

        
        Reptil buaya = new Reptil();
        System.out.println("Nama saya Buaya");
        buaya.setPemakan("Daging");
        buaya.setBerkembangbiak("bertelur"); 
        System.out.println("Saya berkembang biak dengan cara " + buaya.getBerkembangbiak());
        System.out.println("Saya adalah pemakan " + buaya.getPemakan());
        buaya.gerak();
        System.out.println();
        
        
        
        Unggas elang = new Unggas();
        System.out.println("Nama saya Elang");
        elang.setPemakan("Daging");
        elang.setBerkembangbiak("bertelur"); 
        System.out.println("Saya berkembang biak dengan cara " + elang.getBerkembangbiak());
        System.out.println("Saya adalah pemakan " + elang.getPemakan());
        elang.gerak();
        System.out.println();
        
        
        Ikan nemo = new Ikan();
        System.out.println("Nama saya Nemo:");
        nemo.setPemakan("Alga");
        nemo.setBerkembangbiak("bertelur"); 
        System.out.println("Saya berkembang biak dengan cara " + nemo.getBerkembangbiak());
        System.out.println("Saya adalah pemakan " + nemo.getPemakan());
        nemo.gerak();
        System.out.println();
        

        Amfibi katak = new Amfibi();
        System.out.println("Nama saya Katak:");
        katak.setPemakan("Serangga");
        katak.setBerkembangbiak("bertelur"); 
        System.out.println("Saya berkembang biak dengan cara " + katak.getBerkembangbiak());
        System.out.println("Saya adalah pemakan " + katak.getPemakan());
        katak.gerak();
        System.out.println();

        
        Monokotil padi = new Monokotil();
        System.out.println("Nama saya Oryza");
        padi.setAkar("Serabut");
        padi.setBerkembangbiak("generatif"); 
        System.out.println("Saya berkembang biak dengan cara " + padi.getBerkembangbiak());
        padi.gerak();
        System.out.println("Saya memiliki akar " + padi.getAkar());
        System.out.println();
        
        
        Dikotil jambu = new Dikotil();
        System.out.println("Nama saya Jambu");
        jambu.setAkar("Tanggung");
        jambu.setBerkembangbiak("generatif"); 
        System.out.println("Saya berkembang biak dengan cara " + jambu.getBerkembangbiak());
        jambu.gerak();
        System.out.println("Saya memiliki akar " + jambu.getAkar());
    }
}

    
    

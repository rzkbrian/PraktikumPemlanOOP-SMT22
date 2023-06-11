/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAP;

import UAP.HargaTiket;

/**
 *
 * @author USER
 */
abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    private String nama;

    public TiketKonser(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

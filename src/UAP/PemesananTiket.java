/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAP;




/**
 *
 * @author USER
 */
class PemesananTiket {
    // Do your magic here...
    public static TiketKonser pilihTiket(int choice) throws InvalidInputException {
        switch (choice) {
            case 0:
                return new CAT8();
            case 1:
                return new CAT1();
            case 2:
                return new FESTIVAL();
            case 3:
                return new VIP();
            case 4:
                return new VVIP();
            default:
                throw new InvalidInputException("Pilihan tiket tidak valid!");
        }
    }
}

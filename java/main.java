public class Main {
public static void main(String[] args) {

```
    // Instansiasi objek valid
    Mobil mobil1 =
            new Mobil("Toyota");

    System.out.println("\n------>> Objek mobil1 <<------");
    System.out.println("Merk objek mobil1 : " + mobil1.merk);

    // Assignment properties/field/atribut
    mobil1.mesin = "1500 CC";
    mobil1.aksi = "Berjalan";
    mobil1.rem = "Rem ABS";

    // Operasi sah
    mobil1.jalan();
    mobil1.pengereman();


    // Objek kedua
    Mobil mobil2 =
            new Mobil("Honda");

    System.out.println("\n------>> Objek mobil2 <<------");
    System.out.println("Merk objek mobil2 : " + mobil2.merk);

    // Assignment atribut
    mobil2.mesin = "2000 CC";
    mobil2.aksi = null;
    mobil2.rem = "Rem Cakram";

    // Operasi tidak sah karena aksi bernilai null
    try {
        mobil2.jalan();
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    // Operasi pengereman tetap sah karena rem memiliki nilai
    mobil2.pengereman();
}
```

}

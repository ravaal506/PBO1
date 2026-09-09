public class Mobil {
private String merk;
private String mesin;
private String aksi;
private String rem;

```
// Constructor
public Mobil(String merk) {
    this.merk = merk;
    this.mesin = null;
    this.aksi = null;
    this.rem = null;
}

// Setter mesin
public void setMesin(String mesin) {
    this.mesin = mesin;
}

// Setter aksi
public void setAksi(String aksi) {
    this.aksi = aksi;
}

// Setter rem
public void setRem(String rem) {
    this.rem = rem;
}

// Getter merk
public String getMerk() {
    return merk;
}

// Method jalan
public void jalan() {
    if (mesin == null || aksi == null) {
        throw new IllegalArgumentException(
            "Mesin dan aksi tidak boleh null saat mobil berjalan."
        );
    }

    System.out.println("Mobil " + merk + 
                       " dengan mesin " + mesin + 
                       " sedang " + aksi + ".");
}

// Method pengereman
public void pengereman() {
    if (rem == null) {
        throw new IllegalArgumentException(
            "Informasi rem tidak boleh null saat pengereman."
        );
    }

    System.out.println("Mobil " + merk + 
                       " melakukan pengereman menggunakan " + rem + ".");
}
```

}

<?php

class Mobil {

    // Properties / Field / Atribut
    public $merk;
    public $mesin;
    public $aksi;
    public $rem;

    // Constructor
    public function __construct($merk) {
        $this->merk = $merk;
    }

    // Method jalan
    public function jalan() {

        // Invariant: mesin dan aksi tidak boleh null
        if ($this->mesin === null || $this->aksi === null) {
            throw new InvalidArgumentException(
                "Mesin dan aksi tidak boleh null saat method jalan() dipanggil."
            );
        }

        echo "\n------>> Mobil Sedang Berjalan <<------\n";
        echo "Merk  : " . $this->merk . "\n";
        echo "Mesin : " . $this->mesin . "\n";
        echo "Aksi  : " . $this->aksi . "\n";
    }

    // Method pengereman
    public function pengereman() {

        // Invariant: rem tidak boleh null
        if ($this->rem === null) {
            throw new InvalidArgumentException(
                "Rem tidak boleh null saat method pengereman() dipanggil."
            );
        }

        echo "\n------>> Mobil Melakukan Pengereman <<------\n";
        echo "Merk : " . $this->merk . "\n";
        echo "Rem  : " . $this->rem . "\n";
    }
}

?>

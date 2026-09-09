<?php

require_once "Mobil.php";

// Instansiasi objek valid
$mobil1 = new Mobil("Toyota");

echo "\n------>> Objek mobil1 <<------\n";
echo "Merk objek mobil1 : " . $mobil1->merk . "\n";

// Assignment properties / field / atribut
$mobil1->mesin = "1500 CC";
$mobil1->aksi = "Berjalan";
$mobil1->rem = "Rem ABS";

// Operasi sah
$mobil1->jalan();
$mobil1->pengereman();


// Objek kedua
$mobil2 = new Mobil("Honda");

echo "\n------>> Objek mobil2 <<------\n";
echo "Merk objek mobil2 : " . $mobil2->merk . "\n";

// Assignment atribut
$mobil2->mesin = "2000 CC";
$mobil2->aksi = null;
$mobil2->rem = "Rem Cakram";

// Operasi tidak sah karena aksi bernilai null
try {
    $mobil2->jalan();
} catch (InvalidArgumentException $e) {
    echo "\n" . $e->getMessage() . "\n";
}

// Operasi pengereman tetap sah karena rem memiliki nilai
$mobil2->pengereman();

?>

# JAVA Kisállatverseny  

Az elképzelt feladat egy kisállatverseny folyamatát mutatja be. Az állatversenyen különböző fajtájú állatok indulhatnak, amiket különböző osztállyal jelölünk. A versenyre névvel lehet jelentkezni. A különböző állatok eltérő idő alatt, eltérő sebeséggel képesek megtenni a távot.
Ha egy állat elfárad kiszállhat a versenyzésből. Egy versenyen alapértelmezetten 5 állat vehet részt, de ettől eltérő számú állat is indulhat. Ha kiszáll a versenyzésből egy állat, ki kell venni a résztvevők közül, illetve jelezzük azt is, ha betelt az indulók száma, de máshogy nem kell foglalkozni ezzel az esettel. 


A verseny útvonala több szakaszból áll, ami lehet erdős, bokros, sík, hegyes, ezek enumban vannak tárolva. 

Nyúl legyen gyors sík tere
A borz és a róka az erdős-mezős terepen
A borz a legkitartóbb. A nyúl a legkevésbé (viszont gyors!)

Minden fajta állatnak van egy alap kitartása, mely fajtánként változik.


A  verseny maga pályán halad végig, mely szakaszból és az egyes szakaszok véletlen szerűen követik egymást. Az egyes szakaszok típusát (erdo, mezo, dombos, hegyes)  enumokban tároljuk.

Mindegyik állat rendelekzik egy kitartás tulajdonsággal, melyek az egyes szakaszokon  egy random értékkel állítunk be, amely ha eléri a nullát az adott állat feladja a versenyt. 

Ha erdőtűz alakul ki a verseny véget ér és a versenyben részt vevő állatok mind abbahagyják a versenyzést. Később új versenyre nevezhetnek majd be. A program kiírja a versenyben maradt állatok listáját és az elért helyezésüket is.   


## Továbbfejlesztési lehetőségek:
A verseny útvonala eltérő felületű szakaszokból áll. Például 2 méter erdős rész, aztán 5 méter kavicsos, utána 1 méter pocsolyás felület. Ezek a szakaszok befolyásolhatják az egyes állatok sebességét.  
Illetve van olyan állat is melyik nem képes megtenni az adott szakaszt, ekkor az adott állat kiesik a versenyből.

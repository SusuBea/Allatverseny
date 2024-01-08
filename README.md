# JAVA Kisállatverseny  

Az elképzelt feladat egy kisállatverseny folyamatát mutatja be. A versenyen különböző fajtájú állatok indulhatnak, melyeket különböző osztállyal jelöltem. A versenyre névvel lehet jelentkezni. A különböző állatok eltérő idő alatt, eltérő sebeséggel képesek megtenni a távot. Ha egy állat elfárad(elfogy a kitartása) kiszállhat a versenyzésből. Egy versenyen alapértelmezetten 5 állat vehet részt, de ettől eltérő számú állat is indulhat. Ha egy állat kiszáll a versenyből, ki kell venni a résztvevők közül, illetve jelezzük azt is, ha betelt az indulók száma. 

A  verseny maga egy pályán halad végig, mely szakaszból áll, az egyes szakaszok véletlen szerűen követik egymást. Az egyes szakaszok típusát (erdo, mezo, dombos, hegyes)  enumokban tároltam.
Mindegyik állat rendelekzik egy kitartás tulajdonsággal, melyet az egyes szakaszokon egy random értékkel állítok be, mely ha eléri a nullát az adott állat feladja a versenyt. 

Ha erdőtűz alakul ki a verseny véget ér és a versenyben részt vevő állatok mind abbahagyják a versenyzést. Később új versenyre nevezhetnek majd be. A verseny végén a program kiírja a versenyben maradt állatok listáját és azt, hogy ki nyerte a versenyt.   

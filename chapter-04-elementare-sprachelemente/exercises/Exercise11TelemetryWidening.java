/**
 * EXERCICE 11 - Telemetrie-Werte sicher erweitern
 * ==============================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein kleiner Sensor liefert einen `byte`-Zaehler. Spaetere Verarbeitungsschritte brauchen groessere Zahlentypen, ohne dass explizite Casts noetig sein sollen.
 *
 * Notions du cours :
 * Widening-Konvertierung `byte -> short -> int -> long -> double`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Baue die Erweiterungskette ohne Cast und bewahre den Wert 100.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du stellst denselben kleinen Gegenstand nacheinander in groessere Kisten. In jede groessere Kiste passt er ohne Abschneiden.
 *
 * -- Essayons a la main --
 * 100 bleibt 100, egal ob byte, short, int, long oder double; am Ende wird es als 100.0 dargestellt.
 *
 * -- Le plan --
 * 1. Starte mit `byte b = 100`.
 * 2. Weise nach `short` zu.
 * 3. Dann nach `int`.
 * 4. Dann nach `long`.
 * 5. Dann nach `double` und pruefe 100.0.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Kette ist bewusst linear, damit jede Konvertierungsstufe sichtbar bleibt.
 *
 * Exemples a verifier :
 * - byte 100 -> double 100.0
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - In dieser Richtung ist kein expliziter Cast notwendig.
 * - Schreibe jede Stufe in eine eigene Variable.
 */
void main() {
    byte b = 100;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Wert bleibt 100", d == 100.0);
    ExerciseChecker.summary();
}

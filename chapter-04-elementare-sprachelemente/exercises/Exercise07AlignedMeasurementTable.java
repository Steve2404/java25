/**
 * EXERCICE 07 - Messwerttabelle sauber ausrichten
 * ==============================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Konsolenreport zeigt drei Spannungen. Die Zahlen sollen in gleich breiten Spalten stehen, damit ein Techniker sie schnell vergleichen kann.
 *
 * Notions du cours :
 * `IO.printf`, Feldbreite, Linksbuedigkeit/Rechtsbuendigkeit, Praezision.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Gib drei Werte in 10 Zeichen breiten Feldern mit je drei Nachkommastellen aus.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Stell dir drei gleich breite Kaestchen vor. Jede Zahl bekommt ein Kaestchen, auch wenn sie unterschiedlich viele Ziffern hat.
 *
 * -- Essayons a la main --
 * 1.2 wird als 1.200 gezeigt; 12.3456 wird auf 12.346 gerundet.
 *
 * -- Le plan --
 * 1. Lege drei `double`-Messwerte an.
 * 2. Waehle Feldbreite 10.
 * 3. Waehle drei Nachkommastellen.
 * 4. Gib alle drei in einer Zeile aus.
 * 5. Pruefe, dass die Quelldaten nicht veraendert wurden.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Tabelle ist eine reine Darstellungsaufgabe.
 *
 * Exemples a verifier :
 * - 1.2 -> 1.200
 * - 12.3456 -> 12.346
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `%10.3f` reserviert 10 Zeichen und zeigt drei Nachkommastellen.
 * - Mehrere Formatbezeichner koennen in einem Formatstring stehen.
 */
void main() {
    double u1 = 1.2;
    double u2 = 12.3456;
    double u3 = 0.0049;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Quelldaten bleiben erhalten", u2 == 12.3456);
    ExerciseChecker.summary();
}

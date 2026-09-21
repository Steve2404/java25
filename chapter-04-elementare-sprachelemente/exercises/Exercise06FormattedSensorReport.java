/**
 * EXERCICE 06 - Sensorbericht mit fester Genauigkeit
 * =================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Laborsensor liefert 23.67891 Grad. Im Bericht sollen exakt zwei Nachkommastellen erscheinen.
 *
 * Notions du cours :
 * `IO.printf`, Formatbezeichner, Nachkommastellen.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Gib den Messwert als `Temperatur: 23.68 C` mit `printf` aus.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Der Sensor kennt viele Stellen. Der Bericht soll aber nur zwei zeigen. Das ist wie ein Lineal, auf dem du nur bis zu einer bestimmten Genauigkeit abliest.
 *
 * -- Essayons a la main --
 * 23.67891 auf zwei Nachkommastellen gerundet wird 23.68.
 *
 * -- Le plan --
 * 1. Speichere den Messwert als `double`.
 * 2. Waehle `%f` fuer Gleitkomma.
 * 3. Setze die Genauigkeit auf zwei Nachkommastellen.
 * 4. Fuege Text und Zeilenumbruch hinzu.
 * 5. Lass den Wert zusaetzlich numerisch pruefen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Formatierung ist hier ein einzelner Ausgabeschritt.
 *
 * Exemples a verifier :
 * - 23.67891 -> 23.68
 * - 5.0 -> 5.00
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `%.2f` bedeutet zwei Nachkommastellen.
 * - `%n` erzeugt einen plattformgerechten Zeilenumbruch.
 */
void main() {
    double temperatur = 23.67891;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Messwert unveraendert", temperatur == 23.67891);
    ExerciseChecker.summary();
}

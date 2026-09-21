/**
 * EXERCICE 14 - Fixen Umrechnungskurs schuetzen
 * ============================================
 *
 * Niveau : facile -> moyen
 *
 * Histoire :
 * Ein Migrationswerkzeug rechnet alte DM-Betraege in Euro um. Der offizielle Faktor soll waehrend eines Programmlaufs nicht versehentlich neu zugewiesen werden.
 *
 * Notions du cours :
 * `final`, `double`, einfache Division.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Deklariere den festen Kurs als `final double` und berechne 19.5583 DM in Euro.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Der Kurs ist wie eine fest angeschraubte Regel am Tisch. Du darfst mit ihr rechnen, aber sie soll waehrend des Programms nicht ploetzlich ausgetauscht werden.
 *
 * -- Essayons a la main --
 * 19.5583 / 1.95583 = 10.0.
 *
 * -- Le plan --
 * 1. Deklariere den Faktor einmal als `final`.
 * 2. Speichere den DM-Betrag.
 * 3. Teile den Betrag durch den Faktor.
 * 4. Speichere `euro`.
 * 5. Pruefe ungefaehr 10.0.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Eine Konstante und eine Rechnung reichen.
 *
 * Exemples a verifier :
 * - 19.5583 DM -> 10.0 Euro
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `final` verhindert eine spaetere Neuzuweisung.
 * - Der Datentyp bleibt trotzdem `double`.
 */
void main() {
    double dm = 19.5583;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(euro);
    ExerciseChecker.check("10 Euro", Math.abs(euro - 10.0) < 1e-12);
    ExerciseChecker.summary();
}

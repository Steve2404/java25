/**
 * EXERCICE 34 - Offline-Maschinen mit continue ueberspringen
 * =========================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Eine Wartungsliste enthaelt Maschinen-IDs 1 bis 8. Gerade IDs gelten in diesem Testlauf als offline und sollen nicht diagnostiziert werden.
 *
 * Notions du cours :
 * `for`, `continue`, Restoperator `%`, Schleifenupdate.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Gib nur die ungeraden IDs als `Diagnose` aus und zaehle, wie viele wirklich bearbeitet wurden.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du gehst eine Liste durch. Bei jeder offline Maschine sagst du: `Diese ueberspringe ich` und gehst sofort zur naechsten.
 *
 * -- Essayons a la main --
 * 1..8 -> diagnostiziert werden 1,3,5,7 -> count=4.
 *
 * -- Le plan --
 * 1. Starte eine for-Schleife 1 bis 8.
 * 2. Erkenne gerade IDs mit `% 2 == 0`.
 * 3. Nutze `continue` fuer diese IDs.
 * 4. Zaehle nur nach dem continue-Punkt.
 * 5. Pruefe count=4.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Das Ueberspringen eines Durchgangs ist selbst das Lernziel.
 *
 * Exemples a verifier :
 * - 1..8 -> vier Diagnosen
 * - ID 2 erscheint nicht als Diagnose
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `continue` beendet nur den restlichen aktuellen Rumpf.
 * - Das Update einer `for`-Schleife findet danach trotzdem statt.
 */
void main() {
    int verarbeitet = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Vier Maschinen diagnostiziert", verarbeitet == 4);
    ExerciseChecker.summary();
}

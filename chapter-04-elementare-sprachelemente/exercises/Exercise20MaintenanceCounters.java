/**
 * EXERCICE 20 - Wartungszaehler mit Prae- und Postinkrement nachvollziehen
 * ======================================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Wartungssystem protokolliert den alten Zaehlerstand und danach den neuen freigegebenen Stand. Ein Entwickler hat `i++` und `++i` bewusst in zwei getrennten Schritten verwendet.
 *
 * Notions du cours :
 * Postinkrement, Praeinkrement, Seiteneffekt und Rueckgabewert.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Erzeuge aus Startwert 5 die Werte `alterStand=5`, Endzaehler 7 und `freigabeStand=7`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Beim Postinkrement zeigt Java zuerst das alte Schild und dreht den Zaehler danach weiter. Beim Praeinkrement dreht es zuerst weiter und zeigt dann das neue Schild.
 *
 * -- Essayons a la main --
 * Start 5. `alterStand = i++` -> alterStand 5, i 6. `freigabeStand = ++i` -> i 7, freigabeStand 7.
 *
 * -- Le plan --
 * 1. Starte `i` mit 5.
 * 2. Speichere den Rueckgabewert von `i++`.
 * 3. Verfolge den neuen i-Wert.
 * 4. Speichere den Rueckgabewert von `++i`.
 * 5. Pruefe alle drei Endwerte.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Schwierigkeit liegt in der zeitlichen Reihenfolge, nicht in einer neuen Abstraktion.
 *
 * Exemples a verifier :
 * - Start 5 -> alterStand=5, i=7, freigabeStand=7
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Post: Wert liefern, dann erhoehen.
 * - Prae: erst erhoehen, dann Wert liefern.
 */
void main() {
    int i = 5;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Alter Stand", alterStand == 5);
    ExerciseChecker.check("Endzaehler", i == 7);
    ExerciseChecker.check("Freigabestand", freigabeStand == 7);
    ExerciseChecker.summary();
}

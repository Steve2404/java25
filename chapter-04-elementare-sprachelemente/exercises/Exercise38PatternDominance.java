/**
 * EXERCICE 38 - Pattern-switch Dominanz und Exhaustivitaet richtig ordnen
 * ======================================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Routing-Switch soll kurze Strings besonders behandeln und alle anderen Objekte abdecken. Ein allgemeiner String-Fall darf den spezielleren Guard nicht vorzeitig verschlucken.
 *
 * Notions du cours :
 * Dominanz, Reihenfolge spezifisch-vor-allgemein, geschuetztes Typmuster, Exhaustivitaet.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Ordne die Pattern-Faelle so, dass `"VPN"` als `KURZTEXT` und laengere Strings als `TEXT` klassifiziert werden.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn der grosse Fangkorb zuerst kommt, faengt er auch die kleinen Sonderfaelle. Deshalb stellst du den kleinen Spezialkorb zuerst hin.
 *
 * -- Essayons a la main --
 * "VPN" ist String und Laenge 3 -> geschuetzter Fall zuerst -> KURZTEXT.
 *
 * -- Le plan --
 * 1. Speichere `value="VPN"` als Object.
 * 2. Pruefe zuerst den geschuetzten String-Fall.
 * 3. Pruefe danach den allgemeinen String-Fall.
 * 4. Decke den Rest mit einem unbedingten Object-Fall ab.
 * 5. Pruefe KURZTEXT.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Reihenfolge der cases ist selbst die zentrale Designentscheidung.
 *
 * Exemples a verifier :
 * - "VPN" -> KURZTEXT
 * - "Druckerfehler" -> TEXT
 * - Integer 5 -> ANDERES
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ein allgemeines `case String s` darf nicht vor einem spaeteren spezielleren String-Guard stehen.
 * - Ein Restfall macht den Ausdruck exhaustiv fuer Nicht-null-Objekte.
 */
void main() {
    Object value = "VPN";
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Kurzer String erkannt", result.equals("KURZTEXT"));
    ExerciseChecker.summary();
}

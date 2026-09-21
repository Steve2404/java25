/**
 * EXERCICE 27 - Messwerte mit Toleranz vergleichen
 * ===============================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Eine Kalibrierung berechnet 0.1 + 0.2 und vergleicht das Ergebnis mit dem Sollwert 0.3. Exakte binaere Darstellung darf keinen falschen Alarm erzeugen.
 *
 * Notions du cours :
 * Floating-Point-Ungenauigkeit, exakter Vergleich, Toleranz mit `Math.abs`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Vergleiche Messwert und Sollwert mit einer kleinen Toleranz statt nur mit `==`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Zwei Lineale koennen fast genau dieselbe Stelle zeigen, obwohl die interne Darstellung winzig unterschiedlich ist. Wir erlauben deshalb einen sehr kleinen Abstand.
 *
 * -- Essayons a la main --
 * d = 0.1+0.2 liegt extrem nah bei 0.3. Abstand = abs(d-0.3). Wenn Abstand < 1e-12, akzeptieren.
 *
 * -- Le plan --
 * 1. Berechne `d`.
 * 2. Speichere den Sollwert 0.3.
 * 3. Berechne den absoluten Abstand.
 * 4. Waehle eine Toleranz fuer diese Uebung.
 * 5. Pruefe `abstand < toleranz`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Das Problem ist ein einzelner numerischer Vergleich.
 *
 * Exemples a verifier :
 * - 0.1+0.2 gegen 0.3 -> innerhalb 1e-12
 * - Abstand 0.01 -> nicht innerhalb 1e-12
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze `Math.abs(d - soll)`.
 * - Die Toleranz ist problemabhaengig; hier ist sie vorgegeben.
 */
void main() {
    double d = 0.1 + 0.2;
    double soll = 0.3;
    double toleranz = 1e-12;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Kalibrierung akzeptiert", nahezuGleich);
    ExerciseChecker.summary();
}

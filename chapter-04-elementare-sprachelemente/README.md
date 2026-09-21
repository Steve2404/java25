# Kapitel 4 – Elementare Sprachelemente: Java-25 Exercise Pack

Dieses Kapitel wurde nach dem gleichen pädagogischen Prinzip wie der JavaScript-Exercise-Prompt neu aufgebaut:

**COMPRENDRE → RAISONNER À LA MAIN → PRÉDIRE → ÉCRIRE LE CODE → EXÉCUTER → OBSERVER → EXPLIQUER**

Es gibt hier **keine QCM/Quiz-Serie**. Die früheren QCM wurden durch zusätzliche Coding- und Algorithmusprobleme ersetzt. Jede Aufgabe soll ein konkretes Problem lösen, wie ein kleines Stück aus einem echten Projekt.

## Struktur

```text
chapter-04-elementare-sprachelemente/
├── ExerciseChecker.java
├── COVERAGE.md
├── test-support/
│   └── Simput.java
├── exercises/
│   ├── Exercise01....java
│   ├── Exercise02....java
│   └── ...
└── solutions/
    ├── Solution01....java
    ├── Solution02....java
    └── ...
```

## Arbeitsregel

1. Öffne **nur** die Datei unter `exercises/`.
2. Lies zuerst das Problem und die Erklärung wie für ein Kind.
3. Rechne / simuliere den Fall **von Hand**.
4. Lies den Plan.
5. Schreibe erst dann Java.
6. Führe das Programm aus.
7. Erkläre danach, warum dein Ergebnis korrekt ist.
8. Öffne erst zuletzt die passende Datei unter `solutions/`.

## Format einer Aufgabe

Jede Aufgabe besitzt:
- eine reale Situation,
- ein klares Ziel,
- genau erklärte TODOs,
- **Le problème, expliqué comme à un tout petit enfant**,
- **Essayons à la main**,
- **Le plan** ohne Java-Code,
- die Frage nach einer sinnvollen „boîte magique“,
- überprüfbare Beispiele,
- technische Java-Hinweise,
- ein Java-Skelett ohne halbe Lösung.

## Wichtige Progressionsregel

Keine Aufgabe darf stillschweigend Wissen aus späteren Kapiteln voraussetzen. Die Schwierigkeit entsteht durch die Kombination **bereits gelernter** Regeln, nicht durch neue APIs.

## Java-Version

Ziel ist **Java 25**. Die Preview-Aufgabe zu primitiven Pattern-Switches wird separat mit `--enable-preview` behandelt.

## Verifikation

Die offiziellen Lösungen werden mit GitHub Actions unter Java 25 kompiliert. Nicht-GUI-Lösungen werden zusätzlich ausgeführt, soweit sie deterministisch automatisierbar sind. Swing-Dialoge werden kompiliert, aber nicht in einer Headless-CI als echte Benutzerinteraktion ausgeführt.

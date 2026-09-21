# Schwierige QCM / OCP-Stil — Kapitel 4

**Regel:** Erst selbst lösen. Lösungen: [../solutions/qcm-ocp/README.md](../solutions/qcm-ocp/README.md)

## Q01
Was wird ausgegeben?
```java
IO.println("R=" + 2 + 3 * 4);
```
A. `R=20`  
B. `R=212`  
C. `R=56`  
D. Compilerfehler

## Q02
```java
double x = (double) (7 / 2);
```
A. `3.5` B. `3.0` C. `4.0` D. Compilerfehler

## Q03
Welcher Code kompiliert?
A.
```java
byte a=1,b=2;
byte c=a+b;
```
B.
```java
byte a=1,b=2;
int c=a+b;
```
C. beide D. keiner

## Q04
```java
int i=2;
int x=i++ + ++i;
IO.println(i + ":" + x);
```
A. `3:6` B. `4:6` C. `4:5` D. Compilerfehler

## Q05
```java
int x=0;
boolean b=x>0 && 10/x>2;
```
A. ArithmeticException B. true C. false ohne Exception D. Compilerfehler

## Q06
```java
if (true) {
    int n=10;
}
IO.println(n);
```
A. 10 B. 0 C. Compilerfehler wegen Scope D. `if(true)` verboten

## Q07
```java
char c='A';
var x=c+1;
```
A. char 'B' B. int 66 C. String D. Compilerfehler

## Q08
```java
int n=2;
String s=switch(n) {
    case 1 -> "A";
    case 2,3 -> "B";
    default -> "C";
};
```
A. A B. B C. C D. Compilerfehler

## Q09
```java
int n=1;
int r=0;
switch(n) {
    case 1: r+=1;
    case 2: r+=2;
    default: r+=4;
}
IO.println(r);
```
A.1 B.3 C.7 D.4

## Q10
```java
for (int i=0;i<4;i++) {
    if (i==1) continue;
    IO.print(i);
}
```
A.0123 B.023 C.123 D.Endlosschleife

## Q11
```java
int i=0;
while(i<3);
{
    i++;
}
```
A. dreimal B. Block dreimal C. Endlosschleife D. Compilerfehler

## Q12
Ein unlabeled `break` in zwei verschachtelten Schleifen beendet:
A. immer beide  
B. die innerste passende Schleife  
C. die Methode  
D. die JVM

## Q13
```java
int x=Integer.MAX_VALUE;
x++;
```
A. ArithmeticException B. Compilerfehler C. MIN_VALUE D. unverändert

## Q14
```java
double d=1.0/0.0;
```
A. Infinity B. ArithmeticException C. NaN D. Compilerfehler

## Q15
Die behandelte `showInputDialog(...)`-Variante liefert:
A. int B. String C. boolean D. void

## Q16
Welche Aussage ist korrekt?
A. `YES_NO_OPTION` bedeutet „Ja gewählt“  
B. `YES_OPTION` bestimmt die Buttons  
C. `YES_NO_OPTION` konfiguriert, `YES_OPTION` beschreibt die Antwort  
D. beide boolean

## Q17
Beim Abbrechen von `showInputDialog()` kann entstehen:
A. `"0"` B. immer `""` C. `null` D. `false`

## Q18
```java
long n=Long.parseLong("999999999999999999999999");
```
A. Compilerfehler B. NumberFormatException C. MAX_VALUE D. BigInteger

## Q19
`System.exit(0)` beendet:
A. nur Schleife B. nur Methode C. laufende Java-Ausführung D. nur if

## Q20
```java
String s="abc";
long n=Long.parseLong(s);
```
A. Compilerfehler  
B. kompiliert, Laufzeit-NumberFormatException  
C. n=0  
D. automatische Unicode-Konvertierung

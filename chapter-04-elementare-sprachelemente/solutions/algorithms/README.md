# Lösungen — Algorithmus-Training Kapitel 4

## A01 — Summe 1..n
```java
int n = Simput.gint("n: ");
long sum = 0;
for (int i=1; i<=n; i++) {
    sum += i;
}
IO.println(sum);
```

## A02 — Fakultät
```java
int n = Simput.gint("n: ");
long f = 1;
for (int i=2; i<=n; i++) {
    f *= i;
}
IO.println(f);
```
`0! = 1`. Mit `long` tritt ab genügend großem `n` Overflow auf.

## A03 — Ziffernsumme
```java
long n = Simput.glong("n: ");
long sum = 0;
while (n > 0) {
    sum += n % 10;
    n /= 10;
}
IO.println(sum);
```

## A04 — Zahl umdrehen
```java
long n = Simput.glong("n: ");
long reversed = 0;
while (n > 0) {
    long digit = n % 10;
    reversed = reversed * 10 + digit;
    n /= 10;
}
IO.println(reversed);
```

## A05 — Primzahl
```java
long n = Simput.glong("n: ");
boolean prime = n >= 2;
long limit = (long) Math.sqrt(n);

for (long i=2; prime && i<=limit; i++) {
    if (n % i == 0) {
        prime = false;
    }
}

IO.println(prime ? "Primzahl" : "Keine Primzahl");
```

## A06 — GGT
```java
long a = Simput.glong("a: ");
long b = Simput.glong("b: ");

while (b != 0) {
    long r = a % b;
    a = b;
    b = r;
}

IO.println(a);
```

# Day 1 Notes

**_Rule 1: byte, short, char → promoted to int_**

> Even if both operands are small types, Java promotes them to int first.

```
byte a = 10;
byte b = 20;

// byte c = a + b; Compile-time error
int c = a + b;
```

Why?
Because a + b becomes an int, not a byte.

**_Rule 2: If one operand is long, whole expression becomes long_**

```
int a = 10;
long b = 20;

long c = a + b; // int → long
```

**_Rule 3: If one operand is float, result becomes float_**

```
int a = 10;
float b = 5.5f;

float c = a + b; // int → float
```

**_Rule 4: If one operand is double, result becomes double_**

Highest priority wins.

```
float a = 10.5f;
double b = 20.3;

double c = a + b; // float → double
```

**Type Promotion Priority Order**

(Java follows this strictly)

```
byte → short → int → long → float → double
```

Lower → promoted to higher automatically.

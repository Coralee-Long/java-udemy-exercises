# Section 3: First Steps: Data Types & Variables

## Data Types
**-> All primitive data types have respective wrapper classes:**

| Primitive Data | Wrapper Class | Width (Bits) | Min Value        | Max Value         |
|----------------|---------------|--------------|------------------|-------------------|
| byte           | Byte          | 8            | -128             | 127               |
| short          | Short         | 16           | -32,768          | 32,767            |
| int            | Integer       | 32           | -2.1B            | 2.1B              |
| long           | Long          | 64           | -9.2Q            | 9.2Q              |
| float          | Float         | 32           | ~1.4E-45         | ~3.4E38           |
| double         | Double        | 64           | ~4.9E-324        | ~1.8E308          |
| char           | Character     | 16           | 0 (Unicode)      | 65,535 (Unicode)  |
| boolean        | Boolean       | 1 (varies)   | false            | true              |

| Non-Primitive Datas               | Example in Java                        | Prints (with toString) |
|-----------------------------------|----------------------------------------|------------------------|
| String                            | `String myString = "Some string here!` | `Some string here!`    |
| arrays (simple)                   | `int[] myIntArray = {1, 2, 3}`         | `[1, 2, 3]`            |
| Classes (eg. ArrayList, List etc) | `public class = MyClass {...}`         | N/A                    |


### Class Wrappers
**-> Primitive Data have Wrapper Classes have built-in Methods available:**

```java
int minIntValue = Integer.MIN_VALUE; // -2147483648
int maxIntValue = Integer.MAX_VALUE; // 2147483647

// NOTE: A numeric literal that exceeds Integer.MAX_VALUE must have "L" suffix added

long longSize = Long.SIZE; // 64
```

### Type Casting
**-> Casting means to treat/convert a number (from one type to another):**

`(byte) (myMinByteValue / 2)`

```java
short myNewShortValue = myShortValue / 2;           // Error since numbers default to int in Java
short myNewShortValue = (short) myShortValue / 2;   // fine

int myNewTotal = (myTotal / 2); // *NO* Error since numbers default to int in Java
short myNewTotal (myTotal / 2); // Error since defaults to int
```

### Floating Points Numbers
- Floating Point Numbers are known as REAL numbers (other numbers are referred to as WHOLE numbers)
- 2 Types of Floating Point Numbers: `float` & `double`
- `double` is the Java default for any decimal number
- `float` type can be specified as numeric literal `F` eg: `10.23F`

```java
float myOtherFloatValue = 5.25;         // error
float myOtherFloatValue = (float) 5.25; // can fix with type casting
float myOtherFloatValue = 5.25F;        // RECOMMENDED
```

**-> Floating Point Precision:**

```java
int myInt = 5;           // 5
float myFloat = 5F;      // 5.0
double myDouble = 5D;    // 5.0

int myInt = 5 / 2;       // 2     **** not 2.5 - because it is an integer)
float myFloat = 5 / 2;   // 2.0   **** not 2.5 - because 2 integers don't have decimals)
double myDouble = 5 / 2; // 2.0   **** not 2.5 - because 2 integers don't have decimals)

myInt = 5 / 2;           // 2
myFloat = 5F / 2F;       // 2.5   Either number can have the F/f
myDouble = 5D / 2D;      // 2.5   Either number can have the D/d

myFloat = 5F / 3F;       // 1.6666666 -> Floats have 7 decimal places
myDouble = 5D / 3D;      // 1.6666666666666667 have 16 decimals places
```

> 💡 **NOTE: Doubles are Recommended!!**
>   
> 1. **doubles** are faster to process 
> 2. Java libraries mostly use **doubles**
> 3. **doubles** are more accurate & can handle larger numbers

### Characters: `chars`
**-> Difference between chars and Strings:**

| chars                        | Strings                       | 
|------------------------------|-------------------------------|
| single character             | can hold many characters      |
| Single Quotes: `' '`         | Double Quotes: `" "`          |
| Primative                    | Non Primative                 |

**-> Chars can be represented differently numerically:**

| Origin                | Assignment Type    | Java Code  | Example                   |
|-----------------------|--------------------|------------|---------------------------|
| Latin: `D`            | Literal Character  | `'D'`      | `char myChar = 'D';`      |
| Unicode Num: `U+0044` | Unicode Value      | `'\u0044'` | `char myChar = '\u0044';` | 
| HTML Code: `&#68;`    | Integer Value      | `68`       | `char myChar = 68;`       |

### Strings: `Strings`
- A `String` is a class that contains a sequence of characters
- Size only limited by memory available
- Strings are `immutable` - you cannot change a `String` after it's been created
- The `StringBuilder` class is mutable but doesn't have all features of a `String`class
```java
// Integers can be converted to String with concatenation but not vice versa
String myString = "10";
int myInt = 10;
    System.out.println(myString + myInt); // "1050"

// Strings are immutable
String firstString = "abc";
String lastString = "xyz";

lastString = firstString + lastString; // Java actually creates a new String and discarded the old one
    System.out.println(lastString); // "abcxyz" (this is not the original String "lastString"
```

### Abbreviating Operators
```java
// Incrementing
result = result + 1; // long way
result++; // shorthand: Post-Fix Increment Operator
result+=1; // shorthand: Compound Assignment Operator +
```
**-> Important to Note:**
```java
int result = 10;
result -= 5.5; // 4

int result = 10;
result = result - 5.5; // Error: Incompatible types 

// Therefore:
int result = 10;
result -= 5.5 
// is really:
result = (type int) (result - 5.5);

// Correct Outcomes
double result = 10;
result -= 5.5; // 4.5 (What we wanted)

double result = 10;
result *= 1.5; // 15.0

double result = 10;
result /= 1.5; // 6.66666666667
```


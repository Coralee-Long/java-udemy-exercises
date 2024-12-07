# Naming Conventions in Java

| Identifier    | Recommended      | Example          |
|---------------|------------------|------------------|
| Project Name  | Upper Camel Case | FirstJavaProject |
| Class Name    | Upper Camel Case | NewClass         |
| Method Name   | Lower Camel Case | getData          |
| Variable Name | Lower Camel Case | firstVariable    |

# Ternary Operators
**Example 1:**
```java
// Not ideal
boolean isDog = (animalType == "cat") ? false : true;

// Ideal
boolen isDog = (animalType != "cat);
```
**Example 2:**
```java
// Not ideal
if(isDog) {
	System.ot.println("This is a dog")
}

// Ideal
String message = isDog ? "This is a dog" : "This is not a dog";
System.out.println(message);
```

# Java Operator Precedence Table

| Precedence Level | Operator(s)               | Type/Description                                    |
|-------------------|---------------------------|----------------------------------------------------|
| 1                 | `()`                     | Parentheses (used for grouping)                   |
|                   | `[]`                     | Array subscript                                   |
|                   | `.`                      | Member access (field, method, or inner class)     |
|                   | `::`                     | Method reference                                  |
| 2                 | `++`, `--`               | Unary post-increment and post-decrement           |
| 3                 | `++`, `--`               | Unary pre-increment and pre-decrement             |
|                   | `+`, `-`                 | Unary plus and minus                              |
|                   | `~`                      | Bitwise complement                                |
|                   | `!`                      | Logical NOT                                       |
|                   | `(type)`                 | Type casting                                      |
|                   | `new`                    | Object creation                                   |
| 4                 | `*`, `/`, `%`            | Multiplication, division, modulus                |
| 5                 | `+`, `-`                 | Addition and subtraction                          |
| 6                 | `<<`, `>>`, `>>>`        | Bitwise shift left, right, and unsigned right     |
| 7                 | `<`, `<=`, `>`, `>=`     | Relational operators                              |
|                   | `instanceof`             | Type comparison                                   |
| 8                 | `==`, `!=`               | Equality and inequality                           |
| 9                 | `&`                      | Bitwise AND                                       |
| 10                | `^`                      | Bitwise XOR                                       |
| 11                | `&#124;`                 | Bitwise OR                                        |
| 12                | `&&`                     | Logical AND                                       |
| 13                | `&#124;&#124;`           | Logical OR                                        |
| 14                | `? :`                    | Ternary conditional                               |
| 15                | `=`, `+=`, `-=`, `*=`, `/=`, `%=` , `&=`, `&#124;=`, `^=`, `<<=`, `>>=`, `>>>=` | Assignment and compound assignment operators |
| 16                | `,`                      | Comma (used for sequential evaluation)            |

## Notes
- **Associativity:** Operators with the same precedence level are evaluated based on their associativity:
    - **Left-to-right:** Most operators (e.g., arithmetic, relational, and bitwise operators).
    - **Right-to-left:** Unary, assignment, and ternary operators.

---


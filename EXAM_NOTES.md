# Oracle Exam Tips

### Types

```java
// Exam often omits float type to catch people out
float myNumber = 23.99; // Compiler Error since Java defaults decimals to type: double
float myNumber = 23.99F // Correct!
```

### Exception Handling: `finally`

> ⚠️ **NOTE:** `finally` blocks ALWAYS EXECUTE - even if there is a return staetment higher up the block

**Example:**

```java
private static int printANumber() {
    try {
        return 3; // Returns `3` if no exception occurs.
    } catch (Exception e) {
        return 4; // Would return `4` if an exception is caught (not applicable here).
    } finally {
        return 5; // Always executes and returns `5`, overriding any return in the `try` or `catch`.
    }
}
// ---Output--- The method will always return `5` because the `finally` block overrides the return values of `try` and `catch`.
```

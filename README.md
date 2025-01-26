# Groovy NullPointerException in `each` method

This example demonstrates a common error in Groovy when using the `each` method with a list that might be null.

The `BuggyGroovyEach.groovy` file contains the code that produces the error. The `FixedGroovyEach.groovy` file shows the corrected code.

**Problem:** The `each` method throws a `NullPointerException` if the list passed to it is null. 

**Solution:**  Always check for null before calling `each`, or use the `?.` safe navigation operator.
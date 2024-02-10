package test;

enum Comparison {
    EQUAL,
    GREATER_THAN,
    GREATER_EQUAL,
    LESS_THAN,
    LESS_EQUAL,

}

public class TestBuilder {
    private String description;
    private Object expected;
    private Comparison comparison;

    public TestBuilder() {
    }

    public TestBuilder describe(String description) {
        this.description = description;
        return this;
    }

    public TestBuilder expect(Object expected) {
        this.expected = expected;
        return this;
    }

    public TestBuilder equal() {
        this.comparison = Comparison.EQUAL;
        return this;
    }

    public TestBuilder to(Object actual) {
        if (actual == null) {
            throw new AssertionError("No expectation to check.");
        }

        if (comparison != Comparison.EQUAL) {
            throw new AssertionError(".to() can only be used with .equal()");
        }

        if (!this.expected.equals(actual)) {
            throw new AssertionError(description + " failed.");
        }
        return this;
    }

    public TestBuilder than(Number actual) {
        if (actual == null) {
            throw new AssertionError("No expectation to check.");
        }

        if (comparison != Comparison.GREATER_THAN && comparison != Comparison.LESS_THAN) {
            throw new AssertionError(".than() can only be used with .gt() or ls()");
        }

        if (comparison == Comparison.GREATER_THAN && actual.doubleValue() < ((Number) this.expected).doubleValue()) {
            throw new AssertionError(description + " failed.");
        }
        if (comparison == Comparison.LESS_EQUAL && actual.doubleValue() > ((Number) this.expected).doubleValue()) {
            throw new AssertionError(description + " failed.");
        }
        return this;
    }
}


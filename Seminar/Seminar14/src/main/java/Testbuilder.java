public class Testbuilder {

    private Test test;
    private String description;
    private int value;
    private int expectedValue;

    public Test build() {
        return test;
    }

    public Testbuilder test(String description) {
        this.description = description;
        return this;
    }

    public Testbuilder expectedValue(int v) {
        this.expectedValue = v;
        return this;
    }

    public Testbuilder result(int v) {
        this.value = v;
        return this;
    }
}

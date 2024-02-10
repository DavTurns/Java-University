package vectorizer;

import java.util.List;

public interface Vectorizer {
    List<Double> transform(String input);
}

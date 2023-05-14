package langchain.chains;

import java.util.List;
import java.util.Map;

public interface Chain {
    String chainType();

    List<String> inputKeys();

    List<String> outputKeys();

    Map<String, String> run(Map<String, String> inputMap);
}

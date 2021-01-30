package online.rumac.common.details;

import java.util.HashMap;
import java.util.Map;

public abstract class Details {

    protected final String directory = "src\\test\\resources\\json\\";
    protected final String filePath;
    protected final Map<String, String> map;

    public Details() {
        this.filePath = getFilePath();
        map = new HashMap<>();
    }
    protected abstract String getFilePath();

    public Map<String, String> getDetails() {
        return map;
    }
}

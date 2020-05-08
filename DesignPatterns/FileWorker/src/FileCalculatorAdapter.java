import java.io.File;
import com.codegym.*;


public class FileCalculatorAdapter implements FileCalculator {
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}

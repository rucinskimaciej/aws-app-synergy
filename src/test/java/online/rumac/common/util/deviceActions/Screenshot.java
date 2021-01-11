package online.rumac.common.util.deviceActions;

import com.synergy.core.driver.mobile.MobileDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Screenshot {

    private final MobileDriver driver;

    public static final String SEPARATOR = System.getProperty("file.separator");

    public Screenshot(MobileDriver driver) {
        this.driver = driver;
    }

    public void save() {
        save("");
    }

    public void save(String file) {
        try {
            fileToScreenshot(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileToScreenshot(String file) throws IOException {
        file = validateFile(file);
        File outputFile = new File(file);
        String fileFormat = extractFileFormat(file).toUpperCase();
        BufferedImage bfrImg = ImageIO.read(driver.screen().getImage());
        ImageIO.write(bfrImg, fileFormat, outputFile);
    }

    private String validateFile(String file) {
        String directory = extractDirectory(file);
        String fileName = extractFileName(file, directory);
        String format = extractFileFormat(file);
        return String.format("%s%s.%s", directory, fileName, format);
    }

    private String extractFileFormat(String file) {
        String fileFormat = "png";
        if (file == null) return fileFormat;
        return file.contains(".") ? file.substring(file.lastIndexOf('.') + 1) : fileFormat;
    }

    private String extractFileName(String file, String directory) {
        String fileName = getFileNameFromLocalDateTime();
        if (file == null) return fileName;
        file = file.replace(directory, "");
        return file.contains(".") ? file.substring(0, file.lastIndexOf('.')) : fileName;
    }

    private String getFileNameFromLocalDateTime() {
        String fileName = LocalDateTime.now().toString().replace(":", "_");
        fileName = fileName.substring(0, fileName.lastIndexOf('.'));
        return fileName;
    }

    private String extractDirectory(String file) {
        String directory = "C:\\Users\\rucinskm\\Documents\\ViacomCBS\\aws-app-synergy\\src\\test\\resources\\screenshots\\";
        if (file == null) return directory;
        return file.contains(SEPARATOR) ? file.substring(0, file.lastIndexOf(SEPARATOR)) : directory;
    }
}

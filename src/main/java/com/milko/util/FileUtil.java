package com.milko.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static com.milko.config.Config.INPUT_CSV_FILE;
import static com.milko.config.Config.INPUT_XML_FILE;
import static java.nio.charset.StandardCharsets.UTF_8;

public class FileUtil {

    public static String readFile(String filePath) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(INPUT_CSV_FILE);
        InputStreamReader streamReader = new InputStreamReader(is, UTF_8);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String line;
        StringBuilder fileContent = new StringBuilder();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            is.close();
            streamReader.close();
            bufferedReader.close();
        }

        return fileContent.toString().trim();
    }
}

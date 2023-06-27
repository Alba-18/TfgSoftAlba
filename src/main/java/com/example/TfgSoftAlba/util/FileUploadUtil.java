package com.example.TfgSoftAlba.util;

import java.io.*;
import java.nio.file.*;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

    public static void saveFile(String fileName, //no usado
        MultipartFile multipartFile) throws IOException {
        var path = new ClassPathResource(".");
        File file = new File(path.getFile() + "/static/images/" + fileName + ".jpg");
        Path uploadPath = Paths.get(file.getPath());
        file.createNewFile();
        try (InputStream inputStream = multipartFile.getInputStream()) {
            Files.copy(inputStream, uploadPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {        
            throw new IOException("Could not save file: " + fileName, ioe);
        } 
    }
}

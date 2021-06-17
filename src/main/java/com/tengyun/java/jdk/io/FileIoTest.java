package com.tengyun.java.jdk.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * @author Adam Zhao
 */
public class FileIoTest {
    public static void main(String[] args) {
        System.out.println("main method");
        copyFile("src/main/java/com/tengyun/java/jdk/io/img0_2560x1600.jpg",
                "src/main/java/com/tengyun/java/jdk/io/img0_2560x1600-bak.jpg");
    }

    public static void copyFile(String sourceFile, String targetFile) {
        FileInputStream fis = null;
        FileOutputStream fot = null;

        try {
            fis = new FileInputStream(sourceFile);
            fot = new FileOutputStream(targetFile, false);
            byte[] buffer = new byte[1024];
            int hasRead;

            while ((hasRead = fis.read(buffer)) > 0) {
                fot.write(buffer, 0, hasRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(fis)) {
                    fis.close();
                }
                if (Objects.nonNull(fot)) {
                    fot.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

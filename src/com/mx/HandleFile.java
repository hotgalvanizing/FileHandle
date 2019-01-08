package com.mx;

import java.io.File;

public class HandleFile {

    public static void main(String[] args) {

        File file = new File("E:\\JavaProject\\FileHandle\\test");
        File[] files = file.listFiles();
        for (File f : files) {
            String s = f.getName();
            String s1 = s.replace("_night", "");
            File f1 = new File(f.getParent() + File.separator + s1);
            f.renameTo(f1);
        }
    }

}

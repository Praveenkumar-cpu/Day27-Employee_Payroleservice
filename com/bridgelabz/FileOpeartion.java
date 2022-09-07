package com.bridgelabz;

import java.io.File;

public class FileOpeartion {

    public static boolean deleteFiles(File contentsToDelete){
        File[] contents = contentsToDelete.listFiles();

        if(contents != null){
            for (File file : contents){
                deleteFiles(file);
            }
        }

        
        return contentsToDelete.delete();
    }
}

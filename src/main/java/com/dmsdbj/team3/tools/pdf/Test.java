package com.dmsdbj.team3.tools.pdf;

import java.io.File;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月14日 17:23:00
 */
public class Test {
    public static void main(String args[]) throws Exception {
        String path = "/Users/Betty/Desktop/test.pdf";
        File file = new File(path);
        file.createNewFile();
        new PdfUtil(file).generatePDF();
    }
}

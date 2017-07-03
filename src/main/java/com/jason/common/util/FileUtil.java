package com.jason.common.util;

import org.apache.commons.lang.StringUtils;

import static fj.data.List.list;

public final class FileUtil {


    /**
     * 输入文件全称, 输出文件名（不带后缀）
     * 例如： abcde.txt -> abcde Or abc.cde$fgh.mp4 -> abc.cde$fgh
     */
    public static String getFileName(String fileName) {
        if (fileName.contains(".")) {
            return StringUtils.join(list(fileName.split("\\.")).init().toJavaList().toArray(), ".");
        } else {
            return fileName;
        }
    }


    /**
     * 输入文件全称, 输出文件后缀
     * 例如： abcde.txt -> txt Or abc.cde$fgh.mp4 -> mp4
     */
    public static String getFileSuffix(String fileName) {
        if (fileName.contains(".")) {
            return list(fileName.split("\\.")).last();
        } else {
            return fileName;
        }
    }
}

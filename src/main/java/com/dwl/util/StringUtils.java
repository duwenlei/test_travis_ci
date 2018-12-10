package com.dwl.util;

public class StringUtils {
    public static boolean isNotNull(String field) {
        if (field != null && "".equals(field)) {
            return true;
        }
        return false;
    }
}

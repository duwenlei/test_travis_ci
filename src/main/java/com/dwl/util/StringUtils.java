package com.dwl.util;

public class StringUtils {
    public boolean isNotNull(String field) {
        if (field != null && "".equals(field)) {
            return true;
        }
        return false;
    }
}

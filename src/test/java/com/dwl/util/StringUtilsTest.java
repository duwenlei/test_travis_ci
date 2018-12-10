package com.dwl.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void isNotNull() {
        Assert.assertTrue(StringUtils.isNotNull(null));
    }
}
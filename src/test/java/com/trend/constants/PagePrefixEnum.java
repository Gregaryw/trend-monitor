package com.sephome.constants;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/11/12
 */
public enum PagePrefixEnum {
    LIST("List"),
    VIEW("View");

    private String value;

    PagePrefixEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

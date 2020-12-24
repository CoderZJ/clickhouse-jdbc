package ru.yandex.clickhouse;

/**
 * @author zhangjian
 * @version ClickHouseTuple, v 0.1 2020/11/3 11:21 上午 zhangjian Exp$
 */
public class ClickHouseTuple {
    private String value;

    public ClickHouseTuple(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

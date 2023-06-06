package org.dwb.cpp_creator.msg;

import org.jetbrains.annotations.NotNull;

/**
 * member的信息结构体
 */
public class MemMsg {
    public String type;
    public String name;
    public String val;
    public boolean hasVal;
    public boolean isArray;
    //Array才有
    public String valNum;
    //type检查
    public boolean isString;
    //大写的type
    public String upperType;

    public MemMsg(String type,
                  String name,
                  String val,
                  boolean hasVal,
                  boolean isArray,
                  String valNum,
                  boolean isString) {
        this.type = type;
        this.name = name;
        this.val = val;
        this.hasVal = hasVal;
        this.isArray=isArray;
        this.valNum=valNum;
        this.isString=isString;
    }

    public MemMsg() {

    }

    public void setType(@NotNull String type) {
        this.type = type;
        this.upperType = type.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setHasVal(boolean hasVal) {
        this.hasVal = hasVal;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public void setValNum(String valNum) {
        this.valNum = valNum;
    }

    public void setString(boolean string) {
        isString = string;
    }
}
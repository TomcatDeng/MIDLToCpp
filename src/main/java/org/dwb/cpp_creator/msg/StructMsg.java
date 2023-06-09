package org.dwb.cpp_creator.msg;

import java.util.ArrayList;

/**
 * 总struct结构信息
 */
public class StructMsg {
    //此处name揉合了module的信息
    String name;
    ArrayList<MemMsg> members;
    ArrayList<ScopedMemMsg> scopeMembers;
    boolean hasScoped;

    public StructMsg(String name, ArrayList<MemMsg> members, ArrayList<ScopedMemMsg> scopeMembers, boolean hasScoped) {
        this.name = name;
        this.members = members;
        this.scopeMembers = scopeMembers;
        this.hasScoped = hasScoped;
    }

    public StructMsg() {
        scopeMembers = null;
        members = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MemMsg> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<MemMsg> members) {
        this.members = members;
    }

    public ArrayList<ScopedMemMsg> getScopeMembers() {
        return scopeMembers;
    }

    public void setScopeMembers(ArrayList<ScopedMemMsg> scopeMembers) {
        this.scopeMembers = scopeMembers;
    }

    public boolean isHasScoped() {
        return hasScoped;
    }

    public void setHasScoped(boolean hasScoped) {
        this.hasScoped = hasScoped;
    }
}

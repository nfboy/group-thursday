package com.group.dubbo.service.impl;

import com.group.dubbo.service.MergeService;

import java.util.ArrayList;
import java.util.List;

public class MergeServiceImpl2 implements MergeService {
    @Override
    public List<String> mergeResult() {
        List<String> menus =new  ArrayList<String>();
        menus.add("group-2.1");
        menus.add("group-2.2");
        return menus;
    }
}

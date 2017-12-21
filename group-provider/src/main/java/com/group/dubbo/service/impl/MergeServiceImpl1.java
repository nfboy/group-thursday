package com.group.dubbo.service.impl;

import com.group.dubbo.service.MergeService;

import java.util.ArrayList;
import java.util.List;

public class MergeServiceImpl1 implements MergeService {
    @Override
    public List<String> mergeResult() {
        List<String> menus = new ArrayList<String>();
        menus.add("group-1.1");
        menus.add("group-1.2");
        return menus;
    }
}

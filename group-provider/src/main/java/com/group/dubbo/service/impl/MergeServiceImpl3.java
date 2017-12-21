package com.group.dubbo.service.impl;

import com.group.dubbo.service.MergeService;

import java.util.ArrayList;
import java.util.List;

public class MergeServiceImpl3 implements MergeService {
    @Override
    public List<String> mergeResult() {
        List<String> menus = new ArrayList<String>();
        menus.add("group-3.1");
        menus.add("group-3.2");
        return menus;
    }
}

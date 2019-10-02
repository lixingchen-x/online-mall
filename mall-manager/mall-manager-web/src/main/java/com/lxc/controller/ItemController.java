package com.lxc.controller;

import com.lxc.pojo.TbItem;
import com.lxc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItenById(@PathVariable("itemId") Long itemId){
        TbItem item = itemService.getItemById(itemId);
        System.out.println("controller里："+item);
        return item;
    }
}

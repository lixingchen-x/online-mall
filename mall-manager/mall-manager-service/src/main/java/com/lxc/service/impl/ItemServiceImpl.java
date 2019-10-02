package com.lxc.service.impl;

import com.lxc.mapper.TbItemMapper;
import com.lxc.pojo.TbItem;
import com.lxc.pojo.TbItemExample;
import com.lxc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long itemId) {
        //直接根据主键查询
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        System.out.println("service层： "+tbItem);
        return tbItem;

//        //也可以设置查询条件
//        TbItemExample tbItemExample=new TbItemExample();
//        TbItemExample.Criteria criteria=tbItemExample.createCriteria();
//        criteria.andIdEqualTo(itemId);
//        List<TbItem> itemList = tbItemMapper.selectByExample(tbItemExample);
//        if(itemList!=null&&itemList.size()>0){
//            return itemList.get(0);
//        }
//        return null;

    }
}

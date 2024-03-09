package com.jp.destiny.mybatis_generator.mapper;

import com.jp.destiny.mybatis_generator.model.Merchant;
import java.util.List;

public interface MerchantMapper {
    int deleteByPrimaryKey(String pkId);

    int insert(Merchant row);

    Merchant selectByPrimaryKey(String pkId);

    List<Merchant> selectAll();

    int updateByPrimaryKey(Merchant row);
}
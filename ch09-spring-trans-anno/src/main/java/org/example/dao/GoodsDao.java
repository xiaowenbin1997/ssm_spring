package org.example.dao;

import org.example.domain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(Integer id);
}

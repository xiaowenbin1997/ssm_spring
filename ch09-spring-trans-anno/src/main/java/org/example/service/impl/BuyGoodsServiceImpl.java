package org.example.service.impl;

import org.example.dao.GoodsDao;
import org.example.dao.SaleDao;
import org.example.domain.Goods;
import org.example.domain.Sale;
import org.example.excep.ChangeException;
import org.example.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Transactional(
                    propagation = Propagation.REQUIRED,
                    isolation = Isolation.DEFAULT,
                    readOnly = false,
                    rollbackFor = {NullPointerException.class,ChangeException.class}
                    )
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法的开始");
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            throw new NullPointerException("编号是" + goodsId + "的货品不存在");
        } else if (goods.getAmount() < nums) {
            throw new ChangeException(goodsId + "商品备货不足，修改失败");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的结束");
    }
}

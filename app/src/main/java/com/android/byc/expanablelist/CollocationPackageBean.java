package com.android.byc.expanablelist;

/*
* *
 * @author yu
 * @version 1.0
 * @date 2019/4/3 8:48
 * @description
 */
import java.math.BigDecimal;
import java.util.List;

class CollocationPackageBean {
    private BigDecimal totalPrice;
    private String name;
    private List<CollocationSkuBean> collocationSkuDoList;
    private BigDecimal discountFee;

     static class CollocationSkuBean {
        private String skuTitle;
        private String imageMd5;

        CollocationSkuBean(String skuTitle, String imageMd5) {
            this.skuTitle = skuTitle;
            this.imageMd5 = imageMd5;
        }

        String getSkuTitle() {
            return skuTitle;
        }

         String getImageMd5() {
            return imageMd5;
        }
    }

     BigDecimal getTotalPrice() {
        return totalPrice;
    }

     void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     List<CollocationSkuBean> getCollocationSkuDoList() {
        return collocationSkuDoList;
    }

     void setCollocationSkuDoList(List<CollocationSkuBean> collocationSkuDoList) {
        this.collocationSkuDoList = collocationSkuDoList;
    }

     BigDecimal getDiscountFee() {
        return discountFee;
    }

     void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }
}


package com.cwjy.bs.server;

import com.cwjy.bs.common.ResponseEntity;
import com.cwjy.bs.orm.dto.ProductReviews;
import com.cwjy.bs.orm.dto.ProductReviewsCommodity;

/**
 * @author xgp
 * @version 1.0
 * @date 3/24 9:18
 * @table
 * @description
 */
public interface ProductReviewsCommodityServer {

    /**
     * 通过ID删除数据
     *
     * @param id: 所要删除数据ID
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:26
     */
    ResponseEntity deleteByPrimaryKey(String id);


    /**
     * 增加数据
     *
     * @param record: 传参增加数据
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:26
     */
    ResponseEntity insert(ProductReviewsCommodity record);

    /**
     * 增加数据
     *
     * @param record: 传参增加数据
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:26
     */
    ResponseEntity insertSend(ProductReviewsCommodity record);

    /**
     * 增加部分数据
     *
     * @param record: 传参增加部分数据
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:27
     */
    ResponseEntity insertSelective(ProductReviewsCommodity record);

    /**
     * 通过ID获取数据
     *
     * @param id: 传输ID
     * @return: com.hr.bak.product.orm.dto.BakDischarge
     * @Author: XGP
     * @Date: 3/22 8:27
     */
    ResponseEntity selectByPrimaryKey(String id);

    /**
     * 修改部分数据
     *
     * @param record: 所要修改数据
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:27
     */
    ResponseEntity updateByPrimaryKeySelective(ProductReviewsCommodity record);

    /**
     * 修改所有数据
     *
     * @param record: 所有要修改数据
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:28
     */
    ResponseEntity updateByPrimaryKey(ProductReviewsCommodity record);



    /**
     * 获取所有数据
     *
     * @param record: 获取数据请求参数
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:28
     */
    ResponseEntity getPage(ProductReviewsCommodity record);


    /**
     * 获取所有订单评价
     *
     * @param record: 获取所有订单评价
     * @return: int
     * @Author: XGP
     * @Date: 3/22 8:28
     */
    ResponseEntity getOrderPage(ProductReviewsCommodity record);
}

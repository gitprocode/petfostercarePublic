package com.cwjy.bs.orm.mapper;

import com.cwjy.bs.orm.dto.PetBoarding;
import com.cwjy.bs.orm.entity.HomeEntity;
import com.cwjy.bs.orm.entity.PetBoardingEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetBoardingMapper {
    /**
     * 通过ID删除数据
     *
     * @param id: 所要删除数据ID
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:26
     */
    int deleteByPrimaryKey(String id);


    /**
     * 增加数据
     *
     * @param record: 传参增加数据
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:26
     */
    int insert(PetBoarding record);

    /**
     * 增加部分数据
     *
     * @param record: 传参增加部分数据
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:27
     */
    int insertSelective(PetBoarding record);

    /**
     * 通过ID获取数据
     *
     * @param id: 传输ID
     * @return: com.hr.bak.product.orm.dto.BakDischarge
     * @Author: XGP
     * @Date: 2021/3/22 8:27
     */
    PetBoardingEntity selectByPrimaryKey(String id);

    /**
     * 修改部分数据
     *
     * @param record: 所要修改数据
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:27
     */
    int updateByPrimaryKeySelective(PetBoarding record);

    /**
     * 修改所有数据
     *
     * @param record: 所有要修改数据
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:28
     */
    int updateByPrimaryKey(PetBoarding record);

    /**
     * 获取所有数据
     *
     * @param record: 获取数据所带条件
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:28
     */
    List<PetBoardingEntity> getPage(PetBoarding record);


    /**
     * 获取已寄养宠物分类数据
     *
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:28
     */
    List<HomeEntity> fosterCareClassification();


    /**
     * 每日寄养数量趋势 By天
     *
     * @return: int
     * @Author: XGP
     * @Date: 2021/3/22 8:28
     */
    List<HomeEntity> dailyFosterOrder();

}
package com.janita.mybatis.dao;

import com.janita.mybatis.entity.HospitalEquipmentRecord;

import java.util.List;

/**
 * Created by com.huizhi.medical.backstage.MybatisCodeGenerate on 2017-07-04
 */
public interface HospitalEquipmentRecordDAO {
    int deleteByPrimaryKey(String equipmentId);

    void insert(HospitalEquipmentRecord record);

    void insertSelective(HospitalEquipmentRecord record);

    void insertBatch(List<HospitalEquipmentRecord> records);

    HospitalEquipmentRecord selectByPrimaryKey(String equipmentId);

    int updateByPrimaryKeySelective(HospitalEquipmentRecord record);

    int updateByPrimaryKey(HospitalEquipmentRecord record);
}
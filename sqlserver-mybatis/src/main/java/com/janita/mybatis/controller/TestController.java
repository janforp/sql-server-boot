package com.janita.mybatis.controller;

import com.janita.mybatis.dao.HospitalEquipmentRecordDAO;
import com.janita.mybatis.entity.HospitalEquipmentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017/7/5 0005-下午 5:45
 * 该类是：
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private final HospitalEquipmentRecordDAO recordDAO;

    @Autowired(required = false)
    public TestController(HospitalEquipmentRecordDAO recordDAO) {
        this.recordDAO = recordDAO;
    }

    @PostMapping
    public HospitalEquipmentRecord create(@RequestBody HospitalEquipmentRecord record) {
        recordDAO.insert(record);
        return record;
    }

    @GetMapping("/{id}")
    public HospitalEquipmentRecord query(@PathVariable String id) {
        return recordDAO.selectByPrimaryKey(id);
    }
}

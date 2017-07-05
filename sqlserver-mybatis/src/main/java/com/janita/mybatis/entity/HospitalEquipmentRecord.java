package com.janita.mybatis.entity;

/**
 * Created by com.huizhi.medical.backstage.MybatisCodeGenerate on 2017-07-04
 */
public class HospitalEquipmentRecord implements java.io.Serializable {

    // Fields

    // 医技id
    private String equipmentId;
    // 医技所属科室id
    private String departmentId;
    // 机构编码，医院id
    private String hospitalId;
    // 医技名称，如：B超，CT
    private String name;

    // Constructors

    /**
     * default constructor
     */
    public HospitalEquipmentRecord() {
    }

    /**
     * full constructor
     */
    public HospitalEquipmentRecord(String equipmentId, String departmentId, String hospitalId, String name) {
        this.equipmentId = equipmentId;
        this.departmentId = departmentId;
        this.hospitalId = hospitalId;
        this.name = name;
    }

    // Property accessors

    /**
     * 医技id
     */
    public String getEquipmentId() {
        return this.equipmentId;
    }

    /**
     * 医技id
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 医技所属科室id
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * 医技所属科室id
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 机构编码，医院id
     */
    public String getHospitalId() {
        return this.hospitalId;
    }

    /**
     * 机构编码，医院id
     */
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 医技名称，如：B超，CT
     */
    public String getName() {
        return this.name;
    }

    /**
     * 医技名称，如：B超，CT
     */
    public void setName(String name) {
        this.name = name;
    }

}
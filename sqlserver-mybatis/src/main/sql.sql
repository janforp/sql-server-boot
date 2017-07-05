create table hospital_equipment_record
(
  equipment_id VARCHAR(36) NOT NULL ,
  department_id VARCHAR(36) DEFAULT NULL ,
  hospital_id VARCHAR(36) DEFAULT NULL ,
  name VARCHAR(50) DEFAULT NULL ,
  PRIMARY KEY (equipment_id)
);
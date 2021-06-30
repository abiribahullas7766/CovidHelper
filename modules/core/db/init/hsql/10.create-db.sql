-- begin COVIDHELPER_DIAGNOSIS
create table COVIDHELPER_DIAGNOSIS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AUTO_NUM varchar(255),
    DOCTOR_ID varchar(36) not null,
    PATIENT_ID varchar(36) not null,
    FEVER boolean not null,
    COUGH boolean not null,
    SHORTNESS_BREATH boolean,
    FATIGUE boolean,
    MUSCLE_ACHES boolean,
    HEADACHE boolean,
    LOSS_TASTE boolean,
    SORE_THROAT boolean,
    CONGESTION boolean,
    NAUSEA boolean,
    DIARRHEA boolean,
    TOTAL_SCORE integer,
    --
    primary key (ID)
)^
-- end COVIDHELPER_DIAGNOSIS
-- begin COVIDHELPER_PATIENT
create table COVIDHELPER_PATIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(20) not null,
    LAST_NAME varchar(20) not null,
    BIRTH_DAY date,
    GENDER integer not null,
    --
    primary key (ID)
)^
-- end COVIDHELPER_PATIENT
-- begin COVIDHELPER_DOCTOR
create table COVIDHELPER_DOCTOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(20) not null,
    LAST_NAME varchar(20) not null,
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end COVIDHELPER_DOCTOR
-- begin COVIDHELPER_COVID_LEVEL
create table COVIDHELPER_COVID_LEVEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SCORE integer not null,
    LEVEL_ varchar(255) not null,
    --
    primary key (ID)
)^
-- end COVIDHELPER_COVID_LEVEL

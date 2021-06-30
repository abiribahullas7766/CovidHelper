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
);
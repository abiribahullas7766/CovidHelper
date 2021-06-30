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
);
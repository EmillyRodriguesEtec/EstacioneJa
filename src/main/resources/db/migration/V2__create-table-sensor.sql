create table sensor (
            id_sensor numeric(6) constraint sensor_id_pk primary key,
            latitude varchar(40) constraint sensor_latitude_nn not null,
            longitude varchar(40) constraint sensor_longitude_nn not null,
            vaga_sensor numeric(6) constraint sensor_vaga_nn not null
);
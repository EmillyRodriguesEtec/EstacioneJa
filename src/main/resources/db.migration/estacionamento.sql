create table estacionamento (
        id_estacionamento numeric(6) constraint estacionamento_id_pk primary key,
        nome_estacionamento varchar(40) constraint estacionamento_nome_nn not null,
        url_rede_sensores varchar(40) constraint estacionamento_url_nn not null,
        id_usuario numeric(6) constraint estacionamento_usuario_fk references usuario
);
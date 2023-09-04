create table usuario_vaga (
        id_usuario numeric(6) constraint usuario_vaga_idusuario_fk references usuario,
        id_vaga numeric(6) constraint usuario_vaga_idvaga_fk references vaga
);
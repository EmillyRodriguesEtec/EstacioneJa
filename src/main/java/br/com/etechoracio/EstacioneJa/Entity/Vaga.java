package br.com.etechoracio.EstacioneJa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/*id_vaga numeric(6) constraint vagaid_pk primary key,
        latitude varchar(40) constraint vaga_latitude_nn not null,
        longitude varchar(40) constraint vaga_longitude_nn not null,
        secao_vaga varchar(10) constraint vaga_secao_nn not null,
        disponibilidade_vaga numeric(2) constraint vaga_disponibilidade_nn not null,
        andar_vaga numeric(6) constraint vaga_andar_nn not null,
        numero_vaga numeric(6) constraint vaga_numero_nn not null,
        preferencial_vaga numeric(2) constraint vaga_preferencia_nn not null,
        id_sensor numeric(6) constraint vaga_sensor_fk references sensor,
        id_estacionamento numeric(6) constraint vaga_estacionamento_fk references estacionamento*/
@Entity
@Getter
@Setter
@Table(name = "vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaga")
    private BigInteger id;

    @Column(name = "latitude_vaga")
    private String latitude;

    @Column(name = "longitude_vaga")
    private String longitude;

    @Column(name = "secao_vaga")
    private String secao;

    @Column(name = "disponibilidade_vaga")
    private boolean disponibilidade;

    @Column(name = "andar_vaga")
    private int andar;

    @Column(name = "numero_vaga")
    private int numero;

    @Column(name = "preferencial_vaga")
    private String preferencial;

}

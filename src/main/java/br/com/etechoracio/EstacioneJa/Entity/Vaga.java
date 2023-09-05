package br.com.etechoracio.EstacioneJa.Entity;

import br.com.etechoracio.EstacioneJa.enums.DisponibilidadeEnum;
import br.com.etechoracio.EstacioneJa.enums.PreferenciaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@Table(name = "vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaga")
    private BigInteger id;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "secao_vaga")
    private String secao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "disponibilidade_vaga")
    private DisponibilidadeEnum disponibilidade;

    @Column(name = "andar_vaga")
    private BigInteger andar;

    @Column(name = "numero_vaga")
    private BigInteger numero;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "preferencial_vaga")
    private PreferenciaEnum preferencial;

    @JoinColumn(name = "id_sensor")
    @OneToOne
    private Sensor sensor;

    @JoinColumn(name = "id_estacionamento")
    @ManyToOne
    private Estacionamento estacionamento;
}

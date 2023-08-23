package br.com.etechoracio.EstacioneJa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaga")
    private long id;

    @Column(name = "latitude_vaga")
    private int latitude;

    @Column(name = "longitude_vaga")
    private int longitude;

    @Column(name = "secao_vaga")
    private String secao;

    @Column(name = "preferencial_vaga")
    private String preferencial;//nao lembro o tipo de dado

    @Column(name = "andar_vaga")
    private int andar;

    @Column(name = "numero_vaga")
    private int numero;

    @Column(name = "disponibilidade_vaga")
    private boolean disponibilidade;

}

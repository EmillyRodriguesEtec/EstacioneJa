package br.com.etechoracio.EstacioneJa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name = "estacionamento")
public class Estacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacionamento")
    private BigInteger id;

    @Column(name = "nome_estacionamento")
    private String nome;

    @Column(name = "url_rede_sensores")
    private String urlRedeSensores;

    @JoinColumn(name = "id_usuario")
    @ManyToOne
    private Usuario usuario;
}

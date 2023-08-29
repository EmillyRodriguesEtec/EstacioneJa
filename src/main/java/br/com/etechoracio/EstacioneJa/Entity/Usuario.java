package br.com.etechoracio.EstacioneJa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "senha_usuario")
    private String senha;

    @Column(name = "senha_hash")
    private String hash;

    @Column(name = "senha_salt")
    private String salt;

    @Column(name = "cpf_usuario")
    private String cpf;

    @Column(name = "nome_usuario")
    private String nome;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;
}

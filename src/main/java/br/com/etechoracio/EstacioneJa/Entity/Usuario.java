package br.com.etechoracio.EstacioneJa.Entity;

import br.com.etechoracio.EstacioneJa.enums.PreferenciaEnum;
import br.com.etechoracio.EstacioneJa.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private BigInteger id;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "senha_usuario")
    private String senha;

    @Column(name = "senha_hash")
    private String senhaHash;

    @Column(name = "senha_salt")
    private String senhaSalt;

    @Column(name = "cpf_usuario")
    private char cpf;

    @Column(name = "nome_usuario")
    private String nome;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "preferencia_vaga")
    private PreferenciaEnum preferencia;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario")
    private TipoUsuarioEnum tipoUsuario;

}

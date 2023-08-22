package br.com.etechoracio.EstacioneJa.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long id;

    @Column(name = "data_pagamento")
    private String data;

    @Column(name = "emissor_pagamento")
    private String emissor;

    @Column(name = "receptor_pagamento")
    private String receptor;

    @Column(name = "forma_pagamento")
    private String formaPagamento;
}

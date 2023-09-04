package br.com.etechoracio.EstacioneJa.Entity;

import br.com.etechoracio.EstacioneJa.enums.PagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private BigInteger id;

    @Column(name = "data_pagamento")
    private LocalDate data;

    @Column(name = "emissor_pagamento")
    private String emissor;

    @Column(name = "receptor_pagamento")
    private String receptor;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento")
    private PagamentoEnum formaPagamento;
}

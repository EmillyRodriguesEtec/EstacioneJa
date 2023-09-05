create table usuario_pagamento (
        id_usuario numeric(6) constraint usuario_pagamento_idusuario_fk references usuario,
        id_pagamento numeric(6) constraint usuario_pagamento_idpagamento_fk references pagamento
);
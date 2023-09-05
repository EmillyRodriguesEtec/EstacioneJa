CREATE TABLE pagamento (
            id_pagamento numeric(6) constraint pagamento_id_pk primary key,
            data_pagamento date constraint pagamento_data_nn not null,
            emissor_pagamento varchar(60) constraint pagamento_emissor_nn not null,
            receptor_pagamento varchar(60) constraint pagamento_receptor_nn not null,
            forma_pagamento varchar(20) constraint pagamento_forma_nn not null
);
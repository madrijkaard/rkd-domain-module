CREATE TABLE domain_column (
    id BIGSERIAL PRIMARY KEY,
    code VARCHAR(36) NOT NULL,
    status CHAR(1) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    last_changed TIMESTAMP NOT NULL,
    name VARCHAR(50) NOT NULL,
    domain_id BIGINT NOT NULL,
    column_type_id BIGINT NOT NULL,
    CONSTRAINT fk_domain FOREIGN KEY (domain_id) REFERENCES domain (id),
    CONSTRAINT fk_column_type FOREIGN KEY (column_type_id) REFERENCES column_type (id)
);

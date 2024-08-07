CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE column_type (
    id BIGSERIAL PRIMARY KEY,
    code VARCHAR(36) NOT NULL,
    status CHAR(1) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    last_changed TIMESTAMP NOT NULL,
    name VARCHAR(50) NOT NULL,
    path VARCHAR(255),
    domain_id BIGINT,
    CONSTRAINT fk_domain FOREIGN KEY (domain_id) REFERENCES domain (id)
);

INSERT INTO column_type (code, status, name, path, domain_id, creation_date, last_changed)
VALUES
    (uuid_generate_v4()::VARCHAR, 'A', 'Int', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Double', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Float', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Long', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Short', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Byte', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Char', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Boolean', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'String', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'List', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Set', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Map', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Array', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Pair', NULL, NULL, NOW(), NOW()),
    (uuid_generate_v4()::VARCHAR, 'A', 'Triple', NULL, NULL, NOW(), NOW());

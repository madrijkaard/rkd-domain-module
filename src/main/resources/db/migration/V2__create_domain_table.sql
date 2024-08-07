CREATE TABLE domain (
    id BIGSERIAL PRIMARY KEY,
    code VARCHAR(36) NOT NULL,
    status CHAR(1) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    last_changed TIMESTAMP NOT NULL,
    name VARCHAR(50) NOT NULL,
    project_id BIGINT,
    CONSTRAINT fk_project FOREIGN KEY (project_id) REFERENCES project (id)
);
--Table status
INSERT INTO status(id, name, description, created_at)
SELECT 1, 'Iniciada', 'Iniciada', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM status WHERE id = 1);

INSERT INTO status(id, name, description, created_at)
SELECT 2, 'En proceso', 'En proceso', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM status WHERE id = 2);

INSERT INTO status(id, name, description, created_at)
SELECT 3, 'Terminada', 'Terminada', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM status WHERE id = 3);

--Table priority
INSERT INTO priority(id, name, description, created_at)
SELECT 1, 'Urgente', 'Urgente', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM priority WHERE id = 1);

INSERT INTO priority(id, name, description, created_at)
SELECT 2, 'Normal', 'Normal', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM priority WHERE id = 2);

INSERT INTO priority(id, name, description, created_at)
SELECT 3, 'Bajo', 'Bajo', CURRENT_TIMESTAMP() FROM DUAL
WHERE NOT EXISTS (SELECT id FROM priority WHERE id = 3);

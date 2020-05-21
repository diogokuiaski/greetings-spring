CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE translation (
    id uuid DEFAULT uuid_generate_v4 (),
    original_language  VARCHAR,
    original   VARCHAR,
    translated_language   VARCHAR,
    translated   VARCHAR
);

INSERT INTO translation (original_language, original, translated_language, translated) VALUES ('pt-br', 'oi', 'en-us', 'hi');
INSERT INTO translation (original_language, original, translated_language, translated) VALUES ('pt-br', 'como vai', 'en-us', 'how are you');
INSERT INTO translation (original_language, original, translated_language, translated) VALUES ('pt-br', 'tchau', 'en-us', 'good bye');
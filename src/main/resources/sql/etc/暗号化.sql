-- ■ 暗号化プラグインのインストール
CREATE EXTENSION PGCRYPTO;

SELECT
    PGP_SYM_ENCRYPT('abcde', 'password');

SELECT
    PGP_SYM_ENCRYPT_BYTEA('abcde', 'password');

SELECT
    PGP_SYM_DECRYPT(password, 'password')
from
    m_user;

SELECT
    username,
    PGP_SYM_DECRYPT(password, 'password'),
    role_cd AS roleCd
FROM
    m_user
WHERE
    username = 'test';
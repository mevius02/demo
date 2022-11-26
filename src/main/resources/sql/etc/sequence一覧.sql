-- ■[検索] SEQUENCE 一覧
-- ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
SELECT
    c.relname
FROM
    pg_class c
    LEFT JOIN pg_user u ON c.relowner = u.usesysid
WHERE
    c.relkind = 'S';
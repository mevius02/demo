-- ■[追加] TABLE
-- ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
CREATE TABLE m_user(
    serial_no INTEGER NOT NULL DEFAULT nextval('seq_m_user_serial_no'),
    user_id VARCHAR (100) NOT NULL,
    password VARCHAR (255) NOT NULL,
    role_cd VARCHAR (50) NOT NULL,
    user_nm VARCHAR (100) NOT NULL,
    mail_address VARCHAR (100) NOT NULL,
    account_expiration DATE NOT NULL,
    password_expiration DATE NOT NULL,
    enabled BOOLEAN NOT NULL,
    deleted BOOLEAN NOT NULL,
    insert_user_id VARCHAR (20) NOT NULL,
    insert_timestamp TIMESTAMP NOT NULL,
    update_user_id VARCHAR (20),
    update_timestamp TIMESTAMP,
    delete_user_id VARCHAR (20),
    delete_timestamp TIMESTAMP,
    PRIMARY KEY (user_id)
);

CREATE TABLE m_role(
    serial_no INTEGER NOT NULL DEFAULT nextval('seq_m_role_serial_no'),
    role_cd VARCHAR (50) NOT NULL,
    role_nm VARCHAR (50) NOT NULL,
    deleted BOOLEAN NOT NULL,
    insert_user_id VARCHAR (20) NOT NULL,
    insert_timestamp TIMESTAMP NOT NULL,
    update_user_id VARCHAR (20),
    update_timestamp TIMESTAMP,
    delete_user_id VARCHAR (20),
    delete_timestamp TIMESTAMP,
    PRIMARY KEY (role_cd)
);

-- ■[追加] TABLE COLUMN 論理名
-- ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
-- ■ Mユーザー
COMMENT ON TABLE m_user IS 'Mユーザー';

COMMENT ON COLUMN m_user.serial_no IS 'シリアルNo';

COMMENT ON COLUMN m_user.user_id IS 'ユーザーID';

COMMENT ON COLUMN m_user.password IS 'パスワード';

COMMENT ON COLUMN m_user.role_cd IS '権限CD';

COMMENT ON COLUMN m_user.user_nm IS 'ユーザー名';

COMMENT ON COLUMN m_user.mail_address IS 'メールアドレス';

COMMENT ON COLUMN m_user.account_expiration IS 'アカウント有効期限';

COMMENT ON COLUMN m_user.password_expiration IS 'パスワード有効期限';

COMMENT ON COLUMN m_user.enabled IS '有効フラグ';

COMMENT ON COLUMN m_user.deleted IS '削除フラグ';

COMMENT ON COLUMN m_user.insert_user_id IS '追加ユーザーID';

COMMENT ON COLUMN m_user.insert_timestamp IS '追加日時';

COMMENT ON COLUMN m_user.update_user_id IS '更新ユーザーID';

COMMENT ON COLUMN m_user.update_timestamp IS '更新日時';

COMMENT ON COLUMN m_user.delete_user_id IS '削除ユーザーID';

COMMENT ON COLUMN m_user.delete_timestamp IS '削除日時';

-- ■ M権限
COMMENT ON TABLE m_role IS 'M権限';

COMMENT ON COLUMN m_role.serial_no IS 'シリアルNo';

COMMENT ON COLUMN m_role.role_cd IS '権限CD';

COMMENT ON COLUMN m_role.role_nm IS '権限名';

COMMENT ON COLUMN m_role.deleted IS '削除フラグ';

COMMENT ON COLUMN m_role.insert_user_id IS '追加ユーザーID';

COMMENT ON COLUMN m_role.insert_timestamp IS '追加日時';

COMMENT ON COLUMN m_role.update_user_id IS '更新ユーザーID';

COMMENT ON COLUMN m_role.update_timestamp IS '更新日時';

COMMENT ON COLUMN m_role.delete_user_id IS '削除ユーザーID';

COMMENT ON COLUMN m_role.delete_timestamp IS '削除日時';
package com.example.password_generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordGeneratorApplication.class, args);

		File beforeFile = new File("beforePass.txt");
		String password = null;
		try (BufferedReader br = new BufferedReader(new FileReader(beforeFile))) {
			password = br.readLine();
			// ソルト値
			String salt = "03b7xat8";
			int stretch = 1000;
			String passwordSalt = password + salt;
			byte[] passwordSaltByte = passwordSalt.getBytes();
			try {
				MessageDigest sha3 = MessageDigest.getInstance("SHA3-512");
				for (int i = 0; i < stretch; i++) {
					passwordSaltByte = sha3.digest(passwordSaltByte);
				}
			} catch (NoSuchAlgorithmException e) {
				System.out.println("暗号化エラー");
				System.out.println(e);
			}
			// 16進数表記の文字列化
			String hashed = String.format("%040x", new BigInteger(1, passwordSaltByte));
			File afterFile = new File("afterPass.txt");
			FileWriter fw = new FileWriter(afterFile);
			fw.write(hashed);
			fw.close();
		} catch (IOException e) {
			System.out.println("ファイル読み込みエラー");
			System.out.println(e);
			lastShow(false, 10000);
			System.exit(0);
		}
		lastShow(true, 3000);
		System.exit(0);
	}

	private static void lastShow(boolean result, int stopTime) {
		try {
			System.out.println(result ? "★★★ 成功しました ★★★" : "※※※ 失敗しました ※※※");
			Thread.sleep(stopTime);
			return;
		} catch (Exception e) {
			System.out.println("ストップエラー");
			System.out.println(e);
		}
	}
}

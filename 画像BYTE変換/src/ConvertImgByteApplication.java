package com.example.convert_img_byte;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConvertImgByteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertImgByteApplication.class, args);

		// フォルダ[generateTable]内の全ファイル名を取得
		File before = new File("before/");
		String[] imgFilePathList = before.list();
		try {
			for (int i = 0; i < imgFilePathList.length; i++) {
				System.out.println("★彡 【" + imgFilePathList[i] + "】のファイルを変換中... ★彡");

				// 画像ファイル名取得(ファイル名から拡張子切り抜きしただけ)
				String createFileNm = imgFilePathList[i].substring(0, imgFilePathList[i].lastIndexOf("."));

				byte[] imgByte = Files.readAllBytes(Paths.get("before/" + imgFilePathList[i]));

				FileOutputStream fos = new FileOutputStream("after/" + createFileNm + ".txt");
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				baos.write(imgByte);
				baos.writeTo(fos);
				baos.close();
				fos.close();
			}
		} catch (Exception e) {
			System.out.println("BYTE変換エラー");
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

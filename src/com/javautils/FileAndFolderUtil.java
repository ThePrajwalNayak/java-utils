package com.javautils;

import java.io.File;
import java.io.IOException;

/**
 * FileAndFolderUtil class provide functionality to work with file and folder
 * 
 * @author prajwalnayak
 *
 */
public class FileAndFolderUtil {

	public static boolean createFileForceFully(String fileName) {
		boolean isFileCraeted = false;
		if (StringUtil.isStringNotEmpty(fileName)) {
			File file = new File(fileName);
			file.delete();
			try {
				file.createNewFile();
				isFileCraeted = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isFileCraeted;
	}
}

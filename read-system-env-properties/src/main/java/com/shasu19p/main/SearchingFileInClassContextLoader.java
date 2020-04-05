package com.shasu19p.main;

import java.io.InputStream;
import java.util.Objects;

public class SearchingFileInClassContextLoader {

	public static void main(String[] args) throws Exception {

		SearchingFileInClassContextLoader loader = new SearchingFileInClassContextLoader();

		StringBuilder filename = new StringBuilder("catalina.out");
		final String pdir = "/logs/";

		InputStream is = null;

		try {
			filename.insert(0, pdir);
			is = loader.inputStreamFromClasspath(filename);
		} catch (Exception ex) {
			filename.delete(1, pdir.length());
			is = loader.inputStreamFromClasspath(filename);
		}

		if (Objects.isNull(is)) {
			throw new Exception("File not found in complete context");
		}
	}

	public InputStream inputStreamFromClasspath(StringBuilder filename) throws Exception {

		InputStream is = null;
		// is =
		// SearchingFileInClassContextLoader.class.getResourceAsStream(filename.toString());

		is = getClass().getResourceAsStream(filename.toString());
		if (null != is) {
			return is;
		}

		is = ClassLoader.getSystemResourceAsStream(filename.toString());
		if (null != is) {
			return is;
		}

		is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename.toString());
		if (null != is) {
			return is;
		}

		// is == null
		throw new Exception("File is missing in all places");
	}
}
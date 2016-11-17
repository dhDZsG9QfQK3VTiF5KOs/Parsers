package com.solly.parser;

public abstract class DelimitedTextParser {
	public static String DEFAULT_FIELD_SEPARATOR;
	public static String DEFAULT_LINE_SEPARATOR;
	
	public static String[][] parseFile(String text) {
		String[] lines = text.split(DEFAULT_LINE_SEPARATOR);
		String[][] result = {};
		for(String line : lines) {
			result[result.length] = parseLine(line);
		}
		return result;
	}
	public static String[] parseLine(String line) {
		return line.split(DEFAULT_FIELD_SEPARATOR);
	}
}

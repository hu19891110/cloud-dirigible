package com.sap.dirigible.runtime.filter;

import org.apache.commons.lang.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class XSSUtils {

	public static String stripXSS(String value) {
		if (value != null) {
			value = StringEscapeUtils.escapeHtml(value);
			// value = StringEscapeUtils.escapeJavaScript(value);
			value = Jsoup.clean(value, Whitelist.none());
		}
		return value;
	}

}
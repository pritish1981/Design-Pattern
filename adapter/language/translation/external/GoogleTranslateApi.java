package adapter.language.translation.external;

import static adapter.language.translation.external.ApiUtils.logGoogleGetSupportedLanguages;
import static adapter.language.translation.external.ApiUtils.logGoogleTranslate;

import java.util.List;

public class GoogleTranslateApi {

	public String convert(GoogleTranslationRequest request) {
		// Implementation for translating text using Google Translate API
		logGoogleTranslate();
		return "Translated text";
	}

	public List<String> getLanguages() {
		// Implementation for fetching supported languages from Google Translate
		logGoogleGetSupportedLanguages();
		return List.of("hindi", "marathi", "kannada");
	}
}
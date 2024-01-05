package adapter.language.translation;

import java.util.List;

import adapter.language.translation.external.GoogleTranslateApi;
import adapter.language.translation.external.GoogleTranslationRequest;

public class GoogleTranslateAdapter implements TranslationProviderAdapter {
    private GoogleTranslateApi googleApi = new GoogleTranslateApi();

    public String translate(TranslationRequest request) {
        GoogleTranslationRequest googleRequest = new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(), 
                                                                                request.getTargetLanguage(), request.getConfidenceThreshold());
        return googleApi.convert(googleRequest);
    }

    public List<String> getSupportedLanguages() {
        return googleApi.getLanguages();
    }
}

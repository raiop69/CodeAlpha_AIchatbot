import java.util.Map;

public class ChatEngine {

    private final NLPProcessor nlp = new NLPProcessor();

    public String getResponse(String message) {

        String input = nlp.normalize(message);

        Map<String, String> faq = FAQData.getFAQs();

        for(String key : faq.keySet()) {

            if(input.contains(key)) {
                return faq.get(key);
            }
        }

        return "Sorry,Cant answer that right now.";
    }
}
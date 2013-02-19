package ae.samples.dto.tranformer;

import br.com.machinae.assemblae.Transformer;

public class TelephoneFormatter implements Transformer <String, String> {

    @Override
    public String transform(String data) {
        if(data == null)
            return null;
        return data.replaceFirst("(\\d{2})(\\d{2})(\\d+)", "+ $1 ($2)$3");
    }

    @Override
    public String reverse(String data) {
        throw new RuntimeException("Not implemented yet");
    }
}

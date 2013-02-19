package ae.samples.dto.tranformer;

import br.com.machinae.assemblae.Transformer;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.util.Calendar.YEAR;


public class YearTransformer implements Transformer<Date, Integer> {

    @Override
    public Integer transform(Date date) {
        Calendar now = getCalendar(new Date());
        Calendar birth = getCalendar(date);

        return now.get(YEAR) - birth.get(YEAR);
    }

    @Override
    public Date reverse(Integer data) {
        throw new RuntimeException("Not implemented yet");
    }

    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
}

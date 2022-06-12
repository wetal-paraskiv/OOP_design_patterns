package abstract_factory;

import java.util.Calendar;
import java.util.Date;

public class ExpiryCalendar {

    public Date getExpiryDate(int days) {
        Date currentDate = new Date();

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date
        c.add(Calendar.DATE, days); //same with c.add(Calendar.DAY_OF_MONTH, 1);

        // convert calendar to date
        Date expireDate = c.getTime();
        return expireDate;
    }
}

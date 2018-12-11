import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void shouldReturnDateWhenParametersGiven() {
        //given
        String stringDate = "1995:12:10";
        String divider = ":";
        //when
        Date expectedDate = Date.createDate(stringDate,divider);
        Date actualDate = new Date(1995,12,10);
        //then
        assertEquals(expectedDate.getDay(),actualDate.getDay());
        assertEquals(expectedDate.getMonth(),actualDate.getMonth());
        assertEquals(expectedDate.getYear(),actualDate.getYear());
    }

}
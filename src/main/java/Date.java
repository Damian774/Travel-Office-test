import java.util.StringTokenizer;

public class Date {
    private int day;
    private int month;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private int year;

    public static Date createDate(String s,String dividers){
        StringTokenizer parser = new StringTokenizer(s,dividers);
        Date date = new Date();
        int counter = 0;
        while (parser.hasMoreTokens()) {
            String token = parser.nextToken();
            switch(counter){
                case 0:
                    date.year=Integer.parseInt(token);
                    break;
                case 1:
                    date.month=Integer.parseInt(token);
                    break;
                case 2:
                    date.day=Integer.parseInt(token);
                    break;
            }
            counter++;
        }
        return date;
    }
    public Date(){
        this.day=1;
        this.month=1;
        this.year=1900;
    }
    public Date(int year, int month,int day){
        this.day =day;
        this.month=month;
        this.year=year;
    }


    @Override
    public String toString() {
        return "year: "+year+" month: "+month+" day: "+day+"\n";
    }


}

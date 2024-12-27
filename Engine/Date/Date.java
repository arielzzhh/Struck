package Engine.Date;

public class Date {

    // Instance variables (non-static, each instance has its own values)
    private int sec;
    private int min;
    private int hour;
    private int day;
    private int month;
    private int year;
    private int yearType;

    // Constructor to initialize the Date object
    public Date(int sec,int min, int hour, int day, int month, int year, int type) {
        this.sec=sec;
        this.min = min;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
        this.yearType = type;
    }
    
    
    
    public Date(){
    this.sec=5;
      this.min = 0;
        this.hour = 1;
        this.day = 1;
        this.month = 1;
        this.year = 8200000;
        this.yearType = 0;
    }
    
    

    // Method to return a string based on 'type'
    public String typeDef() {
        switch (this.yearType) {
            case 0:
                return "bilions years ago ";
            case 1:
                return "milion years ";
            case 2:
                return "Century";
            case 3:
                return "Decade";
            case 4:
                return "Year";
            case 5:
                return "Month";
            case 6:
                return "Day";
            default:
                return "Unknown type";
        }
    }
    
    
    public  void  lowerYearUnit(){
    this.year--;
    }
    
    
    
    

    // Getter methods for the Date properties
    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getType() {
        return yearType;
    }

    // Setter methods for the Date properties
    public void setMin(int min) {
        this.min = min;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(int type) {
        this.yearType = type;
    }

    @Override
    public String toString() {
        return "clock"+this.year+"/"+this.typeDef();
    }
    
    





}
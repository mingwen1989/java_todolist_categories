public class LeapYear {
  public static void main(String[] args){}

  public Boolean isLeapYear(Integer year){
    if (year % 400 == 0){
      return true;
    } else if (year % 100 == 0){
      return false;
    } else {
      return year % 4 == 0;
    }
  }

}

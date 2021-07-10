import java.io.*;
import java.util.*;


public class Time{
  private int hour;
  private int minute;
  private double second;


  public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }


  public Time(int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour(){
		return this.hour;
	}

	public int getMinute(){
		return this.minute;
	}

	public double getSecond(){
		return this.second;
	}

  public void setHour(int hour){
		this.hour = hour;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public void setSecond(double second){
		this.second = second;
	}

  public static void printTime(Time t){
		System.out.printf("%02d:%02d:%04.1f\n",t.hour,t.minute,t.second);
	}

	public void printTimeAlt(){
		System.out.printf("%02d:%02d:%04.1f\n",hour,minute,second);
  }

  public String toString() {
		return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
  }

  Time time = new Time(8, 40, 40.00);
}

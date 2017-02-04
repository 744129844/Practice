package com.ren.vc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author RenJie
 *
 */
public class VisaulCalendar {
	
	public static void main(String[] args) {
		System.out.println("请输入日期（注意格式为yyyy-MM-dd）");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = f.parse(str);
			Calendar c = new GregorianCalendar();
			c.setTime(d);
			int ddd = c.get(Calendar.DATE);
			c.set(Calendar.DATE, 1);
			
			int firstd = c.get(Calendar.DAY_OF_WEEK);
			
			int totald = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			for (int i = 1; i < firstd; i++) {
				System.out.print("\t");
			}
			
			int dd;
			for (int i = 1; i <= totald; i++) {
				if (i==ddd) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				if (c.get(Calendar.DAY_OF_WEEK)==7) {
					System.out.println();
				}
				c.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

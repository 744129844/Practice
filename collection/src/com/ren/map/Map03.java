package com.ren.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map03 {
	
	public static void main(String[] args) {
		
		List<Student> stulist = exam();
		Map<String,ClassRoom> map = count(stulist);
		view(map);
		
	}
	
	public static void view(Map<String,ClassRoom> map){
		Set<String> keys = map.keySet();
		Iterator<String> keysIt = keys.iterator();
		while(keysIt.hasNext()){
			String no = keysIt.next();
			ClassRoom room = map.get(no);
			double total = room.getTotal();
			double avg = total/room.getStuList().size();
			System.out.println(no+"-->"+total+"-->"+avg);
		}
	}
	
	public static Map<String,ClassRoom> count(List<Student> list){
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		for(Student stu:list){
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom room = map.get(stu.getNo());
			if(null == room){
				room = new ClassRoom(no);
				map.put(no, room);
			}
			room.getStuList().add(stu);
			room.setTotal(room.getTotal()+score);
		}
		
		return map;
	}
	
	public static List<Student> exam(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("1","a",90));
		list.add(new Student("2","a",80));
		list.add(new Student("3","b",95));
		list.add(new Student("4","b",80));
		return list;
	}

}

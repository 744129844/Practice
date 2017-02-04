package com.ren.sort.erfType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsItem implements java.lang.Comparable<NewsItem>{
	
	private String title;
	private int hits;
	private Date putTime;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPutTime() {
		return putTime;
	}
	public void setPutTime(Date putTime) {
		this.putTime = putTime;
	}
	public NewsItem(String title, int hits, Date putTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.putTime = putTime;
	}
	public NewsItem(){
		
	}
	@Override
	public int compareTo(NewsItem o) {
		int result = 0;
		result = -this.putTime.compareTo(o.putTime);
		if (0==result) {
			result = this.hits-o.hits;
			if (0==result) {
				result = this.title.compareTo(o.title);
			}
		}
		return result;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|标题：").append(this.title);
		sb.append("|时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.putTime));
		sb.append("|点击量：").append(this.hits).append("|\n");
		return sb.toString();
	}
	
}

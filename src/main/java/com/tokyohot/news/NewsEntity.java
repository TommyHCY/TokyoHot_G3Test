package com.tokyohot.news;

import java.util.Objects;

public class NewsEntity {
	private int newsId;
	private String newsContent;
	
	public NewsEntity(int newsId, String newsContent) {
		super();
		this.newsId = newsId;
		this.newsContent = newsContent;
	}
	
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	
	@Override
	public String toString() {
		return "NewsEntity [newsId=" + newsId + ", newsContent=" + newsContent + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(newsContent, newsId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsEntity other = (NewsEntity) obj;
		return Objects.equals(newsContent, other.newsContent) && newsId == other.newsId;
	}
	
	
}

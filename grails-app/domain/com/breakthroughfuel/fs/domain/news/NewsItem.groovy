package com.breakthroughfuel.fs.domain.news

import java.io.Serializable
import java.util.Date;

class NewsItem implements Serializable {
	
	private static final long serialVersionUID = 111L
	
	Date dateAdded
	Date lastChanged
	String newsItem
	boolean enabledFlag
	boolean websiteFlag
	
	static mapping = {
		table name:'news_items', schema:"news"
		//cache = false
		version false
		id generator:'sequence', params:[sequence:'news.news_item_id_seq']
		columns {
			id column:'id'
		}
	}

}

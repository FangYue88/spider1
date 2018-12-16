package edu.csuft.fangyue.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
import org.jsoup.select.Elements;





public class App {	
	/*
	 * author@ fangyue
	 * fangyue love luhuan
	 * 方月 鲁桓 喜欢
	 * 
	 */
	public static void main(String[] args) {
		//目标URL
		String url="https://movie.douban.com/top250";
		//使用JSoup抓取文档
		try {
			Document doc=Jsoup.connect(url).get();
			
			Elements es= doc.select(".grid_view .item");
			System.out.println(es.size());
			
			for(Element e:es)
			{
				//每一部影片
				Element t=e.select(".title").first();
				String temp=e.select(".star span").last().text();
				System.out.println(t.text()+","+temp.substring(0,temp.length()-3));
			}
			
//			String title=doc.title();
//			String data=doc.data();
//			 
//			System.out.println(title);
//			System.out.println(data);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

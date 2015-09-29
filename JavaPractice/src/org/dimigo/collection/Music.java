/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *  ㄴMusic
 * </pre>
 * @author : 장태진
 * @version: 1.0
 */
public class Music {
	private String title;
	private String singer;
	public Music(String title, String singer)	{
		this.title = title;
		this.singer = singer;
	}
	public void setTitle(String title, String singer)	{
		this.title = title;
		this.singer = singer;
	}
	public String getTitle()	{
		return this.title;
	}
	public void setSinger(String singer)	{
		this.singer = singer;
	}
	public String getSinger()	{
		return this.singer;
	}
	public String toString()	{
		return "Music [title=" + this.title + ", singer=" + this.singer + "]";
	}
}

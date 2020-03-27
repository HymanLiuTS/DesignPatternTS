package cn.codenest.virtualproxy;


import java.awt.*;
import java.net.URL;

/**
 * @author Hyman
 * @version 1.0
 * @created 27-3月-2020 17:09:30
 */
public class ImageIcon implements Icon {

	URL imageURL;
	String title;
	public ImageIcon(URL imageURL,String title){
		this.imageURL=imageURL;
		this.title=title;
	}

	public void finalize() throws Throwable {

	}
	public int getIconWidth(){
		return 0;
	}

	public int getIconHeight(){
		return 0;
	}

	public void paintIcon(final Component c, Graphics g, int x, int y){

	}
}//end ImageIcon
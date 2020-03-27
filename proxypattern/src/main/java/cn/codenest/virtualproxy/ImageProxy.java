package cn.codenest.virtualproxy;


import java.awt.*;
import java.net.URL;

/**
 * @author Hyman
 * @version 1.0
 * @created 27-3月-2020 17:09:34
 */
public class ImageProxy implements Icon {

    public ImageIcon imageIcon;

    URL imageURL;

    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
		this.imageURL=url;
    }

    public int getIconWidth() {
        if(imageIcon!=null){
        	return imageIcon.getIconWidth();
		}
    	return 800;
    }

    public int getIconHeight() {
		if(imageIcon!=null){
			return imageIcon.getIconHeight();
		}
		return 600;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
    	if(imageIcon!=null)
    		imageIcon.paintIcon(c,g,x,y);
    	else{
    		g.drawString("Loading CD cover,please wait...",x+300,y+190);
    		if(!retrieving){
				retrieving=true;
				retrievalThread=new Thread(new Runnable() {
					@Override
					public void run() {
						imageIcon=new ImageIcon(imageURL,"CD Cover");
						c.repaint();
					}
				});
				retrievalThread.start();
			}
		}

    }
}//end ImageProxy
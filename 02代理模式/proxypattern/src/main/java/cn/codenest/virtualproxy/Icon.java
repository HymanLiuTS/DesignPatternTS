package cn.codenest.virtualproxy;


import java.awt.*;

/**
 * @author Hyman
 * @version 1.0
 * @created 27-3月-2020 17:09:27
 */
public interface Icon {

	public int getIconWidth();

	public int getIconHeight();

	public void paintIcon(final Component c,Graphics g,int x,int y);

}
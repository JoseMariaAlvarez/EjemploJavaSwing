package iis.informatica.uma.es;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class UnPrincipal {
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setJMenuBar(createMenuBar());
		frame.getContentPane().add(createJTabbedPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	public static JMenuBar createMenuBar() {

		// Create the menu bar.
		JMenuBar menuBar = new JMenuBar();

		// Build the first menu.
		JMenu menu = new JMenu("A Menu");
		menuBar.add(menu);

		// a group of JMenuItems
		JMenuItem menuItem = new JMenuItem("First menu item");
		menu.add(menuItem);

		JMenuItem menuItem2 = new JMenuItem("Second menu item");

		menu.addSeparator();

		JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);

		JCheckBoxMenuItem cbMenuItem2 = new JCheckBoxMenuItem("Another one");
		menu.add(cbMenuItem2);

		// a submenu
		menu.addSeparator();
		JMenu submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);

		menuItem = new JMenuItem("An item in the submenu");
		submenu.add(menuItem);

		JMenuItem othmenuItem = new JMenuItem("Another item");
		submenu.add(othmenuItem);
		menu.add(submenu);

		// Build second menu in the menu bar.
		menu = new JMenu("Another Menu");
		menuBar.add(menu);

		return menuBar;
	}

	public static JTabbedPane createJTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane();

		ImageIcon spIcon = new ImageIcon("images/spidermanIcon.jpg");

		JComponent panel1 = createJSplitPane();
		tabbedPane.addTab("Split pane", spIcon, panel1, "Does nothing");

		ImageIcon icon = new ImageIcon("images/middle.gif");

		JComponent panel2 = makeTextPanel("Panel #2");
		tabbedPane.addTab("Flow Layout Pane", icon, createFlowLayoutPanel(), "Does nothing at all");

		JComponent panel3 = makeTextPanel("Panel #3");
		tabbedPane.addTab("Grid Layout Pane", icon, createGridLayoutPanel(), "Still does nothing");

		JComponent panel4 = makeTextPanel("Panel #4 (has a preferred size of 410 x 50).");
		panel4.setPreferredSize(new Dimension(410, 50));
		tabbedPane.addTab("Border Layout Pane", null, createBorderLayoutPanel(), "Does twice as much nothing");

		tabbedPane.addTab("Box Layout Pane", null, createBoxLayoutPanel(), "Does three times as much nothing");

		return tabbedPane;
	}

	protected static JComponent makeTextPanel(String text) {
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1, 1));
		panel.add(filler);
		return panel;
	}

	protected static JSplitPane createJSplitPane() {
		// Create a split pane with the two scroll panes in it.
		JPanel leftPanel = new JPanel();
		JLabel leftLabel = new JLabel("Panel izquierdo");
		leftPanel.add(leftLabel);
		leftPanel.setBorder(BorderFactory.createLineBorder(new Color(150, 172, 107), 5));

		JLabel etiquetaConImagen = new JLabel();

		ImageIcon spIcon = new ImageIcon("images/spiderman.jpg");

		etiquetaConImagen.setIcon(spIcon);
		if (spIcon != null) {
			etiquetaConImagen.setText(null);
		}
		JScrollPane scrollPane = new JScrollPane(etiquetaConImagen);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, scrollPane);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(150);

		// Provide minimum sizes for the two components in the split pane
		Dimension minimumSize = new Dimension(100, 50);
		leftPanel.setMinimumSize(minimumSize);
		scrollPane.setMinimumSize(minimumSize);

		return splitPane;
	}

//  /** Returns an ImageIcon, or null if the path was invalid. */
//  protected static ImageIcon createImageIcon(String path) {
//    java.net.URL imgURL = Principal.class.getResource(path);
//	 if (imgURL != null) {
//      return new ImageIcon(path);
//	 } else {
//	 System.err.println("Couldn't find file: " + path);
//	 return null;
//	 }
//  }

	protected static JPanel createFlowLayoutPanel() {
		JPanel flPlanel = new JPanel();
		JLabel lb_1_1 = new JLabel(" (Uno) ");
		JLabel lb_1_2 = new JLabel(" (Dos) ");
		JLabel lb_1_3 = new JLabel(" (Tres) ");
		JLabel lb_2_1 = new JLabel(" (Cuatro) ");
		JLabel lb_2_2 = new JLabel(" (Cinco) ");
		JLabel lb_2_3 = new JLabel(" (Seis) ");
		flPlanel.add(lb_1_1);
		flPlanel.add(lb_1_2);
		flPlanel.add(lb_1_3);
		flPlanel.add(lb_2_1);
		flPlanel.add(lb_2_2);
		flPlanel.add(lb_2_3);

		return flPlanel;
	}

	protected static JPanel createBorderLayoutPanel() {
		JPanel blPanel = new JPanel();
		JLabel lbNorth = new JLabel("Norte");
		JLabel lbSouth = new JLabel("Sur");
		JLabel lbWest = new JLabel("Oeste");
		JLabel lbEast = new JLabel("Este");
		JLabel lbCentre = new JLabel("Centro");
		blPanel.setLayout(new BorderLayout());
		blPanel.add(lbNorth, BorderLayout.NORTH);
		blPanel.add(lbSouth, BorderLayout.SOUTH);
		blPanel.add(lbWest, BorderLayout.WEST);
		blPanel.add(lbEast, BorderLayout.EAST);
		blPanel.add(lbCentre, BorderLayout.CENTER);

		return blPanel;
	}

	protected static JPanel createGridLayoutPanel() {
		JPanel grdPanel = new JPanel();
		JLabel lb_1_1 = new JLabel(" (1,1) ");
		JLabel lb_1_2 = new JLabel(" (1,2) ");
		JLabel lb_1_3 = new JLabel(" (1,3) ");
		JLabel lb_2_1 = new JLabel(" (2,1) ");
		JLabel lb_2_2 = new JLabel(" (2,2) ");
		JLabel lb_2_3 = new JLabel(" (2,3) ");
		grdPanel.setLayout(new GridLayout(2, 3));
		grdPanel.add(lb_1_1);
		grdPanel.add(lb_1_2);
		grdPanel.add(lb_1_3);
		grdPanel.add(lb_2_1);
		grdPanel.add(lb_2_2);
		grdPanel.add(lb_2_3);

		return grdPanel;
	}

	protected static JPanel createBoxLayoutPanel() {
		JPanel boxPanel = new JPanel();
		boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
		JLabel lb_1_1 = new JLabel(" (Uno) ");
		JLabel lb_1_2 = new JLabel(" (Dos) ");
		JLabel lb_1_3 = new JLabel(" (Tres) ");
		JLabel lb_2_1 = new JLabel(" (Cuatro) ");
		JLabel lb_2_2 = new JLabel(" (Cinco) ");
		JLabel lb_2_3 = new JLabel(" (Seis) ");
		boxPanel.add(lb_1_1);
		boxPanel.add(lb_1_2);
		boxPanel.add(lb_1_3);
		boxPanel.add(lb_2_1);
		boxPanel.add(lb_2_2);
		boxPanel.add(lb_2_3);

		return boxPanel;
	}
}

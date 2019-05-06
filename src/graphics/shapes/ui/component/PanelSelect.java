package graphics.shapes.ui.component;

import javax.swing.JPanel;

import graphics.shapes.ui.BannerController;
import utils.Utils;

public class PanelSelect extends JPanel {
	
	public PanelSelect(BannerController controller) {
		super();
		init(controller);
	}
	
	private void init(BannerController controller) {
		this.add(new ButtonShape(Utils.getIcon(Utils.MOUSE),controller.doPrint()));
		this.add(new ButtonShape(Utils.getIcon(Utils.SELECTION),controller.doPrint()));
	}
}

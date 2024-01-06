package abstarctfactory;

import abstarctfactory.buttons.Button;
import abstarctfactory.buttons.MacOSButton;
import abstarctfactory.checkboxes.Checkbox;
import abstarctfactory.checkboxes.MacOSCheckbox;

/*Concrete Mac OS Factory */
public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}

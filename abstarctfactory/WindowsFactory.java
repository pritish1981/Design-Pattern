package abstarctfactory;

import abstarctfactory.buttons.Button;
import abstarctfactory.buttons.WindowsButton;
import abstarctfactory.checkboxes.Checkbox;
import abstarctfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}

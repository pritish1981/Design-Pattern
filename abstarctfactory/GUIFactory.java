package abstarctfactory;

import abstarctfactory.buttons.Button;
import abstarctfactory.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();
    Checkbox createCheckbox();

}

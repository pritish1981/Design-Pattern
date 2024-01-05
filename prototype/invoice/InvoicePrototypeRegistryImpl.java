package prototype.invoice;

import java.util.*;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

	private Map<InvoiceType, Invoice> invoice = new HashMap<>();

	public void addPrototype(Invoice user) {
		invoice.put(user.getType(), user);
	}

	public Invoice getPrototype(InvoiceType type) {
		return invoice.get(type);
	}

	public Invoice clone(InvoiceType type) {
		return invoice.get(type).cloneObject();
	}
}

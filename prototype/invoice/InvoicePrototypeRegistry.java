package prototype.invoice;

public interface InvoicePrototypeRegistry {
	void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);

}

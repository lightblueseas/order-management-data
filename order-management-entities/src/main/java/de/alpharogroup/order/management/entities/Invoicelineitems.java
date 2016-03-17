package de.alpharogroup.order.management.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class {@link Invoicelineitems} represents an item line with the quantity in an invoice.
 */
@Entity
@Table(name="invoicelineitems")
@Getter
@Setter
@NoArgsConstructor
public class Invoicelineitems implements Cloneable, Serializable {

	/**  Serial Version UID. */
	private static final long serialVersionUID = -559039804L;

	/** The invoice that this line item belongs to. */
	private Invoices invoice;

	/** The item for this line item. */
	private Items item;

	/** The quantity of the items in this line item. */
	private Integer quantity;

}
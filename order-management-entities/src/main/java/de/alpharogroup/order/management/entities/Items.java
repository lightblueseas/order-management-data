package de.alpharogroup.order.management.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.junit.experimental.categories.Categories;

import de.alpharogroup.db.entity.VersionableBaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class {@link Items} represents an item or a product that can be used in an invoice.
 */
@Entity
@Table(name="items")
@Getter
@Setter
@NoArgsConstructor
public class Items
extends VersionableBaseEntity<Integer>
implements Cloneable {

	/**  Serial Version UID. */
	private static final long serialVersionUID = 1L;

	/** The category. */
	private Categories category;

	/** The creation date. */
	private Date creationDate;

	/** The name. */
	private String name;

	/** The net amount. */
	private java.math.BigDecimal netAmount;

	/** The active state of the item, if true the user item is active and can be used in invoices. */
	private Boolean active;

	/** The tax. */
	private Integer tax;

}
package de.alpharogroup.order.management.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import de.alpharogroup.db.entity.VersionableBaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class {@link Invoices} holds data from invoices.
 */
@Entity
@Table(name="invoices")
@Getter
@Setter
@NoArgsConstructor
public class Invoices
extends VersionableBaseEntity<Integer>
implements Cloneable {

	/**  Serial Version UID. */
	private static final long serialVersionUID = 1L;

	/** The creation date. */
	private Date creationDate;

	/** The payed. */
	private Boolean payed;

	/** The target payment date is the final date that this invoice shell be paid. */
	private Date targetPaymentDate;

	/** The table of this invoice. */
	private Tables table;

}
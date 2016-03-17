package de.alpharogroup.order.management.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import de.alpharogroup.db.entity.VersionableBaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The class {@link Tables} can represent a table in a cafe or bar with a location of this table.
 */
@Entity
@Table(name="tables")
@Getter
@Setter
@NoArgsConstructor
public class Tables
extends VersionableBaseEntity<Integer>
implements Cloneable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The location of the table. */
	private String location;

}
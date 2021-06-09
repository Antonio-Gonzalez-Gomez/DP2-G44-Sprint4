package acme.entities.dudes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.entities.shouts.Shout;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dude extends DomainEntity{


	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	protected  Date createShout;
	
	@NotNull
	protected String pattern;
	
	@NotNull
	protected Money  money;

	@NotNull
	protected Boolean	shoutisdude;
	
	

	// Derived attributes -----------------------------------------------------

	// Relationships ---------------------------------------------------------- 
	@Lob
	protected Shout shout;
}

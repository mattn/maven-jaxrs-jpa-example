package webapp.foo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "foo" database table.
 * 
 */
@Entity
@Table(name="\"foo\"")
@NamedQuery(name="Foo.findAll", query="SELECT f FROM Foo f")
public class Foo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"key\"")
	private String key;

	@Column(name="\"value\"")
	private String value;

	/**
	 * return id
	 * @return id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * set id
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * get key
	 * @return key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * set key
	 * @param key the key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * get value
	 * @return value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * set value.
	 * @param value the value
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
package spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {

	private Long id;

	@NotNull
	@Size(min = 5, max = 16, message = "{username.size}")
	private String username;
	@NotNull
	@Size(min = 5, max = 25)
	private String password;
	@NotNull
	@Size(min = 2, max = 30)
	private String firstName;
	@NotNull
	@Size(min = 2, max = 30)
	private String lastName;
	@NotNull
	@Size(min = 2, max = 30)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Spitter() {
	}

	public Spitter(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

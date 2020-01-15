package spring.boot.web.app.form.validation.dto;

import java.time.LocalDate;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Min(1)
	private int id;

	@Min(1)
	@Digits(integer = 2, fraction = 2)
	private double height;

	@NotEmpty
	@Size(min = 3, max = 45)
	private String name;

	@Email
	@NotBlank
	@Size(max = 150)
	private String email;

	@NotNull
	private String msg;

	@Pattern(regexp = "[a-zA-Z]")
	private String regex;

	@FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate localDate;

	@PastOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate pastDate;

	@Future
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate futureDate;

	@Negative
	private int negative;

	@NegativeOrZero
	private int negativeOrZero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalDate getPastDate() {
		return pastDate;
	}

	public void setPastDate(LocalDate pastDate) {
		this.pastDate = pastDate;
	}

	public LocalDate getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(LocalDate futureDate) {
		this.futureDate = futureDate;
	}

	public int getNegative() {
		return negative;
	}

	public void setNegative(int negative) {
		this.negative = negative;
	}

	public int getNegativeOrZero() {
		return negativeOrZero;
	}

	public void setNegativeOrZero(int negativeOrZero) {
		this.negativeOrZero = negativeOrZero;
	}

}

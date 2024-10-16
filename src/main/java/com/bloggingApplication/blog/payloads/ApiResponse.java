package com.bloggingApplication.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

	private String message;
	private boolean success;

	// Add this constructor
	public ApiResponse(String message, boolean success) {
		this.message = message;
		this.success = success;
	}
}

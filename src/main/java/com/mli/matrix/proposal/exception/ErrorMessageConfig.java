package com.mli.matrix.proposal.exception;

/**
 * @author arpita
 *
 * This is a singleton class which loads on application start up.
 * 
 * This class reads all the error messages required at various places in application during exception 
 * handling from the configured properties file.
 * 
 * Any new message added in the properties file will be automatically loaded in the application after service restart.
 * 
 * A key value map is configured with message keyword and the message. To read any message the key shall be 
 * passed as a parameter
 */

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application-error.properties")
@ConfigurationProperties
public class ErrorMessageConfig {

	private Map<String, String> errorMessages = new HashMap<>();

	/**
	 * @return the error
	 */
	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	@Override
	public String toString() {
		return "ErrorMsgConfig [errorMessages=" + errorMessages + "]";
	}
}

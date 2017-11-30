package pl.codeforfun.common.impl;

import org.springframework.stereotype.Service;

import pl.codeforfun.common.IMessagePrinter;

@Service("messagePrinterImpl")
public class MessagePrinterImpl implements IMessagePrinter{

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String messagePrinter() {
		return "Java " + message;
	}

}

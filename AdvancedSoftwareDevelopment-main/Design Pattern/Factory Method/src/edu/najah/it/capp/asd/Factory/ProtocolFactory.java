package edu.najah.it.capp.asd.Factory;

import edu.najah.it.capp.asd.intf.Protocol;
import edu.najah.it.capp.asd.impl.Ftp;
import edu.najah.it.capp.asd.impl.TFTP;
import edu.najah.it.capp.asd.impl.Scp;
import edu.najah.it.capp.asd.impl.Ssh;
import edu.najah.it.capp.asd.impl.Telnet;


public class ProtocolFactory {

	public Protocol getProtocol(String protocolType) {
		if(protocolType == null) {
			return null;
		}
		if (protocolType.equalsIgnoreCase("Ftp")) {
			return new Ftp();
		}
		else if (protocolType.equalsIgnoreCase("TFTP")) {
			return new TFTP();
		}
		else if (protocolType.equalsIgnoreCase("Scp")) {
		    return new Scp();
			}
		else if (protocolType.equalsIgnoreCase("Ssh")) {
			return new Ssh();
		}
		else if (protocolType.equalsIgnoreCase("Telnet")) {
			return new Telnet();
		}
	
		return null;
	}
}
	

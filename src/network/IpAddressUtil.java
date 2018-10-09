package network;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressUtil {

	public static boolean isValid(String ipAddress) throws UnknownHostException {
		InetAddress address = InetAddress.getByName(ipAddress);
		if (address instanceof Inet6Address | address instanceof Inet4Address)
			return true;
		return false;
	}
	
	public static boolean isValidIPv6Address(String ipAddress) throws UnknownHostException {
		InetAddress address = InetAddress.getByName(ipAddress);
		if (address instanceof Inet6Address)
			return true;
		return false;
	}
	
	public static boolean isValidIPv4Address(String ipAddress) throws UnknownHostException {
		InetAddress address = InetAddress.getByName(ipAddress);
		if (address instanceof Inet4Address)
			return true;
		return false;
	}
}

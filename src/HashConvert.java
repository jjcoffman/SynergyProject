import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class HashConvert 
{

	
	
	public String convertToHash(String s)
	{
		String Hash = s;
		String salt = getsalt();
		try 
		{
			MessageDigest md = MessageDigest.getInstance("SHA-1");
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		

		return s;
		
	}

	private String getsalt() 
	{
		SecureRandom secure = null;
		try 
		{
			secure = SecureRandom.getInstance("SHA1PRNG");
		} 
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		byte[] salt = new byte[16];
		secure.nextBytes(salt);
		return salt.toString();
	}
}

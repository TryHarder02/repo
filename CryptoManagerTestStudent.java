package assignmentThree;
import junit.framework.TestCase;


	public class CryptoManagerTestStudent extends TestCase {

	   
	    public void testIsStringInBounds() {
	        assertTrue(CryptoManager.isStringInBounds("CAT 123!"));
	        assertFalse(CryptoManager.isStringInBounds("Cat"));
	    }

	   
	    public void testVigenereEncryption() {
	        String encrypted = CryptoManager.vigenereEncryption("HELLO", "KEY");
	        assertEquals("RI$VS", encrypted);
	    }

	    
	    public void testVigenereDecryption() {
	        String decrypted = CryptoManager.vigenereDecryption("RI$VS", "KEY");
	        assertEquals("HELLO", decrypted);
	    }

	   
	    public void testPlayfairEncryption() {
	        String plainText = "HELLO JAVA 421!!";
	        String key = "KEY123";

	        String encrypted = CryptoManager.playfairEncryption(plainText, key);

	        assertNotNull(encrypted);
	        assertEquals(plainText.length(), encrypted.length());
	        assertFalse(plainText.equals(encrypted));
	    }

	   
	    public void testPlayfairDecryption() {
	        String plainText = "HELLO JAVA 421!!";
	        String key = "KEY123";

	        String encrypted = CryptoManager.playfairEncryption(plainText, key);
	        String decrypted = CryptoManager.playfairDecryption(encrypted, key);

	        assertEquals(plainText, decrypted);
	    }

	   
	    public void testCaesarEncryption() {
	        String encrypted = CryptoManager.caesarEncryption("WORLD", 3);
	        assertEquals("ZRUOG", encrypted);
	    }

	    
	    public void testCaesarDecryption() {
	        String decrypted = CryptoManager.caesarDecryption("ZRUOG", 3);
	        assertEquals("WORLD", decrypted);
	    }
	}


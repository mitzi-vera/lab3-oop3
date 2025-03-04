package utilities;

/**
* DictionaryADT.java
*
* @author Alessandra Nicole Claur, Lulubelle Fontelo, Mitzi Vera Escartin, Gabriel Ira Siwa
* @version major.minor revision number starting at 1.0
* @date March 6, 2025
* 
* @param <K> the type of keys maintained in this dictionary
* @param <V> the type of mapped values
*/

public interface DictionaryADT<K,V>
{

	/**
	 * Inserts an instance of a key-value pair into the dictionary.
	 * Pre-condition: the key must be unique (should not exist in the current dictionary)
	 * Post-condition: the key-value pair is added, and the dictionary size increases
	 * @param key they key to the instance
	 * @param value the value associated with the key
	 * @throws DuplicateKeyException if the key already exists
	 * @throws IllegalArgugmentException if the key or value is null
	 * */
	
	void insert(K key, V value) throws DuplicateKeyException, IllegalArgumentException;
	
	
	/**
	 * Removes a key-value pair from the dictionary based on the given key.
     * Pre-condition: The key must exist in the dictionary.
     * Post-condition: The key-value pair is removed, and the dictionary size decreases.
     *
     * @param key The key of the pair to be removed.
     * @return The value associated with the removed key.
     * @throws KeyNotFoundException If the key does not exist in the dictionary.
     * @throws IllegalArgumentException If the key is null.
	 */
	void remove();
	
	/**
	 * Please update the comments and the method parameters and exceptions as needed */
	void update();
	
	/**
	 * Please update the comments and the method parameters and exceptions as needed */
	void lookup();
}

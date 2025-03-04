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
     * Updates the value associated with a given key in the dictionary.
     * Pre-condition: The key must exist in the dictionary.
     * Post-condition: The value associated with the given key is updated.
     *
     * @param key   The key whose value is to be updated.
     * @param value The new value to associate with the key.
     * @throws KeyNotFoundException     If the key does not exist in the dictionary.
     * @throws IllegalArgumentException If the key or value is null.
     */
    void update(K key, V value) throws KeyNotFoundException, IllegalArgumentException;
	
	/**
	 * Looks up the value associated with a specific key in the dictionary.
	 * Pre-condition: The key must exist in the dictionary.
	 * Post-condition: Returns the value associated with the given key, if it exists.
	 * 
	 * @param key The key whose associated value is to be returned.
	 * @return The value associated with the given key.
	 * @throws KeyNotFoundException If the key does not exist in the dictionary.
	 * @throws IllegalArgumentException If the key is null.
	 */
	void lookup(K key) throws KeyNotFoundException, IllegalArgumentException;
}

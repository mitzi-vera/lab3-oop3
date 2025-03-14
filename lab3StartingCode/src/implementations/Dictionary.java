package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
    private static final int DEFAULT_SIZE = 10;
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public Dictionary() {
        this(DEFAULT_SIZE);
    }

    public Dictionary(int size) {
        keys = new ArrayList<>(size);
        values = new ArrayList<>(size);
    }

    @Override
    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            V removedValue = values.get(index); // Store value before removal
            keys.remove(index);
            values.remove(index);
            return removedValue; // Ensure the correct value is returned
        }
        return null; // Key not found
    }


	@Override
	public void create(int size)
	{
	    keys = new ArrayList<>(size);
	    values = new ArrayList<>(size);
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
	    if (keys.contains(key)) {
	        throw new DuplicateKeyException("Key already exists in the dictionary.");
	    }
	    keys.add(key);
	    values.add(value);
	    return true;
	}


	@Override
	public boolean update(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value); // Update value at the found index
            return true;
        }
        return false; // Key not found
    }

	@Override
	public V lookup(K key)
	{
		// TODO Auto-generated method stub
		return null;
	}
}

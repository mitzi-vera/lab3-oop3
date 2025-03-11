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
            V removedValue = values.get(index); // Store the value before removal
            keys.remove(index);
            values.remove(index);
            return removedValue; // Return the removed value
        }
        return null; // Key not found
    }



	@Override
	public void create(int size)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(K key, V value)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V lookup(K key)
	{
		// TODO Auto-generated method stub
		return null;
	}
}

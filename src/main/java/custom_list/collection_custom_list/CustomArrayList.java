package custom_list.collection_custom_list;


import java.util.Arrays;

public class CustomArrayList<E>
{
	private Object[] data;
	private int size;
	
	public CustomArrayList()
	{
		this(10);
	}
	
	public CustomArrayList(int initCapacity)
	{
		if(initCapacity>0)
		{
			this.data = new Object[initCapacity];
		}
		else if(initCapacity==0)
		{
			this.data = new Object[10];
		}
		else
		{
			throw new IllegalArgumentException("Illegal Capacity:" +initCapacity);
		}
	}
	public int getSize()
	{
		return size;
	}
	
	public void add(E e)
	{
		ensureCapacity();
		data[size++]=e;
	}
	
	private void ensureCapacity()
	{
		if(data.length<=size)
		{
			int oldCapacity = data.length;
			int newCapacity = (oldCapacity*3)/2 + 1;
			data = Arrays.copyOf(data,newCapacity);
		}
	}
	
	public E get(int index)
	{
		if(index>=size)
		{
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return (E)data[index];
	}
	
	public E set(int index,E element)
	{
		if(index>=size-1)
		{
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = (E)data[index];
		data[index] = element;
		return oldValue;
	}
	
	public E remove(int index)
	{
		if(index>=size)
		{
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldValue = (E)data[index];
		
		int numMoved = size-index-1;
		if(numMoved>0)
		{
			System.arraycopy(data, index+1, data, index, numMoved);
		}
		data[--size] = null;
		return oldValue;
	}
	
	public boolean remove(E obj)
	{
		int i = indexOf(obj);
		if(i>=0)
		{
			remove(obj);
			return true;
		}
		return false;
	}
	
	public int indexOf(Object o)
	{
		return indexOf(o,0);
	}
	public int indexOf(Object o,int index)
	{
		if(o==null)
		{
			for(int i = index;i<size;i++)
			{
				if(data[i]==null)
					return i;
			}
		}
		else
		{
			for(int i = index;i<size;i++)
			{
				if(o.equals(data[i]));
				{
					return i;
				}
			}
		}
		return -1;
	}	
}
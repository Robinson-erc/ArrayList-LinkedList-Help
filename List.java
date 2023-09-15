package List;


/**
 *A list is an ordered collection; duplicates
 *permitted
 *@author Eric Robinson
 */
public interface List<E>
{
   /**
    * @ return the value at given ndx
    * @ param 0 <= ndx < size
    */ 
   E get(int ndx);
   /**
    * change the value at given ndx to the given value
    * @param
    * @return the old value
    */
   E set(int ndx, E value);
   /**
    * add the given value at the end of the list
    */
   void add(E value);
   /**
    * Insert the given value at given ndx
    * @param 0<=ndx<=size
    */
   void add(int ndx, E value);
   /**
    * remove the value at the given ndx
    * @return the value removed
    * @param 0<=x<size
    */
   E remove(int ndx);
   /** @return the size of this List */

    int size();

    /** @return true iff this List is empty */

   boolean isEmpty();

    /** Clear this List */

   void clear();
    /** @return the index of the first occurrence of the given object in this List, or -1 if not found */
   int indexOf(Object obj);

    /** @return true iff this List contains the given object */
   boolean contains(Object obj);
   
}

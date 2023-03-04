import java.util.ArrayList;

public class ArrayListSortingByComparing {

	public static void main(String[] args) {
		 ArrayList < Integer > arraylist = new ArrayList < Integer > ();

	      arraylist.add(10);
	      arraylist.add(6);
	      arraylist.add(4);
	      arraylist.add(3);
	      arraylist.add(5);
	      arraylist.add(1);
	      arraylist.add(9);

	      //compare array list first element with 2nd element
	      
	      for (int i = 0; i < arraylist.size(); i++) { //array list size =7
	          for (int j = arraylist.size() - 1; j > i; j--) { //if index start with 0 then the last size of a array should be (total size -1_
	              if (arraylist.get(i) > arraylist.get(j)) { // check if first element is bigger than last element
	                  int temporarySpace = arraylist.get(i); // then keep the value of first element in temporarySpace if the condition is true
	                  arraylist.set(i,arraylist.get(j)) ; //replace the value of last element in first elements position
	                  arraylist.set(j,temporarySpace); // now send the value of temporarySpace to the last position of array list
	              }
	          }
	      }
	      for (int i: arraylist) { //for each loop i = starting index number, arraylist each of the index of arraylist
	          System.out.println(i); 
	      }

	}

}

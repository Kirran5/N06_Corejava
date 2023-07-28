//program to demonstrate access specifiers
//driver class
package in.kkwagh.library;
import in.bkcmet.library.Library;
public class FacultyExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		
		/* userId and displayPrivate() method is private, so
		 * we can't access into another package or class,only
		 * we can access inside the same class*/
		 
		//l.userId=123456L;
		//l.displayPrivat();
		
		/*booksName and displayDefault() method is default,
		 * we cant't access into another package or class,only
		 * we can access inside the same class*/
		 
		
		//l.booksName;
		//l.displayDefault();
		
		

	}

}

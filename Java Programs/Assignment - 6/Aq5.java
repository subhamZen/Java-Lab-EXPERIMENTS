import java.lang.*;
class Aq5 {
    public static void main(String[] args) {

        String a[] = {"Python", "Java", "C++", "SQL"};
        String b[] = {"Mysql", "SQL", "Oracle", "Java"};

        System.out.print("Common Element : [ ");
	int count = 0;

        for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if (a[i] == b[j]) {
				if( count > 0 ){
					System.out.print( ",");
				}
					System.out.print(a[i]);
					count++;
					break;
                	}
            }
        }
		 System.out.println("]");
    }
}
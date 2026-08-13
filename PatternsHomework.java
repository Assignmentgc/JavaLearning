/*
1		1 2 3 4 5	1 2 3 4 5	1		1		1
1 2		1 2 3 4		2 3 4 5 	2 1		1 0		0 1
1 2 3		1 2 3		3 4 5		3 2 1		1 0 1		1 0 1
1 2 3 4		1 2		4 5		4 3 2 1		1 0 1 0		0 1 0 1
1 2 3 4 5	1		5		5 4 3 2 1	1 0 1 0 1	1 0 1 0 1

5		5 4 3 2 1	5 4 3 2 1	5		1 0 1 0 1	1 0 1 0 1
5 4		4 3 2 1		5 4 3 2		4 5		0 1 0 1		1 0 1 0
5 4 3		3 2 1		5 4 3		3 4 5		1 0 1		1 0 1
5 4 3 2		2 1		5 4		2 3 4 5		0 1		1 0
5 4 3 2 1	1		5		1 2 3 4 5	1		1

    1		* * * * *	    *		*		     1		1
   1 2		*       *	   * *		* *		    1 2		1 2
  1 2 3		*	*	  *   *		*   *		   1   3	1   3
 1 2 3 4	*       *	 *     *	*     *		  1     4	1     4
1 2 3 4 5	* * * * *	* * * * *	* * * * *	 1 2 3 4 5	1 2 3 4 5	

    1		1		1 2 3 4 5  	1 1 1 1 1 	     *		1
   2 2		2 2		1       5	2       2	    ***		2 4
  3   3		3   3		1       5	3       3          *****	3 6 9	
 4     4	4     4		1       5	4       4         *******	4 8 12 16
5 5 5 5 5	5 5 5 5 5	1 2 3 4 5	5 5 5 5 5	 *********	5 10 15 20 25

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class PatternsHomework {
	public static void main(String[] args) {

	    //Square
	    for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
		    if(i==1 || i==5 || j==1 || j==5)
			System.out.print(i+" ");
			//System.out.print(j+" ");
		        //System.out.print("* ");
		    else
			System.out.print("  ");
		}
		System.out.println();
	    }	    

	    //Triangle
	    for(int i=1;i<=5;i++) {
	       for(int k=i;k<=5;k++){
		  System.out.print(" ");
	       }
	       for(int j=1;j<=i;j++){
		  if(i==1 || i==5 || j==1 || j==i)
		      System.out.print(i+" ");
		      //System.out.print(j+" ");
		      //System.out.print("* ");
		  else
		      System.out.print("  ");
	       }
	       System.out.println();
	    }

	    /*for(int i=1;i<=5;i++){
	        for(int k=i;k<=5;k++){
		    System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
		    System.out.print(j+" ");
		}
		System.out.println();
	    }*/
	}
}
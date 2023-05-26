
package arraysdemo;

//comments added for fetch and merge 2
// comments added again
public class StudentList {
  public static void main(String args[]){
      Student s1 = new Student("s1","nilima");
      Student[] myList = new Student[3];
      myList[0]=s1;
      myList[1]=new Student("s2","abc");
      myList[2]=new Student("s3","xyz");
      
      for(int i=0;i<myList.length;i++){
          System.out.println(myList[i].getsName());
      }
  }  //end of main
}//end of class

// 3. Library Management System (Mini OOP Project)

// Concepts
// Classes
// ArrayList
// OOP

// Features
// Add book
// Issue book
// Return book
// Display books


import java.util.*;
class library{
    ArrayList<Integer> bookno=new ArrayList<>();
    ArrayList<String> bookName=new ArrayList<>();
    ArrayList<String> author=new ArrayList<>();
    ArrayList<Integer> issue=new ArrayList<>();
    public void addBook(int no,String nm,String auth){
        bookno.add(no);
        bookName.add(nm);
        author.add(auth);
    }

    public void issueBook(int bookno){
        issue.add(bookno);
        System.out.println("Book issued successfully");
    }

    public void returnBook(int bookno){
        issue.remove(bookno);
        System.out.println("Book returned successfully");
    }

    public void display(){
        for(int i=0; i<bookName.size();i++){
            System.out.println(bookno.get(i)+ "  "+bookName+"  "+author);
        }
    }
}
class libmanagement{
    public static void main(String arg[]){
        library obj=new library();
        while(true){
            System.out.println("1.Add book");
            System.out.println("2.Issue book");
            System.out.println("3.Return book");
            System.out.println("4.Display book");
            System.out.println("5.Exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice :- ");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter book name");
                String nm=sc.next();
                System.out.println("Enter book no");
                int no=sc.nextInt();
                System.out.println("Enter author name");
                String auth=sc.next();
                obj.addBook(no,nm,auth);
            }
            if(ch==2){
                System.out.println("Enter book no");
                int no=sc.nextInt();
                obj.issueBook(no);
            }
            else if(ch==3){
                System.out.println("Enter book no");
                int no=sc.nextInt();
                obj.returnBook(no);
            }
            else if(ch==4){
                obj.display();
            }
            else if(ch==5){break;}
            else{System.out.println("Invalid choice");}
        }
    }
}
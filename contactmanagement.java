import java.util.*;

class contact{
    HashMap<String,Integer> contact=new HashMap<>();
    public void addContact(String name, int no){
        if(String.valueOf(no).length()==10){
        contact.put(name,no);
        System.out.println("Number added successfully");
        }
        else{
            System.out.println("Enter a valid number");
        }
    }

    public void removeContact(String name){
        if(contact.containsKey(name)){
            contact.remove(name);
            System.out.println("Number deleted");
        }
        else{
            System.out.println("Name does not exists");
        }

    }

    public void search(String name){
        if(contact.containsKey(name)){
            System.out.println("Name = "+name+" Number = "+contact.get(name));
        }
        else{
            System.out.println("Name does not exists");
        }
    }

    public void display(){
        for(String key:contact.keySet()){
            System.out.println("Name = "+key+" Number = "+contact.get(key));
        }
    }
}
class contactmanagement{
    public static void main(String arg[]){
        contact c=new contact();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Add Contact");
            System.out.println("2.Search Contact");
            System.out.println("3.Remove Contact");
            System.out.println("4.Display Contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice :- ");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter name");
                String nm=sc.next();
                System.out.println("Enter no");
                int no=sc.nextInt();
                c.addContact(nm,no);
            }
            if(ch==2){
                System.out.println("Enter name");
                String nm=sc.next();
                c.search(nm);
            }
            else if(ch==3){
                System.out.println("Enter name");
                String nm=sc.next();
                c.removeContact(nm);
            }
            else if(ch==4){
                c.display();
            }
            else if(ch==5){break;}
            else{System.out.println("Invalid choice");}
            
        }
    }
}
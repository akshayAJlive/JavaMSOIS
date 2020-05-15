/*Develop Queue with following operations
i) createNew( ) ii) add( ) iii) remove( ) iv) display( ) v) empty( )*/
package Inter;
import java.io.*;
class Q16
{
    static int i,front,rear,item,max=5,ch;
    static int a[]=new int[5];
    Q16()
    {
        front=-1;
        rear=-1;
    }
    public static void main(String args[])throws IOException
    {
 
        while((boolean)true)
        {
            try
            {
                System.out.println("Select Option 1.add 2.remove 3.display 4.empty 5.exit");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {    }
            if(ch==5)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    Empty();
                    break;
                }
            }
        }
    }
    static boolean Empty()
    {
        return rear == -1;
    }

    static void add()
    {
        if(rear>=max)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Element: ");
                item=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {}
            rear=rear+1;
            a[rear]=item;
        }
    }
    static void remove()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            front=front+1;
            item=a[front];
            System.out.println("Deleted Item: "+item);
        }
    }
    static void display()
    {
        System.out.println("Elements in the Queue are:");
        for(int i=front+1; i<=rear; i++)
        {
            System.out.println(a[i]);
        }
    }
}

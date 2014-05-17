import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimit extends PlainDocument 
{  
          private int limit;  
          private boolean toUppercase = false;  
            
          JTextFieldLimit(int limit) 
          {  
           super();  
           this.limit = limit;  
           }  
           
          public void insertString (int offset, String  str, AttributeSet attr)  
              throws BadLocationException 
              {  
           if (str == null) return;  
  
           if ((getLength() + str.length()) <= limit) {  
             if (toUppercase) str = str.toUpperCase();  
             super.insertString(offset, str, (javax.swing.text.AttributeSet) attr);  
             }  
           }  
        }   
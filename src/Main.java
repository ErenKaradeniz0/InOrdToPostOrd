import java.lang.reflect.Type;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inFix = "(2+2)/2";
        String postFix = "";
        ListStack listStack=new ListStack<>();
        for (int i = 0; i < inFix.length(); i++) {
            char ch = inFix.charAt(i);
            if(isNumeric(ch+"")){
                postFix += ch;
            }

            switch (ch) {
                case '(':
                    listStack.push(ch);
                    break;
                case ')':
                    while (!listStack.top().equals('(')){
                        postFix+=listStack.pop();
                    }
                    listStack.pop();
                    break;
                case '+','-','*','/':
                    if (!listStack.isEmpty()){
                        if(listStack.top().equals('*') || listStack.top().equals('/')){
                            postFix+=listStack.pop();
                        }
                    }

                    listStack.push(ch);
                    break;
            }}
        while (!listStack.isEmpty()){
            postFix+=listStack.pop();

        }
        System.out.println(postFix);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}


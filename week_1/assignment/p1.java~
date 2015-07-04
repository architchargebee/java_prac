//Substring printing
import java.io.*;
import java.util.*;

class p1 {
	public static void main(String[] argv) {
		String str = "#//**123$$abcd\\*lg$#kmlkm*haieeed$sff\nrvw$vwv*w$v\n#lgsu*sam$@$*111*$#\ngvhjjbhbh";
		int i, j, p, q;
		String[] temp = str.split("\n");
		String substring = null;
		for(i =0; i < temp.length ; i++) {
			//System.out.println(temp[i]);
			p=temp[i].indexOf("*");
			q=temp[i].indexOf("$",p);
			if(p == -1 || q == -1 || p > q) {
				//System.out.println("Nothing to print");
				continue;
			}
			substring = temp[i].substring((p+1),q);
			System.out.print((i+1)+":["+(p+1)+","+q+"]:");
			System.out.println(substring);

			while(temp[i].indexOf('$', q+1) != -1) {
				p=temp[i].indexOf("*",q);
				q=temp[i].indexOf("$",p);
				System.out.print((i+1)+":["+(p+1)+","+q+"]:");
				substring = temp[i].substring((p+1),q);
				System.out.println(substring);

			}			
		}
	}	
}


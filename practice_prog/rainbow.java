import java.io.*;
import java.util.*;

public class rainbow{
	public enum MyColor{
		RED(100),GREEN(343),BLUE(5765);
		private final int rgb;
		MyColor(int rgb){this.rgb = rgb;}
		public int getRgb(){return rgb;}
	};
	public static void main(String[] args){
		MyColor purple = MyColor.BLUE + MyColor.RED; 
	}
}

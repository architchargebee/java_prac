import java.util.*;
import java.io.*;
class Super{
	protected int a;
	protected Super(int a){this.a=a;}
}
class sub extends Super{
	public sub(int a){super(a);}
	public sub(){super(5);}
}


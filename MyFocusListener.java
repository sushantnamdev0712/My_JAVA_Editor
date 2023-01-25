package com.Editor;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MyFocusListener extends FocusAdapter{

	MyEditor e;
	static int count=0;
	MyFocusListener(MyEditor e){
		this.e=e;
	}
	public void focusGained(FocusEvent fe) {
		if(count==0) {
			String str=e.jtf.getText().trim();
			e.jta.setText("public class "+str+"\n"
					+"{"+"\n"
					+"public static void main(String... s)"+"\n"
					+"{"+"\n"
					+"             "+"\n"
					+"}"+"\n"
					+"}");
			count++;
				
		}
	}
}

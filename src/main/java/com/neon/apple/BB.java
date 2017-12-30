package com.neon.apple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BB extends KK{
    private String[] userNames;
    
    private static BB bb;
    
    static{
    	bb = new BB();
    }
    
    public static BB getBBInstance(){
    	return bb;
    }
    
    public BB(){ userNames = new String[10];}
    
    public void setName(String s, int n){
    	userNames[n] = s;
    }
    
    public String  getName(int n){
    	return userNames[n];
    }
    
    public void showName(int n){
    	System.out.println("NAME is" +userNames[n]);
    }
    
    
	public int overload(){
		return 2;
	}
	
	/**
     * 以字符为单位读取文件，常用于读文本，数字等类型的文件
     */
    public void readFileByChars(String fileName) {
    	String path = this.getClass().getResource("/" + fileName).getFile();
    	path = path.replace("%20", " ");
        File file = new File(path);
        Reader reader = null;
        try {
        	
        	String bbd = "我们";
        	System.out.println(new String(bbd.getBytes(),"UTF-8"));
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    System.out.print((char) tempchar);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            System.out.println("以字符为单位读取文件内容，一次读多个字节：");
//            // 一次读多个字符
//            char[] tempchars = new char[30];
//            int charread = 0;
//            reader = new InputStreamReader(new FileInputStream(fileName));
//            // 读入多个字符到字符数组中，charread为一次读取字符数
//            while ((charread = reader.read(tempchars)) != -1) {
//                // 同样屏蔽掉\r不显示
//                if ((charread == tempchars.length)
//                        && (tempchars[tempchars.length - 1] != '\r')) {
//                    System.out.print(tempchars);
//                } else {
//                    for (int i = 0; i < charread; i++) {
//                        if (tempchars[i] == '\r') {
//                            continue;
//                        } else {
//                            System.out.print(tempchars[i]);
//                        }
//                    }
//                }
//            }
//
//        } catch (Exception e1) {
//            e1.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e1) {
//                }
//            }
//        }
    }
	
	
	 /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public void readFileByLines(String fileName) {
//    	URL url =this.getClass().getResource(fileName);
//    	System.out.println(url.toString());
//        File file = new File(fileName);
    	//System.out.println(this.getClass().getResource("/test.xml"));
    	//System.exit(-1);
    	String path = this.getClass().getResource("/test.xml").getFile();
    	path = path.replace("%20", " ");
       // File file = new File(this.getClass().getResource("/test.xml").getFile());
        File file = new File(path);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
    
    int i= 10;
    int j;
    char z=1;
    boolean b;
    
	public static void main(String[] args){
//		BB b = new BB();
//		b.amethod();
//		KK k = (KK)b;
//		System.out.println("---------" + k.overload());
//		b.readFileByChars("test.xml");
//		b.showName(2);
//		
//		StringBuffer s = new StringBuffer("Hello");
//		if(s.length()>5 && s.append("there").equals("False"));
//		System.out.println("value is" + s);
//		
//		StringBuffer zimu = new StringBuffer();
//		StringBuffer shuzi = new StringBuffer();
//		StringBuffer other = new StringBuffer();
//		String testStr = "a231z@a?";
//		char ch ;
//		for(int i=0; i<testStr.length(); i++)
//		{
//			ch = testStr.charAt(i);
//			if(Character.isLetter(ch)){
//				zimu.append(ch);
//			}else if(Character.isDigit(ch)){
//				shuzi.append(ch);
//			}else{
//				other.append(ch);
//			}
//		}
//		System.out.println(zimu.toString() + shuzi.toString() + other.toString());
//	    String jdk = "j好dk";
//	    jdk = jdk.toUpperCase();
//	    System.out.println(jdk.length());
//	    jdk = jdk.substring(1, jdk.length());
//	    System.out.println(jdk);
//	    
//	    String ss = "test";
//	    StringBuffer sb = new StringBuffer(ss);
//	    sb.reverse();
//	    ss = sb.toString();
//	    System.out.println(ss);
//	    
//	    System.out.println("*******************");
//	    BB btest = BB.getBBInstance();
//	    System.out.println(btest);
//	    System.out.println("*******************");
//	    BB btestb = BB.getBBInstance();
//	    System.out.println(btestb);
//	    
//	    Integer kk = new Integer(111);
//	    short ooo = 111;
//        if(kk.equals(ooo)){
//        	System.out.println("1111111");
//        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("b",2);
        for(String key: map.keySet()){
        	System.out.println("key=" + key + " and value=" + map.get(key));
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
         
        for(Map.Entry<String, Integer> entry : entrySet){
        	System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
        
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        
        while(it.hasNext()){
        	Map.Entry<String, Integer> entry = it.next();
        	System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
        for(Integer key: map.values()){
        	System.out.println(key);
        }
        
        int[] sorts = {1,2,3,42,0,39,-1};
        bb.sort(sorts);
        for(int i=0; i<sorts.length;i++)
        System.out.println(sorts[i]);
	}
	
	public void amethod(){
		System.out.println(j);
	}
	
	public void sort(int[] args){
		
	   for(int i=0; i<args.length; i++){
		   for(int j=0; j<args.length-i-1; j++){
			   if(args[j] > args[j+1]){
				   int temp = args[j];
				   args[j] = args[j+1];
				   args[j+1] = temp;
			   }
		   }
	   }
	}
	
}

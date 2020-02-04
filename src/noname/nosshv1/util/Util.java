package noname.nosshv1.util;

import java.util.Random;

public class Util {
	public static String getRandomString(){
	     String fullstr="abcdefghijklmnopqrstuvwxyz0123456789";
	     String numstr="0123456789";
	     String apstr="abcdefghijklmnopqrstuvwxyz";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<10;i++){
	    	 switch(i) {
	    	 case 0: sb.append("0"); break;
	    	 case 1: sb.append(apstr.charAt(random.nextInt(26))); break;
	    	 case 2: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 3: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 4: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 5: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 6: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 7: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 8: sb.append(fullstr.charAt(random.nextInt(36))); break;
	    	 case 9: sb.append(numstr.charAt(random.nextInt(10))); break;
	    	 }
	     }
	     return sb.toString();
	 }
}

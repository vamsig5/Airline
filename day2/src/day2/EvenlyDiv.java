package day2;


public class EvenlyDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="116 1259 1045 679 1334 157 277 1217 218 641 1089 136 247 1197 239 834\n" + 
				"269 1751 732 3016 260 6440 5773 4677 306 230 6928 7182 231 2942 2738 3617\n"+
				"644 128 89 361 530 97 35 604 535 297 599 121 567 106 114 480\n" + 
				"105 408 120 363 430 102 137 283 123 258 19 101 181 477 463 279\n" + 
				"873 116 840 105 285 238 540 22 117 125 699 953 920 106 113 259\n" + 
				"3695 161 186 2188 3611 2802 157 2154 3394 145 2725 1327 3741 2493 3607 4041\n" + 
				"140 1401 110 119 112 1586 125 937 1469 1015 879 1798 122 1151 100 926\n" +
				"2401 191 219 607 267 2362 932 2283 889 2567 2171 2409 1078 2247 2441 245\n" +
				"928 1142 957 1155 922 1039 452 285 467 305 506 221 281 59 667 232\n" + 
				"3882 1698 170 5796 2557 173 1228 4630 174 3508 5629 4395 180 5100 2814 2247\n" + 
				"396 311 223 227 340 313 355 469 229 162 107 76 363 132 453 161\n" + 
				"627 1331 1143 1572 966 388 198 2068 201 239 176 1805 1506 1890 1980 1887\n" +
				"3390 5336 1730 4072 5342 216 3823 85 5408 5774 247 5308 232 256 5214 787\n" + 
				"176 1694 1787 1586 3798 4243 157 4224 3603 2121 3733 851 2493 4136 148 153\n" + 
				"2432 4030 3397 4032 3952 2727 157 3284 3450 3229 4169 3471 4255 155 127 186\n" + 
				"919 615 335 816 138 97 881 790 855 89 451 789 423 108 95 116";		
		String[] s1=s.split("\n");
		int sum=0;
		
		for (int i = 0; i < s1.length; i++) {
			String[] integerStrings = s1[i].split(" "); 
			int[] integers = new int[integerStrings.length]; 
			
			for (int j = 0; j < integers.length; j++){
			    integers[j] = Integer.parseInt(integerStrings[j]); 
			
			}
			for (int j = 0; j < integers.length; j++) {
                for (int k = 0; k < integers.length; k++) {
                	
              if (integers[j]>integers[k]) {
    				
  				if(integers[j] % integers[k]==0) {

              	  
    				sum=sum+(integers[j]/integers[k]);
    				//System.out.println(sum);
  				}

			}
//              if (integers[j]<integers[k]) {
//				
//				if(integers[j] % integers[k]==0) {
//					System.out.println(integers[j]);
//					System.out.println(integers[k]);	
//				}
//				
//			}

					}
					
				
				
			}
			
		}
		System.out.println(sum);
	}

}
	

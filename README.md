Втора лабораториска вежба по Софтверско инженерство
Стефан Андонов, бр. на индекс 151020
Група на код:
Ја добив групата на код 5

Control Flow Graph

![ControlFlowGraph](https://user-images.githubusercontent.com/62310511/91230366-acfb9400-e72b-11ea-8457-565c3dfd2572.png)

Тест случаи според критериумот Every path

Path    	            T/F 	              Output 	                            Test Case  
ABC	                  T	                "Number should not be negative"	     -1 
ABDEF	                FT	              False	                                1
ABDEGHIT	            FFTT	            True	                                4
ABDEGHF               FFF	              False	                                2
ABDEGHIJHF	          FFTFF	            False	                                5
ABDEGHIJHIJHIJHIJHF 	FFTFTFTFTFF 	    False	                                11

Тест случаи според критериумот Multiple condition

Combination	    Test Case	  Branch 
 TX	            0 	        ABDE-F 
 FT	            1 	        ABDE-F 
 FF             2           ABDE-G   




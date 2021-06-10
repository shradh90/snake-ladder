public class snakeandladder {
	public static void main(String[] args) {
		System.out.println("**************************************************************\t");
		System.out.println("welcome to snake and ladder game");
		System.out.println("**************************************************************");
		int[] player = {0,1};
		System.out.println("at position 2,9,25,30,51,65,79,89 we have ladders");
		System.out.println("at position 10,25,38,48 we have snakes");
		int i=0;
		int j=0;
		while((player[0] <= 100) && (player[1] <= 100) ) {
		int daice = (int) (Math.floor(Math.random() * 10 ) % 6) + 1;
		i = i + 1;
	 	
		player[j] = daice + player[j]; 
		System.out.println(" player " + j + "is at " + player[j] ); 
			if(player[j]==2 || player[j]==9 || player[j]==25 || player[j]==30 || player[j]==51 || player[j]==65 || player[j]==79 || player[j]==89) {
			System.out.println("LUCKY! GOT A LADDER");
				if(player[j]==2){
				player[j]=18;
				}	
				else if(player[j]==9){
				player[j]=28;
				}	
				else if(player[j]==25){
				player[j]=47;
				}
				else if(player[j]==30){
				player[j]=50;
				}
				else if(player[j]==51){
                                player[j]=73;
                                }
                                else if(player[j]==65){
                                player[j]=85;
                                }
			        else if(player[j]==79){
                                player[j]=98;
                                }
                                else if(player[j]==89){
                                player[j]=91;
                                }
			}

			if(player[j]==27 || player[j]==38 || player[j]==66 || player[j]==90 || player[j]==99 || player[j]==97) {
                        System.out.println("OOPS! IT IS A SNAKE	");
                                if(player[j]==27){
                                player[j]=5;
                                }
                                else if(player[j]==38){
                                player[j]=17;
                                }
                                else if(player[j]==66){
                                player[j]=46;
                                }
                                else if(player[j]==90){
                                player[j]=70;
                                }
                                else if(player[j]==99){
                                player[j]=81;
                                }
                                else if(player[j]==97){
                                player[j]=58;
                                }
                        }

			if(player[j] >= 100){
			System.out.println("CONGRATULATION ! player WON " + j );

			break;
			}
			j=(j + 1 ) % 2;
		}
          System.out.println("total number of times daice is rolled is :" + i );
	}

}

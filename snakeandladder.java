public class snakeandladder {
	public static void main(String[] args) {
		System.out.println("**************************************************************\t");
		System.out.println("welcome to snake and ladder game");
		System.out.println("**************************************************************");
		int player=0;
		System.out.println("at position 2,9,25,30,51,65,79,89 we have ladders");
		System.out.println("at position 10,25,38,48 we have snakes");
		int i=0;
		while(player <= 100) {
		int daice = (int) (Math.floor(Math.random() * 10 ) % 6) + 1;
		i = i + 1;
		player = daice + player; 
		System.out.println(" player " + player ); 
			if(player==2 || player==9 || player==25 || player==30 || player==51 || player==65 || player==79 || player==89) {
			System.out.println("LUCKY! GOT A LADDER");
				if(player==2){
				player=18;
				}	
				else if(player==9){
				player=28;
				}	
				else if(player==25){
				player=47;
				}
				else if(player==30){
				player=50;
				}
				else if(player==51){
                                player=73;
                                }
                                else if(player==65){
                                player=85;
                                }
			        else if(player==79){
                                player=98;
                                }
                                else if(player==89){
                                player=91;
                                }
			}

			if(player==27 || player==38 || player==66 || player==90 || player==99 || player==97) {
                        System.out.println("OOPS! IT IS A SNAKE	");
                                if(player==27){
                                player=5;
                                }
                                else if(player==38){
                                player=17;
                                }
                                else if(player==66){
                                player=46;
                                }
                                else if(player==90){
                                player=70;
                                }
                                else if(player==99){
                                player=81;
                                }
                                else if(player==97){
                                player=58;
                                }
                        }

			if(player >= 100){
			System.out.println("CONGRATULATION ! YOU WON ");
			break;
			}
		}
          System.out.println("total number of times daice is rolled is :" + i );
	}

}

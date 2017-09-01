public class ReachRunner{
	
	static int equip = 0;
	static int goblinDMG = 8;
	static int goblinHP = 6;	
	static int goblin = 1;
	static int yCord = 0;
	static int xCord = 0;	
	static int maxhealth = 50;	
 static int health = 1;
 static int poisonVar = 0;
 static int poisonStrength = 1;
 static int antiPoisonVar = 1;
 static int regenVar = 1;
 static int regenStrength = 110;
 static int antiRegenVar = 1;
 static int healthDifference = maxhealth - health;
 static int gold = 1;
 static int silver = 1;
 static int rustySwordDMG = 1;
 static int rustySwordDur = 5;
 static int dmg = 1;
 static int situation = 0;
 static int randomOcc = (int )(Math.random() * 10 + 1);
 static boolean Display = true;
 static boolean HealthB = true;
 
 
 
	 
 
 		
 		
 		if(HealthB = true) {
 			if(health <= 0) {
 				HealthB = false;
 			}
 		}
 		
 		if(HealthB = false) {
 			System.exit(0);
 		}
 	
 		if(Display = true) {
 		
 		System.out.print("HP:");
 		System.out.print(health);
 		System.out.print("/");
 		System.out.print(maxhealth);
 		System.out.print("        ");
 		System.out.print("Gold:");
 		System.out.print(gold);
 		System.out.print("        ");
 		System.out.print("Silver:");
 		System.out.print(silver);
 		System.out.print("        ");
 		System.out.print("Damage:");
 		System.out.print(dmg);
 		System.out.print("        ");
 		System.out.print("Cordinates:");
 		System.out.print(xCord);
 		System.out.print(",");
 		System.out.println(yCord);
 		mapScan();
 		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		
 		}
 
    private static void mapScan()
	{
 		if(xCord + yCord > 0) {
 			situation = situation + randomOcc;
 		}
 			
		if(yCord == 0) {
			if(xCord == 0) {
			System.out.println(" ______________________________________________________________________ ");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                    |o|                               |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println(" ______________________________________________________________________ ");
			 if(randomOcc == 0) {
				 
					System.out.print("You are      SPACE-Slash      P-Stab      O-Throw");
					System.out.print("Goblins: ");
					System.out.print(goblin);
					goblin = goblin + 2;
					
				}
				else if(randomOcc == 2) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 3) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 4) {
					System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 5 ) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 6 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 7) {
					System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 8) {
					System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 9 ){
					System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 10 ) {
					System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
					System.out.print(equip);
				}
				else if( randomOcc == 11 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
			}
			situation = situation - situation;
			}
			else if(xCord == 1) {
			System.out.println(" ______________________________________________________________________ ");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                     o                                |");	
			System.out.println("|                                    | |                               |");
			System.out.println ("|                                                                     |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println(" ______________________________________________________________________ ");
			
			 if(randomOcc == 1) {
				 
					System.out.print("Two Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
					System.out.print("Goblins: ");
					System.out.print(goblin);
					goblin = goblin + 2;
					
				}
				else if(randomOcc == 2) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 3) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 4) {
					System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 5 ) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 6 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 7) {
					System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 8) {
					System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 9 ){
					System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 10 ) {
					System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
					System.out.print(equip);
				}
				else if( randomOcc == 11 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
			}
			else if(xCord == 2) {
			System.out.println(" ______________________________________________________________________ ");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                     o                                |");
			System.out.println("|                                                                      |");
			System.out.println("|                                    | |                               |");
			System.out.println ("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println(" ______________________________________________________________________ ");
			
			 if(randomOcc == 1) {
				 
					System.out.print("Two Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
					goblin = goblin + 2;
					
				}
				else if(randomOcc == 2) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 3) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 4) {
					System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 5 ) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 6 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 7) {
					System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 8) {
					System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 9 ){
					System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 10 ) {
					System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
					System.out.print(equip);
				}
				else if( randomOcc == 11 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
			}
			else if(xCord == 3) {
			System.out.println(" ______________________________________________________________________ ");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                     o                                |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");	
			System.out.println("|                                    | |                               |");
			System.out.println ("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println("|                                                                      |");
			System.out.println(" ______________________________________________________________________ ");
			
			 if(randomOcc == 1) {
				 
					System.out.print("Two Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
					goblin = goblin + 2;
					
				}
				else if(randomOcc == 2) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 3) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 4) {
					System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 5 ) {
					System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 6 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 7) {
					System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 8) {
					System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if(randomOcc == 9 ){
					System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
				}
				else if( randomOcc == 10 ) {
					System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
					System.out.print(equip);
				}
				else if( randomOcc == 11 ) {
					System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
				}
			}
		else if(xCord == 4) {
		System.out.println(" ______________________________________________________________________ ");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                     o                                |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                    | |                               |");
		System.out.println ("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println(" ______________________________________________________________________ ");
		
		 if(randomOcc == 1) {
			 
				System.out.print("Two Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				goblin = goblin + 2;
				
			}
			else if(randomOcc == 2) {
				System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 3) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 4) {
				System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 5 ) {
				System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 6 ) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 7) {
				System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 8) {
				System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 9 ){
				System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 10 ) {
				System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
				System.out.print(equip);
			}
			else if( randomOcc == 11 ) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
		}
		else if(xCord == 5) {
		System.out.println(" ______________________________________________________________________ ");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                     o                                |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                    | |                               |");
		System.out.println ("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println("|                                                                      |");
		System.out.println(" ______________________________________________________________________ ");
		
		 if(randomOcc == 1) {
			 
				System.out.print("Two Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
				goblin = goblin + 2;
				
			}
			else if(randomOcc == 2) {
				System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 3) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 4) {
				System.out.print("Goblins Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 5 ) {
				System.out.print("A Troll Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 6 ) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 7) {
				System.out.print("A Leprechaun Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 8) {
				System.out.print("Two Pixies Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if(randomOcc == 9 ){
				System.out.print("A Dragon Appears!      SPACE-Slash      P-Stab      O-Throw");
			}
			else if( randomOcc == 10 ) {
				System.out.print("A Band of Raiders Appear!      SPACE-Slash      P-Stab      O-Throw");
				System.out.print(equip);
			}
			else if( randomOcc == 11 ) {
				System.out.print("Two Orcs Appear!      SPACE-Slash      P-Stab      O-Throw");
			}
		}
	}







	public void keyTyped(KeyEvent w) {
		// TODO Auto-generated method stub
		
	}







	public void keyPressed(KeyEvent a) {
		// TODO Auto-generated method stub
		
	}







	public void keyReleased(KeyEvent s) {
		// TODO Auto-generated method stub
		
	}
}



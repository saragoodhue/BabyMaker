
public class MakeBaby
	{
		public static void main(String[] args)
			{
				Baby kaitlynsBaby = new Baby("Abby", 7.6, true);
				System.out.println("Kaitlyn's baby is named " + kaitlynsBaby.getName());
				kaitlynsBaby.setName("Michael");
				System.out.println(kaitlynsBaby.getName());
				
				kaitlynsBaby.cry();
				
				System.out.println("Test not working!");
				Baby firstBaby = new Baby("Connor", 8.2, false);
				System.out.println("My first baby weighs " + firstBaby.weight);
				
				if(firstBaby.isGirl = true)
					{
						System.out.println("My first baby is a girl!");
					}
				
				else if(firstBaby.isGirl = false)
					{
						System.out.println("My first baby is a boy!");
					}
			}

	}

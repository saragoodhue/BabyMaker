
public class MakeBaby
	{
		public static void main(String[] args)
			{
				Baby kaitlynsBaby = new Baby("Abby", 7.6, true);
				System.out.println("Kaitlyn's baby is named " + kaitlynsBaby.getName());
				kaitlynsBaby.setName("Michael");
				System.out.println(kaitlynsBaby.getName());
				
				kaitlynsBaby.cry();
			}

	}

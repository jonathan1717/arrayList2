package arrayListOne;

import java.util.ArrayList;

public class arrayListOne
{

		public static void main(String[] args)
		{
			partOne();
			partTwo();
			partThree();
			partFour();
			partFive();
		}
			public static void partOne()
			{
				ArrayList<Double>humanTemps = new ArrayList<Double>();
				humanTemps.add(98.88);
				humanTemps.add(98.93);
				humanTemps.add(98.67);
				humanTemps.add(98.49);
				humanTemps.add(99.36);
				humanTemps.add(99.68);
				humanTemps.add(99.74);
				humanTemps.add(98.25);
				humanTemps.add(99.17);
				humanTemps.add(98.92);
				for (double i : humanTemps)
				
				 System.out.println (i + " degrees Fahrenheit");
				
					
			}
					
			public static void partTwo()
			{
				ArrayList<Double>humanTemps = new ArrayList<Double>();
				humanTemps.add(98.88);
				humanTemps.add(98.93);
				humanTemps.add(98.67);
				humanTemps.add(98.49);
				humanTemps.add(99.36);
				humanTemps.add(99.68);
				humanTemps.add(99.74);
				humanTemps.add(98.25);
				humanTemps.add(99.17);
				humanTemps.add(98.92);
				
				for (int i = 0; i < humanTemps.size(); i++)
					{
					if (humanTemps.get(i) > 98.6)
						{
							System.out.println("The fevers are " + humanTemps.get(i));
						}
					}
			}

			public static void partThree()
			{
				ArrayList<Double>humanTemps = new ArrayList<Double>();
				humanTemps.add(98.88);
				humanTemps.add(98.93);
				humanTemps.add(98.67);
				humanTemps.add(98.49);
				humanTemps.add(99.36);
				humanTemps.add(99.68);
				humanTemps.add(99.74);
				humanTemps.add(98.25);
				humanTemps.add(99.17);
				humanTemps.add(98.92);
				int i = 0;
				for (i =0; i < humanTemps.size(); i++)
					{
						System.out.println("The temp in Celcius is : " + (humanTemps.get(i) -32) / 1.8);
					}
				
				
			}

			public static void partFour()
			{
				ArrayList<Double>humanTemps = new ArrayList<Double>();
				humanTemps.add(98.88);
				humanTemps.add(98.93);
				humanTemps.add(98.67);
				humanTemps.add(98.49);
				humanTemps.add(99.36);
				humanTemps.add(99.68);
				humanTemps.add(99.74);
				humanTemps.add(98.25);
				humanTemps.add(99.17);
				humanTemps.add(98.92);
				
				for (int i = 0; i < humanTemps.size(); i++)
					{
					if (humanTemps.get(i) < 98.6)
						{
							System.out.println("The healthy temps are " + humanTemps.get(i));
						}
				
					}

			}
			
			public static void partFive()
			{
				ArrayList<Double>humanTemps = new ArrayList<Double>();
				humanTemps.add(98.88);
				humanTemps.add(98.93);
				humanTemps.add(98.99);
				humanTemps.add(98.49);
				humanTemps.add(99.36);
				humanTemps.add(99.68);
				humanTemps.add(99.74);
				humanTemps.add(98.25);
				humanTemps.add(99.17);
				humanTemps.add(98.92);
				
				double highTemp = humanTemps.get(0);
				double lowTemp = humanTemps.get(0);
				
				for(int i =0; i < humanTemps.size(); i++)
					{
						if (humanTemps.get(i) > highTemp)
							{
								highTemp = humanTemps.get(i);
							}
					
						if (humanTemps.get(i) <  lowTemp)
							{
								lowTemp = humanTemps.get(i);
							}
					}
				System.out.println("The highest temp is " + highTemp + " and the lowest temp is " + lowTemp);
			}

}
			
				
			
				
				
						
			
			





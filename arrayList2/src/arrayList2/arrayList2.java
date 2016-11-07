package arrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList2
	{

		public static void main(String[] args)
			{
//			partOne();
//			partTwo();
//			partThree();
				partFour();
			}
				public static void partOne()
					{
						ArrayList<String>teamNames = new ArrayList<String>();
						teamNames.add("Rockies");
						teamNames.add("Yankees");
						teamNames.add("Mariners");
						teamNames.add("Mets");
						teamNames.add("Cubs");
						teamNames.add("Red Sox");
						teamNames.add("Giants");
						teamNames.add("Phillies");
						teamNames.add("Marlins");
						teamNames.add("Rays");
						
						for (String t : teamNames)
							{
								System.out.println(t);
							}
					}
			
				@SuppressWarnings("unused")
				public static void partTwo()
				{
					ArrayList<String>teamNames = new ArrayList<String>();
					teamNames.add("Rockies");
					teamNames.add("Yankees");
					teamNames.add("Mariners");
					teamNames.add("Mets");
					teamNames.add("Cubs");
					teamNames.add("Red Sox");
					teamNames.add("Giants");
					teamNames.add("Phillies");
					teamNames.add("Marlins");
					teamNames.add("Rays");
					for ( String t : teamNames);
							{
							Collections.sort(teamNames);
							System.out.println(teamNames);
							}
				}
				
				public static void partThree()
					{
						ArrayList<String>teamNames = new ArrayList<String>();
						teamNames.add("Rockies");
						teamNames.add("Yankees");
						teamNames.add("Mariners");
						teamNames.add("Mets");
						teamNames.add("Cubs");
						teamNames.add("Red Sox");
						teamNames.add("Giants");
						teamNames.add("Phillies");
						teamNames.add("Marlins");
						teamNames.add("Rays");
						for ( String t : teamNames);
								{
								Collections.sort(teamNames);
								System.out.println(teamNames.get(0));
								System.out.println(teamNames.get(teamNames.size()-1));
								}
					}
				public static void partFour()
				{
						{
							ArrayList<String>teamNames = new ArrayList<String>();
							teamNames.add("Rockies");
							teamNames.add("Yankees");
							teamNames.add("Mariners");
							teamNames.add("Mets");
							teamNames.add("Cubs");
							teamNames.add("Red Sox");
							teamNames.add("Giants");
							teamNames.add("Phillies");
							teamNames.add("Marlins");
							teamNames.add("Rays");
							for (int i = 0; i < teamNames.size()-1; i++)
								{
									System.out.println(teamNames);
								}
						}
				}
				
			
	}

	

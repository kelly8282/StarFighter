package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
       

	public AlienHorde(int size)
	{
            aliens = new ArrayList<Alien>();
            for ( int i = 0 ; i < size; i ++)
            {
                int blank  = 800 / size;

                Alien a = new Alien(blank *i, 10);
                aliens.add(a);

            }
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for ( int i = 0 ; i < aliens.size() ; i++)
            {
                Alien blank = aliens.get(i);
                blank.draw(window);
            }
	}

	public void moveEmAll()
	{
            for ( int i = 0 ; i < aliens.size() ; i++)
            {
                Alien blank = aliens.get(i);
                //blank
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{   
             for ( int i = 0 ; i < shots.size(); i ++)
                {
                    Ammo blank = shots.get(i);
                    int temp = aliens.size();
                    for ( int j = 0; j < temp; j++)
                    {
                        Alien rawr = aliens.get(j);
                        if ( blank.getX() == rawr.getX() && blank.getY() == rawr.getY())
                        {
                            aliens.remove(j);
                            
                        }
                    }
                   
                     //remove alien
                 }
         }
	

	public String toString()
	{
		return "";
	}
}

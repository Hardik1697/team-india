
public class Movie 
{
	private String movieName;
	private int movieID;
	private boolean availability;
	Time time = new Time();
	System.out.println(time.getDay());
	public String getMovieName()
	{
		return movieName;
	}

	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}

	public int getMovieID()
	{
		return movieID;
	}

	public void setMovieID(int movieID)
	{
		this.movieID = movieID;
	}

	public boolean isAvailability()
	{
		return availability;
	}

	public void setAvailability(boolean availability)
	{
		this.availability = availability;
	}

}

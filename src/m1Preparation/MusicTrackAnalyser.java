package m1Preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Track {

	private int trackId;
	private String title;
	private String artist;
	private String genre;
	private int releaseYear;
	private double earnings;
	private double rating;

	public Track(int trackId, String title, String artist, String genre, int releaseYear, double earnings,
			double rating) {
		this.trackId = trackId;
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.earnings = earnings;
		this.rating = rating;
	}

	public int getTrackId() {
		return trackId;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public double getEarnings() {
		return earnings;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return title + " | " + artist + " | " + genre + " | " + releaseYear + " | " + earnings + " | " + rating;
	}
}

public class MusicTrackAnalyser {

	public static void main(String[] args) {

		List<Track> tracks = new ArrayList<>();

		tracks.add(new Track(1, "Skyline", "Arjun", "Pop", 2018, 12000, 4.5));
		tracks.add(new Track(2, "Midnight Beat", "Riya", "EDM", 2016, 15000, 4.7));
		tracks.add(new Track(3, "Ocean Waves", "Kabir", "Ambient", 2020, 9000, 4.2));
		tracks.add(new Track(4, "Firestorm", "Aman", "Rock", 2015, 20000, 4.8));
		tracks.add(new Track(5, "Dreamscape", "Neha", "Pop", 2019, 11000, 4.3));
		tracks.add(new Track(6, "Echoes", "Vikram", "Ambient", 2014, 8000, 4.1));
		tracks.add(new Track(7, "Night Drive", "Sara", "EDM", 2017, 17000, 4.6));
		tracks.add(new Track(8, "Golden Hour", "Ishaan", "Pop", 2021, 14000, 4.4));
		tracks.add(new Track(9, "Thunder", "Karan", "Rock", 2013, 22000, 4.9));
		tracks.add(new Track(10, "Calm Breeze", "Meera", "Ambient", 2018, 9500, 4.0));
		
		
Map<Integer,Track> groupIdMap=tracks.stream().collect(Collectors.toMap(Track::getTrackId,Function.identity()));
System.out.println(groupIdMap);


//tracks.stream().filter(e->e.getReleaseYear()<2019).forEach(System.out::println);

tracks.stream().sorted(Comparator.comparing(Track::getTitle)).forEach(System.out::println);

//tracks.stream().collect(Collectors.groupingBy(Track::getGenre,Collectors.counting(),Collectors.summarizingDouble(Track::getEarnings),Collectors.averagingDouble(Track::getEarnings)));

	}}
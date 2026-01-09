package polymorphismAssignment;

public class polymorphismMedia {

	static abstract class Media {
		abstract void play();
	}

	static class AudioFile extends Media {
		void play() {
			System.out.println("Playing Audio File");
		}
	}

	static class VideoFile extends Media {
		void play() {
			System.out.println("Playing Video File");
		}
	}

	static class Podcast extends Media {
		void play() {
			System.out.println("Playing Podcast");
		}
	}

	public static void main(String[] args) {

		Media audioFileMedia = new AudioFile();
		audioFileMedia.play();

		Media videoFileMedia = new VideoFile();
		videoFileMedia.play();
	}

}

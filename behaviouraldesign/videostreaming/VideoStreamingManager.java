package behaviouraldesign.videostreaming;

public class VideoStreamingManager {
	private Video video;
	private QualityAdjustmentStrategy qualityAdjuster;

	public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
		this.video = video;
		this.qualityAdjuster = qualityAdjustmentStrategy;
	}

	public Video streamVideo() {

		VideoQuality videoQuality = video.getVideoQuality();
		if (videoQuality == VideoQuality.LOW || videoQuality == VideoQuality.MEDIUM
				|| videoQuality == VideoQuality.HIGH) {
			return qualityAdjuster.adjust(video);
		} else {
			throw new IllegalArgumentException("Unsupported video quality: " + videoQuality);
		}
	}

}
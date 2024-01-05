package behaviouraldesign.videostreaming;

public class MediumQualitySetter implements QualityAdjustmentStrategy {
	@Override
	public VideoQuality supportsType() {
		return VideoQuality.MEDIUM;
	}

	@Override
	public Video adjust(Video video) {
		video.setCodec(VideoCodec.H264);
		video.setBitrate(500);
		return video;
	}

}

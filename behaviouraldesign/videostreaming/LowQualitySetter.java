package behaviouraldesign.videostreaming;

public class LowQualitySetter implements QualityAdjustmentStrategy{

	@Override
	public VideoQuality supportsType() {
		return VideoQuality.LOW;
	}

	@Override
	public Video adjust(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
	}

}

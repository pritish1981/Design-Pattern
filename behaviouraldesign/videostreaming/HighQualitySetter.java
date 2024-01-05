package behaviouraldesign.videostreaming;

public class HighQualitySetter implements QualityAdjustmentStrategy{
	@Override
	public VideoQuality supportsType() {
		return VideoQuality.HIGH;
	}

	@Override
	public Video adjust(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
	}


}

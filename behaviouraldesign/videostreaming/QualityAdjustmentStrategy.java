package behaviouraldesign.videostreaming;

public interface QualityAdjustmentStrategy {
	 VideoQuality supportsType();
	 Video adjust(Video video);
}

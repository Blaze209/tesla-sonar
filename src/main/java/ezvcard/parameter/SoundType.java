package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class SoundType extends MediaTypeParameter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b<SoundType> f63588d = new b<>(SoundType.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SoundType f63589e = new SoundType("AAC", "audio/aac", "aac");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SoundType f63590f = new SoundType("MIDI", "audio/midi", "mid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final SoundType f63591g = new SoundType("MP3", "audio/mp3", "mp3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SoundType f63592h = new SoundType("MPEG", "audio/mpeg", "mpeg");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SoundType f63593i = new SoundType("OGG", "audio/ogg", "ogg");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SoundType f63594j = new SoundType("WAV", "audio/wav", "wav");

    private SoundType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static SoundType f(String str, String str2, String str3) {
        return f63588d.d(new String[]{str, str2, str3});
    }

    public static SoundType g(String str, String str2, String str3) {
        return f63588d.e(new String[]{str, str2, str3});
    }
}

package vi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b&\u0010\n¨\u0006("}, d2 = {"Lvi/m;", "", "<init>", "()V", "", "a", "I", "g", "()I", "o", "(I)V", Snapshot.WIDTH, "b", "c", "k", Snapshot.HEIGHT, IntegerTokenConverter.CONVERTER_KEY, "bitrate", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "codecs", "e", "l", "index", "f", "n", "trackId", "", "Z", "h", "()Z", "setSelected", "(Z)V", "isSelected", "m", "rotation", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bitrate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String codecs = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String trackId = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isSelected;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int rotation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCodecs() {
        return this.codecs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void i(int i11) {
        this.bitrate = i11;
    }

    public final void j(String str) {
        s.k(str, "<set-?>");
        this.codecs = str;
    }

    public final void k(int i11) {
        this.height = i11;
    }

    public final void l(int i11) {
        this.index = i11;
    }

    public final void m(int i11) {
        this.rotation = i11;
    }

    public final void n(String str) {
        s.k(str, "<set-?>");
        this.trackId = str;
    }

    public final void o(int i11) {
        this.width = i11;
    }
}

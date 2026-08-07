package xy;

import android.media.AudioAttributes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Lxy/i;", "", "", "audioMode", "Landroid/media/AudioAttributes;", "audioAttributes", "audioStreamType", "<init>", "(ILandroid/media/AudioAttributes;I)V", "a", "I", "getAudioMode", "()I", "b", "Landroid/media/AudioAttributes;", "()Landroid/media/AudioAttributes;", "c", "getAudioStreamType", "Lxy/i$a;", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int audioMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AudioAttributes audioAttributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int audioStreamType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxy/i$a;", "Lxy/i;", "<init>", "()V", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
            s.j(audioAttributesBuild, "build(...)");
            super(3, audioAttributesBuild, 0, null);
        }
    }

    public /* synthetic */ i(int i11, AudioAttributes audioAttributes, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, audioAttributes, i12);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    private i(int i11, AudioAttributes audioAttributes, int i12) {
        this.audioMode = i11;
        this.audioAttributes = audioAttributes;
        this.audioStreamType = i12;
    }
}

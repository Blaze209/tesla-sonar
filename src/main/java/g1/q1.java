package g1;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class q1 extends e1 implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final r.a<m1, o1> f66990d = new r.a() { // from class: g1.p1
        @Override // r.a
        public final Object apply(Object obj) {
            return q1.k((m1) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.VideoCapabilities f66991c;

    q1(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f66884b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f66991c = videoCapabilities;
    }

    public static /* synthetic */ o1 k(m1 m1Var) {
        try {
            return i1.e.l(l(m1Var), null);
        } catch (InvalidConfigException e11) {
            c0.y0.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e11);
            return null;
        }
    }

    @NonNull
    public static q1 l(@NonNull m1 m1Var) {
        return new q1(h1.a.c(m1Var), m1Var.getMimeType());
    }

    @NonNull
    private static IllegalArgumentException m(@NonNull Throwable th2) {
        return th2 instanceof IllegalArgumentException ? (IllegalArgumentException) th2 : new IllegalArgumentException(th2);
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> a(int i11) {
        try {
            return this.f66991c.getSupportedWidthsFor(i11);
        } catch (Throwable th2) {
            throw m(th2);
        }
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> c() {
        return this.f66991c.getBitrateRange();
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> d(int i11) {
        try {
            return this.f66991c.getSupportedHeightsFor(i11);
        } catch (Throwable th2) {
            throw m(th2);
        }
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> e() {
        return this.f66991c.getSupportedWidths();
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> f() {
        return this.f66991c.getSupportedHeights();
    }

    @Override // g1.o1
    public boolean g() {
        return true;
    }

    @Override // g1.o1
    public int h() {
        return this.f66991c.getHeightAlignment();
    }

    @Override // g1.o1
    public boolean i(int i11, int i12) {
        return this.f66991c.isSizeSupported(i11, i12);
    }

    @Override // g1.o1
    public int j() {
        return this.f66991c.getWidthAlignment();
    }
}

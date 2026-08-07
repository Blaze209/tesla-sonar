package xl;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\u001eR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u000f\"\u0004\b$\u0010+R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)¨\u00061"}, d2 = {"Lxl/c;", "", "Lzl/b;", "frameScheduler", "<init>", "(Lzl/b;)V", "", DateTokenConverter.CONVERTER_KEY, "()J", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "j", "", "a", "()I", "c", "", "h", "()Z", "e", "Lzl/b;", "b", "Z", "g", "(Z)V", "running", "J", "getFrameSchedulingDelayMs", "setFrameSchedulingDelayMs", "(J)V", "frameSchedulingDelayMs", "getFrameSchedulingOffsetMs", "setFrameSchedulingOffsetMs", "frameSchedulingOffsetMs", "pauseTimeMs", "f", "startMs", "expectedRenderTimeMs", "lastFrameAnimationTimeMs", "lastFrameAnimationTimeDifferenceMs", "I", "getLastDrawnFrameNumber", "(I)V", "lastDrawnFrameNumber", "k", "pausedLastDrawnFrameNumber", "l", "framesDropped", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zl.b frameScheduler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean running;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long frameSchedulingDelayMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long frameSchedulingOffsetMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long pauseTimeMs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long startMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long expectedRenderTimeMs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastFrameAnimationTimeMs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long lastFrameAnimationTimeDifferenceMs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int lastDrawnFrameNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int pausedLastDrawnFrameNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int framesDropped;

    public c(zl.b frameScheduler) {
        s.k(frameScheduler, "frameScheduler");
        this.frameScheduler = frameScheduler;
        this.frameSchedulingDelayMs = 8L;
        this.lastDrawnFrameNumber = -1;
        this.pausedLastDrawnFrameNumber = -1;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long jD = this.running ? (d() - this.startMs) + this.frameSchedulingOffsetMs : Math.max(this.lastFrameAnimationTimeMs, 0L);
        int iB = this.frameScheduler.b(jD, this.lastFrameAnimationTimeMs);
        this.lastFrameAnimationTimeMs = jD;
        return iB;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    public final long c() {
        if (!this.running) {
            return -1L;
        }
        long jA = this.frameScheduler.a(d() - this.startMs);
        if (jA == -1) {
            this.running = false;
            return -1L;
        }
        long j11 = jA + this.frameSchedulingDelayMs;
        this.expectedRenderTimeMs = this.startMs + j11;
        return j11;
    }

    public final void e() {
        this.framesDropped++;
    }

    public final void f(int i11) {
        this.lastDrawnFrameNumber = i11;
    }

    public final void g(boolean z11) {
        this.running = z11;
    }

    public final boolean h() {
        return this.lastDrawnFrameNumber != -1 && d() >= this.expectedRenderTimeMs;
    }

    public final void i() {
        if (this.running) {
            return;
        }
        long jD = d();
        long j11 = jD - this.pauseTimeMs;
        this.startMs = j11;
        this.expectedRenderTimeMs = j11;
        this.lastFrameAnimationTimeMs = jD - this.lastFrameAnimationTimeDifferenceMs;
        this.lastDrawnFrameNumber = this.pausedLastDrawnFrameNumber;
        this.running = true;
    }

    public final void j() {
        if (this.running) {
            long jD = d();
            this.pauseTimeMs = jD - this.startMs;
            this.lastFrameAnimationTimeDifferenceMs = jD - this.lastFrameAnimationTimeMs;
            this.startMs = 0L;
            this.expectedRenderTimeMs = 0L;
            this.lastFrameAnimationTimeMs = -1L;
            this.lastDrawnFrameNumber = -1;
            this.running = false;
        }
    }
}

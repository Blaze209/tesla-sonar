package zl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ql.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzl/a;", "Lzl/b;", "Lql/d;", "animationInformation", "<init>", "(Lql/d;)V", "", "animationTimeMs", "lastFrameTimeMs", "", "b", "(JJ)I", DateTokenConverter.CONVERTER_KEY, "()J", "a", "(J)J", "", "e", "()Z", "timeInCurrentLoopMs", "c", "(J)I", "Lql/d;", "J", "_loopDurationMs", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d animationInformation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long _loopDurationMs;

    public a(d animationInformation) {
        s.k(animationInformation, "animationInformation");
        this.animationInformation = animationInformation;
        this._loopDurationMs = -1L;
    }

    @Override // zl.b
    public long a(long animationTimeMs) {
        long jD = d();
        long j11 = 0;
        if (jD == 0) {
            return -1L;
        }
        if (!e() && animationTimeMs / jD >= this.animationInformation.b()) {
            return -1L;
        }
        long j12 = animationTimeMs % jD;
        int iA = this.animationInformation.a();
        for (int i11 = 0; i11 < iA && j11 <= j12; i11++) {
            j11 += (long) this.animationInformation.j(i11);
        }
        return animationTimeMs + (j11 - j12);
    }

    @Override // zl.b
    public int b(long animationTimeMs, long lastFrameTimeMs) {
        long jD = d();
        if (jD == 0) {
            return c(0L);
        }
        if (e() || animationTimeMs / jD < this.animationInformation.b()) {
            return c(animationTimeMs % jD);
        }
        return -1;
    }

    public final int c(long timeInCurrentLoopMs) {
        int i11 = 0;
        long j11 = 0;
        while (true) {
            j11 += (long) this.animationInformation.j(i11);
            int i12 = i11 + 1;
            if (timeInCurrentLoopMs < j11) {
                return i11;
            }
            i11 = i12;
        }
    }

    public long d() {
        long j11 = this._loopDurationMs;
        if (j11 != -1) {
            return j11;
        }
        this._loopDurationMs = 0L;
        int iA = this.animationInformation.a();
        for (int i11 = 0; i11 < iA; i11++) {
            this._loopDurationMs += (long) this.animationInformation.j(i11);
        }
        return this._loopDurationMs;
    }

    public boolean e() {
        return this.animationInformation.b() == 0;
    }
}

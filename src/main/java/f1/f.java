package f1;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements u5.j<c1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0.a f63763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1.a f63764b;

    public f(@NonNull z0.a aVar, @NonNull j1.a aVar2) {
        this.f63763a = aVar;
        this.f63764b = aVar2;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c1.a get() {
        int iE = b.e(this.f63763a);
        int iF = b.f(this.f63763a);
        int iC = this.f63763a.c();
        Range<Integer> rangeD = this.f63763a.d();
        int iC2 = this.f63764b.c();
        if (iC == -1) {
            y0.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iC2);
            iC = iC2;
        } else {
            y0.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + iC2 + ", Resolved Channel Count: " + iC + "]");
        }
        int iG = this.f63764b.g();
        int iH = b.h(rangeD, iC, iF, iG);
        y0.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + iH + "Hz. [AudioProfile sample rate: " + iG + "Hz]");
        return c1.a.a().d(iE).c(iF).e(iC).f(iH).b();
    }
}

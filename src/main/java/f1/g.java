package f1;

import android.util.Range;
import androidx.annotation.NonNull;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements u5.j<c1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0.a f63765a;

    public g(@NonNull z0.a aVar) {
        this.f63765a = aVar;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c1.a get() {
        int iH;
        int iE = b.e(this.f63765a);
        int iF = b.f(this.f63765a);
        int iC = this.f63765a.c();
        if (iC == -1) {
            y0.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iC = 1;
        } else {
            y0.a("DefAudioResolver", "Using supplied AUDIO channel count: " + iC);
        }
        Range<Integer> rangeD = this.f63765a.d();
        if (z0.a.f126065b.equals(rangeD)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Using fallback AUDIO sample rate: ");
            iH = 44100;
            sb2.append(44100);
            sb2.append("Hz");
            y0.a("DefAudioResolver", sb2.toString());
        } else {
            iH = b.h(rangeD, iC, iF, ((Integer) rangeD.getUpper()).intValue());
            y0.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + iH + "Hz");
        }
        return c1.a.a().d(iE).c(iF).e(iC).f(iH).b();
    }
}

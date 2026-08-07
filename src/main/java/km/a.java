package km;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkm/a;", "", "<init>", "()V", "", "frameDurationMs", "Ljn0/h0;", "a", "([I)V", "", "c", "([I)I", "frameDurationsMs", "b", "([I)[I", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {
    public final void a(int[] frameDurationMs) {
        s.k(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (frameDurationMs[i11] < 11) {
                frameDurationMs[i11] = 100;
            }
        }
    }

    public final int[] b(int[] frameDurationsMs) {
        s.k(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length = frameDurationsMs.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = i11;
            i11 += frameDurationsMs[i12];
        }
        return iArr;
    }

    public final int c(int[] frameDurationMs) {
        s.k(frameDurationMs, "frameDurationMs");
        int i11 = 0;
        for (int i12 : frameDurationMs) {
            i11 += i12;
        }
        return i11;
    }
}

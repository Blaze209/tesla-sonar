package uc;

import okio.j;
import okio.k;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokio/j;", "Lokio/k;", "bytes", "", "fromIndex", "toIndex", "a", "(Lokio/j;Lokio/k;JJ)J", "coil-svg_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final long a(j jVar, k kVar, long j11, long j12) {
        if (kVar.D() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte bH = kVar.h(0);
        long jD = j12 - ((long) kVar.D());
        long j13 = j11;
        while (j13 < jD) {
            j jVar2 = jVar;
            long jA2 = jVar2.a2(bH, j13, jD);
            if (jA2 == -1 || jVar2.l0(jA2, kVar)) {
                return jA2;
            }
            j13 = jA2 + 1;
            jVar = jVar2;
        }
        return -1L;
    }
}

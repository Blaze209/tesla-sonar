package ll0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lll0/r;", "", "value", "Ljn0/h0;", "a", "(Lll0/r;S)V", "b", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final void a(r rVar, short s11) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        int tailPosition = rVar.getTailPosition();
        if (rVar.getTailEndExclusive() - tailPosition <= 2) {
            b(rVar, s11);
        } else {
            rVar.w0(tailPosition + 2);
            rVar.getTailMemory().putShort(tailPosition, s11);
        }
    }

    private static final void b(r rVar, short s11) {
        f.f(rVar.u0(2), s11);
        rVar.n();
    }
}

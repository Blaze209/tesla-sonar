package ll0;

import java.nio.ByteBuffer;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljava/nio/ByteBuffer;", "bb", "Lkotlin/Function1;", "Ljn0/h0;", "release", "Lll0/k;", "a", "(Ljava/nio/ByteBuffer;Lwn0/l;)Lll0/k;", "Lnl0/f;", "Lml0/a;", "b", "(Ljava/nio/ByteBuffer;Lwn0/l;)Lnl0/f;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final k a(ByteBuffer bb2, wn0.l<? super ByteBuffer, h0> release) {
        p013kotlin.jvm.internal.s.k(bb2, "bb");
        p013kotlin.jvm.internal.s.k(release, "release");
        nl0.f<ml0.a> fVarB = b(bb2, release);
        ml0.a aVarS2 = fVarB.S2();
        aVarS2.s();
        return new k(aVarS2, fVarB);
    }

    private static final nl0.f<ml0.a> b(ByteBuffer byteBuffer, wn0.l<? super ByteBuffer, h0> lVar) {
        return new v(byteBuffer, lVar);
    }
}

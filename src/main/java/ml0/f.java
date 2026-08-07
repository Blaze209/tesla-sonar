package ml0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ll0.j;
import ll0.k;
import ll0.o;
import ll0.r;
import ll0.u;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Lll0/k;", "Lll0/j;", "builder", "", "e", "(Lll0/k;Lll0/j;)I", "Lll0/o;", "minSize", "Lml0/a;", "b", "(Lll0/o;I)Lml0/a;", "current", "Ljn0/h0;", "a", "(Lll0/o;Lml0/a;)V", "c", "(Lll0/o;Lml0/a;)Lml0/a;", "Lll0/r;", "capacity", DateTokenConverter.CONVERTER_KEY, "(Lll0/r;ILml0/a;)Lml0/a;", "", "[B", "EmptyByteArray", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f92337a = new byte[0];

    public static final void a(o oVar, a current) {
        s.k(oVar, "<this>");
        s.k(current, "current");
        if (current == oVar) {
            return;
        }
        if (current.getWritePosition() <= current.getReadPosition()) {
            oVar.c0(current);
        } else if (current.getCapacity() - current.getLimit() < 8) {
            oVar.s0(current);
        } else {
            oVar.s1(current.getReadPosition());
        }
    }

    public static final a b(o oVar, int i11) {
        s.k(oVar, "<this>");
        return oVar.Y0(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(o oVar, a current) {
        s.k(oVar, "<this>");
        s.k(current, "current");
        if (current != oVar) {
            return oVar.k0(current);
        }
        if (oVar.t()) {
            return (a) oVar;
        }
        return null;
    }

    public static final a d(r rVar, int i11, a aVar) {
        s.k(rVar, "<this>");
        if (aVar != null) {
            rVar.n();
        }
        return rVar.u0(i11);
    }

    public static final int e(k kVar, j builder) {
        s.k(kVar, "<this>");
        s.k(builder, "builder");
        int iU0 = builder.U0();
        a aVarY0 = builder.y0();
        if (aVarY0 == null) {
            return 0;
        }
        if (iU0 <= u.a() && aVarY0.B() == null && kVar.H1(aVarY0)) {
            builder.c();
            return iU0;
        }
        kVar.n(aVarY0);
        return iU0;
    }
}

package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0082\u0010¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0080\u0010¢\u0006\u0004\b\f\u0010\u0007\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lml0/a;", "Lnl0/f;", "pool", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lml0/a;Lnl0/f;)V", "a", "(Lml0/a;)Lml0/a;", "head", "prev", "b", "(Lml0/a;Lml0/a;Lml0/a;)Lml0/a;", "c", "", "e", "(Lml0/a;)J", "n", "f", "(Lml0/a;J)J", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final ml0.a a(ml0.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        ml0.a aVarA = aVar.A();
        ml0.a aVarB = aVar.B();
        return aVarB == null ? aVarA : b(aVarB, aVarA, aVarA);
    }

    private static final ml0.a b(ml0.a aVar, ml0.a aVar2, ml0.a aVar3) {
        while (true) {
            ml0.a aVarA = aVar.A();
            aVar3.G(aVarA);
            aVar = aVar.B();
            if (aVar == null) {
                return aVar2;
            }
            aVar3 = aVarA;
        }
    }

    public static final ml0.a c(ml0.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        while (true) {
            ml0.a aVarB = aVar.B();
            if (aVarB == null) {
                return aVar;
            }
            aVar = aVarB;
        }
    }

    public static final void d(ml0.a aVar, nl0.f<ml0.a> pool) {
        p013kotlin.jvm.internal.s.k(pool, "pool");
        while (aVar != null) {
            ml0.a aVarZ = aVar.z();
            aVar.E(pool);
            aVar = aVarZ;
        }
    }

    public static final long e(ml0.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return f(aVar, 0L);
    }

    private static final long f(ml0.a aVar, long j11) {
        do {
            j11 += (long) (aVar.getWritePosition() - aVar.getReadPosition());
            aVar = aVar.B();
        } while (aVar != null);
        return j11;
    }
}

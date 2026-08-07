package ll0;

import java.io.EOFException;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lll0/o;", "", "a", "(Lll0/o;)S", "b", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final short a(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        if (oVar.getHeadEndExclusive() - oVar.getHeadPosition() <= 2) {
            return b(oVar);
        }
        int headPosition = oVar.getHeadPosition();
        oVar.s1(headPosition + 2);
        return oVar.getHeadMemory().getShort(headPosition);
    }

    private static final short b(o oVar) throws EOFException {
        ml0.a aVarB = ml0.f.b(oVar, 2);
        if (aVarB == null) {
            w.a(2);
            throw new KotlinNothingValueException();
        }
        short sC = f.c(aVarB);
        ml0.f.a(oVar, aVarB);
        return sC;
    }
}

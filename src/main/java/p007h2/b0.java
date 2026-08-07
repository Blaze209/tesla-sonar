package p007h2;

import j3.g;
import j3.i;
import j3.j;
import p013kotlin.Metadata;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lz3/v;", "Lj3/i;", "b", "(Lz3/v;)Lj3/i;", "Lj3/g;", "offset", "", "a", "(Lj3/i;J)Z", "Lj3/i;", "invertedInfiniteRect", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f70239a = new i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(i iVar, long j11) {
        float left = iVar.getLeft();
        float right = iVar.getRight();
        float fM = g.m(j11);
        if (left > fM || fM > right) {
            return false;
        }
        float top = iVar.getTop();
        float bottom = iVar.getBottom();
        float fN = g.n(j11);
        return top <= fN && fN <= bottom;
    }

    public static final i b(v vVar) {
        i iVarC = w.c(vVar);
        return j.a(vVar.d0(iVarC.m()), vVar.d0(iVarC.f()));
    }
}

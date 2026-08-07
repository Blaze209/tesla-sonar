package pl0;

import ll0.j;
import ll0.k;
import ll0.o;
import ll0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl0/b$b;", "Lpl0/a;", "a", "(Lpl0/b$b;)Lpl0/a;", "ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final a a(b.C2194b c2194b) {
        s.k(c2194b, "<this>");
        if (c2194b.getData().length < 2) {
            return null;
        }
        j jVar = new j(null, 1, null);
        try {
            ll0.s.d(jVar, c2194b.getData(), 0, 0, 6, null);
            k kVarT0 = jVar.T0();
            return new a(q.a(kVarT0), o.h1(kVarT0, 0, 0, 3, null));
        } catch (Throwable th2) {
            jVar.release();
            throw th2;
        }
    }
}

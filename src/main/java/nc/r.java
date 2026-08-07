package nc;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import okio.c0;
import okio.i0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lnc/r;", "Lnc/q;", "Lokio/j;", "source", "o", "(Lokio/j;)Lokio/j;", "Lokio/i;", "sink", "Ljn0/h0;", "H", "(Lokio/j;Lokio/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/o;", "fileSystem", "Lokio/i0;", "path", "I", "(Lokio/j;Lokio/o;Lokio/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(Lokio/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lokio/j;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@vn0.b
final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okio.j source;

    private /* synthetic */ r(okio.j jVar) {
        this.source = jVar;
    }

    public static String B(okio.j jVar) {
        return "SourceResponseBody(source=" + jVar + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static Object H(okio.j jVar, okio.i iVar, Continuation<? super h0> continuation) {
        jVar.D1(iVar);
        return h0.f84049a;
    }

    public static Object I(okio.j jVar, okio.o oVar, i0 i0Var, Continuation<? super h0> continuation) throws Throwable {
        okio.i iVarC = c0.c(oVar.n0(i0Var, false));
        try {
            Boxing.boxLong(jVar.D1(iVarC));
            if (iVarC != null) {
                try {
                    iVarC.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            if (iVarC != null) {
                try {
                    iVarC.close();
                } catch (Throwable th4) {
                    jn0.g.a(th, th4);
                }
            }
        }
        if (th == null) {
            return h0.f84049a;
        }
        throw th;
    }

    public static final /* synthetic */ r c(okio.j jVar) {
        return new r(jVar);
    }

    public static void n(okio.j jVar) {
        jVar.close();
    }

    public static boolean p(okio.j jVar, Object obj) {
        return (obj instanceof r) && s.f(jVar, ((r) obj).getSource());
    }

    public static int t(okio.j jVar) {
        return jVar.hashCode();
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final /* synthetic */ okio.j getSource() {
        return this.source;
    }

    @Override // nc.q
    public Object V2(okio.o oVar, i0 i0Var, Continuation<? super h0> continuation) {
        return I(this.source, oVar, i0Var, continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        n(this.source);
    }

    public boolean equals(Object other) {
        return p(this.source, other);
    }

    public int hashCode() {
        return t(this.source);
    }

    public String toString() {
        return B(this.source);
    }

    @Override // nc.q
    public Object u(okio.i iVar, Continuation<? super h0> continuation) {
        return H(this.source, iVar, continuation);
    }

    public static okio.j o(okio.j jVar) {
        return jVar;
    }
}

package androidx.compose.runtime.snapshots;

import androidx.collection.l0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 /2\u00020\u0001:\u0001\"B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H ¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH ¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010)\u0012\u0004\b4\u0010\nR$\u00109\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00028P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010,R\u0014\u0010;\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u00100R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X¡\u0004¢\u0006\f\u0012\u0004\b>\u0010\n\u001a\u0004\b<\u0010=R\"\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b?\u0010=\u0082\u0001\u0004ABCD¨\u0006E"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/i;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Lkotlin/Function1;", "readObserver", "x", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "l", "()Landroidx/compose/runtime/snapshots/g;", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/g;)V", "m", "n", "Lb3/k;", "state", "p", "(Lb3/k;)V", "o", "b", "c", "r", "z", "q", "y", "()I", "a", "Landroidx/compose/runtime/snapshots/i;", "g", "()Landroidx/compose/runtime/snapshots/i;", "v", "(Landroidx/compose/runtime/snapshots/i;)V", "<set-?>", "I", "f", "u", "(I)V", "", "Z", "e", "()Z", "t", "(Z)V", "disposed", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "value", "j", "w", "writeCount", IntegerTokenConverter.CONVERTER_KEY, "readOnly", "h", "()Lwn0/l;", "getReadObserver$annotations", "k", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/q;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5166f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i invalid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010$¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/g$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "p", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Landroidx/compose/runtime/snapshots/b;", "o", "(Lwn0/l;Lwn0/l;)Landroidx/compose/runtime/snapshots/b;", "T", "Lkotlin/Function0;", "block", "h", "(Lwn0/l;Lwn0/l;Lwn0/a;)Ljava/lang/Object;", "previous", "f", "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;", "nonObservable", "observer", "m", "(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lwn0/l;)V", "Lkotlin/Function2;", "", "Lb3/b;", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/p;)Lb3/b;", "k", "(Lwn0/l;)Lb3/b;", "g", "n", "c", "()Landroidx/compose/runtime/snapshots/g;", "current", "", "e", "()Z", "isInSnapshot", DateTokenConverter.CONVERTER_KEY, "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(wn0.p pVar) {
            synchronized (j.I()) {
                j.f5192h = v.M0(j.f5192h, pVar);
                h0 h0Var = h0.f84049a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(wn0.l lVar) {
            synchronized (j.I()) {
                j.f5193i = v.M0(j.f5193i, lVar);
                h0 h0Var = h0.f84049a;
            }
            j.B();
        }

        public final g c() {
            return j.H();
        }

        public final g d() {
            return (g) j.f5186b.a();
        }

        public final boolean e() {
            return j.f5186b.a() != null;
        }

        public final g f(g previous) {
            if (previous instanceof p) {
                p pVar = (p) previous;
                if (pVar.getThreadId() == p020r2.c.a()) {
                    pVar.X(null);
                    return previous;
                }
            }
            if (previous instanceof q) {
                q qVar = (q) previous;
                if (qVar.C() == p020r2.c.a()) {
                    qVar.F(null);
                    return previous;
                }
            }
            g gVarE = j.E(previous, null, false, 6, null);
            gVarE.l();
            return gVarE;
        }

        public final void g() {
            j.H().o();
        }

        public final <T> T h(wn0.l<Object, h0> readObserver, wn0.l<Object, h0> writeObserver, wn0.a<? extends T> block) {
            g pVar;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            g gVar = (g) j.f5186b.a();
            if (gVar instanceof p) {
                p pVar2 = (p) gVar;
                if (pVar2.getThreadId() == p020r2.c.a()) {
                    wn0.l<Object, h0> lVarH = pVar2.h();
                    wn0.l<Object, h0> lVarK = pVar2.k();
                    try {
                        ((p) gVar).X(j.L(readObserver, lVarH, false, 4, null));
                        ((p) gVar).Y(j.M(writeObserver, lVarK));
                        return block.invoke();
                    } finally {
                        pVar2.X(lVarH);
                        pVar2.Y(lVarK);
                    }
                }
            }
            if (gVar == null || (gVar instanceof b)) {
                pVar = new p(gVar instanceof b ? (b) gVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                pVar = gVar.x(readObserver);
            }
            try {
                g gVarL = pVar.l();
                try {
                    T tInvoke = block.invoke();
                    pVar.s(gVarL);
                    pVar.d();
                    return tInvoke;
                } catch (Throwable th2) {
                    pVar.s(gVarL);
                    throw th2;
                }
            } catch (Throwable th3) {
                pVar.d();
                throw th3;
            }
        }

        public final b3.b i(final wn0.p<? super Set<? extends Object>, ? super g, h0> observer) {
            j.A(j.f5185a);
            synchronized (j.I()) {
                j.f5192h = v.Q0(j.f5192h, observer);
                h0 h0Var = h0.f84049a;
            }
            return new b3.b() { // from class: b3.c
                @Override // b3.b
                public final void dispose() {
                    androidx.compose.runtime.snapshots.g.Companion.j(observer);
                }
            };
        }

        public final b3.b k(final wn0.l<Object, h0> observer) {
            synchronized (j.I()) {
                j.f5193i = v.Q0(j.f5193i, observer);
                h0 h0Var = h0.f84049a;
            }
            j.B();
            return new b3.b() { // from class: b3.d
                @Override // b3.b
                public final void dispose() {
                    androidx.compose.runtime.snapshots.g.Companion.l(observer);
                }
            };
        }

        public final void m(g previous, g nonObservable, wn0.l<Object, h0> observer) {
            if (previous != nonObservable) {
                nonObservable.s(previous);
                nonObservable.d();
            } else if (previous instanceof p) {
                ((p) previous).X(observer);
            } else {
                if (previous instanceof q) {
                    ((q) previous).F(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void n() {
            boolean z11;
            synchronized (j.I()) {
                l0<b3.k> l0VarE = ((a) j.f5194j.get()).E();
                z11 = false;
                if (l0VarE != null && l0VarE.e()) {
                    z11 = true;
                }
            }
            if (z11) {
                j.B();
            }
        }

        public final b o(wn0.l<Object, h0> readObserver, wn0.l<Object, h0> writeObserver) {
            b bVarQ;
            g gVarH = j.H();
            b bVar = gVarH instanceof b ? (b) gVarH : null;
            if (bVar == null || (bVarQ = bVar.Q(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return bVarQ;
        }

        public final g p(wn0.l<Object, h0> readObserver) {
            return j.H().x(readObserver);
        }

        private Companion() {
        }
    }

    public /* synthetic */ g(int i11, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, iVar);
    }

    public final void b() {
        synchronized (j.I()) {
            c();
            r();
            h0 h0Var = h0.f84049a;
        }
    }

    public void c() {
        j.f5188d = j.f5188d.k(getId());
    }

    public void d() {
        this.disposed = true;
        synchronized (j.I()) {
            q();
            h0 h0Var = h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public i getInvalid() {
        return this.invalid;
    }

    public abstract wn0.l<Object, h0> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract wn0.l<Object, h0> k();

    public g l() {
        g gVar = (g) j.f5186b.a();
        j.f5186b.b(this);
        return gVar;
    }

    public abstract void m(g snapshot);

    public abstract void n(g snapshot);

    public abstract void o();

    public abstract void p(b3.k state);

    public final void q() {
        int i11 = this.pinningTrackingHandle;
        if (i11 >= 0) {
            j.Y(i11);
            this.pinningTrackingHandle = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(g snapshot) {
        j.f5186b.b(snapshot);
    }

    public final void t(boolean z11) {
        this.disposed = z11;
    }

    public void u(int i11) {
        this.id = i11;
    }

    public void v(i iVar) {
        this.invalid = iVar;
    }

    public void w(int i11) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g x(wn0.l<Object, h0> readObserver);

    public final int y() {
        int i11 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i11;
    }

    public final void z() {
        if (this.disposed) {
            a2.a("Cannot use a disposed snapshot");
        }
    }

    private g(int i11, i iVar) {
        this.invalid = iVar;
        this.id = i11;
        this.pinningTrackingHandle = i11 != 0 ? j.c0(i11, getInvalid()) : -1;
    }
}

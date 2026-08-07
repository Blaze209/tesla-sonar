package z3;

import b4.w1;
import b4.x1;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR>\u0010#\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0015\u0012\u0004\u0012\u00020\t0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0014\u0010&\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lz3/h1;", "", "Lz3/j1;", "slotReusePolicy", "<init>", "(Lz3/j1;)V", "()V", "slotId", "Lkotlin/Function0;", "Ljn0/h0;", "content", "Lz3/h1$a;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lwn0/p;)Lz3/h1$a;", DateTokenConverter.CONVERTER_KEY, "a", "Lz3/j1;", "Lz3/d0;", "b", "Lz3/d0;", "_state", "Lkotlin/Function2;", "Lb4/g0;", "c", "Lwn0/p;", "g", "()Lwn0/p;", "setRoot", "Lr2/q;", "e", "setCompositionContext", "Lz3/i1;", "Lw4/b;", "Lz3/j0;", "f", "setMeasurePolicy", "h", "()Lz3/d0;", "state", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f126744f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j1 slotReusePolicy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d0 _state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<b4.g0, h1, jn0.h0> setRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<b4.g0, p020r2.q, jn0.h0> setCompositionContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<b4.g0, wn0.p<? super i1, ? super w4.b, ? extends j0>, jn0.h0> setMeasurePolicy;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g0;", "Lr2/q;", "it", "Ljn0/h0;", "a", "(Lb4/g0;Lr2/q;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<b4.g0, p020r2.q, jn0.h0> {
        b() {
            super(2);
        }

        public final void a(b4.g0 g0Var, p020r2.q qVar) {
            h1.this.h().I(qVar);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.g0 g0Var, p020r2.q qVar) {
            a(g0Var, qVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb4/g0;", "Lkotlin/Function2;", "Lz3/i1;", "Lw4/b;", "Lz3/j0;", "it", "Ljn0/h0;", "a", "(Lb4/g0;Lwn0/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<b4.g0, wn0.p<? super i1, ? super w4.b, ? extends j0>, jn0.h0> {
        c() {
            super(2);
        }

        public final void a(b4.g0 g0Var, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar) {
            g0Var.g(h1.this.h().u(pVar));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.g0 g0Var, wn0.p<? super i1, ? super w4.b, ? extends j0> pVar) {
            a(g0Var, pVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/g0;", "Lz3/h1;", "it", "Ljn0/h0;", "a", "(Lb4/g0;Lz3/h1;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<b4.g0, h1, jn0.h0> {
        d() {
            super(2);
        }

        public final void a(b4.g0 g0Var, h1 h1Var) {
            h1 h1Var2 = h1.this;
            d0 subcompositionsState = g0Var.getSubcompositionsState();
            if (subcompositionsState == null) {
                subcompositionsState = new d0(g0Var, h1.this.slotReusePolicy);
                g0Var.J1(subcompositionsState);
            }
            h1Var2._state = subcompositionsState;
            h1.this.h().B();
            h1.this.h().J(h1.this.slotReusePolicy);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.g0 g0Var, h1 h1Var) {
            a(g0Var, h1Var);
            return jn0.h0.f84049a;
        }
    }

    public h1(j1 j1Var) {
        this.slotReusePolicy = j1Var;
        this.setRoot = new d();
        this.setCompositionContext = new b();
        this.setMeasurePolicy = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 h() {
        d0 d0Var = this._state;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().z();
    }

    public final wn0.p<b4.g0, p020r2.q, jn0.h0> e() {
        return this.setCompositionContext;
    }

    public final wn0.p<b4.g0, wn0.p<? super i1, ? super w4.b, ? extends j0>, jn0.h0> f() {
        return this.setMeasurePolicy;
    }

    public final wn0.p<b4.g0, h1, jn0.h0> g() {
        return this.setRoot;
    }

    public final a i(Object slotId, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content) {
        return h().G(slotId, content);
    }

    public h1() {
        this(o0.f126786a);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lz3/h1$a;", "", "Ljn0/h0;", "dispose", "()V", "", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "c", "(IJ)V", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lb4/x1;", "Lb4/w1;", "block", "b", "(Ljava/lang/Object;Lwn0/l;)V", "a", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        default int a() {
            return 0;
        }

        void dispose();

        default void b(Object key, wn0.l<? super x1, ? extends w1> block) {
        }

        default void c(int index, long constraints) {
        }
    }
}

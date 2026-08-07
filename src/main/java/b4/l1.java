package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0017\u001a\u00020\u0004\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"¨\u0006-"}, d2 = {"Lb4/l1;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ljn0/h0;", "onChangedExecutor", "<init>", "(Lwn0/l;)V", "Lb4/g0;", "node", "", "affectsLookahead", "block", "e", "(Lb4/g0;ZLwn0/a;)V", "c", "g", "j", "(Lb4/g0;Lwn0/a;)V", "Lb4/k1;", "T", "target", "onChanged", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/k1;Lwn0/l;Lwn0/a;)V", "b", "()V", "a", "(Ljava/lang/Object;)V", "k", "l", "Landroidx/compose/runtime/snapshots/l;", "Landroidx/compose/runtime/snapshots/l;", "observer", "Lwn0/l;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", DateTokenConverter.CONVERTER_KEY, "onCommitAffectingSemantics", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16205i = androidx.compose.runtime.snapshots.l.f5211k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.l observer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingLookaheadMeasure = f.f16219c;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingMeasure = g.f16220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingSemantics = h.f16221c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingLayout = b.f16215c;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingLayoutModifier = c.f16216c;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingLayoutModifierInLookahead = d.f16217c;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g0, jn0.h0> onCommitAffectingLookahead = e.f16218c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f16214c = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.l
        public final Boolean invoke(Object obj) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((k1) obj).u0());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f16215c = new b();

        b() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.u1(g0Var, false, 1, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f16216c = new c();

        c() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.u1(g0Var, false, 1, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f16217c = new d();

        d() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.q1(g0Var, false, 1, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f16218c = new e();

        e() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.q1(g0Var, false, 1, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f16219c = new f();

        f() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.s1(g0Var, false, false, false, 7, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f16220c = new g();

        g() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0.w1(g0Var, false, false, false, 7, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "layoutNode", "Ljn0/h0;", "a", "(Lb4/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f16221c = new h();

        h() {
            super(1);
        }

        public final void a(g0 g0Var) {
            if (g0Var.u0()) {
                g0Var.I0();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    public l1(wn0.l<? super wn0.a<jn0.h0>, jn0.h0> lVar) {
        this.observer = new androidx.compose.runtime.snapshots.l(lVar);
    }

    public static /* synthetic */ void d(l1 l1Var, g0 g0Var, boolean z11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        l1Var.c(g0Var, z11, aVar);
    }

    public static /* synthetic */ void f(l1 l1Var, g0 g0Var, boolean z11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        l1Var.e(g0Var, z11, aVar);
    }

    public static /* synthetic */ void h(l1 l1Var, g0 g0Var, boolean z11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        l1Var.g(g0Var, z11, aVar);
    }

    public final void a(Object target) {
        this.observer.k(target);
    }

    public final void b() {
        this.observer.l(a.f16214c);
    }

    public final void c(g0 node, boolean affectsLookahead, wn0.a<jn0.h0> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            i(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void e(g0 node, boolean affectsLookahead, wn0.a<jn0.h0> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayout, block);
        } else {
            i(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void g(g0 node, boolean affectsLookahead, wn0.a<jn0.h0> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingMeasure, block);
        } else {
            i(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final <T extends k1> void i(T target, wn0.l<? super T, jn0.h0> onChanged, wn0.a<jn0.h0> block) {
        this.observer.o(target, onChanged, block);
    }

    public final void j(g0 node, wn0.a<jn0.h0> block) {
        i(node, this.onCommitAffectingSemantics, block);
    }

    public final void k() {
        this.observer.s();
    }

    public final void l() {
        this.observer.t();
        this.observer.j();
    }
}

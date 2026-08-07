package androidx.compose.animation;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p015o1.ChangeSize;
import p015o1.Slide;
import p015o1.p;
import p015o1.q;
import p019p1.g0;
import p019p1.l1;
import p020r2.y3;
import w4.r;
import w4.t;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ&\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010k\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d8\u0006¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u0013\u0010p\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bo\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/animation/h;", "Lo1/q;", "Lp1/l1;", "Lo1/k;", "transition", "Lp1/l1$a;", "Lw4/r;", "Lp1/n;", "sizeAnimation", "Lw4/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lo1/p;", "graphicsLayerBlock", "<init>", "(Lp1/l1;Lp1/l1$a;Lp1/l1$a;Lp1/l1$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lwn0/a;Lo1/p;)V", "targetState", "fullSize", "J2", "(Lo1/k;J)J", "Ljn0/h0;", "h2", "()V", "L2", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "K2", "n", "Lp1/l1;", "getTransition", "()Lp1/l1;", "I2", "(Lp1/l1;)V", "o", "Lp1/l1$a;", "getSizeAnimation", "()Lp1/l1$a;", "G2", "(Lp1/l1$a;)V", "p", "getOffsetAnimation", "F2", "q", "getSlideAnimation", "H2", "r", "Landroidx/compose/animation/i;", "y2", "()Landroidx/compose/animation/i;", "B2", "(Landroidx/compose/animation/i;)V", "s", "Landroidx/compose/animation/k;", "z2", "()Landroidx/compose/animation/k;", "C2", "(Landroidx/compose/animation/k;)V", "t", "Lwn0/a;", "()Lwn0/a;", "A2", "(Lwn0/a;)V", "u", "Lo1/p;", "getGraphicsLayerBlock", "()Lo1/p;", "D2", "(Lo1/p;)V", "v", "Z", "lookaheadConstraintsAvailable", "w", "J", "lookaheadSize", "value", "x", "E2", "(J)V", "lookaheadConstraints", "Ld3/c;", "y", "Ld3/c;", "getCurrentAlignment", "()Ld3/c;", "setCurrentAlignment", "(Ld3/c;)V", "currentAlignment", "Lkotlin/Function1;", "Lp1/l1$b;", "Lp1/g0;", "z", "Lwn0/l;", "getSizeTransitionSpec", "()Lwn0/l;", "sizeTransitionSpec", "A", "getSlideSpec", "slideSpec", "x2", "alignment", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private l1<p015o1.k> transition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private l1<p015o1.k>.a<r, p019p1.n> sizeAnimation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private l1<p015o1.k>.a<w4.n, p019p1.n> offsetAnimation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l1<p015o1.k>.a<w4.n, p019p1.n> slideAnimation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.animation.i enter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private k exit;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private wn0.a<Boolean> isEnabled;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private p graphicsLayerBlock;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private d3.c currentAlignment;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = androidx.compose.animation.f.c();

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = w4.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<l1.b<p015o1.k>, g0<r>> sizeTransitionSpec = new i();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final wn0.l<l1.b<p015o1.k>, g0<w4.n>> slideSpec = new j();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4106a;

        static {
            int[] iArr = new int[p015o1.k.values().length];
            try {
                iArr[p015o1.k.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p015o1.k.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p015o1.k.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4106a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0 w0Var) {
            super(1);
            this.f4107c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f4107c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f4110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<androidx.compose.ui.graphics.c, h0> f4111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(w0 w0Var, long j11, long j12, wn0.l<? super androidx.compose.ui.graphics.c, h0> lVar) {
            super(1);
            this.f4108c = w0Var;
            this.f4109d = j11;
            this.f4110e = j12;
            this.f4111f = lVar;
        }

        public final void a(w0.a aVar) {
            aVar.u(this.f4108c, w4.n.h(this.f4110e) + w4.n.h(this.f4109d), w4.n.i(this.f4110e) + w4.n.i(this.f4109d), BitmapDescriptorFactory.HUE_RED, this.f4111f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w0 w0Var) {
            super(1);
            this.f4112c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f4112c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "Lw4/r;", "a", "(Lo1/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<p015o1.k, r> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4114d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11) {
            super(1);
            this.f4114d = j11;
        }

        public final long a(p015o1.k kVar) {
            return h.this.J2(kVar, this.f4114d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ r invoke(p015o1.k kVar) {
            return r.b(a(kVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "Lw4/n;", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<l1.b<p015o1.k>, g0<w4.n>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f4115c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<w4.n> invoke(l1.b<p015o1.k> bVar) {
            return androidx.compose.animation.g.f4057c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "Lw4/n;", "a", "(Lo1/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.l<p015o1.k, w4.n> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j11) {
            super(1);
            this.f4117d = j11;
        }

        public final long a(p015o1.k kVar) {
            return h.this.L2(kVar, this.f4117d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(p015o1.k kVar) {
            return w4.n.b(a(kVar));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "Lw4/n;", "a", "(Lo1/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class C0084h extends u implements wn0.l<p015o1.k, w4.n> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0084h(long j11) {
            super(1);
            this.f4119d = j11;
        }

        public final long a(p015o1.k kVar) {
            return h.this.K2(kVar, this.f4119d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(p015o1.k kVar) {
            return w4.n.b(a(kVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "Lw4/r;", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<l1.b<p015o1.k>, g0<r>> {
        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<r> invoke(l1.b<p015o1.k> bVar) {
            p015o1.k kVar = p015o1.k.PreEnter;
            p015o1.k kVar2 = p015o1.k.Visible;
            g0<r> g0VarB = null;
            if (bVar.b(kVar, kVar2)) {
                ChangeSize changeSize = h.this.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    g0VarB = changeSize.b();
                }
            } else if (bVar.b(kVar2, p015o1.k.PostExit)) {
                ChangeSize changeSize2 = h.this.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    g0VarB = changeSize2.b();
                }
            } else {
                g0VarB = androidx.compose.animation.g.f4058d;
            }
            return g0VarB == null ? androidx.compose.animation.g.f4058d : g0VarB;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "Lw4/n;", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.l<l1.b<p015o1.k>, g0<w4.n>> {
        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<w4.n> invoke(l1.b<p015o1.k> bVar) {
            g0<w4.n> g0VarA;
            g0<w4.n> g0VarA2;
            p015o1.k kVar = p015o1.k.PreEnter;
            p015o1.k kVar2 = p015o1.k.Visible;
            if (bVar.b(kVar, kVar2)) {
                Slide slide = h.this.getEnter().getData().getSlide();
                return (slide == null || (g0VarA2 = slide.a()) == null) ? androidx.compose.animation.g.f4057c : g0VarA2;
            }
            if (!bVar.b(kVar2, p015o1.k.PostExit)) {
                return androidx.compose.animation.g.f4057c;
            }
            Slide slide2 = h.this.getExit().getData().getSlide();
            return (slide2 == null || (g0VarA = slide2.a()) == null) ? androidx.compose.animation.g.f4057c : g0VarA;
        }
    }

    public h(l1<p015o1.k> l1Var, l1<p015o1.k>.a<r, p019p1.n> aVar, l1<p015o1.k>.a<w4.n, p019p1.n> aVar2, l1<p015o1.k>.a<w4.n, p019p1.n> aVar3, androidx.compose.animation.i iVar, k kVar, wn0.a<Boolean> aVar4, p pVar) {
        this.transition = l1Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = iVar;
        this.exit = kVar;
        this.isEnabled = aVar4;
        this.graphicsLayerBlock = pVar;
    }

    private final void E2(long j11) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j11;
    }

    public final void A2(wn0.a<Boolean> aVar) {
        this.isEnabled = aVar;
    }

    public final void B2(androidx.compose.animation.i iVar) {
        this.enter = iVar;
    }

    public final void C2(k kVar) {
        this.exit = kVar;
    }

    public final void D2(p pVar) {
        this.graphicsLayerBlock = pVar;
    }

    public final void F2(l1<p015o1.k>.a<w4.n, p019p1.n> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void G2(l1<p015o1.k>.a<r, p019p1.n> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void H2(l1<p015o1.k>.a<w4.n, p019p1.n> aVar) {
        this.slideAnimation = aVar;
    }

    public final void I2(l1<p015o1.k> l1Var) {
        this.transition = l1Var;
    }

    public final long J2(p015o1.k targetState, long fullSize) {
        wn0.l<r, r> lVarD;
        wn0.l<r, r> lVarD2;
        int i11 = a.f4106a[targetState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                ChangeSize changeSize = this.enter.getData().getChangeSize();
                if (changeSize != null && (lVarD = changeSize.d()) != null) {
                    return lVarD.invoke(r.b(fullSize)).getPackedValue();
                }
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null && (lVarD2 = changeSize2.d()) != null) {
                    return lVarD2.invoke(r.b(fullSize)).getPackedValue();
                }
            }
        }
        return fullSize;
    }

    public final long K2(p015o1.k targetState, long fullSize) {
        wn0.l<r, w4.n> lVarB;
        wn0.l<r, w4.n> lVarB2;
        Slide slide = this.enter.getData().getSlide();
        long jA = (slide == null || (lVarB2 = slide.b()) == null) ? w4.n.INSTANCE.a() : lVarB2.invoke(r.b(fullSize)).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jA2 = (slide2 == null || (lVarB = slide2.b()) == null) ? w4.n.INSTANCE.a() : lVarB.invoke(r.b(fullSize)).getPackedValue();
        int i11 = a.f4106a[targetState.ordinal()];
        if (i11 == 1) {
            return w4.n.INSTANCE.a();
        }
        if (i11 == 2) {
            return jA;
        }
        if (i11 == 3) {
            return jA2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long L2(p015o1.k targetState, long fullSize) {
        if (this.currentAlignment == null) {
            return w4.n.INSTANCE.a();
        }
        if (x2() == null) {
            return w4.n.INSTANCE.a();
        }
        if (s.f(this.currentAlignment, x2())) {
            return w4.n.INSTANCE.a();
        }
        int i11 = a.f4106a[targetState.ordinal()];
        if (i11 == 1) {
            return w4.n.INSTANCE.a();
        }
        if (i11 == 2) {
            return w4.n.INSTANCE.a();
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize = this.exit.getData().getChangeSize();
        if (changeSize == null) {
            return w4.n.INSTANCE.a();
        }
        long packedValue = changeSize.d().invoke(r.b(fullSize)).getPackedValue();
        d3.c cVarX2 = x2();
        s.h(cVarX2);
        t tVar = t.Ltr;
        long jA = cVarX2.a(fullSize, packedValue, tVar);
        d3.c cVar = this.currentAlignment;
        s.h(cVar);
        return w4.n.k(jA, cVar.a(fullSize, packedValue, tVar));
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        y3<w4.n> y3VarA;
        y3<w4.n> y3VarA2;
        if (this.transition.i() == this.transition.p()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            d3.c cVarX2 = x2();
            if (cVarX2 == null) {
                cVarX2 = d3.c.INSTANCE.o();
            }
            this.currentAlignment = cVarX2;
        }
        if (k0Var.d1()) {
            w0 w0VarX0 = h0Var.x0(j11);
            long jA = w4.s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            this.lookaheadSize = jA;
            E2(j11);
            return k0.N1(k0Var, r.g(jA), r.f(jA), null, new b(w0VarX0), 4, null);
        }
        if (!this.isEnabled.invoke().booleanValue()) {
            w0 w0VarX1 = h0Var.x0(j11);
            return k0.N1(k0Var, w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new d(w0VarX1), 4, null);
        }
        wn0.l<androidx.compose.ui.graphics.c, h0> lVarInit = this.graphicsLayerBlock.init();
        w0 w0VarX2 = h0Var.x0(j11);
        long jA2 = w4.s.a(w0VarX2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
        long j12 = androidx.compose.animation.f.d(this.lookaheadSize) ? this.lookaheadSize : jA2;
        l1<p015o1.k>.a<r, p019p1.n> aVar = this.sizeAnimation;
        y3<r> y3VarA3 = aVar != null ? aVar.a(this.sizeTransitionSpec, new e(j12)) : null;
        if (y3VarA3 != null) {
            jA2 = y3VarA3.getValue().getPackedValue();
        }
        long jF = w4.c.f(j11, jA2);
        l1<p015o1.k>.a<w4.n, p019p1.n> aVar2 = this.offsetAnimation;
        long jA3 = (aVar2 == null || (y3VarA2 = aVar2.a(f.f4115c, new g(j12))) == null) ? w4.n.INSTANCE.a() : y3VarA2.getValue().getPackedValue();
        l1<p015o1.k>.a<w4.n, p019p1.n> aVar3 = this.slideAnimation;
        long jA4 = (aVar3 == null || (y3VarA = aVar3.a(this.slideSpec, new C0084h(j12))) == null) ? w4.n.INSTANCE.a() : y3VarA.getValue().getPackedValue();
        d3.c cVar = this.currentAlignment;
        return k0.N1(k0Var, r.g(jF), r.f(jF), null, new c(w0VarX2, w4.n.l(cVar != null ? cVar.a(j12, jF, t.Ltr) : w4.n.INSTANCE.a(), jA4), jA3, lVarInit), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        super.h2();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = androidx.compose.animation.f.c();
    }

    public final d3.c x2() {
        d3.c alignment;
        d3.c alignment2;
        if (this.transition.n().b(p015o1.k.PreEnter, p015o1.k.Visible)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final androidx.compose.animation.i getEnter() {
        return this.enter;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final k getExit() {
        return this.exit;
    }
}

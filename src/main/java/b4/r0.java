package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001f\u0010\u0016\u001a\u00020\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0005J$\u0010(\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0019J+\u0010/\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0019J\u001f\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\"J\u001f\u00103\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\"J\u001f\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\"J\u001b\u00105\u001a\u00020\f*\u00020\u00022\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010;R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010F\u001a\u00020E8F@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010CR\u001e\u0010N\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010PR\u0011\u0010T\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0018\u0010Y\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0018\u0010]\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010XR\u0018\u0010_\u001a\u00020\f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Lb4/r0;", "", "Lb4/g0;", "root", "<init>", "(Lb4/g0;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Ljn0/h0;", "I", "(J)V", "layoutNode", "", "forced", "D", "(Lb4/g0;Z)Z", "G", "C", Gender.FEMALE, "E", "Lkotlin/Function0;", "onLayout", "r", "(Lwn0/a;)Z", "t", "()V", "s", "(Lb4/g0;J)V", "Lb4/j1$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "(Lb4/j1$b;)V", "affectsLookahead", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/g0;Z)V", "forceDispatch", "c", "(Z)V", "node", "v", "e", "(Lb4/g0;Lw4/b;)Z", "f", "A", "h", "b", "relayoutNeeded", "y", "(Lb4/g0;ZZ)Z", "g", "B", "w", "j", "u", "a", "Lb4/g0;", "Lb4/o;", "Lb4/o;", "relayoutNodes", "Z", "duringMeasureLayout", DateTokenConverter.CONVERTER_KEY, "duringFullMeasureLayoutPass", "Lb4/h1;", "Lb4/h1;", "onPositionedDispatcher", "Lt2/b;", "Lt2/b;", "onLayoutCompletedListeners", "", "<set-?>", "J", "q", "()J", "measureIteration", "Lb4/r0$a;", "postponedMeasureRequests", "Lw4/b;", "rootConstraints", "Lb4/n0;", "Lb4/n0;", "consistencyChecker", "m", "()Z", "hasPendingMeasureOrLayout", "n", "hasPendingOnPositionedCallbacks", "o", "(Lb4/g0;)Z", "measureAffectsParent", "k", "canAffectParent", "l", "canAffectParentInLookahead", "p", "measureAffectsParentLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h1 onPositionedDispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t2.b<j1.b> onLayoutCompletedListeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a> postponedMeasureRequests;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private w4.b rootConstraints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n0 consistencyChecker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb4/r0$a;", "", "Lb4/g0;", "node", "", "isLookahead", "isForced", "<init>", "(Lb4/g0;ZZ)V", "a", "Lb4/g0;", "()Lb4/g0;", "b", "Z", "c", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final g0 node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        public a(g0 g0Var, boolean z11, boolean z12) {
            this.node = g0Var;
            this.isLookahead = z11;
            this.isForced = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g0 getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16275a;

        static {
            int[] iArr = new int[g0.e.values().length];
            try {
                iArr[g0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16275a = iArr;
        }
    }

    public r0(g0 g0Var) {
        this.root = g0Var;
        j1.Companion companion = j1.INSTANCE;
        o oVar = new o(companion.a());
        this.relayoutNodes = oVar;
        this.onPositionedDispatcher = new h1();
        this.onLayoutCompletedListeners = new t2.b<>(new j1.b[16], 0);
        this.measureIteration = 1L;
        t2.b<a> bVar = new t2.b<>(new a[16], 0);
        this.postponedMeasureRequests = bVar;
        this.consistencyChecker = companion.a() ? new n0(g0Var, oVar, bVar.g()) : null;
    }

    private final void A(g0 layoutNode) {
        t2.b<g0> bVarW0 = layoutNode.w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if (o(g0Var)) {
                    if (m0.a(g0Var)) {
                        B(g0Var, true);
                    } else {
                        A(g0Var);
                    }
                }
                i11++;
            } while (i11 < iN);
        }
    }

    private final void B(g0 layoutNode, boolean affectsLookahead) {
        w4.b bVar;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            p013kotlin.jvm.internal.s.h(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            e(layoutNode, bVar);
        } else {
            f(layoutNode, bVar);
        }
    }

    public static /* synthetic */ boolean H(r0 r0Var, g0 g0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return r0Var.G(g0Var, z11);
    }

    private final void b() {
        t2.b<j1.b> bVar = this.onLayoutCompletedListeners;
        int iN = bVar.getSize();
        if (iN > 0) {
            j1.b[] bVarArrM = bVar.m();
            int i11 = 0;
            do {
                bVarArrM[i11].l();
                i11++;
            } while (i11 < iN);
        }
        this.onLayoutCompletedListeners.h();
    }

    public static /* synthetic */ void d(r0 r0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        r0Var.c(z11);
    }

    private final boolean e(g0 layoutNode, w4.b constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zP0 = constraints != null ? layoutNode.P0(constraints) : g0.Q0(layoutNode, null, 1, null);
        g0 g0VarN0 = layoutNode.n0();
        if (zP0 && g0VarN0 != null) {
            if (g0VarN0.getLookaheadRoot() == null) {
                g0.w1(g0VarN0, false, false, false, 3, null);
                return zP0;
            }
            if (layoutNode.f0() == g0.g.InMeasureBlock) {
                g0.s1(g0VarN0, false, false, false, 3, null);
                return zP0;
            }
            if (layoutNode.f0() == g0.g.InLayoutBlock) {
                g0.q1(g0VarN0, false, 1, null);
            }
        }
        return zP0;
    }

    private final boolean f(g0 layoutNode, w4.b constraints) {
        boolean zK1 = constraints != null ? layoutNode.k1(constraints) : g0.l1(layoutNode, null, 1, null);
        g0 g0VarN0 = layoutNode.n0();
        if (zK1 && g0VarN0 != null) {
            if (layoutNode.e0() == g0.g.InMeasureBlock) {
                g0.w1(g0VarN0, false, false, false, 3, null);
                return zK1;
            }
            if (layoutNode.e0() == g0.g.InLayoutBlock) {
                g0.u1(g0VarN0, false, 1, null);
            }
        }
        return zK1;
    }

    private final void g() {
        if (this.postponedMeasureRequests.q()) {
            t2.b<a> bVar = this.postponedMeasureRequests;
            int iN = bVar.getSize();
            if (iN > 0) {
                a[] aVarArrM = bVar.m();
                int i11 = 0;
                do {
                    a aVar = aVarArrM[i11];
                    if (aVar.getNode().K0()) {
                        if (aVar.getIsLookahead()) {
                            g0.s1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                        } else {
                            g0.w1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                        }
                    }
                    i11++;
                } while (i11 < iN);
            }
            this.postponedMeasureRequests.h();
        }
    }

    private final void h(g0 layoutNode) {
        t2.b<g0> bVarW0 = layoutNode.w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if (p013kotlin.jvm.internal.s.f(g0Var.N0(), Boolean.TRUE) && !g0Var.getIsDeactivated()) {
                    if (this.relayoutNodes.e(g0Var, true)) {
                        g0Var.R0();
                    }
                    h(g0Var);
                }
                i11++;
            } while (i11 < iN);
        }
    }

    private final void j(g0 layoutNode, boolean affectsLookahead) {
        t2.b<g0> bVarW0 = layoutNode.w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if ((!affectsLookahead && o(g0Var)) || (affectsLookahead && p(g0Var))) {
                    if (m0.a(g0Var) && !affectsLookahead) {
                        if (g0Var.X() && this.relayoutNodes.e(g0Var, true)) {
                            y(g0Var, true, false);
                        } else {
                            i(g0Var, true);
                        }
                    }
                    w(g0Var, affectsLookahead);
                    if (!u(g0Var, affectsLookahead)) {
                        j(g0Var, affectsLookahead);
                    }
                }
                i11++;
            } while (i11 < iN);
        }
        w(layoutNode, affectsLookahead);
    }

    private final boolean k(g0 g0Var) {
        return g0Var.c0() && o(g0Var);
    }

    private final boolean l(g0 g0Var) {
        return g0Var.X() && p(g0Var);
    }

    private final boolean o(g0 g0Var) {
        return g0Var.e0() == g0.g.InMeasureBlock || g0Var.getLayoutDelegate().r().getAlignmentLines().k();
    }

    private final boolean p(g0 g0Var) {
        b4.b bVarC;
        b4.a aVarQ;
        return g0Var.f0() == g0.g.InMeasureBlock || !((bVarC = g0Var.getLayoutDelegate().C()) == null || (aVarQ = bVarC.getAlignmentLines()) == null || !aVarQ.k());
    }

    private final boolean u(g0 g0Var, boolean z11) {
        return z11 ? g0Var.X() : g0Var.c0();
    }

    private final void w(g0 node, boolean affectsLookahead) {
        if (u(node, affectsLookahead) && this.relayoutNodes.e(node, affectsLookahead)) {
            y(node, affectsLookahead, false);
        }
    }

    private final boolean y(g0 layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        w4.b bVar;
        boolean zE;
        g0 g0VarN0;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.y() && !layoutNode.M0() && !k(layoutNode) && !p013kotlin.jvm.internal.s.f(layoutNode.N0(), Boolean.TRUE) && !l(layoutNode) && !layoutNode.B()) {
            return false;
        }
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            p013kotlin.jvm.internal.s.h(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            zE = layoutNode.X() ? e(layoutNode, bVar) : false;
            if (relayoutNeeded && ((zE || layoutNode.W()) && p013kotlin.jvm.internal.s.f(layoutNode.N0(), Boolean.TRUE))) {
                layoutNode.R0();
            }
        } else {
            boolean zF = layoutNode.c0() ? f(layoutNode, bVar) : false;
            if (relayoutNeeded && layoutNode.U() && (layoutNode == this.root || ((g0VarN0 = layoutNode.n0()) != null && g0VarN0.y() && layoutNode.M0()))) {
                if (layoutNode == this.root) {
                    layoutNode.i1(0, 0);
                } else {
                    layoutNode.o1();
                }
                this.onPositionedDispatcher.d(layoutNode);
                n0 n0Var = this.consistencyChecker;
                if (n0Var != null) {
                    n0Var.a();
                }
            }
            zE = zF;
        }
        g();
        return zE;
    }

    static /* synthetic */ boolean z(r0 r0Var, g0 g0Var, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return r0Var.y(g0Var, z11, z12);
    }

    public final boolean C(g0 layoutNode, boolean forced) {
        int i11 = b.f16275a[layoutNode.V().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.X() || layoutNode.W()) && !forced) {
                n0 n0Var = this.consistencyChecker;
                if (n0Var != null) {
                    n0Var.a();
                }
                return false;
            }
            layoutNode.T0();
            layoutNode.S0();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            g0 g0VarN0 = layoutNode.n0();
            if (p013kotlin.jvm.internal.s.f(layoutNode.N0(), Boolean.TRUE) && ((g0VarN0 == null || !g0VarN0.X()) && (g0VarN0 == null || !g0VarN0.W()))) {
                this.relayoutNodes.c(layoutNode, true);
            } else if (layoutNode.y() && ((g0VarN0 == null || !g0VarN0.U()) && (g0VarN0 == null || !g0VarN0.c0()))) {
                this.relayoutNodes.c(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        n0 n0Var2 = this.consistencyChecker;
        if (n0Var2 != null) {
            n0Var2.a();
        }
        return false;
    }

    public final boolean D(g0 layoutNode, boolean forced) {
        g0 g0VarN0;
        g0 g0VarN1;
        if (!(layoutNode.getLookaheadRoot() != null)) {
            y3.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i11 = b.f16275a[layoutNode.V().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.X() && !forced) {
                    return false;
                }
                layoutNode.U0();
                layoutNode.V0();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if ((p013kotlin.jvm.internal.s.f(layoutNode.N0(), Boolean.TRUE) || l(layoutNode)) && ((g0VarN0 = layoutNode.n0()) == null || !g0VarN0.X())) {
                    this.relayoutNodes.c(layoutNode, true);
                } else if ((layoutNode.y() || k(layoutNode)) && ((g0VarN1 = layoutNode.n0()) == null || !g0VarN1.c0())) {
                    this.relayoutNodes.c(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.b(new a(layoutNode, true, forced));
            n0 n0Var = this.consistencyChecker;
            if (n0Var != null) {
                n0Var.a();
            }
        }
        return false;
    }

    public final void E(g0 layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    public final boolean F(g0 layoutNode, boolean forced) {
        int i11 = b.f16275a[layoutNode.V().ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            n0 n0Var = this.consistencyChecker;
            if (n0Var != null) {
                n0Var.a();
            }
            return false;
        }
        if (i11 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (!forced && layoutNode.y() == layoutNode.M0() && (layoutNode.c0() || layoutNode.U())) {
            n0 n0Var2 = this.consistencyChecker;
            if (n0Var2 != null) {
                n0Var2.a();
            }
            return false;
        }
        layoutNode.S0();
        if (!layoutNode.getIsDeactivated() && layoutNode.M0()) {
            g0 g0VarN0 = layoutNode.n0();
            if ((g0VarN0 == null || !g0VarN0.U()) && (g0VarN0 == null || !g0VarN0.c0())) {
                this.relayoutNodes.c(layoutNode, false);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final boolean G(g0 layoutNode, boolean forced) {
        int i11 = b.f16275a[layoutNode.V().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.c0() && !forced) {
                    return false;
                }
                layoutNode.V0();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if (!layoutNode.y() && !k(layoutNode)) {
                    return false;
                }
                g0 g0VarN0 = layoutNode.n0();
                if (g0VarN0 == null || !g0VarN0.c0()) {
                    this.relayoutNodes.c(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.b(new a(layoutNode, false, forced));
            n0 n0Var = this.consistencyChecker;
            if (n0Var != null) {
                n0Var.a();
            }
        }
        return false;
    }

    public final void I(long constraints) {
        w4.b bVar = this.rootConstraints;
        if (bVar == null ? false : w4.b.f(bVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            y3.a.a("updateRootConstraints called while measuring");
        }
        this.rootConstraints = w4.b.a(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.U0();
        }
        this.root.V0();
        o oVar = this.relayoutNodes;
        g0 g0Var = this.root;
        oVar.c(g0Var, g0Var.getLookaheadRoot() != null);
    }

    public final void c(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        this.onPositionedDispatcher.a();
    }

    public final void i(g0 layoutNode, boolean affectsLookahead) {
        if (this.relayoutNodes.g(affectsLookahead)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            y3.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(layoutNode, affectsLookahead)) {
            y3.a.a("node not yet measured");
        }
        j(layoutNode, affectsLookahead);
    }

    public final boolean m() {
        return this.relayoutNodes.h();
    }

    public final boolean n() {
        return this.onPositionedDispatcher.c();
    }

    public final long q() {
        if (!this.duringMeasureLayout) {
            y3.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean r(wn0.a<jn0.h0> onLayout) throws Throwable {
        r0 r0Var;
        Throwable th2;
        boolean z11;
        g0 g0VarE;
        if (!this.root.K0()) {
            y3.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.y()) {
            y3.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            y3.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z12 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.h()) {
                    o oVar = this.relayoutNodes;
                    z11 = false;
                    while (oVar.h()) {
                        boolean zD = oVar.lookaheadSet.d();
                        boolean z13 = !zD;
                        if (zD) {
                            g0VarE = oVar.set.e();
                        } else {
                            try {
                                g0VarE = oVar.lookaheadSet.e();
                            } catch (Throwable th3) {
                                th2 = th3;
                                r0Var = this;
                                r0Var.duringMeasureLayout = false;
                                r0Var.duringFullMeasureLayoutPass = false;
                                throw th2;
                            }
                        }
                        g0 g0Var = g0VarE;
                        r0Var = this;
                        try {
                            boolean z14 = z(r0Var, g0Var, z13, false, 4, null);
                            if (g0Var == this.root && z14) {
                                z11 = true;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            r0Var.duringMeasureLayout = false;
                            r0Var.duringFullMeasureLayoutPass = false;
                            throw th2;
                        }
                    }
                    r0Var = this;
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    r0Var = this;
                    z11 = false;
                }
                r0Var.duringMeasureLayout = false;
                r0Var.duringFullMeasureLayoutPass = false;
                n0 n0Var = r0Var.consistencyChecker;
                if (n0Var != null) {
                    n0Var.a();
                }
                z12 = z11;
            } catch (Throwable th5) {
                th = th5;
                r0Var = this;
            }
        }
        b();
        return z12;
    }

    public final void s(g0 layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (p013kotlin.jvm.internal.s.f(layoutNode, this.root)) {
            y3.a.a("measureAndLayout called on root");
        }
        if (!this.root.K0()) {
            y3.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.y()) {
            y3.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            y3.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.i(layoutNode);
                if (e(layoutNode, w4.b.a(constraints)) || layoutNode.W()) {
                    if (p013kotlin.jvm.internal.s.f(layoutNode.N0(), Boolean.TRUE)) {
                        layoutNode.R0();
                    }
                }
                h(layoutNode);
                f(layoutNode, w4.b.a(constraints));
                if (layoutNode.U() && layoutNode.y()) {
                    layoutNode.o1();
                    this.onPositionedDispatcher.d(layoutNode);
                }
                g();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                n0 n0Var = this.consistencyChecker;
                if (n0Var != null) {
                    n0Var.a();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th2;
            }
        }
        b();
    }

    public final void t() {
        if (this.relayoutNodes.h()) {
            if (!this.root.K0()) {
                y3.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.y()) {
                y3.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                y3.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.g(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            B(this.root, true);
                        } else {
                            A(this.root);
                        }
                    }
                    B(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    n0 n0Var = this.consistencyChecker;
                    if (n0Var != null) {
                        n0Var.a();
                    }
                } catch (Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th2;
                }
            }
        }
    }

    public final void v(g0 node) {
        this.relayoutNodes.i(node);
        this.onPositionedDispatcher.f(node);
    }

    public final void x(j1.b listener) {
        this.onLayoutCompletedListeners.b(listener);
    }
}

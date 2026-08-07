package b4;

import android.view.View;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.f2;
import androidx.compose.ui.platform.m3;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.u2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import k3.g3;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 ¬\u00012\u00020\u0001:\u0002\u0019\u000bJ5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 JE\u0010)\u001a\u00020(2\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\b0!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010\u000eJ\u001b\u00101\u001a\u00020\b2\n\u00100\u001a\u00060.j\u0002`/H'¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0%H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH&¢\u0006\u0004\b6\u0010,J\u0017\u00108\u001a\u00020\b2\u0006\u00103\u001a\u000207H&¢\u0006\u0004\b8\u00109J4\u0010?\u001a\u00020<2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0012\u0006\u0012\u0004\u0018\u00010=0!H¦@¢\u0006\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010d\u001a\u00020`8gX§\u0004¢\u0006\f\u0012\u0004\bc\u0010,\u001a\u0004\ba\u0010bR\u001c\u0010i\u001a\u0004\u0018\u00010e8gX§\u0004¢\u0006\f\u0012\u0004\bh\u0010,\u001a\u0004\bf\u0010gR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0086\u0001\u001a\u00030\u0082\u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0001\u0010,\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u0093\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0005\b\u0092\u0001\u0010\u001aR\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u00ad\u0001À\u0006\u0001"}, d2 = {"Lb4/j1;", "Lv3/l0;", "Lb4/g0;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Ljn0/h0;", "q", "(Lb4/g0;ZZZ)V", "b", "(Lb4/g0;ZZ)V", DateTokenConverter.CONVERTER_KEY, "(Lb4/g0;)V", "node", "s", "h", "Lj3/g;", "localPosition", "m", "(J)J", "positionInWindow", "j", "sendPointerUpdate", "a", "(Z)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "y", "(Lb4/g0;J)V", "k", "(Lb4/g0;Z)V", "Lkotlin/Function2;", "Lk3/j1;", "Ln3/c;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Lb4/i1;", "f", "(Lwn0/p;Lwn0/a;Ln3/c;)Lb4/i1;", "x", "()V", "r", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "e", "(Landroid/view/View;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "(Lwn0/a;)V", "l", "Lb4/j1$b;", "t", "(Lb4/j1$b;)V", "Landroidx/compose/ui/platform/f2;", "Lkotlin/coroutines/Continuation;", "", "", "session", "g", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoot", "()Lb4/g0;", "root", "Lb4/i0;", "getSharedDrawScope", "()Lb4/i0;", "sharedDrawScope", "Lr3/a;", "getHapticFeedBack", "()Lr3/a;", "hapticFeedBack", "Ls3/b;", "getInputModeManager", "()Ls3/b;", "inputModeManager", "Landroidx/compose/ui/platform/x0;", "getClipboardManager", "()Landroidx/compose/ui/platform/x0;", "clipboardManager", "Landroidx/compose/ui/platform/i;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/i;", "accessibilityManager", "Lk3/g3;", "getGraphicsContext", "()Lk3/g3;", "graphicsContext", "Landroidx/compose/ui/platform/u2;", "getTextToolbar", "()Landroidx/compose/ui/platform/u2;", "textToolbar", "Le3/l;", "getAutofillTree", "()Le3/l;", "getAutofillTree$annotations", "autofillTree", "Le3/g;", "getAutofill", "()Le3/g;", "getAutofill$annotations", "autofill", "Lw4/d;", "getDensity", "()Lw4/d;", "density", "Lo4/q0;", "getTextInputService", "()Lo4/q0;", "textInputService", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "Lv3/u;", "getPointerIconService", "()Lv3/u;", "pointerIconService", "Li3/i;", "getFocusOwner", "()Li3/i;", "focusOwner", "Landroidx/compose/ui/platform/m3;", "getWindowInfo", "()Landroidx/compose/ui/platform/m3;", "windowInfo", "Ln4/p$b;", "getFontLoader", "()Ln4/p$b;", "getFontLoader$annotations", "fontLoader", "Ln4/q$b;", "getFontFamilyResolver", "()Ln4/q$b;", "fontFamilyResolver", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "Lb4/l1;", "getSnapshotObserver", "()Lb4/l1;", "snapshotObserver", "La4/f;", "getModifierLocalManager", "()La4/f;", "modifierLocalManager", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lz3/w0$a;", "getPlacementScope", "()Lz3/w0$a;", "placementScope", "Lg3/c;", "getDragAndDropManager", "()Lg3/c;", "dragAndDropManager", "q1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface j1 extends v3.l0 {

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16117a;

    /* JADX INFO: renamed from: b4.j1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lb4/j1$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16117a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lb4/j1$b;", "", "Ljn0/h0;", "l", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void l();
    }

    static /* synthetic */ void c(j1 j1Var, g0 g0Var, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = true;
        }
        j1Var.q(g0Var, z11, z12, z13);
    }

    static /* synthetic */ i1 i(j1 j1Var, wn0.p pVar, wn0.a aVar, n3.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        return j1Var.f(pVar, aVar, cVar);
    }

    static /* synthetic */ void p(j1 j1Var, g0 g0Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        j1Var.k(g0Var, z11);
    }

    static /* synthetic */ void u(j1 j1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        j1Var.a(z11);
    }

    static /* synthetic */ void z(j1 j1Var, g0 g0Var, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        j1Var.b(g0Var, z11, z12);
    }

    void a(boolean sendPointerUpdate);

    void b(g0 layoutNode, boolean affectsLookahead, boolean forceRequest);

    void d(g0 layoutNode);

    void e(View view);

    i1 f(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer, n3.c explicitLayer);

    Object g(wn0.p<? super f2, ? super Continuation<?>, ? extends Object> pVar, Continuation<?> continuation);

    androidx.compose.ui.platform.i getAccessibilityManager();

    e3.g getAutofill();

    e3.l getAutofillTree();

    androidx.compose.ui.platform.x0 getClipboardManager();

    CoroutineContext getCoroutineContext();

    w4.d getDensity();

    g3.c getDragAndDropManager();

    i3.i getFocusOwner();

    n4.q.b getFontFamilyResolver();

    n4.p.b getFontLoader();

    g3 getGraphicsContext();

    r3.a getHapticFeedBack();

    s3.b getInputModeManager();

    w4.t getLayoutDirection();

    a4.f getModifierLocalManager();

    default z3.w0.a getPlacementScope() {
        return z3.x0.b(this);
    }

    v3.u getPointerIconService();

    g0 getRoot();

    i0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    l1 getSnapshotObserver();

    r2 getSoftwareKeyboardController();

    o4.q0 getTextInputService();

    u2 getTextToolbar();

    e3 getViewConfiguration();

    m3 getWindowInfo();

    void h(g0 node);

    long j(long positionInWindow);

    void k(g0 layoutNode, boolean affectsLookahead);

    void l();

    long m(long localPosition);

    void q(g0 layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void r(g0 layoutNode);

    void s(g0 node);

    void setShowLayoutBounds(boolean z11);

    void t(b listener);

    void v(wn0.a<jn0.h0> listener);

    void x();

    void y(g0 layoutNode, long constraints);
}

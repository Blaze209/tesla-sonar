package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 [2\u00020\u0001:\u0002\\]B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u000eR\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00060\u000eR\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\bJ\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u0019\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u0010\bJ\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020,2\u0006\u00102\u001a\u0002012\u0006\u00105\u001a\u00020\u001c2\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b8\u00109R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00140:j\b\u0012\u0004\u0012\u00020\u0014`;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010D\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR \u0010E\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010BR\"\u0010N\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR!\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u00140:j\b\u0012\u0004\u0012\u00020\u0014`;8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010T¨\u0006^"}, d2 = {"Lcom/swmansion/rnscreens/m0;", "Lcom/swmansion/rnscreens/v;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "dispatchOnFinishTransitioning", "()V", "Lcom/swmansion/rnscreens/b0;", "visibleBottom", "turnOffA11yUnderTransparentScreen", "(Lcom/swmansion/rnscreens/b0;)V", "drawAndRelease", "Lcom/swmansion/rnscreens/m0$b;", "op", "performDraw", "(Lcom/swmansion/rnscreens/m0$b;)V", "obtainDrawingOp", "()Lcom/swmansion/rnscreens/m0$b;", "Lcom/swmansion/rnscreens/u0;", "screenFragment", "dismiss", "(Lcom/swmansion/rnscreens/u0;)V", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "adapt", "(Lcom/swmansion/rnscreens/t;)Lcom/swmansion/rnscreens/u0;", "Landroid/view/View;", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "onViewAppearTransitionEnd", "", "", "getScreenIds", "()Ljava/util/List;", "", "index", "removeScreenAt", "(I)V", "removeAllScreens", "screenFragmentWrapper", "", "hasScreen", "(Lcom/swmansion/rnscreens/b0;)Z", "onUpdate", "notifyContainerUpdate", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "stack", "Ljava/util/ArrayList;", "", "dismissedWrappers", "Ljava/util/Set;", "preloadedWrappers", "Ljava/util/List;", "", "drawingOpPool", "drawingOps", "topScreenWrapper", "Lcom/swmansion/rnscreens/u0;", "removalTransitionStarted", "Z", "Lcom/swmansion/rnscreens/stack/views/a;", "childrenDrawingOrderStrategy", "Lcom/swmansion/rnscreens/stack/views/a;", "disappearingTransitioningChildren", "goingForward", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "getTopScreen", "()Lcom/swmansion/rnscreens/t;", "topScreen", "getFragments", "()Ljava/util/ArrayList;", "fragments", "getRootScreen", "rootScreen", "Companion", "b", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 extends v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "ScreenStack";
    private com.swmansion.rnscreens.stack.views.a childrenDrawingOrderStrategy;
    private List<View> disappearingTransitioningChildren;
    private final Set<u0> dismissedWrappers;
    private final List<b> drawingOpPool;
    private List<b> drawingOps;
    private boolean goingForward;
    private List<? extends b0> preloadedWrappers;
    private boolean removalTransitionStarted;
    private final ArrayList<u0> stack;
    private u0 topScreenWrapper;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/m0$a;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/b0;", "fragmentWrapper", "Lcom/swmansion/rnscreens/t$d;", "resolvedStackAnimation", "", "needsDrawReordering", "(Lcom/swmansion/rnscreens/b0;Lcom/swmansion/rnscreens/t$d;)Z", "", "TAG", "Ljava/lang/String;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean needsDrawReordering(b0 fragmentWrapper, t.d resolvedStackAnimation) {
            if (resolvedStackAnimation == null) {
                resolvedStackAnimation = fragmentWrapper.getScreen().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || resolvedStackAnimation == t.d.SLIDE_FROM_BOTTOM || resolvedStackAnimation == t.d.FADE_FROM_BOTTOM || resolvedStackAnimation == t.d.IOS_FROM_RIGHT || resolvedStackAnimation == t.d.IOS_FROM_LEFT) && resolvedStackAnimation != t.d.NONE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/swmansion/rnscreens/m0$b;", "", "<init>", "(Lcom/swmansion/rnscreens/m0;)V", "Ljn0/h0;", "draw", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "setChild", "(Landroid/view/View;)V", "", "drawingTime", "J", "getDrawingTime", "()J", "setDrawingTime", "(J)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b {
        private Canvas canvas;
        private View child;
        private long drawingTime;

        public b() {
        }

        public final void draw() {
            m0.this.performDraw(this);
            this.canvas = null;
            this.child = null;
            this.drawingTime = 0L;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final View getChild() {
            return this.child;
        }

        public final long getDrawingTime() {
            return this.drawingTime;
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setChild(View view) {
            this.child = view;
        }

        public final void setDrawingTime(long j11) {
            this.drawingTime = j11;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.e.values().length];
            try {
                iArr[t.e.FORM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m0(Context context) {
        super(context);
        this.stack = new ArrayList<>();
        this.dismissedWrappers = new HashSet();
        this.preloadedWrappers = new ArrayList();
        this.drawingOpPool = new ArrayList();
        this.drawingOps = new ArrayList();
        this.disappearingTransitioningChildren = new ArrayList();
    }

    private final void dispatchOnFinishTransitioning() {
        int iF = com.facebook.react.uimanager.b1.f(this);
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.t(iF, getId()));
        }
    }

    private final void drawAndRelease() {
        List<b> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (b bVar : list) {
            bVar.draw();
            this.drawingOpPool.add(bVar);
        }
    }

    private final b obtainDrawingOp() {
        if (this.drawingOpPool.isEmpty()) {
            return new b();
        }
        List<b> list = this.drawingOpPool;
        return list.remove(p013kotlin.collections.v.o(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$18$lambda$10(p013kotlin.jvm.internal.n0 n0Var, b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it != n0Var.f86529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$18$lambda$11(p013kotlin.jvm.internal.n0 n0Var, m0 m0Var, b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return !(it == n0Var.f86529a || p013kotlin.collections.v.g0(m0Var.dismissedWrappers, it)) || it.getScreen().getActivityState() == t.a.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$18$lambda$13(p013kotlin.jvm.internal.n0 n0Var, b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it != n0Var.f86529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$18$lambda$15$lambda$14(b0 b0Var) {
        t screen;
        if (b0Var == null || (screen = b0Var.getScreen()) == null) {
            return;
        }
        screen.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0 onUpdate$lambda$18$lambda$16(b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return (u0) it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$18$lambda$17(b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.getScreen().getActivityState() == t.a.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$18$lambda$8(m0 m0Var, u0 wrapper) {
        p013kotlin.jvm.internal.s.k(wrapper, "wrapper");
        return !m0Var.screenWrappers.contains(wrapper) || m0Var.dismissedWrappers.contains(wrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$3(m0 m0Var, b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return (p013kotlin.collections.v.g0(m0Var.dismissedWrappers, it) || it.getScreen().getActivityState() == t.a.INACTIVE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$4(b0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.isTranslucent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$7(p013kotlin.jvm.internal.n0 n0Var, u0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it != n0Var.f86529a && it.isTranslucent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDraw(b op2) {
        Canvas canvas = op2.getCanvas();
        p013kotlin.jvm.internal.s.h(canvas);
        super.drawChild(canvas, op2.getChild(), op2.getDrawingTime());
    }

    private final void turnOffA11yUnderTransparentScreen(b0 visibleBottom) {
        u0 u0Var;
        if (this.screenWrappers.size() > 1 && visibleBottom != null && (u0Var = this.topScreenWrapper) != null && u0Var.isTranslucent()) {
            ArrayList<b0> arrayList = this.screenWrappers;
            for (b0 b0Var : p013kotlin.collections.v.V(p013kotlin.collections.v.X0(arrayList, bo0.n.w(0, arrayList.size() - 1)))) {
                b0Var.getScreen().changeAccessibilityMode(4);
                if (p013kotlin.jvm.internal.s.f(b0Var, visibleBottom)) {
                    break;
                }
            }
        }
        t topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
    }

    public final void dismiss(u0 screenFragment) {
        p013kotlin.jvm.internal.s.k(screenFragment, "screenFragment");
        this.dismissedWrappers.add(screenFragment);
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        super.dispatchDraw(canvas);
        com.swmansion.rnscreens.stack.views.a aVar = this.childrenDrawingOrderStrategy;
        if (aVar != null) {
            aVar.apply(this.drawingOps);
        }
        drawAndRelease();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        p013kotlin.jvm.internal.s.k(child, "child");
        List<b> list = this.drawingOps;
        b bVarObtainDrawingOp = obtainDrawingOp();
        bVarObtainDrawingOp.setCanvas(canvas);
        bVarObtainDrawingOp.setChild(child);
        bVarObtainDrawingOp.setDrawingTime(drawingTime);
        list.add(bVarObtainDrawingOp);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        com.swmansion.rnscreens.stack.views.a aVar;
        p013kotlin.jvm.internal.s.k(view, "view");
        super.endViewTransition(view);
        this.disappearingTransitioningChildren.remove(view);
        if (this.disappearingTransitioningChildren.isEmpty() && (aVar = this.childrenDrawingOrderStrategy) != null) {
            aVar.disable();
        }
        if (this.removalTransitionStarted) {
            this.removalTransitionStarted = false;
            dispatchOnFinishTransitioning();
        }
    }

    public final ArrayList<u0> getFragments() {
        return this.stack;
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    public final t getRootScreen() {
        Object next;
        t screen;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (p013kotlin.collections.v.g0(this.dismissedWrappers, (b0) next));
        b0 b0Var = (b0) next;
        if (b0Var == null || (screen = b0Var.getScreen()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screen;
    }

    public final List<String> getScreenIds() {
        ArrayList<b0> arrayList = this.screenWrappers;
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b0) it.next()).getScreen().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.v
    public t getTopScreen() {
        u0 u0Var = this.topScreenWrapper;
        if (u0Var != null) {
            return u0Var.getScreen();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.v
    public boolean hasScreen(b0 screenFragmentWrapper) {
        return super.hasScreen(screenFragmentWrapper) && !p013kotlin.collections.v.g0(this.dismissedWrappers, screenFragmentWrapper);
    }

    @Override // com.swmansion.rnscreens.v
    protected void notifyContainerUpdate() {
        Iterator<T> it = this.stack.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).onContainerUpdate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    @Override // com.swmansion.rnscreens.v
    public void onUpdate() {
        T t11;
        t.d stackAnimation;
        boolean z11;
        t screen;
        u0 u0Var;
        int iB;
        T t12;
        t screen2;
        final p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        final p013kotlin.jvm.internal.n0 n0Var2 = new p013kotlin.jvm.internal.n0();
        this.childrenDrawingOrderStrategy = null;
        ho0.i iVarH = ho0.l.H(p013kotlin.collections.v.e0(p013kotlin.collections.v.W(this.screenWrappers)), new wn0.l() { // from class: com.swmansion.rnscreens.c0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$3(this.f55489a, (b0) obj));
            }
        });
        n0Var.f86529a = ho0.l.M(iVarH);
        b0 b0Var = (b0) ho0.l.M(ho0.l.D(iVarH, new wn0.l() { // from class: com.swmansion.rnscreens.d0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$4((b0) obj));
            }
        }));
        if (b0Var == null || b0Var == n0Var.f86529a) {
            t11 = b0Var;
            t11 = 0;
        }
        t11 = b0Var;
        n0Var2.f86529a = t11;
        boolean z12 = p013kotlin.collections.v.g0(this.stack, n0Var.f86529a) && !p013kotlin.collections.v.g0(this.preloadedWrappers, n0Var.f86529a);
        T t13 = n0Var.f86529a;
        u0 u0Var2 = this.topScreenWrapper;
        boolean z13 = t13 != u0Var2;
        if (t13 == 0 || z12) {
            if (t13 == 0 || u0Var2 == null || !z13) {
                stackAnimation = null;
                z11 = true;
            } else {
                stackAnimation = (u0Var2 == null || (screen = u0Var2.getScreen()) == null) ? null : screen.getStackAnimation();
                z11 = false;
            }
        } else if (u0Var2 != null) {
            z11 = (u0Var2 != null && this.screenWrappers.contains(u0Var2)) || (((b0) n0Var.f86529a).getScreen().getReplaceAnimation() == t.c.PUSH);
            if (z11) {
                screen2 = ((b0) n0Var.f86529a).getScreen();
            } else {
                u0 u0Var3 = this.topScreenWrapper;
                if (u0Var3 == null || (screen2 = u0Var3.getScreen()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = screen2.getStackAnimation();
        } else {
            stackAnimation = t.d.NONE;
            this.goingForward = true;
            z11 = true;
        }
        this.goingForward = z11;
        if (z11 && (t12 = n0Var.f86529a) != 0 && INSTANCE.needsDrawReordering((b0) t12, stackAnimation) && n0Var2.f86529a == 0) {
            this.childrenDrawingOrderStrategy = new com.swmansion.rnscreens.stack.views.d();
        } else if (n0Var.f86529a != 0 && z12 && (u0Var = this.topScreenWrapper) != null && u0Var.isTranslucent() && !((b0) n0Var.f86529a).isTranslucent() && (iB = ho0.l.B(ho0.l.a0(p013kotlin.collections.v.e0(p013kotlin.collections.v.W(this.stack)), new wn0.l() { // from class: com.swmansion.rnscreens.e0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$7(n0Var, (u0) obj));
            }
        }))) > 1) {
            this.childrenDrawingOrderStrategy = new com.swmansion.rnscreens.stack.views.c(Math.max((p013kotlin.collections.v.o(this.stack) - iB) + 1, 0));
        }
        androidx.fragment.app.r0 r0VarCreateTransaction = createTransaction();
        if (stackAnimation != null) {
            com.swmansion.rnscreens.utils.d.setTweenAnimations(r0VarCreateTransaction, stackAnimation, z11);
        }
        Iterator it = ho0.l.H(p013kotlin.collections.v.e0(this.stack), new wn0.l() { // from class: com.swmansion.rnscreens.f0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$18$lambda$8(this.f55492a, (u0) obj));
            }
        }).iterator();
        while (it.hasNext()) {
            r0VarCreateTransaction.n(((u0) it.next()).getFragment());
        }
        Iterator it2 = ho0.l.H(ho0.l.a0(p013kotlin.collections.v.e0(this.screenWrappers), new wn0.l() { // from class: com.swmansion.rnscreens.g0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$18$lambda$10(n0Var2, (b0) obj));
            }
        }), new wn0.l() { // from class: com.swmansion.rnscreens.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$18$lambda$11(n0Var, this, (b0) obj));
            }
        }).iterator();
        while (it2.hasNext()) {
            r0VarCreateTransaction.n(((b0) it2.next()).getFragment());
        }
        T t14 = n0Var2.f86529a;
        if (t14 == 0 || ((b0) t14).getFragment().isAdded()) {
            T t15 = n0Var.f86529a;
            if (t15 != 0 && !((b0) t15).getFragment().isAdded()) {
                if (com.swmansion.rnscreens.bottomsheet.j.requiresEnterTransitionPostponing(((b0) n0Var.f86529a).getScreen())) {
                    ((b0) n0Var.f86529a).getFragment().postponeEnterTransition();
                }
                r0VarCreateTransaction.b(getId(), ((b0) n0Var.f86529a).getFragment());
            }
        } else {
            final b0 b0Var2 = (b0) n0Var.f86529a;
            Iterator it3 = ho0.l.D(p013kotlin.collections.v.e0(this.screenWrappers), new wn0.l() { // from class: com.swmansion.rnscreens.i0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(m0.onUpdate$lambda$18$lambda$13(n0Var2, (b0) obj));
                }
            }).iterator();
            while (it3.hasNext()) {
                r0VarCreateTransaction.b(getId(), ((b0) it3.next()).getFragment()).s(new Runnable() { // from class: com.swmansion.rnscreens.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.onUpdate$lambda$18$lambda$15$lambda$14(b0Var2);
                    }
                });
            }
        }
        T t16 = n0Var.f86529a;
        this.topScreenWrapper = t16 instanceof u0 ? (u0) t16 : null;
        this.stack.clear();
        p013kotlin.collections.v.D(this.stack, ho0.l.U(p013kotlin.collections.v.e0(this.screenWrappers), new wn0.l() { // from class: com.swmansion.rnscreens.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m0.onUpdate$lambda$18$lambda$16((b0) obj);
            }
        }));
        this.preloadedWrappers = ho0.l.c0(ho0.l.H(p013kotlin.collections.v.e0(this.screenWrappers), new wn0.l() { // from class: com.swmansion.rnscreens.l0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.onUpdate$lambda$18$lambda$17((b0) obj));
            }
        }));
        turnOffA11yUnderTransparentScreen((b0) n0Var2.f86529a);
        r0VarCreateTransaction.j();
    }

    public final void onViewAppearTransitionEnd() {
        if (this.removalTransitionStarted) {
            return;
        }
        dispatchOnFinishTransitioning();
    }

    @Override // com.swmansion.rnscreens.v
    public void removeAllScreens() {
        this.dismissedWrappers.clear();
        super.removeAllScreens();
    }

    @Override // com.swmansion.rnscreens.v
    public void removeScreenAt(int index) {
        Set<u0> set = this.dismissedWrappers;
        p013kotlin.jvm.internal.u0.a(set).remove(getScreenFragmentWrapperAt(index));
        super.removeScreenAt(index);
    }

    public final void setGoingForward(boolean z11) {
        this.goingForward = z11;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        com.swmansion.rnscreens.stack.views.a aVar;
        p013kotlin.jvm.internal.s.k(view, "view");
        if (!(view instanceof com.swmansion.rnscreens.stack.views.e)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((com.swmansion.rnscreens.stack.views.e) view).getFragment().isRemoving()) {
            this.disappearingTransitioningChildren.add(view);
        }
        if (!this.disappearingTransitioningChildren.isEmpty() && (aVar = this.childrenDrawingOrderStrategy) != null) {
            aVar.enable();
        }
        this.removalTransitionStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.v
    public u0 adapt(t screen) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        return c.$EnumSwitchMapping$0[screen.getStackPresentation().ordinal()] == 1 ? new t0(screen) : new t0(screen);
    }
}

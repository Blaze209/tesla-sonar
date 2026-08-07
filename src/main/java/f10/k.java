package f10;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010CR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010K\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0016\u0010M\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR&\u0010R\u001a\u0012\u0012\u0004\u0012\u00020!0Nj\b\u0012\u0004\u0012\u00020!`O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010T\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010G\u001a\u0004\bL\u0010\u0015\"\u0004\b2\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010^\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010Z\u001a\u0004\bF\u0010[\"\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0015¨\u0006`"}, d2 = {"Lf10/k;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Landroidx/core/view/a0;", "Lf10/n;", "Lcom/facebook/react/views/view/e;", "eventPropagationView", "Landroid/view/View;", "view", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf10/l;", "config", "<init>", "(Lcom/facebook/react/views/view/e;Landroid/view/View;Lcom/facebook/react/uimanager/v0;Lf10/l;)V", "", "keyboardHeight", "Ljn0/h0;", "m", "(D)V", "", "j", "()Z", "f", "()D", Snapshot.HEIGHT, "Lcom/facebook/react/bridge/WritableMap;", "g", "(D)Lcom/facebook/react/bridge/WritableMap;", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/view/WindowInsetsAnimationCompat;", "animation", "Landroidx/core/view/WindowInsetsAnimationCompat$a;", "bounds", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$a;)Landroidx/core/view/WindowInsetsAnimationCompat$a;", "", "runningAnimations", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "onEnd", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "isVisible", "o", "(Ljava/lang/Double;Ljava/lang/Boolean;)V", DateTokenConverter.CONVERTER_KEY, "()V", "a", "Lcom/facebook/react/views/view/e;", "getEventPropagationView", "()Lcom/facebook/react/views/view/e;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "c", "Lcom/facebook/react/uimanager/v0;", "getContext", "()Lcom/facebook/react/uimanager/v0;", "Lf10/l;", "", "e", "I", "surfaceId", "D", "persistentKeyboardHeight", "prevKeyboardHeight", "h", "Z", "isKeyboardVisible", IntegerTokenConverter.CONVERTER_KEY, "isTransitioning", "duration", "k", "viewTagFocused", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "l", "Ljava/util/HashSet;", "animationsToSkip", "(Z)V", "isSuspended", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "n", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "focusListener", "Lf10/g;", "Lf10/g;", "()Lf10/g;", "setLayoutObserver$react_native_keyboard_controller_release", "(Lf10/g;)V", "layoutObserver", "isKeyboardInteractive", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends WindowInsetsAnimationCompat.Callback implements a0, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.react.views.view.e eventPropagationView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final KeyboardAnimationCallbackConfig config;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int surfaceId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double persistentKeyboardHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private double prevKeyboardHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isKeyboardVisible;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioning;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int duration;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int viewTagFocused;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private HashSet<WindowInsetsAnimationCompat> animationsToSkip;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isSuspended;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalFocusChangeListener focusListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private g layoutObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.facebook.react.views.view.e eventPropagationView, View view, v0 v0Var, KeyboardAnimationCallbackConfig config) {
        super(config.getDispatchMode());
        s.k(eventPropagationView, "eventPropagationView");
        s.k(view, "view");
        s.k(config, "config");
        this.eventPropagationView = eventPropagationView;
        this.view = view;
        this.context = v0Var;
        this.config = config;
        this.surfaceId = b1.f(eventPropagationView);
        this.viewTagFocused = -1;
        this.animationsToSkip = new HashSet<>();
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: f10.j
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                k.e(this.f63818a, view2, view3);
            }
        };
        this.focusListener = onGlobalFocusChangeListener;
        if ((config.getDeferredInsetTypes() & config.getPersistentInsetTypes()) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values");
        }
        this.layoutObserver = new g(view, eventPropagationView, v0Var);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k kVar, View view, View view2) {
        if (view2 instanceof EditText) {
            kVar.viewTagFocused = ((EditText) view2).getId();
            if (!kVar.isKeyboardVisible || view == null) {
                return;
            }
            v0 v0Var = kVar.context;
            int id2 = kVar.eventPropagationView.getId();
            int i11 = kVar.surfaceId;
            int id3 = kVar.eventPropagationView.getId();
            b10.f.Companion aVar = b10.f.INSTANCE;
            c10.g.a(v0Var, id2, new b10.f(i11, id3, aVar.d(), kVar.persistentKeyboardHeight, 1.0d, 0, kVar.viewTagFocused));
            c10.g.a(kVar.context, kVar.eventPropagationView.getId(), new b10.f(kVar.surfaceId, kVar.eventPropagationView.getId(), aVar.a(), kVar.persistentKeyboardHeight, 1.0d, 0, kVar.viewTagFocused));
            c10.g.b(kVar.context, "KeyboardController::keyboardWillShow", kVar.g(kVar.persistentKeyboardHeight));
            c10.g.b(kVar.context, "KeyboardController::keyboardDidShow", kVar.g(kVar.persistentKeyboardHeight));
        }
    }

    private final double f() {
        k5.e eVarF;
        k5.e eVarF2;
        WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(this.view);
        int i11 = 0;
        int i12 = (windowInsetsCompatH == null || (eVarF2 = windowInsetsCompatH.f(WindowInsetsCompat.n.c())) == null) ? 0 : eVarF2.f84927d;
        if (!this.config.getHasTranslucentNavigationBar() && windowInsetsCompatH != null && (eVarF = windowInsetsCompatH.f(WindowInsetsCompat.n.f())) != null) {
            i11 = eVarF.f84927d;
        }
        return bo0.n.d(c10.d.a(i12 - i11), 0.0d);
    }

    private final WritableMap g(double height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, height);
        writableMapCreateMap.putInt("duration", this.duration);
        writableMapCreateMap.putDouble("timestamp", System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.viewTagFocused);
        EditText editTextB = l10.a.f89487a.b();
        writableMapCreateMap.putString("type", editTextB != null ? c10.c.f(editTextB) : null);
        writableMapCreateMap.putString("appearance", c10.g.c(this.context));
        return writableMapCreateMap;
    }

    private final boolean i() {
        return this.duration == -1;
    }

    private final boolean j() {
        WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(this.view);
        if (windowInsetsCompatH != null) {
            return windowInsetsCompatH.q(WindowInsetsCompat.n.c());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(k kVar, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        double dF = kVar.f();
        kVar.isKeyboardVisible = kVar.j();
        kVar.prevKeyboardHeight = dF;
        if (kVar.animationsToSkip.contains(windowInsetsAnimationCompat)) {
            kVar.duration = 0;
            kVar.animationsToSkip.remove(windowInsetsAnimationCompat);
            return;
        }
        c10.g.b(kVar.context, "KeyboardController::" + (!kVar.isKeyboardVisible ? "keyboardDidHide" : "keyboardDidShow"), kVar.g(dF));
        c10.g.a(kVar.context, kVar.eventPropagationView.getId(), new b10.f(kVar.surfaceId, kVar.eventPropagationView.getId(), b10.f.INSTANCE.a(), dF, !kVar.isKeyboardVisible ? 0.0d : 1.0d, kVar.duration, kVar.viewTagFocused));
        kVar.duration = 0;
        c10.g.d(kVar.context, kVar.eventPropagationView.getId());
    }

    private final void m(double keyboardHeight) {
        this.duration = 0;
        c10.g.b(this.context, "KeyboardController::keyboardWillShow", g(keyboardHeight));
        b10.f.Companion aVar = b10.f.INSTANCE;
        Iterator it = v.p(aVar.d(), aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            c10.g.a(this.context, this.eventPropagationView.getId(), new b10.f(this.surfaceId, this.eventPropagationView.getId(), (b10.f.Companion.EnumC0273a) it.next(), keyboardHeight, 1.0d, 0, this.viewTagFocused));
        }
        c10.g.b(this.context, "KeyboardController::keyboardDidShow", g(keyboardHeight));
        c10.g.d(this.context, this.eventPropagationView.getId());
        this.persistentKeyboardHeight = keyboardHeight;
    }

    public static /* synthetic */ void p(k kVar, Double d11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        kVar.o(d11, bool);
    }

    @Override // f10.n
    public void a(boolean z11) {
        this.isSuspended = z11;
    }

    public final void d() {
        this.view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusListener);
        g gVar = this.layoutObserver;
        if (gVar != null) {
            gVar.f();
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getLayoutObserver() {
        return this.layoutObserver;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getIsSuspended() {
        return this.isSuspended;
    }

    public void n(boolean z11) {
        n.a.a(this, z11);
    }

    public final void o(Double height, Boolean isVisible) {
        double dDoubleValue = height != null ? height.doubleValue() : f();
        boolean zBooleanValue = isVisible != null ? isVisible.booleanValue() : j();
        this.isKeyboardVisible = zBooleanValue;
        this.prevKeyboardHeight = dDoubleValue;
        this.isTransitioning = false;
        this.duration = 0;
        c10.g.b(this.context, "KeyboardController::" + (!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow"), g(dDoubleValue));
        b10.f.Companion aVar = b10.f.INSTANCE;
        Iterator it = v.p(aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            c10.g.a(this.context, this.eventPropagationView.getId(), new b10.f(this.surfaceId, this.eventPropagationView.getId(), (b10.f.Companion.EnumC0273a) it.next(), dDoubleValue, !this.isKeyboardVisible ? 0.0d : 1.0d, this.duration, this.viewTagFocused));
        }
    }

    @Override // androidx.core.view.a0
    public WindowInsetsCompat onApplyWindowInsets(View v11, WindowInsetsCompat insets) {
        s.k(v11, "v");
        s.k(insets, "insets");
        double dF = f();
        boolean z11 = (this.isKeyboardVisible && j()) && !(this.isTransitioning || d10.a.f59236a.a());
        boolean z12 = this.persistentKeyboardHeight == dF;
        if (z11 && !z12 && !m.f63839b) {
            g10.a.b(g10.a.f67023a, m.f63838a, "onApplyWindowInsets: " + this.persistentKeyboardHeight + " -> " + dF, null, 4, null);
            g gVar = this.layoutObserver;
            if (gVar != null) {
                gVar.l();
            }
            m(dF);
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(final WindowInsetsAnimationCompat animation) {
        s.k(animation, "animation");
        super.onEnd(animation);
        if (!c10.j.a(animation) || getIsSuspended()) {
            return;
        }
        this.isTransitioning = false;
        this.duration = (int) animation.a();
        Runnable runnable = new Runnable() { // from class: f10.i
            @Override // java.lang.Runnable
            public final void run() {
                k.l(this.f63816a, animation);
            }
        };
        if (i()) {
            this.view.postDelayed(runnable, a10.b.f33a.a());
        } else {
            runnable.run();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
        Object next;
        s.k(insets, "insets");
        s.k(runningAnimations, "runningAnimations");
        Iterator<T> it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) next;
            if (c10.j.a(windowInsetsAnimationCompat) && !this.animationsToSkip.contains(windowInsetsAnimationCompat)) {
                break;
            }
        }
        boolean z11 = next == null;
        if (!getIsSuspended() && !z11) {
            k5.e eVarF = insets.f(this.config.getDeferredInsetTypes());
            s.j(eVarF, "getInsets(...)");
            k5.e eVarF2 = insets.f(this.config.getPersistentInsetTypes());
            s.j(eVarF2, "getInsets(...)");
            if (this.config.getHasTranslucentNavigationBar()) {
                eVarF2 = k5.e.f84923e;
            }
            k5.e eVarB = k5.e.b(k5.e.e(eVarF, eVarF2), k5.e.f84923e);
            s.j(eVarB, "let(...)");
            float f11 = eVarB.f84927d - eVarB.f84925b;
            double dA = c10.d.a(f11);
            double d11 = 0.0d;
            try {
                double dAbs = Math.abs(dA / this.persistentKeyboardHeight);
                if (!Double.isNaN(dAbs) && !Double.isInfinite(dAbs)) {
                    d11 = dAbs;
                }
            } catch (ArithmeticException e11) {
                g10.a.d(g10.a.f67023a, m.f63838a, "Caught arithmetic exception during `progress` calculation: " + e11, null, 4, null);
            }
            double d12 = d11;
            g10.a aVar = g10.a.f67023a;
            String str = m.f63838a;
            d10.a aVar2 = d10.a.f59236a;
            g10.a.b(aVar, str, "DiffY: " + f11 + " " + dA + " " + d12 + " " + aVar2.a() + " " + this.viewTagFocused, null, 4, null);
            c10.g.a(this.context, this.eventPropagationView.getId(), new b10.f(this.surfaceId, this.eventPropagationView.getId(), aVar2.a() ? b10.f.INSTANCE.b() : b10.f.INSTANCE.c(), dA, d12, this.duration, this.viewTagFocused));
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.a onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.a bounds) {
        s.k(animation, "animation");
        s.k(bounds, "bounds");
        if (!c10.j.a(animation) || getIsSuspended()) {
            return bounds;
        }
        this.isTransitioning = true;
        this.isKeyboardVisible = j();
        this.duration = (int) animation.a();
        double dF = f();
        if (this.isKeyboardVisible) {
            this.persistentKeyboardHeight = dF;
        }
        g gVar = this.layoutObserver;
        if (gVar != null) {
            gVar.l();
        }
        boolean z11 = (dF == 0.0d || this.prevKeyboardHeight == dF) ? false : true;
        boolean z12 = this.isKeyboardVisible && this.prevKeyboardHeight != 0.0d;
        if (z11 && z12 && m.f63839b) {
            m(dF);
            this.animationsToSkip.add(animation);
            return bounds;
        }
        c10.g.b(this.context, "KeyboardController::" + (!this.isKeyboardVisible ? "keyboardWillHide" : "keyboardWillShow"), g(dF));
        g10.a.b(g10.a.f67023a, m.f63838a, "HEIGHT:: " + dF + " TAG:: " + this.viewTagFocused, null, 4, null);
        v0 v0Var = this.context;
        int id2 = this.eventPropagationView.getId();
        double d11 = 0.0d;
        int i11 = this.surfaceId;
        int id3 = this.eventPropagationView.getId();
        b10.f.Companion.EnumC0273a enumC0273aD = b10.f.INSTANCE.d();
        if (this.isKeyboardVisible) {
            d11 = 1.0d;
        }
        c10.g.a(v0Var, id2, new b10.f(i11, id3, enumC0273aD, dF, d11, this.duration, this.viewTagFocused));
        WindowInsetsAnimationCompat.a aVarOnStart = super.onStart(animation, bounds);
        s.j(aVarOnStart, "onStart(...)");
        return aVarOnStart;
    }
}

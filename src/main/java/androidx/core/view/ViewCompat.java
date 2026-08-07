package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> f7637a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f7638b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7639c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f7640d = {h5.e.f70785b, h5.e.f70786c, h5.e.f70797n, h5.e.f70808y, h5.e.B, h5.e.C, h5.e.D, h5.e.E, h5.e.F, h5.e.G, h5.e.f70787d, h5.e.f70788e, h5.e.f70789f, h5.e.f70790g, h5.e.f70791h, h5.e.f70792i, h5.e.f70793j, h5.e.f70794k, h5.e.f70795l, h5.e.f70796m, h5.e.f70798o, h5.e.f70799p, h5.e.f70800q, h5.e.f70801r, h5.e.f70802s, h5.e.f70803t, h5.e.f70804u, h5.e.f70805v, h5.e.f70806w, h5.e.f70807x, h5.e.f70809z, h5.e.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f7641e = new c0() { // from class: androidx.core.view.m0
        @Override // androidx.core.view.c0
        public final d a(d dVar) {
            return ViewCompat.a(dVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f7642f = new e();

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    class a extends f<Boolean> {
        a(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.ViewCompat.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f7643a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z11 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z11) {
                ViewCompat.Y(key, z11 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f7643a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f7643a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f7643a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f7645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f7647d;

        f(int i11, Class<T> cls, int i12) {
            this(i11, cls, 0, i12);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f7646c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t11);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t11 = (T) view.getTag(this.f7644a);
            if (this.f7645b.isInstance(t11)) {
                return t11;
            }
            return null;
        }

        void f(View view, T t11) {
            if (b()) {
                d(view, t11);
            } else if (g(e(view), t11)) {
                ViewCompat.k(view);
                view.setTag(this.f7644a, t11);
                ViewCompat.Y(view, this.f7647d);
            }
        }

        abstract boolean g(T t11, T t12);

        f(int i11, Class<T> cls, int i12, int i13) {
            this.f7644a = i11;
            this.f7645b = cls;
            this.f7647d = i12;
            this.f7646c = i13;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return r0.f7845b ? r0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            WindowInsetsCompat f7648a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f7649b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a0 f7650c;

            a(View view, a0 a0Var) {
                this.f7649b = view;
                this.f7650c = a0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatZ = WindowInsetsCompat.z(windowInsets, view);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    h.a(windowInsets, this.f7649b);
                    if (windowInsetsCompatZ.equals(this.f7648a)) {
                        return this.f7650c.onApplyWindowInsets(view, windowInsetsCompatZ).x();
                    }
                }
                this.f7648a = windowInsetsCompatZ;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = this.f7650c.onApplyWindowInsets(view, windowInsetsCompatZ);
                if (i11 >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.x();
                }
                ViewCompat.m0(view);
                return windowInsetsCompatOnApplyWindowInsets.x();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(h5.e.T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsX = windowInsetsCompat.x();
            if (windowInsetsX != null) {
                return WindowInsetsCompat.z(view.computeSystemWindowInsets(windowInsetsX, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f11) {
            view.setElevation(f11);
        }

        static void m(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        static void n(View view, a0 a0Var) {
            a aVar = a0Var != null ? new a(view, a0Var) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(h5.e.M, aVar);
            }
            if (view.getTag(h5.e.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(h5.e.T));
            }
        }

        static void o(View view, String str) {
            view.setTransitionName(str);
        }

        static void p(View view, float f11) {
            view.setTranslationZ(f11);
        }

        static void q(View view, float f11) {
            view.setZ(f11);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatY = WindowInsetsCompat.y(rootWindowInsets);
            windowInsetsCompatY.u(windowInsetsCompatY);
            windowInsetsCompatY.d(view.getRootView());
            return windowInsetsCompatY;
        }

        static void b(View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i11) {
            view.setImportantForAutofill(i11);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static WindowInsetsControllerCompat c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.j(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.d b(View view, androidx.core.view.d dVar) {
            ContentInfo contentInfoF = dVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? dVar : androidx.core.view.d.g(contentInfoPerformReceiveContent);
        }
    }

    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f7651d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f7652a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f7653b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f7654c = null;

        p() {
        }

        static p a(View view) {
            p pVar = (p) view.getTag(h5.e.R);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(h5.e.R, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f7652a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f7653b == null) {
                this.f7653b = new SparseArray<>();
            }
            return this.f7653b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(h5.e.S);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f7652a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f7651d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f7652a == null) {
                        this.f7652a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f7651d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f7652a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f7652a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f7654c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f7654c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    protected ViewCompat() {
    }

    @Deprecated
    public static int A(View view) {
        return view.getLayoutDirection();
    }

    private static void A0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumHeight();
    }

    public static void B0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i11);
        }
    }

    @Deprecated
    public static int C(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    public static void C0(View view, int i11) {
        view.setLabelFor(i11);
    }

    public static String[] D(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(h5.e.O);
    }

    public static void D0(View view, boolean z11) {
        h.m(view, z11);
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingEnd();
    }

    public static void E0(View view, a0 a0Var) {
        h.n(view, a0Var);
    }

    @Deprecated
    public static int F(View view) {
        return view.getPaddingStart();
    }

    @Deprecated
    public static void F0(View view, int i11, int i12, int i13, int i14) {
        view.setPaddingRelative(i11, i12, i13, i14);
    }

    @Deprecated
    public static ViewParent G(View view) {
        return view.getParentForAccessibility();
    }

    public static void G0(View view, e0 e0Var) {
        j.a(view, (PointerIcon) (e0Var != null ? e0Var.a() : null));
    }

    public static WindowInsetsCompat H(View view) {
        return i.a(view);
    }

    public static void H0(View view, int i11, int i12) {
        i.b(view, i11, i12);
    }

    public static CharSequence I(View view) {
        return N0().e(view);
    }

    public static void I0(View view, CharSequence charSequence) {
        N0().f(view, charSequence);
    }

    public static String J(View view) {
        return h.f(view);
    }

    public static void J0(View view, String str) {
        h.o(view, str);
    }

    public static float K(View view) {
        return h.g(view);
    }

    public static void K0(View view, float f11) {
        h.p(view, f11);
    }

    @Deprecated
    public static WindowInsetsControllerCompat L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return z0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void L0(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.d(view, callback);
    }

    @Deprecated
    public static int M(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void M0(View view, float f11) {
        h.q(view, f11);
    }

    public static float N(View view) {
        return h.h(view);
    }

    private static f<CharSequence> N0() {
        return new c(h5.e.Q, CharSequence.class, 64, 30);
    }

    public static boolean O(View view) {
        return n(view) != null;
    }

    public static void O0(View view) {
        h.r(view);
    }

    @Deprecated
    public static boolean P(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.hasTransientState();
    }

    public static boolean R(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean S(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean T(View view) {
        return view.isInLayout();
    }

    @Deprecated
    public static boolean U(View view) {
        return view.isLaidOut();
    }

    public static boolean V(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean W(View view) {
        return view.isPaddingRelative();
    }

    public static boolean X(View view) {
        Boolean boolE = o0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    static void Y(View view, int i11) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z11) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z11 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i11);
                if (z11) {
                    accessibilityEventObtain.getText().add(p(view));
                    A0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i11 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i11);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i11);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e11);
                }
            }
        }
    }

    public static void Z(View view, int i11) {
        view.offsetLeftAndRight(i11);
    }

    public static /* synthetic */ androidx.core.view.d a(androidx.core.view.d dVar) {
        return dVar;
    }

    public static void a0(View view, int i11) {
        view.offsetTopAndBottom(i11);
    }

    private static f<Boolean> b() {
        return new d(h5.e.J, Boolean.class, 28);
    }

    public static WindowInsetsCompat b0(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsX = windowInsetsCompat.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsX);
            if (!windowInsetsB.equals(windowInsetsX)) {
                return WindowInsetsCompat.z(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    public static int c(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int iR = r(view, charSequence);
        if (iR != -1) {
            d(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iR, charSequence, accessibilityViewCommand));
        }
        return iR;
    }

    @Deprecated
    public static void c0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.m1());
    }

    private static void d(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        k(view);
        k0(accessibilityActionCompat.b(), view);
        q(view).add(accessibilityActionCompat);
        Y(view, 0);
    }

    private static f<CharSequence> d0() {
        return new b(h5.e.K, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat e(View view) {
        if (f7637a == null) {
            f7637a = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = f7637a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f7637a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    @Deprecated
    public static boolean e0(View view, int i11, Bundle bundle) {
        return view.performAccessibilityAction(i11, bundle);
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    public static androidx.core.view.d f0(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        b0 b0Var = (b0) view.getTag(h5.e.N);
        if (b0Var == null) {
            return w(view).a(dVar);
        }
        androidx.core.view.d dVarA = b0Var.a(view, dVar);
        if (dVarA == null) {
            return null;
        }
        return w(view).a(dVarA);
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        int i11 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsX = windowInsetsCompat.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsA = i11 >= 30 ? n.a(view, windowInsetsX) : g.a(view, windowInsetsX);
            if (!windowInsetsA.equals(windowInsetsX)) {
                return WindowInsetsCompat.z(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void g0(View view) {
        view.postInvalidateOnAnimation();
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static void h0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void i0(View view, Runnable runnable, long j11) {
        view.postOnAnimationDelayed(runnable, j11);
    }

    public static void j(View view) {
        k(view);
    }

    public static void j0(View view, int i11) {
        k0(i11, view);
        Y(view, 0);
    }

    static void k(View view) {
        androidx.core.view.a aVarM = m(view);
        if (aVarM == null) {
            aVarM = new androidx.core.view.a();
        }
        p0(view, aVarM);
    }

    private static void k0(int i11, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listQ = q(view);
        for (int i12 = 0; i12 < listQ.size(); i12++) {
            if (listQ.get(i12).b() == i11) {
                listQ.remove(i12);
                return;
            }
        }
    }

    @Deprecated
    public static int l() {
        return View.generateViewId();
    }

    public static void l0(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            j0(view, accessibilityActionCompat.b());
        } else {
            d(view, accessibilityActionCompat.a(charSequence, accessibilityViewCommand));
        }
    }

    public static androidx.core.view.a m(View view) {
        View.AccessibilityDelegate accessibilityDelegateN = n(view);
        if (accessibilityDelegateN == null) {
            return null;
        }
        return accessibilityDelegateN instanceof androidx.core.view.a.C0157a ? ((androidx.core.view.a.C0157a) accessibilityDelegateN).f7737a : new androidx.core.view.a(accessibilityDelegateN);
    }

    public static void m0(View view) {
        g.c(view);
    }

    private static View.AccessibilityDelegate n(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : o(view);
    }

    public static void n0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    private static View.AccessibilityDelegate o(View view) {
        if (f7639c) {
            return null;
        }
        if (f7638b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7638b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7639c = true;
                return null;
            }
        }
        try {
            Object obj = f7638b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7639c = true;
            return null;
        }
    }

    private static f<Boolean> o0() {
        return new a(h5.e.P, Boolean.class, 28);
    }

    public static CharSequence p(View view) {
        return d0().e(view);
    }

    public static void p0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (n(view) instanceof androidx.core.view.a.C0157a)) {
            aVar = new androidx.core.view.a();
        }
        A0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(h5.e.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(h5.e.H, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, boolean z11) {
        b().f(view, Boolean.valueOf(z11));
    }

    private static int r(View view, CharSequence charSequence) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listQ = q(view);
        for (int i11 = 0; i11 < listQ.size(); i11++) {
            if (TextUtils.equals(charSequence, listQ.get(i11).c())) {
                return listQ.get(i11).b();
            }
        }
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr = f7640d;
            if (i13 >= iArr.length || i12 != -1) {
                break;
            }
            int i14 = iArr[i13];
            boolean z11 = true;
            for (int i15 = 0; i15 < listQ.size(); i15++) {
                z11 &= listQ.get(i15).b() != i14;
            }
            if (z11) {
                i12 = i14;
            }
            i13++;
        }
        return i12;
    }

    @Deprecated
    public static void r0(View view, int i11) {
        view.setAccessibilityLiveRegion(i11);
    }

    public static ColorStateList s(View view) {
        return h.c(view);
    }

    public static void s0(View view, CharSequence charSequence) {
        d0().f(view, charSequence);
        if (charSequence != null) {
            f7642f.a(view);
        } else {
            f7642f.d(view);
        }
    }

    public static PorterDuff.Mode t(View view) {
        return h.d(view);
    }

    @Deprecated
    public static void t0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Deprecated
    public static Display u(View view) {
        return view.getDisplay();
    }

    public static void u0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static float v(View view) {
        return h.e(view);
    }

    public static void v0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c0 w(View view) {
        return view instanceof c0 ? (c0) view : f7641e;
    }

    @Deprecated
    public static void w0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @Deprecated
    public static boolean x(View view) {
        return view.getFitsSystemWindows();
    }

    public static void x0(View view, float f11) {
        h.l(view, f11);
    }

    @Deprecated
    public static int y(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void y0(View view, boolean z11) {
        view.setFitsSystemWindows(z11);
    }

    @SuppressLint({"InlinedApi"})
    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    @Deprecated
    public static void z0(View view, int i11) {
        view.setImportantForAccessibility(i11);
    }
}

package s6;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.collection.y0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.List;
import z5.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f110335n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final s6.b.a<AccessibilityNodeInfoCompat> f110336o = new C2348a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final s6.b.InterfaceC2349b<y0<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> f110337p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f110342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f110343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f110344j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f110338d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f110339e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f110340f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f110341g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f110345k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f110346l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f110347m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    class C2348a implements s6.b.a<AccessibilityNodeInfoCompat> {
        C2348a() {
        }

        @Override // s6.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.m(rect);
        }
    }

    class b implements s6.b.InterfaceC2349b<y0<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        b() {
        }

        @Override // s6.b.InterfaceC2349b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AccessibilityNodeInfoCompat a(y0<AccessibilityNodeInfoCompat> y0Var, int i11) {
            return y0Var.m(i11);
        }

        @Override // s6.b.InterfaceC2349b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(y0<AccessibilityNodeInfoCompat> y0Var) {
            return y0Var.l();
        }
    }

    private class c extends AccessibilityNodeProviderCompat {
        c() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat b(int i11) {
            return AccessibilityNodeInfoCompat.h0(a.this.H(i11));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat d(int i11) {
            int i12 = i11 == 2 ? a.this.f110345k : a.this.f110346l;
            if (i12 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i12);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean f(int i11, int i12, Bundle bundle) {
            return a.this.P(i11, i12, bundle);
        }
    }

    public a(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f110343i = view;
        this.f110342h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.y(view) == 0) {
            ViewCompat.z0(view, 1);
        }
    }

    private static Rect D(@NonNull View view, int i11, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i11 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i11 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i11 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i11 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f110343i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f110343i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i11) {
        if (i11 == 19) {
            return 33;
        }
        if (i11 == 21) {
            return 17;
        }
        if (i11 != 22) {
            return EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        }
        return 66;
    }

    private boolean G(int i11, Rect rect) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        y0<AccessibilityNodeInfoCompat> y0VarY = y();
        int i12 = this.f110346l;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatE = i12 == Integer.MIN_VALUE ? null : y0VarY.e(i12);
        if (i11 == 1 || i11 == 2) {
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) s6.b.d(y0VarY, f110337p, f110336o, accessibilityNodeInfoCompatE, i11, ViewCompat.A(this.f110343i) == 1, false);
        } else {
            if (i11 != 17 && i11 != 33 && i11 != 66 && i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f110346l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f110343i, i11, rect2);
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) s6.b.c(y0VarY, f110337p, f110336o, accessibilityNodeInfoCompatE, rect2, i11);
        }
        return T(accessibilityNodeInfoCompat != null ? y0VarY.h(y0VarY.g(accessibilityNodeInfoCompat)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i11, int i12, Bundle bundle) {
        if (i12 == 1) {
            return T(i11);
        }
        if (i12 == 2) {
            return o(i11);
        }
        if (i12 != 64) {
            return i12 != 128 ? J(i11, i12, bundle) : n(i11);
        }
        return S(i11);
    }

    private boolean R(int i11, Bundle bundle) {
        return ViewCompat.e0(this.f110343i, i11, bundle);
    }

    private boolean S(int i11) {
        int i12;
        if (!this.f110342h.isEnabled() || !this.f110342h.isTouchExplorationEnabled() || (i12 = this.f110345k) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            n(i12);
        }
        this.f110345k = i11;
        this.f110343i.invalidate();
        U(i11, 32768);
        return true;
    }

    private void V(int i11) {
        int i12 = this.f110347m;
        if (i12 == i11) {
            return;
        }
        this.f110347m = i11;
        U(i11, 128);
        U(i12, 256);
    }

    private boolean n(int i11) {
        if (this.f110345k != i11) {
            return false;
        }
        this.f110345k = Integer.MIN_VALUE;
        this.f110343i.invalidate();
        U(i11, 65536);
        return true;
    }

    private boolean p() {
        int i11 = this.f110346l;
        return i11 != Integer.MIN_VALUE && J(i11, 16, null);
    }

    private AccessibilityEvent q(int i11, int i12) {
        return i11 != -1 ? r(i11, i12) : s(i12);
    }

    private AccessibilityEvent r(int i11, int i12) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i12);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatH = H(i11);
        accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatH.F());
        accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatH.u());
        accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatH.a0());
        accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatH.Y());
        accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatH.R());
        accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatH.O());
        L(i11, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatH.q());
        q.c(accessibilityEventObtain, this.f110343i, i11);
        accessibilityEventObtain.setPackageName(this.f110343i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        this.f110343i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    private AccessibilityNodeInfoCompat t(int i11) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatF0 = AccessibilityNodeInfoCompat.f0();
        accessibilityNodeInfoCompatF0.B0(true);
        accessibilityNodeInfoCompatF0.D0(true);
        accessibilityNodeInfoCompatF0.t0("android.view.View");
        Rect rect = f110335n;
        accessibilityNodeInfoCompatF0.p0(rect);
        accessibilityNodeInfoCompatF0.q0(rect);
        accessibilityNodeInfoCompatF0.R0(this.f110343i);
        N(i11, accessibilityNodeInfoCompatF0);
        if (accessibilityNodeInfoCompatF0.F() == null && accessibilityNodeInfoCompatF0.u() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatF0.m(this.f110339e);
        if (this.f110339e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = accessibilityNodeInfoCompatF0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatF0.P0(this.f110343i.getContext().getPackageName());
        accessibilityNodeInfoCompatF0.b1(this.f110343i, i11);
        if (this.f110345k == i11) {
            accessibilityNodeInfoCompatF0.m0(true);
            accessibilityNodeInfoCompatF0.a(128);
        } else {
            accessibilityNodeInfoCompatF0.m0(false);
            accessibilityNodeInfoCompatF0.a(64);
        }
        boolean z11 = this.f110346l == i11;
        if (z11) {
            accessibilityNodeInfoCompatF0.a(2);
        } else if (accessibilityNodeInfoCompatF0.T()) {
            accessibilityNodeInfoCompatF0.a(1);
        }
        accessibilityNodeInfoCompatF0.E0(z11);
        this.f110343i.getLocationOnScreen(this.f110341g);
        accessibilityNodeInfoCompatF0.n(this.f110338d);
        if (this.f110338d.equals(rect)) {
            accessibilityNodeInfoCompatF0.m(this.f110338d);
            if (accessibilityNodeInfoCompatF0.f7740b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatF1 = AccessibilityNodeInfoCompat.f0();
                for (int i12 = accessibilityNodeInfoCompatF0.f7740b; i12 != -1; i12 = accessibilityNodeInfoCompatF1.f7740b) {
                    accessibilityNodeInfoCompatF1.S0(this.f110343i, -1);
                    accessibilityNodeInfoCompatF1.p0(f110335n);
                    N(i12, accessibilityNodeInfoCompatF1);
                    accessibilityNodeInfoCompatF1.m(this.f110339e);
                    Rect rect2 = this.f110338d;
                    Rect rect3 = this.f110339e;
                    rect2.offset(rect3.left, rect3.top);
                }
                accessibilityNodeInfoCompatF1.j0();
            }
            this.f110338d.offset(this.f110341g[0] - this.f110343i.getScrollX(), this.f110341g[1] - this.f110343i.getScrollY());
        }
        if (this.f110343i.getLocalVisibleRect(this.f110340f)) {
            this.f110340f.offset(this.f110341g[0] - this.f110343i.getScrollX(), this.f110341g[1] - this.f110343i.getScrollY());
            if (this.f110338d.intersect(this.f110340f)) {
                accessibilityNodeInfoCompatF0.q0(this.f110338d);
                if (E(this.f110338d)) {
                    accessibilityNodeInfoCompatF0.l1(true);
                }
            }
        }
        return accessibilityNodeInfoCompatF0;
    }

    @NonNull
    private AccessibilityNodeInfoCompat u() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatG0 = AccessibilityNodeInfoCompat.g0(this.f110343i);
        ViewCompat.c0(this.f110343i, accessibilityNodeInfoCompatG0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (accessibilityNodeInfoCompatG0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            accessibilityNodeInfoCompatG0.d(this.f110343i, ((Integer) arrayList.get(i11)).intValue());
        }
        return accessibilityNodeInfoCompatG0;
    }

    private y0<AccessibilityNodeInfoCompat> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        y0<AccessibilityNodeInfoCompat> y0Var = new y0<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            y0Var.i(arrayList.get(i11).intValue(), t(arrayList.get(i11).intValue()));
        }
        return y0Var;
    }

    private void z(int i11, Rect rect) {
        H(i11).m(rect);
    }

    public final int A() {
        return this.f110346l;
    }

    protected abstract int B(float f11, float f12);

    protected abstract void C(List<Integer> list);

    @NonNull
    AccessibilityNodeInfoCompat H(int i11) {
        return i11 == -1 ? u() : t(i11);
    }

    public final void I(boolean z11, int i11, Rect rect) {
        int i12 = this.f110346l;
        if (i12 != Integer.MIN_VALUE) {
            o(i12);
        }
        if (z11) {
            G(i11, rect);
        }
    }

    protected abstract boolean J(int i11, int i12, Bundle bundle);

    protected abstract void N(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    boolean P(int i11, int i12, Bundle bundle) {
        return i11 != -1 ? Q(i11, i12, bundle) : R(i12, bundle);
    }

    public final boolean T(int i11) {
        int i12;
        if ((!this.f110343i.isFocused() && !this.f110343i.requestFocus()) || (i12 = this.f110346l) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            o(i12);
        }
        if (i11 == Integer.MIN_VALUE) {
            return false;
        }
        this.f110346l = i11;
        O(i11, true);
        U(i11, 8);
        return true;
    }

    public final boolean U(int i11, int i12) {
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f110342h.isEnabled() || (parent = this.f110343i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f110343i, q(i11, i12));
    }

    @Override // androidx.core.view.a
    public AccessibilityNodeProviderCompat b(View view) {
        if (this.f110344j == null) {
            this.f110344j = new c();
        }
        return this.f110344j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g(view, accessibilityNodeInfoCompat);
        M(accessibilityNodeInfoCompat);
    }

    public final boolean o(int i11) {
        if (this.f110346l != i11) {
            return false;
        }
        this.f110346l = Integer.MIN_VALUE;
        O(i11, false);
        U(i11, 8);
        return true;
    }

    public final boolean v(@NonNull MotionEvent motionEvent) {
        if (this.f110342h.isEnabled() && this.f110342h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f110347m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean w(@NonNull KeyEvent keyEvent) {
        int i11 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iF = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i11 < repeatCount && G(iF, null)) {
                                    i11++;
                                    z11 = true;
                                }
                                return z11;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f110345k;
    }

    protected void K(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void M(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected void L(int i11, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void O(int i11, boolean z11) {
    }
}

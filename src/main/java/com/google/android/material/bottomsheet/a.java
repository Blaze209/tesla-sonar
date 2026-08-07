package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.z0;
import com.google.android.material.internal.d0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import st.g;
import zs.i;
import zs.l;

/* JADX INFO: loaded from: classes5.dex */
public class a extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f41642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f41643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CoordinatorLayout f41644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private FrameLayout f41645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f41646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f41647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f41650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private nt.c f41652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private BottomSheetBehavior.g f41653n;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0659a implements a0 {
        C0659a() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f41650k != null) {
                a.this.f41642c.G0(a.this.f41650k);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f41650k = new f(aVar.f41645f, windowInsetsCompat, null);
                a.this.f41650k.b(a.this.getWindow());
                a.this.f41642c.c0(a.this.f41650k);
            }
            return windowInsetsCompat;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f41647h && aVar.isShowing() && a.this.m()) {
                a.this.cancel();
            }
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            if (!a.this.f41647h) {
                accessibilityNodeInfoCompat.z0(false);
            } else {
                accessibilityNodeInfoCompat.a(PKIFailureInfo.badCertTemplate);
                accessibilityNodeInfoCompat.z0(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                a aVar = a.this;
                if (aVar.f41647h) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i11, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f11) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i11) {
            if (i11 == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f41659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final WindowInsetsCompat f41660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Window f41661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f41662d;

        /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0659a c0659a) {
            this(view, windowInsetsCompat);
        }

        private void a(View view) {
            if (view.getTop() < this.f41660b.m()) {
                Window window = this.f41661c;
                if (window != null) {
                    Boolean bool = this.f41659a;
                    com.google.android.material.internal.e.f(window, bool == null ? this.f41662d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f41660b.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f41661c;
                if (window2 != null) {
                    com.google.android.material.internal.e.f(window2, this.f41662d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        void b(Window window) {
            if (this.f41661c == window) {
                return;
            }
            this.f41661c = window;
            if (window != null) {
                this.f41662d = z0.a(window, window.getDecorView()).e();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void onLayout(@NonNull View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f11) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i11) {
            a(view);
        }

        private f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f41660b = windowInsetsCompat;
            g gVarU0 = BottomSheetBehavior.q0(view).u0();
            ColorStateList colorStateListX = gVarU0 != null ? gVarU0.x() : ViewCompat.s(view);
            if (colorStateListX != null) {
                this.f41659a = Boolean.valueOf(ht.a.h(colorStateListX.getDefaultColor()));
                return;
            }
            Integer numI = d0.i(view);
            if (numI != null) {
                this.f41659a = Boolean.valueOf(ht.a.h(numI.intValue()));
            } else {
                this.f41659a = null;
            }
        }
    }

    public a(@NonNull Context context, int i11) {
        super(context, b(context, i11));
        this.f41647h = true;
        this.f41648i = true;
        this.f41653n = new e();
        d(1);
        this.f41651l = getContext().getTheme().obtainStyledAttributes(new int[]{zs.c.C}).getBoolean(0, false);
    }

    private static int b(@NonNull Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(zs.c.f128565f, typedValue, true) ? typedValue.resourceId : l.f128796e;
    }

    private FrameLayout i() {
        if (this.f41643d == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), i.f128740b, null);
            this.f41643d = frameLayout;
            this.f41644e = (CoordinatorLayout) frameLayout.findViewById(zs.g.f128692e);
            FrameLayout frameLayout2 = (FrameLayout) this.f41643d.findViewById(zs.g.f128694f);
            this.f41645f = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f41642c = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f41653n);
            this.f41642c.Q0(this.f41647h);
            this.f41652m = new nt.c(this.f41642c, this.f41645f);
        }
        return this.f41643d;
    }

    private void n() {
        nt.c cVar = this.f41652m;
        if (cVar == null) {
            return;
        }
        if (this.f41647h) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    private View o(int i11, View view, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f41643d.findViewById(zs.g.f128692e);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f41651l) {
            ViewCompat.E0(this.f41645f, new C0659a());
        }
        this.f41645f.removeAllViews();
        if (layoutParams == null) {
            this.f41645f.addView(view);
        } else {
            this.f41645f.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(zs.g.B0).setOnClickListener(new b());
        ViewCompat.p0(this.f41645f, new c());
        this.f41645f.setOnTouchListener(new d());
        return this.f41643d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorJ = j();
        if (!this.f41646g || bottomSheetBehaviorJ.w0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorJ.Y0(5);
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> j() {
        if (this.f41642c == null) {
            i();
        }
        return this.f41642c;
    }

    public boolean k() {
        return this.f41646g;
    }

    void l() {
        this.f41642c.G0(this.f41653n);
    }

    boolean m() {
        if (!this.f41649j) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f41648i = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f41649j = true;
        }
        return this.f41648i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z11 = this.f41651l && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f41643d;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z11);
            }
            CoordinatorLayout coordinatorLayout = this.f41644e;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z11);
            }
            z0.b(window, !z11);
            f fVar = this.f41650k;
            if (fVar != null) {
                fVar.b(window);
            }
        }
        n();
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f41650k;
        if (fVar != null) {
            fVar.b(null);
        }
        nt.c cVar = this.f41652m;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f41642c;
        if (bottomSheetBehavior == null || bottomSheetBehavior.w0() != 5) {
            return;
        }
        this.f41642c.Y0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f41647h != z11) {
            this.f41647h = z11;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f41642c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.Q0(z11);
            }
            if (getWindow() != null) {
                n();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f41647h) {
            this.f41647h = true;
        }
        this.f41648i = z11;
        this.f41649j = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i11) {
        super.setContentView(o(i11, null, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }
}

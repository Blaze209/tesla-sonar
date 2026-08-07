package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class d0 {

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f42323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f42324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f42325d;

        a(boolean z11, boolean z12, boolean z13, d dVar) {
            this.f42322a = z11;
            this.f42323b = z12;
            this.f42324c = z13;
            this.f42325d = dVar;
        }

        @Override // com.google.android.material.internal.d0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull e eVar) {
            if (this.f42322a) {
                eVar.f42331d += windowInsetsCompat.j();
            }
            boolean zM = d0.m(view);
            if (this.f42323b) {
                if (zM) {
                    eVar.f42330c += windowInsetsCompat.k();
                } else {
                    eVar.f42328a += windowInsetsCompat.k();
                }
            }
            if (this.f42324c) {
                if (zM) {
                    eVar.f42328a += windowInsetsCompat.l();
                } else {
                    eVar.f42330c += windowInsetsCompat.l();
                }
            }
            eVar.a(view);
            d dVar = this.f42325d;
            return dVar != null ? dVar.a(view, windowInsetsCompat, eVar) : windowInsetsCompat;
        }
    }

    class b implements androidx.core.view.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f42326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f42327b;

        b(d dVar, e eVar) {
            this.f42326a = dVar;
            this.f42327b = eVar;
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f42326a.a(view, windowInsetsCompat, new e(this.f42327b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, e eVar);
    }

    public static void b(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect c(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i13 = i11 - iArr2[0];
        int i14 = i12 - iArr2[1];
        return new Rect(i13, i14, view2.getWidth() + i13, view2.getHeight() + i14);
    }

    @NonNull
    public static Rect d(@NonNull View view) {
        return e(view, 0);
    }

    @NonNull
    public static Rect e(@NonNull View view, int i11) {
        return new Rect(view.getLeft(), view.getTop() + i11, view.getRight(), view.getBottom() + i11);
    }

    public static void f(@NonNull View view, AttributeSet attributeSet, int i11, int i12, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, zs.m.B3, i11, i12);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(zs.m.C3, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(zs.m.D3, false);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(zs.m.E3, false);
        typedArrayObtainStyledAttributes.recycle();
        g(view, new a(z11, z12, z13, dVar));
    }

    public static void g(@NonNull View view, @NonNull d dVar) {
        ViewCompat.E0(view, new b(dVar, new e(ViewCompat.F(view), view.getPaddingTop(), ViewCompat.E(view), view.getPaddingBottom())));
        q(view);
    }

    public static float h(@NonNull Context context, int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static Integer i(@NonNull View view) {
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager j(@NonNull View view) {
        return (InputMethodManager) androidx.core.content.b.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static float k(@NonNull View view) {
        float fV = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fV += ViewCompat.v((View) parent);
        }
        return fV;
    }

    public static void l(@NonNull View view, boolean z11) {
        WindowInsetsControllerCompat windowInsetsControllerCompatL;
        if (z11 && (windowInsetsControllerCompatL = ViewCompat.L(view)) != null) {
            windowInsetsControllerCompatL.c(WindowInsetsCompat.n.c());
            return;
        }
        InputMethodManager inputMethodManagerJ = j(view);
        if (inputMethodManagerJ != null) {
            inputMethodManagerJ.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean m(View view) {
        return ViewCompat.A(view) == 1;
    }

    public static PorterDuff.Mode n(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void o(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            p(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void p(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void q(@NonNull View view) {
        if (ViewCompat.S(view)) {
            ViewCompat.m0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void r(@NonNull final View view, final boolean z11) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.s(view, z11);
            }
        });
    }

    public static void s(@NonNull View view, boolean z11) {
        WindowInsetsControllerCompat windowInsetsControllerCompatL;
        if (!z11 || (windowInsetsControllerCompatL = ViewCompat.L(view)) == null) {
            j(view).showSoftInput(view, 1);
        } else {
            windowInsetsControllerCompatL.i(WindowInsetsCompat.n.c());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f42328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f42329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f42331d;

        public e(int i11, int i12, int i13, int i14) {
            this.f42328a = i11;
            this.f42329b = i12;
            this.f42330c = i13;
            this.f42331d = i14;
        }

        public void a(View view) {
            ViewCompat.F0(view, this.f42328a, this.f42329b, this.f42330c, this.f42331d);
        }

        public e(@NonNull e eVar) {
            this.f42328a = eVar.f42328a;
            this.f42329b = eVar.f42329b;
            this.f42330c = eVar.f42330c;
            this.f42331d = eVar.f42331d;
        }
    }
}

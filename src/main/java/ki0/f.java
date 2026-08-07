package ki0;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "Ljn0/h0;", "cb", "g", "(Landroid/view/View;Lwn0/l;)V", "", "applyTopInset", "applyBottomInset", "applyLeftInset", "applyRightInset", "c", "(Landroid/view/View;ZZZZ)V", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)V", "a", "Z", "f", "()Z", "supportsCustomNavigationBar", "b", "getSupportsCustomStatusBar", "supportsCustomStatusBar", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f86138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f86139b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ki0/f$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            p013kotlin.jvm.internal.s.k(v11, "v");
            v11.removeOnAttachStateChangeListener(this);
            v11.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            p013kotlin.jvm.internal.s.k(v11, "v");
        }
    }

    static {
        f86138a = Build.VERSION.SDK_INT >= 30;
        f86139b = true;
    }

    public static final void c(final View view, final boolean z11, final boolean z12, final boolean z13, final boolean z14) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        g(view, new wn0.l() { // from class: ki0.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return f.e(view, z13, z11, z14, z12, (WindowInsetsCompat) obj);
            }
        });
    }

    public static /* synthetic */ void d(View view, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        if ((i11 & 8) != 0) {
            z14 = true;
        }
        c(view, z11, z12, z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(View view, boolean z11, boolean z12, boolean z13, boolean z14, WindowInsetsCompat insets) {
        p013kotlin.jvm.internal.s.k(insets, "insets");
        k5.e eVarG = insets.g(WindowInsetsCompat.n.h());
        p013kotlin.jvm.internal.s.j(eVarG, "getInsetsIgnoringVisibility(...)");
        k5.e eVarF = insets.f(WindowInsetsCompat.n.c());
        p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
        int i11 = eVarF.f84927d;
        int paddingTop = eVarG.f84925b;
        int iMax = Integer.max(eVarG.f84927d, i11);
        int paddingLeft = eVarG.f84924a;
        int paddingRight = eVarG.f84926c;
        if (!z11) {
            paddingLeft = view.getPaddingLeft();
        }
        if (!z12) {
            paddingTop = view.getPaddingTop();
        }
        if (!z13) {
            paddingRight = view.getPaddingRight();
        }
        if (!z14) {
            iMax = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, iMax);
        return h0.f84049a;
    }

    public static final boolean f() {
        return f86138a;
    }

    public static final void g(View view, final wn0.l<? super WindowInsetsCompat, h0> cb2) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(cb2, "cb");
        ViewCompat.E0(view, new a0() { // from class: ki0.e
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return f.h(cb2, view2, windowInsetsCompat);
            }
        });
        if (view.isAttachedToWindow()) {
            return;
        }
        i(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat h(wn0.l lVar, View view, WindowInsetsCompat insets) {
        p013kotlin.jvm.internal.s.k(view, "<unused var>");
        p013kotlin.jvm.internal.s.k(insets, "insets");
        lVar.invoke(insets);
        return insets;
    }

    public static final void i(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}

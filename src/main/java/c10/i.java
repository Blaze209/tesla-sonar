package c10;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010\"\u0015\u0010\u0014\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroid/view/View;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)V", "Landroid/graphics/Rect;", "rect", "a", "(Landroid/view/View;Landroid/graphics/Rect;)V", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "isStatusBarTranslucent", "active", "c", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;ZZ)Landroidx/core/view/WindowInsetsCompat;", "", "[I", "tmpIntArr", "b", "(Landroid/view/View;)[I", "screenLocation", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18569a = new int[2];

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"c10/i$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            s.k(v11, "v");
            v11.removeOnAttachStateChangeListener(this);
            v11.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            s.k(v11, "v");
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final void a(View view, Rect rect) {
        s.k(view, "<this>");
        s.k(rect, "rect");
        if (!view.isAttachedToWindow()) {
            g10.a.d(g10.a.f67023a, "View.copyBoundsInWindow", "Can not copy bounds as view is not attached to window", null, 4, null);
            return;
        }
        rect.set(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = f18569a;
        view.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public static final int[] b(View view) {
        s.k(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final WindowInsetsCompat c(View view, WindowInsetsCompat insets, boolean z11, boolean z12) {
        s.k(view, "<this>");
        s.k(insets, "insets");
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsetsCompat windowInsetsCompatB0 = ViewCompat.b0(view, insets);
            s.j(windowInsetsCompatB0, "onApplyWindowInsets(...)");
            WindowInsetsCompat windowInsetsCompatR = windowInsetsCompatB0.r(windowInsetsCompatB0.k(), z11 ? 0 : windowInsetsCompatB0.m(), windowInsetsCompatB0.l(), windowInsetsCompatB0.j());
            s.j(windowInsetsCompatR, "replaceSystemWindowInsets(...)");
            return windowInsetsCompatR;
        }
        k5.e eVarF = insets.f(WindowInsetsCompat.n.h());
        s.j(eVarF, "getInsets(...)");
        k5.e eVarF2 = insets.f(WindowInsetsCompat.n.f());
        s.j(eVarF2, "getInsets(...)");
        k5.e eVarF3 = insets.f(WindowInsetsCompat.n.c());
        s.j(eVarF3, "getInsets(...)");
        int i11 = z11 ? 0 : eVarF.f84925b;
        int i12 = eVarF3.f84927d;
        if (i12 <= 0) {
            i12 = eVarF2.f84927d;
        }
        WindowInsetsCompat.a aVar = new WindowInsetsCompat.a(insets);
        int iH = WindowInsetsCompat.n.h();
        int i13 = eVarF.f84924a;
        int i14 = eVarF.f84926c;
        if (z12) {
            i12 = eVarF.f84927d;
        }
        WindowInsetsCompat windowInsetsCompatA = aVar.b(iH, k5.e.c(i13, i11, i14, i12)).a();
        s.j(windowInsetsCompatA, "build(...)");
        WindowInsetsCompat windowInsetsCompatB1 = ViewCompat.b0(view, windowInsetsCompatA);
        s.j(windowInsetsCompatB1, "onApplyWindowInsets(...)");
        return windowInsetsCompatB1;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final void d(View view) {
        s.k(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}

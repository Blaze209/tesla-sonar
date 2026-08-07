package n2;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.s1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "Lb4/j;", DateTokenConverter.CONVERTER_KEY, "(Lu1/j;ZFLk3/s1;Lwn0/a;)Lb4/j;", "Landroid/view/ViewGroup;", "view", "Ln2/g;", "c", "(Landroid/view/ViewGroup;)Ln2/g;", "Landroid/view/View;", "initialView", "e", "(Landroid/view/View;)Landroid/view/ViewGroup;", "a", "Z", "IsRunningInPreview", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f92722a = s.f(Build.DEVICE, "layoutlib");

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof g) {
                return (g) childAt;
            }
        }
        g gVar = new g(viewGroup.getContext());
        viewGroup.addView(gVar);
        return gVar;
    }

    public static final b4.j d(u1.j jVar, boolean z11, float f11, s1 s1Var, wn0.a<RippleAlpha> aVar) {
        return f92722a ? new androidx.compose.material.ripple.c(jVar, z11, f11, s1Var, aVar, null) : new androidx.compose.material.ripple.b(jVar, z11, f11, s1Var, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}

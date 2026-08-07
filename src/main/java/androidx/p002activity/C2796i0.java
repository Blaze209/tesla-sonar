package androidx.p002activity;

import android.view.View;
import c6.b;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: androidx.activity.i0, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/e0;", "onBackPressedDispatcherOwner", "Ljn0/h0;", "b", "(Landroid/view/View;Landroidx/activity/e0;)V", "a", "(Landroid/view/View;)Landroidx/activity/e0;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C2796i0 {
    public static final e0 a(View view) {
        s.k(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(f0.f1897b);
            e0 e0Var = tag instanceof e0 ? (e0) tag : null;
            if (e0Var != null) {
                return e0Var;
            }
            Object objA = b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, e0 onBackPressedDispatcherOwner) {
        s.k(view, "<this>");
        s.k(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(f0.f1897b, onBackPressedDispatcherOwner);
    }
}

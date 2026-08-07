package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb4/g0;", "container", "Lr2/q;", "parent", "Lr2/t2;", "a", "(Lb4/g0;Lr2/q;)Lr2/t2;", "Landroidx/compose/ui/platform/a;", "Lkotlin/Function0;", "Ljn0/h0;", "content", "Lr2/p;", "c", "(Landroidx/compose/ui/platform/a;Lr2/q;Lwn0/p;)Lr2/p;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;Lr2/q;Lwn0/p;)Lr2/p;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f5980a = new ViewGroup.LayoutParams(-2, -2);

    public static final p020r2.t2 a(b4.g0 g0Var, p020r2.q qVar) {
        return p020r2.t.b(new b4.a2(g0Var), qVar);
    }

    private static final p020r2.p b(AndroidComposeView androidComposeView, p020r2.q qVar, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
        if (o1.b() && androidComposeView.getTag(d3.h.K) == null) {
            androidComposeView.setTag(d3.h.K, Collections.newSetFromMap(new WeakHashMap()));
        }
        p020r2.p pVarA = p020r2.t.a(new b4.a2(androidComposeView.getRoot()), qVar);
        Object tag = androidComposeView.getView().getTag(d3.h.L);
        s3 s3Var = tag instanceof s3 ? (s3) tag : null;
        if (s3Var == null) {
            s3Var = new s3(androidComposeView, pVarA);
            androidComposeView.getView().setTag(d3.h.L, s3Var);
        }
        s3Var.d(pVar);
        if (!p013kotlin.jvm.internal.s.f(androidComposeView.getCoroutineContext(), qVar.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(qVar.getEffectCoroutineContext());
        }
        return s3Var;
    }

    public static final p020r2.p c(a aVar, p020r2.q qVar, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
        i1.f5757a.b();
        AndroidComposeView androidComposeView = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(aVar.getContext(), qVar.getEffectCoroutineContext());
            aVar.addView(androidComposeView.getView(), f5980a);
        }
        return b(androidComposeView, qVar, pVar);
    }
}

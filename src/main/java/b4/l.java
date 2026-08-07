package b4;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb4/j;", "Landroid/view/View;", "a", "(Lb4/j;)Landroid/view/View;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final View a(j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            y3.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = k0.b(k.m(jVar));
        p013kotlin.jvm.internal.s.i(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}

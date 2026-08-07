package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/d$c;", "Lb4/e1;", "T", "Lkotlin/Function0;", "Ljn0/h0;", "block", "a", "(Landroidx/compose/ui/d$c;Lwn0/a;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f1 {
    public static final <T extends androidx.compose.ui.d.c & e1> void a(T t11, wn0.a<jn0.h0> aVar) {
        g1 ownerScope = t11.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new g1(t11);
            t11.s2(ownerScope);
        }
        k.n(t11).getSnapshotObserver().i(ownerScope, g1.INSTANCE.a(), aVar);
    }
}

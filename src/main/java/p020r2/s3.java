package p020r2;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import p013kotlin.Metadata;
import p013kotlin.collections.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "value", "Lr2/m3;", "policy", "Lr2/p1;", "c", "(Ljava/lang/Object;Lr2/m3;)Lr2/p1;", "Landroidx/compose/runtime/snapshots/k;", "a", "()Landroidx/compose/runtime/snapshots/k;", "", "elements", "b", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/k;", "newValue", "Lr2/y3;", "e", "(Ljava/lang/Object;Lr2/l;I)Lr2/y3;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class s3 {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> b(T... tArr) {
        SnapshotStateList<T> kVar = new SnapshotStateList<>();
        kVar.addAll(n.w1(tArr));
        return kVar;
    }

    public static final <T> p1<T> c(T t11, m3<T> m3Var) {
        return b.d(t11, m3Var);
    }

    public static /* synthetic */ p1 d(Object obj, m3 m3Var, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            m3Var = n3.q();
        }
        return n3.h(obj, m3Var);
    }

    public static final <T> y3<T> e(T t11, l lVar, int i11) {
        if (o.J()) {
            o.S(-1058319986, i11, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = d(t11, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        p1Var.setValue(t11);
        if (o.J()) {
            o.R();
        }
        return p1Var;
    }
}

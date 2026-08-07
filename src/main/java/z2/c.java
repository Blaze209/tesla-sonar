package z2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.i2;
import p020r2.j2;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"", "bits", "slot", "a", "(II)I", "g", "(I)I", DateTokenConverter.CONVERTER_KEY, "Lr2/i2;", "other", "", "f", "(Lr2/i2;Lr2/i2;)Z", "Lr2/l;", "composer", Action.KEY_ATTRIBUTE, "tracked", "", "block", "Lz2/a;", "b", "(Lr2/l;IZLjava/lang/Object;)Lz2/a;", "c", "(IZLjava/lang/Object;)Lz2/a;", "e", "(IZLjava/lang/Object;Lr2/l;I)Lz2/a;", "Ljava/lang/Object;", "lambdaKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f126547a = new Object();

    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    public static final a b(l lVar, int i11, boolean z11, Object obj) {
        b bVar;
        lVar.M(Integer.rotateLeft(i11, 1), f126547a);
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            bVar = new b(i11, z11, obj);
            lVar.B(bVar);
        } else {
            s.i(objI, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) objI;
            bVar.r(obj);
        }
        lVar.S();
        return bVar;
    }

    public static final a c(int i11, boolean z11, Object obj) {
        return new b(i11, z11, obj);
    }

    public static final int d(int i11) {
        return a(2, i11);
    }

    public static final a e(int i11, boolean z11, Object obj, l lVar, int i12) {
        if (o.J()) {
            o.S(-1573003438, i12, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = new b(i11, z11, obj);
            lVar.B(objI);
        }
        b bVar = (b) objI;
        bVar.r(obj);
        if (o.J()) {
            o.R();
        }
        return bVar;
    }

    public static final boolean f(i2 i2Var, i2 i2Var2) {
        if (i2Var == null) {
            return true;
        }
        if (!(i2Var instanceof j2) || !(i2Var2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) i2Var;
        return !j2Var.r() || s.f(i2Var, i2Var2) || s.f(j2Var.getAnchor(), ((j2) i2Var2).getAnchor());
    }

    public static final int g(int i11) {
        return a(1, i11);
    }
}

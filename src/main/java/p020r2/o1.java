package p020r2;

import androidx.collection.k0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import vn0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u001d"}, d2 = {"Lr2/o1;", "K", "", "V", "Landroidx/collection/k0;", "map", "b", "(Landroidx/collection/k0;)Landroidx/collection/k0;", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "f", "(Landroidx/collection/k0;Ljava/lang/Object;Ljava/lang/Object;)V", "e", "(Landroidx/collection/k0;Ljava/lang/Object;)Ljava/lang/Object;", "", "g", "(Landroidx/collection/k0;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/collection/k0;)I", "other", "", "c", "(Landroidx/collection/k0;Ljava/lang/Object;)Z", "a", "Landroidx/collection/k0;", "getMap", "()Landroidx/collection/k0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b
final class o1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0<K, Object> map;

    private /* synthetic */ o1(k0 k0Var) {
        this.map = k0Var;
    }

    public static final /* synthetic */ o1 a(k0 k0Var) {
        return new o1(k0Var);
    }

    public static boolean c(k0<K, Object> k0Var, Object obj) {
        return (obj instanceof o1) && s.f(k0Var, ((o1) obj).getMap());
    }

    public static int d(k0<K, Object> k0Var) {
        return k0Var.hashCode();
    }

    public static final V e(k0<K, Object> k0Var, K k11) {
        V v11 = (V) k0Var.c(k11);
        if (v11 == null) {
            return null;
        }
        if (u0.p(v11)) {
            List listC = u0.c(v11);
            Object objRemove = listC.remove(0);
            if (listC.isEmpty()) {
                k0Var.p(k11);
            }
            v11 = (V) objRemove;
        } else {
            k0Var.p(k11);
        }
        s.i(v11, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return v11;
    }

    public static final void f(k0<K, Object> k0Var, K k11, V v11) {
        int iL = k0Var.l(k11);
        boolean z11 = iL < 0;
        Object obj = z11 ? null : k0Var.values[iL];
        if (obj != null) {
            if (u0.p(obj)) {
                s.i(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listC = u0.c(obj);
                listC.add(v11);
                v11 = (V) listC;
            } else {
                v11 = (V) v.s(obj, v11);
            }
        }
        if (!z11) {
            k0Var.values[iL] = v11;
            return;
        }
        int i11 = ~iL;
        k0Var.keys[i11] = k11;
        k0Var.values[i11] = v11;
    }

    public static String g(k0<K, Object> k0Var) {
        return "MutableScatterMultiMap(map=" + k0Var + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.map, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ k0 getMap() {
        return this.map;
    }

    public int hashCode() {
        return d(this.map);
    }

    public String toString() {
        return g(this.map);
    }

    public static <K, V> k0<K, Object> b(k0<K, Object> k0Var) {
        return k0Var;
    }
}

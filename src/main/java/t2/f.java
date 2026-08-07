package t2;

import androidx.collection.k0;
import androidx.collection.l0;
import androidx.collection.u0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00168\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lt2/f;", "", "Key", "Scope", "<init>", "()V", Action.KEY_ATTRIBUTE, "scope", "Ljn0/h0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "h", "element", "", "c", "(Ljava/lang/Object;)Z", "b", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)V", "Landroidx/collection/k0;", "Landroidx/collection/k0;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/collection/k0;", "map", "", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<Key, Scope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0<Object, Object> map = u0.d();

    public final void a(Key key, Scope scope) {
        k0<Object, Object> k0Var = this.map;
        int iL = k0Var.l(key);
        boolean z11 = iL < 0;
        Object obj = z11 ? null : k0Var.values[iL];
        if (obj != null) {
            if (obj instanceof l0) {
                s.i(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((l0) obj).h(scope);
            } else if (obj != scope) {
                l0 l0Var = new l0(0, 1, null);
                s.i(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                l0Var.h(obj);
                l0Var.h(scope);
                scope = (Scope) l0Var;
            }
            scope = (Scope) obj;
        }
        if (!z11) {
            k0Var.values[iL] = scope;
            return;
        }
        int i11 = ~iL;
        k0Var.keys[i11] = key;
        k0Var.values[i11] = scope;
    }

    public final void b() {
        this.map.i();
    }

    public final boolean c(Key element) {
        return this.map.b(element);
    }

    public final k0<Object, Object> d() {
        return this.map;
    }

    public final int e() {
        return this.map.get_size();
    }

    public final boolean f(Key key, Scope scope) {
        Object objC = this.map.c(key);
        if (objC == null) {
            return false;
        }
        if (!(objC instanceof l0)) {
            if (!s.f(objC, scope)) {
                return false;
            }
            this.map.p(key);
            return true;
        }
        l0 l0Var = (l0) objC;
        boolean zX = l0Var.x(scope);
        if (zX && l0Var.d()) {
            this.map.p(key);
        }
        return zX;
    }

    public final void g(Scope scope) {
        boolean zD;
        k0<Object, Object> k0Var = this.map;
        long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = k0Var.keys[i14];
                        Object obj2 = k0Var.values[i14];
                        if (obj2 instanceof l0) {
                            s.i(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            l0 l0Var = (l0) obj2;
                            l0Var.x(scope);
                            zD = l0Var.d();
                        } else {
                            zD = obj2 == scope;
                        }
                        if (zD) {
                            k0Var.q(i14);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void h(Key key, Scope value) {
        this.map.s(key, value);
    }
}

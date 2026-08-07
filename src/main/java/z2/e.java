package z2;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p020r2.e4;
import p020r2.u;
import p020r2.y;
import p020r2.z1;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0017\u000eB3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lz2/e;", "Lw2/d;", "Lr2/u;", "", "Lr2/e4;", "Lr2/z1;", "Lw2/t;", "node", "", "size", "<init>", "(Lw2/t;I)V", "T", Action.KEY_ATTRIBUTE, "b", "(Lr2/u;)Ljava/lang/Object;", "value", "f", "(Lr2/u;Lr2/e4;)Lr2/z1;", "Lz2/e$a;", "w", "()Lz2/e$a;", "g", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends w2.d<u<Object>, e4<Object>> implements z1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e f126550h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lz2/e$a;", "Lw2/f;", "Lr2/u;", "", "Lr2/e4;", "Lr2/z1$a;", "Lz2/e;", "map", "<init>", "(Lz2/e;)V", "m", "()Lz2/e;", "g", "Lz2/e;", "getMap$runtime_release", "setMap$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w2.f<u<Object>, e4<Object>> implements z1.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private e map;

        public a(e eVar) {
            super(eVar);
            this.map = eVar;
        }

        @Override // w2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof u) {
                return n((u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof e4) {
                return o((e4) obj);
            }
            return false;
        }

        @Override // w2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof u) {
                return p((u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof u) ? obj2 : q((u) obj, (e4) obj2);
        }

        @Override // r2.z1.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public e build() {
            e eVar;
            if (e() == this.map.r()) {
                eVar = this.map;
            } else {
                k(new y2.e());
                eVar = new e(e(), size());
            }
            this.map = eVar;
            return eVar;
        }

        public /* bridge */ boolean n(u<Object> uVar) {
            return super.containsKey(uVar);
        }

        public /* bridge */ boolean o(e4<Object> e4Var) {
            return super.containsValue(e4Var);
        }

        public /* bridge */ e4<Object> p(u<Object> uVar) {
            return (e4) super.get(uVar);
        }

        public /* bridge */ e4<Object> q(u<Object> uVar, e4<Object> e4Var) {
            return (e4) super.getOrDefault(uVar, e4Var);
        }

        public /* bridge */ e4<Object> r(u<Object> uVar) {
            return (e4) super.remove(uVar);
        }

        @Override // w2.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof u) {
                return r((u) obj);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: z2.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz2/e$b;", "", "<init>", "()V", "Lz2/e;", "Empty", "Lz2/e;", "a", "()Lz2/e;", "getEmpty$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f126550h;
        }

        private Companion() {
        }
    }

    static {
        t tVarA = t.INSTANCE.a();
        s.i(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f126550h = new e(tVarA, 0);
    }

    public e(t<u<Object>, e4<Object>> tVar, int i11) {
        super(tVar, i11);
    }

    public /* bridge */ e4<Object> A(u<Object> uVar, e4<Object> e4Var) {
        return (e4) super.getOrDefault(uVar, e4Var);
    }

    @Override // p020r2.x
    public <T> T b(u<T> key) {
        return (T) y.b(this, key);
    }

    @Override // w2.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u) {
            return x((u) obj);
        }
        return false;
    }

    @Override // p013kotlin.collections.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof e4) {
            return y((e4) obj);
        }
        return false;
    }

    @Override // p020r2.z1
    public z1 f(u<Object> key, e4<Object> value) {
        t.b<u<Object>, e4<Object>> bVarP = r().P(key.hashCode(), key, value, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    @Override // w2.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof u) {
            return z((u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof u) ? obj2 : A((u) obj, (e4) obj2);
    }

    @Override // p020r2.z1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    public /* bridge */ boolean x(u<Object> uVar) {
        return super.containsKey(uVar);
    }

    public /* bridge */ boolean y(e4<Object> e4Var) {
        return super.containsValue(e4Var);
    }

    public /* bridge */ e4<Object> z(u<Object> uVar) {
        return (e4) super.get(uVar);
    }
}

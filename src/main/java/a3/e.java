package a3;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.h2;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0002\u001a\u0012B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0016R\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"La3/e;", "La3/d;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "h", "()Ljava/util/Map;", Action.KEY_ATTRIBUTE, "Lkotlin/Function0;", "Ljn0/h0;", "content", "e", "(Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "La3/e$d;", "b", "registryHolders", "La3/g;", "c", "La3/g;", "g", "()La3/g;", IntegerTokenConverter.CONVERTER_KEY, "(La3/g;)V", "parentSaveableStateRegistry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements a3.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j<e, ?> f73e = k.a(a.f77c, b.f78c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, d> registryHolders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g parentSaveableStateRegistry;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"La3/l;", "La3/e;", "it", "", "", "", "", "", "a", "(La3/l;La3/e;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, e, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f77c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(l lVar, e eVar) {
            return eVar.h();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "La3/e;", "a", "(Ljava/util/Map;)La3/e;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Map<Object, Map<String, ? extends List<? extends Object>>>, e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f78c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(Map<Object, Map<String, List<Object>>> map) {
            return new e(map);
        }
    }

    /* JADX INFO: renamed from: a3.e$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La3/e$c;", "", "<init>", "()V", "La3/j;", "La3/e;", "Saver", "La3/j;", "a", "()La3/j;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<e, ?> a() {
            return e.f73e;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"La3/e$d;", "", Action.KEY_ATTRIBUTE, "<init>", "(La3/e;Ljava/lang/Object;)V", "", "", "", "", "map", "Ljn0/h0;", "b", "(Ljava/util/Map;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "Z", "getShouldSave", "()Z", "c", "(Z)V", "shouldSave", "La3/g;", "La3/g;", "()La3/g;", "registry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldSave = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final g registry;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends u implements wn0.l<Object, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f83c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f83c = eVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.l
            public final Boolean invoke(Object obj) {
                g parentSaveableStateRegistry = this.f83c.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.key = obj;
            this.registry = i.a((Map) e.this.savedStates.get(obj), new a(e.this));
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getRegistry() {
            return this.registry;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> mapC = this.registry.c();
                if (mapC.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, mapC);
                }
            }
        }

        public final void c(boolean z11) {
            this.shouldSave = z11;
        }
    }

    /* JADX INFO: renamed from: a3.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class C0006e extends u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f85d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f86e;

        /* JADX INFO: renamed from: a3.e$e$a */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"a3/e$e$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f87a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f88b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f89c;

            public a(d dVar, e eVar, Object obj) {
                this.f87a = dVar;
                this.f88b = eVar;
                this.f89c = obj;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f87a.b(this.f88b.savedStates);
                this.f88b.registryHolders.remove(this.f89c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0006e(Object obj, d dVar) {
            super(1);
            this.f85d = obj;
            this.f86e = dVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            boolean zContainsKey = e.this.registryHolders.containsKey(this.f85d);
            Object obj = this.f85d;
            if (!zContainsKey) {
                e.this.savedStates.remove(this.f85d);
                e.this.registryHolders.put(this.f85d, this.f86e);
                return new a(this.f86e, e.this, this.f85d);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f91d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f92e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f93f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f91d = obj;
            this.f92e = pVar;
            this.f93f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            e.this.e(this.f91d, this.f92e, lVar, k2.a(this.f93f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> mapD = v0.D(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(mapD);
        }
        if (mapD.isEmpty()) {
            return null;
        }
        return mapD;
    }

    @Override // a3.d
    public void d(Object key) {
        d dVar = this.registryHolders.get(key);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    @Override // a3.d
    public void e(Object obj, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1198538093);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(this) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1198538093, i12, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            lVarV.i(EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, obj);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                g gVar = this.parentSaveableStateRegistry;
                if (!(gVar != null ? gVar.a(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objI = new d(obj);
                lVarV.B(objI);
            }
            d dVar = (d) objI;
            w.a(i.d().d(dVar.getRegistry()), pVar, lVarV, (i12 & 112) | h2.f106566i);
            h0 h0Var = h0.f84049a;
            boolean zK = lVarV.K(this) | lVarV.K(obj) | lVarV.K(dVar);
            Object objI2 = lVarV.I();
            if (zK || objI2 == companion.a()) {
                objI2 = new C0006e(obj, dVar);
                lVarV.B(objI2);
            }
            Function0.c(h0Var, (wn0.l) objI2, lVarV, 6);
            lVarV.G();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(obj, pVar, i11));
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void i(g gVar) {
        this.parentSaveableStateRegistry = gVar;
    }

    public e(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ e(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map);
    }
}

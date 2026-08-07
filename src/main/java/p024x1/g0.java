package p024x1;

import a3.g;
import a3.i;
import a3.j;
import a3.k;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R/\u0010(\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*¨\u0006,"}, d2 = {"Lx1/g0;", "La3/g;", "La3/d;", "wrappedRegistry", "<init>", "(La3/g;)V", "parentRegistry", "", "", "", "", "restoredValues", "(La3/g;Ljava/util/Map;)V", "value", "", "a", "(Ljava/lang/Object;)Z", Action.KEY_ATTRIBUTE, "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "La3/g$a;", "b", "(Ljava/lang/String;Lwn0/a;)La3/g$a;", "c", "()Ljava/util/Map;", "Ljn0/h0;", "content", "e", "(Ljava/lang/Object;Lwn0/p;Lr2/l;I)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "La3/g;", "<set-?>", "Lr2/p1;", "h", "()La3/d;", IntegerTokenConverter.CONVERTER_KEY, "(La3/d;)V", "wrappedHolder", "", "Ljava/util/Set;", "previouslyComposedKeys", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g0 implements g, a3.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g wrappedRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 wrappedHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<Object> previouslyComposedKeys;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements l<Object, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f122594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.f122594c = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.l
        public final Boolean invoke(Object obj) {
            g gVar = this.f122594c;
            return Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
        }
    }

    /* JADX INFO: renamed from: x1.g0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lx1/g0$b;", "", "<init>", "()V", "La3/g;", "parentRegistry", "La3/j;", "Lx1/g0;", "", "", "", "a", "(La3/g;)La3/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: x1.g0$b$a */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La3/l;", "Lx1/g0;", "it", "", "", "", "", "a", "(La3/l;Lx1/g0;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<a3.l, g0, Map<String, ? extends List<? extends Object>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f122595c = new a();

            a() {
                super(2);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, List<Object>> invoke(a3.l lVar, g0 g0Var) {
                Map<String, List<Object>> mapC = g0Var.c();
                if (mapC.isEmpty()) {
                    return null;
                }
                return mapC;
            }
        }

        /* JADX INFO: renamed from: x1.g0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "restored", "Lx1/g0;", "a", "(Ljava/util/Map;)Lx1/g0;"}, k = 3, mv = {1, 8, 0})
        static final class C2636b extends u implements l<Map<String, ? extends List<? extends Object>>, g0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f122596c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2636b(g gVar) {
                super(1);
                this.f122596c = gVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(Map<String, ? extends List<? extends Object>> map) {
                return new g0(this.f122596c, map);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<g0, Map<String, List<Object>>> a(g parentRegistry) {
            return k.a(a.f122595c, new C2636b(parentRegistry));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f122598d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x1/g0$c$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g0 f122599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f122600b;

            public a(g0 g0Var, Object obj) {
                this.f122599a = g0Var;
                this.f122600b = obj;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f122599a.previouslyComposedKeys.add(this.f122600b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f122598d = obj;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            g0.this.previouslyComposedKeys.remove(this.f122598d);
            return new a(g0.this, this.f122598d);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f122602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f122603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f122604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f122602d = obj;
            this.f122603e = pVar;
            this.f122604f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            g0.this.e(this.f122602d, this.f122603e, lVar, k2.a(this.f122604f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public g0(g gVar) {
        this.wrappedRegistry = gVar;
        this.wrappedHolder = s3.d(null, null, 2, null);
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Override // a3.g
    public boolean a(Object value) {
        return this.wrappedRegistry.a(value);
    }

    @Override // a3.g
    public g.a b(String key, wn0.a<? extends Object> valueProvider) {
        return this.wrappedRegistry.b(key, valueProvider);
    }

    @Override // a3.g
    public Map<String, List<Object>> c() {
        a3.d dVarH = h();
        if (dVarH != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                dVarH.d(it.next());
            }
        }
        return this.wrappedRegistry.c();
    }

    @Override // a3.d
    public void d(Object key) {
        a3.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        dVarH.d(key);
    }

    @Override // a3.d
    public void e(Object obj, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-697180401);
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
                o.S(-697180401, i12, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            a3.d dVarH = h();
            if (dVarH == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i13 = i12 & 14;
            dVarH.e(obj, pVar, lVarV, i12 & 126);
            boolean zK = lVarV.K(this) | lVarV.K(obj);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new c(obj);
                lVarV.B(objI);
            }
            Function0.c(obj, (l) objI, lVarV, i13);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(obj, pVar, i11));
        }
    }

    @Override // a3.g
    public Object f(String key) {
        return this.wrappedRegistry.f(key);
    }

    public final a3.d h() {
        return (a3.d) this.wrappedHolder.getValue();
    }

    public final void i(a3.d dVar) {
        this.wrappedHolder.setValue(dVar);
    }

    public g0(g gVar, Map<String, ? extends List<? extends Object>> map) {
        this(i.a(map, new a(gVar)));
    }
}

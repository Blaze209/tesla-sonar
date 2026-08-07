package ok0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import dl0.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import rk0.f;
import tk0.i;
import tk0.j;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\r\u001a\u00020\u000b\"\b\b\u0001\u0010\u0006*\u00020\u0003\"\b\b\u0002\u0010\u0007*\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010!\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR.\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b$\u0010.\"\u0004\b/\u00100R\"\u00103\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010-\u001a\u0004\b,\u0010.\"\u0004\b2\u00100R\"\u00105\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010-\u001a\u0004\b\"\u0010.\"\u0004\b4\u00100R\"\u00107\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b \u0010.\"\u0004\b6\u00100¨\u00068"}, d2 = {"Lok0/b;", "Lrk0/f;", "T", "", "<init>", "()V", "TBuilder", "TPlugin", "Ltk0/i;", "plugin", "Lkotlin/Function1;", "Ljn0/h0;", "configure", "h", "(Ltk0/i;Lwn0/l;)V", "", Action.KEY_ATTRIBUTE, "Lok0/a;", "block", "f", "(Ljava/lang/String;Lwn0/l;)V", "client", "g", "(Lok0/a;)V", "other", "j", "(Lok0/b;)V", "", "Ldl0/a;", "a", "Ljava/util/Map;", "plugins", "b", "pluginConfigurations", "c", "customInterceptors", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "getEngineConfig$ktor_client_core", "()Lwn0/l;", "setEngineConfig$ktor_client_core", "(Lwn0/l;)V", "engineConfig", "", "e", "Z", "()Z", "setFollowRedirects", "(Z)V", "followRedirects", "setUseDefaultTransformers", "useDefaultTransformers", "setExpectSuccess", "expectSuccess", "setDevelopmentMode", "developmentMode", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T extends f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean expectSuccess;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<dl0.a<?>, l<ok0.a, h0>> plugins = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<dl0.a<?>, l<Object, h0>> pluginConfigurations = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, l<ok0.a, h0>> customInterceptors = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private l<? super T, h0> engineConfig = a.f97897c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean followRedirects = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean useDefaultTransformers = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean developmentMode = t.f60776a.b();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrk0/f;", "T", "Ljn0/h0;", "a", "(Lrk0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<T, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f97897c = new a();

        a() {
            super(1);
        }

        public final void a(T t11) {
            s.k(t11, "$this$null");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            a((f) obj);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: ok0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "Lrk0/f;", "T", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class C2106b extends u implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2106b f97898c = new C2106b();

        C2106b() {
            super(1);
        }

        public final void b(Object obj) {
            s.k(obj, "$this$null");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: wn0.l<TBuilder, jn0.h0> */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "Lrk0/f;", "T", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Object, h0> f97899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<TBuilder, h0> f97900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: wn0.l<? super TBuilder, jn0.h0> */
        c(l<Object, h0> lVar, l<? super TBuilder, h0> lVar2) {
            super(1);
            this.f97899c = lVar;
            this.f97900d = lVar2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void b(Object obj) {
            s.k(obj, "$this$null");
            l<Object, h0> lVar = this.f97899c;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.f97900d.invoke((TBuilder) obj);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: tk0.i<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: tk0.i<TBuilder, TPlugin> */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "TBuilder", "TPlugin", "Lrk0/f;", "T", "Lok0/a;", "scope", "Ljn0/h0;", "a", "(Lok0/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<ok0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<TBuilder, TPlugin> f97901c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "Lrk0/f;", "T", "Ldl0/b;", "b", "()Ldl0/b;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<dl0.b> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f97902c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final dl0.b invoke() {
                return dl0.d.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: tk0.i<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: tk0.i<? extends TBuilder, TPlugin> */
        d(i<? extends TBuilder, TPlugin> iVar) {
            super(1);
            this.f97901c = iVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(ok0.a scope) {
            s.k(scope, "scope");
            dl0.b bVar = (dl0.b) scope.getAttributes().g(j.a(), a.f97902c);
            Object obj = ((b) scope.n()).pluginConfigurations.get(this.f97901c.getKey());
            s.h(obj);
            Object objA = this.f97901c.a((l<? super TBuilder, h0>) ((l) obj));
            this.f97901c.b((TPlugin) objA, scope);
            bVar.c(this.f97901c.getKey(), objA);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ok0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public static /* synthetic */ void i(b bVar, i iVar, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = C2106b.f97898c;
        }
        bVar.h(iVar, lVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final void f(String key, l<? super ok0.a, h0> block) {
        s.k(key, "key");
        s.k(block, "block");
        this.customInterceptors.put(key, block);
    }

    public final void g(ok0.a client) {
        s.k(client, "client");
        Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(client);
        }
    }

    public final <TBuilder, TPlugin> void h(i<? extends TBuilder, TPlugin> plugin, l<? super TBuilder, h0> configure) {
        s.k(plugin, "plugin");
        s.k(configure, "configure");
        this.pluginConfigurations.put(plugin.getKey(), new c(this.pluginConfigurations.get(plugin.getKey()), configure));
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new d(plugin));
    }

    public final void j(b<? extends T> other) {
        s.k(other, "other");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }
}

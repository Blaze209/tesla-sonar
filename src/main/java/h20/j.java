package h20;

import android.content.Context;
import androidx.core.util.Consumer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020>8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\b2\u0010L\"\u0004\bM\u0010NR\"\u0010U\u001a\u00020O8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010R\"\u0004\bS\u0010TR\"\u0010[\u001a\u00020V8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\bE\u0010W\u001a\u0004\b*\u0010X\"\u0004\bY\u0010ZR\"\u0010a\u001a\u00020\\8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010]\u001a\u0004\bJ\u0010^\"\u0004\b_\u0010`R\"\u0010g\u001a\u00020b8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0015\u0010c\u001a\u0004\b-\u0010d\"\u0004\be\u0010fR0\u0010m\u001a\b\u0012\u0004\u0012\u00020i0h2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001b\u0010k\u001a\u0004\bC\u0010lR\u0014\u0010p\u001a\u00020n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010o¨\u0006q"}, d2 = {"Lh20/j;", "Lh20/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "namespace", "Lk20/e;", "networkConfiguration", "", "Lk20/a;", "configurations", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lk20/e;Ljava/util/List;)V", "Ljn0/h0;", "r", "(Ljava/util/List;)V", "B", "()V", "u", "t", "Lh20/l;", "o", "()Lh20/l;", "Lz10/c;", "n", "()Lz10/c;", "Lh20/o;", "p", "()Lh20/o;", "Lh20/p;", "q", "()Lh20/p;", "s", "h", "g", "a", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Landroid/content/Context;", "c", "Lh20/o;", "tracker", DateTokenConverter.CONVERTER_KEY, "Lz10/c;", "emitter", "Lh20/l;", "subject", "f", "Lh20/p;", "trackerController", "Ly10/a;", "Lkotlin/Lazy;", "getEcommerceController", "()Ly10/a;", "ecommerceController", "Lh20/i;", "getPluginsController", "()Lh20/i;", "pluginsController", "", "getMediaController", "()Ljava/lang/Object;", "mediaController", "Lk20/q;", "j", "Lk20/q;", "m", "()Lk20/q;", "A", "(Lk20/q;)V", "trackerConfiguration", "k", "Lk20/e;", "()Lk20/e;", "x", "(Lk20/e;)V", "Lk20/p;", "l", "Lk20/p;", "()Lk20/p;", "z", "(Lk20/p;)V", "subjectConfiguration", "Lk20/b;", "Lk20/b;", "()Lk20/b;", "v", "(Lk20/b;)V", "emitterConfiguration", "Lk20/o;", "Lk20/o;", "()Lk20/o;", "y", "(Lk20/o;)V", "sessionConfiguration", "Lk20/c;", "Lk20/c;", "()Lk20/c;", "w", "(Lk20/c;)V", "gdprConfiguration", "", "Lk20/n;", "<set-?>", "Ljava/util/List;", "()Ljava/util/List;", "pluginConfigurations", "", "()Z", "isTrackerInitialized", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private o tracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private z10.c emitter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l subject;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p trackerController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy ecommerceController;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy pluginsController;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy mediaController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public k20.q trackerConfiguration;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public k20.e networkConfiguration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public k20.p subjectConfiguration;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public k20.b emitterConfiguration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public k20.o sessionConfiguration;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public k20.c gdprConfiguration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private List<k20.n> pluginConfigurations;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly10/a;", "b", "()Ly10/a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<y10.a> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y10.a invoke() {
            return new y10.a(j.this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz10/c;", "emitter", "Ljn0/h0;", "a", "(Lz10/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<z10.c, h0> {
        b() {
            super(1);
        }

        public final void a(z10.c emitter) {
            s.k(emitter, "emitter");
            emitter.A(j.this.f().c());
            q20.g gVarG = j.this.f().g();
            if (gVarG != null) {
                emitter.G(gVarG);
            }
            emitter.D(j.this.f().d());
            emitter.w(j.this.f().a());
            emitter.u(j.this.f().e());
            emitter.v(j.this.f().f());
            emitter.z(j.this.f().i());
            emitter.y(j.this.c().f());
            emitter.r(j.this.c().b());
            emitter.t(j.this.c().d());
            emitter.s(j.this.c().c());
            emitter.J(j.this.c().m());
            j.this.c().j();
            emitter.E(null);
            emitter.x(j.this.c().e());
            emitter.I(j.this.c().l());
            emitter.F(j.this.f().h());
            emitter.H(j.this.c().k());
            emitter.B(j.this.c().h());
            emitter.C(j.this.c().i());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z10.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh20/o;", "tracker", "Ljn0/h0;", "a", "(Lh20/o;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<o, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f70477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f70478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar, j jVar) {
            super(1);
            this.f70477c = lVar;
            this.f70478d = jVar;
        }

        public final void a(o tracker) {
            s.k(tracker, "tracker");
            tracker.T(this.f70477c);
            tracker.V(this.f70478d.m().x());
            tracker.C(this.f70478d.m().g());
            tracker.N(this.f70478d.m().i());
            tracker.L(this.f70478d.m().o());
            tracker.M(this.f70478d.m().p());
            tracker.S(this.f70478d.m().w());
            tracker.z(this.f70478d.m().f());
            tracker.O(this.f70478d.m().q());
            tracker.I(this.f70478d.m().l());
            tracker.D(this.f70478d.m().h());
            tracker.P(this.f70478d.m().t());
            tracker.R(this.f70478d.m().v());
            tracker.Q(this.f70478d.m().u());
            tracker.K(this.f70478d.m().n());
            tracker.J(this.f70478d.m().m());
            tracker.F(this.f70478d.m().k());
            tracker.E(this.f70478d.m().j());
            tracker.W(this.f70478d.m().y());
            tracker.V(this.f70478d.m().x());
            k20.c sourceConfig = this.f70478d.d().getSourceConfig();
            if (sourceConfig != null) {
                tracker.H(new b20.a(sourceConfig.a(), sourceConfig.c(), sourceConfig.d(), sourceConfig.b()));
            }
            t20.c cVarA = this.f70478d.k().a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            tracker.B(cVarA.a(timeUnit));
            tracker.G(this.f70478d.k().b().a(timeUnit));
            Iterator<k20.n> it = this.f70478d.j().iterator();
            while (it.hasNext()) {
                tracker.d(k20.i.a(it.next()));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(o oVar) {
            a(oVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld20/a;", "b", "()Ld20/a;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<d20.a> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d20.a invoke() {
            return new d20.a(j.this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh20/i;", "b", "()Lh20/i;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<i> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i(j.this);
        }
    }

    public j(Context context, String namespace, k20.e networkConfiguration, List<? extends k20.a> configurations) {
        s.k(context, "context");
        s.k(namespace, "namespace");
        s.k(networkConfiguration, "networkConfiguration");
        s.k(configurations, "configurations");
        this.namespace = namespace;
        this.ecommerceController = jn0.m.b(new a());
        this.pluginsController = jn0.m.b(new e());
        this.mediaController = jn0.m.b(new d());
        this.pluginConfigurations = new ArrayList();
        this.context = context;
        A(new k20.q());
        x(new k20.e());
        z(new k20.p());
        v(new k20.b());
        y(new k20.o(null, null, 3, null));
        w(new k20.c());
        f().m(networkConfiguration);
        r(configurations);
        a();
    }

    private final void B() {
        o oVar = this.tracker;
        if (oVar != null) {
            oVar.g();
        }
        z10.c cVar = this.emitter;
        if (cVar != null) {
            cVar.K();
        }
    }

    private final z10.c n() {
        String strB = f().b();
        if (strB == null) {
            strB = "";
        }
        z10.c cVar = new z10.c(getNamespace(), c().g(), this.context, strB, new b());
        if (c().n()) {
            cVar.p();
        }
        return cVar;
    }

    private final l o() {
        return new l(this.context, l());
    }

    private final o p() {
        Consumer<s20.f> consumerC;
        o oVar = new o(g(), getNamespace(), m().e(), m().r(), m().s(), this.context, new c(h(), this));
        if (m().A()) {
            oVar.t();
        }
        if (k().d()) {
            oVar.u();
        }
        f20.d session = oVar.getSession();
        if (session != null && (consumerC = k().c()) != null) {
            session.p(consumerC);
        }
        return oVar;
    }

    private final p q() {
        return new p(this);
    }

    private final void r(List<? extends k20.a> configurations) {
        for (k20.a aVar : configurations) {
            if (aVar instanceof k20.e) {
                f().m((k20.e) aVar);
            } else if (aVar instanceof k20.q) {
                m().N((k20.q) aVar);
            } else if (aVar instanceof k20.p) {
                l().a((k20.p) aVar);
            } else if (aVar instanceof k20.o) {
                k().e((k20.o) aVar);
            } else if (aVar instanceof k20.b) {
                c().p((k20.b) aVar);
            } else if (aVar instanceof k20.c) {
                d().f((k20.c) aVar);
            } else if (aVar instanceof k20.d) {
                Iterator<c20.b> it = ((k20.d) aVar).a().iterator();
                while (it.hasNext()) {
                    j().add(it.next());
                }
            } else if (aVar instanceof k20.n) {
                j().add(aVar);
            }
        }
    }

    private final void t() {
        m().N(null);
        l().a(null);
        c().p(null);
        k().e(null);
        d().f(null);
    }

    private final void u() {
        this.emitter = null;
        this.subject = null;
        this.tracker = null;
    }

    public void A(k20.q qVar) {
        s.k(qVar, "<set-?>");
        this.trackerConfiguration = qVar;
    }

    @Override // h20.k
    public o a() {
        o oVar = this.tracker;
        if (oVar != null) {
            return oVar;
        }
        o oVarP = p();
        this.tracker = oVarP;
        return oVarP;
    }

    @Override // h20.k
    public boolean b() {
        return this.tracker != null;
    }

    public k20.b c() {
        k20.b bVar = this.emitterConfiguration;
        if (bVar != null) {
            return bVar;
        }
        s.B("emitterConfiguration");
        return null;
    }

    public k20.c d() {
        k20.c cVar = this.gdprConfiguration;
        if (cVar != null) {
            return cVar;
        }
        s.B("gdprConfiguration");
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getNamespace() {
        return this.namespace;
    }

    public k20.e f() {
        k20.e eVar = this.networkConfiguration;
        if (eVar != null) {
            return eVar;
        }
        s.B("networkConfiguration");
        return null;
    }

    public z10.c g() {
        z10.c cVar = this.emitter;
        if (cVar != null) {
            return cVar;
        }
        z10.c cVarN = n();
        this.emitter = cVarN;
        return cVarN;
    }

    public l h() {
        l lVar = this.subject;
        if (lVar != null) {
            return lVar;
        }
        l lVarO = o();
        this.subject = lVarO;
        return lVarO;
    }

    public p i() {
        p pVar = this.trackerController;
        if (pVar != null) {
            return pVar;
        }
        p pVarQ = q();
        this.trackerController = pVarQ;
        return pVarQ;
    }

    public List<k20.n> j() {
        return this.pluginConfigurations;
    }

    public k20.o k() {
        k20.o oVar = this.sessionConfiguration;
        if (oVar != null) {
            return oVar;
        }
        s.B("sessionConfiguration");
        return null;
    }

    public k20.p l() {
        k20.p pVar = this.subjectConfiguration;
        if (pVar != null) {
            return pVar;
        }
        s.B("subjectConfiguration");
        return null;
    }

    public k20.q m() {
        k20.q qVar = this.trackerConfiguration;
        if (qVar != null) {
            return qVar;
        }
        s.B("trackerConfiguration");
        return null;
    }

    public final void s(List<? extends k20.a> configurations) {
        s.k(configurations, "configurations");
        B();
        t();
        r(configurations);
        u();
        a();
    }

    public void v(k20.b bVar) {
        s.k(bVar, "<set-?>");
        this.emitterConfiguration = bVar;
    }

    public void w(k20.c cVar) {
        s.k(cVar, "<set-?>");
        this.gdprConfiguration = cVar;
    }

    public void x(k20.e eVar) {
        s.k(eVar, "<set-?>");
        this.networkConfiguration = eVar;
    }

    public void y(k20.o oVar) {
        s.k(oVar, "<set-?>");
        this.sessionConfiguration = oVar;
    }

    public void z(k20.p pVar) {
        s.k(pVar, "<set-?>");
        this.subjectConfiguration = pVar;
    }
}

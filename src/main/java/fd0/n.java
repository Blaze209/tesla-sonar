package fd0;

import io.reactivex.rxjava3.core.u;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lfd0/n;", "Lfd0/k;", "localRoutableMessageBuilder", "remoteRoutableMessageBuilder", "<init>", "(Lfd0/k;Lfd0/k;)V", "Lfd0/h;", "params", "Lio/reactivex/rxjava3/core/u;", "Lsc0/h;", "a", "(Lfd0/h;)Lio/reactivex/rxjava3/core/u;", "Lfd0/k;", "b", "c", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.tesla.logging.g f65736d = com.tesla.logging.g.INSTANCE.a("TeslaRoutableMessageBuilder");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k localRoutableMessageBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k remoteRoutableMessageBuilder;

    /* JADX INFO: renamed from: fd0.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfd0/n$a;", "", "<init>", "()V", "Lfd0/k;", "localRoutableMessageBuilder", "remoteRoutableMessageBuilder", "Lfd0/n;", "a", "(Lfd0/k;Lfd0/k;)Lfd0/n;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(k localRoutableMessageBuilder, k remoteRoutableMessageBuilder) {
            s.k(localRoutableMessageBuilder, "localRoutableMessageBuilder");
            s.k(remoteRoutableMessageBuilder, "remoteRoutableMessageBuilder");
            return new n(localRoutableMessageBuilder, remoteRoutableMessageBuilder, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f65739a = new b<>();

        b() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(sc0.h routable) {
            s.k(routable, "routable");
            n.f65736d.a("built: " + routable + " => `" + ie0.n.e(routable.encode(), 0, 1, null) + "`");
        }
    }

    public /* synthetic */ n(k kVar, k kVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, kVar2);
    }

    public static final n c(k kVar, k kVar2) {
        return INSTANCE.a(kVar, kVar2);
    }

    @Override // fd0.k
    public u<sc0.h> a(ProtoRequestBuildParams params) {
        s.k(params, "params");
        u<sc0.h> uVarF = (params.getRequest().m0() ? this.remoteRoutableMessageBuilder.a(params) : this.localRoutableMessageBuilder.a(params)).f(b.f65739a);
        s.j(uVarF, "doOnSuccess(...)");
        return uVarF;
    }

    private n(k kVar, k kVar2) {
        this.localRoutableMessageBuilder = kVar;
        this.remoteRoutableMessageBuilder = kVar2;
    }
}

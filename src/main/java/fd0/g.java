package fd0;

import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lfd0/g;", "", "<init>", "()V", "Lfd0/h;", "params", "", "vehicleToken", "Lfd0/k;", "routableMessageBuilder", "Lio/reactivex/rxjava3/core/u;", "Lkc0/d;", "b", "(Lfd0/h;Ljava/lang/String;Lfd0/k;)Lio/reactivex/rxjava3/core/u;", "Lfd0/b;", "a", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f65701a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("MessageBuilder");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProtoRequestBuildParams f65703a;

        a(ProtoRequestBuildParams protoRequestBuildParams) {
            this.f65703a = protoRequestBuildParams;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fd0.b apply(kc0.d it) {
            s.k(it, "it");
            return new fd0.b.Success(this.f65703a, it);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProtoRequestBuildParams f65704a;

        b(ProtoRequestBuildParams protoRequestBuildParams) {
            this.f65704a = protoRequestBuildParams;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends fd0.b> apply(Throwable it) {
            s.k(it, "it");
            return u.m(new fd0.b.a(this.f65704a, it));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProtoRequestBuildParams f65705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65706b;

        c(ProtoRequestBuildParams protoRequestBuildParams, String str) {
            this.f65705a = protoRequestBuildParams;
            this.f65706b = str;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc0.d apply(sc0.h routableMessage) {
            s.k(routableMessage, "routableMessage");
            return new kc0.d(fd0.c.f65694a.a(this.f65705a, routableMessage, this.f65706b), null, null, null, 14, null);
        }
    }

    private g() {
    }

    private final u<kc0.d> b(ProtoRequestBuildParams params, String vehicleToken, k routableMessageBuilder) {
        u uVarN = routableMessageBuilder.a(params).n(new c(params, vehicleToken));
        s.j(uVarN, "map(...)");
        return uVarN;
    }

    public final u<fd0.b> a(ProtoRequestBuildParams params, String vehicleToken, k routableMessageBuilder) {
        s.k(params, "params");
        s.k(routableMessageBuilder, "routableMessageBuilder");
        u<fd0.b> uVarP = b(params, vehicleToken, routableMessageBuilder).n(new a(params)).p(new b(params));
        s.j(uVarP, "onErrorResumeNext(...)");
        return uVarP;
    }
}

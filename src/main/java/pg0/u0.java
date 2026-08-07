package pg0;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpg0/u0;", "", "a", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: pg0.u0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpg0/u0$a;", "", "<init>", "()V", "Lpg0/i0;", "governmentIdCameraScreenViewFactory", "", "La30/c0;", "b", "(Lpg0/i0;)Ljava/util/Set;", "Lcom/squareup/moshi/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "()Ljava/util/Set;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<com.squareup.moshi.h.e> a() {
            return p013kotlin.collections.d1.c(AutoClassifyResponse.INSTANCE.a());
        }

        public final Set<a30.c0<?>> b(i0 governmentIdCameraScreenViewFactory) {
            p013kotlin.jvm.internal.s.k(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return p013kotlin.collections.d1.i(p0.INSTANCE, governmentIdCameraScreenViewFactory, g1.INSTANCE, s1.INSTANCE, e30.c.INSTANCE, ki0.n.INSTANCE, qg0.f0.INSTANCE);
        }

        private Companion() {
        }
    }

    public static final Set<com.squareup.moshi.h.e> a() {
        return INSTANCE.a();
    }

    public static final Set<a30.c0<?>> b(i0 i0Var) {
        return INSTANCE.b(i0Var);
    }
}

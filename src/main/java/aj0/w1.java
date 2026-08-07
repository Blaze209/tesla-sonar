package aj0;

import com.withpersona.sdk2.inquiry.ui.network.JsonObjectAdapter;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Laj0/w1;", "", "a", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: aj0.w1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Laj0/w1$a;", "", "<init>", "()V", "", "La30/c0;", "b", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Object> a() {
            return p013kotlin.collections.d1.c(JsonObjectAdapter.f58735a);
        }

        public final Set<a30.c0<?>> b() {
            return p013kotlin.collections.d1.c(o3.INSTANCE);
        }

        private Companion() {
        }
    }

    public static final Set<Object> a() {
        return INSTANCE.a();
    }

    public static final Set<a30.c0<?>> b() {
        return INSTANCE.b();
    }
}

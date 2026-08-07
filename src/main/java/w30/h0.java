package w30;

import android.os.Build;
import java.util.Map;
import o30.AppInfo;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw30/h0;", "", "Lkotlin/Function1;", "", "systemPropertySupplier", "<init>", "(Lwn0/l;)V", "Lo30/c;", "appInfo", "", "a", "(Lo30/c;)Ljava/util/Map;", "Lorg/json/JSONObject;", "b", "(Lo30/c;)Lorg/json/JSONObject;", "Lwn0/l;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wn0.l<String, String> f120611c = a.f120613c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, String> systemPropertySupplier;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "name", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f120613c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            String property = System.getProperty(name);
            return property == null ? "" : property;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(wn0.l<? super String, String> systemPropertySupplier) {
        p013kotlin.jvm.internal.s.k(systemPropertySupplier, "systemPropertySupplier");
        this.systemPropertySupplier = systemPropertySupplier;
    }

    public final Map<String, String> a(AppInfo appInfo) {
        return v0.f(jn0.x.a("X-Stripe-Client-User-Agent", b(appInfo).toString()));
    }

    public final JSONObject b(AppInfo appInfo) {
        Map mapM = v0.m(jn0.x.a("os.name", "android"), jn0.x.a("os.version", String.valueOf(Build.VERSION.SDK_INT)), jn0.x.a("bindings.version", "20.52.3"), jn0.x.a("lang", "Java"), jn0.x.a("publisher", "Stripe"), jn0.x.a("http.agent", this.systemPropertySupplier.invoke("http.agent")));
        Map<String, Map<String, String>> mapA = appInfo != null ? appInfo.a() : null;
        if (mapA == null) {
            mapA = v0.i();
        }
        return new JSONObject(v0.r(mapM, mapA));
    }

    public /* synthetic */ h0(wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f120611c : lVar);
    }
}

package nc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nc.m, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0019\u000bB#\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnc/m;", "", "", "", "", "data", "<init>", "(Ljava/util/Map;)V", Action.KEY_ATTRIBUTE, "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/util/Map;", "Lnc/m$a;", DateTokenConverter.CONVERTER_KEY, "()Lnc/m$a;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkHeaders {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NetworkHeaders f93763c = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, List<String>> data;

    public /* synthetic */ NetworkHeaders(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, List<String>> b() {
        return this.data;
    }

    public final String c(String key) {
        Map<String, List<String>> map = this.data;
        String lowerCase = key.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        List<String> list = map.get(lowerCase);
        if (list != null) {
            return (String) v.C0(list);
        }
        return null;
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkHeaders) && s.f(this.data, ((NetworkHeaders) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: nc.m$a */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J \u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnc/m$a;", "", "<init>", "()V", "Lnc/m;", "headers", "(Lnc/m;)V", "", Action.KEY_ATTRIBUTE, "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lnc/m$a;", "", "values", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/List;)Lnc/m$a;", "a", "b", "()Lnc/m;", "", "", "Ljava/util/Map;", "data", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, List<String>> data;

        public a() {
            this.data = new LinkedHashMap();
        }

        public final a a(String key, String value) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            List<String> arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(lowerCase, arrayList);
            }
            arrayList.add(value);
            return this;
        }

        public final NetworkHeaders b() {
            return new NetworkHeaders(v0.A(this.data), null);
        }

        public final a c(String key, String value) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, v.s(value));
            return this;
        }

        public final a d(String key, List<String> values) {
            Map<String, List<String>> map = this.data;
            String lowerCase = key.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, v.p1(values));
            return this;
        }

        public a(NetworkHeaders networkHeaders) {
            Map map = networkHeaders.data;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), v.p1((Collection) entry.getValue()));
            }
            this.data = linkedHashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NetworkHeaders(Map<String, ? extends List<String>> map) {
        this.data = map;
    }
}

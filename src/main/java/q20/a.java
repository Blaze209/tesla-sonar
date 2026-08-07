package q20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lq20/a;", "", "Lokhttp3/Cookie;", "cookie", "<init>", "(Lokhttp3/Cookie;)V", "", "serialized", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lokhttp3/Cookie;", "()Lokhttp3/Cookie;", "c", "()Z", "isExpired", "b", "cookieKey", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cookie cookie;

    /* JADX INFO: renamed from: q20.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq20/a$a;", "", "<init>", "()V", "", "Lokhttp3/Cookie;", "cookies", "", "Lq20/a;", "a", "(Ljava/util/Collection;)Ljava/util/List;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<a> a(Collection<Cookie> cookies) {
            s.k(cookies, "cookies");
            ArrayList arrayList = new ArrayList(cookies.size());
            Iterator<Cookie> it = cookies.iterator();
            while (it.hasNext()) {
                arrayList.add(new a(it.next()));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public a(Cookie cookie) {
        s.k(cookie, "cookie");
        this.cookie = cookie;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Cookie getCookie() {
        return this.cookie;
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.cookie.secure() ? "https" : "http");
        sb2.append("://");
        sb2.append(this.cookie.domain());
        sb2.append(this.cookie.path());
        sb2.append('|');
        sb2.append(this.cookie.name());
        return sb2.toString();
    }

    public final boolean c() {
        return this.cookie.expiresAt() < System.currentTimeMillis();
    }

    public final String d() {
        HashMap map = new HashMap();
        map.put("name", this.cookie.name());
        map.put("value", this.cookie.value());
        map.put("expiresAt", Long.valueOf(this.cookie.expiresAt()));
        map.put("domain", this.cookie.domain());
        map.put("path", this.cookie.path());
        String string = new JSONObject(map).toString();
        s.j(string, "JSONObject(values).toString()");
        return string;
    }

    public boolean equals(Object other) {
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(aVar.cookie.name(), this.cookie.name()) && s.f(aVar.cookie.domain(), this.cookie.domain()) && s.f(aVar.cookie.path(), this.cookie.path());
    }

    public int hashCode() {
        return ((((527 + this.cookie.name().hashCode()) * 31) + this.cookie.domain().hashCode()) * 31) + this.cookie.path().hashCode();
    }

    public a(String serialized) throws JSONException {
        s.k(serialized, "serialized");
        JSONObject jSONObject = new JSONObject(serialized);
        Cookie.Builder builder = new Cookie.Builder();
        String string = jSONObject.getString("name");
        s.j(string, "`object`.getString(\"name\")");
        Cookie.Builder builderName = builder.name(string);
        String string2 = jSONObject.getString("value");
        s.j(string2, "`object`.getString(\"value\")");
        Cookie.Builder builderExpiresAt = builderName.value(string2).expiresAt(jSONObject.getLong("expiresAt"));
        String string3 = jSONObject.getString("domain");
        s.j(string3, "`object`.getString(\"domain\")");
        Cookie.Builder builderDomain = builderExpiresAt.domain(string3);
        String string4 = jSONObject.getString("path");
        s.j(string4, "`object`.getString(\"path\")");
        this.cookie = builderDomain.path(string4).build();
    }
}

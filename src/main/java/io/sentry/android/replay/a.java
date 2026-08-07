package io.sentry.android.replay;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.b7;
import io.sentry.h0;
import io.sentry.q7;
import io.sentry.x3;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \t2\u00020\u0001:\u0002\u0016\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017RT\u0010\u001f\u001aB\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u001b0\u001b \u001a* \u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001c0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lio/sentry/android/replay/a;", "Lio/sentry/x3;", "<init>", "()V", "Lio/sentry/q7;", "options", "(Lio/sentry/q7;)V", "Lio/sentry/e;", "", DateTokenConverter.CONVERTER_KEY, "(Lio/sentry/e;)Z", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/sentry/rrweb/i;", "f", "(Lio/sentry/e;)Lio/sentry/rrweb/i;", "breadcrumb", "Lio/sentry/rrweb/b;", "a", "(Lio/sentry/e;)Lio/sentry/rrweb/b;", "Lio/sentry/q7;", "b", "Ljava/lang/String;", "lastConnectivityState", "", "kotlin.jvm.PlatformType", "Lio/sentry/util/network/a;", "", "c", "Ljava/util/Map;", "httpNetworkDetails", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a implements x3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79879e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy<p013kotlin.text.q> f79880f = jn0.m.a(jn0.p.NONE, C1683a.f79885c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f79881g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String lastConnectivityState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<io.sentry.e, io.sentry.util.network.a> httpNetworkDetails;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/q;", "b", "()Lkotlin/text/q;"}, k = 3, mv = {1, 9, 0})
    static final class C1683a extends p013kotlin.jvm.internal.u implements wn0.a<p013kotlin.text.q> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1683a f79885c = new C1683a();

        C1683a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p013kotlin.text.q invoke() {
            return new p013kotlin.text.q("_[a-z]");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/a$b;", "", "<init>", "()V", "Lkotlin/text/q;", "snakecasePattern$delegate", "Lkotlin/Lazy;", "b", "()Lkotlin/text/q;", "snakecasePattern", "", "MAX_HTTP_NETWORK_DETAILS", "I", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "supportedNetworkData", "Ljava/util/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p013kotlin.text.q b() {
            return (p013kotlin.text.q) a.f79880f.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/replay/a$c;", "Lio/sentry/q7$a;", "delegate", "<init>", "(Lio/sentry/android/replay/a;Lio/sentry/q7$a;)V", "Lio/sentry/e;", "breadcrumb", "Lio/sentry/h0;", "breadcrumbHint", "Lio/sentry/util/network/a;", "b", "(Lio/sentry/e;Lio/sentry/h0;)Lio/sentry/util/network/a;", "hint", "a", "(Lio/sentry/e;Lio/sentry/h0;)Lio/sentry/e;", "Lio/sentry/q7$a;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class c implements q7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q7.a delegate;

        public c(q7.a aVar) {
            this.delegate = aVar;
        }

        private final io.sentry.util.network.a b(io.sentry.e breadcrumb, h0 breadcrumbHint) {
            if (!p013kotlin.jvm.internal.s.f(breadcrumb.q(), "http") && !p013kotlin.jvm.internal.s.f(breadcrumb.j(), "http")) {
                return null;
            }
            Object objC = breadcrumbHint.c("sentry:replayNetworkDetails");
            if (objC instanceof io.sentry.util.network.a) {
                return (io.sentry.util.network.a) objC;
            }
            return null;
        }

        @Override // io.sentry.q7.a
        public io.sentry.e a(io.sentry.e breadcrumb, h0 hint) {
            p013kotlin.jvm.internal.s.k(breadcrumb, "breadcrumb");
            p013kotlin.jvm.internal.s.k(hint, "hint");
            q7.a aVar = this.delegate;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                a aVar2 = a.this;
                io.sentry.util.network.a aVarB = b(breadcrumb, hint);
                if (aVarB != null) {
                    Map map = aVar2.httpNetworkDetails;
                    p013kotlin.jvm.internal.s.j(map, "access$getHttpNetworkDetails$p(...)");
                    map.put(breadcrumb, aVarB);
                }
            }
            return breadcrumb;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"io/sentry/android/replay/a$d", "Ljava/util/LinkedHashMap;", "Lio/sentry/e;", "Lio/sentry/util/network/a;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends LinkedHashMap<io.sentry.e, io.sentry.util.network.a> {
        d() {
        }

        public /* bridge */ boolean b(io.sentry.e eVar) {
            return super.containsKey(eVar);
        }

        public /* bridge */ boolean c(io.sentry.util.network.a aVar) {
            return super.containsValue(aVar);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof io.sentry.e) {
                return b((io.sentry.e) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof io.sentry.util.network.a) {
                return c((io.sentry.util.network.a) obj);
            }
            return false;
        }

        public /* bridge */ io.sentry.util.network.a d(io.sentry.e eVar) {
            return (io.sentry.util.network.a) super.get(eVar);
        }

        public /* bridge */ Set<Map.Entry<io.sentry.e, io.sentry.util.network.a>> e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<io.sentry.e, io.sentry.util.network.a>> entrySet() {
            return e();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof io.sentry.e) {
                return d((io.sentry.e) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof io.sentry.e) ? obj2 : i((io.sentry.e) obj, (io.sentry.util.network.a) obj2);
        }

        public /* bridge */ Set<io.sentry.e> h() {
            return super.keySet();
        }

        public /* bridge */ io.sentry.util.network.a i(io.sentry.e eVar, io.sentry.util.network.a aVar) {
            return (io.sentry.util.network.a) super.getOrDefault(eVar, aVar);
        }

        public /* bridge */ int j() {
            return super.size();
        }

        public /* bridge */ Collection<io.sentry.util.network.a> k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<io.sentry.e> keySet() {
            return h();
        }

        public /* bridge */ io.sentry.util.network.a l(io.sentry.e eVar) {
            return (io.sentry.util.network.a) super.remove(eVar);
        }

        public /* bridge */ boolean m(io.sentry.e eVar, io.sentry.util.network.a aVar) {
            return super.remove(eVar, aVar);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof io.sentry.e) {
                return l((io.sentry.e) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<io.sentry.e, io.sentry.util.network.a> eldest) {
            return size() > 32;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<io.sentry.util.network.a> values() {
            return k();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof io.sentry.e) && (obj2 instanceof io.sentry.util.network.a)) {
                return m((io.sentry.e) obj, (io.sentry.util.network.a) obj2);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<p013kotlin.text.m, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f79888c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(p013kotlin.text.m it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            String upperCase = String.valueOf(p013kotlin.text.t.Q1(it.getValue())).toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f79881g = hashSet;
    }

    public a() {
        this.httpNetworkDetails = Collections.synchronizedMap(new d());
    }

    private final boolean d(io.sentry.e eVar) {
        Object obj = eVar.l().get(ImagesContract.URL);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map<String, Object> mapL = eVar.l();
        p013kotlin.jvm.internal.s.j(mapL, "getData(...)");
        if (!mapL.containsKey("http.start_timestamp")) {
            return false;
        }
        Map<String, Object> mapL2 = eVar.l();
        p013kotlin.jvm.internal.s.j(mapL2, "getData(...)");
        return mapL2.containsKey("http.end_timestamp");
    }

    private final String e(String str) {
        return INSTANCE.b().k(str, e.f79888c);
    }

    private final io.sentry.rrweb.i f(io.sentry.e eVar) {
        double dLongValue;
        double dLongValue2;
        Object obj = eVar.l().get("http.start_timestamp");
        Object obj2 = eVar.l().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(eVar.p().getTime());
        iVar.s("resource.http");
        Object obj3 = eVar.l().get(ImagesContract.URL);
        p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.q((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        iVar.u(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        iVar.r(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        io.sentry.util.network.a aVarRemove = this.httpNetworkDetails.remove(eVar);
        if (aVarRemove != null) {
            String strA = aVarRemove.a();
            if (strA != null) {
                linkedHashMap.put("method", strA);
            }
            Integer numF = aVarRemove.f();
            if (numF != null) {
                linkedHashMap.put("statusCode", numF);
            }
            Long lC = aVarRemove.c();
            if (lC != null) {
                linkedHashMap.put("requestBodySize", lC);
            }
            Long lE = aVarRemove.e();
            if (lE != null) {
                linkedHashMap.put("responseBodySize", lE);
            }
            aVarRemove.b();
            aVarRemove.d();
        }
        Map<String, Object> mapL = eVar.l();
        p013kotlin.jvm.internal.s.j(mapL, "getData(...)");
        for (Map.Entry<String, Object> entry : mapL.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (f79881g.contains(key)) {
                p013kotlin.jvm.internal.s.h(key);
                linkedHashMap.put(e(p013kotlin.text.t.r1(p013kotlin.text.t.V(key, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    @Override // io.sentry.x3
    public io.sentry.rrweb.b a(io.sentry.e breadcrumb) {
        String strN;
        b7 b7VarM;
        Object obj;
        String strU1;
        p013kotlin.jvm.internal.s.k(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (p013kotlin.jvm.internal.s.f(breadcrumb.j(), "http")) {
            if (d(breadcrumb)) {
                return f(breadcrumb);
            }
            return null;
        }
        String strJ = "navigation";
        if (p013kotlin.jvm.internal.s.f(breadcrumb.q(), "navigation") && p013kotlin.jvm.internal.s.f(breadcrumb.j(), "app.lifecycle")) {
            strJ = "app." + breadcrumb.l().get("state");
        } else if (p013kotlin.jvm.internal.s.f(breadcrumb.q(), "navigation") && p013kotlin.jvm.internal.s.f(breadcrumb.j(), "device.orientation")) {
            strJ = breadcrumb.j();
            p013kotlin.jvm.internal.s.h(strJ);
            Object obj2 = breadcrumb.l().get("position");
            if (!p013kotlin.jvm.internal.s.f(obj2, "landscape") && !p013kotlin.jvm.internal.s.f(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!p013kotlin.jvm.internal.s.f(breadcrumb.q(), "navigation")) {
                if (p013kotlin.jvm.internal.s.f(breadcrumb.j(), "ui.click")) {
                    Object obj3 = breadcrumb.l().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.l().get("view.tag")) == null) {
                        obj3 = breadcrumb.l().get("view.class");
                    }
                    strN = obj3 instanceof String ? (String) obj3 : null;
                    if (strN == null) {
                        return null;
                    }
                    Map<String, Object> mapL = breadcrumb.l();
                    p013kotlin.jvm.internal.s.j(mapL, "getData(...)");
                    linkedHashMap.putAll(mapL);
                    strJ = "ui.tap";
                    b7VarM = null;
                } else if (p013kotlin.jvm.internal.s.f(breadcrumb.q(), "system") && p013kotlin.jvm.internal.s.f(breadcrumb.j(), "network.event")) {
                    if (!p013kotlin.jvm.internal.s.f(breadcrumb.l().get("action"), "NETWORK_LOST")) {
                        Map<String, Object> mapL2 = breadcrumb.l();
                        p013kotlin.jvm.internal.s.j(mapL2, "getData(...)");
                        if (mapL2.containsKey("network_type")) {
                            Object obj4 = breadcrumb.l().get("network_type");
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str == null || str.length() == 0) ? "offline" : breadcrumb.l().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (p013kotlin.jvm.internal.s.f(this.lastConnectivityState, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.lastConnectivityState = obj5 instanceof String ? (String) obj5 : null;
                    strJ = "device.connectivity";
                } else if (p013kotlin.jvm.internal.s.f(breadcrumb.l().get("action"), "BATTERY_CHANGED")) {
                    Map<String, Object> mapL3 = breadcrumb.l();
                    p013kotlin.jvm.internal.s.j(mapL3, "getData(...)");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : mapL3.entrySet()) {
                        String key = entry.getKey();
                        if (p013kotlin.jvm.internal.s.f(key, "level") || p013kotlin.jvm.internal.s.f(key, "charging")) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    strJ = "device.battery";
                } else {
                    strJ = breadcrumb.j();
                    strN = breadcrumb.n();
                    b7VarM = breadcrumb.m();
                    Map<String, Object> mapL4 = breadcrumb.l();
                    p013kotlin.jvm.internal.s.j(mapL4, "getData(...)");
                    linkedHashMap.putAll(mapL4);
                }
                if (strJ == null && strJ.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.p().getTime());
                    aVar.r(breadcrumb.p().getTime() / 1000.0d);
                    aVar.s("default");
                    aVar.t(strJ);
                    aVar.x(strN);
                    aVar.w(b7VarM);
                    aVar.u(linkedHashMap);
                    return aVar;
                }
            }
            if (p013kotlin.jvm.internal.s.f(breadcrumb.l().get("state"), "resumed")) {
                Object obj6 = breadcrumb.l().get(AnalyticsContext.Screen);
                String str2 = obj6 instanceof String ? (String) obj6 : null;
                if (str2 != null) {
                    strU1 = p013kotlin.text.t.u1(str2, CoreConstants.DOT, null, 2, null);
                } else {
                    strU1 = null;
                }
            } else {
                Map<String, Object> mapL5 = breadcrumb.l();
                p013kotlin.jvm.internal.s.j(mapL5, "getData(...)");
                if (mapL5.containsKey("to")) {
                    Object obj7 = breadcrumb.l().get("to");
                    if (obj7 instanceof String) {
                        strU1 = (String) obj7;
                    } else {
                        strU1 = null;
                    }
                } else {
                    strU1 = null;
                }
            }
            if (strU1 == null) {
                return null;
            }
            linkedHashMap.put("to", strU1);
        }
        strN = null;
        b7VarM = null;
        return strJ == null ? null : null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(q7 options) {
        this();
        p013kotlin.jvm.internal.s.k(options, "options");
        this.options = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new c(options.getBeforeBreadcrumb()));
    }
}

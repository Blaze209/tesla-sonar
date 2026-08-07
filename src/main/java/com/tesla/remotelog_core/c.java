package com.tesla.remotelog_core;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import ie0.a0;
import ie0.e0;
import ie0.i;
import ie0.r;
import ie0.x;
import io.reactivex.rxjava3.core.u;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import jn0.h0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import vd0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J5\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006("}, d2 = {"Lcom/tesla/remotelog_core/c;", "Lcom/tesla/remotelog_core/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "j", "()Ljava/lang/String;", "", "", "data", "", "batchLog", "Ljn0/h0;", "f", "(Ljava/util/Map;Z)V", "a", "()V", "b", "vin", "c", "(Ljava/util/Map;ZLjava/lang/String;)V", "Landroid/content/Context;", "appContext", "Ljava/util/Deque;", "Ljava/util/Deque;", "logs", "Ljava/text/SimpleDateFormat;", DateTokenConverter.CONVERTER_KEY, "Ljava/text/SimpleDateFormat;", "dateFormatter", "Lvd0/f;", "e", "Lvd0/f;", "telemetryTracker", "", "J", "foregroundTimestamp", "g", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f56521h;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deque<Map<String, Object>> logs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SimpleDateFormat dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f telemetryTracker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long foregroundTimestamp;

    /* JADX INFO: renamed from: com.tesla.remotelog_core.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/tesla/remotelog_core/c$a;", "", "<init>", "()V", "", "values", "Lorg/json/JSONArray;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lorg/json/JSONArray;", "", "", "Lorg/json/JSONObject;", "e", "(Ljava/util/Map;)Lorg/json/JSONObject;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/oapi/OwnerApiEndpoint;", "c", "(Landroid/content/Context;)Lcom/tesla/oapi/OwnerApiEndpoint;", "Lcom/tesla/remotelog_core/a;", "b", "(Landroid/content/Context;)Lcom/tesla/remotelog_core/a;", "", "LOGGING_ENABLED", "Z", "", "MAX_SIZE", "I", "INSTANCE", "Lcom/tesla/remotelog_core/a;", "remotelog-core_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONArray d(List<?> values) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : values) {
                if (obj instanceof Integer) {
                    jSONArray.put(((Number) obj).intValue());
                } else if (obj instanceof Boolean) {
                    jSONArray.put(((Boolean) obj).booleanValue());
                } else if (obj instanceof Long) {
                    jSONArray.put(((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    jSONArray.put(((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    jSONArray.put(obj);
                } else if (obj instanceof List) {
                    jSONArray.put(c.INSTANCE.d((List) obj));
                } else if (obj instanceof Map) {
                    Companion companion = c.INSTANCE;
                    s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    jSONArray.put(companion.e((Map) obj));
                } else {
                    jSONArray.put(obj);
                }
            }
            return jSONArray;
        }

        private final JSONObject e(Map<String, ?> map) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof List) {
                        jSONObject.put(key, c.INSTANCE.d((List) value));
                    } else if (value instanceof Map) {
                        Companion companion = c.INSTANCE;
                        s.i(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                        jSONObject.put(key, companion.e((Map) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
            return jSONObject;
        }

        public final a b(Context context) {
            s.k(context, "context");
            if (c.f56521h == null) {
                synchronized (this) {
                    try {
                        if (c.f56521h == null) {
                            c.f56521h = new c(context, null);
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            a aVar = c.f56521h;
            s.h(aVar);
            return aVar;
        }

        public final OwnerApiEndpoint c(Context context) {
            s.k(context, "context");
            OwnerApiEndpoint endpoint = OwnerApiEndpoints.INSTANCE.getInstance(context).getEndpoint("SPLUNK_TELEMETRY");
            s.h(endpoint);
            return endpoint;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void f(final Map<String, ? extends Object> data, final boolean batchLog) {
        u.k(new Callable() { // from class: vd0.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.tesla.remotelog_core.c.g(this.f119044a, batchLog, data);
            }
        }).v(vm0.a.c()).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(c cVar, boolean z11, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qb0.a.Companion companion = qb0.a.INSTANCE;
        linkedHashMap.put("user_agent", companion.b().c());
        linkedHashMap.put("app_version", companion.b().S());
        linkedHashMap.put("build_number", companion.b().G());
        String RELEASE = Build.VERSION.RELEASE;
        s.j(RELEASE, "RELEASE");
        linkedHashMap.put("os_version", RELEASE);
        linkedHashMap.put("app_state", ie0.f.INSTANCE.a(cVar.appContext).c());
        linkedHashMap.put("platform", "android");
        linkedHashMap.put("conn_type", a0.f77574a.a(cVar.appContext));
        linkedHashMap.put("locale", x.f77622a.c(cVar.appContext));
        String MANUFACTURER = Build.MANUFACTURER;
        s.j(MANUFACTURER, "MANUFACTURER");
        linkedHashMap.put("manufacturer", MANUFACTURER);
        String MODEL = Build.MODEL;
        s.j(MODEL, "MODEL");
        linkedHashMap.put("model", MODEL);
        linkedHashMap.put("android_sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("app_id", companion.b().E());
        linkedHashMap.put("device_time", cVar.j());
        linkedHashMap.put("process", e0.b(cVar.appContext));
        linkedHashMap.put("time_since_foreground_ms", Long.valueOf(System.currentTimeMillis() - cVar.foregroundTimestamp));
        linkedHashMap.put("foreground_time", Long.valueOf(cVar.foregroundTimestamp));
        Integer numA = i.f77586a.a(cVar.appContext);
        if (numA != null) {
            linkedHashMap.put("battery", Integer.valueOf(numA.intValue()));
        }
        if (r.c() || td0.r.e()) {
            String strV = companion.b().v();
            if (strV != null) {
                if (!t.L(strV, "@tesla.com", false, 2, null)) {
                    strV = null;
                }
                if (strV != null) {
                    linkedHashMap.put("account", strV);
                }
            }
            linkedHashMap.put("feedback_enabled", Boolean.TRUE);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        linkedHashMap2.putAll(linkedHashMap);
        if (!r.c() && !td0.r.e()) {
            linkedHashMap2.remove("vin");
            linkedHashMap2.remove("VIN");
        }
        if (z11) {
            synchronized (cVar.logs) {
                try {
                    cVar.logs.add(linkedHashMap2);
                    if (cVar.logs.size() >= 20) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < 20; i11++) {
                            Map<String, Object> mapRemove = cVar.logs.remove();
                            s.j(mapRemove, "remove(...)");
                            arrayList.add(mapRemove);
                        }
                        RemoteLogWorker.INSTANCE.c(cVar.appContext, INSTANCE.d(arrayList));
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            RemoteLogWorker.INSTANCE.c(cVar.appContext, INSTANCE.d(v.e(linkedHashMap2)));
        }
        return h0.f84049a;
    }

    private final String j() {
        String str = this.dateFormatter.format(new Date());
        s.j(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(c cVar, Map map, boolean z11) {
        cVar.f(map, z11);
        return h0.f84049a;
    }

    @Override // com.tesla.remotelog_core.a
    public void a() {
        this.foregroundTimestamp = System.currentTimeMillis();
        this.telemetryTracker.h();
    }

    @Override // com.tesla.remotelog_core.a
    public void b() {
        this.telemetryTracker.h();
    }

    @Override // com.tesla.remotelog_core.a
    public void c(final Map<String, ? extends Object> data, final boolean batchLog, String vin) {
        s.k(data, "data");
        Object obj = data.get("type");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            f(data, batchLog);
        } else {
            this.telemetryTracker.i(str, vin, new wn0.a() { // from class: vd0.g
                @Override // wn0.a
                public final Object invoke() {
                    return com.tesla.remotelog_core.c.k(this.f119041a, data, batchLog);
                }
            });
        }
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.logs = new ArrayDeque();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ssZZZZZ", Locale.US);
        this.dateFormatter = simpleDateFormat;
        this.telemetryTracker = new f();
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        this.foregroundTimestamp = System.currentTimeMillis();
    }
}

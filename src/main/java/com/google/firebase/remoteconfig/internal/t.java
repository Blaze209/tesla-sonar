package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Date f44750f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Date f44751g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f44752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f44753b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f44754c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f44755d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f44756e = new Object();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f44758b;

        a(int i11, Date date) {
            this.f44757a = i11;
            this.f44758b = date;
        }

        Date a() {
            return this.f44758b;
        }

        int b() {
            return this.f44757a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f44760b;

        public b(int i11, Date date) {
            this.f44759a = i11;
            this.f44760b = date;
        }

        Date a() {
            return this.f44760b;
        }

        int b() {
            return this.f44759a;
        }
    }

    public t(SharedPreferences sharedPreferences) {
        this.f44752a = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f44754c) {
            aVar = new a(this.f44752a.getInt("num_failed_fetches", 0), new Date(this.f44752a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map<String, String> b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f44752a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.f44752a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public rw.h d() {
        v vVarA;
        synchronized (this.f44753b) {
            long j11 = this.f44752a.getLong("last_fetch_time_in_millis", -1L);
            int i11 = this.f44752a.getInt("last_fetch_status", 0);
            vVarA = v.b().c(i11).d(j11).b(new rw.i.b().d(this.f44752a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f44752a.getLong("minimum_fetch_interval_in_seconds", m.f44687j)).c()).a();
        }
        return vVarA;
    }

    String e() {
        return this.f44752a.getString("last_fetch_etag", null);
    }

    Date f() {
        return new Date(this.f44752a.getLong("last_fetch_time_in_millis", -1L));
    }

    long g() {
        return this.f44752a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.f44752a.getLong("minimum_fetch_interval_in_seconds", m.f44687j);
    }

    public b i() {
        b bVar;
        synchronized (this.f44755d) {
            bVar = new b(this.f44752a.getInt("num_failed_realtime_streams", 0), new Date(this.f44752a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    void j() {
        l(0, f44751g);
    }

    void k() {
        p(0, f44751g);
    }

    void l(int i11, Date date) {
        synchronized (this.f44754c) {
            this.f44752a.edit().putInt("num_failed_fetches", i11).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void m(String str) {
        synchronized (this.f44753b) {
            this.f44752a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void n(long j11) {
        synchronized (this.f44753b) {
            this.f44752a.edit().putLong("last_template_version", j11).apply();
        }
    }

    public void o(Date date) {
        synchronized (this.f44755d) {
            this.f44752a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void p(int i11, Date date) {
        synchronized (this.f44755d) {
            this.f44752a.edit().putInt("num_failed_realtime_streams", i11).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void q() {
        synchronized (this.f44753b) {
            this.f44752a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void r(Date date) {
        synchronized (this.f44753b) {
            this.f44752a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void s() {
        synchronized (this.f44753b) {
            this.f44752a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

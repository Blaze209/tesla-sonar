package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Date f44660h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f44661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f44662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f44663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONArray f44664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f44665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f44666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f44667g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f44668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f44669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f44670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f44671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JSONArray f44673f;

        public g a() {
            return new g(this.f44668a, this.f44669b, this.f44670c, this.f44671d, this.f44672e, this.f44673f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f44668a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f44670c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f44669b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f44671d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f44673f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j11) {
            this.f44672e = j11;
            return this;
        }

        private b() {
            this.f44668a = new JSONObject();
            this.f44669b = g.f44660h;
            this.f44670c = new JSONArray();
            this.f44671d = new JSONObject();
            this.f44672e = 0L;
            this.f44673f = new JSONArray();
        }
    }

    static g b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < j().length(); i11++) {
            JSONObject jSONObject = j().getJSONObject(i11);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                String string3 = jSONArray.getString(i12);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f44664d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f44661a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set<String> f(g gVar) throws JSONException {
        JSONObject jSONObjectG = d(gVar.f44661a).g();
        Map<String, Map<String, String>> mapC = c();
        Map<String, Map<String, String>> mapC2 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!gVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(gVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !gVar.i().has(next)) || (!i().has(next) && gVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !mapC.get(next).equals(mapC2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectG.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f44662b;
    }

    public Date h() {
        return this.f44663c;
    }

    public int hashCode() {
        return this.f44661a.hashCode();
    }

    public JSONObject i() {
        return this.f44665e;
    }

    public JSONArray j() {
        return this.f44667g;
    }

    public long k() {
        return this.f44666f;
    }

    public String toString() {
        return this.f44661a.toString();
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j11, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j11);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f44662b = jSONObject;
        this.f44663c = date;
        this.f44664d = jSONArray;
        this.f44665e = jSONObject2;
        this.f44666f = j11;
        this.f44667g = jSONArray2;
        this.f44661a = jSONObject3;
    }
}

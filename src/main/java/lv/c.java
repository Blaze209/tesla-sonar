package lv;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f90790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iv.b f90791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bv.g f90792c;

    public c(String str, iv.b bVar) {
        this(str, bVar, bv.g.f());
    }

    private iv.a b(iv.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f90819a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", z.q());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f90820b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f90821c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f90822d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f90823e.a().c());
        return aVar;
    }

    private void c(iv.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e11) {
            this.f90792c.l("Failed to parse settings JSON from " + this.f90790a, e11);
            this.f90792c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f90826h);
        map.put("display_version", kVar.f90825g);
        map.put("source", Integer.toString(kVar.f90827i));
        String str = kVar.f90824f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // lv.l
    public JSONObject a(k kVar, boolean z11) {
        ev.i.d();
        if (!z11) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapF = f(kVar);
            iv.a aVarB = b(d(mapF), kVar);
            this.f90792c.b("Requesting settings from " + this.f90790a);
            this.f90792c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e11) {
            this.f90792c.e("Settings request failed.", e11);
            return null;
        }
    }

    protected iv.a d(Map<String, String> map) {
        return this.f90791b.a(this.f90790a, map).d("User-Agent", "Crashlytics Android SDK/" + z.q()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(iv.c cVar) {
        int iB = cVar.b();
        this.f90792c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f90792c.d("Settings request failed; (status: " + iB + ") from " + this.f90790a);
        return null;
    }

    boolean h(int i11) {
        return i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203;
    }

    c(String str, iv.b bVar, bv.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f90792c = gVar;
        this.f90791b = bVar;
        this.f90790a = str;
    }
}

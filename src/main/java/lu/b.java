package lu;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.classic.spi.CallerData;
import com.plaid.internal.EnumC4419g;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
public class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f90743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f90744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f90745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f90746d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f90748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f90749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f90750h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f90747e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vector<String> f90751i = new Vector<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Vector<String> f90752j = new Vector<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Vector<Long> f90753k = new Vector<>();

    public b(Context context, h hVar) {
        j jVar = new j(context.getSharedPreferences("com.google.android.vending.licensing.APKExpansionPolicy", 0), hVar);
        this.f90750h = jVar;
        this.f90748f = Integer.parseInt(jVar.b("lastResponse", Integer.toString(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE)));
        this.f90743a = Long.parseLong(this.f90750h.b("validityTimestamp", WebrtcBuildVersion.maint_version));
        this.f90744b = Long.parseLong(this.f90750h.b("retryUntil", WebrtcBuildVersion.maint_version));
        this.f90745c = Long.parseLong(this.f90750h.b("maxRetries", WebrtcBuildVersion.maint_version));
        this.f90746d = Long.parseLong(this.f90750h.b("retryCount", WebrtcBuildVersion.maint_version));
        this.f90749g = this.f90750h.b("licensingUrl", null);
    }

    private Map<String, String> c(k kVar) {
        HashMap map = new HashMap();
        if (kVar == null) {
            return map;
        }
        try {
            mu.b.a(new URI(CallerData.NA + kVar.f90788g), map);
            return map;
        } catch (URISyntaxException unused) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
            return map;
        }
    }

    private void l(int i11) {
        this.f90747e = System.currentTimeMillis();
        this.f90748f = i11;
        this.f90750h.c("lastResponse", Integer.toString(i11));
    }

    private void m(String str) {
        this.f90749g = str;
        this.f90750h.c("licensingUrl", str);
    }

    private void n(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
            lValueOf = 0L;
            str = WebrtcBuildVersion.maint_version;
        }
        this.f90745c = lValueOf.longValue();
        this.f90750h.c("maxRetries", str);
    }

    private void o(long j11) {
        this.f90746d = j11;
        this.f90750h.c("retryCount", Long.toString(j11));
    }

    private void p(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
            lValueOf = 0L;
            str = WebrtcBuildVersion.maint_version;
        }
        this.f90744b = lValueOf.longValue();
        this.f90750h.c("retryUntil", str);
    }

    private void q(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            String string = Long.toString(jCurrentTimeMillis);
            lValueOf = lValueOf2;
            str = string;
        }
        this.f90743a = lValueOf.longValue();
        this.f90750h.c("validityTimestamp", str);
    }

    @Override // lu.i
    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = this.f90748f;
        if (i11 == 256) {
            if (jCurrentTimeMillis <= this.f90743a) {
                return true;
            }
        } else if (i11 == 291 && jCurrentTimeMillis < this.f90747e + 60000) {
            return jCurrentTimeMillis <= this.f90744b || this.f90746d <= this.f90745c;
        }
        return false;
    }

    @Override // lu.i
    public void b(int i11, k kVar) {
        if (i11 != 291) {
            o(0L);
        } else {
            o(this.f90746d + 1);
        }
        Map<String, String> mapC = c(kVar);
        if (i11 == 256) {
            this.f90748f = i11;
            m(null);
            q(Long.toString(System.currentTimeMillis() + 60000));
            for (String str : mapC.keySet()) {
                if (str.equals("VT")) {
                    q(mapC.get(str));
                } else if (str.equals("GT")) {
                    p(mapC.get(str));
                } else if (str.equals("GR")) {
                    n(mapC.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    k(Integer.parseInt(str.substring(8)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    i(Integer.parseInt(str.substring(9)) - 1, mapC.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    j(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(mapC.get(str)));
                }
            }
        } else if (i11 == 561) {
            q(WebrtcBuildVersion.maint_version);
            p(WebrtcBuildVersion.maint_version);
            n(WebrtcBuildVersion.maint_version);
            m(mapC.get("LU"));
        }
        l(i11);
        this.f90750h.a();
    }

    public String d(int i11) {
        if (i11 < this.f90752j.size()) {
            return this.f90752j.elementAt(i11);
        }
        return null;
    }

    public long e(int i11) {
        if (i11 < this.f90753k.size()) {
            return this.f90753k.elementAt(i11).longValue();
        }
        return -1L;
    }

    public String f(int i11) {
        if (i11 < this.f90751i.size()) {
            return this.f90751i.elementAt(i11);
        }
        return null;
    }

    public int g() {
        return this.f90751i.size();
    }

    public void h() {
        this.f90750h.c("lastResponse", Integer.toString(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE));
        p(WebrtcBuildVersion.maint_version);
        n(WebrtcBuildVersion.maint_version);
        o(Long.parseLong(WebrtcBuildVersion.maint_version));
        q(WebrtcBuildVersion.maint_version);
        this.f90750h.a();
    }

    public void i(int i11, String str) {
        if (i11 >= this.f90752j.size()) {
            this.f90752j.setSize(i11 + 1);
        }
        this.f90752j.set(i11, str);
    }

    public void j(int i11, long j11) {
        if (i11 >= this.f90753k.size()) {
            this.f90753k.setSize(i11 + 1);
        }
        this.f90753k.set(i11, Long.valueOf(j11));
    }

    public void k(int i11, String str) {
        if (i11 >= this.f90751i.size()) {
            this.f90751i.setSize(i11 + 1);
        }
        this.f90751i.set(i11, str);
    }
}

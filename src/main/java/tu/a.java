package tu;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f115134g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final DateFormat f115135h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f115138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f115139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f115140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f115141f;

    public a(String str, String str2, String str3, Date date, long j11, long j12) {
        this.f115136a = str;
        this.f115137b = str2;
        this.f115138c = str3;
        this.f115139d = date;
        this.f115140e = j11;
        this.f115141f = j12;
    }

    static a a(wu.a.c cVar) {
        String str = cVar.f122352d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f122350b, String.valueOf(cVar.f122351c), str, new Date(cVar.f122361m), cVar.f122353e, cVar.f122358j);
    }

    static a b(Map<String, String> map) throws AbtException {
        g(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f115135h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e11) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e11);
        } catch (ParseException e12) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e12);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f115134g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f115136a;
    }

    long d() {
        return this.f115139d.getTime();
    }

    String e() {
        return this.f115137b;
    }

    wu.a.c f(String str) {
        wu.a.c cVar = new wu.a.c();
        cVar.f122349a = str;
        cVar.f122361m = d();
        cVar.f122350b = this.f115136a;
        cVar.f122351c = this.f115137b;
        cVar.f122352d = TextUtils.isEmpty(this.f115138c) ? null : this.f115138c;
        cVar.f122353e = this.f115140e;
        cVar.f122358j = this.f115141f;
        return cVar;
    }
}

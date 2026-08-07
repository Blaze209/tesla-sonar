package he0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import qb0.c;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f72627d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f72628a = g.h("TeslaClient");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f72629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f72630c;

    private b(Context context) {
        this.f72630c = context.getApplicationContext();
        try {
            this.f72629b = "CN".equals(k("REGION")) ? "android-production-jpush2" : "android-production-firebase";
        } catch (Exception e11) {
            this.f72628a.f("Failed to initialize environment variables", e11);
        }
    }

    private String U(String str, String str2) {
        return String.format("VEHICLE_%s_%s_LAST_SEEN_BLE", str2, str);
    }

    private String V(String str) {
        return String.format("VEHICLE_BLE_PUBLIC_KEY_%s", str);
    }

    private String b(String str, String str2) {
        return String.format("VEHICLE_%s_%s_INITIALIZATION_VECTOR", str2, str);
    }

    private String c(String str) {
        return String.format("VEHICLE_BLE_%s_NAME", str);
    }

    private String d(String str, String str2) {
        return String.format("VEHICLE_%s_%s_CHALLENGE_TOKEN_SUPPORT", str2, str);
    }

    private String e(String str, String str2) {
        return String.format("VEHICLE_%s_%s_WHITELIST_COUNT", str2, str);
    }

    private String f(String str, String str2) {
        return String.format("VEHICLE_%s_%s_WHITELIST_KEYS", str2, str);
    }

    public static Object k(String str) {
        try {
            return BuildConfig.class.getField(str).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static synchronized b m(Context context) {
        try {
            if (f72627d == null) {
                f72627d = new b(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f72627d;
    }

    public long A(String str, String str2) {
        return qb0.a.q().i(e(str, str2));
    }

    public Set<String> B(String str, String str2) {
        return qb0.a.q().a(f(str, str2));
    }

    public void C() throws Throwable {
        m mVarJ = m.j();
        if (mVarJ.h("SCHEMA_ID") == null) {
            Bundle bundle = new Bundle();
            String strA = qb0.b.a(this.f72630c);
            if (strA != null) {
                bundle.putString("_ACCOUNT_EMAIL", strA);
            }
            String strF = qb0.b.f(this.f72630c);
            if (strF != null) {
                bundle.putString("_KEY_STORE_PASS", strF);
            }
            String strI = qb0.b.i(this.f72630c);
            if (strI != null) {
                bundle.putString("SELECTED_VIN", strI);
            }
            String strC = c(strI);
            String strL = qb0.b.l(strC, this.f72630c);
            if (strL != null) {
                bundle.putString(strC, strL);
            }
            String strJ = qb0.b.j(this.f72630c);
            if (strJ != null) {
                bundle.putString("SHARED_SELECTED_PRODUCT_DATA", strJ);
            }
            String strD = qb0.b.d(this.f72630c);
            if (strD != null) {
                bundle.putString("_SSO_AUTH_TOKEN", strD);
            }
            String strH = qb0.b.h(this.f72630c);
            if (strH != null) {
                bundle.putString("SELECTED_PRODUCT", strH);
            }
            String strK = qb0.b.k(this.f72630c);
            if (strK != null) {
                bundle.putString("COLORIZED_IMAGE_DIRECTORY_HASH", strK);
            }
            String strC2 = qb0.b.c(this.f72630c);
            if (strC2 != null) {
                bundle.putString("APP_UUID", strC2);
            }
            String strB = qb0.b.b(this.f72630c);
            if (strB != null) {
                bundle.putString("APP_PREVIOUSLY_LAUNCHED", strB);
            }
            mVarJ.t(bundle);
        }
    }

    public void D(Activity activity) {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268468224);
        try {
            activity.startActivityForResult(intent, 171);
        } catch (ActivityNotFoundException e11) {
            this.f72628a.f("Unable to open ACTION_LOCATION_SOURCE_SETTINGS Intent", e11);
        }
    }

    public void E(String str) {
        qb0.a.q().J(str);
    }

    public long F(long j11, String str, String str2) {
        return qb0.a.q().p(j11, b(str, str2));
    }

    public void G(String str) {
        qb0.a.q().M(str);
    }

    public void H(String str, String str2, String str3) {
        HashSet hashSet = new HashSet();
        if (str3 != null) {
            hashSet.add(str3);
        }
        qb0.a.q().e(str, str2, hashSet);
    }

    public void I(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("id", str);
            } catch (JSONException e11) {
                this.f72628a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void J(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("type", str);
            } catch (JSONException e11) {
                this.f72628a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void K(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                jSONObject.put("vin", str);
            } catch (JSONException e11) {
                this.f72628a.f("Failed to insert value into request object", e11);
            }
        }
    }

    public void L(List<String> list) {
        qb0.a.q().f(list);
    }

    public boolean M(String str) {
        String strU;
        String strS;
        List<Pair<String, String>> listH = h();
        if (listH != null) {
            this.f72628a.j("Looking for the product Id with vin: " + str);
            for (int i11 = 0; i11 < listH.size(); i11++) {
                JSONObject jSONObjectT = t((String) listH.get(i11).second);
                if (jSONObjectT != null && (strU = u(jSONObjectT)) != null && strU.equalsIgnoreCase(str) && (strS = s(jSONObjectT)) != null) {
                    JSONObject jSONObject = new JSONObject();
                    I(jSONObject, strS);
                    J(jSONObject, "VEHICLE");
                    K(jSONObject, strU);
                    qb0.a.q().U(jSONObject.toString());
                    this.f72628a.j("Saving Selected Product with : " + jSONObject);
                    return true;
                }
            }
        }
        return false;
    }

    public long N(String str, String str2, long j11) {
        return c.a().i(U(str, str2), j11, c.h(this.f72630c));
    }

    public void O(String str, String str2) {
        qb0.a.q().K(c(str), str2);
    }

    public void P(String str, String str2) {
        this.f72628a.j("setting vehicle public key mapping: " + str + " -> " + str2);
        qb0.a.q().m(V(str), str2);
    }

    public void Q(String str, String str2, long j11) {
        c.a().i(d(str, str2), j11, c.h(this.f72630c));
    }

    public void R(String str, String str2, long j11) {
        qb0.a.q().h(j11, e(str, str2));
    }

    public void S(String str, String str2, Set<String> set) {
        qb0.a.q().X(set, f(str, str2));
    }

    public long T(String str, String str2) {
        return c.a().c(U(str, str2), c.h(this.f72630c));
    }

    public long W(String str, String str2) {
        return c.a().c(d(str, str2), c.h(this.f72630c));
    }

    public boolean a() {
        String strU = qb0.a.q().u();
        String strY = qb0.a.q().y();
        int iIndexOf = strY.indexOf(45);
        String strSubstring = iIndexOf >= 0 ? strY.substring(0, iIndexOf) : "";
        if (strU != null) {
            return (strU.equals(strY) || strU.equals(strSubstring)) ? false : true;
        }
        return true;
    }

    public String g() {
        return qb0.a.q().v();
    }

    public List<Pair<String, String>> h() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("STORED_VEHICLE_");
        return m.j().i(arrayList, arrayList2);
    }

    public List<Pair<String, String>> i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("VEHICLE_BLE_PUBLIC_KEY_");
        return m.j().i(arrayList, arrayList2);
    }

    public String j() {
        return qb0.a.q().F();
    }

    public long l(String str, String str2) {
        return qb0.a.q().R(b(str, str2));
    }

    public String n() {
        return qb0.a.q().A();
    }

    public JSONObject o() {
        return t(qb0.a.q().I());
    }

    public String p() {
        Locale locale = this.f72630c.getResources().getConfiguration().getLocales().get(0);
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public String q() {
        return qb0.a.q().k();
    }

    public String r(String str, String str2) {
        if (str2 != null && !str2.equals("")) {
            Set<String> setW = qb0.a.q().W(str, str2);
            for (String str3 : setW) {
                if (str3.substring(0, 1).equalsIgnoreCase("C")) {
                    if (setW.size() > 1) {
                        H(str, str2, str3);
                    }
                    return str3;
                }
            }
        }
        return null;
    }

    public String s(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("id");
        } catch (JSONException e11) {
            this.f72628a.f("Failed to get product with id string from json file", e11);
            return null;
        }
    }

    public JSONObject t(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException e11) {
                this.f72628a.f("Failed to get productString from json file", e11);
            }
        }
        return null;
    }

    public String u(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("vin");
        } catch (JSONException e11) {
            this.f72628a.f("Failed to get vin string from product json object", e11);
            return null;
        }
    }

    @NonNull
    public List<String> v() {
        return qb0.a.q().w();
    }

    public String w() {
        return this.f72629b;
    }

    public String x() {
        List<String> listV = v();
        return listV.isEmpty() ? "" : listV.get(0);
    }

    public String y(String str) {
        return qb0.a.q().z(c(str));
    }

    public String z(String str) {
        return qb0.a.q().z(V(str));
    }
}

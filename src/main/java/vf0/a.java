package vf0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.unionpay.utils.UPUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
public class a {
    private static String A = null;
    private static String B = "";
    private static String C = "";
    private static String D = "";
    private static String E = "";
    private static boolean F = false;
    private static int G = 10;
    private static WeakReference H = null;
    private static String I = "";
    private static String J = null;
    private static String K = null;
    private static String L = "";
    private static int M = 0;
    private static boolean N = false;
    private static boolean O = false;
    private static wf0.d P = null;
    private static Handler Q = null;
    private static String R = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    private static String S = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    private static String T = "[{\"package_info\": [{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 102,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    private static String U = "[{\"package_info\": [{\"schema\": \"com.huawei.wallet\",\"sign\": \"9095F915D6C143A41CE029209AFECB87AB481DDD\",\"sort\": 101,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.huawei.wallet\",\"sign\": \"059e2480adf8c1c5b3d9ec007645ccfc442a23c5\",\"sort\": 102,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 104,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    private static JSONArray V = null;
    private static final Handler.Callback W = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f119232a = "SpId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f119233b = "paydata";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f119234c = "pay_tn";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f119235d = "SysProvide";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f119236e = "UseTestMode";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f119237f = "SecurityChipType";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f119238g = "reqOriginalId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f119239h = "wapurl";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f119240i = "actionType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f119241j = "dlgstyle";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f119242k = "com.unionpay.uppay.PayActivity";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f119243l = "com.huawei.wallet";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f119244m = "com.huawei.wallet.action.onlinepay.startpay";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f119245n = "ex_mode";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f119246o = "server";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f119247p = "source";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f119248q = "samsung_out";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f119249r = "se_type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f119250s = "se_title_logo";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static String f119251t = "se_loading_logo";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f119252u = "se_title_bg_color";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f119253v = "se_cancel_bg_color";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static String f119254w = "02";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f119255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f119256y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f119257z;

    static /* synthetic */ boolean C() {
        N = true;
        return true;
    }

    static /* synthetic */ boolean F() {
        O = true;
        return true;
    }

    private static int I() {
        JSONArray jSONArray;
        int i11;
        WeakReference weakReference = H;
        if (weakReference == null || weakReference.get() == null) {
            return 1;
        }
        if (TextUtils.isEmpty(C) && TextUtils.isEmpty(D)) {
            F = false;
        } else {
            F = true;
            if (f119254w.equalsIgnoreCase(D)) {
                C = f119248q;
            }
        }
        M = 0;
        N = false;
        O = false;
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String strC = UPUtils.c(J(), "configs" + D);
        String strC2 = UPUtils.c(J(), "mode" + D);
        String strC3 = UPUtils.c(J(), "or" + D);
        if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2) && !TextUtils.isEmpty(strC3)) {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                String strB = xf0.i.b(jSONObject, "sign");
                try {
                    i11 = Integer.parseInt(strC2);
                } catch (Exception unused) {
                    i11 = 0;
                }
                String str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = "";
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                String strM = xf0.b.m(UPUtils.d(str + str2 + strC3));
                String strB2 = UPUtils.b(i11, strB);
                if (!TextUtils.isEmpty(strB2) && strB2.equals(strM)) {
                    if (TextUtils.isEmpty(D)) {
                        R = str;
                    } else if (WebrtcBuildVersion.webrtc_commit.equals(D)) {
                        U = str;
                    } else {
                        T = str;
                    }
                    if (!TextUtils.isEmpty(B)) {
                        String strC4 = UPUtils.c(J(), "se_configs" + B);
                        if (!TextUtils.isEmpty(strC4)) {
                            w(strC4);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            if (TextUtils.isEmpty(D)) {
                jSONArray = new JSONArray(R);
            } else {
                jSONArray = WebrtcBuildVersion.webrtc_commit.equals(D) ? new JSONArray(U) : new JSONArray(T);
            }
            V = p(jSONArray, "sort");
        } catch (Exception unused3) {
        }
        Q = new Handler(W);
        if (TextUtils.isEmpty(D) || !xf0.b.f()) {
            t(WebrtcBuildVersion.maint_version);
        } else {
            sy.f fVar = new sy.f(J());
            Q.sendEmptyMessageDelayed(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 1000L);
            fVar.l("UNIONONLINEPAY", new k());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context J() {
        WeakReference weakReference = H;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public static int K(Context context, String str, String str2, String str3, String str4) {
        return a(context, str, str2, str3, str4, "", "");
    }

    private static int a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        H = new WeakReference(context);
        I = str3;
        J = str;
        K = str2;
        L = str4;
        D = str6;
        C = str5;
        E = TextUtils.isEmpty(str6) ? WebrtcBuildVersion.maint_version : "1";
        f119255x = null;
        f119256y = null;
        f119257z = null;
        B = str6;
        I();
        return 0;
    }

    static String c(Context context) {
        return e(context, true, WebrtcBuildVersion.maint_version);
    }

    private static String d(Context context, int i11, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tn", UPUtils.i(i11, xf0.b.m(str)));
            }
            try {
                jSONObject.put("terminal_version", "3.5.15");
                jSONObject.put("os_version", xf0.e.a());
                jSONObject.put("device_model", xf0.e.e());
                jSONObject.put("app_version", xf0.b.p(context, str2));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("package_name", str2);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String e(Context context, boolean z11, String str) {
        return o(context, L, z11 ? null : I, z11 ? WebrtcBuildVersion.maint_version : null, str, E, B);
    }

    static /* synthetic */ void i(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                String strB = xf0.i.b(jSONObject, "sign");
                String strB2 = xf0.i.b(jSONObject, "configs");
                if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
                    return;
                }
                int iA = xf0.b.a(str2);
                String strM = xf0.b.m(UPUtils.d(new String(Base64.decode(strB2, 2))));
                String strB3 = UPUtils.b(iA, strB);
                if (TextUtils.isEmpty(strB3) || !strB3.equals(strM)) {
                    return;
                }
                UPUtils.g(context, str, "scan_configs");
                UPUtils.g(context, str2, "scan_mode");
            } catch (Exception unused) {
            }
        }
    }

    static /* synthetic */ void j(Context context, JSONArray jSONArray, int i11) {
        while (jSONArray != null && i11 < jSONArray.length()) {
            Object objA = xf0.i.a(jSONArray, i11);
            if (objA == null) {
                return;
            }
            JSONObject jSONObject = (JSONObject) objA;
            String strB = xf0.i.b(jSONObject, "type");
            if ("app".equals(strB)) {
                JSONArray jSONArrayC = xf0.i.c(jSONObject, "package_info");
                String strB2 = xf0.i.b(jSONObject, "app_server");
                JSONArray jSONArrayP = p(jSONArrayC, "sort");
                boolean z11 = false;
                if (jSONArrayP.length() > 0) {
                    int length = jSONArrayP.length();
                    int i12 = 0;
                    boolean z12 = false;
                    while (true) {
                        if (i12 >= length) {
                            z11 = z12;
                            break;
                        }
                        Object objA2 = xf0.i.a(jSONArrayP, i12);
                        if (objA2 != null) {
                            JSONObject jSONObject2 = (JSONObject) objA2;
                            String strB3 = xf0.i.b(jSONObject2, "schema");
                            String strB4 = xf0.i.b(jSONObject2, "sign");
                            String strB5 = xf0.i.b(jSONObject2, "version");
                            if (xf0.b.g(context, strB3) && strB4.equalsIgnoreCase(xf0.b.n(context, strB3)) && xf0.b.p(context, strB3).matches(strB5)) {
                                try {
                                    Bundle bundle = new Bundle();
                                    l(I, bundle, L);
                                    bundle.putString(f119232a, J);
                                    bundle.putString(f119235d, K);
                                    bundle.putString(f119233b, I);
                                    bundle.putString(f119247p, C);
                                    bundle.putString(f119249r, D);
                                    if (!TextUtils.isEmpty(D)) {
                                        bundle.putString(f119250s, f119255x);
                                        bundle.putString(f119251t, f119256y);
                                        bundle.putString(f119252u, f119257z);
                                        bundle.putString(f119253v, A);
                                    }
                                    bundle.putBoolean(f119241j, F);
                                    bundle.putString(f119246o, strB2);
                                    bundle.putString(f119237f, null);
                                    bundle.putInt(f119238g, 0);
                                    Intent intent = new Intent();
                                    intent.putExtras(bundle);
                                    if (f119243l.equals(strB3)) {
                                        intent.setAction(f119244m);
                                        intent.setPackage(strB3);
                                    } else {
                                        intent.setClassName(strB3, f119242k);
                                    }
                                    Context contextJ = J();
                                    if (contextJ != null) {
                                        if (contextJ instanceof Activity) {
                                            ((Activity) contextJ).startActivityForResult(intent, G);
                                        } else {
                                            intent.addFlags(268435456);
                                            contextJ.startActivity(intent);
                                        }
                                    }
                                    try {
                                        int iA = xf0.b.a(L);
                                        String strL = UPUtils.l(iA);
                                        xf0.j.b("uppay", "calling app url: " + strL);
                                        P = new wf0.d(strL, (byte) 0);
                                        P.b(d(J(), iA, I, strB3));
                                        Executors.newSingleThreadExecutor().execute(new m());
                                        z11 = true;
                                        break;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z12 = true;
                                        e.printStackTrace();
                                        i12++;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            }
                        }
                        i12++;
                    }
                }
                if (z11) {
                    return;
                }
            } else {
                String string = "";
                if ("wap".equals(strB)) {
                    if (!f119248q.equals(C)) {
                        try {
                            string = (String) jSONObject.get(ImagesContract.URL);
                        } catch (Exception unused) {
                        }
                        m(string, "wap");
                        return;
                    }
                } else if ("link".equals(strB)) {
                    try {
                        string = jSONObject.getString(ImagesContract.URL);
                    } catch (Exception unused2) {
                    }
                    m(string, "link");
                    return;
                } else {
                    if ("wcd".equals(strB)) {
                        try {
                            string = jSONObject.getString(ImagesContract.URL);
                        } catch (Exception unused3) {
                        }
                        m(string, "wcd");
                        return;
                    }
                    context = J();
                }
            }
            jSONArray = V;
            i11 = M + 1;
            M = i11;
        }
    }

    private static void l(String str, Bundle bundle, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.trim().charAt(0) != '<') {
            bundle.putString(f119245n, str2);
        } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
            bundle.putBoolean(f119236e, true);
        } else {
            bundle.putBoolean(f119236e, false);
        }
    }

    private static void m(String str, String str2) {
        int i11;
        Bundle bundle = new Bundle();
        if (!"link".equals(str2)) {
            l(I, bundle, L);
            bundle.putString(f119232a, J);
            bundle.putString(f119235d, K);
            try {
                i11 = Integer.parseInt(L);
            } catch (Exception unused) {
                i11 = 0;
            }
            if ("wcd".equals(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("os", "android");
                    jSONObject.put("tn", I);
                    bundle.putString(f119233b, UPUtils.i(i11, xf0.b.m(jSONObject.toString())));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                bundle.putString(f119233b, UPUtils.i(i11, xf0.b.m(I)));
            }
            bundle.putString(f119234c, I);
        }
        bundle.putString("magic_data", "949A1CC");
        bundle.putString(f119239h, str);
        bundle.putString(f119240i, str2);
        try {
            Context contextJ = J();
            if (contextJ != null) {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(contextJ, b.class);
                if (contextJ instanceof Activity) {
                    ((Activity) contextJ).startActivityForResult(intent, G);
                } else {
                    intent.addFlags(268435456);
                    contextJ.startActivity(intent);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static String o(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        int i11;
        int i12;
        Resources resources;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("sdkVerMode", "02");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tn", UPUtils.i(xf0.b.a(str), xf0.b.m(str2)));
            }
            jSONObject.put("appUuId", xf0.e.f(context));
            try {
                jSONObject.put("locale", Locale.getDefault().toString().startsWith("zh") ? "zh_CN" : "en_US");
                jSONObject.put("terminal_version", "3.5.15");
                if (context == null || (resources = context.getResources()) == null) {
                    i11 = 0;
                    i12 = 0;
                } else {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = displayMetrics.widthPixels;
                    i12 = displayMetrics.heightPixels;
                }
                jSONObject.put("terminal_resolution", (i11 + Marker.ANY_MARKER + i12).trim());
                jSONObject.put("os_version", xf0.e.a());
                jSONObject.put("device_model", xf0.e.e());
                jSONObject.put("root", new File("/system/bin/su").exists() ? "1" : WebrtcBuildVersion.maint_version);
                jSONObject.put(PlaceTypes.COUNTRY, xf0.b.q(Locale.getDefault().getCountry()));
                jSONObject.put("package", xf0.b.q(xf0.e.b(context)));
                jSONObject.put("sign", xf0.e.c(context, xf0.b.q(xf0.e.b(context)), "SHA256"));
                String upperCase = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(upperCase)) {
                    upperCase = upperCase.toUpperCase();
                }
                jSONObject.put("phone_model", upperCase);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            jSONObject.put("vendorCapacity", str4);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("randKey", UPUtils.i(xf0.b.a(str), xf0.b.m(null)));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("has_sdk", str3);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("merId", (Object) null);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("isLimitSe", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("seType", xf0.b.o(str6));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray p(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; jSONArray != null && i11 < jSONArray.length(); i11++) {
            arrayList.add(jSONArray.optJSONObject(i11));
        }
        Collections.sort(arrayList, new n(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            jSONArray2.put((JSONObject) arrayList.get(i12));
        }
        return jSONArray2;
    }

    private static void q(Context context, String str, String str2) {
        String strH = UPUtils.h(xf0.b.a(str));
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        Executors.newSingleThreadExecutor().execute(new l(strH, str2, context, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(String str) {
        int i11;
        try {
            i11 = Integer.parseInt(L);
        } catch (Exception unused) {
            i11 = 0;
        }
        String strA = UPUtils.a(i11);
        xf0.j.b("uppay", "url: " + strA);
        P = new wf0.d(strA, (byte) 0);
        P.b(e(J(), false, str));
        if (Q == null) {
            Q = new Handler(W);
        }
        Executors.newSingleThreadExecutor().execute(new j());
    }

    public static boolean u(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = "00";
        }
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String strD = xf0.b.d(UPUtils.c(applicationContext, "scan_configs"), UPUtils.c(applicationContext, "scan_mode"));
        if (TextUtils.isEmpty(strD)) {
            strD = S;
        }
        if (!TextUtils.isEmpty(strD)) {
            try {
                JSONArray jSONArray = new JSONArray(strD);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    Object objA = xf0.i.a(jSONArray, i11);
                    if (objA instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) objA;
                        if ("app".equals(xf0.i.b(jSONObject, "type"))) {
                            JSONArray jSONArrayP = p(xf0.i.c(jSONObject, "package_info"), "sort");
                            for (int i12 = 0; i12 < jSONArrayP.length(); i12++) {
                                Object objA2 = xf0.i.a(jSONArrayP, i12);
                                if ((objA2 instanceof JSONObject) && xf0.b.k(applicationContext, (JSONObject) objA2)) {
                                    q(applicationContext, str, str2);
                                    return true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        q(applicationContext, str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f119255x = jSONObject.getString("titleLogo");
            f119256y = jSONObject.getString("loadingLogo");
            f119257z = jSONObject.getString("backGroundColor");
            A = jSONObject.getString("textColor");
        } catch (Exception unused) {
        }
    }

    static void h() {
    }
}

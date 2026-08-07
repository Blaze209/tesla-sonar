package lh;

import android.content.Context;
import android.text.TextUtils;
import di.f;
import di.g;
import di.l;
import di.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static b P;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public JSONObject L;
    public boolean M;
    public List<C1902b> N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89989a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89990b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f89991c = "https://h5.m.taobao.com/mlapp/olist.html";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89992d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89993e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89994f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89995g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89996h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89997i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f89998j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f89999k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f90000l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f90001m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f90002n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f90003o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90004p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f90005q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f90006r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f90007s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f90008t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f90009u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f90010v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f90011w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f90012x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f90013y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f90014z = null;
    public Boolean A = null;
    public Boolean B = null;
    public Boolean C = null;
    public lh.a D = new lh.a();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ai.a f90015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f90016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f90017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f90018d;

        public a(ai.a aVar, Context context, boolean z11, int i11) {
            this.f90015a = aVar;
            this.f90016b = context;
            this.f90017c = z11;
            this.f90018d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vh.b bVarH = new wh.b().h(this.f90015a, this.f90016b);
                if (bVarH != null) {
                    b.this.i(this.f90015a, bVarH.a());
                    b.this.J(ai.a.u());
                    hh.a.a(this.f90015a, "biz", "offcfg|" + this.f90017c + "|" + this.f90018d);
                }
            } catch (Throwable th2) {
                g.d(th2);
            }
        }
    }

    /* JADX INFO: renamed from: lh.b$b, reason: collision with other inner class name */
    public static final class C1902b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90022c;

        public C1902b(String str, int i11, String str2) {
            this.f90020a = str;
            this.f90021b = i11;
            this.f90022c = str2;
        }

        public static List<C1902b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                C1902b c1902bB = b(jSONArray.optJSONObject(i11));
                if (c1902bB != null) {
                    arrayList.add(c1902bB);
                }
            }
            return arrayList;
        }

        public static C1902b b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new C1902b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public static JSONArray c(List<C1902b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<C1902b> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }

        public static JSONObject d(C1902b c1902b) {
            if (c1902b == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", c1902b.f90020a).put("v", c1902b.f90021b).put("pk", c1902b.f90022c);
            } catch (JSONException e11) {
                g.d(e11);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    public b() {
        Boolean bool = Boolean.FALSE;
        this.E = bool;
        this.F = bool;
        this.G = bool;
        this.H = null;
        this.I = false;
        this.J = 200L;
        this.K = false;
        this.M = true;
        this.N = null;
        this.O = -1;
    }

    public static b E() {
        if (P == null) {
            b bVar = new b();
            P = bVar;
            bVar.T();
        }
        return P;
    }

    public boolean A() {
        return this.f89996h;
    }

    public boolean B(ai.a aVar) {
        j(aVar, "enable_china_mobile_bridge_mode", String.valueOf(this.G));
        Boolean bool = this.G;
        return bool != null && bool.booleanValue();
    }

    public boolean C() {
        return this.f89997i;
    }

    public boolean D(ai.a aVar) {
        j(aVar, "gray_log_print_performance", String.valueOf(this.F));
        Boolean bool = this.F;
        return bool != null && bool.booleanValue();
    }

    public boolean F(ai.a aVar) {
        j(aVar, "local_web_pay", String.valueOf(this.C));
        Boolean bool = this.C;
        return (bool == null || !bool.booleanValue() || fh.a.d()) ? false : true;
    }

    public boolean G() {
        return this.f89993e;
    }

    public boolean H(ai.a aVar) {
        j(aVar, "sdk_pre_heat", String.valueOf(this.A));
        Boolean bool = this.A;
        return bool != null && bool.booleanValue();
    }

    public String I() {
        return this.f90005q;
    }

    public final void J(ai.a aVar) {
        try {
            l.c(aVar, ai.b.d().c(), "alipay_cashier_dynamic_config", f().toString());
        } catch (Exception e11) {
            g.d(e11);
        }
    }

    public int K() {
        int i11 = this.f89989a;
        if (i11 < 1000 || i11 > 20000) {
            g.f("DynCon", "time(def) = 10000");
            return 10000;
        }
        g.f("DynCon", "time = " + this.f89989a);
        return this.f89989a;
    }

    public List<C1902b> L() {
        return this.N;
    }

    public boolean M() {
        return this.f89998j;
    }

    public boolean N() {
        return this.f90001m;
    }

    public boolean O() {
        return this.f90009u;
    }

    public boolean P() {
        return this.f90002n;
    }

    public String Q() {
        return this.f89991c;
    }

    public long R() {
        long j11 = this.J;
        if (j11 <= 0) {
            return 200L;
        }
        return j11;
    }

    public boolean S() {
        return this.f90004p;
    }

    public void T() {
        Context contextC = ai.b.d().c();
        String strA = l.a(ai.a.u(), contextC, "alipay_cashier_dynamic_config", null);
        try {
            this.O = Integer.parseInt(l.a(ai.a.u(), contextC, "utdid_factor", "-1"));
        } catch (Exception unused) {
        }
        k(strA);
    }

    public boolean U() {
        Boolean bool = this.f90014z;
        return bool != null && bool.booleanValue();
    }

    public boolean V() {
        return this.f90008t;
    }

    public boolean W() {
        return this.f90011w;
    }

    public boolean a() {
        return this.f90007s;
    }

    public boolean b() {
        return this.M;
    }

    public boolean c() {
        return this.f89990b;
    }

    public boolean d() {
        return this.f89994f;
    }

    public boolean e() {
        return this.f90003o;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", K());
        jSONObject.put("h5_port_degrade", c());
        jSONObject.put("tbreturl", Q());
        jSONObject.put("configQueryInterval", w());
        jSONObject.put("launchAppSwitch", C1902b.c(L()));
        jSONObject.put("intercept_batch", G());
        jSONObject.put("deg_log_mcgw", A());
        jSONObject.put("deg_start_srv_first", C());
        jSONObject.put("prev_jump_dual", M());
        jSONObject.put("bind_use_imp", s());
        jSONObject.put("bind_use_allow_activity_starts", q());
        jSONObject.put("retry_bnd_once", N());
        jSONObject.put("skip_trans", P());
        jSONObject.put("start_trans", e());
        jSONObject.put("up_before_pay", S());
        jSONObject.put("use_sc_lck_a", O());
        jSONObject.put("lck_k", I());
        jSONObject.put("bind_with_startActivity", u());
        jSONObject.put("cfg_max_time", y());
        jSONObject.put("get_oa_id", b());
        jSONObject.put("notifyFailApp", W());
        jSONObject.put("enableStartActivityFallback", a());
        jSONObject.put("enableBindExFallback", V());
        jSONObject.put("startactivity_in_ui_thread", d());
        jSONObject.put("ap_args", g());
        f.c(jSONObject, "optimize_trans_activity_degrade", this.f90012x);
        f.c(jSONObject, "register_app_degrade_2", this.f90013y);
        f.c(jSONObject, "sdk_pre_heat", this.A);
        f.c(jSONObject, "external_sdk_data_degrade", this.B);
        f.c(jSONObject, "local_web_pay", this.C);
        f.c(jSONObject, "degrade_web_ua_version", this.f90014z);
        f.d(jSONObject, "debug_upgrade_warn", this.D.a());
        f.c(jSONObject, "fetch_config_when_register_app", this.E);
        f.c(jSONObject, "gray_log_print_performance", this.F);
        f.c(jSONObject, "enable_china_mobile_bridge_mode", this.G);
        f.c(jSONObject, "enable_hk_z32_flowcut", this.H);
        f.c(jSONObject, "degrade_exit_local_web_pay_on_back", Boolean.valueOf(this.I));
        f.c(jSONObject, "degrade_check_version_when_register_app", Boolean.valueOf(this.K));
        jSONObject.put("trans_act_start_sleep_time", R());
        return jSONObject;
    }

    public JSONObject g() {
        return this.L;
    }

    public void h(ai.a aVar, Context context, boolean z11, int i11) {
        hh.a.a(aVar, "biz", "oncfg|" + z11 + "|" + i11);
        a aVar2 = new a(aVar, context, z11, i11);
        if (!z11 || p.Z()) {
            Thread thread = new Thread(aVar2);
            thread.setName("AlipayDCP");
            thread.start();
            return;
        }
        int iY = y();
        if (p.v(iY, aVar2, "AlipayDCPBlok")) {
            return;
        }
        hh.a.g(aVar, "biz", "LogAppFetchConfigTimeout", "" + iY);
    }

    public final void i(ai.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("st_sdk_config");
            di.a.e(aVar, jSONObjectOptJSONObject, di.a.c(aVar, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                n(jSONObjectOptJSONObject);
            } else {
                g.i("DynCon", "empty config");
            }
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    public final void j(ai.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        hh.a.b(aVar, "biz", "getConfig", str + "|" + str2);
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            n(new JSONObject(str));
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    public final void n(JSONObject jSONObject) {
        g.h("mspl", "readFromJson:" + jSONObject);
        this.f89989a = jSONObject.optInt("timeout", 10000);
        this.f89990b = jSONObject.optBoolean("h5_port_degrade", false);
        this.f89991c = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f89992d = jSONObject.optInt("configQueryInterval", 10);
        this.N = C1902b.a(jSONObject.optJSONArray("launchAppSwitch"));
        this.f89993e = jSONObject.optBoolean("intercept_batch", true);
        this.f89996h = jSONObject.optBoolean("deg_log_mcgw", false);
        this.f89997i = jSONObject.optBoolean("deg_start_srv_first", true);
        this.f89998j = jSONObject.optBoolean("prev_jump_dual", true);
        this.f89999k = jSONObject.optBoolean("bind_use_imp", false);
        this.f90000l = jSONObject.optBoolean("bind_use_allow_activity_starts", true);
        this.f90001m = jSONObject.optBoolean("retry_bnd_once", false);
        this.f90002n = jSONObject.optBoolean("skip_trans", false);
        this.f90003o = jSONObject.optBoolean("start_trans", false);
        this.f90004p = jSONObject.optBoolean("up_before_pay", true);
        this.f90005q = jSONObject.optString("lck_k", "");
        this.f90009u = jSONObject.optBoolean("use_sc_lck_a", false);
        this.f90011w = jSONObject.optBoolean("notifyFailApp", false);
        this.f90006r = jSONObject.optString("bind_with_startActivity", "");
        this.f90010v = jSONObject.optInt("cfg_max_time", 1000);
        this.M = jSONObject.optBoolean("get_oa_id", true);
        this.f90007s = jSONObject.optBoolean("enableStartActivityFallback", false);
        this.f90008t = jSONObject.optBoolean("enableBindExFallback", false);
        this.f89994f = jSONObject.optBoolean("startactivity_in_ui_thread", false);
        this.L = jSONObject.optJSONObject("ap_args");
        if (jSONObject.has("optimize_trans_activity_degrade")) {
            this.f90012x = Boolean.valueOf(jSONObject.optBoolean("optimize_trans_activity_degrade", false));
        } else {
            this.f90012x = null;
        }
        if (jSONObject.has("register_app_degrade_2")) {
            this.f90013y = Boolean.valueOf(jSONObject.optBoolean("register_app_degrade_2", false));
        } else {
            this.f90013y = null;
        }
        if (jSONObject.has("sdk_pre_heat")) {
            this.A = Boolean.valueOf(jSONObject.optBoolean("sdk_pre_heat", false));
        } else {
            this.A = null;
        }
        if (jSONObject.has("external_sdk_data_degrade")) {
            this.B = Boolean.valueOf(jSONObject.optBoolean("external_sdk_data_degrade", false));
        } else {
            this.B = null;
        }
        if (jSONObject.has("local_web_pay")) {
            this.C = Boolean.valueOf(jSONObject.optBoolean("local_web_pay", false));
        } else {
            this.C = null;
        }
        if (jSONObject.has("degrade_web_ua_version")) {
            this.f90014z = Boolean.valueOf(jSONObject.optBoolean("degrade_web_ua_version", false));
        } else {
            this.f90014z = null;
        }
        this.D.b(jSONObject.optString("debug_upgrade_warn", null));
        if (jSONObject.has("fetch_config_when_register_app")) {
            this.E = Boolean.valueOf(jSONObject.optBoolean("fetch_config_when_register_app", false));
        } else {
            this.E = null;
        }
        if (jSONObject.has("gray_log_print_performance")) {
            this.F = Boolean.valueOf(jSONObject.optBoolean("gray_log_print_performance", false));
        } else {
            this.F = null;
        }
        if (jSONObject.has("enable_china_mobile_bridge_mode")) {
            this.G = Boolean.valueOf(jSONObject.optBoolean("enable_china_mobile_bridge_mode", false));
        } else {
            this.G = null;
        }
        if (jSONObject.has("enable_hk_z32_flowcut")) {
            this.H = Boolean.valueOf(jSONObject.optBoolean("enable_hk_z32_flowcut", false));
        } else {
            this.H = null;
        }
        this.I = jSONObject.optBoolean("degrade_exit_local_web_pay_on_back", false);
        this.K = jSONObject.optBoolean("degrade_check_version_when_register_app", false);
        this.J = jSONObject.optLong("trans_act_start_sleep_time", 200L);
    }

    public boolean o(ai.a aVar) {
        j(aVar, "external_sdk_data_degrade", String.valueOf(this.B));
        Boolean bool = this.B;
        return bool != null && bool.booleanValue();
    }

    public boolean p(Context context, int i11) {
        if (this.O == -1) {
            this.O = p.a();
            l.c(ai.a.u(), context, "utdid_factor", String.valueOf(this.O));
        }
        return this.O < i11;
    }

    public boolean q() {
        return this.f90000l;
    }

    public boolean r(ai.a aVar) {
        j(aVar, "optimize_trans_activity_degrade", String.valueOf(this.f90012x));
        Boolean bool = this.f90012x;
        return bool != null && bool.booleanValue();
    }

    public boolean s() {
        return this.f89999k;
    }

    public boolean t(ai.a aVar) {
        j(aVar, "register_app_degrade_2", String.valueOf(this.f90013y));
        Boolean bool = this.f90013y;
        return bool != null && bool.booleanValue();
    }

    public String u() {
        return this.f90006r;
    }

    public boolean v(ai.a aVar) {
        j(aVar, "enable_hk_z32_flowcut", String.valueOf(this.H));
        Boolean bool = this.H;
        return bool != null && bool.booleanValue();
    }

    public int w() {
        return this.f89992d;
    }

    public boolean x(ai.a aVar) {
        j(aVar, "degrade_exit_local_web_pay_on_back", String.valueOf(this.I));
        return !this.I;
    }

    public final int y() {
        return this.f90010v;
    }

    public boolean z(ai.a aVar) {
        j(aVar, "fetch_config_when_register_app", String.valueOf(this.E));
        Boolean bool = this.E;
        return bool != null && bool.booleanValue();
    }
}

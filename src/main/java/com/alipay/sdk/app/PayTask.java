package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import di.g;
import di.j;
import di.k;
import di.l;
import di.n;
import di.o;
import di.p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import wh.f;

/* JADX INFO: loaded from: classes3.dex */
public class PayTask {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f20125j = j.class;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f20126k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f20127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qg.a f20128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20129c = "wappaygw.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20130d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20131e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20132f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20133g = "mclient.alipay.hk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20134h = "render.alipay.hk";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, e> f20135i = new HashMap();

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f20136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f20137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f20138c;

        public b(String str, boolean z11, H5PayCallback h5PayCallback) {
            this.f20136a = str;
            this.f20137b = z11;
            this.f20138c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ei.a aVarH5Pay = PayTask.this.h5Pay(new ai.a(PayTask.this.f20127a, this.f20136a, "payInterceptorWithUrl"), this.f20136a, this.f20137b);
            g.h("mspl", "inc finished: " + aVarH5Pay.a());
            this.f20138c.onPayResult(aVarH5Pay);
        }
    }

    public class c implements j.f {
        public c() {
        }

        @Override // di.j.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // di.j.f
        public void b() {
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ai.a f20141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f20142b;

        public d(ai.a aVar, String str) {
            this.f20141a = aVar;
            this.f20142b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayTask.this.b(this.f20141a, this.f20142b);
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f20147d;

        public e() {
            this.f20144a = "";
            this.f20145b = "";
            this.f20146c = "";
            this.f20147d = "";
        }

        public void a(String str) {
            this.f20146c = str;
        }

        public String b() {
            return this.f20144a;
        }

        public void c(String str) {
            this.f20144a = str;
        }

        public String d() {
            return this.f20145b;
        }

        public void e(String str) {
            this.f20145b = str;
        }

        public void f(String str) {
            this.f20147d = str;
        }
    }

    public PayTask(Activity activity) {
        this.f20127a = activity;
        ai.b.d().b(this.f20127a);
        this.f20128b = new qg.a(activity, this.f20127a.getString(jg.a.f83695c));
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            ai.b.d().b(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f20126k < lh.b.E().w()) {
                return false;
            }
            f20126k = jElapsedRealtime;
            lh.b.E().h(ai.a.u(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e11) {
            g.d(e11);
            return false;
        }
        throw th;
    }

    public final void b(ai.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            ci.a.b(ai.b.d().c()).c(strOptString, strOptString2);
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "ParserTidClientKeyEx", th2);
        }
    }

    public final void c(ai.a aVar, String str) {
        if (aVar.g() && lh.b.E().H(aVar)) {
            new Thread(new d(aVar, str)).start();
        }
    }

    public void dismissLoading() {
        qg.a aVar = this.f20128b;
        if (aVar != null) {
            aVar.c();
            this.f20128b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021 A[Catch: all -> 0x025b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x025b, blocks: (B:3:0x0001, B:5:0x0007, B:17:0x006d, B:26:0x00c9, B:39:0x0127, B:41:0x0138, B:43:0x0146, B:47:0x0162, B:50:0x0174, B:63:0x01c1, B:56:0x019d, B:30:0x00d9, B:34:0x00e9, B:21:0x007d, B:12:0x0021), top: B:143:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x001c, blocks: (B:7:0x0013, B:19:0x0075, B:28:0x00d1, B:52:0x018c, B:58:0x01a3, B:60:0x01b1, B:32:0x00e1, B:36:0x00fb, B:23:0x008f, B:14:0x0033), top: B:145:0x0013 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0033, please report this as an issue */
    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        Throwable th2;
        String strTrim;
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim2 = str.trim();
                if (strTrim2.startsWith("https://wappaygw.alipay.com/service/rest.htm")) {
                    strTrim = strTrim2.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + p.p("<request_token>", "</request_token>", p.F(strTrim).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f20127a) + "\"";
                    }
                } else {
                    try {
                        if (strTrim2.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                            strTrim = strTrim2.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                            if (!TextUtils.isEmpty(strTrim)) {
                                return "_input_charset=\"utf-8\"&ordertoken=\"" + p.p("<request_token>", "</request_token>", p.F(strTrim).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f20127a) + "\"";
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        g.d(th2);
                    }
                }
                if (strTrim2.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim2.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim2.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + p.p("<request_token>", "</request_token>", p.F(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f20127a) + "\"";
                    }
                }
                if ((strTrim2.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim2.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim2.contains("alipay.wap.create.direct.pay.by.user") || strTrim2.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim2.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ImagesContract.URL, str);
                    jSONObject.put("bizcontext", a(this.f20127a));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strP = p.p(CallerData.NA, "", str);
                    if (!TextUtils.isEmpty(strP)) {
                        Map<String, String> mapF = p.F(strP);
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            if (a(false, true, "trade_no", sb2, mapF, "trade_no", "alipay_trade_no")) {
                                a(true, false, "pay_phase_id", sb2, mapF, "payPhaseId", "pay_phase_id", "out_relation_id");
                                sb2.append("&biz_sub_type=\"TRADE\"");
                                sb2.append("&biz_type=\"trade\"");
                                String str2 = mapF.get("app_name");
                                if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapF.get("cid"))) {
                                    str2 = "ali1688";
                                } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapF.get("sid")) || !TextUtils.isEmpty(mapF.get("s_id")))) {
                                    str2 = "tb";
                                }
                                sb2.append("&app_name=\"" + str2 + "\"");
                                if (!a(true, true, "extern_token", sb2, mapF, "extern_token", "cid", "sid", "s_id")) {
                                    return "";
                                }
                                a(true, false, "appenv", sb2, mapF, "appenv");
                                sb2.append("&pay_channel_id=\"alipay_sdk\"");
                                e eVar = new e();
                                eVar.c(mapF.get("return_url"));
                                eVar.e(mapF.get("show_url"));
                                eVar.a(mapF.get("pay_order_id"));
                                String str3 = sb2.toString() + "&bizcontext=\"" + a(this.f20127a) + "\"";
                                this.f20135i.put(str3, eVar);
                                return str3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            g.d(th2);
                        }
                    }
                }
                if (!strTrim2.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim2.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!kg.b.c() || !strTrim2.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if ((strTrim2.startsWith("https://mclient.alipay.hk") || strTrim2.startsWith("http://mclient.alipay.hk") || strTrim2.startsWith("https://render.alipay.hk") || strTrim2.startsWith("http://render.alipay.hk")) && strTrim2.contains("qrCode=")) {
                        if (lh.b.E().v(null)) {
                            String strA = a(this.f20127a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(ImagesContract.URL, strTrim2);
                            jSONObject2.put("bizcontext", strA);
                            return String.format("new_external_info==%s", jSONObject2.toString());
                        }
                        fetchSdkConfig(this.f20127a);
                    }
                    if (lh.b.E().G() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim2).find()) {
                        Uri uri = Uri.parse(strTrim2);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strA2 = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA3 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String strA4 = a(uri.getQueryParameter("app_name"), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? "tb" : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "");
                        String strA5 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strA6 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA2) && !TextUtils.isEmpty(strA4) && !TextUtils.isEmpty(strA5)) {
                            String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strA2, strA3, strA4, strA5, strA6, a(this.f20127a));
                            e eVar2 = new e();
                            eVar2.c(queryParameter);
                            eVar2.e(queryParameter2);
                            eVar2.a(queryParameter3);
                            eVar2.f(strA2);
                            this.f20135i.put(str4, eVar2);
                            return str4;
                        }
                    }
                }
                String strA7 = a(this.f20127a);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ImagesContract.URL, strTrim2);
                jSONObject3.put("bizcontext", strA7);
                return String.format("new_external_info==%s", jSONObject3.toString());
                th2 = th;
                g.d(th2);
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return k.a(new ai.a(this.f20127a, "", "fetchTradeToken"), this.f20127a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.42";
    }

    public synchronized ei.a h5Pay(ai.a aVar, String str, boolean z11) {
        ei.a aVar2;
        aVar2 = new ei.a();
        try {
            String[] strArrSplit = a(aVar, str, z11).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, a(str2, strSubstring));
                }
            }
            if (map.containsKey("resultStatus")) {
                aVar2.c(map.get("resultStatus"));
            }
            aVar2.d(a(str, map));
            if (TextUtils.isEmpty(aVar2.b())) {
                hh.a.g(aVar, "biz", "H5CbUrlEmpty", "");
            }
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "H5CbEx", th2);
            g.d(th2);
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z11) {
        if (di.c.a()) {
            return fh.b.e();
        }
        return a(new ai.a(this.f20127a, str, "pay"), str, z11);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z11, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        try {
            strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
                g.h("mspl", "intercepted: " + strFetchOrderInfoFromH5PayUrl);
                new Thread(new b(strFetchOrderInfoFromH5PayUrl, z11, h5PayCallback)).start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z11) {
        String strA;
        ai.a aVar;
        try {
            if (di.c.a()) {
                strA = fh.b.e();
                aVar = null;
            } else {
                ai.a aVar2 = new ai.a(this.f20127a, str, "payV2");
                strA = a(aVar2, str, z11);
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return n.c(aVar, strA);
    }

    public void showLoading() {
        qg.a aVar = this.f20128b;
        if (aVar != null) {
            aVar.f();
        }
    }

    public final synchronized String a(ai.a aVar, String str, boolean z11) {
        String strA;
        try {
            ServiceConnection serviceConnection = kg.a.f86044a;
            if (z11) {
                showLoading();
            }
            hh.a.b(aVar, "biz", "isDebugApp", "false degradeRegisterApp=" + lh.b.E().t(null) + " fetchConfigWhenRegisterApp=" + lh.b.E().z(null) + " grayLogPrintPerformance=" + lh.b.E().D(null));
            if (str.contains("payment_inst=")) {
                String strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                int iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                fh.a.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                fh.a.b("");
            }
            if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
                jh.a.f83726d = true;
            }
            if (jh.a.f83726d) {
                if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                    str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
                } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                    str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
                }
            }
            strA = "";
            try {
                g.h("mspl", "pay prepared: " + str);
                strA = a(str, aVar);
                g.h("mspl", "pay raw result: " + strA);
                k.c(aVar, this.f20127a.getApplicationContext(), strA);
                if (!lh.b.E().o(aVar)) {
                    String strE = n.e(strA, "externalSdkData");
                    if (!TextUtils.isEmpty(strE)) {
                        try {
                            String strOptString = new JSONObject(strE).optString("preheatUserToken");
                            if (!TextUtils.isEmpty(strOptString)) {
                                l.c(aVar, this.f20127a, "sp_preheatUserToken", strOptString);
                            }
                        } catch (Throwable th2) {
                            g.d(th2);
                        }
                    }
                }
                if (lh.b.E().F(null)) {
                    rh.b.m().c();
                    rh.b.m().l();
                }
                hh.a.b(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                hh.a.b(aVar, "biz", "PgReturnV", n.a(strA, "resultStatus") + "|" + n.a(strA, "memo"));
                if (!lh.b.E().S()) {
                    lh.b.E().h(aVar, this.f20127a.getApplicationContext(), false, 3);
                }
                dismissLoading();
                a(aVar);
                hh.a.h(this.f20127a.getApplicationContext(), aVar, str, aVar.f1114d);
                ServiceConnection serviceConnection2 = kg.a.f86044a;
            } catch (Throwable th3) {
                try {
                    strA = fh.b.a();
                    g.d(th3);
                    if (!lh.b.E().o(aVar)) {
                        String strE2 = n.e(strA, "externalSdkData");
                        if (!TextUtils.isEmpty(strE2)) {
                            try {
                                String strOptString2 = new JSONObject(strE2).optString("preheatUserToken");
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    l.c(aVar, this.f20127a, "sp_preheatUserToken", strOptString2);
                                }
                            } catch (Throwable th4) {
                                g.d(th4);
                            }
                        }
                    }
                    if (lh.b.E().F(null)) {
                        rh.b.m().c();
                        rh.b.m().l();
                    }
                    hh.a.b(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    hh.a.b(aVar, "biz", "PgReturnV", n.a(strA, "resultStatus") + "|" + n.a(strA, "memo"));
                    if (!lh.b.E().S()) {
                        lh.b.E().h(aVar, this.f20127a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    a(aVar);
                    hh.a.h(this.f20127a.getApplicationContext(), aVar, str, aVar.f1114d);
                    ServiceConnection serviceConnection3 = kg.a.f86044a;
                } catch (Throwable th5) {
                    if (!lh.b.E().o(aVar)) {
                        String strE3 = n.e(strA, "externalSdkData");
                        if (!TextUtils.isEmpty(strE3)) {
                            try {
                                String strOptString3 = new JSONObject(strE3).optString("preheatUserToken");
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    l.c(aVar, this.f20127a, "sp_preheatUserToken", strOptString3);
                                }
                            } catch (Throwable th6) {
                                g.d(th6);
                            }
                        }
                    }
                    if (lh.b.E().F(null)) {
                        rh.b.m().c();
                        rh.b.m().l();
                    }
                    hh.a.b(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    hh.a.b(aVar, "biz", "PgReturnV", n.a(strA, "resultStatus") + "|" + n.a(strA, "memo"));
                    if (!lh.b.E().S()) {
                        lh.b.E().h(aVar, this.f20127a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    a(aVar);
                    hh.a.h(this.f20127a.getApplicationContext(), aVar, str, aVar.f1114d);
                    ServiceConnection serviceConnection4 = kg.a.f86044a;
                    throw th5;
                }
            }
            g.h("mspl", "pay returning: " + strA);
        } catch (Throwable th7) {
            throw th7;
        }
        return strA;
    }

    public final void b(ai.a aVar, String str) {
        g.f("mspl", "requestPreheatPay");
        hh.a.b(aVar, "biz", "requestPreheatStart", aVar.w());
        try {
            g.f("mspl", "requestPreheatPay respData:" + new wh.g().i(aVar, this.f20127a.getApplicationContext(), str).c());
        } catch (Throwable th2) {
            g.d(th2);
            hh.a.c(aVar, "biz", "requestPreheatError", th2);
        }
        hh.a.b(aVar, "biz", "requestPreheatEnd", aVar.w());
    }

    public final void a(ai.a aVar) {
        WeakReference<Context> weakReference;
        if (lh.b.E().t(null)) {
            return;
        }
        g.h("mspl", "unbindRegisterAppService registerAppServiceConnectSuccess=" + kg.a.f86045b);
        hh.a.b(aVar, "biz", "registerApp", "unbindServiceStart");
        if (kg.a.f86044a != null && kg.a.f86045b && (weakReference = kg.a.f86046c) != null && weakReference.get() != null) {
            try {
                kg.a.f86046c.get().unbindService(kg.a.f86044a);
                hh.a.b(aVar, "biz", "registerApp", "unbindServiceEnd");
            } catch (Throwable th2) {
                g.d(th2);
                hh.a.c(aVar, "wr", "registerAppUnbindServiceError", th2);
            }
        }
        kg.a.f86046c = null;
        kg.a.f86045b = false;
        kg.a.f86044a = null;
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e11) {
                e = e11;
                g.d(e);
                str2 = "";
            }
        } catch (Exception e12) {
            e = e12;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("sv", "h.a.3.8.42");
            jSONObject.put("an", str2);
            jSONObject.put("av", str);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            g.d(th2);
            return "";
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public final boolean a(boolean z11, boolean z12, String str, StringBuilder sb2, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                String str3 = strArr[i11];
                if (!TextUtils.isEmpty(map.get(str3))) {
                    str2 = map.get(str3);
                    break;
                }
                i11++;
            } else {
                str2 = "";
                break;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return !z12;
        }
        if (z11) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=\"");
            sb2.append(str2);
            sb2.append("\"");
            return true;
        }
        sb2.append(str);
        sb2.append("=\"");
        sb2.append(str2);
        sb2.append("\"");
        return true;
    }

    public final String a(String str, Map<String, String> map) {
        boolean zEquals = "9000".equals(map.get("resultStatus"));
        String str2 = map.get("result");
        e eVarRemove = this.f20135i.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(p.p("&callBackUrl=\"", "\"", str2), p.p("&call_back_url=\"", "\"", str2), p.p("&return_url=\"", "\"", str2), URLDecoder.decode(p.p("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(p.p("&callBackUrl=", "&", str2), "utf-8"), p.p("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (eVarRemove != null) {
            String strB = zEquals ? eVarRemove.b() : eVarRemove.d();
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        if (eVarRemove != null) {
            return lh.b.E().Q();
        }
        return "";
    }

    public final String a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public final j.f a() {
        return new c();
    }

    public final String a(String str, ai.a aVar) {
        String strA = aVar.a(str);
        g.f("mspl", "payResult orderInfo=" + strA);
        if (strA.contains("paymethod=\"expressGateway\"")) {
            return a(aVar, strA);
        }
        List<lh.b.C1902b> listL = lh.b.E().L();
        if (!lh.b.E().f89995g || listL == null) {
            listL = fh.a.f65949d;
        }
        if (p.w(aVar, this.f20127a, listL, true)) {
            j jVar = new j(this.f20127a, aVar, a());
            g.h("mspl", "pay inner started: " + strA);
            c(aVar, strA);
            String strH = jVar.h(strA, false);
            if (!TextUtils.isEmpty(strH)) {
                if (strH.contains("resultStatus={" + fh.c.ACTIVITY_NOT_START_EXIT.c() + "}")) {
                    p.u("alipaySdk", "startActivityEx", this.f20127a, aVar);
                    strH = jVar.h(strA, true);
                }
            }
            g.h("mspl", "pay inner raw result: " + strH);
            jVar.i();
            boolean zA = lh.b.E().a();
            if (!TextUtils.equals(strH, "failed") && !TextUtils.equals(strH, "scheme_failed") && (!zA || !aVar.y())) {
                if (TextUtils.isEmpty(strH)) {
                    return fh.b.a();
                }
                if (!strH.contains("{\"isLogin\":\"false\"}")) {
                    return strH;
                }
                hh.a.a(aVar, "biz", "LogHkLoginByIntent");
                return a(aVar, strA, listL, strH, this.f20127a);
            }
            hh.a.a(aVar, "biz", "LogBindCalledH5");
            return a(aVar, strA);
        }
        hh.a.a(aVar, "biz", "LogCalledH5");
        return a(aVar, strA);
    }

    public static String a(ai.a aVar, String str, List<lh.b.C1902b> list, String str2, Activity activity) {
        p.c cVarG = p.g(aVar, activity, list);
        if (cVarG == null || cVarG.b(aVar) || cVarG.a() || !TextUtils.equals(cVarG.f60679a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        g.f("mspl", "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.f20120b;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra("orderSuffix", str);
        intent.putExtra("externalPkgName", activity.getPackageName());
        intent.putExtra("phonecashier.pay.hash", strValueOf);
        ai.a.C0043a.c(aVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                g.f("mspl", "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                g.f("mspl", "PayTask interrupted");
                return fh.b.a();
            }
        }
        String str3 = PayResultActivity.b.f20124b;
        g.f("mspl", "PayTask ret: " + str3);
        return str3;
    }

    public final String a(ai.a aVar, String str) {
        vh.b bVarI;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        showLoading();
        fh.c cVarA = null;
        try {
            try {
                hh.a.a(aVar, "biz", "h5CashierRequest");
                if (lh.b.E().F(aVar)) {
                    rh.b.m().d(aVar);
                    bVarI = new wh.c().j(aVar, this.f20127a.getApplicationContext(), str, o.a());
                } else {
                    bVarI = new f().i(aVar, this.f20127a.getApplicationContext(), str);
                }
                JSONObject jSONObjectC = bVarI.c();
                hh.a.a(aVar, "biz", "h5CashierResponse");
                String strOptString = jSONObjectC.optString("end_code", null);
                JSONObject jSONObjectOptJSONObject3 = (!lh.b.E().F(null) || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("form")) == null) ? null : jSONObjectOptJSONObject2.optJSONObject("onload");
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject3 = jSONObjectC.optJSONObject("form").optJSONObject("onload");
                }
                List<yh.b> listA = yh.b.a(jSONObjectOptJSONObject3);
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    if (listA.get(i11).b() == yh.a.Update) {
                        yh.b.c(listA.get(i11));
                    }
                }
                b(aVar, jSONObjectC);
                dismissLoading();
                hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
                for (int i12 = 0; i12 < listA.size(); i12++) {
                    yh.b bVar = listA.get(i12);
                    if (bVar.b() == yh.a.WapPay) {
                        String strA = a(aVar, bVar);
                        dismissLoading();
                        hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
                        return strA;
                    }
                    if (bVar.b() == yh.a.OpenWeb) {
                        String strA2 = a(aVar, bVar, strOptString);
                        dismissLoading();
                        hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
                        return strA2;
                    }
                    if (lh.b.E().F(null) && bVar.b() == yh.a.LocalWebPay) {
                        String strA3 = a(aVar, jSONObjectC);
                        dismissLoading();
                        hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
                        return strA3;
                    }
                }
                dismissLoading();
                hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
            } catch (Throwable th2) {
                dismissLoading();
                hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
                throw th2;
            }
        } catch (IOException e11) {
            cVarA = fh.c.a(fh.c.NETWORK_ERROR.c());
            hh.a.e(aVar, "net", e11);
            dismissLoading();
            hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
        } catch (Throwable th3) {
            g.d(th3);
            hh.a.c(aVar, "biz", "H5PayDataAnalysisError", th3);
            dismissLoading();
            hh.a.f(this.f20127a, aVar, str, aVar.f1114d);
        }
        if (cVarA == null) {
            cVarA = fh.c.a(fh.c.FAILED.c());
        }
        return fh.b.b(cVarA.c(), cVarA.b(), "");
    }

    public final String a(ai.a aVar, JSONObject jSONObject) {
        g.f("mspl", "processLocalWebPay");
        fh.b.d(false);
        fh.b.c(null);
        Intent intent = new Intent(this.f20127a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data").optJSONObject("local_web_pay_data");
            String strOptString = jSONObjectOptJSONObject.optString("h5_cashier_url");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("h5_local_data");
            String strOptString2 = jSONObjectOptJSONObject2.optString("sha256", "");
            String strOptString3 = jSONObjectOptJSONObject2.optString("source_url", "");
            String strOptString4 = jSONObjectOptJSONObject2.optString("update_strategy");
            rh.b.m().e(new rh.a(strOptString2, strOptString3, strOptString4));
            hh.a.b(aVar, "biz", "h5LocalDataUpdateStrategy", strOptString4);
            intent.putExtra(ImagesContract.URL, strOptString);
            intent.putExtra("version", "v1");
            intent.putExtra("cashierBizData", jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putBoolean("backisexit", lh.b.E().x(aVar));
            intent.putExtras(bundle);
            ai.a.C0043a.c(aVar, intent);
            this.f20127a.startActivity(intent);
            Object obj = f20125j;
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e11) {
                    g.d(e11);
                    return fh.b.a();
                }
            }
            String strG = fh.b.g();
            return TextUtils.isEmpty(strG) ? fh.b.a() : strG;
        } catch (Throwable th2) {
            g.d(th2);
            hh.a.c(aVar, "biz", "processLocalWebPay", th2);
            return fh.b.a();
        }
    }

    public final String a(ai.a aVar, yh.b bVar, String str) {
        boolean zF;
        String strG;
        String[] strArrF = bVar.f();
        Intent intent = new Intent(this.f20127a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectY = p.Y(new String(nh.a.d(strArrF[2])));
            intent.putExtra(ImagesContract.URL, strArrF[0]);
            intent.putExtra("title", strArrF[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObjectY.optString("method", "POST"));
            fh.b.d(false);
            fh.b.c(null);
            ai.a.C0043a.c(aVar, intent);
            this.f20127a.startActivity(intent);
            Object obj = f20125j;
            synchronized (obj) {
                try {
                    obj.wait();
                    zF = fh.b.f();
                    strG = fh.b.g();
                    fh.b.d(false);
                    fh.b.c(null);
                } catch (InterruptedException e11) {
                    g.d(e11);
                    return fh.b.a();
                }
            }
            String strB = "";
            if (zF) {
                try {
                    List<yh.b> listA = yh.b.a(p.Y(new String(nh.a.d(strG))));
                    for (int i11 = 0; i11 < listA.size(); i11++) {
                        yh.b bVar2 = listA.get(i11);
                        if (bVar2.b() == yh.a.SetResult) {
                            String[] strArrF2 = bVar2.f();
                            strB = fh.b.b(Integer.valueOf(strArrF2[1]).intValue(), strArrF2[0], p.Q(aVar, strArrF2[2]));
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    g.d(th2);
                    hh.a.d(aVar, "biz", "H5PayDataAnalysisError", th2, strG);
                }
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                return fh.b.b(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th3) {
                hh.a.d(aVar, "biz", "H5PayDataAnalysisError", th3, "endCode: " + str);
                return fh.b.b(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, "", "");
            }
        } catch (Throwable th4) {
            g.d(th4);
            hh.a.d(aVar, "biz", "H5PayDataAnalysisError", th4, Arrays.toString(strArrF));
            return fh.b.a();
        }
    }

    public final String a(ai.a aVar, yh.b bVar) {
        fh.b.d(false);
        fh.b.c(null);
        String[] strArrF = bVar.f();
        Intent intent = new Intent(this.f20127a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(ImagesContract.URL, strArrF[0]);
        if (strArrF.length == 2) {
            bundle.putString("cookie", strArrF[1]);
        }
        intent.putExtras(bundle);
        ai.a.C0043a.c(aVar, intent);
        this.f20127a.startActivity(intent);
        Object obj = f20125j;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e11) {
                g.d(e11);
                return fh.b.a();
            }
        }
        String strG = fh.b.g();
        return TextUtils.isEmpty(strG) ? fh.b.a() : strG;
    }
}

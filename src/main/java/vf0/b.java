package vf0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
public class b extends Activity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f119259i = "ex_mode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f119260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f119261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlertDialog f119262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f119263d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f119264e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f119265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f119266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f119267h;

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    static /* synthetic */ void h(b bVar, boolean z11) {
        View view = bVar.f119266g;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    static /* synthetic */ void m(b bVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(bVar);
        bVar.f119262c = builder.create();
        builder.setMessage(xf0.k.a().f123489a);
        builder.setTitle(xf0.k.a().f123492d);
        builder.setPositiveButton(xf0.k.a().f123490b, new w(bVar));
        builder.setNegativeButton(xf0.k.a().f123491c, new x(bVar));
        builder.create().show();
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i11, int i12, Intent intent) {
        String string;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String str = "";
                    if (extras.containsKey("pay_result")) {
                        string = extras.getString("pay_result");
                    } else {
                        string = extras.containsKey("code") ? extras.getString("code") : "";
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    String string2 = extras.containsKey("data") ? extras.getString("data") : "";
                    if (!TextUtils.isEmpty(string2)) {
                        str = string2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", string);
                    jSONObject.put("data", str);
                    i iVar = this.f119267h;
                    if (iVar != null) {
                        iVar.a(j(WebrtcBuildVersion.maint_version, null, jSONObject));
                    }
                } else {
                    i iVar2 = this.f119267h;
                    if (iVar2 != null) {
                        iVar2.a(i("1", "No pay result", null));
                    }
                }
            } catch (Exception unused) {
                i iVar3 = this.f119267h;
                if (iVar3 != null) {
                    iVar3.a(i("1", "No pay result", null));
                }
            }
            this.f119267h = null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View.OnClickListener vVar;
        super.onCreate(bundle);
        getWindow().addFlags(PKIFailureInfo.certRevoked);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.f119263d = "link".equals(getIntent().getStringExtra("actionType"));
                String stringExtra = getIntent().getStringExtra(f119259i);
                this.f119264e = stringExtra;
                if (TextUtils.isEmpty(stringExtra)) {
                    this.f119264e = "00";
                }
                String stringExtra2 = "";
                getWindow().requestFeature(1);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
                setContentView(relativeLayout);
                this.f119260a = new WebView(this);
                String stringExtra3 = getIntent().getStringExtra("actionType");
                this.f119265f = stringExtra3;
                if ("link".equals(stringExtra3)) {
                    stringExtra2 = getIntent().getStringExtra("wapurl");
                } else {
                    String stringExtra4 = getIntent().getStringExtra("waptype");
                    String stringExtra5 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra4)) {
                        stringExtra2 = stringExtra5 != null ? stringExtra5 : "";
                        vVar = new o(this);
                    } else {
                        String stringExtra6 = getIntent().getStringExtra("paydata");
                        if (stringExtra6 != null) {
                            stringExtra2 = stringExtra5 + "?s=" + stringExtra6;
                        }
                        vVar = null;
                    }
                    ImageView imageView = new ImageView(this);
                    imageView.setBackgroundDrawable(xf0.g.a(xf0.h.f123486b));
                    int iA = xf0.f.a(this, 24.0f);
                    int iA2 = xf0.f.a(this, 18.0f);
                    int iA3 = xf0.f.a(this, 14.0f);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(iA2, iA3, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (vVar == null) {
                        vVar = new v(this);
                    }
                    imageView.setOnClickListener(vVar);
                    this.f119266g = imageView;
                }
                this.f119260a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.f119260a);
                c cVar = new c(this, this.f119260a, null);
                this.f119261b = cVar;
                cVar.g(true);
                WebView webView = this.f119260a;
                if (webView != null) {
                    webView.loadUrl(stringExtra2);
                }
                c cVar2 = this.f119261b;
                if (cVar2 != null) {
                    cVar2.f("getDeviceInfo", new y(this));
                    this.f119261b.f("saveData", new z(this));
                    this.f119261b.f("getData", new a0(this));
                    this.f119261b.f("removeData", new b0(this));
                    this.f119261b.f("setPageBackEnable", new c0(this));
                    this.f119261b.f("payBySDK", new d0(this));
                    this.f119261b.f("payResult", new p(this));
                    this.f119261b.f("closePage", new q(this));
                    this.f119261b.f("openNewPage", new r(this));
                    this.f119261b.f("checkBankSchemes", new s(this));
                    this.f119261b.f("openBankApp", new t(this));
                    this.f119261b.f("openScheme", new u(this));
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.f119263d) {
            WebView webView = this.f119260a;
            if (webView != null && webView.canGoBack()) {
                this.f119260a.goBack();
                return true;
            }
            f("cancel", null);
        } else {
            onPause();
        }
        return true;
    }
}

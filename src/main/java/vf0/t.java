package vf0;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119298a;

    t(b bVar) {
        this.f119298a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        try {
            this.f119298a.f119267h = iVar;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("type");
            String strOptString = jSONObject.optString("openParams");
            String strOptString2 = jSONObject.optString("tn");
            String strOptString3 = jSONObject.optString("extra");
            if (WebrtcBuildVersion.maint_version.equals(string2)) {
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strOptString2)) {
                    if (iVar == null) {
                        return;
                    }
                    iVar.a(b.i("1", "Parameter error", null));
                }
                Intent intent = new Intent();
                intent.setClassName(string, "com.unionpay.uppay.PayActivity");
                intent.putExtra("paydata", strOptString2);
                intent.putExtra(b.f119259i, this.f119298a.f119264e);
                intent.putExtra("extra", strOptString3);
                try {
                    this.f119298a.startActivityForResult(intent, 1);
                    return;
                } catch (Exception unused) {
                    if (iVar == null) {
                        return;
                    }
                    iVar.a(b.i("2", "Call application error", null));
                    return;
                }
            }
            if ("2".equals(string2)) {
                if (!TextUtils.isEmpty(strOptString)) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(strOptString));
                    intent2.putExtra("extra", strOptString3);
                    if (!TextUtils.isEmpty(string)) {
                        intent2.setPackage(string);
                    }
                    try {
                        this.f119298a.startActivityForResult(intent2, 1);
                        return;
                    } catch (Exception unused2) {
                        if (iVar == null) {
                            return;
                        }
                        iVar.a(b.i("2", "Call application error", null));
                        return;
                    }
                }
                if (iVar == null) {
                    return;
                }
            } else if (iVar == null) {
                return;
            }
            iVar.a(b.i("1", "Parameter error", null));
        } catch (Exception e11) {
            if (iVar != null) {
                iVar.a(b.i("1", e11.getMessage(), null));
            }
        }
    }
}

package vf0;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119296a;

    r(b bVar) {
        this.f119296a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get(ImagesContract.URL);
                try {
                    str3 = (String) jSONObject.get("title");
                } catch (Exception e11) {
                    e = e11;
                    if (iVar != null) {
                        iVar.a(b.i("1", e.getMessage(), null));
                    }
                }
            } catch (Exception e12) {
                e = e12;
                str2 = "";
            }
            Bundle bundle = new Bundle();
            bundle.putString("waptype", "new_page");
            bundle.putString("magic_data", "949A1CC");
            bundle.putString("wapurl", str2);
            bundle.putString("waptitle", str3);
            bundle.putString("actionType", this.f119296a.f119265f);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(this.f119296a, b.class);
            this.f119296a.startActivity(intent);
            if (iVar != null) {
                iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", null));
            }
        } catch (Exception e13) {
            if (iVar != null) {
                iVar.a(b.i("1", e13.getMessage(), null));
            }
        }
    }
}

package vf0;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119294a;

    p(b bVar) {
        this.f119294a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get(StatusResponse.RESULT_CODE);
                try {
                    str3 = (String) jSONObject.get("resultData");
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
            this.f119294a.f(str2, str3);
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

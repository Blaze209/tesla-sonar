package vf0;

import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119297a;

    s(b bVar) {
        this.f119297a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        String strI;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                int i11 = 0;
                while (true) {
                    int length = jSONArray.length();
                    String str2 = WebrtcBuildVersion.maint_version;
                    if (i11 >= length) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    String string = jSONObject2.getString("packageName");
                    if (xf0.b.i(this.f119297a, string, jSONObject2.getString("packageSign"), jSONObject2.getString("supportVersion"))) {
                        str2 = "1";
                    }
                    jSONObject.put(string, str2);
                    i11++;
                }
                if (iVar == null) {
                    return;
                } else {
                    strI = b.j(WebrtcBuildVersion.maint_version, "success", jSONObject);
                }
            } else if (iVar == null) {
                return;
            } else {
                strI = b.i("1", "Parameter error", null);
            }
            iVar.a(strI);
        } catch (Exception e11) {
            if (iVar != null) {
                iVar.a(b.i("1", e11.getMessage(), null));
            }
        }
    }
}

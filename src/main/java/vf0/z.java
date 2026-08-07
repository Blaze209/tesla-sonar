package vf0;

import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class z implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119304a;

    z(b bVar) {
        this.f119304a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                UPUtils.g(this.f119304a, jSONObject.getString(next), next);
            }
            if (iVar != null) {
                iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", null));
            }
        } catch (Exception e11) {
            if (iVar != null) {
                iVar.a(b.i("1", e11.getMessage(), null));
            }
        }
    }
}

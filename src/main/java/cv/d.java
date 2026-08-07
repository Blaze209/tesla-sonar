package cv;

import android.os.Bundle;
import androidx.annotation.NonNull;
import bv.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d implements b, dv.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dv.a f59196a;

    @NonNull
    private static String b(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // dv.b
    public void a(dv.a aVar) {
        this.f59196a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // cv.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        dv.a aVar = this.f59196a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}

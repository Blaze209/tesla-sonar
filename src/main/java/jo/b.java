package jo;

import android.net.Uri;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Kind;
import java.util.Map;
import okio.k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f84090c = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f84091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, f> f84092b;

    private class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f84093a;

        public a(Object obj) {
            this.f84093a = obj;
        }

        @Override // jo.h
        public void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f84093a);
                jSONObject.put(AnalyticsAttribute.Error, obj);
                b.this.f84091a.h(jSONObject.toString());
            } catch (Exception e11) {
                qk.a.n(b.f84090c, "Responding with error failed", e11);
            }
        }

        @Override // jo.h
        public void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f84093a);
                jSONObject.put("result", obj);
                b.this.f84091a.h(jSONObject.toString());
            } catch (Exception e11) {
                qk.a.n(b.f84090c, "Responding failed", e11);
            }
        }
    }

    public b(String str, d dVar, Map<String, f> map, e.b bVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(dVar.b()).appendPath("message").appendQueryParameter(Kind.DEVICE, com.facebook.react.modules.systeminfo.a.d()).appendQueryParameter("app", dVar.getPackageName()).appendQueryParameter("clientid", str);
        this.f84091a = new e(builder.build().toString(), this, bVar);
        this.f84092b = map;
    }

    private void d(Object obj, String str) {
        if (obj != null) {
            new a(obj).a(str);
        }
        qk.a.m(f84090c, "Handling the message failed with reason: " + str);
    }

    @Override // jo.e.c
    public void a(k kVar) {
        qk.a.I(f84090c, "Websocket received message with payload of unexpected type binary");
    }

    public void e() {
        this.f84091a.c();
    }

    public void f() {
        this.f84091a.e();
    }

    @Override // jo.e.c
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                qk.a.m(f84090c, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                d(objOpt, "No method provided");
                return;
            }
            f fVar = this.f84092b.get(strOptString);
            if (fVar == null) {
                d(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                fVar.a(objOpt2);
            } else {
                fVar.b(objOpt2, new a(objOpt));
            }
        } catch (Exception e11) {
            qk.a.n(f84090c, "Handling the message failed", e11);
        }
    }
}

package lv;

import com.google.firebase.crashlytics.internal.common.e0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class b implements i {
    b() {
    }

    static d b(e0 e0Var) {
        return new d(e0Var.a() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // lv.i
    public d a(e0 e0Var, JSONObject jSONObject) {
        return b(e0Var);
    }
}

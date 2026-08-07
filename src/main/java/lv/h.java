package lv;

import com.google.firebase.crashlytics.internal.common.e0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f90818a;

    h(e0 e0Var) {
        this.f90818a = e0Var;
    }

    private static i a(int i11) {
        if (i11 == 3) {
            return new m();
        }
        bv.g.f().d("Could not determine SettingsJsonTransform for settings version " + i11 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f90818a, jSONObject);
    }
}

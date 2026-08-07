package he0;

import expo.modules.contacts.Columns;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f72626a;

    public a(JSONObject jSONObject) {
        this.f72626a = jSONObject;
    }

    public JSONObject a() {
        return this.f72626a;
    }

    public String b() {
        try {
            return this.f72626a.getString(Columns.DISPLAY_NAME);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String c() {
        try {
            return this.f72626a.getString("id");
        } catch (JSONException unused) {
            return WebrtcBuildVersion.maint_version;
        }
    }

    public String d() {
        try {
            return this.f72626a.getString("vin");
        } catch (JSONException unused) {
            return null;
        }
    }

    public void e() {
        this.f72626a.remove("charge_state");
        this.f72626a.remove("climate_state");
        this.f72626a.remove("drive_state");
        this.f72626a.remove("gui_settings");
        this.f72626a.remove("vehicle_config");
        this.f72626a.remove("vehicle_state");
    }

    public String toString() {
        return this.f72626a.toString();
    }
}

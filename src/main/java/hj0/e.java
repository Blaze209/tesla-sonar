package hj0;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Bundle f72945a;

    public e(Bundle bundle) {
        this.f72945a = bundle;
    }

    public String a() {
        return this.f72945a.getString("channelId");
    }

    public String b() {
        return this.f72945a.getString("description");
    }

    public boolean c() {
        return this.f72945a.getBoolean("enableLights");
    }

    public boolean d() {
        return this.f72945a.getBoolean("enableVibration");
    }

    public String e() {
        return this.f72945a.getString("groupId");
    }

    public int f() {
        return (int) this.f72945a.getDouble("importance");
    }

    public String g() {
        return this.f72945a.getString("lightColor");
    }

    public String h() {
        return this.f72945a.getString("name");
    }

    public boolean i() {
        return this.f72945a.getBoolean("showBadge");
    }

    public String j() {
        return this.f72945a.getString("soundFile");
    }

    public List k() {
        return this.f72945a.getParcelableArrayList("vibrationPattern");
    }

    public boolean l() {
        return this.f72945a.containsKey("description");
    }

    public boolean m() {
        return this.f72945a.containsKey("enableLights");
    }

    public boolean n() {
        return this.f72945a.containsKey("enableVibration");
    }

    public boolean o() {
        return this.f72945a.containsKey("groupId");
    }

    public boolean p() {
        return this.f72945a.containsKey("lightColor");
    }

    public boolean q() {
        return this.f72945a.containsKey("showBadge");
    }

    public boolean r() {
        return this.f72945a.containsKey("soundFile");
    }

    public boolean s() {
        return this.f72945a.containsKey("vibrationPattern");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(1024);
        for (String str : this.f72945a.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(this.f72945a.get(str));
            sb2.append(", ");
        }
        return sb2.toString();
    }
}

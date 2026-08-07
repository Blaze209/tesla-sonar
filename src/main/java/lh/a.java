package lh;

import android.text.TextUtils;
import di.g;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f89985a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f89986b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f89987c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f89988d = null;

    public String a() {
        return this.f89985a;
    }

    public void b(String str) {
        g.h("mspl", "DebugUpgradeWarnData setData:" + str);
        this.f89985a = str;
        this.f89986b = null;
        this.f89987c = null;
        this.f89988d = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() >= 3) {
                this.f89986b = jSONArray.getString(0);
                this.f89988d = jSONArray.getString(1);
                this.f89987c = jSONArray.getString(2);
            }
        } catch (Throwable th2) {
            g.d(th2);
        }
    }
}

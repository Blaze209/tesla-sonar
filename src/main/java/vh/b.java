package vh;

import android.text.TextUtils;
import di.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f119329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f119330b;

    public b(String str, String str2) {
        this.f119329a = str;
        this.f119330b = str2;
    }

    public String a() {
        return this.f119330b;
    }

    public String b() {
        return this.f119329a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f119330b)) {
            return null;
        }
        try {
            return new JSONObject(this.f119330b);
        } catch (Exception e11) {
            g.d(e11);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f119329a, this.f119330b);
    }
}

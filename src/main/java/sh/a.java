package sh;

import android.content.Context;
import android.content.SharedPreferences;
import qh.f;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f111157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f111158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f111159c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f111160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111161e;

    public a(Context context, String str, String str2, boolean z11, boolean z12) {
        this.f111158b = null;
        this.f111161e = z12;
        this.f111157a = str2;
        this.f111160d = context;
        if (context != null) {
            this.f111158b = context.getSharedPreferences(str2, 0);
        }
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.f111158b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.b(string)) {
                return string;
            }
        }
        return "";
    }

    public final void b() {
        SharedPreferences sharedPreferences;
        if (this.f111159c != null || (sharedPreferences = this.f111158b) == null) {
            return;
        }
        this.f111159c = sharedPreferences.edit();
    }

    public void c(String str, String str2) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f111159c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    public void d(String str) {
        if (f.b(str) || str.equals("t")) {
            return;
        }
        b();
        SharedPreferences.Editor editor = this.f111159c;
        if (editor != null) {
            editor.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public boolean e() {
        boolean z11;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f111159c;
        if (editor == null) {
            z11 = true;
        } else {
            if (!this.f111161e && this.f111158b != null) {
                editor.putLong("t", jCurrentTimeMillis);
            }
            if (this.f111159c.commit()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (this.f111158b != null && (context = this.f111160d) != null) {
            this.f111158b = context.getSharedPreferences(this.f111157a, 0);
        }
        return z11;
    }
}

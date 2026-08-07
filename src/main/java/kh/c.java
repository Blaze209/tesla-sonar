package kh;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f86084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f86085b;

    public void a(boolean z11) {
        this.f86085b = Boolean.valueOf(z11);
    }

    public boolean b() {
        return this.f86085b != null;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f86084a, str);
    }

    public void d(String str) {
        this.f86084a = str;
    }

    public boolean e() {
        Boolean bool = this.f86085b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}

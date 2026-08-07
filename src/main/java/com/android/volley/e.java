package com.android.volley;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20185b;

    public e(String str, String str2) {
        this.f20184a = str;
        this.f20185b = str2;
    }

    public final String a() {
        return this.f20184a;
    }

    public final String b() {
        return this.f20185b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f20184a, eVar.f20184a) && TextUtils.equals(this.f20185b, eVar.f20185b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f20184a.hashCode() * 31) + this.f20185b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f20184a + ",value=" + this.f20185b + "]";
    }
}

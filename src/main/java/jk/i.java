package jk;

import android.net.Uri;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f83927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f83928b;

    public i(String str) {
        this(str, false);
    }

    @Override // jk.d
    public String a() {
        return this.f83927a;
    }

    @Override // jk.d
    public boolean b() {
        return this.f83928b;
    }

    @Override // jk.d
    public boolean c(Uri uri) {
        return this.f83927a.contains(uri.toString());
    }

    @Override // jk.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f83927a.equals(((i) obj).f83927a);
        }
        return false;
    }

    @Override // jk.d
    public int hashCode() {
        return this.f83927a.hashCode();
    }

    public String toString() {
        return this.f83927a;
    }

    public i(String str, boolean z11) {
        this.f83927a = (String) k.g(str);
        this.f83928b = z11;
    }
}

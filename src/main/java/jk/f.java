package jk;

import android.net.Uri;
import java.util.List;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<d> f83924a;

    public f(List<d> list) {
        this.f83924a = (List) k.g(list);
    }

    @Override // jk.d
    public String a() {
        return this.f83924a.get(0).a();
    }

    @Override // jk.d
    public boolean b() {
        return false;
    }

    @Override // jk.d
    public boolean c(Uri uri) {
        for (int i11 = 0; i11 < this.f83924a.size(); i11++) {
            if (this.f83924a.get(i11).c(uri)) {
                return true;
            }
        }
        return false;
    }

    public List<d> d() {
        return this.f83924a;
    }

    @Override // jk.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f83924a.equals(((f) obj).f83924a);
        }
        return false;
    }

    @Override // jk.d
    public int hashCode() {
        return this.f83924a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f83924a.toString();
    }
}

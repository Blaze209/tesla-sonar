package qq;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zq.a f105839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zq.a f105840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f105841d;

    c(Context context, zq.a aVar, zq.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f105838a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f105839b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f105840c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f105841d = str;
    }

    @Override // qq.h
    public Context b() {
        return this.f105838a;
    }

    @Override // qq.h
    @NonNull
    public String c() {
        return this.f105841d;
    }

    @Override // qq.h
    public zq.a d() {
        return this.f105840c;
    }

    @Override // qq.h
    public zq.a e() {
        return this.f105839b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f105838a.equals(hVar.b()) && this.f105839b.equals(hVar.e()) && this.f105840c.equals(hVar.d()) && this.f105841d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f105838a.hashCode() ^ 1000003) * 1000003) ^ this.f105839b.hashCode()) * 1000003) ^ this.f105840c.hashCode()) * 1000003) ^ this.f105841d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f105838a + ", wallClock=" + this.f105839b + ", monotonicClock=" + this.f105840c + ", backendName=" + this.f105841d + "}";
    }
}

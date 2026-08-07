package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class d<T> extends x0.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f3150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3151c;

    d(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f3149a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f3150b = cls;
        this.f3151c = obj;
    }

    @Override // androidx.camera.core.impl.x0.a
    @NonNull
    public String c() {
        return this.f3149a;
    }

    @Override // androidx.camera.core.impl.x0.a
    public Object d() {
        return this.f3151c;
    }

    @Override // androidx.camera.core.impl.x0.a
    @NonNull
    public Class<T> e() {
        return this.f3150b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0.a) {
            x0.a aVar = (x0.a) obj;
            if (this.f3149a.equals(aVar.c()) && this.f3150b.equals(aVar.e()) && ((obj2 = this.f3151c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f3149a.hashCode() ^ 1000003) * 1000003) ^ this.f3150b.hashCode()) * 1000003;
        Object obj = this.f3151c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f3149a + ", valueClass=" + this.f3150b + ", token=" + this.f3151c + "}";
    }
}

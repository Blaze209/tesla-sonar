package tk;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SoftReference<T> f114651a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SoftReference<T> f114652b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SoftReference<T> f114653c = null;

    public void a() {
        SoftReference<T> softReference = this.f114651a;
        if (softReference != null) {
            softReference.clear();
            this.f114651a = null;
        }
        SoftReference<T> softReference2 = this.f114652b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f114652b = null;
        }
        SoftReference<T> softReference3 = this.f114653c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f114653c = null;
        }
    }

    public T b() {
        SoftReference<T> softReference = this.f114651a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(T t11) {
        this.f114651a = new SoftReference<>(t11);
        this.f114652b = new SoftReference<>(t11);
        this.f114653c = new SoftReference<>(t11);
    }
}

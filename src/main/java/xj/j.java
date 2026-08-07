package xj;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f123611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f123612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f123613c;

    public j() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        this.f123611a = cls;
        this.f123612b = cls2;
        this.f123613c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f123611a.equals(jVar.f123611a) && this.f123612b.equals(jVar.f123612b) && l.e(this.f123613c, jVar.f123613c);
    }

    public int hashCode() {
        int iHashCode = ((this.f123611a.hashCode() * 31) + this.f123612b.hashCode()) * 31;
        Class<?> cls = this.f123613c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f123611a + ", second=" + this.f123612b + CoreConstants.CURLY_RIGHT;
    }

    public j(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}

package dj;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<g<?>, Object> f60690b = new xj.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(@NonNull g<T> gVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        for (int i11 = 0; i11 < this.f60690b.getSize(); i11++) {
            g(this.f60690b.i(i11), this.f60690b.m(i11), messageDigest);
        }
    }

    public <T> T c(@NonNull g<T> gVar) {
        return this.f60690b.containsKey(gVar) ? (T) this.f60690b.get(gVar) : gVar.c();
    }

    public void d(@NonNull h hVar) {
        this.f60690b.j(hVar.f60690b);
    }

    public h e(@NonNull g<?> gVar) {
        this.f60690b.remove(gVar);
        return this;
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f60690b.equals(((h) obj).f60690b);
        }
        return false;
    }

    @NonNull
    public <T> h f(@NonNull g<T> gVar, @NonNull T t11) {
        this.f60690b.put(gVar, t11);
        return this;
    }

    @Override // dj.e
    public int hashCode() {
        return this.f60690b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f60690b + CoreConstants.CURLY_RIGHT;
    }
}

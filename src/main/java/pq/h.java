package pq;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.c f103615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f103616b;

    public h(@NonNull nq.c cVar, @NonNull byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f103615a = cVar;
        this.f103616b = bArr;
    }

    public byte[] a() {
        return this.f103616b;
    }

    public nq.c b() {
        return this.f103615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f103615a.equals(hVar.f103615a)) {
            return Arrays.equals(this.f103616b, hVar.f103616b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f103615a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f103616b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f103615a + ", bytes=[...]}";
    }
}

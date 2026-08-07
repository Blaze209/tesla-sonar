package oq;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f98408a;

    d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f98408a = list;
    }

    @Override // oq.n
    @NonNull
    public List<u> c() {
        return this.f98408a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f98408a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f98408a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f98408a + "}";
    }
}

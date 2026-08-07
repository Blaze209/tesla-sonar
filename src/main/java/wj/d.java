package wj;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import dj.e;
import java.security.MessageDigest;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f121980b;

    public d(@NonNull Object obj) {
        this.f121980b = k.d(obj);
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f121980b.toString().getBytes(e.f60683a));
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f121980b.equals(((d) obj).f121980b);
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return this.f121980b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f121980b + CoreConstants.CURLY_RIGHT;
    }
}

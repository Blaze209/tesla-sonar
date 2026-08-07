package hp;

import gp.f;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class a implements f, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f73263a;

    public a(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f73263a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f73263a.equals(((a) obj).f73263a);
    }

    public final int hashCode() {
        return this.f73263a.hashCode();
    }

    public final String toString() {
        return this.f73263a;
    }
}

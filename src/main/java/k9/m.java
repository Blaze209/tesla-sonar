package k9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f85437c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f85436b = str;
        this.f85437c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f85436b, mVar.f85436b) && Arrays.equals(this.f85437c, mVar.f85437c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f85436b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f85437c);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": owner=" + this.f85436b;
    }
}

package k9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f85402b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f85402b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f85426a.equals(bVar.f85426a) && Arrays.equals(this.f85402b, bVar.f85402b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f85426a.hashCode()) * 31) + Arrays.hashCode(this.f85402b);
    }
}

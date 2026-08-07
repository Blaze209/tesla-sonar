package k9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f85420e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f85417b = str;
        this.f85418c = str2;
        this.f85419d = str3;
        this.f85420e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f85417b, fVar.f85417b) && Objects.equals(this.f85418c, fVar.f85418c) && Objects.equals(this.f85419d, fVar.f85419d) && Arrays.equals(this.f85420e, fVar.f85420e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f85417b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85418c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85419d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f85420e);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": mimeType=" + this.f85417b + ", filename=" + this.f85418c + ", description=" + this.f85419d;
    }
}

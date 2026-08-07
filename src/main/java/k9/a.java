package k9;

import java.util.Arrays;
import java.util.Objects;
import p7.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f85401e;

    public a(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f85398b = str;
        this.f85399c = str2;
        this.f85400d = i11;
        this.f85401e = bArr;
    }

    @Override // p7.f0.a
    public void I(e0.b bVar) {
        bVar.K(this.f85401e, this.f85400d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f85400d == aVar.f85400d && Objects.equals(this.f85398b, aVar.f85398b) && Objects.equals(this.f85399c, aVar.f85399c) && Arrays.equals(this.f85401e, aVar.f85401e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (527 + this.f85400d) * 31;
        String str = this.f85398b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85399c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f85401e);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": mimeType=" + this.f85398b + ", description=" + this.f85399c;
    }
}

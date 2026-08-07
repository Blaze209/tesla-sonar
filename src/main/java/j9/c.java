package j9;

import java.util.Arrays;
import p7.e0;
import p7.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83127c;

    public c(byte[] bArr, String str, String str2) {
        this.f83125a = bArr;
        this.f83126b = str;
        this.f83127c = str2;
    }

    @Override // p7.f0.a
    public void I(e0.b bVar) {
        String str = this.f83126b;
        if (str != null) {
            bVar.q0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f83125a, ((c) obj).f83125a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f83125a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f83126b, this.f83127c, Integer.valueOf(this.f83125a.length));
    }
}

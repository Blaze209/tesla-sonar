package k9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f85407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f85408g;

    public c(String str, int i11, int i12, long j11, long j12, i[] iVarArr) {
        super("CHAP");
        this.f85403b = str;
        this.f85404c = i11;
        this.f85405d = i12;
        this.f85406e = j11;
        this.f85407f = j12;
        this.f85408g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f85404c == cVar.f85404c && this.f85405d == cVar.f85405d && this.f85406e == cVar.f85406e && this.f85407f == cVar.f85407f && Objects.equals(this.f85403b, cVar.f85403b) && Arrays.equals(this.f85408g, cVar.f85408g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((((((527 + this.f85404c) * 31) + this.f85405d) * 31) + ((int) this.f85406e)) * 31) + ((int) this.f85407f)) * 31;
        String str = this.f85403b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}

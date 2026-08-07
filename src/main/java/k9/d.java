package k9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f85412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f85413f;

    public d(String str, boolean z11, boolean z12, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f85409b = str;
        this.f85410c = z11;
        this.f85411d = z12;
        this.f85412e = strArr;
        this.f85413f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f85410c == dVar.f85410c && this.f85411d == dVar.f85411d && Objects.equals(this.f85409b, dVar.f85409b) && Arrays.equals(this.f85412e, dVar.f85412e) && Arrays.equals(this.f85413f, dVar.f85413f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((527 + (this.f85410c ? 1 : 0)) * 31) + (this.f85411d ? 1 : 0)) * 31;
        String str = this.f85409b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}

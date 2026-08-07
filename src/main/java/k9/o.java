package k9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85442c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f85441b = str2;
        this.f85442c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f85426a.equals(oVar.f85426a) && Objects.equals(this.f85441b, oVar.f85441b) && Objects.equals(this.f85442c, oVar.f85442c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f85426a.hashCode()) * 31;
        String str = this.f85441b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85442c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": url=" + this.f85442c;
    }
}

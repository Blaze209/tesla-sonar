package k9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85430d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f85428b = str;
        this.f85429c = str2;
        this.f85430d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f85429c, kVar.f85429c) && Objects.equals(this.f85428b, kVar.f85428b) && Objects.equals(this.f85430d, kVar.f85430d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f85428b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85429c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85430d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": domain=" + this.f85428b + ", description=" + this.f85429c;
    }
}

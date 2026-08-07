package k9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85416d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f85414b = str;
        this.f85415c = str2;
        this.f85416d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f85415c, eVar.f85415c) && Objects.equals(this.f85414b, eVar.f85414b) && Objects.equals(this.f85416d, eVar.f85416d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f85414b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85415c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85416d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // k9.i
    public String toString() {
        return this.f85426a + ": language=" + this.f85414b + ", description=" + this.f85415c + ", text=" + this.f85416d;
    }
}

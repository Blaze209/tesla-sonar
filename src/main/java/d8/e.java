package d8;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59808c;

    public e(String str, String str2, String str3) {
        this.f59806a = str;
        this.f59807b = str2;
        this.f59808c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f59806a, eVar.f59806a) && Objects.equals(this.f59807b, eVar.f59807b) && Objects.equals(this.f59808c, eVar.f59808c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f59806a.hashCode() * 31;
        String str = this.f59807b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f59808c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

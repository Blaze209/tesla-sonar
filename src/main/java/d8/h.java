package d8;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f59821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f59823e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f59819a = str;
        this.f59820b = str2;
        this.f59821c = str3;
        this.f59822d = str4;
        this.f59823e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f59819a, hVar.f59819a) && Objects.equals(this.f59820b, hVar.f59820b) && Objects.equals(this.f59821c, hVar.f59821c) && Objects.equals(this.f59822d, hVar.f59822d) && Objects.equals(this.f59823e, hVar.f59823e);
    }

    public int hashCode() {
        String str = this.f59819a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f59820b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f59821c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f59822d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f59823e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}

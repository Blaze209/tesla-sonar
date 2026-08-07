package d8;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59777d;

    public b(String str, String str2, int i11, int i12) {
        this.f59774a = str;
        this.f59775b = str2;
        this.f59776c = i11;
        this.f59777d = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f59776c == bVar.f59776c && this.f59777d == bVar.f59777d && Objects.equals(this.f59774a, bVar.f59774a) && Objects.equals(this.f59775b, bVar.f59775b);
    }

    public int hashCode() {
        return Objects.hash(this.f59774a, this.f59775b, Integer.valueOf(this.f59776c), Integer.valueOf(this.f59777d));
    }
}

package yx;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f125983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.b f125984b;

    e(List list, d.b bVar) {
        this.f125983a = list;
        this.f125984b = bVar;
    }

    @Override // yx.d
    public final List<d.a> b() {
        return this.f125983a;
    }

    @Override // yx.d
    public final d.b c() {
        return this.f125984b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            List list = this.f125983a;
            if (list != null ? list.equals(dVar.b()) : dVar.b() == null) {
                d.b bVar = this.f125984b;
                if (bVar != null ? bVar.equals(dVar.c()) : dVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f125983a;
        int iHashCode = list == null ? 0 : list.hashCode();
        d.b bVar = this.f125984b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        d.b bVar = this.f125984b;
        String strValueOf = String.valueOf(this.f125983a);
        String strValueOf2 = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38 + strValueOf2.length() + 1);
        sb2.append("GmsDocumentScanningResult{pages=");
        sb2.append(strValueOf);
        sb2.append(", pdf=");
        sb2.append(strValueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}

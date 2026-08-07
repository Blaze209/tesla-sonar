package qw;

/* JADX INFO: loaded from: classes5.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106180b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f106179a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f106180b = str2;
    }

    @Override // qw.f
    public String b() {
        return this.f106179a;
    }

    @Override // qw.f
    public String c() {
        return this.f106180b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f106179a.equals(fVar.b()) && this.f106180b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f106179a.hashCode() ^ 1000003) * 1000003) ^ this.f106180b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f106179a + ", version=" + this.f106180b + "}";
    }
}

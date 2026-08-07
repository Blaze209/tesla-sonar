package gv;

/* JADX INFO: loaded from: classes5.dex */
final class e0 extends g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69798c;

    e0(String str, String str2, boolean z11) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f69796a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f69797b = str2;
        this.f69798c = z11;
    }

    @Override // gv.g0.c
    public boolean b() {
        return this.f69798c;
    }

    @Override // gv.g0.c
    public String c() {
        return this.f69797b;
    }

    @Override // gv.g0.c
    public String d() {
        return this.f69796a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0.c) {
            g0.c cVar = (g0.c) obj;
            if (this.f69796a.equals(cVar.d()) && this.f69797b.equals(cVar.c()) && this.f69798c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f69796a.hashCode() ^ 1000003) * 1000003) ^ this.f69797b.hashCode()) * 1000003) ^ (this.f69798c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f69796a + ", osCodeName=" + this.f69797b + ", isRooted=" + this.f69798c + "}";
    }
}

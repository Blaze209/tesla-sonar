package eq;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f63129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63130d;

    public d() {
        this(null, null);
    }

    public String a() {
        return this.f63127a;
    }

    public String b() {
        return this.f63128b;
    }

    public c c() {
        return this.f63129c;
    }

    public String d() {
        return this.f63130d;
    }

    public void e(String str) {
        this.f63127a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f63127a;
        if (str == null) {
            if (dVar.f63127a != null) {
                return false;
            }
        } else if (!str.equals(dVar.f63127a)) {
            return false;
        }
        String str2 = this.f63128b;
        if (str2 == null) {
            if (dVar.f63128b != null) {
                return false;
            }
        } else if (!str2.equals(dVar.f63128b)) {
            return false;
        }
        c cVar = this.f63129c;
        if (cVar == null) {
            if (dVar.f63129c != null) {
                return false;
            }
        } else if (!cVar.equals(dVar.f63129c)) {
            return false;
        }
        String str3 = this.f63130d;
        if (str3 == null) {
            if (dVar.f63130d != null) {
                return false;
            }
        } else if (!str3.equals(dVar.f63130d)) {
            return false;
        }
        return true;
    }

    public void f(String str) {
        this.f63128b = str;
    }

    public void g(String str) {
        this.f63130d = str;
    }

    public int hashCode() {
        String str = this.f63127a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f63128b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f63129c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f63130d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VObjectProperty [group=" + this.f63127a + ", name=" + this.f63128b + ", parameters=" + this.f63129c + ", value=" + this.f63130d + "]";
    }

    public d(String str, String str2) {
        this(null, str, str2);
    }

    public d(String str, String str2, String str3) {
        this(str, str2, new c(), str3);
    }

    public d(String str, String str2, c cVar, String str3) {
        this.f63127a = str;
        this.f63128b = str2;
        this.f63129c = cVar;
        this.f63130d = str3;
    }
}

package xz;

/* JADX INFO: loaded from: classes6.dex */
abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f124301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f124302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f124303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f124304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f124305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f124306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f124307g;

    z(int i11, int i12, String str, String str2, String str3, long j11) {
        this.f124301a = i11;
        this.f124302b = i12;
        this.f124303c = str;
        this.f124304d = str2;
        this.f124305e = str3;
        this.f124306f = j11;
    }

    int a() {
        if (this.f124307g == 0) {
            this.f124307g = b0.c(this.f124305e);
        }
        return this.f124307g;
    }
}

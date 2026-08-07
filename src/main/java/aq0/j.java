package aq0;

/* JADX INFO: loaded from: classes9.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f14946a = a.INVALID;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final StringBuilder f14947b = new StringBuilder(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f14948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f14949d;

    enum a {
        INVALID,
        TOKEN,
        EOF,
        EORECORD,
        COMMENT
    }

    j() {
    }

    void a() {
        this.f14947b.setLength(0);
        this.f14946a = a.INVALID;
        this.f14948c = false;
        this.f14949d = false;
    }

    public String toString() {
        return this.f14946a.name() + " [" + this.f14947b.toString() + "]";
    }
}

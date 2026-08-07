package net.time4j.calendar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j {

    static class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f94066a;

        a(int i11) {
            this.f94066a = i11;
        }

        @Override // net.time4j.calendar.j
        public int d() {
            return net.time4j.base.c.e(this.f94066a, 2636);
        }
    }

    public static j a(int i11) {
        if (i11 >= 1) {
            return b(net.time4j.base.c.e(i11, -2333));
        }
        throw new IllegalArgumentException("Dangi year must not be smaller than 1: " + i11);
    }

    public static j b(int i11) {
        return new a(i11);
    }

    public final int c() {
        return net.time4j.base.c.a(d(), 60) + 1;
    }

    public abstract int d();

    public final c e() {
        int iC = net.time4j.base.c.c(d() + 1, 60);
        return c.n(iC != 0 ? iC : 60);
    }
}

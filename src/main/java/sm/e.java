package sm;

import java.io.IOException;
import java.io.InputStream;
import pk.k;
import pk.p;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f111441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sk.a f111442h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111437c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111436b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111438d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111440f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111439e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111435a = 0;

    public e(sk.a aVar) {
        this.f111442h = (sk.a) k.g(aVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    private boolean a(InputStream inputStream) throws X {
        int i11;
        int i12 = this.f111439e;
        while (this.f111435a != 6 && (i11 = inputStream.read()) != -1) {
            try {
                int i13 = this.f111437c;
                this.f111437c = i13 + 1;
                if (this.f111441g) {
                    this.f111435a = 6;
                    this.f111441g = false;
                    return false;
                }
                int i14 = this.f111435a;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 4) {
                                    this.f111435a = 5;
                                } else if (i14 != 5) {
                                    k.i(false);
                                } else {
                                    int i15 = ((this.f111436b << 8) + i11) - 2;
                                    xk.c.a(inputStream, i15);
                                    this.f111437c += i15;
                                    this.f111435a = 2;
                                }
                            } else if (i11 == 255) {
                                this.f111435a = 3;
                            } else if (i11 == 0) {
                                this.f111435a = 2;
                            } else if (i11 == 217) {
                                this.f111441g = true;
                                f(i13 - 1);
                                this.f111435a = 2;
                            } else {
                                if (i11 == 218) {
                                    f(i13 - 1);
                                }
                                if (b(i11)) {
                                    this.f111435a = 4;
                                } else {
                                    this.f111435a = 2;
                                }
                            }
                        } else if (i11 == 255) {
                            this.f111435a = 3;
                        }
                    } else if (i11 == 216) {
                        this.f111435a = 2;
                    } else {
                        this.f111435a = 6;
                    }
                } else if (i11 == 255) {
                    this.f111435a = 1;
                } else {
                    this.f111435a = 6;
                }
                this.f111436b = i11;
            } catch (IOException e11) {
                p.a(e11);
            }
        }
        return (this.f111435a == 6 || this.f111439e == i12) ? false : true;
    }

    private static boolean b(int i11) {
        if (i11 == 1) {
            return false;
        }
        return ((i11 >= 208 && i11 <= 215) || i11 == 217 || i11 == 216) ? false : true;
    }

    private void f(int i11) {
        int i12 = this.f111438d;
        if (i12 > 0) {
            this.f111440f = i11;
        }
        this.f111438d = i12 + 1;
        this.f111439e = i12;
    }

    public int c() {
        return this.f111440f;
    }

    public int d() {
        return this.f111439e;
    }

    public boolean e() {
        return this.f111441g;
    }

    public boolean g(um.k kVar) {
        if (this.f111435a == 6 || kVar.c0() <= this.f111437c) {
            return false;
        }
        sk.g gVar = new sk.g(kVar.T(), this.f111442h.get(16384), this.f111442h);
        try {
            xk.c.a(gVar, this.f111437c);
            return a(gVar);
        } catch (IOException e11) {
            p.a(e11);
            return false;
        } finally {
            pk.b.b(gVar);
        }
    }
}

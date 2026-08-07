package com.squareup.moshi;

import ch.qos.logback.core.FileAppender;
import okio.r0;
import okio.s0;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
final class p implements r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final okio.k f49441h = okio.k.f("[]{}\"'/#");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final okio.k f49442i = okio.k.f("'\\");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final okio.k f49443j = okio.k.f("\"\\");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final okio.k f49444k = okio.k.f("\r\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final okio.k f49445l = okio.k.f(Marker.ANY_MARKER);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final okio.k f49446m = okio.k.f97943e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okio.j f49447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okio.h f49448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final okio.h f49449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private okio.k f49450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f49452f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49453g = false;

    p(okio.j jVar, okio.h hVar, okio.k kVar, int i11) {
        this.f49447a = jVar;
        this.f49448b = jVar.l();
        this.f49449c = hVar;
        this.f49450d = kVar;
        this.f49451e = i11;
    }

    private void c(long j11) {
        while (true) {
            long j12 = this.f49452f;
            if (j12 >= j11) {
                return;
            }
            okio.k kVar = this.f49450d;
            okio.k kVar2 = f49446m;
            if (kVar == kVar2) {
                return;
            }
            if (j12 == this.f49448b.getSize()) {
                if (this.f49452f > 0) {
                    return;
                } else {
                    this.f49447a.D2(1L);
                }
            }
            long J = this.f49448b.J(this.f49450d, this.f49452f);
            if (J == -1) {
                this.f49452f = this.f49448b.getSize();
            } else {
                byte bH = this.f49448b.H(J);
                okio.k kVar3 = this.f49450d;
                okio.k kVar4 = f49441h;
                if (kVar3 == kVar4) {
                    if (bH == 34) {
                        this.f49450d = f49443j;
                        this.f49452f = J + 1;
                    } else if (bH == 35) {
                        this.f49450d = f49444k;
                        this.f49452f = J + 1;
                    } else if (bH == 39) {
                        this.f49450d = f49442i;
                        this.f49452f = J + 1;
                    } else if (bH != 47) {
                        if (bH != 91) {
                            if (bH != 93) {
                                if (bH != 123) {
                                    if (bH != 125) {
                                    }
                                }
                            }
                            int i11 = this.f49451e - 1;
                            this.f49451e = i11;
                            if (i11 == 0) {
                                this.f49450d = kVar2;
                            }
                            this.f49452f = J + 1;
                        }
                        this.f49451e++;
                        this.f49452f = J + 1;
                    } else {
                        long j13 = 2 + J;
                        this.f49447a.D2(j13);
                        long j14 = J + 1;
                        byte bH2 = this.f49448b.H(j14);
                        if (bH2 == 47) {
                            this.f49450d = f49444k;
                            this.f49452f = j13;
                        } else if (bH2 == 42) {
                            this.f49450d = f49445l;
                            this.f49452f = j13;
                        } else {
                            this.f49452f = j14;
                        }
                    }
                } else if (kVar3 == f49442i || kVar3 == f49443j) {
                    if (bH == 92) {
                        long j15 = J + 2;
                        this.f49447a.D2(j15);
                        this.f49452f = j15;
                    } else {
                        if (this.f49451e > 0) {
                            kVar2 = kVar4;
                        }
                        this.f49450d = kVar2;
                        this.f49452f = J + 1;
                    }
                } else if (kVar3 == f49445l) {
                    long j16 = 2 + J;
                    this.f49447a.D2(j16);
                    long j17 = J + 1;
                    if (this.f49448b.H(j17) == 47) {
                        this.f49452f = j16;
                        this.f49450d = kVar4;
                    } else {
                        this.f49452f = j17;
                    }
                } else {
                    if (kVar3 != f49444k) {
                        throw new AssertionError();
                    }
                    this.f49452f = J + 1;
                    this.f49450d = kVar4;
                }
            }
        }
    }

    @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49453g = true;
    }

    public void n() {
        this.f49453g = true;
        while (this.f49450d != f49446m) {
            c(FileAppender.DEFAULT_BUFFER_SIZE);
            this.f49447a.skip(this.f49452f);
        }
    }

    @Override // okio.r0
    public long read(okio.h hVar, long j11) {
        if (this.f49453g) {
            throw new IllegalStateException("closed");
        }
        if (j11 == 0) {
            return 0L;
        }
        if (!this.f49449c.T2()) {
            long j12 = this.f49449c.read(hVar, j11);
            long j13 = j11 - j12;
            if (!this.f49448b.T2()) {
                long j14 = read(hVar, j13);
                if (j14 != -1) {
                    return j14 + j12;
                }
            }
            return j12;
        }
        c(j11);
        long j15 = this.f49452f;
        if (j15 == 0) {
            if (this.f49450d == f49446m) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j11, j15);
        hVar.write(this.f49448b, jMin);
        this.f49452f -= jMin;
        return jMin;
    }

    @Override // okio.r0
    /* JADX INFO: renamed from: timeout */
    public s0 getF97915a() {
        return this.f49447a.getF97915a();
    }
}

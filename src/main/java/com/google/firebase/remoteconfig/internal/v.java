package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes5.dex */
public class v implements rw.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f44764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rw.i f44766c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f44767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private rw.i f44769c;

        public v a() {
            return new v(this.f44767a, this.f44768b, this.f44769c);
        }

        b b(rw.i iVar) {
            this.f44769c = iVar;
            return this;
        }

        b c(int i11) {
            this.f44768b = i11;
            return this;
        }

        public b d(long j11) {
            this.f44767a = j11;
            return this;
        }

        private b() {
        }
    }

    static b b() {
        return new b();
    }

    @Override // rw.h
    public int a() {
        return this.f44765b;
    }

    private v(long j11, int i11, rw.i iVar) {
        this.f44764a = j11;
        this.f44765b = i11;
        this.f44766c = iVar;
    }
}

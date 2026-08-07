package com.google.android.exoplayer2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class t1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final com.google.android.exoplayer2.source.o.b f40664t = new com.google.android.exoplayer2.source.o.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f40665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.o.b f40666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f40670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final es.w f40672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qs.b0 f40673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<ur.a> f40674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.o.b f40675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f40676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f40677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u1 f40678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f40679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f40680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f40681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f40682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f40683s;

    public t1(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar, long j11, long j12, int i11, ExoPlaybackException exoPlaybackException, boolean z11, es.w wVar, qs.b0 b0Var, List<ur.a> list, com.google.android.exoplayer2.source.o.b bVar2, boolean z12, int i12, u1 u1Var, long j13, long j14, long j15, long j16, boolean z13) {
        this.f40665a = f2Var;
        this.f40666b = bVar;
        this.f40667c = j11;
        this.f40668d = j12;
        this.f40669e = i11;
        this.f40670f = exoPlaybackException;
        this.f40671g = z11;
        this.f40672h = wVar;
        this.f40673i = b0Var;
        this.f40674j = list;
        this.f40675k = bVar2;
        this.f40676l = z12;
        this.f40677m = i12;
        this.f40678n = u1Var;
        this.f40680p = j13;
        this.f40681q = j14;
        this.f40682r = j15;
        this.f40683s = j16;
        this.f40679o = z13;
    }

    public static t1 k(qs.b0 b0Var) {
        f2 f2Var = f2.f39911a;
        com.google.android.exoplayer2.source.o.b bVar = f40664t;
        return new t1(f2Var, bVar, -9223372036854775807L, 0L, 1, null, false, es.w.f63210d, b0Var, com.google.common.collect.x.r(), bVar, false, 0, u1.f40753d, 0L, 0L, 0L, 0L, false);
    }

    public static com.google.android.exoplayer2.source.o.b l() {
        return f40664t;
    }

    public t1 a() {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, m(), SystemClock.elapsedRealtime(), this.f40679o);
    }

    public t1 b(boolean z11) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, z11, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 c(com.google.android.exoplayer2.source.o.b bVar) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, bVar, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 d(com.google.android.exoplayer2.source.o.b bVar, long j11, long j12, long j13, long j14, es.w wVar, qs.b0 b0Var, List<ur.a> list) {
        return new t1(this.f40665a, bVar, j12, j13, this.f40669e, this.f40670f, this.f40671g, wVar, b0Var, list, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, j14, j11, SystemClock.elapsedRealtime(), this.f40679o);
    }

    public t1 e(boolean z11, int i11) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, z11, i11, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 f(ExoPlaybackException exoPlaybackException) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, exoPlaybackException, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 g(u1 u1Var) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, u1Var, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 h(int i11) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, i11, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public t1 i(boolean z11) {
        return new t1(this.f40665a, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, z11);
    }

    public t1 j(f2 f2Var) {
        return new t1(f2Var, this.f40666b, this.f40667c, this.f40668d, this.f40669e, this.f40670f, this.f40671g, this.f40672h, this.f40673i, this.f40674j, this.f40675k, this.f40676l, this.f40677m, this.f40678n, this.f40680p, this.f40681q, this.f40682r, this.f40683s, this.f40679o);
    }

    public long m() {
        long j11;
        long j12;
        if (!n()) {
            return this.f40682r;
        }
        do {
            j11 = this.f40683s;
            j12 = this.f40682r;
        } while (j11 != this.f40683s);
        return ts.p0.D0(ts.p0.Z0(j12) + ((long) ((SystemClock.elapsedRealtime() - j11) * this.f40678n.f40757a)));
    }

    public boolean n() {
        return this.f40669e == 3 && this.f40676l && this.f40677m == 0;
    }

    public void o(long j11) {
        this.f40682r = j11;
        this.f40683s = SystemClock.elapsedRealtime();
    }
}

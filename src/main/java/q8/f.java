package q8;

import com.google.common.collect.c0;
import com.google.common.collect.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<t9.d> f104894a = new ArrayList<>();

    private int f(long j11) {
        for (int i11 = 0; i11 < this.f104894a.size(); i11++) {
            if (j11 < this.f104894a.get(i11).f112956b) {
                return i11;
            }
        }
        return this.f104894a.size();
    }

    @Override // q8.a
    public x<r7.a> a(long j11) {
        int iF = f(j11);
        if (iF == 0) {
            return x.r();
        }
        t9.d dVar = this.f104894a.get(iF - 1);
        long j12 = dVar.f112958d;
        return (j12 == -9223372036854775807L || j11 < j12) ? dVar.f112955a : x.r();
    }

    @Override // q8.a
    public long b(long j11) {
        if (this.f104894a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j11 < this.f104894a.get(0).f112956b) {
            return this.f104894a.get(0).f112956b;
        }
        for (int i11 = 1; i11 < this.f104894a.size(); i11++) {
            t9.d dVar = this.f104894a.get(i11);
            if (j11 < dVar.f112956b) {
                long j12 = this.f104894a.get(i11 - 1).f112958d;
                return (j12 == -9223372036854775807L || j12 <= j11 || j12 >= dVar.f112956b) ? dVar.f112956b : j12;
            }
        }
        long j13 = ((t9.d) c0.d(this.f104894a)).f112958d;
        if (j13 == -9223372036854775807L || j11 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // q8.a
    public void c(long j11) {
        int iF = f(j11);
        if (iF == 0) {
            return;
        }
        long j12 = this.f104894a.get(iF - 1).f112958d;
        if (j12 == -9223372036854775807L || j12 >= j11) {
            iF--;
        }
        this.f104894a.subList(0, iF).clear();
    }

    @Override // q8.a
    public void clear() {
        this.f104894a.clear();
    }

    @Override // q8.a
    public long d(long j11) {
        if (this.f104894a.isEmpty() || j11 < this.f104894a.get(0).f112956b) {
            return -9223372036854775807L;
        }
        for (int i11 = 1; i11 < this.f104894a.size(); i11++) {
            long j12 = this.f104894a.get(i11).f112956b;
            if (j11 == j12) {
                return j12;
            }
            if (j11 < j12) {
                t9.d dVar = this.f104894a.get(i11 - 1);
                long j13 = dVar.f112958d;
                return (j13 == -9223372036854775807L || j13 > j11) ? dVar.f112956b : j13;
            }
        }
        t9.d dVar2 = (t9.d) c0.d(this.f104894a);
        long j14 = dVar2.f112958d;
        return (j14 == -9223372036854775807L || j11 < j14) ? dVar2.f112956b : j14;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // q8.a
    public boolean e(t9.d dVar, long j11) {
        boolean z11;
        s7.a.a(dVar.f112956b != -9223372036854775807L);
        if (dVar.f112956b <= j11) {
            long j12 = dVar.f112958d;
            if (j12 == -9223372036854775807L || j11 < j12) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        for (int size = this.f104894a.size() - 1; size >= 0; size--) {
            if (dVar.f112956b >= this.f104894a.get(size).f112956b) {
                this.f104894a.add(size + 1, dVar);
                return z11;
            }
            if (this.f104894a.get(size).f112956b <= j11) {
                z11 = false;
            }
        }
        this.f104894a.add(0, dVar);
        return z11;
    }
}

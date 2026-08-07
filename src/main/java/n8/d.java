package n8;

import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.x<a> f93550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f93551b;

    private static final class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g0 f93552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.collect.x<Integer> f93553b;

        public a(g0 g0Var, List<Integer> list) {
            this.f93552a = g0Var;
            this.f93553b = com.google.common.collect.x.n(list);
        }

        public com.google.common.collect.x<Integer> a() {
            return this.f93553b;
        }

        @Override // androidx.media3.exoplayer.source.g0
        public boolean c() {
            return this.f93552a.c();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public long d() {
            return this.f93552a.d();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public void e(long j11) {
            this.f93552a.e(j11);
        }

        @Override // androidx.media3.exoplayer.source.g0
        public long f() {
            return this.f93552a.f();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public boolean l(o1 o1Var) {
            return this.f93552a.l(o1Var);
        }
    }

    public d(List<? extends g0> list, List<List<Integer>> list2) {
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        s7.a.a(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVarK.a(new a(list.get(i11), list2.get(i11)));
        }
        this.f93550a = aVarK.k();
        this.f93551b = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean c() {
        for (int i11 = 0; i11 < this.f93550a.size(); i11++) {
            if (this.f93550a.get(i11).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long d() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.f93550a.size(); i11++) {
            a aVar = this.f93550a.get(i11);
            long jD = aVar.d();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            if (jD != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jD);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f93551b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.f93551b;
        return j11 != -9223372036854775807L ? j11 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        for (int i11 = 0; i11 < this.f93550a.size(); i11++) {
            this.f93550a.get(i11).e(j11);
        }
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long f() {
        long jMin = Long.MAX_VALUE;
        for (int i11 = 0; i11 < this.f93550a.size(); i11++) {
            long jF = this.f93550a.get(i11).f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        boolean zL;
        boolean z11 = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z11;
            }
            zL = false;
            for (int i11 = 0; i11 < this.f93550a.size(); i11++) {
                long jF2 = this.f93550a.get(i11).f();
                boolean z12 = jF2 != Long.MIN_VALUE && jF2 <= o1Var.f10600a;
                if (jF2 == jF || z12) {
                    zL |= this.f93550a.get(i11).l(o1Var);
                }
            }
            z11 |= zL;
        } while (zL);
        return z11;
    }
}

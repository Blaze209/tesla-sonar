package d8;

import android.net.Uri;
import com.google.common.collect.x;
import java.util.Collections;
import java.util.List;
import p7.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f59829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x<d8.b> f59830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f59831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f59832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f59833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<e> f59834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f59835h;

    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f59837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f59838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f59839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f59840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f59841m;

        public c(long j11, u uVar, List<d8.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j12) {
            super(j11, uVar, list, eVar, list2, list3, list4);
            this.f59837i = Uri.parse(list.get(0).f59774a);
            i iVarC = eVar.c();
            this.f59840l = iVarC;
            this.f59839k = str;
            this.f59838j = j12;
            this.f59841m = iVarC != null ? null : new m(new i(null, 0L, j12));
        }

        @Override // d8.j
        public String a() {
            return this.f59839k;
        }

        @Override // d8.j
        public c8.e l() {
            return this.f59841m;
        }

        @Override // d8.j
        public i m() {
            return this.f59840l;
        }
    }

    public static j o(long j11, u uVar, List<d8.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j11, uVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j11, uVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract c8.e l();

    public abstract i m();

    public i n() {
        return this.f59835h;
    }

    private j(long j11, u uVar, List<d8.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        s7.a.a(!list.isEmpty());
        this.f59828a = j11;
        this.f59829b = uVar;
        this.f59830c = x.n(list);
        this.f59832e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f59833f = list3;
        this.f59834g = list4;
        this.f59835h = kVar.a(this);
        this.f59831d = kVar.b();
    }

    public static class b extends j implements c8.e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f59836i;

        public b(long j11, u uVar, List<d8.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j11, uVar, list, aVar, list2, list3, list4);
            this.f59836i = aVar;
        }

        @Override // d8.j
        public String a() {
            return null;
        }

        @Override // c8.e
        public long b(long j11) {
            return this.f59836i.j(j11);
        }

        @Override // c8.e
        public long c(long j11, long j12) {
            return this.f59836i.h(j11, j12);
        }

        @Override // c8.e
        public long d(long j11, long j12) {
            return this.f59836i.d(j11, j12);
        }

        @Override // c8.e
        public long e(long j11, long j12) {
            return this.f59836i.f(j11, j12);
        }

        @Override // c8.e
        public long f(long j11, long j12) {
            return this.f59836i.i(j11, j12);
        }

        @Override // c8.e
        public long g(long j11) {
            return this.f59836i.g(j11);
        }

        @Override // c8.e
        public long h() {
            return this.f59836i.e();
        }

        @Override // c8.e
        public i i(long j11) {
            return this.f59836i.k(this, j11);
        }

        @Override // c8.e
        public boolean j() {
            return this.f59836i.l();
        }

        @Override // c8.e
        public long k(long j11, long j12) {
            return this.f59836i.c(j11, j12);
        }

        @Override // d8.j
        public i m() {
            return null;
        }

        @Override // d8.j
        public c8.e l() {
            return this;
        }
    }
}

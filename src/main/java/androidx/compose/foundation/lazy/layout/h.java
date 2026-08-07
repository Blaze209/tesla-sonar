package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import b4.w1;
import b4.x1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p024x1.n0;
import p024x1.o0;
import p024x1.p0;
import p024x1.q0;
import p024x1.r;
import p024x1.t;
import wn0.l;
import z3.h1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h;", "", "Lx1/r;", "itemContentFactory", "Lz3/h1;", "subcomposeLayoutState", "Lx1/q0;", "executor", "<init>", "(Lx1/r;Lz3/h1;Lx1/q0;)V", "", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lx1/n0;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/d$b;", DateTokenConverter.CONVERTER_KEY, "(IJLx1/n0;)Landroidx/compose/foundation/lazy/layout/d$b;", "Lx1/o0;", "c", "(IJLx1/n0;)Lx1/o0;", "a", "Lx1/r;", "b", "Lz3/h1;", "Lx1/q0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r itemContentFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h1 subcomposeLayoutState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q0 executor;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R \u0010/\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u00102\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u00101R\u0014\u00103\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a;", "Landroidx/compose/foundation/lazy/layout/d$b;", "Lx1/o0;", "", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lx1/n0;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/h;IJLx1/n0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lx1/p0;", "", "average", "", IntegerTokenConverter.CONVERTER_KEY, "(Lx1/p0;J)Z", "Ljn0/h0;", "f", "()V", "g", "(J)V", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "Landroidx/compose/foundation/lazy/layout/h;", "h", "()Landroidx/compose/foundation/lazy/layout/h$a$a;", "cancel", "b", "a", "(Lx1/p0;)Z", "", "toString", "()Ljava/lang/String;", "I", "J", "c", "Lx1/n0;", "Lz3/h1$a;", DateTokenConverter.CONVERTER_KEY, "Lz3/h1$a;", "precomposeHandle", "e", "Z", "isMeasured", "isCanceled", "hasResolvedNestedPrefetches", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "nestedPrefetchController", "isUrgent", "()Z", "isComposed", "isValid", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements d.b, o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long constraints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final n0 prefetchMetrics;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private h1.a precomposeHandle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isMeasured;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private C0101a nestedPrefetchController;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isUrgent;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a$a;", "", "", "Landroidx/compose/foundation/lazy/layout/d;", "states", "<init>", "(Landroidx/compose/foundation/lazy/layout/h$a;Ljava/util/List;)V", "Lx1/p0;", "", "a", "(Lx1/p0;)Z", "Ljava/util/List;", "", "Lx1/o0;", "b", "[Ljava/util/List;", "requestsByState", "", "c", "I", "stateIndex", DateTokenConverter.CONVERTER_KEY, "requestIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private final class C0101a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<d> states;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<o0>[] requestsByState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int stateIndex;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int requestIndex;

            public C0101a(List<d> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(p0 p0Var) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (a.this.isCanceled) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (p0Var.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<o0>[] listArr = this.requestsByState;
                            int i11 = this.stateIndex;
                            listArr[i11] = this.states.get(i11).b();
                        }
                        List<o0> list = this.requestsByState[this.stateIndex];
                        s.h(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).a(p0Var)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                h0 h0Var = h0.f84049a;
                Trace.endSection();
                return false;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/x1;", "it", "Lb4/w1;", "a", "(Lb4/x1;)Lb4/w1;"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements l<x1, w1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<List<d>> f4821c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p013kotlin.jvm.internal.n0<List<d>> n0Var) {
                super(1);
                this.f4821c = n0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w1 invoke(x1 x1Var) {
                T tS;
                s.i(x1Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d dVarX2 = ((i) x1Var).getPrefetchState();
                p013kotlin.jvm.internal.n0<List<d>> n0Var = this.f4821c;
                List<d> list = n0Var.f86529a;
                if (list != null) {
                    list.add(dVarX2);
                    tS = list;
                } else {
                    tS = v.s(dVarX2);
                }
                n0Var.f86529a = tS;
                return w1.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ a(h hVar, int i11, long j11, n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, j11, n0Var);
        }

        private final boolean d() {
            return this.precomposeHandle != null;
        }

        private final boolean e() {
            if (this.isCanceled) {
                return false;
            }
            int iA = h.this.itemContentFactory.d().invoke().a();
            int i11 = this.index;
            return i11 >= 0 && i11 < iA;
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.precomposeHandle != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            t tVarInvoke = h.this.itemContentFactory.d().invoke();
            Object objC = tVarInvoke.c(this.index);
            this.precomposeHandle = h.this.subcomposeLayoutState.i(objC, h.this.itemContentFactory.b(this.index, objC, tVarInvoke.d(this.index)));
        }

        private final void g(long constraints) {
            if (this.isCanceled) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            h1.a aVar = this.precomposeHandle;
            if (aVar == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int iA = aVar.a();
            for (int i11 = 0; i11 < iA; i11++) {
                aVar.c(i11, constraints);
            }
        }

        private final C0101a h() {
            h1.a aVar = this.precomposeHandle;
            if (aVar == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
            aVar.b("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(n0Var));
            List list = (List) n0Var.f86529a;
            if (list != null) {
                return new C0101a(list);
            }
            return null;
        }

        private final boolean i(p0 p0Var, long j11) {
            long jA = p0Var.a();
            return (this.isUrgent && jA > 0) || j11 < jA;
        }

        @Override // p024x1.o0
        public boolean a(p0 p0Var) {
            if (!e()) {
                return false;
            }
            Object objD = h.this.itemContentFactory.d().invoke().d(this.index);
            if (!d()) {
                if (!i(p0Var, (objD == null || !this.prefetchMetrics.f().a(objD)) ? this.prefetchMetrics.getAverageCompositionTimeNanos() : this.prefetchMetrics.f().c(objD))) {
                    return true;
                }
                n0 n0Var = this.prefetchMetrics;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    h0 h0Var = h0.f84049a;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objD != null) {
                        n0Var.f().p(objD, n0Var.d(jNanoTime2, n0Var.f().e(objD, 0L)));
                    }
                    n0Var.averageCompositionTimeNanos = n0Var.d(jNanoTime2, n0Var.getAverageCompositionTimeNanos());
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            if (!this.isUrgent) {
                if (!this.hasResolvedNestedPrefetches) {
                    if (p0Var.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.nestedPrefetchController = h();
                        this.hasResolvedNestedPrefetches = true;
                        h0 h0Var2 = h0.f84049a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                C0101a c0101a = this.nestedPrefetchController;
                if (c0101a != null ? c0101a.a(p0Var) : false) {
                    return true;
                }
            }
            if (!this.isMeasured && !w4.b.p(this.constraints)) {
                if (!i(p0Var, (objD == null || !this.prefetchMetrics.h().a(objD)) ? this.prefetchMetrics.getAverageMeasureTimeNanos() : this.prefetchMetrics.h().c(objD))) {
                    return true;
                }
                n0 n0Var2 = this.prefetchMetrics;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.constraints);
                    h0 h0Var3 = h0.f84049a;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (objD != null) {
                        n0Var2.h().p(objD, n0Var2.d(jNanoTime4, n0Var2.h().e(objD, 0L)));
                    }
                    n0Var2.averageMeasureTimeNanos = n0Var2.d(jNanoTime4, n0Var2.getAverageMeasureTimeNanos());
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void b() {
            this.isUrgent = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            h1.a aVar = this.precomposeHandle;
            if (aVar != null) {
                aVar.dispose();
            }
            this.precomposeHandle = null;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) w4.b.q(this.constraints)) + ", isComposed = " + d() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private a(int i11, long j11, n0 n0Var) {
            this.index = i11;
            this.constraints = j11;
            this.prefetchMetrics = n0Var;
        }
    }

    public h(r rVar, h1 h1Var, q0 q0Var) {
        this.itemContentFactory = rVar;
        this.subcomposeLayoutState = h1Var;
        this.executor = q0Var;
    }

    public final o0 c(int index, long constraints, n0 prefetchMetrics) {
        return new a(this, index, constraints, prefetchMetrics, null);
    }

    public final d.b d(int index, long constraints, n0 prefetchMetrics) {
        a aVar = new a(this, index, constraints, prefetchMetrics, null);
        this.executor.a(aVar);
        return aVar;
    }
}

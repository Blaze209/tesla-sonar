package p016o2;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.m;
import p019p1.r1;
import p020r2.Function0;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import u1.d;
import u1.e;
import u1.g;
import u1.h;
import u1.i;
import u1.j;
import u1.n;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lo2/c;", "", "Lw4/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Lu1/j;", "interactionSource", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "(ZLu1/j;Lr2/l;I)Lr2/y3;", "e", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", Gender.FEMALE, "b", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {942}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95795n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f95796o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<i> f95797p;

        /* JADX INFO: renamed from: o2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C2042a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<i> f95798a;

            C2042a(SnapshotStateList<i> snapshotStateList) {
                this.f95798a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super h0> continuation) {
                if (iVar instanceof g) {
                    this.f95798a.add(iVar);
                } else if (iVar instanceof h) {
                    this.f95798a.remove(((h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f95798a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f95798a.remove(((e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f95798a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f95798a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f95798a.remove(((n.a) iVar).getPress());
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, SnapshotStateList<i> snapshotStateList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f95796o = jVar;
            this.f95797p = snapshotStateList;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f95796o, this.f95797p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f95795n;
            if (i11 == 0) {
                t.b(obj);
                Flow<i> flowC = this.f95796o.c();
                C2042a c2042a = new C2042a(this.f95797p);
                this.f95795n = 1;
                if (flowC.collect(c2042a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {989, 998}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f95799n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p019p1.a<w4.h, m> f95800o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f95801p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f95802q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f95803r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ i f95804s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p019p1.a<w4.h, m> aVar, float f11, boolean z11, c cVar, i iVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f95800o = aVar;
            this.f95801p = f11;
            this.f95802q = z11;
            this.f95803r = cVar;
            this.f95804s = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f95800o, this.f95801p, this.f95802q, this.f95803r, this.f95804s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (p2.c.d(r7, r1, r3, r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
            return r0;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f95799n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                jn0.t.b(r7)
                goto La0
            L1c:
                jn0.t.b(r7)
                p1.a<w4.h, p1.m> r7 = r6.f95800o
                java.lang.Object r7 = r7.k()
                w4.h r7 = (w4.h) r7
                float r7 = r7.getValue()
                float r1 = r6.f95801p
                boolean r7 = w4.h.i(r7, r1)
                if (r7 != 0) goto La0
                boolean r7 = r6.f95802q
                if (r7 != 0) goto L48
                p1.a<w4.h, p1.m> r7 = r6.f95800o
                float r1 = r6.f95801p
                w4.h r1 = w4.h.d(r1)
                r6.f95799n = r3
                java.lang.Object r7 = r7.t(r1, r6)
                if (r7 != r0) goto La0
                goto L9f
            L48:
                p1.a<w4.h, p1.m> r7 = r6.f95800o
                java.lang.Object r7 = r7.k()
                w4.h r7 = (w4.h) r7
                float r7 = r7.getValue()
                o2.c r1 = r6.f95803r
                float r1 = p016o2.c.c(r1)
                boolean r1 = w4.h.i(r7, r1)
                r3 = 0
                if (r1 == 0) goto L6e
                u1.n$b r7 = new u1.n$b
                j3.g$a r1 = j3.g.INSTANCE
                long r4 = r1.c()
                r7.<init>(r4, r3)
                r3 = r7
                goto L91
            L6e:
                o2.c r1 = r6.f95803r
                float r1 = p016o2.c.b(r1)
                boolean r1 = w4.h.i(r7, r1)
                if (r1 == 0) goto L80
                u1.g r3 = new u1.g
                r3.<init>()
                goto L91
            L80:
                o2.c r1 = r6.f95803r
                float r1 = p016o2.c.a(r1)
                boolean r7 = w4.h.i(r7, r1)
                if (r7 == 0) goto L91
                u1.d r3 = new u1.d
                r3.<init>()
            L91:
                p1.a<w4.h, p1.m> r7 = r6.f95800o
                float r1 = r6.f95801p
                u1.i r4 = r6.f95804s
                r6.f95799n = r2
                java.lang.Object r7 = p2.c.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ c(float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15);
    }

    private final y3<w4.h> d(boolean z11, j jVar, l lVar, int i11) {
        float f11;
        p019p1.a aVar;
        if (o.J()) {
            o.S(-1312510462, i11, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
        }
        Object objI = lVar.I();
        l.Companion companion = l.INSTANCE;
        if (objI == companion.a()) {
            objI = n3.f();
            lVar.B(objI);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objI;
        boolean z12 = true;
        boolean z13 = (((i11 & 112) ^ 48) > 32 && lVar.n(jVar)) || (i11 & 48) == 32;
        Object objI2 = lVar.I();
        if (z13 || objI2 == companion.a()) {
            objI2 = new a(jVar, snapshotStateList, null);
            lVar.B(objI2);
        }
        Function0.g(jVar, (p) objI2, lVar, (i11 >> 3) & 14);
        i iVar = (i) v.C0(snapshotStateList);
        if (!z11) {
            f11 = this.disabledElevation;
        } else if (iVar instanceof n.b) {
            f11 = this.pressedElevation;
        } else if (iVar instanceof g) {
            f11 = this.hoveredElevation;
        } else {
            f11 = iVar instanceof d ? this.focusedElevation : this.defaultElevation;
        }
        Object objI3 = lVar.I();
        if (objI3 == companion.a()) {
            Object aVar2 = new p019p1.a(w4.h.d(f11), r1.g(w4.h.INSTANCE), null, null, 12, null);
            lVar.B(aVar2);
            objI3 = aVar2;
        }
        p019p1.a aVar3 = (p019p1.a) objI3;
        w4.h hVarD = w4.h.d(f11);
        boolean zK = lVar.K(aVar3) | lVar.q(f11) | ((((i11 & 14) ^ 6) > 4 && lVar.p(z11)) || (i11 & 6) == 4);
        if ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !lVar.n(this)) && (i11 & KyberEngine.KyberPolyBytes) != 256) {
            z12 = false;
        }
        boolean zK2 = zK | z12 | lVar.K(iVar);
        Object objI4 = lVar.I();
        if (zK2 || objI4 == companion.a()) {
            aVar = aVar3;
            Object bVar = new b(aVar, f11, z11, this, iVar, null);
            lVar.B(bVar);
            objI4 = bVar;
        } else {
            aVar = aVar3;
        }
        Function0.g(hVarD, (p) objI4, lVar, 0);
        y3<w4.h> y3VarG = aVar.g();
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    public final y3<w4.h> e(boolean z11, j jVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-2045116089, i11, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        y3<w4.h> y3VarD = d(z11, jVar, lVar, i11 & 1022);
        if (o.J()) {
            o.R();
        }
        return y3VarD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return w4.h.i(this.defaultElevation, cVar.defaultElevation) && w4.h.i(this.pressedElevation, cVar.pressedElevation) && w4.h.i(this.focusedElevation, cVar.focusedElevation) && w4.h.i(this.hoveredElevation, cVar.hoveredElevation) && w4.h.i(this.disabledElevation, cVar.disabledElevation);
    }

    public int hashCode() {
        return (((((((w4.h.j(this.defaultElevation) * 31) + w4.h.j(this.pressedElevation)) * 31) + w4.h.j(this.focusedElevation)) * 31) + w4.h.j(this.hoveredElevation)) * 31) + w4.h.j(this.disabledElevation);
    }

    private c(float f11, float f12, float f13, float f14, float f15) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.focusedElevation = f13;
        this.hoveredElevation = f14;
        this.disabledElevation = f15;
    }
}

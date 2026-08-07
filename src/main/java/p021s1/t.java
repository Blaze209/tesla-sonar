package p021s1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import p019p1.j1;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/x;", "", "value", "Lp1/i;", "animationSpec", "a", "(Ls1/x;FLp1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ls1/x;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109613n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109614o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109615p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109614o = obj;
            this.f109615p |= Integer.MIN_VALUE;
            return t.a(null, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109616n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109617o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f109618p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ i<Float> f109619q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k0 f109620r;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<Float, Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f109621c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u f109622d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, u uVar) {
                super(2);
                this.f109621c = k0Var;
                this.f109622d = uVar;
            }

            public final void a(float f11, float f12) {
                k0 k0Var = this.f109621c;
                float f13 = k0Var.f86525a;
                k0Var.f86525a = f13 + this.f109622d.a(f11 - f13);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Float f11, Float f12) {
                a(f11.floatValue(), f12.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, i<Float> iVar, k0 k0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f109618p = f11;
            this.f109619q = iVar;
            this.f109620r = k0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((b) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f109618p, this.f109619q, this.f109620r, continuation);
            bVar.f109617o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109616n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u uVar = (u) this.f109617o;
                float f11 = this.f109618p;
                i<Float> iVar = this.f109619q;
                a aVar = new a(this.f109620r, uVar);
                this.f109616n = 1;
                if (j1.e(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, iVar, aVar, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {61}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109623n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109624o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109625p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109624o = obj;
            this.f109625p |= Integer.MIN_VALUE;
            return t.b(null, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109626n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109627o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ k0 f109628p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f109629q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k0 k0Var, float f11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f109628p = k0Var;
            this.f109629q = f11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((d) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f109628p, this.f109629q, continuation);
            dVar.f109627o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109626n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            u uVar = (u) this.f109627o;
            this.f109628p.f86525a = uVar.a(this.f109629q);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(x xVar, float f11, i<Float> iVar, Continuation<? super Float> continuation) {
        a aVar;
        k0 k0Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f109615p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f109615p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f109614o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f109615p;
        if (i12 == 0) {
            jn0.t.b(obj);
            k0 k0Var2 = new k0();
            b bVar = new b(f11, iVar, k0Var2, null);
            aVar2.f109613n = k0Var2;
            aVar2.f109615p = 1;
            if (x.f(xVar, null, bVar, aVar2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            k0Var = k0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) aVar2.f109613n;
            jn0.t.b(obj);
        }
        return Boxing.boxFloat(k0Var.f86525a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(x xVar, float f11, Continuation<? super Float> continuation) {
        c cVar;
        k0 k0Var;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f109625p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f109625p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f109624o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f109625p;
        if (i12 == 0) {
            jn0.t.b(obj);
            k0 k0Var2 = new k0();
            d dVar = new d(k0Var2, f11, null);
            cVar2.f109623n = k0Var2;
            cVar2.f109625p = 1;
            if (x.f(xVar, null, dVar, cVar2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            k0Var = k0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) cVar2.f109623n;
            jn0.t.b(obj);
        }
        return Boxing.boxFloat(k0Var.f86525a);
    }
}

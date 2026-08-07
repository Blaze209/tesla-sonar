package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.p1;
import p020r2.s3;
import q1.i0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010&¨\u0006("}, d2 = {"Ls1/h;", "Ls1/x;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lwn0/l;)V", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", DateTokenConverter.CONVERTER_KEY, "(F)F", "a", "Lwn0/l;", "l", "()Lwn0/l;", "Ls1/u;", "scrollScope", "Lq1/i0;", "c", "Lq1/i0;", "scrollMutex", "Lr2/p1;", "", "Lr2/p1;", "isScrollingState", "e", "isLastScrollForwardState", "f", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> onDelta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u scrollScope = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 scrollMutex = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1<Boolean> isScrollingState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1<Boolean> isLastScrollBackwardState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109537n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q1.h0 f109539p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<u, Continuation<? super h0>, Object> f109540q;

        /* JADX INFO: renamed from: s1.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C2326a extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f109541n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f109542o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f109543p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p<u, Continuation<? super h0>, Object> f109544q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2326a(h hVar, p<? super u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super C2326a> continuation) {
                super(2, continuation);
                this.f109543p = hVar;
                this.f109544q = pVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Continuation<? super h0> continuation) {
                return ((C2326a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C2326a c2326a = new C2326a(this.f109543p, this.f109544q, continuation);
                c2326a.f109542o = obj;
                return c2326a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f109541n;
                try {
                    if (i11 == 0) {
                        t.b(obj);
                        u uVar = (u) this.f109542o;
                        this.f109543p.isScrollingState.setValue(Boxing.boxBoolean(true));
                        p<u, Continuation<? super h0>, Object> pVar = this.f109544q;
                        this.f109541n = 1;
                        if (pVar.invoke(uVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    this.f109543p.isScrollingState.setValue(Boxing.boxBoolean(false));
                    return h0.f84049a;
                } catch (Throwable th2) {
                    this.f109543p.isScrollingState.setValue(Boxing.boxBoolean(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q1.h0 h0Var, p<? super u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f109539p = h0Var;
            this.f109540q = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new a(this.f109539p, this.f109540q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109537n;
            if (i11 == 0) {
                t.b(obj);
                i0 i0Var = h.this.scrollMutex;
                u uVar = h.this.scrollScope;
                q1.h0 h0Var = this.f109539p;
                C2326a c2326a = new C2326a(h.this, this.f109540q, null);
                this.f109537n = 1;
                if (i0Var.f(uVar, h0Var, c2326a, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"s1/h$b", "Ls1/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements u {
        b() {
        }

        @Override // p021s1.u
        public float a(float pixels) {
            if (Float.isNaN(pixels)) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float fFloatValue = h.this.l().invoke(Float.valueOf(pixels)).floatValue();
            h.this.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > BitmapDescriptorFactory.HUE_RED));
            h.this.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(l<? super Float, Float> lVar) {
        this.onDelta = lVar;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = s3.d(bool, null, 2, null);
        this.isLastScrollForwardState = s3.d(bool, null, 2, null);
        this.isLastScrollBackwardState = s3.d(bool, null, 2, null);
    }

    @Override // p021s1.x
    public boolean a() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // p021s1.x
    public Object b(q1.h0 h0Var, p<? super u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(h0Var, pVar, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    @Override // p021s1.x
    public float d(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    public final l<Float, Float> l() {
        return this.onDelta;
    }
}

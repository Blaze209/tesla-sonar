package n2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p019p1.f0;
import p019p1.o1;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R+\u00101\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b&\u0010,\"\u0004\b0\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Ln2/e;", "", "Lj3/g;", "origin", "", "radius", "", "bounded", "<init>", "(Lj3/g;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", DateTokenConverter.CONVERTER_KEY, "h", "()V", "Lm3/f;", "Lk3/p1;", "color", "e", "(Lm3/f;J)V", "a", "Lj3/g;", "b", Gender.FEMALE, "c", "Z", "Ljava/lang/Float;", "startRadius", "targetCenter", "Lp1/a;", "Lp1/m;", "Lp1/a;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "Lkotlinx/coroutines/CompletableDeferred;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CompletableDeferred;", "finishSignalDeferred", "<set-?>", "j", "Lr2/p1;", "()Z", "l", "(Z)V", "finishedFadingIn", "k", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j3.g origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Float startRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j3.g targetCenter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<Float, p019p1.m> animatedAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<Float, p019p1.m> animatedRadiusPercent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<Float, p019p1.m> animatedCenterPercent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<h0> finishSignalDeferred;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 finishedFadingIn;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 finishRequested;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {77, 79, 80}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f92679o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f92681q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92679o = obj;
            this.f92681q |= Integer.MIN_VALUE;
            return e.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92682n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f92683o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f92685n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f92686o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f92686o = eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f92686o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f92685n;
                if (i11 == 0) {
                    t.b(obj);
                    p019p1.a aVar = this.f92686o.animatedAlpha;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    o1 o1VarL = p019p1.j.l(75, 0, f0.d(), 2, null);
                    this.f92685n = 1;
                    if (p019p1.a.f(aVar, fBoxFloat, o1VarL, null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: n2.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class C1980b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f92687n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f92688o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1980b(e eVar, Continuation<? super C1980b> continuation) {
                super(2, continuation);
                this.f92688o = eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1980b(this.f92688o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f92687n;
                if (i11 == 0) {
                    t.b(obj);
                    p019p1.a aVar = this.f92688o.animatedRadiusPercent;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    o1 o1VarL = p019p1.j.l(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 0, f0.c(), 2, null);
                    this.f92687n = 1;
                    if (p019p1.a.f(aVar, fBoxFloat, o1VarL, null, null, this, 12, null) == coroutine_suspended) {
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
                return ((C1980b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f92689n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f92690o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f92690o = eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f92690o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f92689n;
                if (i11 == 0) {
                    t.b(obj);
                    p019p1.a aVar = this.f92690o.animatedCenterPercent;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    o1 o1VarL = p019p1.j.l(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 0, f0.d(), 2, null);
                    this.f92689n = 1;
                    if (p019p1.a.f(aVar, fBoxFloat, o1VarL, null, null, this, 12, null) == coroutine_suspended) {
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
                return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f92683o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f92682n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f92683o;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(e.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1980b(e.this, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(e.this, null), 3, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f92692o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f92694n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e f92695o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f92695o = eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f92695o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f92694n;
                if (i11 == 0) {
                    t.b(obj);
                    p019p1.a aVar = this.f92695o.animatedAlpha;
                    Float fBoxFloat = Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED);
                    o1 o1VarL = p019p1.j.l(150, 0, f0.d(), 2, null);
                    this.f92694n = 1;
                    if (p019p1.a.f(aVar, fBoxFloat, o1VarL, null, null, this, 12, null) == coroutine_suspended) {
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

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = e.this.new c(continuation);
            cVar.f92692o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f92691n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f92692o, null, null, new a(e.this, null), 3, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ e(j3.g gVar, float f11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, f11, z11);
    }

    private final Object f(Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new b(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    private final Object g(Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void k(boolean z11) {
        this.finishRequested.setValue(Boolean.valueOf(z11));
    }

    private final void l(boolean z11) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.g(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n2.e.a
            if (r0 == 0) goto L13
            r0 = r7
            n2.e$a r0 = (n2.e.a) r0
            int r1 = r0.f92681q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92681q = r1
            goto L18
        L13:
            n2.e$a r0 = new n2.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f92679o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92681q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            jn0.t.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f92678n
            n2.e r2 = (n2.e) r2
            jn0.t.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f92678n
            n2.e r2 = (n2.e) r2
            jn0.t.b(r7)
            goto L56
        L47:
            jn0.t.b(r7)
            r0.f92678n = r6
            r0.f92681q = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            kotlinx.coroutines.CompletableDeferred<jn0.h0> r7 = r2.finishSignalDeferred
            r0.f92678n = r2
            r0.f92681q = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.f92678n = r7
            r0.f92681q = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.e.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(m3.f fVar, long j11) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(f.b(fVar.b()));
        }
        if (this.origin == null) {
            this.origin = j3.g.d(fVar.J0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = j3.g.d(j3.h.a(j3.m.k(fVar.b()) / 2.0f, j3.m.i(fVar.b()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? this.animatedAlpha.m().floatValue() : 1.0f;
        Float f11 = this.startRadius;
        s.h(f11);
        float fB = y4.b.b(f11.floatValue(), this.radius, this.animatedRadiusPercent.m().floatValue());
        j3.g gVar = this.origin;
        s.h(gVar);
        float fM = j3.g.m(gVar.getPackedValue());
        j3.g gVar2 = this.targetCenter;
        s.h(gVar2);
        float fB2 = y4.b.b(fM, j3.g.m(gVar2.getPackedValue()), this.animatedCenterPercent.m().floatValue());
        j3.g gVar3 = this.origin;
        s.h(gVar3);
        float fN = j3.g.n(gVar3.getPackedValue());
        j3.g gVar4 = this.targetCenter;
        s.h(gVar4);
        long jA = j3.h.a(fB2, y4.b.b(fN, j3.g.n(gVar4.getPackedValue()), this.animatedCenterPercent.m().floatValue()));
        long jP = k3.p1.p(j11, k3.p1.s(j11) * fFloatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (!this.bounded) {
            m3.f.Z(fVar, jP, fB, jA, BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
            return;
        }
        float fK = j3.m.k(fVar.b());
        float fI = j3.m.i(fVar.b());
        int iB = k3.o1.INSTANCE.b();
        m3.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.a().u();
        try {
            drawContext.getTransform().a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fK, fI, iB);
            m3.f.Z(fVar, jP, fB, jA, BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        } finally {
            drawContext.a().o();
            drawContext.f(jB);
        }
    }

    public final void h() {
        k(true);
        this.finishSignalDeferred.complete(h0.f84049a);
    }

    private e(j3.g gVar, float f11, boolean z11) {
        this.origin = gVar;
        this.radius = f11;
        this.bounded = z11;
        this.animatedAlpha = p019p1.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.animatedRadiusPercent = p019p1.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.animatedCenterPercent = p019p1.b.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.finishSignalDeferred = CompletableDeferredKt.CompletableDeferred((Job) null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = s3.d(bool, null, 2, null);
        this.finishRequested = s3.d(bool, null, 2, null);
    }
}

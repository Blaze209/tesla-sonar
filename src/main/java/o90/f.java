package o90;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0013J6\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u001f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J6\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0019J&\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lo90/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo30/d;", "logger", "Lo90/c;", "memoryCache", "Lo90/e;", "networkImageDecoder", "Lo90/b;", "diskCache", "<init>", "(Landroid/content/Context;Lo30/d;Lo90/c;Lo90/e;Lo90/b;)V", "", ImagesContract.URL, "Ljn0/s;", "Landroid/graphics/Bitmap;", "j", "(Ljava/lang/String;)Ljn0/s;", IntegerTokenConverter.CONVERTER_KEY, "", Snapshot.WIDTH, Snapshot.HEIGHT, "k", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "action", "m", "(Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "Ljn0/h0;", "f", "(Ljava/lang/String;)V", "g", "h", "a", "Lo30/d;", "b", "Lo90/c;", "c", "Lo90/e;", DateTokenConverter.CONVERTER_KEY, "Lo90/b;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/sync/Mutex;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "imageLoadMutexes", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f96994f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96995g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o90.c memoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o90.e networkImageDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o90.b diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, Mutex> imageLoadMutexes;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo90/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {}, l = {49}, m = "load-BWLJW6A", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f97001n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f97003p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97001n = obj;
            this.f97003p |= Integer.MIN_VALUE;
            Object objG = f.this.g(null, 0, 0, this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$2", f = "StripeImageLoader.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97004n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f97006p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f97007q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f97008r;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Landroid/graphics/Bitmap;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$2$1", f = "StripeImageLoader.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super s<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f97009n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f97010o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f97011p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f97012q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f97013r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, String str, int i11, int i12, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f97010o = fVar;
                this.f97011p = str;
                this.f97012q = i11;
                this.f97013r = i12;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f97010o, this.f97011p, this.f97012q, this.f97013r, continuation);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super s<? extends Bitmap>> continuation) {
                return invoke2((Continuation<? super s<Bitmap>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objK;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f97009n;
                if (i11 == 0) {
                    t.b(obj);
                    s sVarJ = this.f97010o.j(this.f97011p);
                    if (sVarJ == null && (sVarJ = this.f97010o.i(this.f97011p)) == null) {
                        f fVar = this.f97010o;
                        String str = this.f97011p;
                        int i12 = this.f97012q;
                        int i13 = this.f97013r;
                        this.f97009n = 1;
                        objK = fVar.k(str, i12, i13, this);
                        if (objK == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        objK = sVarJ.getValue();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objK = ((s) obj).getValue();
                }
                return s.a(objK);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super s<Bitmap>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i11, int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f97006p = str;
            this.f97007q = i11;
            this.f97008r = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(this.f97006p, this.f97007q, this.f97008r, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends Bitmap>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<Bitmap>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f97004n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            f fVar = f.this;
            String str = this.f97006p;
            a aVar = new a(fVar, str, this.f97007q, this.f97008r, null);
            this.f97004n = 1;
            Object objM = fVar.m(str, aVar, this);
            return objM == coroutine_suspended ? coroutine_suspended : objM;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<Bitmap>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {}, l = {57}, m = "load-gIAlu-s", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f97014n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f97016p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97014n = obj;
            this.f97016p |= Integer.MIN_VALUE;
            Object objH = f.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : s.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$4", f = "StripeImageLoader.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97017n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f97019p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Landroid/graphics/Bitmap;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$4$1", f = "StripeImageLoader.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super s<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f97020n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f97021o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f97022p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, String str, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f97021o = fVar;
                this.f97022p = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f97021o, this.f97022p, continuation);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super s<? extends Bitmap>> continuation) {
                return invoke2((Continuation<? super s<Bitmap>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objL;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f97020n;
                if (i11 == 0) {
                    t.b(obj);
                    s sVarJ = this.f97021o.j(this.f97022p);
                    if (sVarJ == null && (sVarJ = this.f97021o.i(this.f97022p)) == null) {
                        f fVar = this.f97021o;
                        String str = this.f97022p;
                        this.f97020n = 1;
                        objL = fVar.l(str, this);
                        if (objL == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        objL = sVarJ.getValue();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objL = ((s) obj).getValue();
                }
                return s.a(objL);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super s<Bitmap>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f97019p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new e(this.f97019p, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends Bitmap>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<Bitmap>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f97017n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            f fVar = f.this;
            String str = this.f97019p;
            a aVar = new a(fVar, str, null);
            this.f97017n = 1;
            Object objM = fVar.m(str, aVar, this);
            return objM == coroutine_suspended ? coroutine_suspended : objM;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<Bitmap>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: o90.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {0, 0}, l = {98}, m = "loadFromNetwork-BWLJW6A", n = {"this", ImagesContract.URL}, s = {"L$0", "L$1"})
    static final class C2073f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97023n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f97024o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f97025p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97027r;

        C2073f(Continuation<? super C2073f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97025p = obj;
            this.f97027r |= Integer.MIN_VALUE;
            Object objK = f.this.k(null, 0, 0, this);
            return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : s.a(objK);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {0, 0}, l = {110}, m = "loadFromNetwork-gIAlu-s", n = {"this", ImagesContract.URL}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97028n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f97029o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f97030p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f97032r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97030p = obj;
            this.f97032r |= Integer.MIN_VALUE;
            Object objL = f.this.l(null, this);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : s.a(objL);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {148, 122}, m = "withMutexByUrlLock", n = {"this", ImagesContract.URL, "action", "$this$withLock_u24default$iv", "this", ImagesContract.URL, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class h<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97033n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f97034o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f97035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f97036q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f97037r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f97039t;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97037r = obj;
            this.f97039t |= Integer.MIN_VALUE;
            return f.this.m(null, null, this);
        }
    }

    public f(Context context, o30.d logger, o90.c cVar, o90.e networkImageDecoder, o90.b bVar) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(networkImageDecoder, "networkImageDecoder");
        this.logger = logger;
        this.memoryCache = cVar;
        this.networkImageDecoder = networkImageDecoder;
        this.diskCache = bVar;
        this.imageLoadMutexes = new ConcurrentHashMap<>();
    }

    private final void f(String message) {
        this.logger.debug("StripeImageLoader: " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s<Bitmap> i(String url) {
        o90.b bVar = this.diskCache;
        Bitmap bitmapE = bVar != null ? bVar.e(url) : null;
        if (bitmapE != null) {
            f("Image loaded from disk cache");
        } else {
            f("Image not found on disk cache");
        }
        if (bitmapE == null) {
            return null;
        }
        o90.c cVar = this.memoryCache;
        if (cVar != null) {
            cVar.b(url, bitmapE);
        }
        return s.a(s.b(bitmapE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s<Bitmap> j(String url) {
        o90.c cVar = this.memoryCache;
        Bitmap bitmapA = cVar != null ? cVar.a(url) : null;
        if (bitmapA != null) {
            f("Image loaded from memory cache");
        } else {
            f("Image not found on memory cache");
        }
        if (bitmapA == null) {
            return null;
        }
        o90.b bVar = this.diskCache;
        if (bVar != null) {
            bVar.h(url, bitmapA);
        }
        return s.a(s.b(bitmapA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, int i11, int i12, Continuation<? super s<Bitmap>> continuation) {
        C2073f c2073f;
        f fVar;
        Object objB;
        if (continuation instanceof C2073f) {
            c2073f = (C2073f) continuation;
            int i13 = c2073f.f97027r;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2073f.f97027r = i13 - Integer.MIN_VALUE;
            } else {
                c2073f = new C2073f(continuation);
            }
        } else {
            c2073f = new C2073f(continuation);
        }
        Object objC = c2073f.f97025p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c2073f.f97027r;
        if (i14 == 0) {
            t.b(objC);
            try {
                s.Companion companion = s.INSTANCE;
                f("Image " + str + " loading from internet (" + i11 + " x " + i12 + ")");
                o90.e eVar = this.networkImageDecoder;
                c2073f.f97023n = this;
                c2073f.f97024o = str;
                c2073f.f97027r = 1;
                objC = eVar.c(str, i11, i12, c2073f);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = this;
            } catch (Throwable th2) {
                th = th2;
                fVar = this;
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c2073f.f97024o;
            fVar = (f) c2073f.f97023n;
            try {
                t.b(objC);
            } catch (Throwable th3) {
                th = th3;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
        }
        Bitmap bitmap = (Bitmap) objC;
        if (bitmap != null) {
            o90.b bVar = fVar.diskCache;
            if (bVar != null) {
                bVar.h(str, bitmap);
            }
            o90.c cVar = fVar.memoryCache;
            if (cVar != null) {
                cVar.b(str, bitmap);
            }
        } else {
            bitmap = null;
        }
        objB = s.b(bitmap);
        Throwable thE = s.e(objB);
        if (thE != null) {
            fVar.logger.error("StripeImageLoader: Could not load image from network", thE);
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, Continuation<? super s<Bitmap>> continuation) {
        g gVar;
        f fVar;
        Object objB;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f97032r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f97032r = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objD = gVar.f97030p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f97032r;
        if (i12 == 0) {
            t.b(objD);
            try {
                s.Companion companion = s.INSTANCE;
                f("Image " + str + " loading from internet");
                o90.e eVar = this.networkImageDecoder;
                gVar.f97028n = this;
                gVar.f97029o = str;
                gVar.f97032r = 1;
                objD = eVar.d(str, gVar);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = this;
            } catch (Throwable th2) {
                th = th2;
                fVar = this;
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) gVar.f97029o;
            fVar = (f) gVar.f97028n;
            try {
                t.b(objD);
            } catch (Throwable th3) {
                th = th3;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
        }
        Bitmap bitmap = (Bitmap) objD;
        if (bitmap != null) {
            o90.b bVar = fVar.diskCache;
            if (bVar != null) {
                bVar.h(str, bitmap);
            }
            o90.c cVar = fVar.memoryCache;
            if (cVar != null) {
                cVar.b(str, bitmap);
            }
        } else {
            bitmap = null;
        }
        objB = s.b(bitmap);
        Throwable thE = s.e(objB);
        if (thE != null) {
            fVar.logger.error("StripeImageLoader: Could not load image from network", thE);
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object m(String str, l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) throws Throwable {
        h hVar;
        Mutex mutex;
        f fVar;
        Mutex mutexPutIfAbsent;
        Mutex mutex2;
        String str2;
        f fVar2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f97039t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f97039t = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objInvoke = hVar.f97037r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f97039t;
        try {
            if (i12 == 0) {
                t.b(objInvoke);
                ConcurrentHashMap<String, Mutex> concurrentHashMap = this.imageLoadMutexes;
                Mutex mutexMutex$default = concurrentHashMap.get(str);
                if (mutexMutex$default == null && (mutexPutIfAbsent = concurrentHashMap.putIfAbsent(str, (mutexMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
                    mutexMutex$default = mutexPutIfAbsent;
                }
                p013kotlin.jvm.internal.s.j(mutexMutex$default, "getOrPut(...)");
                mutex = mutexMutex$default;
                hVar.f97033n = this;
                hVar.f97034o = str;
                hVar.f97035p = lVar;
                hVar.f97036q = mutex;
                hVar.f97039t = 1;
                if (mutex.lock(null, hVar) != coroutine_suspended) {
                    fVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) hVar.f97035p;
                str2 = (String) hVar.f97034o;
                fVar2 = (f) hVar.f97033n;
                try {
                    t.b(objInvoke);
                    mutex2.unlock(null);
                    fVar2.imageLoadMutexes.remove(str2);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) hVar.f97036q;
            lVar = (l) hVar.f97035p;
            String str3 = (String) hVar.f97034o;
            fVar = (f) hVar.f97033n;
            t.b(objInvoke);
            mutex = mutex3;
            str = str3;
            hVar.f97033n = fVar;
            hVar.f97034o = str;
            hVar.f97035p = mutex;
            hVar.f97036q = null;
            hVar.f97039t = 2;
            objInvoke = lVar.invoke(hVar);
            if (objInvoke != coroutine_suspended) {
                str2 = str;
                mutex2 = mutex;
                fVar2 = fVar;
                mutex2.unlock(null);
                fVar2.imageLoadMutexes.remove(str2);
                return objInvoke;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, int i11, int i12, Continuation<? super s<Bitmap>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f97003p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f97003p = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithContext = bVar.f97001n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = bVar.f97003p;
        if (i14 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            c cVar = new c(str, i11, i12, null);
            bVar.f97003p = 1;
            objWithContext = BuildersKt.withContext(io2, cVar, bVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, Continuation<? super s<Bitmap>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f97016p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f97016p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithContext = dVar.f97014n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f97016p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            e eVar = new e(str, null);
            dVar.f97016p = 1;
            objWithContext = BuildersKt.withContext(io2, eVar, dVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    public /* synthetic */ f(Context context, o30.d dVar, o90.c cVar, o90.e eVar, o90.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? o30.d.INSTANCE.a(o90.g.b(context)) : dVar, (i11 & 4) != 0 ? new o90.c(0, 1, null) : cVar, (i11 & 8) != 0 ? new o90.e() : eVar, (i11 & 16) != 0 ? new o90.b(context, "stripe_image_cache", 0L, 4, null) : bVar);
    }
}

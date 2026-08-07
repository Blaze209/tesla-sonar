package pe;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.HttpException;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lpe/a;", "Lpe/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", ImagesContract.URL, "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onSuccess", "", "onError", "a", "(Ljava/lang/String;Lwn0/p;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lpe/c;", "b", "Lpe/c;", "cache", "c", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements pe.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c cache;

    /* JADX INFO: renamed from: pe.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lpe/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)I", "BYTE_CONVERSION", "I", "DEFAULT_MEMORY_MEGABYTES", "", "DEFAULT_MEMORY_PERCENT", "D", "LOW_MEMORY_PERCENT", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context) {
            try {
                Object systemService = context.getSystemService("activity");
                s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager activityManager = (ActivityManager) systemService;
                double d11 = 1024;
                return (int) ((activityManager.isLowRamDevice() ? 0.15d : 0.2d) * ((double) ((context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * d11 * d11);
            } catch (Exception unused) {
                return 53687091;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2", f = "ImageLoader.kt", i = {1, 1, 2, 2}, l = {49, 75, 79, 88}, m = "invokeSuspend", n = {"call", "response", "call", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f102150n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f102151o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f102152p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f102154r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p<Bitmap, Continuation<? super h0>, Object> f102155s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p<Throwable, Continuation<? super h0>, Object> f102156t;

        /* JADX INFO: renamed from: pe.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$1", f = "ImageLoader.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        static final class C2167a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f102157n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p<Bitmap, Continuation<? super h0>, Object> f102158o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Bitmap f102159p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2167a(p<? super Bitmap, ? super Continuation<? super h0>, ? extends Object> pVar, Bitmap bitmap, Continuation<? super C2167a> continuation) {
                super(2, continuation);
                this.f102158o = pVar;
                this.f102159p = bitmap;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2167a(this.f102158o, this.f102159p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f102157n;
                if (i11 == 0) {
                    t.b(obj);
                    p<Bitmap, Continuation<? super h0>, Object> pVar = this.f102158o;
                    Bitmap bitmap = this.f102159p;
                    this.f102157n = 1;
                    if (pVar.invoke(bitmap, this) == coroutine_suspended) {
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
                return ((C2167a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: pe.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$2", f = "ImageLoader.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
        static final class C2168b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f102160n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p<Bitmap, Continuation<? super h0>, Object> f102161o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Bitmap f102162p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2168b(p<? super Bitmap, ? super Continuation<? super h0>, ? extends Object> pVar, Bitmap bitmap, Continuation<? super C2168b> continuation) {
                super(2, continuation);
                this.f102161o = pVar;
                this.f102162p = bitmap;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2168b(this.f102161o, this.f102162p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f102160n;
                if (i11 == 0) {
                    t.b(obj);
                    p<Bitmap, Continuation<? super h0>, Object> pVar = this.f102161o;
                    Bitmap bitmap = this.f102162p;
                    s.j(bitmap, "$bitmap");
                    this.f102160n = 1;
                    if (pVar.invoke(bitmap, this) == coroutine_suspended) {
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
                return ((C2168b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$3", f = "ImageLoader.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f102163n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p<Throwable, Continuation<? super h0>, Object> f102164o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Response f102165p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar, Response response, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f102164o = pVar;
                this.f102165p = response;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f102164o, this.f102165p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f102163n;
                if (i11 == 0) {
                    t.b(obj);
                    p<Throwable, Continuation<? super h0>, Object> pVar = this.f102164o;
                    HttpException httpException = new HttpException(this.f102165p.code(), this.f102165p.message(), null);
                    this.f102163n = 1;
                    if (pVar.invoke(httpException, this) == coroutine_suspended) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.adyen.checkout.core.internal.ui.DefaultImageLoader$load$2$4", f = "ImageLoader.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f102166n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p<Throwable, Continuation<? super h0>, Object> f102167o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ IOException f102168p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar, IOException iOException, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f102167o = pVar;
                this.f102168p = iOException;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new d(this.f102167o, this.f102168p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f102166n;
                if (i11 == 0) {
                    t.b(obj);
                    p<Throwable, Continuation<? super h0>, Object> pVar = this.f102167o;
                    IOException iOException = this.f102168p;
                    this.f102166n = 1;
                    if (pVar.invoke(iOException, this) == coroutine_suspended) {
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
                return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, p<? super Bitmap, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f102154r = str;
            this.f102155s = pVar;
            this.f102156t = pVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f102154r, this.f102155s, this.f102156t, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[Catch: IOException -> 0x002f, CancellationException -> 0x00ff, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00ff, blocks: (B:12:0x002a, B:41:0x00dd, B:43:0x00e3), top: B:52:0x002a }] */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r9) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r4, r5, r9) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r9) == r0) goto L47;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(Context context) {
        s.k(context, "context");
        this.okHttpClient = new OkHttpClient();
        this.cache = new c(INSTANCE.b(context));
    }

    @Override // pe.b
    public Object a(String str, p<? super Bitmap, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new b(str, pVar, pVar2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }
}

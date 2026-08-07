package xf;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.r;
import com.plaid.internal.EnumC4419g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;
import p020r2.p1;
import p020r2.s3;
import tf.a0;
import tf.u;
import tf.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aF\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a2\u0010'\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103¨\u00067²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, d2 = {"Lxf/m;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/Continuation;", "", "", "onRetry", "Lxf/k;", "r", "(Lxf/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn0/q;Lr2/l;II)Lxf/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltf/i;", "m", "(Landroid/content/Context;Lxf/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/r;", "n", "(Landroid/content/Context;Lxf/m;Ljava/lang/String;Z)Lcom/airbnb/lottie/r;", "T", "h", "(Lcom/airbnb/lottie/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "Ljn0/h0;", "l", "(Landroid/content/Context;Ltf/i;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltf/z;", "asset", "p", "(Landroid/content/Context;Ltf/z;Ljava/lang/String;)V", "o", "(Ltf/z;)V", "k", "(Landroid/content/Context;Ltf/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lag/c;", "font", "q", "(Landroid/content/Context;Lag/c;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", "t", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "j", "(Ljava/lang/String;)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Lxf/l;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "c", "Ljn0/h0;", "onResult", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a<T> implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<T> f123455a;

        /* JADX WARN: Multi-variable type inference failed */
        a(CancellableContinuation<? super T> cancellableContinuation) {
            this.f123455a = cancellableContinuation;
        }

        @Override // tf.a0
        public final void onResult(T t11) {
            if (this.f123455a.isCompleted()) {
                return;
            }
            this.f123455a.resumeWith(s.b(t11));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "e", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b<T> implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<T> f123456a;

        /* JADX WARN: Multi-variable type inference failed */
        b(CancellableContinuation<? super T> cancellableContinuation) {
            this.f123456a = cancellableContinuation;
        }

        @Override // tf.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th2) {
            if (this.f123456a.isCompleted()) {
                return;
            }
            CancellableContinuation<T> cancellableContinuation = this.f123456a;
            s.Companion companion = s.INSTANCE;
            p013kotlin.jvm.internal.s.h(th2);
            cancellableContinuation.resumeWith(s.b(t.a(th2)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123457n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ tf.i f123458o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f123459p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f123460q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f123461r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(tf.i iVar, Context context, String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f123458o = iVar;
            this.f123459p = context;
            this.f123460q = str;
            this.f123461r = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f123458o, this.f123459p, this.f123460q, this.f123461r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f123457n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            for (ag.c cVar : this.f123458o.g().values()) {
                Context context = this.f123459p;
                p013kotlin.jvm.internal.s.h(cVar);
                q.q(context, cVar, this.f123460q, this.f123461r);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123462n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ tf.i f123463o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f123464p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f123465q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(tf.i iVar, Context context, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f123463o = iVar;
            this.f123464p = context;
            this.f123465q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f123463o, this.f123464p, this.f123465q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f123462n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            for (z zVar : this.f123463o.j().values()) {
                p013kotlin.jvm.internal.s.h(zVar);
                q.o(zVar);
                q.p(this.f123464p, zVar, this.f123465q);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {127, 128, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m = "lottieComposition", n = {CoreConstants.CONTEXT_SCOPE_VALUE, "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", CoreConstants.CONTEXT_SCOPE_VALUE, "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123466n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f123467o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f123468p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f123469q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f123470r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f123471s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f123470r = obj;
            this.f123471s |= Integer.MIN_VALUE;
            return q.m(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.q<Integer, Throwable, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123472n;

        f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        public final Object a(int i11, Throwable th2, Continuation<? super Boolean> continuation) {
            return new f(continuation).invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th2, Continuation<? super Boolean> continuation) {
            return a(num.intValue(), th2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f123472n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(false);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {92, 94}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123473n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f123474o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f123475p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.q<Integer, Throwable, Continuation<? super Boolean>, Object> f123476q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f123477r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ m f123478s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f123479t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f123480u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f123481v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ String f123482w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ p1<l> f123483x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(wn0.q<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> qVar, Context context, m mVar, String str, String str2, String str3, String str4, p1<l> p1Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f123476q = qVar;
            this.f123477r = context;
            this.f123478s = mVar;
            this.f123479t = str;
            this.f123480u = str2;
            this.f123481v = str3;
            this.f123482w = str4;
            this.f123483x = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f123476q, this.f123477r, this.f123478s, this.f123479t, this.f123480u, this.f123481v, this.f123482w, this.f123483x, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:23|45|25|26|27) */
        /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x005f A[PHI: r0 r4 r14
          0x005f: PHI (r0v7 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005f: PHI (r4v6 java.lang.Throwable) = (r4v7 java.lang.Throwable), (r4v11 java.lang.Throwable) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005f: PHI (r14v14 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x005b, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r0 r4
          0x0067: PHI (r0v4 int) = (r0v7 int), (r0v8 int) binds: [B:22:0x0065, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0067: PHI (r4v4 java.lang.Throwable) = (r4v6 java.lang.Throwable), (r4v7 java.lang.Throwable) binds: [B:22:0x0065, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:43:0x0093). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r13.f123475p
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L34
                if (r0 == r3) goto L2a
                if (r0 != r2) goto L22
                int r4 = r13.f123474o
                java.lang.Object r0 = r13.f123473n
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                jn0.t.b(r14)     // Catch: java.lang.Throwable -> L1a
                r11 = r13
                goto L93
            L1a:
                r0 = move-exception
                r14 = r0
                r11 = r4
                r4 = r14
                r14 = r11
                r11 = r13
                goto Lab
            L22:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2a:
                int r0 = r13.f123474o
                java.lang.Object r4 = r13.f123473n
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                jn0.t.b(r14)
                goto L5f
            L34:
                jn0.t.b(r14)
                r14 = 0
                r0 = 0
                r4 = r14
            L3a:
                r2.p1<xf.l> r14 = r13.f123483x
                xf.l r14 = xf.q.g(r14)
                boolean r14 = r14.t()
                if (r14 != 0) goto L6b
                if (r0 == 0) goto L67
                wn0.q<java.lang.Integer, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r14 = r13.f123476q
                java.lang.Integer r5 = p013kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                p013kotlin.jvm.internal.s.h(r4)
                r13.f123473n = r4
                r13.f123474o = r0
                r13.f123475p = r3
                java.lang.Object r14 = r14.invoke(r5, r4, r13)
                if (r14 != r1) goto L5f
                r11 = r13
                goto L92
            L5f:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L6b
            L67:
                r12 = r4
                r4 = r0
                r0 = r12
                goto L6d
            L6b:
                r11 = r13
                goto Lae
            L6d:
                android.content.Context r5 = r13.f123477r     // Catch: java.lang.Throwable -> La8
                xf.m r6 = r13.f123478s     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.f123479t     // Catch: java.lang.Throwable -> La8
                java.lang.String r7 = xf.q.b(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.f123480u     // Catch: java.lang.Throwable -> La8
                java.lang.String r8 = xf.q.b(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r14 = r13.f123481v     // Catch: java.lang.Throwable -> La8
                java.lang.String r9 = xf.q.a(r14)     // Catch: java.lang.Throwable -> La8
                java.lang.String r10 = r13.f123482w     // Catch: java.lang.Throwable -> La8
                r13.f123473n = r0     // Catch: java.lang.Throwable -> La8
                r13.f123474o = r4     // Catch: java.lang.Throwable -> La8
                r13.f123475p = r2     // Catch: java.lang.Throwable -> La8
                r11 = r13
                java.lang.Object r14 = xf.q.c(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La2
                if (r14 != r1) goto L93
            L92:
                return r1
            L93:
                tf.i r14 = (tf.i) r14     // Catch: java.lang.Throwable -> La2
                r2.p1<xf.l> r5 = r11.f123483x     // Catch: java.lang.Throwable -> La2
                xf.l r5 = xf.q.g(r5)     // Catch: java.lang.Throwable -> La2
                r5.k(r14)     // Catch: java.lang.Throwable -> La2
                r12 = r4
                r4 = r0
                r0 = r12
                goto L3a
            La2:
                r0 = move-exception
            La3:
                r14 = r0
                r12 = r4
                r4 = r14
                r14 = r12
                goto Lab
            La8:
                r0 = move-exception
                r11 = r13
                goto La3
            Lab:
                int r0 = r14 + 1
                goto L3a
            Lae:
                r2.p1<xf.l> r14 = r11.f123483x
                xf.l r14 = xf.q.g(r14)
                boolean r14 = r14.q()
                if (r14 != 0) goto Lc5
                if (r4 == 0) goto Lc5
                r2.p1<xf.l> r14 = r11.f123483x
                xf.l r14 = xf.q.g(r14)
                r14.n(r4)
            Lc5:
                jn0.h0 r14 = jn0.h0.f84049a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xf.q.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private static final <T> Object h(r<T> rVar, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        rVar.d(new a(cancellableContinuationImpl)).c(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        if (p013kotlin.text.t.y0(str) || p013kotlin.text.t.b0(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str) {
        if (str == null || p013kotlin.text.t.y0(str)) {
            return null;
        }
        if (p013kotlin.text.t.l0(str, '/', false, 2, null)) {
            return str;
        }
        return str + "/";
    }

    private static final Object k(Context context, tf.i iVar, String str, String str2, Continuation<? super h0> continuation) {
        if (iVar.g().isEmpty()) {
            return h0.f84049a;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new c(iVar, context, str, str2, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    private static final Object l(Context context, tf.i iVar, String str, Continuation<? super h0> continuation) {
        if (!iVar.r()) {
            return h0.f84049a;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new d(iVar, context, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(Context context, m mVar, String str, String str2, String str3, String str4, Continuation<? super tf.i> continuation) throws FileNotFoundException {
        e eVar;
        String str5;
        Context context2;
        tf.i iVar;
        String str6;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f123471s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f123471s = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objH = eVar.f123470r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f123471s;
        if (i12 == 0) {
            t.b(objH);
            r<tf.i> rVarN = n(context, mVar, str4, false);
            if (rVarN == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + mVar + ".").toString());
            }
            eVar.f123466n = context;
            eVar.f123467o = str;
            eVar.f123468p = str2;
            eVar.f123469q = str3;
            eVar.f123471s = 1;
            objH = h(rVarN, eVar);
            if (objH != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str3 = (String) eVar.f123469q;
            str2 = (String) eVar.f123468p;
            str = (String) eVar.f123467o;
            context = (Context) eVar.f123466n;
            t.b(objH);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tf.i iVar2 = (tf.i) eVar.f123466n;
                t.b(objH);
                return iVar2;
            }
            iVar = (tf.i) eVar.f123469q;
            str6 = (String) eVar.f123468p;
            str5 = (String) eVar.f123467o;
            context2 = (Context) eVar.f123466n;
            t.b(objH);
        }
        eVar.f123466n = iVar;
        eVar.f123467o = null;
        eVar.f123468p = null;
        eVar.f123469q = null;
        eVar.f123471s = 3;
        if (k(context2, iVar, str5, str6, eVar) != coroutine_suspended) {
            return coroutine_suspended;
        }
        return iVar;
        tf.i iVar3 = (tf.i) objH;
        eVar.f123466n = context;
        eVar.f123467o = str2;
        eVar.f123468p = str3;
        eVar.f123469q = iVar3;
        eVar.f123471s = 2;
        if (l(context, iVar3, str, eVar) != coroutine_suspended) {
            str5 = str2;
            context2 = context;
            iVar = iVar3;
            str6 = str3;
            eVar.f123466n = iVar;
            eVar.f123467o = null;
            eVar.f123468p = null;
            eVar.f123469q = null;
            eVar.f123471s = 3;
            if (k(context2, iVar, str5, str6, eVar) != coroutine_suspended) {
                return iVar;
            }
        }
        return coroutine_suspended;
    }

    private static final r<tf.i> n(Context context, m mVar, String str, boolean z11) throws FileNotFoundException {
        if (mVar instanceof m.e) {
            return p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__") ? u.D(context, ((m.e) mVar).getResId()) : u.E(context, ((m.e) mVar).getResId(), str);
        }
        if (mVar instanceof m.f) {
            return p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__") ? u.H(context, ((m.f) mVar).a()) : u.I(context, ((m.f) mVar).a(), str);
        }
        if (mVar instanceof m.c) {
            if (z11) {
                return null;
            }
            m.c cVar = (m.c) mVar;
            FileInputStream fileInputStream = new FileInputStream(cVar.getFileName());
            if (p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__")) {
                str = cVar.getFileName();
            }
            if (p013kotlin.text.t.L(cVar.getFileName(), "zip", false, 2, null)) {
                return u.K(new ZipInputStream(fileInputStream), str);
            }
            return p013kotlin.text.t.L(cVar.getFileName(), "tgs", false, 2, null) ? u.t(new GZIPInputStream(fileInputStream), str) : u.t(fileInputStream, str);
        }
        if (mVar instanceof m.a) {
            return p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__") ? u.n(context, ((m.a) mVar).a()) : u.o(context, ((m.a) mVar).a(), str);
        }
        if (mVar instanceof m.d) {
            if (p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((m.d) mVar).a().hashCode());
            }
            return u.B(((m.d) mVar).a(), str);
        }
        if (!(mVar instanceof m.b)) {
            throw new NoWhenBranchMatchedException();
        }
        m.b bVar = (m.b) mVar;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(bVar.a());
        if (p013kotlin.jvm.internal.s.f(str, "__LottieInternalDefaultCacheKey__")) {
            str = bVar.a().toString();
        }
        return u.r(context, inputStreamOpenInputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(z zVar) {
        if (zVar.b() != null) {
            return;
        }
        String strC = zVar.c();
        p013kotlin.jvm.internal.s.h(strC);
        if (!p013kotlin.text.t.b0(strC, "data:", false, 2, null) || p013kotlin.text.t.v0(strC, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String strSubstring = strC.substring(p013kotlin.text.t.u0(strC, CoreConstants.COMMA_CHAR, 0, false, 6, null) + 1);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            zVar.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e11) {
            hg.e.d("data URL did not have correct base64 format.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Context context, z zVar, String str) {
        if (zVar.b() != null || str == null) {
            return;
        }
        String strC = zVar.c();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + strC);
            p013kotlin.jvm.internal.s.h(inputStreamOpen);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                zVar.g(hg.l.m(BitmapFactory.decodeStream(inputStreamOpen, null, options), zVar.f(), zVar.d()));
            } catch (IllegalArgumentException e11) {
                hg.e.d("Unable to decode image.", e11);
            }
        } catch (IOException e12) {
            hg.e.d("Unable to open asset.", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Context context, ag.c cVar, String str, String str2) {
        String str3 = str + cVar.a() + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                p013kotlin.jvm.internal.s.h(typefaceCreateFromAsset);
                String strC = cVar.c();
                p013kotlin.jvm.internal.s.j(strC, "getStyle(...)");
                cVar.e(t(typefaceCreateFromAsset, strC));
            } catch (Exception e11) {
                hg.e.b("Failed to create " + cVar.a() + " typeface with style=" + cVar.c() + "!", e11);
            }
        } catch (Exception e12) {
            hg.e.b("Failed to find typeface in assets with path " + str3 + ".", e12);
        }
    }

    public static final k r(m spec, String str, String str2, String str3, String str4, wn0.q<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> qVar, p020r2.l lVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(spec, "spec");
        lVar.H(-1248473602);
        String str5 = (i12 & 2) != 0 ? null : str;
        String str6 = (i12 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i12 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i12 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        wn0.q<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> fVar = (i12 & 32) != 0 ? new f(null) : qVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-1248473602, i11, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:82)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        lVar.H(1388713922);
        int i13 = i11 & 14;
        int i14 = i13 ^ 6;
        boolean z11 = (i14 > 4 && lVar.n(spec)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(new l(), null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVar.T();
        lVar.H(1388714213);
        boolean z12 = ((i14 > 4 && lVar.n(spec)) || (i11 & 6) == 4) | ((((57344 & i11) ^ 24576) > 16384 && lVar.n(str8)) || (i11 & 24576) == 16384);
        Object objI2 = lVar.I();
        if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = n(context, spec, str8, true);
            lVar.B(objI2);
        }
        lVar.T();
        Function0.f(spec, str8, new g(fVar, context, spec, str5, str6, str7, str8, p1Var, null), lVar, i13 | 512 | ((i11 >> 9) & 112));
        l lVarS = s(p1Var);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return lVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l s(p1<l> p1Var) {
        return p1Var.getValue();
    }

    private static final Typeface t(Typeface typeface, String str) {
        int i11 = 0;
        boolean zH0 = p013kotlin.text.t.h0(str, "Italic", false, 2, null);
        boolean zH1 = p013kotlin.text.t.h0(str, "Bold", false, 2, null);
        if (zH0 && zH1) {
            i11 = 3;
        } else if (zH0) {
            i11 = 2;
        } else if (zH1) {
            i11 = 1;
        }
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }
}

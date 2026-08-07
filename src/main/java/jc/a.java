package jc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import ec.j;
import ec.n;
import ec.r;
import ic.SourceFetchResult;
import ic.i;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import rc.ImageRequest;
import rc.Options;
import rc.SuccessResult;
import rc.p;
import sc.Size;
import yc.b0;
import yc.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0002&#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Ljc/a;", "Ljc/d;", "Lec/r;", "imageLoader", "Lyc/b0;", "systemCallbacks", "Lrc/p;", "requestService", "Lyc/t;", "logger", "<init>", "(Lec/r;Lyc/b0;Lrc/p;Lyc/t;)V", "Lrc/g;", "request", "", "mappedData", "Lrc/n;", "options", "Lec/j;", "eventListener", "Ljc/a$b;", "h", "(Lrc/g;Ljava/lang/Object;Lrc/n;Lec/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/h;", "components", "Lic/i;", IntegerTokenConverter.CONVERTER_KEY, "(Lec/h;Lrc/g;Ljava/lang/Object;Lrc/n;Lec/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lic/o;", "fetchResult", "g", "(Lic/o;Lec/h;Lrc/g;Ljava/lang/Object;Lrc/n;Lec/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljc/d$a;", "chain", "Lrc/j;", "a", "(Ljc/d$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/r;", "b", "Lyc/b0;", "c", "Lrc/p;", "Lmc/e;", DateTokenConverter.CONVERTER_KEY, "Lmc/e;", "memoryCacheService", "e", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements jc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p requestService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mc.e memoryCacheService;

    /* JADX INFO: renamed from: jc.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Ljc/a$b;", "", "Lec/n;", "image", "", "isSampled", "Lgc/h;", "dataSource", "", "diskCacheKey", "<init>", "(Lec/n;ZLgc/h;Ljava/lang/String;)V", "a", "(Lec/n;ZLgc/h;Ljava/lang/String;)Ljc/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lec/n;", "e", "()Lec/n;", "b", "Z", "f", "()Z", "c", "Lgc/h;", "()Lgc/h;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final gc.h dataSource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String diskCacheKey;

        public ExecuteResult(n nVar, boolean z11, gc.h hVar, String str) {
            this.image = nVar;
            this.isSampled = z11;
            this.dataSource = hVar;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, n nVar, boolean z11, gc.h hVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                nVar = executeResult.image;
            }
            if ((i11 & 2) != 0) {
                z11 = executeResult.isSampled;
            }
            if ((i11 & 4) != 0) {
                hVar = executeResult.dataSource;
            }
            if ((i11 & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.a(nVar, z11, hVar, str);
        }

        public final ExecuteResult a(n image, boolean isSampled, gc.h dataSource, String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final gc.h getDataSource() {
            return this.dataSource;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) other;
            return s.f(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && s.f(this.diskCacheKey, executeResult.diskCacheKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public int hashCode() {
            int iHashCode = ((((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode()) * 31;
            String str = this.diskCacheKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m = "decode", n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83517n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f83518o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83519p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f83520q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f83521r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f83522s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f83523t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f83524u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f83525v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f83527x;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83525v = obj;
            this.f83527x |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {126, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 148}, m = "execute", n = {"request", "mappedData", "eventListener", "options", "components", "fetchResult", "request", "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83528n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f83529o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83530p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f83531q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f83532r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f83533s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f83534t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f83535u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83537w;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83535u = obj;
            this.f83537w |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljc/a$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljc/a$b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super ExecuteResult>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83538n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<i> f83540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0<ec.h> f83541q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ImageRequest f83542r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f83543s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n0<Options> f83544t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ j f83545u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0<i> n0Var, n0<ec.h> n0Var2, ImageRequest imageRequest, Object obj, n0<Options> n0Var3, j jVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f83540p = n0Var;
            this.f83541q = n0Var2;
            this.f83542r = imageRequest;
            this.f83543s = obj;
            this.f83544t = n0Var3;
            this.f83545u = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(this.f83540p, this.f83541q, this.f83542r, this.f83543s, this.f83544t, this.f83545u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83538n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            a aVar = a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f83540p.f86529a;
            ec.h hVar = this.f83541q.f86529a;
            ImageRequest imageRequest = this.f83542r;
            Object obj2 = this.f83543s;
            Options options = this.f83544t.f86529a;
            j jVar = this.f83545u;
            this.f83538n = 1;
            Object objG = aVar.g(sourceFetchResult, hVar, imageRequest, obj2, options, jVar, this);
            return objG == coroutine_suspended ? coroutine_suspended : objG;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExecuteResult> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {169}, m = "fetch", n = {"components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83546n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f83547o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83548p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f83549q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f83550r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f83551s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f83552t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f83553u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83555w;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83553u = obj;
            this.f83555w |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0}, l = {75}, m = "intercept", n = {"chain"}, s = {"L$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83556n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83557o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83559q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83557o = obj;
            this.f83559q |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lrc/r;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lrc/r;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super SuccessResult>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83560n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ImageRequest f83562p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f83563q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Options f83564r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ j f83565s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ mc.d.Key f83566t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ jc.d.a f83567u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ImageRequest imageRequest, Object obj, Options options, j jVar, mc.d.Key key, jc.d.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f83562p = imageRequest;
            this.f83563q = obj;
            this.f83564r = options;
            this.f83565s = jVar;
            this.f83566t = key;
            this.f83567u = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(this.f83562p, this.f83563q, this.f83564r, this.f83565s, this.f83566t, this.f83567u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f83560n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f83562p;
                Object obj2 = this.f83563q;
                Options options = this.f83564r;
                j jVar = this.f83565s;
                this.f83560n = 1;
                objH = aVar.h(imageRequest, obj2, options, jVar, this);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objH = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) objH;
            a.this.systemCallbacks.a();
            boolean zH = a.this.memoryCacheService.h(this.f83566t, this.f83562p, executeResult);
            n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f83562p;
            gc.h dataSource = executeResult.getDataSource();
            mc.d.Key key = this.f83566t;
            if (!zH) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), f0.o(this.f83567u));
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SuccessResult> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(r rVar, b0 b0Var, p pVar, yc.t tVar) {
        this.imageLoader = rVar;
        this.systemCallbacks = b0Var;
        this.requestService = pVar;
        this.memoryCacheService = new mc.e(rVar, pVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(ic.SourceFetchResult r7, ec.h r8, rc.ImageRequest r9, java.lang.Object r10, rc.Options r11, ec.j r12, p013kotlin.coroutines.Continuation<? super jc.a.ExecuteResult> r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.a.g(ic.o, ec.h, rc.g, java.lang.Object, rc.n, ec.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019a, code lost:
    
        if (r0 == r9) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, rc.n] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, ec.h] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, ec.h] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(rc.ImageRequest r16, java.lang.Object r17, rc.Options r18, ec.j r19, p013kotlin.coroutines.Continuation<? super jc.a.ExecuteResult> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.a.h(rc.g, java.lang.Object, rc.n, ec.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:21:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(ec.h r7, rc.ImageRequest r8, java.lang.Object r9, rc.Options r10, ec.j r11, p013kotlin.coroutines.Continuation<? super ic.i> r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.a.i(ec.h, rc.g, java.lang.Object, rc.n, ec.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jc.d
    public Object a(jc.d.a aVar, Continuation<? super rc.j> continuation) throws Throwable {
        g gVar;
        Throwable th2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f83559q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f83559q = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f83557o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f83559q;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            try {
                ImageRequest request = aVar.getRequest();
                Object data = request.getData();
                Size size = aVar.getSize();
                j jVarL = f0.l(aVar);
                Options optionsC = this.requestService.c(request, size);
                sc.f scale = optionsC.getScale();
                jVarL.l(request, data);
                Object objJ = this.imageLoader.getComponents().j(data, optionsC);
                jVarL.k(request, objJ);
                mc.d.Key keyF = this.memoryCacheService.f(request, objJ, optionsC, jVarL);
                mc.d.Value valueA = keyF != null ? this.memoryCacheService.a(request, keyF, size, scale) : null;
                if (valueA != null) {
                    return this.memoryCacheService.g(aVar, request, keyF, valueA);
                }
                CoroutineContext fetcherCoroutineContext = request.getFetcherCoroutineContext();
                try {
                    h hVar = new h(request, objJ, optionsC, jVarL, keyF, aVar, null);
                    gVar.f83556n = aVar;
                    gVar.f83559q = 1;
                    Object objWithContext = BuildersKt.withContext(fetcherCoroutineContext, hVar, gVar);
                    return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar = aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
            if (th2 instanceof CancellationException) {
                throw th2;
            }
            return f0.c(aVar.getRequest(), th2);
        } catch (Throwable th5) {
            th = th5;
        }
    }
}

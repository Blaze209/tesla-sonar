package ec;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import coil3.request.NullRequestDataException;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import rc.ErrorResult;
import rc.ImageRequest;
import rc.SuccessResult;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001098VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b-\u0010:*\u0004\b;\u0010<R\u001d\u0010A\u001a\u0004\u0018\u00010>8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b!\u0010?*\u0004\b@\u0010<R\u000b\u0010\u001f\u001a\u00020B8\u0002X\u0082\u0004¨\u0006C"}, d2 = {"Lec/v;", "Lec/r;", "Lec/v$a;", "options", "<init>", "(Lec/v$a;)V", "Lrc/g;", "initialRequest", "", "type", "Lrc/j;", "f", "(Lrc/g;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrc/r;", "result", "Lvc/c;", "target", "Lec/j;", "eventListener", "Ljn0/h0;", "k", "(Lrc/r;Lvc/c;Lec/j;)V", "Lrc/e;", "j", "(Lrc/e;Lvc/c;Lec/j;)V", "request", IntegerTokenConverter.CONVERTER_KEY, "(Lrc/g;Lec/j;)V", "Lrc/d;", "b", "(Lrc/g;)Lrc/d;", "shutdown", "()V", "a", "Lec/v$a;", "g", "()Lec/v$a;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lyc/b0;", "c", "Lyc/b0;", "systemCallbacks", "Lrc/p;", DateTokenConverter.CONVERTER_KEY, "Lrc/p;", "requestService", "Lec/h;", "e", "Lec/h;", "getComponents", "()Lec/h;", "components", "Lrc/g$b;", "()Lrc/g$b;", "defaults", "Lmc/d;", "()Lmc/d;", "getMemoryCache$delegate", "(Lec/v;)Ljava/lang/Object;", "memoryCache", "Lhc/a;", "()Lhc/a;", "getDiskCache$delegate", "diskCache", "Lkotlinx/atomicfu/AtomicBoolean;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f62515g = AtomicIntegerFieldUpdater.newUpdater(v.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yc.b0 systemCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rc.p requestService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h components;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile /* synthetic */ int f62521f;

    /* JADX INFO: renamed from: ec.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lec/v$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", Kind.APPLICATION, "Lrc/g$b;", "defaults", "Lkotlin/Lazy;", "Lmc/d;", "memoryCacheLazy", "Lhc/a;", "diskCacheLazy", "Lec/j$c;", "eventListenerFactory", "Lec/h;", "componentRegistry", "Lyc/t;", "logger", "<init>", "(Landroid/content/Context;Lrc/g$b;Lkotlin/Lazy;Lkotlin/Lazy;Lec/j$c;Lec/h;Lyc/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lrc/g$b;", "c", "()Lrc/g$b;", "Lkotlin/Lazy;", "g", "()Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "e", "Lec/j$c;", "()Lec/j$c;", "f", "Lec/h;", "()Lec/h;", "Lyc/t;", "()Lyc/t;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Context application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageRequest.Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Lazy<mc.d> memoryCacheLazy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Lazy<hc.a> diskCacheLazy;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final j.c eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final h componentRegistry;

        /* JADX WARN: Multi-variable type inference failed */
        public Options(Context context, ImageRequest.Defaults defaults, Lazy<? extends mc.d> lazy, Lazy<? extends hc.a> lazy2, j.c cVar, h hVar, yc.t tVar) {
            this.application = context;
            this.defaults = defaults;
            this.memoryCacheLazy = lazy;
            this.diskCacheLazy = lazy2;
            this.eventListenerFactory = cVar;
            this.componentRegistry = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getComponentRegistry() {
            return this.componentRegistry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<hc.a> d() {
            return this.diskCacheLazy;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return p013kotlin.jvm.internal.s.f(this.application, options.application) && p013kotlin.jvm.internal.s.f(this.defaults, options.defaults) && p013kotlin.jvm.internal.s.f(this.memoryCacheLazy, options.memoryCacheLazy) && p013kotlin.jvm.internal.s.f(this.diskCacheLazy, options.diskCacheLazy) && p013kotlin.jvm.internal.s.f(this.eventListenerFactory, options.eventListenerFactory) && p013kotlin.jvm.internal.s.f(this.componentRegistry, options.componentRegistry) && p013kotlin.jvm.internal.s.f(null, null);
        }

        public final yc.t f() {
            return null;
        }

        public final Lazy<mc.d> g() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            return ((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + ((Object) null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lrc/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lrc/j;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super rc.j>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62528n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ImageRequest f62530p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImageRequest imageRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f62530p = imageRequest;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return v.this.new b(this.f62530p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f62528n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            v vVar = v.this;
            ImageRequest imageRequest = this.f62530p;
            this.f62528n = 1;
            Object objF = vVar.f(imageRequest, 0, this);
            return objF == coroutine_suspended ? coroutine_suspended : objF;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super rc.j> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {117, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 133}, m = "execute", n = {"requestDelegate", "request", "eventListener", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f62532o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62533p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f62534q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f62535r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62537t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f62535r = obj;
            this.f62537t |= Integer.MIN_VALUE;
            return v.this.f(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lrc/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lrc/j;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super rc.j>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62538n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageRequest f62539o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ v f62540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Size f62541q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j f62542r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n f62543s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImageRequest imageRequest, v vVar, Size size, j jVar, n nVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f62539o = imageRequest;
            this.f62540p = vVar;
            this.f62541q = size;
            this.f62542r = jVar;
            this.f62543s = nVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f62539o, this.f62540p, this.f62541q, this.f62542r, this.f62543s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f62538n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            jc.e eVar = new jc.e(this.f62539o, this.f62540p.getComponents().g(), 0, this.f62539o, this.f62541q, this.f62542r, this.f62543s != null);
            this.f62538n = 1;
            Object objF = eVar.f(this);
            return objF == coroutine_suspended ? coroutine_suspended : objF;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super rc.j> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public v(Options options) {
        this.options = options;
        options.f();
        this.scope = y.c(null);
        yc.b0 b0VarA = yc.c0.a(this);
        this.systemCallbacks = b0VarA;
        options.f();
        rc.p pVarA = rc.q.a(this, b0VarA, null);
        this.requestService = pVarA;
        options.g();
        options.d();
        h.a aVarE = y.e(b0.a(a0.a(z.a(y.f(options.getComponentRegistry().k(), options), options), options), options));
        options.f();
        this.components = aVarE.i(new jc.a(this, b0VarA, pVarA, null)).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0169 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016d A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017b A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:94:0x0193 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ec.v] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [ec.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ec.j] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ec.j] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ec.j] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [rc.g] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ec.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [rc.o] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object f(ImageRequest imageRequest, int i11, Continuation<? super rc.j> continuation) {
        c cVar;
        rc.o oVarA;
        ImageRequest imageRequest2;
        ?? r11;
        rc.o oVar;
        n image;
        rc.o oVar2;
        ?? r12;
        ImageRequest imageRequest3;
        mc.d dVarD;
        mc.d.Value valueA;
        ImageRequest imageRequest4;
        Object objWithContext;
        ?? r13;
        rc.o oVar3;
        ImageRequest imageRequest5;
        rc.j jVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f62537t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f62537t = i12 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f62535r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r14 = cVar2.f62537t;
        ?? r15 = 2;
        ?? r16 = 1;
        try {
            try {
                if (r14 == 0) {
                    jn0.t.b(obj);
                    oVarA = this.requestService.a(imageRequest, JobKt.getJob(cVar2.getContext()), i11 == 0);
                    oVarA.b();
                    ImageRequest imageRequestD = this.requestService.d(imageRequest);
                    j jVarB = this.options.getEventListenerFactory().b(imageRequestD);
                    try {
                        if (p013kotlin.jvm.internal.s.f(imageRequestD.getData(), rc.l.f107608a)) {
                            throw new NullRequestDataException();
                        }
                        oVarA.start();
                        if (i11 == 0) {
                            cVar2.f62531n = oVarA;
                            cVar2.f62532o = imageRequestD;
                            cVar2.f62533p = jVarB;
                            cVar2.f62537t = 1;
                            if (oVarA.a(cVar2) != coroutine_suspended) {
                                imageRequest2 = imageRequestD;
                                r11 = jVarB;
                                oVar = oVarA;
                                oVarA = oVar;
                                r14 = r11;
                            }
                        } else {
                            imageRequest2 = imageRequestD;
                            r14 = jVarB;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        r16 = oVarA;
                        r15 = imageRequestD;
                        r14 = jVarB;
                        if (!(th instanceof CancellationException)) {
                            i(r15, r14);
                            throw th;
                        }
                        ErrorResult errorResultC = yc.f0.c(r15, th);
                        j(errorResultC, r15.getTarget(), r14);
                        r16.complete();
                        return errorResultC;
                    }
                }
                if (r14 != 1) {
                    if (r14 == 2) {
                        image = (n) cVar2.f62534q;
                        j jVar2 = (j) cVar2.f62533p;
                        ImageRequest imageRequest6 = (ImageRequest) cVar2.f62532o;
                        rc.o oVar4 = (rc.o) cVar2.f62531n;
                        jn0.t.b(obj);
                        r12 = jVar2;
                        imageRequest3 = imageRequest6;
                        oVar2 = oVar4;
                        n nVar = image;
                        try {
                            Size size = (Size) obj;
                            r12.m(imageRequest3, size);
                            CoroutineContext interceptorCoroutineContext = imageRequest3.getInterceptorCoroutineContext();
                            imageRequest4 = imageRequest3;
                            try {
                                d dVar = new d(imageRequest4, this, size, r12, nVar, null);
                                cVar2.f62531n = oVar2;
                                cVar2.f62532o = imageRequest4;
                                cVar2.f62533p = r12;
                                cVar2.f62534q = null;
                                cVar2.f62537t = 3;
                                objWithContext = BuildersKt.withContext(interceptorCoroutineContext, dVar, cVar2);
                                if (objWithContext != coroutine_suspended) {
                                    r13 = r12;
                                    oVar3 = oVar2;
                                    imageRequest5 = imageRequest4;
                                    obj = objWithContext;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th3) {
                                th = th3;
                                r14 = r12;
                                r16 = oVar2;
                                r15 = imageRequest4;
                                try {
                                    if (!(th instanceof CancellationException)) {
                                        i(r15, r14);
                                        throw th;
                                    }
                                    ErrorResult errorResultC2 = yc.f0.c(r15, th);
                                    j(errorResultC2, r15.getTarget(), r14);
                                    r16.complete();
                                    return errorResultC2;
                                } catch (Throwable th4) {
                                    r16.complete();
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            imageRequest4 = imageRequest3;
                        }
                    } else {
                        if (r14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j jVar3 = (j) cVar2.f62533p;
                        imageRequest5 = (ImageRequest) cVar2.f62532o;
                        oVar3 = (rc.o) cVar2.f62531n;
                        jn0.t.b(obj);
                        r13 = jVar3;
                    }
                    jVar = (rc.j) obj;
                    if (jVar instanceof SuccessResult) {
                        k((SuccessResult) jVar, imageRequest5.getTarget(), r13);
                    } else {
                        if (jVar instanceof ErrorResult) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j((ErrorResult) jVar, imageRequest5.getTarget(), r13);
                    }
                    oVar3.complete();
                    return jVar;
                }
                r14 = (j) cVar2.f62533p;
                imageRequest2 = (ImageRequest) cVar2.f62532o;
                oVar = (rc.o) cVar2.f62531n;
                try {
                    jn0.t.b(obj);
                    r11 = r14;
                    oVarA = oVar;
                    r14 = r11;
                } catch (Throwable th6) {
                    th = th6;
                    r15 = imageRequest2;
                    r16 = oVar;
                    if (!(th instanceof CancellationException)) {
                        i(r15, r14);
                        throw th;
                    }
                    ErrorResult errorResultC3 = yc.f0.c(r15, th);
                    j(errorResultC3, r15.getTarget(), r14);
                    r16.complete();
                    return errorResultC3;
                }
                mc.d.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                image = (placeholderMemoryCacheKey == null || (dVarD = d()) == null || (valueA = dVarD.a(placeholderMemoryCacheKey)) == null) ? null : valueA.getImage();
                vc.c target = imageRequest2.getTarget();
                if (target != null) {
                    target.d(image == null ? imageRequest2.B() : image);
                }
                r14.d(imageRequest2);
                ImageRequest.d listener = imageRequest2.getListener();
                if (listener != null) {
                    listener.d(imageRequest2);
                }
                sc.i sizeResolver = imageRequest2.getSizeResolver();
                r14.n(imageRequest2, sizeResolver);
                cVar2.f62531n = oVarA;
                cVar2.f62532o = imageRequest2;
                cVar2.f62533p = r14;
                cVar2.f62534q = image;
                cVar2.f62537t = 2;
                Object objA = sizeResolver.a(cVar2);
                if (objA != coroutine_suspended) {
                    oVar2 = oVarA;
                    obj = objA;
                    r12 = r14;
                    imageRequest3 = imageRequest2;
                    n nVar2 = image;
                    Size size2 = (Size) obj;
                    r12.m(imageRequest3, size2);
                    CoroutineContext interceptorCoroutineContext2 = imageRequest3.getInterceptorCoroutineContext();
                    imageRequest4 = imageRequest3;
                    d dVar2 = new d(imageRequest4, this, size2, r12, nVar2, null);
                    cVar2.f62531n = oVar2;
                    cVar2.f62532o = imageRequest4;
                    cVar2.f62533p = r12;
                    cVar2.f62534q = null;
                    cVar2.f62537t = 3;
                    objWithContext = BuildersKt.withContext(interceptorCoroutineContext2, dVar2, cVar2);
                    if (objWithContext != coroutine_suspended) {
                        r13 = r12;
                        oVar3 = oVar2;
                        imageRequest5 = imageRequest4;
                        obj = objWithContext;
                        jVar = (rc.j) obj;
                        if (jVar instanceof SuccessResult) {
                            k((SuccessResult) jVar, imageRequest5.getTarget(), r13);
                        } else {
                            if (jVar instanceof ErrorResult) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j((ErrorResult) jVar, imageRequest5.getTarget(), r13);
                        }
                        oVar3.complete();
                        return jVar;
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th7) {
                th = th7;
                r15 = imageRequest2;
                r16 = oVarA;
                if (!(th instanceof CancellationException)) {
                    i(r15, r14);
                    throw th;
                }
                ErrorResult errorResultC4 = yc.f0.c(r15, th);
                j(errorResultC4, r15.getTarget(), r14);
                r16.complete();
                return errorResultC4;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    private final void i(ImageRequest request, j eventListener) {
        this.options.f();
        eventListener.c(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.c(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    private final void j(ErrorResult result, vc.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        this.options.f();
        if (target instanceof xc.e) {
            xc.d dVarA = rc.i.m(result.getRequest()).a((xc.e) target, result);
            if (dVarA instanceof xc.c) {
                target.c(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.c(result.getImage());
        }
        eventListener.b(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.b(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    private final void k(SuccessResult result, vc.c target, j eventListener) {
        ImageRequest request = result.getRequest();
        result.getDataSource();
        this.options.f();
        if (target instanceof xc.e) {
            xc.d dVarA = rc.i.m(result.getRequest()).a((xc.e) target, result);
            if (dVarA instanceof xc.c) {
                target.b(result.getImage());
            } else {
                eventListener.r(result.getRequest(), dVarA);
                dVarA.a();
                eventListener.q(result.getRequest(), dVarA);
            }
        } else if (target != null) {
            target.b(result.getImage());
        }
        eventListener.a(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.a(request, result);
        }
    }

    @Override // ec.r
    public hc.a a() {
        return this.options.d().getValue();
    }

    @Override // ec.r
    public rc.d b(ImageRequest request) {
        return z.c(request, BuildersKt__Builders_commonKt.async$default(this.scope, Dispatchers.getMain().getImmediate(), null, new b(request, null), 2, null));
    }

    @Override // ec.r
    public ImageRequest.Defaults c() {
        return this.options.getDefaults();
    }

    @Override // ec.r
    public mc.d d() {
        return this.options.g().getValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @Override // ec.r
    public h getComponents() {
        return this.components;
    }

    @Override // ec.r
    public void shutdown() {
        if (f62515g.getAndSet(this, 1) == 1) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        mc.d dVarD = d();
        if (dVarD != null) {
            dVarD.clear();
        }
    }
}

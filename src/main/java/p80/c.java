package p80;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.UUID;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0014\u0016B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB!\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lp80/c;", "Lp80/b;", "Lp80/c$c;", PlaceTypes.STORE, "", "appVersion", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lp80/c$c;ILkotlin/coroutines/CoroutineContext;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "Lp80/a;", "e", "()Lp80/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp80/c$c;", "b", "I", "c", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements p80.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f101932c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2154c store;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1", f = "DefaultAppInfoRepository.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f101935n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f101935n;
            if (i11 == 0) {
                t.b(obj);
                InterfaceC2154c interfaceC2154c = c.this.store;
                this.f101935n = 1;
                obj = interfaceC2154c.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            AppInfo appInfo = (AppInfo) obj;
            if (appInfo == null || c.this.appVersion != appInfo.getVersion()) {
                c.this.e();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lp80/c$b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)I", "INVALID_VERSION_CODE", "I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context) {
            Object objB;
            try {
                s.Companion companion = s.INSTANCE;
                objB = s.b(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            if (s.g(objB)) {
                objB = -1;
            }
            return ((Number) objB).intValue();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: p80.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp80/c$c;", "", "Lp80/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appInfo", "Ljn0/h0;", "b", "(Lp80/a;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC2154c {

        /* JADX INFO: renamed from: p80.c$c$a */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lp80/c$c$a;", "Lp80/c$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appVersion", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "Lp80/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appInfo", "Ljn0/h0;", "b", "(Lp80/a;)V", "I", "Lkotlin/coroutines/CoroutineContext;", "Landroid/content/SharedPreferences;", "c", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/SharedPreferences;", "sharedPrefs", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC2154c {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final C2155a f101937d = new C2155a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int appVersion;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final CoroutineContext workContext;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Lazy sharedPrefs;

            /* JADX INFO: renamed from: p80.c$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp80/c$c$a$a;", "", "<init>", "()V", "", "KEY_APP_VERSION", "Ljava/lang/String;", "KEY_SDK_APP_ID", "PREFS_NAME", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class C2155a {
                public /* synthetic */ C2155a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C2155a() {
                }
            }

            /* JADX INFO: renamed from: p80.c$c$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lp80/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lp80/a;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store$Default$get$2", f = "DefaultAppInfoRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super AppInfo>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f101941n;

                b(Continuation<? super b> continuation) {
                    super(2, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return a.this.new b(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f101941n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    int i11 = a.this.d().getInt("app_version", 0);
                    String string = a.this.d().getString("sdk_app_id", null);
                    if (string != null) {
                        return new AppInfo(string, i11);
                    }
                    return null;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AppInfo> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: p80.c$c$a$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 9, 0})
            static final class C2156c extends u implements wn0.a<SharedPreferences> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Context f101943c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2156c(Context context) {
                    super(0);
                    this.f101943c = context;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SharedPreferences invoke() {
                    return this.f101943c.getSharedPreferences("app_info", 0);
                }
            }

            public a(Context context, int i11, CoroutineContext workContext) {
                p013kotlin.jvm.internal.s.k(context, "context");
                p013kotlin.jvm.internal.s.k(workContext, "workContext");
                this.appVersion = i11;
                this.workContext = workContext;
                this.sharedPrefs = jn0.m.b(new C2156c(context));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences d() {
                Object value = this.sharedPrefs.getValue();
                p013kotlin.jvm.internal.s.j(value, "getValue(...)");
                return (SharedPreferences) value;
            }

            @Override // p80.c.InterfaceC2154c
            public Object a(Continuation<? super AppInfo> continuation) {
                return BuildersKt.withContext(this.workContext, new b(null), continuation);
            }

            @Override // p80.c.InterfaceC2154c
            public void b(AppInfo appInfo) {
                p013kotlin.jvm.internal.s.k(appInfo, "appInfo");
                d().edit().putInt("app_version", this.appVersion).putString("sdk_app_id", appInfo.getSdkAppId()).apply();
            }
        }

        Object a(Continuation<? super AppInfo> continuation);

        void b(AppInfo appInfo);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository", f = "DefaultAppInfoRepository.kt", i = {0}, l = {61}, m = "get", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f101944n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f101945o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f101947q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f101945o = obj;
            this.f101947q |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(InterfaceC2154c store, int i11, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(store, "store");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.store = store;
        this.appVersion = i11;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(workContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppInfo e() {
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        AppInfo appInfo = new AppInfo(string, this.appVersion);
        this.store.b(appInfo);
        return appInfo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p80.b
    public Object a(Continuation<? super AppInfo> continuation) {
        d dVar;
        c cVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f101947q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f101947q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.f101945o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f101947q;
        if (i12 == 0) {
            t.b(objA);
            InterfaceC2154c interfaceC2154c = this.store;
            dVar.f101944n = this;
            dVar.f101947q = 1;
            objA = interfaceC2154c.a(dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) dVar.f101944n;
            t.b(objA);
        }
        AppInfo appInfo = (AppInfo) objA;
        return appInfo == null ? cVar.e() : appInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, CoroutineContext workContext) {
        this(context, f101932c.b(context), workContext);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i11, CoroutineContext workContext) {
        this(new InterfaceC2154c.a(context, i11, workContext), i11, workContext);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }
}

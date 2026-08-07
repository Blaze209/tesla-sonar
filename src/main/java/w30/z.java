package w30;

import android.app.Application;
import android.content.SharedPreferences;
import ezvcard.property.Kind;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw30/z;", "Lw30/k;", "Landroid/content/SharedPreferences;", "sharedPrefs", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/SharedPreferences;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroid/app/Application;", Kind.APPLICATION, "(Landroid/app/Application;)V", "Lw30/g;", "request", "", "b", "(Lw30/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "Lkotlinx/coroutines/CoroutineDispatcher;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPrefs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lw30/g;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lw30/g;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$retrieve$2", f = "AnalyticsRequestV2Storage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super AnalyticsRequestV2>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120704n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f120706p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f120706p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return z.this.new a(this.f120706p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f120704n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            String string = z.this.sharedPrefs.getString(this.f120706p, null);
            if (string == null) {
                return null;
            }
            z.this.sharedPrefs.edit().remove(this.f120706p).apply();
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                wo0.b.Companion companion2 = wo0.b.INSTANCE;
                companion2.getSerializersModule();
                objB = jn0.s.b((AnalyticsRequestV2) companion2.d(AnalyticsRequestV2.INSTANCE.serializer(), string));
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                return null;
            }
            return objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsRequestV2> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$store$2", f = "AnalyticsRequestV2Storage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120707n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ AnalyticsRequestV2 f120708o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ z f120709p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AnalyticsRequestV2 analyticsRequestV2, z zVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f120708o = analyticsRequestV2;
            this.f120709p = zVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f120708o, this.f120709p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f120707n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            String string = UUID.randomUUID().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            wo0.b.Companion companion = wo0.b.INSTANCE;
            AnalyticsRequestV2 analyticsRequestV2 = this.f120708o;
            companion.getSerializersModule();
            this.f120709p.sharedPrefs.edit().putString(string, companion.b(AnalyticsRequestV2.INSTANCE.serializer(), analyticsRequestV2)).apply();
            return string;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    private z(SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        this.sharedPrefs = sharedPreferences;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // w30.k
    public Object a(String str, Continuation<? super AnalyticsRequestV2> continuation) {
        return BuildersKt.withContext(this.dispatcher, new a(str, null), continuation);
    }

    @Override // w30.k
    public Object b(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new b(analyticsRequestV2, this, null), continuation);
    }

    /* synthetic */ z(SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, (i11 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public z(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("StripeAnalyticsRequestV2Storage", 0);
        p013kotlin.jvm.internal.s.j(sharedPreferences, "getSharedPreferences(...)");
        this(sharedPreferences, null, 2, 0 == true ? 1 : 0);
    }
}

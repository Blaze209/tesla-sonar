package r30;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lr30/c;", "Lr30/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Lr30/d;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fraudDetectionData", "Ljn0/h0;", "b", "(Lr30/d;)V", "Lkotlin/coroutines/CoroutineContext;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/SharedPreferences;", "prefs", "c", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f106931c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy prefs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lr30/c$a;", "", "<init>", "()V", "", "KEY_DATA", "Ljava/lang/String;", "PREF_FILE", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lr30/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lr30/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$get$2", f = "FraudDetectionDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106934n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106935o;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<Long> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f106937c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(JSONObject jSONObject) {
                super(0);
                this.f106937c = jSONObject;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(this.f106937c.optLong("timestamp", -1L));
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = c.this.new b(continuation);
            bVar.f106935o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f106934n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            c cVar = c.this;
            try {
                s.Companion companion = s.INSTANCE;
                String string = cVar.d().getString("key_fraud_detection_data", null);
                if (string == null) {
                    string = "";
                }
                JSONObject jSONObject = new JSONObject(string);
                objB = s.b(new e(new a(jSONObject)).a(jSONObject));
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            if (s.g(objB)) {
                return null;
            }
            return objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: r30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 9, 0})
    static final class C2269c extends u implements wn0.a<SharedPreferences> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f106938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2269c(Context context) {
            super(0);
            this.f106938c = context;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return this.f106938c.getSharedPreferences("FraudDetectionDataStore", 0);
        }
    }

    public c(Context context, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.workContext = workContext;
        this.prefs = jn0.m.b(new C2269c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences d() {
        return (SharedPreferences) this.prefs.getValue();
    }

    @Override // r30.l
    public Object a(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new b(null), continuation);
    }

    @Override // r30.l
    public void b(FraudDetectionData fraudDetectionData) {
        p013kotlin.jvm.internal.s.k(fraudDetectionData, "fraudDetectionData");
        d().edit().putString("key_fraud_detection_data", fraudDetectionData.f().toString()).apply();
    }
}

package n70;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Ln70/e;", "Ln70/r;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "customerId", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "value", "Ljn0/h0;", "g", "(Ljava/lang/String;)V", "", "h", "(Ljava/lang/String;)Z", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "isGooglePayAvailable", "isLinkAvailable", "Lw70/m;", "b", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw70/j;", "paymentSelection", "c", "(Lw70/j;)V", "savedSelection", "a", "(Lw70/m;)Z", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "Landroid/content/SharedPreferences;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "j", "()Landroid/content/SharedPreferences;", "prefs", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f93401f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String customerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy prefs;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lw70/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lw70/m;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2", f = "DefaultPrefsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super w70.m>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93406n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f93408p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f93409q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f93408p = z11;
            this.f93409q = z12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.f93408p, this.f93409q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0059 A[PHI: r9
          0x0059: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v18 java.lang.Object) binds: [B:32:0x0080, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f93406n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            Object paymentMethod = null;
            String string = e.this.j().getString(e.this.i(), null);
            if (string == null) {
                string = "";
            }
            List listF1 = p013kotlin.text.t.f1(string, new String[]{":"}, false, 0, 6, null);
            String str2 = (String) p013kotlin.collections.v.q0(listF1);
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1534821982) {
                    if (iHashCode != -1029412550) {
                        if (iHashCode == 3321850 && str2.equals("link")) {
                            obj2 = w70.m.b.f121199a;
                            if (this.f93409q) {
                                paymentMethod = obj2;
                            }
                        }
                    } else if (str2.equals("payment_method") && (str = (String) p013kotlin.collections.v.r0(listF1, 1)) != null) {
                        paymentMethod = new w70.m.PaymentMethod(str);
                    }
                } else if (str2.equals("google_pay")) {
                    obj2 = w70.m.a.f121198a;
                    if (this.f93408p) {
                        paymentMethod = obj2;
                    }
                }
            }
            return paymentMethod == null ? w70.m.c.f121200a : paymentMethod;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super w70.m> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<SharedPreferences> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return e.this.context.getSharedPreferences("DefaultPrefsRepository", 0);
        }
    }

    public e(Context context, String str, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.context = context;
        this.customerId = str;
        this.workContext = workContext;
        this.prefs = jn0.m.b(new c());
    }

    private final void g(String value) {
        j().edit().putString(i(), value).apply();
    }

    private final boolean h(String value) {
        return j().edit().putString(i(), value).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i() {
        String str = this.customerId;
        if (str == null) {
            return "guest";
        }
        String str2 = "customer[" + str + "]";
        return str2 == null ? "guest" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences j() {
        Object value = this.prefs.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // n70.r
    public boolean a(w70.m savedSelection) {
        String str;
        if (p013kotlin.jvm.internal.s.f(savedSelection, w70.m.a.f121198a)) {
            str = "google_pay";
        } else if (p013kotlin.jvm.internal.s.f(savedSelection, w70.m.b.f121199a)) {
            str = "link";
        } else if (savedSelection instanceof w70.m.PaymentMethod) {
            str = "payment_method:" + ((w70.m.PaymentMethod) savedSelection).getId();
        } else {
            str = "";
        }
        return h(str);
    }

    @Override // n70.r
    public Object b(boolean z11, boolean z12, Continuation<? super w70.m> continuation) {
        return BuildersKt.withContext(this.workContext, new b(z11, z12, null), continuation);
    }

    @Override // n70.r
    public void c(w70.j paymentSelection) {
        String str = null;
        w70.m mVarA = paymentSelection != null ? w70.n.a(paymentSelection) : null;
        if (p013kotlin.jvm.internal.s.f(mVarA, w70.m.a.f121198a)) {
            str = "google_pay";
        } else if (p013kotlin.jvm.internal.s.f(mVarA, w70.m.b.f121199a)) {
            str = "link";
        } else if (mVarA instanceof w70.m.PaymentMethod) {
            str = "payment_method:" + ((w70.m.PaymentMethod) mVarA).getId();
        }
        if (str != null) {
            g(str);
        }
    }
}

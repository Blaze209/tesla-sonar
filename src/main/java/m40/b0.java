package m40;

import android.app.Application;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import ezvcard.property.Kind;
import java.util.Locale;
import javax.inject.Provider;
import o30.ApiVersion;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lm40/b0;", "", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f91082a;

    /* JADX INFO: renamed from: m40.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J!\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u00104\u001a\u00020\u0014H\u0001¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lm40/b0$a;", "", "<init>", "()V", "", "publishableKey", "stripeAccountId", "Lw30/l$c;", "j", "(Ljava/lang/String;Ljava/lang/String;)Lw30/l$c;", "Lwo0/b;", "m", "()Lwo0/b;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo30/d;", "logger", "Lw30/j0;", "g", "(Lkotlin/coroutines/CoroutineContext;Lo30/d;)Lw30/j0;", "Landroid/app/Application;", "Ln40/b0;", "getOrFetchSync", "Ljava/util/Locale;", "locale", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lw30/h;", "requestExecutor", "Lj40/f;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/app/Application;Ln40/b0;Ljava/util/Locale;Lcom/stripe/android/financialconnections/a$b;Lw30/h;)Lj40/f;", "Lo30/b;", "apiVersion", "Lw30/l$b;", "k", "(Lo30/b;)Lw30/l$b;", "Lt50/s;", "repository", "Lt50/r;", DateTokenConverter.CONVERTER_KEY, "(Lt50/s;)Lt50/r;", "Lj40/c;", "defaultFinancialConnectionsEventReporter", "Lj40/k;", "e", "(Lj40/c;)Lj40/k;", "Lw30/o;", "executor", "Lw30/c;", "h", "(Lw30/o;)Lw30/c;", Kind.APPLICATION, "Lw30/e;", "b", "(Landroid/app/Application;Ljava/lang/String;)Lw30/e;", "Lz30/e;", "l", "(Ln40/b0;)Lz30/e;", "Lr30/g;", "f", "(Landroid/app/Application;)Lr30/g;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f91082a = new Companion();

        /* JADX INFO: renamed from: m40.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1", f = "FinancialConnectionsSheetSharedModule.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
        static final class C1940a extends SuspendLambda implements wn0.l<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f91083n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ n40.b0 f91084o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1940a(n40.b0 b0Var, Continuation<? super C1940a> continuation) {
                super(1, continuation);
                this.f91084o = b0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Continuation<?> continuation) {
                return new C1940a(this.f91084o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f91083n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    n40.b0 b0Var = this.f91084o;
                    this.f91083n = 1;
                    obj = n40.b0.b(b0Var, null, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return Boxing.boxBoolean(p022s40.k.b(((SynchronizeSessionResponse) obj).getManifest()));
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((C1940a) create(continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: m40.b0$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwo0/d;", "Ljn0/h0;", "a", "(Lwo0/d;)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<wo0.d, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f91085c = new b();

            b() {
                super(1);
            }

            public final void a(wo0.d Json) {
                p013kotlin.jvm.internal.s.k(Json, "$this$Json");
                Json.d(true);
                Json.h(true);
                Json.i(true);
                Json.f(true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(wo0.d dVar) {
                a(dVar);
                return jn0.h0.f84049a;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(String publishableKey) {
            p013kotlin.jvm.internal.s.k(publishableKey, "$publishableKey");
            return publishableKey;
        }

        public final w30.e b(Application application, final String publishableKey) {
            p013kotlin.jvm.internal.s.k(application, "application");
            p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new w30.e(packageManager, z30.a.f126806a.a(application), packageName, new Provider() { // from class: m40.a0
                @Override // javax.inject.Provider
                public final Object get() {
                    return b0.Companion.c(publishableKey);
                }
            }, new e40.b(new w30.x(application)), null, 32, null);
        }

        public final t50.r d(t50.s repository) {
            p013kotlin.jvm.internal.s.k(repository, "repository");
            return repository;
        }

        public final j40.k e(j40.c defaultFinancialConnectionsEventReporter) {
            p013kotlin.jvm.internal.s.k(defaultFinancialConnectionsEventReporter, "defaultFinancialConnectionsEventReporter");
            return defaultFinancialConnectionsEventReporter;
        }

        public final r30.g f(Application application) {
            p013kotlin.jvm.internal.s.k(application, "application");
            return z50.h.c(application);
        }

        public final w30.j0 g(CoroutineContext context, o30.d logger) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            return new w30.r(context, null, null, 0, logger, 14, null);
        }

        public final w30.c h(w30.o executor) {
            p013kotlin.jvm.internal.s.k(executor, "executor");
            return executor;
        }

        public final j40.f i(Application context, n40.b0 getOrFetchSync, Locale locale, com.stripe.android.financialconnections.a.Configuration configuration, w30.h requestExecutor) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Locale locale2 = locale;
            p013kotlin.jvm.internal.s.h(locale2);
            return new j40.g(getOrFetchSync, configuration, locale2, context, requestExecutor);
        }

        public final w30.l.Options j(String publishableKey, String stripeAccountId) {
            p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
            return new w30.l.Options(publishableKey, stripeAccountId, null, 4, null);
        }

        public final w30.l.b k(ApiVersion apiVersion) {
            p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
            return new w30.l.b(null, apiVersion.b(), null, 5, null);
        }

        public final z30.e l(n40.b0 getOrFetchSync) {
            p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
            return new z30.g(new C1940a(getOrFetchSync, null));
        }

        public final wo0.b m() {
            return wo0.u.b(null, b.f91085c, 1, null);
        }
    }
}

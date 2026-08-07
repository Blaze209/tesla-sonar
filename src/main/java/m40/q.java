package m40;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Locale;
import javax.inject.Provider;
import o30.ApiVersion;
import p013kotlin.Metadata;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lm40/q;", "", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f91202a;

    /* JADX INFO: renamed from: m40.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ[\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b+\u0010,J7\u00100\u001a\u00020/2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101J'\u00103\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u0002052\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b7\u00108J3\u0010?\u001a\u00020>2\u0006\u0010%\u001a\u00020$2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<09H\u0001¢\u0006\u0004\b?\u0010@J\u0019\u0010C\u001a\u0004\u0018\u00010(2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lm40/q$a;", "", "<init>", "()V", "Lo30/b;", "apiVersion", "Lw30/j0;", "stripeNetworkClient", "Lm80/a;", "a", "(Lo30/b;Lw30/j0;)Lm80/a;", "Landroid/app/Application;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo90/f;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/app/Application;)Lo90/f;", "Lr50/a;", "requestExecutor", "Lw30/l$b;", "apiRequestFactory", "Lu50/c;", "provideApiRequestOptions", "Ljava/util/Locale;", "locale", "Lo30/d;", "logger", "Lcom/stripe/android/financialconnections/model/k0;", "initialSynchronizeSessionResponse", "Lt50/p;", "h", "(Lr50/a;Lw30/l$b;Lu50/c;Ljava/util/Locale;Lo30/d;Lcom/stripe/android/financialconnections/model/k0;)Lt50/p;", "consumersApiService", "Lu50/a;", "financialConnectionsConsumersApiService", "Lt50/g;", "consumerSessionRepository", "Ln40/e0;", "isLinkWithStripe", "Lr30/g;", "fraudDetectionDataRepository", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Lt50/j;", "f", "(Lm80/a;Lu50/c;Lu50/a;Lt50/g;Ljava/util/Locale;Lo30/d;Ln40/e0;Lr30/g;Lcom/stripe/android/financialconnections/a$c;)Lt50/j;", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lt50/h;", "e", "(Lr50/a;Lu50/c;Lw30/l$b;Lo30/d;Landroidx/lifecycle/s0;)Lt50/h;", "Lt50/n;", "g", "(Lr50/a;Lu50/c;Lw30/l$b;)Lt50/n;", "Lw30/l$c;", "apiOptions", "c", "(Lr50/a;Lw30/l$c;Lw30/l$b;)Lu50/a;", "Ljavax/inject/Provider;", "Le50/b;", "linkSignupHandlerForInstantDebits", "Le50/d;", "linkSignupHandlerForNetworking", "Le50/a;", DateTokenConverter.CONVERTER_KEY, "(Ln40/e0;Ljavax/inject/Provider;Ljavax/inject/Provider;)Le50/a;", "Ls50/c;", "initialState", "b", "(Ls50/c;)Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f91202a = new Companion();

        private Companion() {
        }

        public final m80.a a(ApiVersion apiVersion, w30.j0 stripeNetworkClient) {
            p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
            p013kotlin.jvm.internal.s.k(stripeNetworkClient, "stripeNetworkClient");
            return new m80.b(stripeNetworkClient, apiVersion.b(), "AndroidBindings/20.52.3", null);
        }

        public final com.stripe.android.financialconnections.a.ElementsSessionContext b(FinancialConnectionsSheetNativeState initialState) {
            p013kotlin.jvm.internal.s.k(initialState, "initialState");
            return initialState.getElementsSessionContext();
        }

        public final u50.a c(r50.a requestExecutor, w30.l.Options apiOptions, w30.l.b apiRequestFactory) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(apiOptions, "apiOptions");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            return u50.a.INSTANCE.a(requestExecutor, apiOptions, apiRequestFactory);
        }

        public final e50.a d(n40.e0 isLinkWithStripe, Provider<e50.b> linkSignupHandlerForInstantDebits, Provider<e50.d> linkSignupHandlerForNetworking) {
            p013kotlin.jvm.internal.s.k(isLinkWithStripe, "isLinkWithStripe");
            p013kotlin.jvm.internal.s.k(linkSignupHandlerForInstantDebits, "linkSignupHandlerForInstantDebits");
            p013kotlin.jvm.internal.s.k(linkSignupHandlerForNetworking, "linkSignupHandlerForNetworking");
            if (isLinkWithStripe.invoke()) {
                e50.b bVar = linkSignupHandlerForInstantDebits.get();
                p013kotlin.jvm.internal.s.h(bVar);
                return bVar;
            }
            e50.d dVar = linkSignupHandlerForNetworking.get();
            p013kotlin.jvm.internal.s.h(dVar);
            return dVar;
        }

        public final t50.h e(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory, o30.d logger, s0 savedStateHandle) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
            return t50.h.INSTANCE.a(requestExecutor, provideApiRequestOptions, apiRequestFactory, logger, savedStateHandle);
        }

        public final t50.j f(m80.a consumersApiService, u50.c provideApiRequestOptions, u50.a financialConnectionsConsumersApiService, t50.g consumerSessionRepository, Locale locale, o30.d logger, n40.e0 isLinkWithStripe, r30.g fraudDetectionDataRepository, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
            p013kotlin.jvm.internal.s.k(consumersApiService, "consumersApiService");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
            p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(isLinkWithStripe, "isLinkWithStripe");
            p013kotlin.jvm.internal.s.k(fraudDetectionDataRepository, "fraudDetectionDataRepository");
            return t50.j.INSTANCE.a(consumersApiService, provideApiRequestOptions, consumerSessionRepository, financialConnectionsConsumersApiService, locale == null ? Locale.getDefault() : locale, logger, isLinkWithStripe, fraudDetectionDataRepository, elementsSessionContext);
        }

        public final t50.n g(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            return t50.n.INSTANCE.a(requestExecutor, provideApiRequestOptions, apiRequestFactory);
        }

        public final t50.p h(r50.a requestExecutor, w30.l.b apiRequestFactory, u50.c provideApiRequestOptions, Locale locale, o30.d logger, SynchronizeSessionResponse initialSynchronizeSessionResponse) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            t50.p.Companion companion = t50.p.INSTANCE;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Locale locale2 = locale;
            p013kotlin.jvm.internal.s.h(locale2);
            return companion.a(requestExecutor, apiRequestFactory, provideApiRequestOptions, logger, locale2, initialSynchronizeSessionResponse);
        }

        public final o90.f i(Application context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return new o90.f(context, null, null, null, null, 14, null);
        }
    }
}

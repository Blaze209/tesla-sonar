package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.t1;
import java.util.Locale;
import n40.e0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001a\u0010\fJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\fJ(\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\b¨\u0006\""}, d2 = {"Lt50/j;", "", "", Scopes.EMAIL, "phoneNumber", PlaceTypes.COUNTRY, "Lcom/stripe/android/model/v;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "Lcom/stripe/android/model/u;", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "connectionsMerchantName", "Lcom/stripe/android/model/t1;", "type", "Lcom/stripe/android/model/z;", "customEmailType", "Lcom/stripe/android/model/t;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lcom/stripe/android/model/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationCode", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/c;", "f", "bankAccountId", "Lcom/stripe/android/model/p;", "c", "paymentDetailsId", "expectedPaymentMethodType", "Lcom/stripe/android/model/e1;", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112532a;

    /* JADX INFO: renamed from: t50.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lt50/j$a;", "", "<init>", "()V", "Lm80/a;", "consumersApiService", "Lu50/c;", "provideApiRequestOptions", "Lt50/g;", "consumerSessionRepository", "Lu50/a;", "financialConnectionsConsumersApiService", "Ljava/util/Locale;", "locale", "Lo30/d;", "logger", "Ln40/e0;", "isLinkWithStripe", "Lr30/g;", "fraudDetectionDataRepository", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Lt50/j;", "a", "(Lm80/a;Lu50/c;Lt50/g;Lu50/a;Ljava/util/Locale;Lo30/d;Ln40/e0;Lr30/g;Lcom/stripe/android/financialconnections/a$c;)Lt50/j;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f112532a = new Companion();

        private Companion() {
        }

        public final j a(m80.a consumersApiService, u50.c provideApiRequestOptions, g consumerSessionRepository, u50.a financialConnectionsConsumersApiService, Locale locale, o30.d logger, e0 isLinkWithStripe, r30.g fraudDetectionDataRepository, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
            p013kotlin.jvm.internal.s.k(consumersApiService, "consumersApiService");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
            p013kotlin.jvm.internal.s.k(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(isLinkWithStripe, "isLinkWithStripe");
            p013kotlin.jvm.internal.s.k(fraudDetectionDataRepository, "fraudDetectionDataRepository");
            return new k(financialConnectionsConsumersApiService, consumersApiService, consumerSessionRepository, provideApiRequestOptions, locale, logger, fraudDetectionDataRepository, elementsSessionContext, isLinkWithStripe);
        }
    }

    Object a(String str, String str2, String str3, Continuation<? super ConsumerSessionSignup> continuation);

    Object b(String str, String str2, String str3, Continuation<? super SharePaymentDetails> continuation);

    Object c(String str, String str2, Continuation<? super ConsumerPaymentDetails> continuation);

    Object d(String str, String str2, t1 t1Var, com.stripe.android.model.z zVar, Continuation<? super ConsumerSession> continuation);

    Object e(String str, String str2, t1 t1Var, Continuation<? super ConsumerSession> continuation);

    Object f(String str, String str2, Continuation<? super AttachConsumerToLinkAccountSession> continuation);

    Object g(String str, String str2, Continuation<? super ConsumerSessionLookup> continuation);
}

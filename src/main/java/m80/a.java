package m80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.q;
import com.stripe.android.model.t1;
import com.stripe.android.model.w;
import com.stripe.android.model.z;
import java.util.Locale;
import java.util.Map;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0088\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b!\u0010\"J8\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b$\u0010%J0\u0010(\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b(\u0010)J<\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.JZ\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000101H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lm80/a;", "", "", Scopes.EMAIL, "phoneNumber", PlaceTypes.COUNTRY, "name", "Ljava/util/Locale;", "locale", "", "amount", "currency", "paymentIntentId", "setupIntentId", "requestSurface", "Lcom/stripe/android/model/w;", "consentAction", "Lw30/l$c;", "requestOptions", "Ljn0/s;", "Lcom/stripe/android/model/v;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "Lcom/stripe/android/model/t1;", "type", "Lcom/stripe/android/model/z;", "customEmailType", "connectionsMerchantName", "Lcom/stripe/android/model/t;", "c", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/t1;Lcom/stripe/android/model/z;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationCode", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "Lcom/stripe/android/model/c;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/q;", "paymentDetailsCreateParams", "Lcom/stripe/android/model/p;", "e", "(Ljava/lang/String;Lcom/stripe/android/model/q;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentDetailsId", "expectedPaymentMethodType", "", "extraParams", "Lcom/stripe/android/model/e1;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    Object a(String str, String str2, l.Options options, Continuation<? super ConsumerSessionLookup> continuation);

    Object b(String str, String str2, String str3, String str4, l.Options options, Map<String, ? extends Object> map, Continuation<? super s<SharePaymentDetails>> continuation);

    Object c(String str, Locale locale, String str2, t1 t1Var, z zVar, String str3, l.Options options, Continuation<? super ConsumerSession> continuation);

    Object d(String str, String str2, String str3, t1 t1Var, l.Options options, Continuation<? super ConsumerSession> continuation);

    Object e(String str, q qVar, String str2, l.Options options, Continuation<? super s<ConsumerPaymentDetails>> continuation);

    Object f(String str, String str2, String str3, String str4, Locale locale, Long l11, String str5, String str6, String str7, String str8, w wVar, l.Options options, Continuation<? super s<ConsumerSessionSignup>> continuation);

    Object g(String str, String str2, String str3, l.Options options, Continuation<? super AttachConsumerToLinkAccountSession> continuation);
}

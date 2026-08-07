package h60;

import c60.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.w;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJN\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lh60/c;", "", "", Scopes.EMAIL, "Ljn0/s;", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", PlaceTypes.COUNTRY, "name", "Lcom/stripe/android/model/w;", "consentAction", "Lcom/stripe/android/model/v;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "userEmail", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "consumerSessionClientSecret", "consumerPublishableKey", "", "active", "Lc60/e$a;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/w0;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "last4", "Lc60/e;", "e", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerAccountPublishableKey", "Lcom/stripe/android/model/t;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {
    Object a(String str, Continuation<? super s<ConsumerSessionLookup>> continuation);

    Object b(String str, String str2, String str3, String str4, w wVar, Continuation<? super s<ConsumerSessionSignup>> continuation);

    Object c(String str, String str2, Continuation<? super s<ConsumerSession>> continuation);

    Object d(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, boolean z11, Continuation<? super s<e.a>> continuation);

    Object e(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, String str3, Continuation<? super s<? extends e>> continuation);
}

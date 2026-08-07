package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PiiTokenParams;
import com.stripe.android.model.Token;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf30/h0;", "Lcom/stripe/android/model/d;", "bankAccountTokenParams", "", "idempotencyKey", "stripeAccountId", "Lcom/stripe/android/model/p1;", "a", "(Lf30/h0;Lcom/stripe/android/model/d;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "personalId", DateTokenConverter.CONVERTER_KEY, "(Lf30/h0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/k;", "cardParams", "b", "(Lf30/h0;Lcom/stripe/android/model/k;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k0 {
    public static final Object a(h0 h0Var, BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation<? super Token> continuation) {
        return h0Var.j(bankAccountTokenParams, str2, str, continuation);
    }

    public static final Object b(h0 h0Var, CardParams cardParams, String str, String str2, Continuation<? super Token> continuation) {
        return h0Var.j(cardParams, str2, str, continuation);
    }

    public static /* synthetic */ Object c(h0 h0Var, CardParams cardParams, String str, String str2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = h0Var.getStripeAccountId();
        }
        return b(h0Var, cardParams, str, str2, continuation);
    }

    public static final Object d(h0 h0Var, String str, String str2, String str3, Continuation<? super Token> continuation) {
        return h0Var.j(new PiiTokenParams(str), str3, str2, continuation);
    }
}

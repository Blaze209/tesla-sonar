package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import m50.GetFinancialConnectionsAcccountsParams;
import m50.MixedOAuthParams;
import m50.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0011\u0010\u000eJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lt50/r;", "", "Lm50/a;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/p;", DateTokenConverter.CONVERTER_KEY, "(Lm50/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminalError", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "Lm50/b;", "a", "paymentDetailsId", "consumerSessionClientSecret", "Lm50/d;", "e", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {
    Object a(String str, String str2, Continuation<? super MixedOAuthParams> continuation);

    Object b(String str, Continuation<? super FinancialConnectionsSession> continuation);

    Object c(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation);

    Object d(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation);

    Object e(String str, String str2, Continuation<? super PaymentMethod> continuation);
}

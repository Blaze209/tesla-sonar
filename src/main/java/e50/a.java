package e50;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Le50/a;", "", "Le50/h;", "state", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "a", "(Le50/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", AnalyticsAttribute.Error, "Ljn0/h0;", "b", "(Ljava/lang/Throwable;)V", "c", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    Object a(NetworkingLinkSignupState networkingLinkSignupState, Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation);

    void b(Throwable error);

    void c();
}

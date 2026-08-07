package e50;

import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/a0;", "Le50/h$a;", "b", "(Lcom/stripe/android/financialconnections/model/a0;)Le50/h$a;", "Lcom/stripe/android/financialconnections/model/v;", "a", "(Lcom/stripe/android/financialconnections/model/v;)Le50/h$a;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    public static final NetworkingLinkSignupState.Content a(LinkLoginPane linkLoginPane) {
        s.k(linkLoginPane, "<this>");
        return new NetworkingLinkSignupState.Content(linkLoginPane.getTitle(), linkLoginPane.getBody(), v.m(), linkLoginPane.getAboveCta(), linkLoginPane.getCta(), null, null);
    }

    public static final NetworkingLinkSignupState.Content b(NetworkingLinkSignupPane networkingLinkSignupPane) {
        s.k(networkingLinkSignupPane, "<this>");
        return new NetworkingLinkSignupState.Content(networkingLinkSignupPane.getTitle(), null, networkingLinkSignupPane.getBody().b(), networkingLinkSignupPane.getAboveCta(), networkingLinkSignupPane.getCta(), networkingLinkSignupPane.getSkipCta(), networkingLinkSignupPane.getLegalDetailsNotice());
    }
}

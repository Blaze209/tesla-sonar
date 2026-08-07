package defpackage;

import com.stripe.android.model.ConsumerSession;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/model/t;", "", "a", "(Lcom/stripe/android/model/t;)Ljava/lang/String;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final String a(ConsumerSession consumerSession) {
        s.k(consumerSession, "<this>");
        return t.V(consumerSession.getRedactedFormattedPhoneNumber(), Marker.ANY_MARKER, "•", false, 4, null);
    }
}

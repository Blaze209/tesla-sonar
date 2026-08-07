package g60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSession;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lg60/b;", "", "Lcom/stripe/android/model/t;", "consumerSession", "<init>", "(Lcom/stripe/android/model/t;)V", "", "a", "(Lcom/stripe/android/model/t;)Z", "b", "f", "Lcom/stripe/android/model/t;", "", "Ljava/lang/String;", "getRedactedPhoneNumber", "()Ljava/lang/String;", "redactedPhoneNumber", "c", DateTokenConverter.CONVERTER_KEY, "clientSecret", "e", Scopes.EMAIL, "Z", "isVerified", "()Z", "Lg60/a;", "Lg60/a;", "()Lg60/a;", "accountStatus", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConsumerSession consumerSession;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String redactedPhoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVerified;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a accountStatus;

    public b(ConsumerSession consumerSession) {
        s.k(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.redactedPhoneNumber = consumerSession.getRedactedPhoneNumber();
        this.clientSecret = consumerSession.getClientSecret();
        this.email = consumerSession.getEmailAddress();
        boolean z11 = b(consumerSession) || f(consumerSession);
        this.isVerified = z11;
        this.accountStatus = z11 ? a.Verified : a(consumerSession) ? a.VerificationStarted : a.NeedsVerification;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN] */
    private final boolean a(ConsumerSession consumerSession) {
        for (Object obj : consumerSession.e()) {
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.e.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.EnumC0911d.Started) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN] */
    private final boolean b(ConsumerSession consumerSession) {
        for (Object obj : consumerSession.e()) {
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.e.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.EnumC0911d.Verified) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN] */
    private final boolean f(ConsumerSession consumerSession) {
        for (Object obj : consumerSession.e()) {
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.e.SignUp && verificationSession.getState() == ConsumerSession.VerificationSession.EnumC0911d.Started) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getAccountStatus() {
        return this.accountStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEmail() {
        return this.email;
    }
}

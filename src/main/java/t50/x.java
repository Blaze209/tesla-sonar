package t50;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConsumerSession;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt50/x;", "Lt50/g;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Lcom/stripe/android/model/t;", "", "publishableKey", "Lt50/e;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/t;Ljava/lang/String;)Lt50/e;", "a", "()Lt50/e;", "consumerSession", "Ljn0/h0;", "b", "(Lcom/stripe/android/model/t;Ljava/lang/String;)V", "c", "(Lcom/stripe/android/model/t;)V", "Landroidx/lifecycle/s0;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    public x(s0 savedStateHandle) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    private final CachedConsumerSession d(ConsumerSession consumerSession, String str) {
        String emailAddress = consumerSession.getEmailAddress();
        String strA = defpackage.c.a(consumerSession);
        String clientSecret = consumerSession.getClientSecret();
        List<ConsumerSession.VerificationSession> listE = consumerSession.e();
        boolean z11 = false;
        if (!(listE instanceof Collection) || !listE.isEmpty()) {
            for (ConsumerSession.VerificationSession verificationSession : listE) {
                if (verificationSession.getState() == ConsumerSession.VerificationSession.EnumC0911d.Verified || verificationSession.getType() == ConsumerSession.VerificationSession.e.SignUp) {
                    z11 = true;
                    break;
                }
            }
        }
        return new CachedConsumerSession(emailAddress, strA, clientSecret, str, z11);
    }

    @Override // t50.f
    public CachedConsumerSession a() {
        return (CachedConsumerSession) this.savedStateHandle.f("ConsumerSession");
    }

    @Override // t50.g
    public void b(ConsumerSession consumerSession, String publishableKey) {
        this.savedStateHandle.n("ConsumerSession", consumerSession != null ? d(consumerSession, publishableKey) : null);
    }

    @Override // t50.g
    public void c(ConsumerSession consumerSession) {
        p013kotlin.jvm.internal.s.k(consumerSession, "consumerSession");
        CachedConsumerSession cachedConsumerSessionA = a();
        this.savedStateHandle.n("ConsumerSession", d(consumerSession, cachedConsumerSessionA != null ? cachedConsumerSessionA.getPublishableKey() : null));
    }
}

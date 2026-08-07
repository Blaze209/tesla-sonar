package l70;

import l50.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll70/b;", "Ll50/d;", "T", "Ll70/c;", "launcher", "<init>", "(Ll50/d;)V", "", "financialConnectionsSessionClientSecret", "publishableKey", "stripeAccountId", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/a$c;)V", "b", "Ll50/d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b<T extends l50.d> implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T launcher;

    public b(T launcher) {
        s.k(launcher, "launcher");
        this.launcher = launcher;
    }

    @Override // l70.c
    public void a(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        s.k(publishableKey, "publishableKey");
        this.launcher.a(new com.stripe.android.financialconnections.a.Configuration(financialConnectionsSessionClientSecret, publishableKey, stripeAccountId), elementsSessionContext);
    }
}

package z40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: renamed from: z40.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lz40/i;", "", "Lcom/stripe/android/financialconnections/model/c0;", "account", "Lcom/stripe/android/financialconnections/model/x;", "display", "<init>", "(Lcom/stripe/android/financialconnections/model/c0;Lcom/stripe/android/financialconnections/model/x;)V", "a", "()Lcom/stripe/android/financialconnections/model/c0;", "b", "()Lcom/stripe/android/financialconnections/model/x;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/c0;", "c", "Lcom/stripe/android/financialconnections/model/x;", DateTokenConverter.CONVERTER_KEY, "e", "type", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkedAccount {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PartnerAccount account;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkedAccount display;

    public LinkedAccount(PartnerAccount account, NetworkedAccount display) {
        s.k(account, "account");
        s.k(display, "display");
        this.account = account;
        this.display = display;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PartnerAccount getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final NetworkedAccount getDisplay() {
        return this.display;
    }

    public final PartnerAccount c() {
        return this.account;
    }

    public final NetworkedAccount d() {
        return this.display;
    }

    public final String e() {
        return (String) v.q0(t.f1(this.account.getId(), new String[]{"_"}, false, 0, 6, null));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkedAccount)) {
            return false;
        }
        LinkedAccount linkedAccount = (LinkedAccount) other;
        return s.f(this.account, linkedAccount.account) && s.f(this.display, linkedAccount.display);
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + this.display.hashCode();
    }

    public String toString() {
        return "LinkedAccount(account=" + this.account + ", display=" + this.display + ")";
    }
}

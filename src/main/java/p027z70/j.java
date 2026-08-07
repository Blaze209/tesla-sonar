package p027z70;

import java.util.List;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import x30.c;
import x30.d;
import y30.Replace;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz70/j;", "", "<init>", "()V", "", "isInstantDebits", "", "c", "(Z)Ljava/lang/String;", "merchantName", "isVerifyingMicrodeposits", "isSaveForFutureUseSelected", "isSetupFlow", "Lx30/c;", "a", "(Ljava/lang/String;ZZZZ)Lx30/c;", "b", "(Ljava/lang/String;ZZZ)Lx30/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f127317a = new j();

    private j() {
    }

    private final String c(boolean isInstantDebits) {
        if (isInstantDebits) {
            return "https://link.com/terms/ach-authorization";
        }
        if (isInstantDebits) {
            throw new NoWhenBranchMatchedException();
        }
        return "https://stripe.com/ach-payments/authorization";
    }

    public final c a(String merchantName, boolean isVerifyingMicrodeposits, boolean isSaveForFutureUseSelected, boolean isInstantDebits, boolean isSetupFlow) {
        s.k(merchantName, "merchantName");
        c cVarB = b(merchantName, isSaveForFutureUseSelected, isInstantDebits, isSetupFlow);
        c cVarG = isVerifyingMicrodeposits ? d.g(x.M, new Object[]{merchantName}, null, 4, null) : null;
        return cVarG != null ? d.d(d.d(cVarG, d.b(" ")), cVarB) : cVarB;
    }

    public final c b(String merchantName, boolean isSaveForFutureUseSelected, boolean isInstantDebits, boolean isSetupFlow) {
        s.k(merchantName, "merchantName");
        List listP = v.p(new Replace("<terms>", "<a href=\"" + c(isInstantDebits) + "\">"), new Replace("</terms>", "</a>"));
        return (isSaveForFutureUseSelected || isSetupFlow) ? d.e(x.f93522k, new Object[]{merchantName}, listP) : d.e(x.f93520j, new Object[0], listP);
    }
}

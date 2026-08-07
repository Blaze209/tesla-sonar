package h30;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lh30/g;", "", "<init>", "()V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "a", "(Lh30/f$b;)Ljava/util/List;", "", "", "b", "Ljava/util/Map;", "testAccountRanges", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f70602a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, List<AccountRange>> testAccountRanges;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70604c;

    static {
        BinRange binRange = new BinRange("4000000000000000", "4999999999999999");
        AccountRange.EnumC0883a enumC0883a = AccountRange.EnumC0883a.CartesBancaires;
        testAccountRanges = v0.m(x.a("4000002500001001", v.p(new AccountRange(binRange, 16, enumC0883a, null, 8, null), new AccountRange(new BinRange("4000000000000000", "4999999999999999"), 16, AccountRange.EnumC0883a.Visa, null, 8, null))), x.a("5555552500001001", v.p(new AccountRange(new BinRange("5100000000000000", "5599999999999999"), 16, enumC0883a, null, 8, null), new AccountRange(new BinRange("5100000000000000", "5599999999999999"), 16, AccountRange.EnumC0883a.Mastercard, null, 8, null))));
        f70604c = 8;
    }

    private g() {
    }

    public final List<AccountRange> a(f.Unvalidated cardNumber) {
        s.k(cardNumber, "cardNumber");
        Map<String, List<AccountRange>> map = testAccountRanges;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, List<AccountRange>>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<AccountRange>> next = it.next();
            if (t.b0(cardNumber.getNormalized(), next.getKey(), false, 2, null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Map.Entry entry = (Map.Entry) v.V0(linkedHashMap.entrySet());
        List<AccountRange> list = entry != null ? (List) entry.getValue() : null;
        return list == null ? v.m() : list;
    }
}

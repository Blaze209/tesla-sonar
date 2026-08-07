package p027z70;

import f30.y;
import ho0.l;
import i40.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.text.q;
import p013kotlin.text.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lz70/b;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f127124a;

    /* JADX INFO: renamed from: z70.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz70/b$a;", "", "<init>", "()V", "", "bankName", "", "a", "(Ljava/lang/String;)I", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f127124a = new Companion();

        private Companion() {
        }

        public final int a(String bankName) {
            Integer num;
            if (bankName == null) {
                return i.f75836b;
            }
            s sVar = s.IGNORE_CASE;
            Map mapM = v0.m(x.a(new q("Bank of America", sVar), Integer.valueOf(y.f64227i)), x.a(new q("Capital One", sVar), Integer.valueOf(y.f64229k)), x.a(new q("Citibank", sVar), Integer.valueOf(y.f64231m)), x.a(new q("BBVA|COMPASS", sVar), Integer.valueOf(y.f64232n)), x.a(new q("MORGAN CHASE|JP MORGAN|Chase", sVar), Integer.valueOf(y.f64240v)), x.a(new q("NAVY FEDERAL CREDIT UNION", sVar), Integer.valueOf(y.f64242x)), x.a(new q("PNC\\s?BANK|PNC Bank", sVar), Integer.valueOf(y.f64244z)), x.a(new q("SUNTRUST|SunTrust Bank", sVar), Integer.valueOf(y.F)), x.a(new q("Silicon Valley Bank", sVar), Integer.valueOf(y.G)), x.a(new q("Stripe|TestInstitution", sVar), Integer.valueOf(y.E)), x.a(new q("TD Bank", sVar), Integer.valueOf(y.H)), x.a(new q("USAA FEDERAL SAVINGS BANK|USAA Bank", sVar), Integer.valueOf(y.J)), x.a(new q("U\\.?S\\. BANK|US Bank", sVar), Integer.valueOf(y.K)), x.a(new q("Wells Fargo", sVar), Integer.valueOf(y.L)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = mapM.entrySet().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (l.y(q.f((q) entry.getKey(), bankName, 0, 2, null))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) ((Map.Entry) it2.next()).getValue();
                if (num2 != null) {
                    num = num2;
                    break;
                }
            }
            return num != null ? num.intValue() : i.f75836b;
        }
    }
}

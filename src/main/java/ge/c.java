package ge;

import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackInfo;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackLog;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lge/c;", "", "<init>", "()V", "Lde/a$a;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "b", "(Lde/a$a;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "Lde/a$b;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "c", "(Lde/a$b;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "", "infoList", "logList", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {
    private final AnalyticsTrackInfo b(de.a.Info info) {
        String id2 = info.getId();
        Long lValueOf = Long.valueOf(info.getTimestamp());
        String component = info.getComponent();
        de.a.Info.EnumC1233a type = info.getType();
        return new AnalyticsTrackInfo(id2, lValueOf, component, type != null ? type.getValue() : null, info.getTarget(), info.getIsStoredPaymentMethod(), info.getBrand(), info.getIssuer(), info.getValidationErrorCode(), info.getValidationErrorMessage(), info.d());
    }

    private final AnalyticsTrackLog c(de.a.Log log) {
        String id2 = log.getId();
        long timestamp = log.getTimestamp();
        String component = log.getComponent();
        de.a.Log.EnumC1234a type = log.getType();
        String value = type != null ? type.getValue() : null;
        String subType = log.getSubType();
        String target = log.getTarget();
        String message = log.getMessage();
        return new AnalyticsTrackLog(id2, Long.valueOf(timestamp), component, value, subType, log.getResult(), target, message);
    }

    public final AnalyticsTrackRequest a(List<de.a.Info> infoList, List<de.a.Log> logList) {
        s.k(infoList, "infoList");
        s.k(logList, "logList");
        String strA = de.d.f60485a.a();
        List<de.a.Info> list = infoList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((de.a.Info) it.next()));
        }
        List<de.a.Log> list2 = logList;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((de.a.Log) it2.next()));
        }
        return new AnalyticsTrackRequest("android", strA, arrayList, arrayList2);
    }
}

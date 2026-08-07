package qg0;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "", "countryCode", "idClass", "page", "b", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj;
            if (p013kotlin.text.t.M(localizationOverride.getCountryCode(), str, true) && p013kotlin.jvm.internal.s.f(localizationOverride.getPage(), str3) && (p013kotlin.jvm.internal.s.f(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                if (p013kotlin.jvm.internal.s.f(localizationOverride.getKey(), str2)) {
                    arrayList.add(obj);
                }
            }
        }
        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) p013kotlin.collections.v.q0(arrayList);
        if (localizationOverride2 != null) {
            return localizationOverride2.getText();
        }
        return null;
    }
}

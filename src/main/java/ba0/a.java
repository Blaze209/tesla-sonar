package ba0;

import java.util.HashMap;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u0003\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0004j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/gamma/common/c;", "event", "Lkotlin/Pair;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "makeEventRegistrationInfo", "(Lcom/swmansion/rnscreens/gamma/common/c;)Lkotlin/Pair;", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final Pair<String, HashMap<String, String>> makeEventRegistrationInfo(com.swmansion.rnscreens.gamma.common.c event) {
        s.k(event, "event");
        return x.a(event.getEventName(), v0.k(x.a("registrationName", event.getEventRegistrationName())));
    }
}

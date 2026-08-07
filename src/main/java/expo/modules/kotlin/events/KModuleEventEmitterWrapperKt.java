package expo.modules.kotlin.events;

import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"normalizeEventName", "", "eventName", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KModuleEventEmitterWrapperKt {
    public static final String normalizeEventName(String eventName) {
        s.k(eventName, "eventName");
        if (!t.b0(eventName, DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 2, null)) {
            return eventName;
        }
        String strSubstring = eventName.substring(2);
        s.j(strSubstring, "substring(...)");
        return "top" + strSubstring;
    }
}

package expo.modules.adapters.react.views;

import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes8.dex */
public class ViewManagerAdapterUtils {
    public static String normalizeEventName(String str) {
        if (!str.startsWith(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            return str;
        }
        return "top" + str.substring(2);
    }
}

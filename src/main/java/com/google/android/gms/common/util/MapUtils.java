package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb2, @NonNull HashMap<String, String> map) {
        sb2.append("{");
        boolean z11 = true;
        for (String str : map.keySet()) {
            if (!z11) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z11 = false;
        }
        sb2.append("}");
    }
}

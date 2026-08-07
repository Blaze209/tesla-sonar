package com.wix.reactnativenotifications;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a {
    @NonNull
    public static Bundle a(@NonNull Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !obj.getClass().isArray() && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Bundle) && !(obj instanceof List)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}

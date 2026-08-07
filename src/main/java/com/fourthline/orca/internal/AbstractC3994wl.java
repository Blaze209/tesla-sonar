package com.fourthline.orca.internal;

import com.fourthline.adapters.serialization.OrcaKeys;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3994wl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(C3449jz c3449jz) {
        return new JSONObject().put("deviceMetaData", a(c3449jz.a()));
    }

    private static final JSONObject a(C3406iz c3406iz) {
        return new JSONObject().put("language", c3406iz.a()).put("region", c3406iz.d()).put("model", c3406iz.c()).put(OrcaKeys.LATITUDE, c3406iz.b().getLatitude()).put(OrcaKeys.LONGITUDE, c3406iz.b().getLongitude());
    }
}

package com.facebook.react.modules.network;

import java.util.Collections;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    public static a a(OkHttpClient okHttpClient) {
        return (a) okHttpClient.cookieJar();
    }

    public static Headers b(Map<String, String> map) {
        return map == null ? Headers.of((Map<String, String>) Collections.EMPTY_MAP) : Headers.of(map);
    }
}

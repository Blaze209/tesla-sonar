package com.fourthline.orca.internal;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3345hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f32292a = p013kotlin.collections.d1.i("application/pdf", ClipboardModule.MIMETYPE_JPEG, "video/mp4");

    public static final Map a() {
        return a("application/json");
    }

    public static final Map b() {
        return a("application/pdf");
    }

    public static final Map c(Map map, String hash) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        p013kotlin.jvm.internal.s.k(hash, "hash");
        map.put("If-None-Match", hash);
        return map;
    }

    public static final Map d() {
        return p013kotlin.collections.v0.o(jn0.x.a("content-type", "application/json"));
    }

    public static final Map e() {
        return p013kotlin.collections.v0.o(jn0.x.a("content-type", "video/mp4"));
    }

    public static final Map f() {
        return p013kotlin.collections.v0.o(jn0.x.a("content-type", "multipart/form-data"));
    }

    public static final Map g() {
        return p013kotlin.collections.v0.o(jn0.x.a("x-fl", "cdn"));
    }

    public static final Map a(String type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return p013kotlin.collections.v0.o(jn0.x.a("accept", type));
    }

    public static final Map b(Map map, String type) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        map.put("X-DeviceDataType", type);
        return map;
    }

    public static final Map c() {
        return p013kotlin.collections.v0.o(jn0.x.a("content-type", ClipboardModule.MIMETYPE_JPEG));
    }

    public static final Map a(Map map, String fileName) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        map.put("content-disposition", "filename=" + fileName);
        return map;
    }

    public static final boolean b(String str) {
        return p013kotlin.collections.v.g0(f32292a, str);
    }

    public static final boolean c(String str) {
        if (str != null) {
            return p013kotlin.text.t.f0(str, "application/json", true);
        }
        return false;
    }

    public static final String a(Map map) {
        p013kotlin.jvm.internal.s.k(map, "<this>");
        return (String) map.get("content-type");
    }
}

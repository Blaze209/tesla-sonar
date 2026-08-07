package com.ReactNativeBlobUtil;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Locale;
import kotlinx.coroutines.DebugKt;
import org.spongycastle.cms.CMSAttributeTableGenerator;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f19623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f19624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ReadableMap f19627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f19628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f19629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f19630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f19631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f19632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f19633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f19634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f19635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f19636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f19637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ReadableArray f19638p;

    b(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.f19629g = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f19634l = bool2;
        this.f19635m = 60000L;
        this.f19636n = bool;
        this.f19637o = bool2;
        this.f19638p = null;
        if (readableMap == null) {
            return;
        }
        this.f19623a = Boolean.valueOf(readableMap.hasKey("fileCache") && readableMap.getBoolean("fileCache"));
        this.f19624b = Boolean.valueOf(readableMap.hasKey("transformFile") ? readableMap.getBoolean("transformFile") : false);
        this.f19625c = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        this.f19626d = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
        this.f19628f = Boolean.valueOf(readableMap.hasKey("trusty") && readableMap.getBoolean("trusty"));
        this.f19629g = Boolean.valueOf(readableMap.hasKey("wifiOnly") && readableMap.getBoolean("wifiOnly"));
        this.f19630h = readableMap.hasKey("targetHostIp") ? readableMap.getString("targetHostIp") : "";
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.f19627e = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.f19638p = readableMap.getArray("binaryContentTypes");
        }
        String str = this.f19625c;
        if (str != null && str.toLowerCase(Locale.ROOT).contains("?append=true")) {
            this.f19634l = bool;
        }
        if (readableMap.hasKey("overwrite")) {
            this.f19634l = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.f19637o = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.f19631i = readableMap.hasKey(Action.KEY_ATTRIBUTE) ? readableMap.getString(Action.KEY_ATTRIBUTE) : null;
        this.f19632j = readableMap.hasKey(CMSAttributeTableGenerator.CONTENT_TYPE) ? readableMap.getString(CMSAttributeTableGenerator.CONTENT_TYPE) : null;
        this.f19636n = Boolean.valueOf(readableMap.hasKey("increment") && readableMap.getBoolean("increment"));
        this.f19633k = Boolean.valueOf(readableMap.hasKey(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) && readableMap.getBoolean(DebugKt.DEBUG_PROPERTY_VALUE_AUTO));
        if (readableMap.hasKey("timeout")) {
            this.f19635m = readableMap.getInt("timeout");
        }
    }
}

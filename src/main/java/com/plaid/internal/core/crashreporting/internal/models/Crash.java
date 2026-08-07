package com.plaid.internal.core.crashreporting.internal.models;

import ax.c;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00188\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\t\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"¨\u00068"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Crash;", "", "id", "", "message", "timestamp", "level", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "logger", "platform", "culprit", "method", "tags", "", "breadcrumbs", "", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "contexts", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "release", "dist", AnalyticsAttribute.Environment, "serverName", "fingerprint", "", "checksum", "exceptionInterface", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "debugMetaInterface", "Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;)V", "getBreadcrumbs$crash_reporting_release", "()Ljava/util/List;", "getChecksum$crash_reporting_release", "()Ljava/lang/String;", "getContexts$crash_reporting_release", "()Ljava/util/Map;", "getCulprit$crash_reporting_release", "getDebugMetaInterface$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "getDist$crash_reporting_release", "getEnvironment$crash_reporting_release", "getExceptionInterface$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "getFingerprint$crash_reporting_release", "getId", "getLevel$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "getLogger$crash_reporting_release", "getMessage$crash_reporting_release", "getMethod$crash_reporting_release", "getPlatform$crash_reporting_release", "getRelease$crash_reporting_release", "getServerName$crash_reporting_release", "getTags$crash_reporting_release", "getTimestamp$crash_reporting_release", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Crash {

    @c("breadcrumbs")
    private final List<Breadcrumb> breadcrumbs;

    @c("checksum")
    private final String checksum;

    @c("contexts")
    private final Map<String, CrashContext> contexts;

    @c("culprit")
    private final String culprit;

    @c("debug_meta")
    private final DebugMetaInterface debugMetaInterface;

    @c("dist")
    private final String dist;

    @c(AnalyticsAttribute.Environment)
    private final String environment;

    @c(ExceptionInterface.EXCEPTION_INTERFACE)
    private final ExceptionInterface exceptionInterface;

    @c("fingerprint")
    private final List<String> fingerprint;

    @c("event_id")
    private final String id;

    @c("level")
    private final CrashLogLevel level;

    @c("logger")
    private final String logger;

    @c("message")
    private final String message;

    @c("method")
    private final String method;

    @c("platform")
    private final String platform;

    @c("release")
    private final String release;

    @c("serverName")
    private final String serverName;

    @c("tags")
    private final Map<String, String> tags;

    @c("timestamp")
    private final String timestamp;

    public Crash(String id2, String str, String str2, CrashLogLevel crashLogLevel, String str3, String platform, String str4, String str5, Map<String, String> tags, List<Breadcrumb> breadcrumbs, Map<String, CrashContext> contexts, String str6, String str7, String str8, String str9, List<String> list, String str10, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface) {
        s.k(id2, "id");
        s.k(platform, "platform");
        s.k(tags, "tags");
        s.k(breadcrumbs, "breadcrumbs");
        s.k(contexts, "contexts");
        this.id = id2;
        this.message = str;
        this.timestamp = str2;
        this.level = crashLogLevel;
        this.logger = str3;
        this.platform = platform;
        this.culprit = str4;
        this.method = str5;
        this.tags = tags;
        this.breadcrumbs = breadcrumbs;
        this.contexts = contexts;
        this.release = str6;
        this.dist = str7;
        this.environment = str8;
        this.serverName = str9;
        this.fingerprint = list;
        this.checksum = str10;
        this.exceptionInterface = exceptionInterface;
        this.debugMetaInterface = debugMetaInterface;
    }

    public final List<Breadcrumb> getBreadcrumbs$crash_reporting_release() {
        return this.breadcrumbs;
    }

    /* JADX INFO: renamed from: getChecksum$crash_reporting_release, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final Map<String, CrashContext> getContexts$crash_reporting_release() {
        return this.contexts;
    }

    /* JADX INFO: renamed from: getCulprit$crash_reporting_release, reason: from getter */
    public final String getCulprit() {
        return this.culprit;
    }

    /* JADX INFO: renamed from: getDebugMetaInterface$crash_reporting_release, reason: from getter */
    public final DebugMetaInterface getDebugMetaInterface() {
        return this.debugMetaInterface;
    }

    /* JADX INFO: renamed from: getDist$crash_reporting_release, reason: from getter */
    public final String getDist() {
        return this.dist;
    }

    /* JADX INFO: renamed from: getEnvironment$crash_reporting_release, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: getExceptionInterface$crash_reporting_release, reason: from getter */
    public final ExceptionInterface getExceptionInterface() {
        return this.exceptionInterface;
    }

    public final List<String> getFingerprint$crash_reporting_release() {
        return this.fingerprint;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getLevel$crash_reporting_release, reason: from getter */
    public final CrashLogLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: getLogger$crash_reporting_release, reason: from getter */
    public final String getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: getMessage$crash_reporting_release, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: getMethod$crash_reporting_release, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: getPlatform$crash_reporting_release, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: getRelease$crash_reporting_release, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    /* JADX INFO: renamed from: getServerName$crash_reporting_release, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    /* JADX INFO: renamed from: getTimestamp$crash_reporting_release, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ Crash(String str, String str2, String str3, CrashLogLevel crashLogLevel, String str4, String str5, String str6, String str7, Map map, List list, Map map2, String str8, String str9, String str10, String str11, List list2, String str12, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : crashLogLevel, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? "java" : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? new HashMap() : map, (i11 & 512) != 0 ? new ArrayList() : list, (i11 & 1024) != 0 ? new HashMap() : map2, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : str11, (i11 & 32768) != 0 ? null : list2, (i11 & 65536) != 0 ? null : str12, (i11 & 131072) != 0 ? null : exceptionInterface, (i11 & 262144) != 0 ? null : debugMetaInterface);
    }
}

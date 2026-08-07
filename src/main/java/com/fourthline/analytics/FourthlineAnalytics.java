package com.fourthline.analytics;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsFactory;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.analytics.internal.LogLevel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ;\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010$\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010%R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00040;j\b\u0012\u0004\u0012\u00020\u0004`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010=R8\u0010D\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100@j\u0002`A0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/fourthline/analytics/FourthlineAnalytics;", "", "<init>", "()V", "", "tenantId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "initialize", "(Ljava/lang/String;Landroid/content/Context;)V", "Lcom/fourthline/analytics/TrackingConsent;", "consent", "setTrackingConsent", "(Lcom/fourthline/analytics/TrackingConsent;)V", "message", "", "attributes", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/fourthline/analytics/internal/LogLevel;", "level", "", AnalyticsAttribute.Error, "log", "(Lcom/fourthline/analytics/internal/LogLevel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "e", "singleI", "Lcom/fourthline/analytics/AnalyticsObserver;", "analyticsObserver", "setObserver", "(Lcom/fourthline/analytics/AnalyticsObserver;)V", "removeObserver", "release", "TAG", "Ljava/lang/String;", "Lcom/fourthline/analytics/TrackingConsent;", "trackingConsentStatus", "b", "Lcom/fourthline/analytics/AnalyticsObserver;", "observer", "FOURTHLINE_TENANT_ID", "Lcom/fourthline/analytics/internal/AnalyticsInterface;", "c", "Lcom/fourthline/analytics/internal/AnalyticsInterface;", "getAnalytics", "()Lcom/fourthline/analytics/internal/AnalyticsInterface;", "setAnalytics", "(Lcom/fourthline/analytics/internal/AnalyticsInterface;)V", "analytics", "", DateTokenConverter.CONVERTER_KEY, "Z", "isInitialized", "()Z", "setInitialized", "(Z)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "singleEvents", "", "Lkotlin/Pair;", "Lcom/fourthline/analytics/ObserverEvent;", "f", "Ljava/util/List;", "observerQueue", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineAnalytics {
    public static final String FOURTHLINE_TENANT_ID = "Ten-fourthlineFL";
    public static final String TAG = "FourthlineAnalytics";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static TrackingConsent trackingConsentStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static AnalyticsObserver observer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static AnalyticsInterface analytics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean isInitialized;
    public static final FourthlineAnalytics INSTANCE = new FourthlineAnalytics();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final HashSet singleEvents = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List observerQueue = new ArrayList();

    private FourthlineAnalytics() {
    }

    private final void a(String message, Map attributes) {
        AnalyticsObserver analyticsObserver = observer;
        if (analyticsObserver != null) {
            String str = "fl_" + message;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : attributes.entrySet()) {
                if (!s.f(entry.getKey(), "isPublic")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            analyticsObserver.log(str, linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e$default(FourthlineAnalytics fourthlineAnalytics, String str, Throwable th2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            map = v0.i();
        }
        fourthlineAnalytics.e(str, th2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i$default(FourthlineAnalytics fourthlineAnalytics, String str, Throwable th2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            map = v0.i();
        }
        fourthlineAnalytics.i(str, th2, map);
    }

    public static final void initialize(String tenantId, Context context) throws Throwable {
        AnalyticsInterface analyticsInterfaceCreateAnalyticsInterface$fourthline_core_release;
        s.k(tenantId, "tenantId");
        s.k(context, "context");
        if (isInitialized) {
            return;
        }
        try {
            analyticsInterfaceCreateAnalyticsInterface$fourthline_core_release = new AnalyticsFactory().createAnalyticsInterface$fourthline_core_release(context);
        } catch (Throwable th2) {
            if (th2 instanceof AnalyticsError) {
                throw th2;
            }
            if (th2 instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = th2;
                if (invocationTargetException.getTargetException() instanceof AnalyticsError) {
                    throw invocationTargetException.getTargetException();
                }
            }
            analyticsInterfaceCreateAnalyticsInterface$fourthline_core_release = null;
        }
        analytics = analyticsInterfaceCreateAnalyticsInterface$fourthline_core_release;
        isInitialized = analyticsInterfaceCreateAnalyticsInterface$fourthline_core_release != null;
    }

    public static final void setTrackingConsent(TrackingConsent consent) {
        s.k(consent, "consent");
        Objects.toString(consent);
        AnalyticsInterface analyticsInterface = analytics;
        if (analyticsInterface != null) {
            analyticsInterface.setTrackingConsent(consent);
        }
        trackingConsentStatus = consent;
        if (isInitialized && consent == TrackingConsent.GRANTED) {
            for (Pair pair : observerQueue) {
                INSTANCE.a((String) pair.e(), (Map) pair.f());
            }
            observerQueue.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void singleI$default(FourthlineAnalytics fourthlineAnalytics, String str, Throwable th2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            map = v0.i();
        }
        fourthlineAnalytics.singleI(str, th2, map);
    }

    public final void e(String message, Throwable error, Map<String, ? extends Object> attributes) {
        s.k(message, "message");
        s.k(attributes, "attributes");
        log(LogLevel.ERROR, message, attributes, error);
    }

    public final AnalyticsInterface getAnalytics() {
        return analytics;
    }

    public final void i(String message, Throwable error, Map<String, ? extends Object> attributes) {
        s.k(message, "message");
        s.k(attributes, "attributes");
        log(LogLevel.INFO, message, attributes, error);
    }

    public final boolean isInitialized() {
        return isInitialized;
    }

    public final void log(LogLevel level, String message, Map<String, ? extends Object> attributes, Throwable error) {
        s.k(level, "level");
        s.k(message, "message");
        s.k(attributes, "attributes");
        AnalyticsInterface analyticsInterface = analytics;
        if (analyticsInterface != null) {
            analyticsInterface.log(level, message, attributes, error);
        }
        Objects.toString(level);
        Objects.toString(attributes);
        Objects.toString(error);
        boolean z11 = trackingConsentStatus == TrackingConsent.GRANTED;
        if (observer != null && isInitialized && s.f(attributes.get("isPublic"), Boolean.TRUE)) {
            if (z11) {
                a(message, attributes);
            } else {
                observerQueue.add(x.a(message, attributes));
            }
        }
    }

    public final void release() {
        analytics = null;
        observer = null;
        trackingConsentStatus = null;
        isInitialized = false;
    }

    public final void removeObserver() {
        observer = null;
    }

    public final void setAnalytics(AnalyticsInterface analyticsInterface) {
        analytics = analyticsInterface;
    }

    public final void setInitialized(boolean z11) {
        isInitialized = z11;
    }

    public final void setObserver(AnalyticsObserver analyticsObserver) {
        s.k(analyticsObserver, "analyticsObserver");
        observer = analyticsObserver;
    }

    public final void singleI(String message, Throwable error, Map<String, ? extends Object> attributes) {
        s.k(message, "message");
        s.k(attributes, "attributes");
        HashSet hashSet = singleEvents;
        if (hashSet.contains(message)) {
            return;
        }
        hashSet.add(message);
        i(message, error, attributes);
    }
}

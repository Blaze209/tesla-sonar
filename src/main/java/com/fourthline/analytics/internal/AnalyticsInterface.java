package com.fourthline.analytics.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.fourthline.analytics.TrackingConsent;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\u0017J\u0019\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/fourthline/analytics/internal/AnalyticsInterface;", "", "Lcom/fourthline/analytics/internal/LogLevel;", "level", "", "message", "", "attributes", "", AnalyticsAttribute.Error, "Ljn0/h0;", "log", "(Lcom/fourthline/analytics/internal/LogLevel;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", "Lcom/fourthline/analytics/internal/NewAnalyticsEvent;", "event", "trackNew", "(Lcom/fourthline/analytics/internal/NewAnalyticsEvent;)V", "Lcom/fourthline/analytics/TrackingConsent;", "consent", "setTrackingConsent", "(Lcom/fourthline/analytics/TrackingConsent;)V", "newOrigin", "setEventOrigin", "(Ljava/lang/String;)V", Action.KEY_ATTRIBUTE, "value", "setSessionAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "newTenant", "workflowId", "setTenant", "Lcom/fourthline/analytics/internal/AnalyticsContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "registerContext", "(Lcom/fourthline/analytics/internal/AnalyticsContext;)V", "identifier", "clearContext", "getContext", "(Ljava/lang/String;)Lcom/fourthline/analytics/internal/AnalyticsContext;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AnalyticsInterface {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(AnalyticsInterface analyticsInterface, LogLevel logLevel, String str, Map map, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i11 & 8) != 0) {
                th2 = null;
            }
            analyticsInterface.log(logLevel, str, map, th2);
        }
    }

    void clearContext(String identifier);

    AnalyticsContext getContext(String identifier);

    void log(LogLevel level, String message, Map<String, ? extends Object> attributes, Throwable error);

    void registerContext(AnalyticsContext context);

    void setEventOrigin(String newOrigin);

    void setSessionAttribute(String key, String value);

    void setTenant(String newTenant, String workflowId);

    void setTrackingConsent(TrackingConsent consent);

    void trackNew(NewAnalyticsEvent event);
}

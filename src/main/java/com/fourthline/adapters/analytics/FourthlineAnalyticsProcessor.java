package com.fourthline.adapters.analytics;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.fourthline.adapters.common.FourthlineOutputProcessor;
import com.fourthline.adapters.errors.AnalyticsJsonError;
import com.fourthline.analytics.AnalyticsError;
import com.fourthline.analytics.AnalyticsObserver;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.TrackingConsent;
import com.fourthline.analytics.internal.AnalyticsInterface;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import jn0.h0;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/fourthline/adapters/analytics/FourthlineAnalyticsProcessor;", "", "<init>", "()V", "", "Lcom/fourthline/analytics/TrackingConsent;", "toTrackingConsent", "(Ljava/lang/String;)Lcom/fourthline/analytics/TrackingConsent;", "Lcom/fourthline/adapters/errors/AnalyticsJsonError;", "toFailJson", "(Lcom/fourthline/adapters/errors/AnalyticsJsonError;)Ljava/lang/String;", "Lorg/json/JSONObject;", "jsonConfig", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "init", "(Lorg/json/JSONObject;Landroid/content/Context;)V", "setTrackingConsent", "(Lorg/json/JSONObject;)V", "Lkotlin/Function1;", "callback", "setObserver", "(Lwn0/l;)V", "removeObserver", Action.KEY_ATTRIBUTE, "value", "setSessionAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineAnalyticsProcessor {
    public static final FourthlineAnalyticsProcessor INSTANCE = new FourthlineAnalyticsProcessor();

    private FourthlineAnalyticsProcessor() {
    }

    private final String toFailJson(AnalyticsJsonError analyticsJsonError) {
        String string = FourthlineOutputProcessor.INSTANCE.toFailJson(analyticsJsonError.getErrorCode(), analyticsJsonError.getErrorDescription()).toString();
        s.j(string, "toString(...)");
        return string;
    }

    private final TrackingConsent toTrackingConsent(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -953114520) {
            if (iHashCode != -682587753) {
                if (iHashCode == 280295099 && str.equals(PermissionsResponse.GRANTED_KEY)) {
                    return TrackingConsent.GRANTED;
                }
            } else if (str.equals("pending")) {
                return TrackingConsent.PENDING;
            }
        } else if (str.equals("notGranted")) {
            return TrackingConsent.NOT_GRANTED;
        }
        throw new IllegalArgumentException();
    }

    public final void init(JSONObject jsonConfig, Context context) throws Throwable {
        s.k(jsonConfig, "jsonConfig");
        s.k(context, "context");
        try {
            String string = jsonConfig.getString("tenantId");
            s.h(string);
            FourthlineAnalytics.initialize(string, context);
        } catch (AnalyticsError.InvalidTenantId unused) {
            throw new JSONException(toFailJson(AnalyticsJsonError.INVALID_TENANT_ID));
        } catch (JSONException unused2) {
            throw new JSONException(toFailJson(AnalyticsJsonError.INVALID_CONFIGURATION));
        }
    }

    public final void removeObserver() {
        FourthlineAnalytics.INSTANCE.removeObserver();
    }

    public final void setObserver(final l<? super String, h0> callback) {
        s.k(callback, "callback");
        FourthlineAnalytics.INSTANCE.setObserver(new AnalyticsObserver() { // from class: com.fourthline.adapters.analytics.FourthlineAnalyticsProcessor.setObserver.1
            @Override // com.fourthline.analytics.AnalyticsObserver
            public void log(String event, Map<String, ? extends Object> attributes) throws JSONException {
                s.k(event, "event");
                s.k(attributes, "attributes");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", event);
                jSONObject.put("attributes", attributes);
                String string = jSONObject.toString();
                s.j(string, "toString(...)");
                callback.invoke(string);
            }
        });
    }

    public final void setSessionAttribute(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.setSessionAttribute(key, value);
        }
    }

    public final void setTrackingConsent(JSONObject jsonConfig) throws JSONException {
        s.k(jsonConfig, "jsonConfig");
        try {
            String string = jsonConfig.getString("trackingConsent");
            s.h(string);
            FourthlineAnalytics.setTrackingConsent(toTrackingConsent(string));
        } catch (IllegalArgumentException unused) {
            throw new JSONException(toFailJson(AnalyticsJsonError.INVALID_CONFIGURATION));
        } catch (JSONException unused2) {
            throw new JSONException(toFailJson(AnalyticsJsonError.INVALID_CONFIGURATION));
        }
    }
}

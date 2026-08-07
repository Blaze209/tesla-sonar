package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.TeslaV4.BuildConfig;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\fR\u0011\u00104\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010\fR\u0011\u0010<\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010\fR\u0011\u0010>\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u0010\fR\u0013\u0010@\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b?\u0010\fR\u0011\u0010B\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bA\u0010-R\u0011\u0010D\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bC\u0010-R\u0011\u0010F\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bE\u0010-R\u0011\u0010H\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0013\u0010J\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bI\u0010\fR\u0011\u0010L\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bK\u0010-¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/h;", "", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "a", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "", "p", "()Ljava/lang/String;", "requestKey", "u", "templateId", "v", "templateVersion", "l", "inquiryId", "s", "sessionToken", "o", "referenceId", "accountId", "Lbh0/s;", "j", "()Lbh0/s;", "fieldsWrapper", "", "w", "()Ljava/lang/Integer;", "theme", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "t", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lbh0/f;", "f", "()Lbh0/f;", AnalyticsAttribute.Environment, "g", "environmentId", "", "e", "()Z", "enableErrorLogging", "y", "useServerStyles", "m", "locale", "q", "returnCollectedData", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "h", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "r", "serverEndpoint", "z", "webRtcServerEndpoint", IntegerTokenConverter.CONVERTER_KEY, "fallbackModeServerEndpoint", "x", "themeSetId", "b", "consumeExceptions", "A", "isNavBarEnabled", "c", "controlNavigationBar", DateTokenConverter.CONVERTER_KEY, "controlStatusBar", "n", "oneTimeLinkCode", "k", "handleBackPress", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle bundle;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/h$a;", "", "<init>", "()V", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "DEFAULT_SERVER_ENDPOINT", "Ljava/lang/String;", "DEFAULT_WEB_RTC_SERVER_ENDPOINT", "DEFAULT_FALLBACK_MODE_SERVER_ENDPOINT", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            return p013kotlin.text.t.r1(str, "Bearer ", null, 2, null);
        }

        private Companion() {
        }
    }

    public h(Bundle bundle) {
        this.bundle = bundle;
    }

    public final boolean A() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("IS_NAV_BAR_ENABLED", true);
        }
        return true;
    }

    public final String a() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ACCOUNT_ID_KEY");
        }
        return null;
    }

    public final boolean b() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONSUME_EXCEPTIONS", false);
        }
        return false;
    }

    public final boolean c() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_NAVIGATION_BAR", true);
        }
        return true;
    }

    public final boolean d() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("CONTROL_STATUS_BAR", true);
        }
        return true;
    }

    public final boolean e() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("ENABLE_ERROR_LOGGING", true);
        }
        return true;
    }

    public final bh0.f f() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == -1711584601 && string.equals("SANDBOX")) {
                    return bh0.f.SANDBOX;
                }
            } else if (string.equals(BuildConfig.MODE)) {
                return bh0.f.PRODUCTION;
            }
        }
        return bh0.f.PRODUCTION;
    }

    public final String g() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ENVIRONMENT_ID_KEY");
        }
        return null;
    }

    public final FallbackMode h() {
        Bundle bundle = this.bundle;
        String string = bundle != null ? bundle.getString("FALLBACK_MODE") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 64924498) {
                if (iHashCode != 74175084) {
                    if (iHashCode == 1933739535 && string.equals("ALWAYS")) {
                        return FallbackMode.ALWAYS;
                    }
                } else if (string.equals("NEVER")) {
                    return FallbackMode.NEVER;
                }
            } else if (string.equals("DEFER")) {
                return FallbackMode.DEFER;
            }
        }
        return FallbackMode.NEVER;
    }

    public final String i() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("FALLBACK_MODE_SERVER_ENDPOINT", "https://inquiry-fallback.withpersona.com")) == null) ? "https://inquiry-fallback.withpersona.com" : string;
    }

    public final bh0.s j() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (bh0.s) q5.c.a(bundle, "FIELDS_MAP_KEY", bh0.s.class);
        }
        return null;
    }

    public final boolean k() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("HANDLE_BACK_PRESS", true);
        }
        return true;
    }

    public final String l() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("INQUIRY_ID_KEY");
        }
        return null;
    }

    public final String m() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("LOCALE");
        }
        return null;
    }

    public final String n() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("ONE_TIME_LINK_CODE");
        }
        return null;
    }

    public final String o() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("REFERENCE_ID_KEY");
        }
        return null;
    }

    public final String p() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("REQUEST_KEY")) == null) ? "com.withpersona.sdk2.request_key" : string;
    }

    public final boolean q() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("RETURN_COLLECTED_DATA", false);
        }
        return false;
    }

    public final String r() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("SERVER_ENDPOINT", "https://withpersona.com")) == null) ? "https://withpersona.com" : string;
    }

    public final String s() {
        String string;
        Bundle bundle = this.bundle;
        if (bundle == null || (string = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer " + string;
    }

    public final StaticInquiryTemplate t() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return (StaticInquiryTemplate) q5.c.a(bundle, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class);
        }
        return null;
    }

    public final String u() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_ID_KEY");
        }
        return null;
    }

    public final String v() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("TEMPLATE_VERSION_KEY");
        }
        return null;
    }

    public final Integer w() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("THEME_KEY"));
        }
        return null;
    }

    public final String x() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getString("THEME_SET_ID_KEY");
        }
        return null;
    }

    public final boolean y() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean("USE_SERVER_STYLES", true);
        }
        return true;
    }

    public final String z() {
        String string;
        Bundle bundle = this.bundle;
        return (bundle == null || (string = bundle.getString("WEB_RTC_SERVER_ENDPOINT", "https://webrtc-consumer.withpersona.com")) == null) ? "https://webrtc-consumer.withpersona.com" : string;
    }
}

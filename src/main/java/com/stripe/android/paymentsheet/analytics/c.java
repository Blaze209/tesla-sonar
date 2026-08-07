package com.stripe.android.paymentsheet.analytics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.n0;
import com.stripe.android.model.o0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00152\u00020\u0001:\u0019\u0015\u0014\u0013\r\u0010\u000b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000e\u0082\u0001\u0018*+,-./0123456789:;<=>?@A¨\u0006B"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c;", "Lw30/a;", "<init>", "()V", "", "isDecoupled", "linkEnabled", "googlePaySupported", "", "", "", "f", "(ZZZ)Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "params", "e", "()Z", "isDeferred", "c", "b", "a", "additionalParams", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Lcom/stripe/android/paymentsheet/analytics/c$a;", "Lcom/stripe/android/paymentsheet/analytics/c$b;", "Lcom/stripe/android/paymentsheet/analytics/c$c;", "Lcom/stripe/android/paymentsheet/analytics/c$e;", "Lcom/stripe/android/paymentsheet/analytics/c$f;", "Lcom/stripe/android/paymentsheet/analytics/c$g;", "Lcom/stripe/android/paymentsheet/analytics/c$h;", "Lcom/stripe/android/paymentsheet/analytics/c$i;", "Lcom/stripe/android/paymentsheet/analytics/c$j;", "Lcom/stripe/android/paymentsheet/analytics/c$k;", "Lcom/stripe/android/paymentsheet/analytics/c$l;", "Lcom/stripe/android/paymentsheet/analytics/c$m;", "Lcom/stripe/android/paymentsheet/analytics/c$n;", "Lcom/stripe/android/paymentsheet/analytics/c$o;", "Lcom/stripe/android/paymentsheet/analytics/c$p;", "Lcom/stripe/android/paymentsheet/analytics/c$q;", "Lcom/stripe/android/paymentsheet/analytics/c$r;", "Lcom/stripe/android/paymentsheet/analytics/c$s;", "Lcom/stripe/android/paymentsheet/analytics/c$t;", "Lcom/stripe/android/paymentsheet/analytics/c$u;", "Lcom/stripe/android/paymentsheet/analytics/c$v;", "Lcom/stripe/android/paymentsheet/analytics/c$w;", "Lcom/stripe/android/paymentsheet/analytics/c$x;", "Lcom/stripe/android/paymentsheet/analytics/c$y;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c implements w30.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$a;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "type", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZ)V", "g", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String type, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(type, "type");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "autofill_" + g(type);
            this.additionalParams = v0.i();
        }

        private final String g(String str) {
            String lowerCase = new p013kotlin.text.q("(?<=.)(?=\\p{Upper})").j(str, "_").toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$b;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "", "b", "Z", "c", "()Z", "linkEnabled", "e", "isDeferred", DateTokenConverter.CONVERTER_KEY, "googlePaySupported", "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventReporter.Mode mode) {
            super(null);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            this.eventName = c.INSTANCE.d(mode, "cannot_return_from_link_and_lpms");
            this.additionalParams = v0.i();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$c;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0994c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public C0994c(boolean z11, boolean z12, boolean z13) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_card_number_completed";
            this.additionalParams = v0.i();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.c$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000fR\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u000fR\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u000fR\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010&\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u000fR\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u000fR\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u000fR\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u000fR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u000fR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u000fR\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u000fR\u0014\u0010.\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u000fR\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u000fR\u0014\u00101\u001a\u0002008\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u000fR\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u000f¨\u00065"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$d;", "", "<init>", "()V", "Lw70/j;", "paymentSelection", "", "c", "(Lw70/j;)Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "eventName", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;", "FIELD_ALLOWS_PAYMENT_METHODS_REQUIRING_SHIPPING_ADDRESS", "Ljava/lang/String;", "FIELD_ALLOWS_REMOVAL_OF_LAST_SAVED_PAYMENT_METHOD", "FIELD_APPEARANCE", "FIELD_BILLING", "FIELD_BILLING_DETAILS_COLLECTION_CONFIGURATION", "FIELD_CARD_BRAND_ACCEPTANCE", "FIELD_CBC_EVENT_SOURCE", "FIELD_COMPOSE", "FIELD_CURRENCY", "FIELD_CUSTOMER", "FIELD_CUSTOMER_ACCESS_PROVIDER", "FIELD_DEFERRED_INTENT_CONFIRMATION_TYPE", "FIELD_DELAYED_PMS", "FIELD_DURATION", "FIELD_ERROR_CODE", "FIELD_ERROR_MESSAGE", "FIELD_EXTERNAL_PAYMENT_METHODS", "FIELD_GOOGLE_PAY", "FIELD_GOOGLE_PAY_ENABLED", "FIELD_INTENT_TYPE", "FIELD_IS_DECOUPLED", "FIELD_LINK_CONTEXT", "FIELD_LINK_ENABLED", "FIELD_LINK_MODE", "FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION", "FIELD_ORDERED_LPMS", "FIELD_PAYMENT_METHOD_LAYOUT", "FIELD_PAYMENT_METHOD_ORDER", "FIELD_PREFERRED_NETWORKS", "FIELD_PRIMARY_BUTTON_COLOR", "FIELD_REQUIRE_CVC_RECOLLECTION", "FIELD_SELECTED_CARD_BRAND", "FIELD_SELECTED_LPM", "", "MAX_EXTERNAL_PAYMENT_METHODS", "I", "VALUE_ADD_CBC_EVENT_SOURCE", "VALUE_EDIT_CBC_EVENT_SOURCE", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(w70.j paymentSelection) {
            if (p013kotlin.jvm.internal.s.f(paymentSelection, w70.j.c.f121146b)) {
                return "googlepay";
            }
            if (paymentSelection instanceof w70.j.Saved) {
                return "savedpm";
            }
            if (p013kotlin.jvm.internal.s.f(paymentSelection, w70.j.d.f121147b) ? true : paymentSelection instanceof w70.j.e.LinkInline) {
                return "link";
            }
            return paymentSelection instanceof w70.j.e ? "newpm" : "unknown";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(EventReporter.Mode mode, String eventName) {
            return "mc_" + mode + "_" + eventName;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$e;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public e(boolean z11, boolean z12, boolean z13) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_dismiss";
            this.additionalParams = v0.i();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$f;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", AnalyticsAttribute.Error, "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/Throwable;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable error, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_elements_session_load_failed";
            this.additionalParams = v0.r(v0.f(jn0.x.a("error_message", g80.k.a(error).getType())), h70.h.INSTANCE.c(error));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$g;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public g(boolean z11, boolean z12, boolean z13) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_cancel_edit_screen";
            this.additionalParams = v0.i();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$h;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/c$h$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/c$h$a;Lcom/stripe/android/model/h;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$h$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Edit("edit"),
            Add("add");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            a(String str) {
                this.value = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(a source, com.stripe.android.model.h hVar, boolean z11, boolean z12, boolean z13) {
            super(0 == true ? 1 : 0);
            p013kotlin.jvm.internal.s.k(source, "source");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_close_cbc_dropdown";
            this.additionalParams = v0.m(jn0.x.a("cbc_event_source", source.getValue()), jn0.x.a("selected_card_brand", hVar != null ? hVar.getCode() : null));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u000e\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\f\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$i;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/y$h;ZZZ)V", "b", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "c", "Lcom/stripe/android/paymentsheet/y$h;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "f", "", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final EventReporter.Mode mode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.paymentsheet.y.Configuration configuration;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventReporter.Mode mode, com.stripe.android.paymentsheet.y.Configuration configuration, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            this.mode = mode;
            this.configuration = configuration;
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            com.stripe.android.paymentsheet.y.i accessType;
            boolean z11 = false;
            Pair pairA = jn0.x.a("customer", Boolean.valueOf(this.configuration.getCustomer() != null));
            com.stripe.android.paymentsheet.y.CustomerConfiguration customer = this.configuration.getCustomer();
            Pair pairA2 = jn0.x.a("customer_access_provider", (customer == null || (accessType = customer.getAccessType()) == null) ? null : accessType.getAnalyticsValue());
            Pair pairA3 = jn0.x.a("googlepay", Boolean.valueOf(this.configuration.getGooglePay() != null));
            Pair pairA4 = jn0.x.a("primary_button_color", Boolean.valueOf(this.configuration.getPrimaryButtonColor() != null));
            com.stripe.android.paymentsheet.y.BillingDetails defaultBillingDetails = this.configuration.getDefaultBillingDetails();
            if (defaultBillingDetails != null && defaultBillingDetails.d()) {
                z11 = true;
            }
            return v0.f(jn0.x.a("mpe_config", v0.m(pairA, pairA2, pairA3, pairA4, jn0.x.a("default_billing_details", Boolean.valueOf(z11)), jn0.x.a("allows_delayed_payment_methods", Boolean.valueOf(this.configuration.getAllowsDelayedPaymentMethods())), jn0.x.a("appearance", i30.a.b(this.configuration.getAppearance())), jn0.x.a("payment_method_order", this.configuration.m()), jn0.x.a("allows_payment_methods_requiring_shipping_address", Boolean.valueOf(this.configuration.getAllowsPaymentMethodsRequiringShippingAddress())), jn0.x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.configuration.getAllowsRemovalOfLastSavedPaymentMethod())), jn0.x.a("billing_details_collection_configuration", i30.a.c(this.configuration.getBillingDetailsCollectionConfiguration())), jn0.x.a("preferred_networks", i30.a.e(this.configuration.q())), jn0.x.a("external_payment_methods", i30.a.a(this.configuration)), jn0.x.a("payment_method_layout", i30.a.d(this.configuration.getPaymentMethodLayout())), jn0.x.a("card_brand_acceptance", Boolean.valueOf(i30.a.f(this.configuration.getCardBrandAcceptance()))))));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            String strY0;
            List listR = p013kotlin.collections.v.r(this.configuration.getCustomer() != null ? "customer" : null, this.configuration.getGooglePay() != null ? "googlepay" : null);
            List list = listR.isEmpty() ? null : listR;
            if (list == null || (strY0 = p013kotlin.collections.v.y0(list, "_", null, null, 0, null, null, 62, null)) == null) {
                strY0 = "default";
            }
            return c.INSTANCE.d(this.mode, "init_" + strY0);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$j;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lio0/b;", "duration", "", AnalyticsAttribute.Error, "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lio0/b;Ljava/lang/Throwable;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public /* synthetic */ j(io0.b bVar, Throwable th2, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, th2, z11, z12, z13);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private j(io0.b bVar, Throwable error, boolean z11, boolean z12, boolean z13) {
            super(0 == true ? 1 : 0);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_load_failed";
            this.additionalParams = v0.r(v0.m(jn0.x.a("duration", bVar != null ? Float.valueOf(q70.c.d(bVar.getRawValue())) : null), jn0.x.a("error_message", g80.k.a(error).getType())), h70.h.INSTANCE.c(error));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$k;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "initializedViaCompose", "<init>", "(ZZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public k(boolean z11, boolean z12, boolean z13, boolean z14) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_load_started";
            this.additionalParams = v0.f(jn0.x.a("compose", Boolean.valueOf(z14)));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u0007*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u00020\u0007*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$l;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lw70/j;", "paymentSelection", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", "", "orderedLpms", "Lio0/b;", "duration", "Lcom/stripe/android/model/n0;", "linkMode", "", "isDeferred", "googlePaySupported", "requireCvcRecollection", "<init>", "(Lw70/j;Lcom/stripe/android/paymentsheet/y$m;Ljava/util/List;Lio0/b;Lcom/stripe/android/model/n0;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "linkEnabled", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "h", "(Lw70/j;)Ljava/lang/String;", "defaultAnalyticsValue", "g", "(Lcom/stripe/android/paymentsheet/y$m;)Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public /* synthetic */ l(w70.j jVar, com.stripe.android.paymentsheet.y.m mVar, List list, io0.b bVar, n0 n0Var, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, mVar, list, bVar, n0Var, z11, z12, z13);
        }

        private final String g(com.stripe.android.paymentsheet.y.m mVar) {
            if (!(mVar instanceof com.stripe.android.paymentsheet.y.m.DeferredIntent)) {
                if (mVar instanceof com.stripe.android.paymentsheet.y.m.PaymentIntent) {
                    return "payment_intent";
                }
                if (mVar instanceof com.stripe.android.paymentsheet.y.m.SetupIntent) {
                    return "setup_intent";
                }
                throw new NoWhenBranchMatchedException();
            }
            com.stripe.android.paymentsheet.y.n.d mode = ((com.stripe.android.paymentsheet.y.m.DeferredIntent) mVar).getIntentConfiguration().getMode();
            if (mode instanceof com.stripe.android.paymentsheet.y.n.d.a) {
                return "deferred_payment_intent";
            }
            if (mode instanceof com.stripe.android.paymentsheet.y.n.d.b) {
                return "deferred_setup_intent";
            }
            throw new NoWhenBranchMatchedException();
        }

        private final String h(w70.j jVar) {
            String str;
            if (jVar instanceof w70.j.c) {
                return "google_pay";
            }
            if (jVar instanceof w70.j.d) {
                return "link";
            }
            if (!(jVar instanceof w70.j.Saved)) {
                return "none";
            }
            PaymentMethod.p pVar = ((w70.j.Saved) jVar).getPaymentMethod().type;
            return (pVar == null || (str = pVar.code) == null) ? "saved" : str;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private l(w70.j jVar, com.stripe.android.paymentsheet.y.m initializationMode, List<String> orderedLpms, io0.b bVar, n0 n0Var, boolean z11, boolean z12, boolean z13) {
            super(0 == true ? 1 : 0);
            p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
            p013kotlin.jvm.internal.s.k(orderedLpms, "orderedLpms");
            this.isDeferred = z11;
            this.googlePaySupported = z12;
            this.eventName = "mc_load_succeeded";
            this.linkEnabled = n0Var != null;
            Map mapM = v0.m(jn0.x.a("duration", bVar != null ? Float.valueOf(q70.c.d(bVar.getRawValue())) : null), jn0.x.a("selected_lpm", h(jVar)), jn0.x.a("intent_type", g(initializationMode)), jn0.x.a("ordered_lpms", p013kotlin.collections.v.y0(orderedLpms, ",", null, null, 0, null, null, 62, null)), jn0.x.a("require_cvc_recollection", Boolean.valueOf(z13)));
            Map mapF = n0Var != null ? v0.f(jn0.x.a("link_mode", o0.a(n0Var))) : null;
            this.additionalParams = v0.r(mapM, mapF == null ? v0.i() : mapF);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$m;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "", "errorMessage", "<init>", "(ZZZLjava/lang/String;)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "f", "getEventName", "eventName", "", "", "g", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String errorMessage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public m(boolean z11, boolean z12, boolean z13, String str) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.errorMessage = str;
            this.eventName = "luxe_serialize_failure";
            this.additionalParams = v0.f(jn0.x.a("error_message", str));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001'BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0018\u0010\u001dR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$n;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/analytics/c$n$a;", "result", "Lio0/b;", "duration", "Lw70/j;", "paymentSelection", "", "currency", "", "isDeferred", "linkEnabled", "googlePaySupported", "Ln70/f;", "deferredIntentConfirmationType", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/c$n$a;Lio0/b;Lw70/j;Ljava/lang/String;ZZZLn70/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "g", "()Ljava/util/Map;", "h", "b", "Lcom/stripe/android/paymentsheet/analytics/c$n$a;", "c", "Z", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "f", "Ln70/f;", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "Ljava/util/Map;", "a", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a result;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final n70.f deferredIntentConfirmationType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$n$a;", "", "", "I", "()Ljava/lang/String;", "analyticsValue", "b", "c", "Lcom/stripe/android/paymentsheet/analytics/c$n$a$b;", "Lcom/stripe/android/paymentsheet/analytics/c$n$a$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0995a {
                public static String a(a aVar) {
                    if (aVar instanceof C0996c) {
                        return "success";
                    }
                    if (aVar instanceof Failure) {
                        return "failure";
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$n$a$b;", "Lcom/stripe/android/paymentsheet/analytics/c$n$a;", "Lq70/b;", AnalyticsAttribute.Error, "<init>", "(Lq70/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq70/b;", "()Lq70/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Failure implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final q70.b error;

                public Failure(q70.b error) {
                    p013kotlin.jvm.internal.s.k(error, "error");
                    this.error = error;
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String I() {
                    return C0995a.a(this);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final q70.b getError() {
                    return this.error;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Failure) && p013kotlin.jvm.internal.s.f(this.error, ((Failure) other).error);
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.error + ")";
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$n$a$c;", "Lcom/stripe/android/paymentsheet/analytics/c$n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class C0996c implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0996c f52622a = new C0996c();

                private C0996c() {
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String I() {
                    return C0995a.a(this);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0996c);
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }
            }

            String I();
        }

        public /* synthetic */ n(EventReporter.Mode mode, a aVar, io0.b bVar, w70.j jVar, String str, boolean z11, boolean z12, boolean z13, n70.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, aVar, bVar, jVar, str, z11, z12, z13, fVar);
        }

        private final Map<String, String> g() {
            n70.f fVar = this.deferredIntentConfirmationType;
            Map<String, String> mapF = fVar != null ? v0.f(jn0.x.a("deferred_intent_confirmation_type", fVar.getValue())) : null;
            return mapF == null ? v0.i() : mapF;
        }

        private final Map<String, String> h() {
            a aVar = this.result;
            if (aVar instanceof a.C0996c) {
                return v0.i();
            }
            if (aVar instanceof a.Failure) {
                return s90.b.a(v0.m(jn0.x.a("error_message", ((a.Failure) aVar).getError().a()), jn0.x.a("error_code", ((a.Failure) this.result).getError().getErrorCode())));
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private n(EventReporter.Mode mode, a result, io0.b bVar, w70.j jVar, String str, boolean z11, boolean z12, boolean z13, n70.f fVar) {
            super(0 == true ? 1 : 0);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            p013kotlin.jvm.internal.s.k(result, "result");
            this.result = result;
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.deferredIntentConfirmationType = fVar;
            Companion companion = c.INSTANCE;
            this.eventName = companion.d(mode, "payment_" + companion.c(jVar) + "_" + result.I());
            this.additionalParams = v0.r(v0.r(v0.r(v0.m(jn0.x.a("duration", bVar != null ? Float.valueOf(q70.c.d(bVar.getRawValue())) : null), jn0.x.a("currency", str)), g()), q70.c.f(jVar)), h());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$o;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "code", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(code, "code");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_form_interacted";
            this.additionalParams = v0.f(jn0.x.a("selected_lpm", code));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$p;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "currency", "Lio0/b;", "duration", "selectedLpm", "linkContext", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;Lio0/b;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public /* synthetic */ p(String str, io0.b bVar, String str2, String str3, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bVar, str2, str3, z11, z12, z13);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private p(String str, io0.b bVar, String str2, String str3, boolean z11, boolean z12, boolean z13) {
            super(0 == true ? 1 : 0);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_confirm_button_tapped";
            this.additionalParams = s90.b.a(v0.m(jn0.x.a("duration", bVar != null ? Float.valueOf(q70.c.d(bVar.getRawValue())) : null), jn0.x.a("currency", str), jn0.x.a("selected_lpm", str2), jn0.x.a("link_context", str3)));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$q;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "code", "currency", "linkContext", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String code, String str, String str2, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(code, "code");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_carousel_payment_method_tapped";
            this.additionalParams = v0.m(jn0.x.a("currency", str), jn0.x.a("selected_lpm", code), jn0.x.a("link_context", str2));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$r;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lw70/j;", "paymentSelection", "", "currency", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lw70/j;Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EventReporter.Mode mode, w70.j jVar, String str, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            Companion companion = c.INSTANCE;
            this.eventName = companion.d(mode, "paymentoption_" + companion.c(jVar) + "_select");
            this.additionalParams = v0.f(jn0.x.a("currency", str));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$s;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        public s(boolean z11, boolean z12, boolean z13) {
            super(null);
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_open_edit_screen";
            this.additionalParams = v0.i();
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$t;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "", "currency", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventReporter.Mode mode, String str, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = c.INSTANCE.d(mode, "sheet_savedpm_show");
            this.additionalParams = v0.f(jn0.x.a("currency", str));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$u;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "", "currency", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(EventReporter.Mode mode, String str, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(mode, "mode");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = c.INSTANCE.d(mode, "sheet_newpm_show");
            this.additionalParams = v0.f(jn0.x.a("currency", str));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$v;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/paymentsheet/analytics/c$v$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/c$v$a;Lcom/stripe/android/model/h;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$v$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            Edit("edit"),
            Add("add");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            a(String str) {
                this.value = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a source, com.stripe.android.model.h selectedBrand, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(source, "source");
            p013kotlin.jvm.internal.s.k(selectedBrand, "selectedBrand");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_open_cbc_dropdown";
            this.additionalParams = v0.m(jn0.x.a("cbc_event_source", source.getValue()), jn0.x.a("selected_card_brand", selectedBrand.getCode()));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$w;", "Lcom/stripe/android/paymentsheet/analytics/c;", "", "code", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Ljava/lang/String;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String code, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(code, "code");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_form_shown";
            this.additionalParams = v0.f(jn0.x.a("selected_lpm", code));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$x;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/model/h;", "selectedBrand", "", AnalyticsAttribute.Error, "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(com.stripe.android.model.h selectedBrand, Throwable error, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(selectedBrand, "selectedBrand");
            p013kotlin.jvm.internal.s.k(error, "error");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_update_card_failed";
            this.additionalParams = v0.r(v0.m(jn0.x.a("selected_card_brand", selectedBrand.getCode()), jn0.x.a("error_message", error.getMessage())), h70.h.INSTANCE.c(error));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/c$y;", "Lcom/stripe/android/paymentsheet/analytics/c;", "Lcom/stripe/android/model/h;", "selectedBrand", "", "isDeferred", "linkEnabled", "googlePaySupported", "<init>", "(Lcom/stripe/android/model/h;ZZZ)V", "b", "Z", "e", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "", "", "f", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDeferred;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean linkEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean googlePaySupported;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> additionalParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(com.stripe.android.model.h selectedBrand, boolean z11, boolean z12, boolean z13) {
            super(null);
            p013kotlin.jvm.internal.s.k(selectedBrand, "selectedBrand");
            this.isDeferred = z11;
            this.linkEnabled = z12;
            this.googlePaySupported = z13;
            this.eventName = "mc_update_card";
            this.additionalParams = v0.f(jn0.x.a("selected_card_brand", selectedBrand.getCode()));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map<String, Object> a() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: b, reason: from getter */
        protected boolean getGooglePaySupported() {
            return this.googlePaySupported;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: c, reason: from getter */
        protected boolean getLinkEnabled() {
            return this.linkEnabled;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        /* JADX INFO: renamed from: e, reason: from getter */
        protected boolean getIsDeferred() {
            return this.isDeferred;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Map<String, Object> f(boolean isDecoupled, boolean linkEnabled, boolean googlePaySupported) {
        return v0.m(jn0.x.a("is_decoupled", Boolean.valueOf(isDecoupled)), jn0.x.a("link_enabled", Boolean.valueOf(linkEnabled)), jn0.x.a("google_pay_enabled", Boolean.valueOf(googlePaySupported)));
    }

    protected abstract Map<String, Object> a();

    /* JADX INFO: renamed from: b */
    protected abstract boolean getGooglePaySupported();

    /* JADX INFO: renamed from: c */
    protected abstract boolean getLinkEnabled();

    public final Map<String, Object> d() {
        return v0.r(f(getIsDeferred(), getLinkEnabled(), getGooglePaySupported()), a());
    }

    /* JADX INFO: renamed from: e */
    protected abstract boolean getIsDeferred();

    private c() {
    }
}

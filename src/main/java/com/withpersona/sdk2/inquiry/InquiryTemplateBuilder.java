package com.withpersona.sdk2.inquiry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\"R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "", "templateId", "", "templateVersion", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "accountId", "referenceId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "Ljava/lang/Integer;", "themeSetId", AnalyticsAttribute.Environment, "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "", "Ljava/lang/Boolean;", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "locale", "consumeExceptions", "fromTemplateId", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InquiryTemplateBuilder {
    private String accountId;
    private Boolean consumeExceptions;
    private Boolean enableErrorLogging;
    private Environment environment;
    private String environmentId;
    private FallbackMode fallbackMode;
    private Fields fields;
    private String locale;
    private String referenceId;
    private Boolean returnCollectedData;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final String templateId;
    private final String templateVersion;
    private Integer theme;
    private String themeSetId;
    private Boolean useServerStyles;

    public InquiryTemplateBuilder() {
        this(null, null, null, 7, null);
    }

    public final InquiryTemplateBuilder accountId(String accountId) {
        this.referenceId = null;
        this.accountId = accountId;
        return this;
    }

    public final Inquiry build() {
        return new Inquiry(this.templateId, this.templateVersion, null, null, null, this.referenceId, this.accountId, this.fields, this.theme, this.environment, this.environmentId, this.enableErrorLogging, this.returnCollectedData, this.fallbackMode, this.useServerStyles, this.staticInquiryTemplate, this.themeSetId, this.locale, this.consumeExceptions);
    }

    public final InquiryTemplateBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final InquiryTemplateBuilder enableErrorLogging(boolean enableErrorLogging) {
        this.enableErrorLogging = Boolean.valueOf(enableErrorLogging);
        return this;
    }

    public final InquiryTemplateBuilder environment(Environment environment) {
        s.k(environment, "environment");
        this.environment = environment;
        return this;
    }

    public final InquiryTemplateBuilder environmentId(String environmentId) {
        s.k(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    @ExperimentalFallbackMode
    public final InquiryTemplateBuilder fallbackMode(FallbackMode fallbackMode) {
        s.k(fallbackMode, "fallbackMode");
        this.fallbackMode = fallbackMode;
        return this;
    }

    public final InquiryTemplateBuilder fields(Fields fields) {
        this.fields = fields;
        return this;
    }

    public final InquiryTemplateBuilder fromTemplateId(String templateId) {
        s.k(templateId, "templateId");
        return new InquiryTemplateBuilder(templateId, null, null, 6, null);
    }

    public final InquiryTemplateBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryTemplateBuilder referenceId(String referenceId) {
        this.accountId = null;
        this.referenceId = referenceId;
        return this;
    }

    public final InquiryTemplateBuilder returnCollectedData(boolean returnCollectedData) {
        this.returnCollectedData = Boolean.valueOf(returnCollectedData);
        return this;
    }

    @e
    public final InquiryTemplateBuilder routingCountry(String routingCountry) {
        return this;
    }

    @e
    public final InquiryTemplateBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    @ExperimentalThemeSetId
    public final InquiryTemplateBuilder themeSetId(String themeSetId) {
        s.k(themeSetId, "themeSetId");
        this.themeSetId = themeSetId;
        return this;
    }

    public InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate) {
        this.templateId = str;
        this.templateVersion = str2;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.fallbackMode = FallbackMode.NEVER;
    }

    public final InquiryTemplateBuilder theme(ThemeSource themeSource) {
        s.k(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }

    public /* synthetic */ InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : staticInquiryTemplate);
    }
}

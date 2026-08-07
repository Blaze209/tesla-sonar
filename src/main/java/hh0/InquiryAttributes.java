package hh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hh0.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001f\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b'\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b(\u0010\u0014R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b)\u0010\u0014¨\u0006-"}, d2 = {"Lhh0/d;", "", "", "templateId", "templateVersion", "inquiryId", "sessionToken", "Lbh0/f;", AnalyticsAttribute.Environment, "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbh0/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "e", DateTokenConverter.CONVERTER_KEY, "g", "Lbh0/f;", "()Lbh0/f;", "f", "getNote", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "k", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InquiryAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String templateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String templateVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final bh0.f environment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String environmentId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String note;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, InquiryField> fields;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String themeSetId;

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryAttributes(String str, String str2, String str3, String str4, bh0.f environment, String str5, String str6, String str7, String str8, Map<String, ? extends InquiryField> map, String str9) {
        p013kotlin.jvm.internal.s.k(environment, "environment");
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.environment = environment;
        this.environmentId = str5;
        this.accountId = str6;
        this.referenceId = str7;
        this.note = str8;
        this.fields = map;
        this.themeSetId = str9;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final bh0.f getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final Map<String, InquiryField> d() {
        return this.fields;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryAttributes)) {
            return false;
        }
        InquiryAttributes inquiryAttributes = (InquiryAttributes) other;
        return p013kotlin.jvm.internal.s.f(this.templateId, inquiryAttributes.templateId) && p013kotlin.jvm.internal.s.f(this.templateVersion, inquiryAttributes.templateVersion) && p013kotlin.jvm.internal.s.f(this.inquiryId, inquiryAttributes.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, inquiryAttributes.sessionToken) && this.environment == inquiryAttributes.environment && p013kotlin.jvm.internal.s.f(this.environmentId, inquiryAttributes.environmentId) && p013kotlin.jvm.internal.s.f(this.accountId, inquiryAttributes.accountId) && p013kotlin.jvm.internal.s.f(this.referenceId, inquiryAttributes.referenceId) && p013kotlin.jvm.internal.s.f(this.note, inquiryAttributes.note) && p013kotlin.jvm.internal.s.f(this.fields, inquiryAttributes.fields) && p013kotlin.jvm.internal.s.f(this.themeSetId, inquiryAttributes.themeSetId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inquiryId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionToken;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.environment.hashCode()) * 31;
        String str5 = this.environmentId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accountId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.note;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, InquiryField> map = this.fields;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.themeSetId;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getThemeSetId() {
        return this.themeSetId;
    }

    public String toString() {
        return "InquiryAttributes(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environment=" + this.environment + ", environmentId=" + this.environmentId + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", note=" + this.note + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ")";
    }

    public /* synthetic */ InquiryAttributes(String str, String str2, String str3, String str4, bh0.f fVar, String str5, String str6, String str7, String str8, Map map, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, fVar, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : map, (i11 & 1024) != 0 ? null : str9);
    }
}

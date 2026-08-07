package com.withpersona.sdk2.inquiry.internal.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@com.squareup.moshi.i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0003\n\u0006\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "b", "Data", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateInquiryRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Data data;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "attributes", "", "type", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "Adapter", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Data {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a attributes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$Data$Adapter, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;", "", "<init>", "()V", "Lcom/squareup/moshi/r;", "jsonWriter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "data", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @com.squareup.moshi.f
            public final Data fromJson(k reader) {
                s.k(reader, "reader");
                reader.h();
                String strO = "";
                String strO2 = strO;
                while (reader.hasNext()) {
                    String strL = reader.L();
                    if (s.f(strL, "templateId")) {
                        strO = reader.O();
                    } else if (s.f(strL, AnalyticsAttribute.Environment)) {
                        strO2 = reader.O();
                    } else {
                        reader.F();
                    }
                }
                reader.j();
                return new Data(new a(strO, null, strO2, "", null, null, null, null, null, DownloaderService.STATUS_INSUFFICIENT_SPACE_ERROR, null), null, 2, 0 == true ? 1 : 0);
            }

            @x
            public final void toJson(r jsonWriter, Data data) {
                s.k(jsonWriter, "jsonWriter");
                s.k(data, "data");
                jsonWriter.o();
                jsonWriter.b0("attributes");
                jsonWriter.o();
                String templateId = data.getAttributes().getTemplateId();
                if (templateId != null) {
                    jsonWriter.b0("inquiryTemplateId").G0(templateId);
                }
                String templateVersion = data.getAttributes().getTemplateVersion();
                if (templateVersion != null) {
                    jsonWriter.b0("inquiryTemplateVersionId").G0(templateVersion);
                }
                jsonWriter.b0(AnalyticsAttribute.Environment).G0(data.getAttributes().getEnvironment());
                String environmentId = data.getAttributes().getEnvironmentId();
                if (environmentId != null) {
                    jsonWriter.b0("environment_id").G0(environmentId);
                }
                String accountId = data.getAttributes().getAccountId();
                if (accountId != null) {
                    jsonWriter.b0("accountId").G0(accountId);
                }
                String referenceId = data.getAttributes().getReferenceId();
                if (referenceId != null) {
                    jsonWriter.b0("referenceId").G0(referenceId);
                }
                String note = data.getAttributes().getNote();
                if (note != null) {
                    jsonWriter.b0("note").G0(note);
                }
                if (data.getAttributes().d() != null) {
                    jsonWriter.b0("fields");
                    InquiryFieldMap.INSTANCE.toJson(jsonWriter, new InquiryFieldMap(data.getAttributes().d()));
                }
                if (data.getAttributes().getThemeSetId() != null) {
                    jsonWriter.b0("themeSetId").G0(data.getAttributes().getThemeSetId());
                }
                jsonWriter.C();
                jsonWriter.C();
            }

            private Companion() {
            }
        }

        public Data(a attributes, String type) {
            s.k(attributes, "attributes");
            s.k(type, "type");
            this.attributes = attributes;
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAttributes() {
            return this.attributes;
        }

        public /* synthetic */ Data(a aVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i11 & 2) != 0 ? "inquiry" : str);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$b;", "", "<init>", "()V", "", "templateId", "templateVersion", AnalyticsAttribute.Environment, "environmentId", "accountId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CreateInquiryRequest a(String templateId, String templateVersion, String environment, String environmentId, String accountId, String referenceId, Map<String, ? extends InquiryField> fields, String themeSetId) {
            s.k(environment, "environment");
            return new CreateInquiryRequest(new Data(new a(templateId, templateVersion, environment, environmentId, accountId, referenceId, null, fields, themeSetId, 64, null), null, 2, 0 == true ? 1 : 0));
        }

        private Companion() {
        }
    }

    public CreateInquiryRequest(Data data) {
        s.k(data, "data");
        this.data = data;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;", "", "", "templateId", "templateVersion", AnalyticsAttribute.Environment, "environmentId", "accountId", "referenceId", "note", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "h", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String templateId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String templateVersion;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String environment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String environmentId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String accountId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String referenceId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String note;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final String themeSetId;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, String environment, String str3, String str4, String str5, String str6, Map<String, ? extends InquiryField> map, String str7) {
            s.k(environment, "environment");
            this.templateId = str;
            this.templateVersion = str2;
            this.environment = environment;
            this.environmentId = str3;
            this.accountId = str4;
            this.referenceId = str5;
            this.note = str6;
            this.fields = map;
            this.themeSetId = str7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEnvironment() {
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
        public final String getNote() {
            return this.note;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : map, (i11 & 256) != 0 ? null : str8);
        }
    }
}

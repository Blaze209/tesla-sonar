package com.withpersona.sdk2.inquiry;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Fields;", "", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "(Ljava/util/Map;)V", "getFields$inquiry_dynamic_feature_release", "()Ljava/util/Map;", "Builder", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Fields {
    private final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> fields;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "<init>", "()V", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "field", "name", "value", "", "", "", "Ljava/util/Date;", "fieldChoices", "fieldMultiChoices", "", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "build", "Lcom/withpersona/sdk2/inquiry/Fields;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> fields = new LinkedHashMap();

        public final Fields build() {
            return new Fields(this.fields, null);
        }

        public final Builder field(String name, String value) {
            s.k(name, "name");
            s.k(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.StringField(value, null, 2, null));
            return this;
        }

        public final Builder fieldChoices(String name, String value) {
            s.k(name, "name");
            s.k(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.ChoicesField(value, null, 2, null));
            return this;
        }

        public final Builder fieldMultiChoices(String name, String[] value) {
            s.k(name, "name");
            s.k(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.MultiChoicesField(value, null, 2, null));
            return this;
        }

        public final Builder field(String name, int value) {
            s.k(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.IntegerField(Integer.valueOf(value), null, 2, null));
            return this;
        }

        public final Builder field(String name, boolean value) {
            s.k(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.BooleanField(Boolean.valueOf(value), null, 2, null));
            return this;
        }

        public final Builder field(String name, float value) {
            s.k(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.FloatField(Float.valueOf(value), null, 2, null));
            return this;
        }

        public final Builder field(String name, Date value) {
            s.k(name, "name");
            s.k(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField(value.toString(), null, 2, null));
            return this;
        }
    }

    public /* synthetic */ Fields(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, com.withpersona.sdk2.inquiry.network.dto.InquiryField> getFields$inquiry_dynamic_feature_release() {
        return this.fields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Fields(Map<String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> map) {
        this.fields = map;
    }
}

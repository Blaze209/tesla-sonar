package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Companion", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InquiryFieldMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InquiryField> fields;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMap;)V", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends com.squareup.moshi.h<InquiryFieldMap> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        @com.squareup.moshi.f
        public InquiryFieldMap fromJson(com.squareup.moshi.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.squareup.moshi.h
        @com.squareup.moshi.x
        public void toJson(com.squareup.moshi.r writer, InquiryFieldMap value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value == null) {
                writer.c0();
                return;
            }
            writer.o();
            for (Map.Entry<String, InquiryField> entry : value.a().entrySet()) {
                String key = entry.getKey();
                InquiryField value2 = entry.getValue();
                writer.b0(key);
                if (value2 instanceof InquiryField.StringField) {
                    writer.G0(((InquiryField.StringField) value2).getValue());
                } else if (value2 instanceof InquiryField.IntegerField) {
                    writer.D0(((InquiryField.IntegerField) value2).getValue());
                } else if (value2 instanceof InquiryField.BooleanField) {
                    writer.z0(((InquiryField.BooleanField) value2).getValue());
                } else if (value2 instanceof InquiryField.DatetimeField) {
                    writer.G0(((InquiryField.DatetimeField) value2).getValue());
                } else if (value2 instanceof InquiryField.DateField) {
                    writer.G0(((InquiryField.DateField) value2).getValue());
                } else if (value2 instanceof InquiryField.FloatField) {
                    writer.D0(((InquiryField.FloatField) value2).getValue());
                } else if (value2 instanceof InquiryField.ChoicesField) {
                    writer.G0(((InquiryField.ChoicesField) value2).getValue());
                } else {
                    if (!(value2 instanceof InquiryField.MultiChoicesField)) {
                        if (!(value2 instanceof InquiryField.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Attempted to write field with type `Unknown`.");
                    }
                    writer.c();
                    String[] value3 = ((InquiryField.MultiChoicesField) value2).getValue();
                    if (value3 != null) {
                        for (String str : value3) {
                            writer.G0(str);
                        }
                    }
                    writer.t();
                }
            }
            writer.C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryFieldMap(Map<String, ? extends InquiryField> fields) {
        p013kotlin.jvm.internal.s.k(fields, "fields");
        this.fields = fields;
    }

    public final Map<String, InquiryField> a() {
        return this.fields;
    }
}

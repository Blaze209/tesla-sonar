package com.withpersona.sdk2.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse_MetaJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse_MetaJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/h;", "stringAdapter", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends com.squareup.moshi.h<CreateInquirySessionResponse.Meta> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.h<String> stringAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("accessToken");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        com.squareup.moshi.h<String> hVarF = moshi.f(String.class, d1.d(), "accessToken");
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateInquirySessionResponse.Meta fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        String strFromJson = null;
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else if (iT == 0 && (strFromJson = this.stringAdapter.fromJson(reader)) == null) {
                throw v20.c.x("accessToken", "accessToken", reader);
            }
        }
        reader.j();
        if (strFromJson != null) {
            return new CreateInquirySessionResponse.Meta(strFromJson);
        }
        throw v20.c.o("accessToken", "accessToken", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, CreateInquirySessionResponse.Meta value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("accessToken");
        this.stringAdapter.toJson(writer, value_.getAccessToken());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateInquirySessionResponse.Meta");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}

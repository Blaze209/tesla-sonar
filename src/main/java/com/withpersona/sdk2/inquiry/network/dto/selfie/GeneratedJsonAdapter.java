package com.withpersona.sdk2.inquiry.network.dto.selfie;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfigJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<PoseConfig> {
    private final h<Boolean> nullableBooleanAdapter;
    private final h<Long> nullableLongAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("pose", "allowReview", "manualCaptureEnabled", "manualCaptureDelayMs", "autoCaptureEnabled");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), "pose");
        s.j(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.class, d1.d(), "allowReview");
        s.j(hVarF2, "adapter(...)");
        this.nullableBooleanAdapter = hVarF2;
        h<Long> hVarF3 = moshi.f(Long.class, d1.d(), "manualCaptureDelayMs");
        s.j(hVarF3, "adapter(...)");
        this.nullableLongAdapter = hVarF3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PoseConfig");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public PoseConfig fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        String strFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Long lFromJson = null;
        Boolean boolFromJson3 = null;
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else if (iT == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iT == 1) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
            } else if (iT == 2) {
                boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
            } else if (iT == 3) {
                lFromJson = this.nullableLongAdapter.fromJson(reader);
            } else if (iT == 4) {
                boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.j();
        return new PoseConfig(strFromJson, boolFromJson, boolFromJson2, lFromJson, boolFromJson3);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, PoseConfig value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("pose");
        this.nullableStringAdapter.toJson(writer, value_.getPose());
        writer.b0("allowReview");
        this.nullableBooleanAdapter.toJson(writer, value_.getAllowReview());
        writer.b0("manualCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getManualCaptureEnabled());
        writer.b0("manualCaptureDelayMs");
        this.nullableLongAdapter.toJson(writer, value_.getManualCaptureDelayMs());
        writer.b0("autoCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAutoCaptureEnabled());
        writer.C();
    }
}

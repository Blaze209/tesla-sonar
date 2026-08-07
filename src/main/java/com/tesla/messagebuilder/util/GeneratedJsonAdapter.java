package com.tesla.messagebuilder.util;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.tesla.messagebuilder.util.RemoteBuildingRequestBodyJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006\""}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBodyJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "Lcom/squareup/moshi/h;", "nullableVehicleSessionInfoDataBodyAdapter", "c", "nullableStringAdapter", "", DateTokenConverter.CONVERTER_KEY, "nullableBooleanAdapter", "Lcom/tesla/messagebuilder/util/Parameters;", "e", "nullableParametersAdapter", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<RemoteBuildingRequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<VehicleSessionInfoDataBody> nullableVehicleSessionInfoDataBodyAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<String> nullableStringAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> nullableBooleanAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<Parameters> nullableParametersAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("session_info", "public_key", "generate_command", "backup", "fleet", "params");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<VehicleSessionInfoDataBody> hVarF = moshi.f(VehicleSessionInfoDataBody.class, d1.d(), "sessionInfo");
        s.j(hVarF, "adapter(...)");
        this.nullableVehicleSessionInfoDataBodyAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, d1.d(), "publicKey");
        s.j(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<Boolean> hVarF3 = moshi.f(Boolean.class, d1.d(), "generateCommand");
        s.j(hVarF3, "adapter(...)");
        this.nullableBooleanAdapter = hVarF3;
        h<Parameters> hVarF4 = moshi.f(Parameters.class, d1.d(), "parameters");
        s.j(hVarF4, "adapter(...)");
        this.nullableParametersAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteBuildingRequestBody fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        VehicleSessionInfoDataBody vehicleSessionInfoDataBodyFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        Parameters parametersFromJson = null;
        while (reader.hasNext()) {
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    break;
                case 0:
                    vehicleSessionInfoDataBodyFromJson = this.nullableVehicleSessionInfoDataBodyAdapter.fromJson(reader);
                    break;
                case 1:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    parametersFromJson = this.nullableParametersAdapter.fromJson(reader);
                    break;
            }
        }
        reader.j();
        return new RemoteBuildingRequestBody(vehicleSessionInfoDataBodyFromJson, strFromJson, boolFromJson, boolFromJson2, boolFromJson3, parametersFromJson);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, RemoteBuildingRequestBody value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("session_info");
        this.nullableVehicleSessionInfoDataBodyAdapter.toJson(writer, value_.getSessionInfo());
        writer.b0("public_key");
        this.nullableStringAdapter.toJson(writer, value_.getPublicKey());
        writer.b0("generate_command");
        this.nullableBooleanAdapter.toJson(writer, value_.getGenerateCommand());
        writer.b0("backup");
        this.nullableBooleanAdapter.toJson(writer, value_.isBackupKey());
        writer.b0("fleet");
        this.nullableBooleanAdapter.toJson(writer, value_.isFleetKey());
        writer.b0("params");
        this.nullableParametersAdapter.toJson(writer, value_.getParameters());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RemoteBuildingRequestBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}

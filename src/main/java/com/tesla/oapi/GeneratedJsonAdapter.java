package com.tesla.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.tesla.oapi.SeatCoolingBodyJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/tesla/oapi/SeatCoolingBodyJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/tesla/oapi/SeatCoolingBody;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/tesla/oapi/SeatCoolingBody;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/tesla/oapi/SeatCoolingBody;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/tesla/oapi/SeatPosition;", "seatPositionAdapter", "Lcom/squareup/moshi/h;", "Lcom/tesla/oapi/CoolingLevel;", "coolingLevelAdapter", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<SeatCoolingBody> {
    private final h<CoolingLevel> coolingLevelAdapter;
    private final k.b options;
    private final h<SeatPosition> seatPositionAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("seat_position", "seat_cooler_level");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<SeatPosition> hVarF = moshi.f(SeatPosition.class, d1.d(), "seatPosition");
        s.j(hVarF, "adapter(...)");
        this.seatPositionAdapter = hVarF;
        h<CoolingLevel> hVarF2 = moshi.f(CoolingLevel.class, d1.d(), "seatCoolerLevel");
        s.j(hVarF2, "adapter(...)");
        this.coolingLevelAdapter = hVarF2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SeatCoolingBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public SeatCoolingBody fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        SeatPosition seatPositionFromJson = null;
        CoolingLevel coolingLevelFromJson = null;
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else if (iT == 0) {
                seatPositionFromJson = this.seatPositionAdapter.fromJson(reader);
                if (seatPositionFromJson == null) {
                    throw v20.c.x("seatPosition", "seat_position", reader);
                }
            } else if (iT == 1 && (coolingLevelFromJson = this.coolingLevelAdapter.fromJson(reader)) == null) {
                throw v20.c.x("seatCoolerLevel", "seat_cooler_level", reader);
            }
        }
        reader.j();
        if (seatPositionFromJson == null) {
            throw v20.c.o("seatPosition", "seat_position", reader);
        }
        if (coolingLevelFromJson != null) {
            return new SeatCoolingBody(seatPositionFromJson, coolingLevelFromJson);
        }
        throw v20.c.o("seatCoolerLevel", "seat_cooler_level", reader);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, SeatCoolingBody value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("seat_position");
        this.seatPositionAdapter.toJson(writer, value_.getSeatPosition());
        writer.b0("seat_cooler_level");
        this.coolingLevelAdapter.toJson(writer, value_.getSeatCoolerLevel());
        writer.C();
    }
}

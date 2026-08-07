package com.tesla.proto.charging.v1;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "Lcom/tesla/proto/charging/v1/EnergyKt$Dsl;", "Ljn0/h0;", "block", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "energy", "(Lwn0/l;)Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "copy", "(Lcom/tesla/proto/charging/v1/EnergyProto$Energy;Lwn0/l;)Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "ChargingMetrology_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class EnergyKtKt {
    public static final EnergyProto.Energy copy(EnergyProto.Energy energy, l<? super EnergyKt.Dsl, h0> block) {
        s.k(energy, "<this>");
        s.k(block, "block");
        EnergyKt.Dsl.Companion companion = EnergyKt.Dsl.INSTANCE;
        EnergyProto.Energy.Builder builder = energy.toBuilder();
        s.j(builder, "this.toBuilder()");
        EnergyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final /* synthetic */ EnergyProto.Energy energy(l<? super EnergyKt.Dsl, h0> block) {
        s.k(block, "block");
        EnergyKt.Dsl.Companion companion = EnergyKt.Dsl.INSTANCE;
        EnergyProto.Energy.Builder builderNewBuilder = EnergyProto.Energy.newBuilder();
        s.j(builderNewBuilder, "newBuilder()");
        EnergyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

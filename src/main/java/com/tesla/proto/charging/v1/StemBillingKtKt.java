package com.tesla.proto.charging.v1;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "Lcom/tesla/proto/charging/v1/StemBillingKt$Dsl;", "Ljn0/h0;", "block", "Lcom/tesla/proto/charging/v1/StemBillingProto$StemBilling;", "stemBilling", "(Lwn0/l;)Lcom/tesla/proto/charging/v1/StemBillingProto$StemBilling;", "copy", "(Lcom/tesla/proto/charging/v1/StemBillingProto$StemBilling;Lwn0/l;)Lcom/tesla/proto/charging/v1/StemBillingProto$StemBilling;", "ChargingMetrology_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class StemBillingKtKt {
    public static final StemBillingProto.StemBilling copy(StemBillingProto.StemBilling stemBilling, l<? super StemBillingKt.Dsl, h0> block) {
        s.k(stemBilling, "<this>");
        s.k(block, "block");
        StemBillingKt.Dsl.Companion companion = StemBillingKt.Dsl.INSTANCE;
        StemBillingProto.StemBilling.Builder builder = stemBilling.toBuilder();
        s.j(builder, "this.toBuilder()");
        StemBillingKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final /* synthetic */ StemBillingProto.StemBilling stemBilling(l<? super StemBillingKt.Dsl, h0> block) {
        s.k(block, "block");
        StemBillingKt.Dsl.Companion companion = StemBillingKt.Dsl.INSTANCE;
        StemBillingProto.StemBilling.Builder builderNewBuilder = StemBillingProto.StemBilling.newBuilder();
        s.j(builderNewBuilder, "newBuilder()");
        StemBillingKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

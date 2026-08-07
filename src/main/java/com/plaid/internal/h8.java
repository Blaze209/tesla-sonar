package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;

/* JADX INFO: loaded from: classes6.dex */
public final class h8 extends p013kotlin.jvm.internal.u implements wn0.a<Configuration$SDKMetadata> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i8 f47724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(i8 i8Var) {
        super(0);
        this.f47724a = i8Var;
    }

    @Override // wn0.a
    public final Configuration$SDKMetadata invoke() {
        Configuration$SDKMetadata.a aVarNewBuilder = Configuration$SDKMetadata.newBuilder();
        i8 i8Var = this.f47724a;
        aVarNewBuilder.a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_ANDROID);
        aVarNewBuilder.c(i8Var.f47742a);
        aVarNewBuilder.a();
        aVarNewBuilder.b(i8Var.f47746e);
        aVarNewBuilder.a(i8Var.f47748g);
        if (i8Var.f47743b != null) {
            aVarNewBuilder.a(Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_REACTNATIVEANDROID).a(i8Var.f47743b).build());
        }
        if (i8Var.f47744c != null) {
            Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_FLUTTERANDROID).a(i8Var.f47744c).build();
        }
        return aVarNewBuilder.build();
    }
}

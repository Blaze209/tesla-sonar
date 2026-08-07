package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public final class g8 extends p013kotlin.jvm.internal.u implements wn0.a<Configuration$PlatformIdentifierConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(String str) {
        super(0);
        this.f47694a = str;
    }

    @Override // wn0.a
    public final Configuration$PlatformIdentifierConfiguration invoke() {
        Configuration$PlatformIdentifierConfiguration.a aVarNewBuilder = Configuration$PlatformIdentifierConfiguration.newBuilder();
        Configuration$AndroidPlatformIdentifierConfiguration.a aVarNewBuilder2 = Configuration$AndroidPlatformIdentifierConfiguration.newBuilder();
        String str = this.f47694a;
        if (str == null) {
            str = "";
        }
        return aVarNewBuilder.a(aVarNewBuilder2.a(str).build()).build();
    }
}

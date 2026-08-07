package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class f8 extends p013kotlin.jvm.internal.u implements wn0.a<Configuration$DeviceMetadata> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i8 f47669a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(i8 i8Var) {
        super(0);
        O4 o11 = O4.f46551a;
        this.f47669a = i8Var;
    }

    @Override // wn0.a
    public final Configuration$DeviceMetadata invoke() {
        Configuration$DeviceMetadata.a aVarNewBuilder = Configuration$DeviceMetadata.newBuilder();
        O4 o11 = O4.f46551a;
        i8 i8Var = this.f47669a;
        aVarNewBuilder.d(O4.f46553c);
        aVarNewBuilder.e(O4.f46554d);
        aVarNewBuilder.f(O4.f46558h);
        aVarNewBuilder.g(O4.f46557g);
        aVarNewBuilder.c(((Locale) i8Var.f47750i.getValue()).toLanguageTag());
        aVarNewBuilder.a(((Locale) i8Var.f47750i.getValue()).getCountry());
        aVarNewBuilder.b(((Locale) i8Var.f47750i.getValue()).getLanguage());
        aVarNewBuilder.b(O4.f46561k);
        aVarNewBuilder.a(O4.f46560j);
        return aVarNewBuilder.build();
    }
}

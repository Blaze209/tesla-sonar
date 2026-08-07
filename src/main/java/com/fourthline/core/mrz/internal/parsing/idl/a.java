package com.fourthline.core.mrz.internal.parsing.idl;

import bo0.j;
import com.fourthline.core.mrz.IdlDutchInfoExtensionsKt;
import com.fourthline.core.mrz.internal.parsing.model.b;
import com.fourthline.core.mrz.internal.transformation.f;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.fourthline.core.mrz.internal.parsing.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24208a;

    public a(String mrzText) {
        s.k(mrzText, "mrzText");
        this.f24208a = mrzText;
    }

    @Override // com.fourthline.core.mrz.internal.parsing.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a() {
        String strC = f.c(t.n1(this.f24208a, new j(6, 15)));
        return new b(strC, a(strC), f.c(t.n1(this.f24208a, new j(29, 29))));
    }

    private final String a(String str) {
        return IdlDutchInfoExtensionsKt.getCleanNLIDLPrefix(this.f24208a) + str + f.a(t.n1(this.f24208a, new j(16, 28)));
    }
}

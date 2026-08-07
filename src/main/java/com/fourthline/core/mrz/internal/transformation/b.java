package com.fourthline.core.mrz.internal.transformation;

import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {
    @Override // com.fourthline.core.mrz.internal.transformation.a
    public String a(String mrz) {
        s.k(mrz, "mrz");
        return t.V(mrz, " ", "", false, 4, null);
    }

    @Override // com.fourthline.core.mrz.internal.transformation.a
    public String b(String mrz) {
        s.k(mrz, "mrz");
        return t.V(mrz, "\n", "", false, 4, null);
    }
}

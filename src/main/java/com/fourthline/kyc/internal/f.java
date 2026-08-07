package com.fourthline.kyc.internal;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final e a(String root, wn0.l init) {
        s.k(root, "root");
        s.k(init, "init");
        e eVar = new e(root);
        init.invoke(eVar);
        return eVar;
    }
}

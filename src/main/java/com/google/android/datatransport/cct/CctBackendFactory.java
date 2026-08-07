package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import qq.h;
import qq.m;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class CctBackendFactory implements qq.d {
    @Override // qq.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}

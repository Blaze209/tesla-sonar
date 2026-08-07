package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class e<DataType> implements hj.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj.d<DataType> f20583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataType f20584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj.h f20585c;

    e(dj.d<DataType> dVar, DataType datatype, dj.h hVar) {
        this.f20583a = dVar;
        this.f20584b = datatype;
        this.f20585c = hVar;
    }

    @Override // hj.a.b
    public boolean a(@NonNull File file) {
        return this.f20583a.b(this.f20584b, file, this.f20585c);
    }
}

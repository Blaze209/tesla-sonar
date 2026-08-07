package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import xm.a0;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
@TargetApi(27)
public class AshmemMemoryChunkPool extends e {
    @pk.d
    public AshmemMemoryChunkPool(sk.d dVar, z zVar, a0 a0Var) {
        super(dVar, zVar, a0Var);
    }

    @Override // com.facebook.imagepipeline.memory.e, com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public xm.a h(int i11) {
        return new xm.a(i11);
    }
}

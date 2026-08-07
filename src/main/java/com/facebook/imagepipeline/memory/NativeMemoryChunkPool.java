package com.facebook.imagepipeline.memory;

import xm.a0;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class NativeMemoryChunkPool extends e {
    @pk.d
    public NativeMemoryChunkPool(sk.d dVar, z zVar, a0 a0Var) {
        super(dVar, zVar, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.e, com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk h(int i11) {
        return new NativeMemoryChunk(i11);
    }
}

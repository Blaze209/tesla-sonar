package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes10.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    IndexedDigest(long j11, int i11, byte[] bArr) {
        this.idx_tree = j11;
        this.idx_leaf = i11;
        this.digest = bArr;
    }
}

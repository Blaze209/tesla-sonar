package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes10.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    NodeEntry(byte[] bArr, int i11) {
        this.nodeValue = bArr;
        this.nodeHeight = i11;
    }
}

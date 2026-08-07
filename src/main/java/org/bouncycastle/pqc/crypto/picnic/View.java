package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes10.dex */
class View {
    final byte[] communicatedBits;
    final int[] inputShare;
    final int[] outputShare;

    public View(PicnicEngine picnicEngine) {
        int i11 = picnicEngine.stateSizeWords;
        this.inputShare = new int[i11];
        this.communicatedBits = new byte[picnicEngine.andSizeBytes];
        this.outputShare = new int[i11];
    }
}

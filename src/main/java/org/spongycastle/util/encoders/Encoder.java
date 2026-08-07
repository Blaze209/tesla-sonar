package org.spongycastle.util.encoders;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream);

    int decode(byte[] bArr, int i11, int i12, OutputStream outputStream);

    int encode(byte[] bArr, int i11, int i12, OutputStream outputStream);
}

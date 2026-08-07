package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/network/m;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "data", "", "initialLength", "", "a", "([BI)Ljava/lang/String;", "Ljava/nio/charset/CharsetDecoder;", "Ljava/nio/charset/CharsetDecoder;", "decoder", "b", "[B", "remainder", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharsetDecoder decoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private byte[] remainder;

    public m(Charset charset) {
        s.k(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        s.j(charsetDecoderNewDecoder, "newDecoder(...)");
        this.decoder = charsetDecoderNewDecoder;
    }

    public final String a(byte[] data, int initialLength) {
        s.k(data, "data");
        byte[] bArr = this.remainder;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length + initialLength];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(data, 0, bArr2, bArr.length, initialLength);
            initialLength += bArr.length;
            data = bArr2;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, 0, initialLength);
        boolean z11 = false;
        int i11 = 0;
        CharBuffer charBufferDecode = null;
        while (!z11 && i11 < 4) {
            try {
                charBufferDecode = this.decoder.decode(byteBufferWrap);
                z11 = true;
            } catch (CharacterCodingException unused) {
                i11++;
                byteBufferWrap = ByteBuffer.wrap(data, 0, initialLength - i11);
            }
        }
        if (!z11 || i11 <= 0) {
            this.remainder = null;
        } else {
            byte[] bArr3 = new byte[i11];
            System.arraycopy(data, initialLength - i11, bArr3, 0, i11);
            this.remainder = bArr3;
        }
        if (!z11) {
            qk.a.I("ReactNative", "failed to decode string from byte array");
            return "";
        }
        if (charBufferDecode == null) {
            return "";
        }
        char[] cArrArray = charBufferDecode.array();
        s.j(cArrArray, "array(...)");
        return new String(cArrArray, 0, charBufferDecode.length());
    }
}

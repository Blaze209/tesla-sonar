package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.bouncycastle.crypto.hpke.HPKE;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lll0/k;", "", "n", "", "b", "(Lll0/k;I)[B", "Lll0/o;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "max", "", DateTokenConverter.CONVERTER_KEY, "(Lll0/o;Ljava/nio/charset/Charset;I)Ljava/lang/String;", "bytesCount", "f", "(Lll0/o;ILjava/nio/charset/Charset;)Ljava/lang/String;", "Lll0/r;", "", "text", "fromIndex", "toIndex", "Ljn0/h0;", "h", "(Lll0/r;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "j", "(Lll0/r;Ljava/lang/CharSequence;II)V", "size", "", "a", "(I)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final Void a(int i11) {
        throw new EOFException("Premature end of stream: expected " + i11 + " bytes");
    }

    public static final byte[] b(k kVar, int i11) {
        p013kotlin.jvm.internal.s.k(kVar, "<this>");
        if (i11 == 0) {
            return ml0.f.f92337a;
        }
        byte[] bArr = new byte[i11];
        p.c(kVar, bArr, 0, i11);
        return bArr;
    }

    public static /* synthetic */ byte[] c(k kVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            long jJ0 = kVar.J0();
            if (jJ0 > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i11 = (int) jJ0;
        }
        return b(kVar, i11);
    }

    public static final String d(o oVar, Charset charset, int i11) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        p013kotlin.jvm.internal.s.j(charsetDecoderNewDecoder, "charset.newDecoder()");
        return kl0.b.a(charsetDecoderNewDecoder, oVar, i11);
    }

    public static /* synthetic */ String e(o oVar, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return d(oVar, charset, i11);
    }

    public static final String f(o oVar, int i11, Charset charset) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        p013kotlin.jvm.internal.s.j(charsetDecoderNewDecoder, "charset.newDecoder()");
        return kl0.a.b(charsetDecoderNewDecoder, oVar, i11);
    }

    public static /* synthetic */ String g(o oVar, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return f(oVar, i11, charset);
    }

    public static final void h(r rVar, CharSequence text, int i11, int i12, Charset charset) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        if (charset == p013kotlin.text.d.UTF_8) {
            j(rVar, text, i11, i12);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
        kl0.b.f(charsetEncoderNewEncoder, rVar, text, i11, i12);
    }

    public static /* synthetic */ void i(r rVar, CharSequence charSequence, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        if ((i13 & 8) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        h(rVar, charSequence, i11, i12, charset);
    }

    private static final void j(r rVar, CharSequence charSequence, int i11, int i12) {
        int i13;
        ml0.a aVarD = ml0.f.d(rVar, 1, null);
        int i14 = i11;
        while (true) {
            try {
                CharSequence charSequence2 = charSequence;
                int i15 = i12;
                int iB = ml0.e.b(aVarD.getMemory(), charSequence2, i14, i15, aVarD.getWritePosition(), aVarD.getLimit());
                short sA = ml0.c.a(iB);
                short sB = ml0.c.b(iB);
                int i16 = sA & HPKE.aead_EXPORT_ONLY;
                i14 += i16;
                aVarD.a(sB & HPKE.aead_EXPORT_ONLY);
                if (i16 != 0 || i14 >= i15) {
                    i13 = i14 < i15 ? 1 : 0;
                } else {
                    i13 = 8;
                }
                if (i13 <= 0) {
                    rVar.n();
                    return;
                } else {
                    aVarD = ml0.f.d(rVar, i13, aVarD);
                    charSequence = charSequence2;
                    i12 = i15;
                }
            } catch (Throwable th2) {
                rVar.n();
                throw th2;
            }
        }
    }
}

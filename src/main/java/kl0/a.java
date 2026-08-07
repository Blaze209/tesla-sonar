package kl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import jl0.c;
import ll0.o;
import ml0.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\r\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00060\u0000j\u0002`\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0018\u001a\u00020\u0004*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\n\u0010\f\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u001b*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u001c\u0010'\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)\"\u0019\u0010/\u001a\u00020\u001b*\u00060+j\u0002`,8F¢\u0006\u0006\u001a\u0004\b-\u0010.*\n\u00100\"\u00020+2\u00020+*\n\u00101\"\u00020\u00122\u00020\u0012*\n\u00102\"\u00020\u00002\u00020\u0000*\n\u00104\"\u0002032\u000203¨\u00065"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "g", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "h", "Lll0/a;", "dst", "f", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILll0/a;)I", "", "e", "(Ljava/nio/charset/CharsetEncoder;Lll0/a;)Z", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lll0/o;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "a", "(Ljava/nio/charset/CharsetDecoder;Lll0/o;Ljava/lang/Appendable;I)I", "inputLength", "", "b", "(Ljava/nio/charset/CharsetDecoder;Lll0/o;I)Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/charset/CoderResult;", "Ljn0/h0;", "j", "(Ljava/nio/charset/CoderResult;)V", "Ljava/nio/CharBuffer;", "kotlin.jvm.PlatformType", "Ljava/nio/CharBuffer;", "EmptyCharBuffer", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "name", "Charset", "CharsetDecoder", "CharsetEncoder", "Lkotlin/text/d;", "Charsets", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CharBuffer f86294a = CharBuffer.allocate(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ByteBuffer f86295b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        s.h(byteBufferAllocate);
        f86295b = byteBufferAllocate;
    }

    public static final int a(CharsetDecoder charsetDecoder, o input, Appendable dst, int i11) {
        CoderResult cr2;
        ml0.a aVarC;
        s.k(charsetDecoder, "<this>");
        s.k(input, "input");
        s.k(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(PKIFailureInfo.certRevoked);
        boolean z11 = true;
        ml0.a aVarB = f.b(input, 1);
        int iRemaining = 0;
        if (aVarB != null) {
            int i12 = 1;
            int i13 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                    if (writePosition >= i12) {
                        int i14 = i11 - iRemaining2;
                        if (i14 == 0) {
                            i12 = 0;
                        } else {
                            try {
                                ByteBuffer memory = aVarB.getMemory();
                                int readPosition = aVarB.getReadPosition();
                                int writePosition2 = aVarB.getWritePosition() - readPosition;
                                ByteBuffer byteBufferE = c.e(memory, readPosition, writePosition2);
                                charBufferAllocate.clear();
                                if (i14 < 8192) {
                                    charBufferAllocate.limit(i14);
                                }
                                CoderResult rc2 = charsetDecoder.decode(byteBufferE, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append(charBufferAllocate);
                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                    s.j(rc2, "rc");
                                    j(rc2);
                                }
                                i13 = (rc2.isUnderflow() && byteBufferE.hasRemaining()) ? i13 + 1 : 1;
                                if (byteBufferE.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                aVarB.c(byteBufferE.position());
                                i12 = i13;
                            } catch (Throwable th2) {
                                aVarB.getWritePosition();
                                aVarB.getReadPosition();
                                throw th2;
                            }
                        }
                        writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                    }
                    if (writePosition == 0) {
                        try {
                            aVarC = f.c(input, aVarB);
                        } catch (Throwable th3) {
                            th = th3;
                            z11 = false;
                            if (z11) {
                                f.a(input, aVarB);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || aVarB.getCapacity() - aVarB.getLimit() < 8) {
                        f.a(input, aVarB);
                        aVarC = f.b(input, i12);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        break;
                    }
                    if (i12 <= 0) {
                        iRemaining = 1;
                        aVarB = aVarC;
                        break;
                    }
                    aVarB = aVarC;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (iRemaining != 0) {
                f.a(input, aVarB);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i15 = i11 - iRemaining;
            if (i15 == 0) {
                break;
            }
            if (i15 < 8192) {
                charBufferAllocate.limit(i15);
            }
            cr2 = charsetDecoder.decode(f86295b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append(charBufferAllocate);
            if (cr2.isUnmappable() || cr2.isMalformed()) {
                s.j(cr2, "cr");
                j(cr2);
            }
        } while (cr2.isOverflow());
        return iRemaining;
    }

    public static final String b(CharsetDecoder charsetDecoder, o input, int i11) throws EOFException {
        s.k(charsetDecoder, "<this>");
        s.k(input, "input");
        if (i11 == 0) {
            return "";
        }
        if (input.getHeadEndExclusive() - input.getHeadPosition() < i11) {
            return d(charsetDecoder, input, i11);
        }
        if (!input.getHeadMemory().hasArray()) {
            return c(charsetDecoder, input, i11);
        }
        ByteBuffer headMemory = input.getHeadMemory();
        byte[] bArrArray = headMemory.array();
        s.j(bArrArray, "bb.array()");
        int iArrayOffset = headMemory.arrayOffset() + headMemory.position() + input.y0().getReadPosition();
        Charset charset = charsetDecoder.charset();
        s.j(charset, "charset()");
        String str = new String(bArrArray, iArrayOffset, i11, charset);
        input.T(i11);
        return str;
    }

    private static final String c(CharsetDecoder charsetDecoder, o oVar, int i11) throws CharacterCodingException, EOFException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(i11);
        ByteBuffer byteBufferE = c.e(oVar.getHeadMemory(), oVar.y0().getReadPosition(), i11);
        CoderResult rc2 = charsetDecoder.decode(byteBufferE, charBufferAllocate, true);
        if (rc2.isMalformed() || rc2.isUnmappable()) {
            s.j(rc2, "rc");
            j(rc2);
        }
        charBufferAllocate.flip();
        oVar.T(byteBufferE.position());
        String string = charBufferAllocate.toString();
        s.j(string, "cb.toString()");
        return string;
    }

    private static final String d(CharsetDecoder charsetDecoder, o oVar, int i11) throws Throwable {
        int iPosition;
        ml0.a aVarC;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i11);
        boolean z11 = true;
        ml0.a aVarB = f.b(oVar, 1);
        boolean z12 = false;
        if (aVarB == null) {
            iPosition = i11;
        } else {
            iPosition = i11;
            int i12 = 1;
            int i13 = 1;
            boolean z13 = false;
            while (true) {
                try {
                    int writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            if (charBufferAllocate.hasRemaining() && iPosition != 0) {
                                ByteBuffer memory = aVarB.getMemory();
                                int readPosition = aVarB.getReadPosition();
                                int writePosition2 = aVarB.getWritePosition() - readPosition;
                                ByteBuffer byteBufferE = c.e(memory, readPosition, writePosition2);
                                int iLimit = byteBufferE.limit();
                                int iPosition2 = byteBufferE.position();
                                boolean z14 = iLimit - iPosition2 >= iPosition;
                                if (z14) {
                                    byteBufferE.limit(iPosition2 + iPosition);
                                }
                                CoderResult rc2 = charsetDecoder.decode(byteBufferE, charBufferAllocate, z14);
                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                    s.j(rc2, "rc");
                                    j(rc2);
                                }
                                i13 = (rc2.isUnderflow() && byteBufferE.hasRemaining()) ? i13 + 1 : 1;
                                byteBufferE.limit(iLimit);
                                iPosition -= byteBufferE.position() - iPosition2;
                                if (byteBufferE.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                aVarB.c(byteBufferE.position());
                                i12 = i13;
                                z13 = z14;
                                th = th;
                                if (z11) {
                                    f.a(oVar, aVarB);
                                }
                                throw th;
                            }
                            i12 = 0;
                            writePosition = aVarB.getWritePosition() - aVarB.getReadPosition();
                        } catch (Throwable th2) {
                            aVarB.getWritePosition();
                            aVarB.getReadPosition();
                            throw th2;
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            aVarC = f.c(oVar, aVarB);
                        } catch (Throwable th3) {
                            th = th3;
                            z11 = false;
                        }
                    } else if (writePosition < i12 || aVarB.getCapacity() - aVarB.getLimit() < 8) {
                        f.a(oVar, aVarB);
                        aVarC = f.b(oVar, i12);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        break;
                    }
                    if (i12 <= 0) {
                        z12 = true;
                        aVarB = aVarC;
                        break;
                    }
                    aVarB = aVarC;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (z12) {
                f.a(oVar, aVarB);
            }
            z12 = z13;
        }
        if (charBufferAllocate.hasRemaining() && !z12) {
            CoderResult rc3 = charsetDecoder.decode(f86295b, charBufferAllocate, true);
            if (rc3.isMalformed() || rc3.isUnmappable()) {
                s.j(rc3, "rc");
                j(rc3);
            }
        }
        if (iPosition <= 0) {
            if (iPosition < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            charBufferAllocate.flip();
            String string = charBufferAllocate.toString();
            s.j(string, "cb.toString()");
            return string;
        }
        throw new EOFException("Not enough bytes available: had only " + (i11 - iPosition) + " instead of " + i11);
    }

    public static final boolean e(CharsetEncoder charsetEncoder, ll0.a dst) throws CharacterCodingException {
        s.k(charsetEncoder, "<this>");
        s.k(dst, "dst");
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferE = c.e(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(f86294a, byteBufferE, true);
        if (result.isMalformed() || result.isUnmappable()) {
            s.j(result, "result");
            j(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferE.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(byteBufferE.position());
        return zIsUnderflow;
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence input, int i11, int i12, ll0.a dst) throws CharacterCodingException {
        s.k(charsetEncoder, "<this>");
        s.k(input, "input");
        s.k(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i11, i12);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer memory = dst.getMemory();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferE = c.e(memory, writePosition, limit);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferE, false);
        if (result.isMalformed() || result.isUnmappable()) {
            s.j(result, "result");
            j(result);
        }
        if (byteBufferE.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(byteBufferE.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence input, int i11, int i12) {
        s.k(charsetEncoder, "<this>");
        s.k(input, "input");
        if (!(input instanceof String)) {
            return h(charsetEncoder, input, i11, i12);
        }
        if (i11 == 0 && i12 == input.length()) {
            byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
            s.j(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String strSubstring = ((String) input).substring(i11, i12);
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        s.j(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    private static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i11, i12));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final String i(Charset charset) {
        s.k(charset, "<this>");
        String strName = charset.name();
        s.j(strName, "name()");
        return strName;
    }

    private static final void j(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.io.charsets.MalformedInputException(message);
        }
    }
}

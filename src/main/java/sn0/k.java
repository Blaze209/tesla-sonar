package sn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010 \u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\u0004\b \u0010!\u001a!\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Ljava/io/File;", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/io/File;)[B", "array", "Ljn0/h0;", "o", "(Ljava/io/File;[B)V", "Ljava/nio/charset/Charset;", "charset", "", "m", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "p", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", DateTokenConverter.CONVERTER_KEY, "Ljava/io/OutputStream;", "r", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "h", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "e", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "Lkotlin/Function1;", "action", "f", "(Ljava/io/File;Ljava/nio/charset/Charset;Lwn0/l;)V", "", "j", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class k extends i {
    public static void d(File file, String text, Charset charset) {
        s.k(file, "<this>");
        s.k(text, "text");
        s.k(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            r(fileOutputStream, text, charset);
            h0 h0Var = h0.f84049a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final ByteBuffer e(int i11, CharsetEncoder encoder) {
        s.k(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        s.j(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void f(File file, Charset charset, wn0.l<? super String, h0> action) {
        s.k(file, "<this>");
        s.k(charset, "charset");
        s.k(action, "action");
        r.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void g(File file, Charset charset, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        f(file, charset, lVar);
    }

    public static final CharsetEncoder h(Charset charset) {
        s.k(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] i(File file) {
        s.k(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i11 = (int) length;
            byte[] bArrK = new byte[i11];
            int i12 = i11;
            int i13 = 0;
            while (i12 > 0) {
                int i14 = fileInputStream.read(bArrK, i13, i12);
                if (i14 < 0) {
                    break;
                }
                i12 -= i14;
                i13 += i14;
            }
            if (i12 > 0) {
                bArrK = Arrays.copyOf(bArrK, i13);
                s.j(bArrK, "copyOf(...)");
            } else {
                int i15 = fileInputStream.read();
                if (i15 != -1) {
                    d dVar = new d(8193);
                    dVar.write(i15);
                    a.b(fileInputStream, dVar, 0, 2, null);
                    int size = dVar.size() + i11;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrC = dVar.c();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrK, size);
                    s.j(bArrCopyOf, "copyOf(...)");
                    bArrK = p013kotlin.collections.n.k(bArrC, bArrCopyOf, i11, 0, dVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArrK;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static List<String> j(File file, Charset charset) {
        s.k(file, "<this>");
        s.k(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        f(file, charset, new wn0.l() { // from class: sn0.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.l(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List k(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return j(file, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(ArrayList arrayList, String it) {
        s.k(it, "it");
        arrayList.add(it);
        return h0.f84049a;
    }

    public static final String m(File file, Charset charset) {
        s.k(file, "<this>");
        s.k(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strF = r.f(inputStreamReader);
            b.a(inputStreamReader, null);
            return strF;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String n(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return m(file, charset);
    }

    public static void o(File file, byte[] array) {
        s.k(file, "<this>");
        s.k(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            h0 h0Var = h0.f84049a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static void p(File file, String text, Charset charset) {
        s.k(file, "<this>");
        s.k(text, "text");
        s.k(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            r(fileOutputStream, text, charset);
            h0 h0Var = h0.f84049a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void q(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        p(file, str, charset);
    }

    public static final void r(OutputStream outputStream, String text, Charset charset) throws IOException {
        s.k(outputStream, "<this>");
        s.k(text, "text");
        s.k(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            s.j(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderH = h(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(PKIFailureInfo.certRevoked);
        s.h(charsetEncoderH);
        ByteBuffer byteBufferE = e(PKIFailureInfo.certRevoked, charsetEncoderH);
        int i11 = 0;
        int i12 = 0;
        while (i11 < text.length()) {
            int iMin = Math.min(8192 - i12, text.length() - i11);
            int i13 = i11 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            s.j(cArrArray, "array(...)");
            text.getChars(i11, i13, cArrArray, i12);
            charBufferAllocate.limit(iMin + i12);
            i12 = 1;
            if (!charsetEncoderH.encode(charBufferAllocate, byteBufferE, i13 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferE.array(), 0, byteBufferE.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i12 = 0;
            }
            charBufferAllocate.clear();
            byteBufferE.clear();
            i11 = i13;
        }
    }
}

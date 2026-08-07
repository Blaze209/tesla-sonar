package sn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Iterator;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "Ljn0/h0;", "action", "c", "(Ljava/io/Reader;Lwn0/l;)V", "Ljava/io/BufferedReader;", "Lho0/i;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/BufferedReader;)Lho0/i;", "f", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "Ljava/net/URL;", "", "e", "(Ljava/net/URL;)[B", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final long a(Reader reader, Writer out, int i11) throws IOException {
        s.k(reader, "<this>");
        s.k(out, "out");
        char[] cArr = new char[i11];
        int i12 = reader.read(cArr);
        long j11 = 0;
        while (i12 >= 0) {
            out.write(cArr, 0, i12);
            j11 += (long) i12;
            i12 = reader.read(cArr);
        }
        return j11;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = PKIFailureInfo.certRevoked;
        }
        return a(reader, writer, i11);
    }

    public static final void c(Reader reader, wn0.l<? super String, h0> action) {
        s.k(reader, "<this>");
        s.k(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, PKIFailureInfo.certRevoked);
        try {
            Iterator<String> it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            h0 h0Var = h0.f84049a;
            b.a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static final ho0.i<String> d(BufferedReader bufferedReader) {
        s.k(bufferedReader, "<this>");
        return ho0.l.i(new o(bufferedReader));
    }

    public static final byte[] e(URL url) {
        s.k(url, "<this>");
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            s.h(inputStreamOpenStream);
            byte[] bArrC = a.c(inputStreamOpenStream);
            b.a(inputStreamOpenStream, null);
            return bArrC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamOpenStream, th2);
                throw th3;
            }
        }
    }

    public static final String f(Reader reader) {
        s.k(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        s.j(string, "toString(...)");
        return string;
    }
}

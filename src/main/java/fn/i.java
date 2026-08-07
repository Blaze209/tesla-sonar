package fn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import jn0.f0;
import org.bouncycastle.crypto.hpke.HPKE;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lfn/i;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "f", "(Ljava/io/InputStream;)Lkotlin/Pair;", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "", "what", "", "with", "", "a", "([BLjava/lang/String;)Z", "header", "c", "([B)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/InputStream;)I", "b", "j", "e", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f66067a = new i();

    private i() {
    }

    private final boolean a(byte[] what, String with) {
        if (what.length != with.length()) {
            return false;
        }
        Iterable iterableM0 = n.m0(what);
        if ((iterableM0 instanceof Collection) && ((Collection) iterableM0).isEmpty()) {
            return true;
        }
        Iterator it = iterableM0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            if (((byte) with.charAt(iNextInt)) != what[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final int b(InputStream stream) {
        s.k(stream, "stream");
        i iVar = f66067a;
        return (iVar.e(stream) << 8) | iVar.e(stream);
    }

    private final String c(byte[] header) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : header) {
            sb2.append((char) (f0.b(b11) & HPKE.aead_EXPORT_ONLY));
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    private final int d(InputStream stream) {
        int iE = e(stream);
        int iE2 = e(stream);
        return (e(stream) << 24) | (e(stream) << 16) | (iE2 << 8) | iE;
    }

    private final int e(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public static final Pair<Integer, Integer> f(InputStream stream) {
        Pair<Integer, Integer> pairG;
        s.k(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                i iVar = f66067a;
                if (iVar.a(bArr, "RIFF")) {
                    iVar.d(stream);
                    stream.read(bArr);
                    if (iVar.a(bArr, "WEBP")) {
                        stream.read(bArr);
                        String strC = iVar.c(bArr);
                        int iHashCode = strC.hashCode();
                        if (iHashCode == 2640674) {
                            if (strC.equals("VP8 ")) {
                                pairG = iVar.g(stream);
                                return pairG;
                            }
                            return null;
                        }
                        if (iHashCode == 2640718) {
                            if (!strC.equals("VP8L")) {
                                return null;
                            }
                            pairG = iVar.h(stream);
                            return pairG;
                        }
                        if (iHashCode != 2640730 || !strC.equals("VP8X")) {
                            return null;
                        }
                        pairG = iVar.i(stream);
                        try {
                            return pairG;
                        } catch (IOException e11) {
                            return pairG;
                        }
                    }
                }
                try {
                    return null;
                } catch (IOException e12) {
                    return null;
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
    }

    private final Pair<Integer, Integer> g(InputStream stream) throws IOException {
        stream.skip(7L);
        int iE = e(stream);
        int iE2 = e(stream);
        int iE3 = e(stream);
        if (iE == 157 && iE2 == 1 && iE3 == 42) {
            return new Pair<>(Integer.valueOf(b(stream)), Integer.valueOf(b(stream)));
        }
        return null;
    }

    private final Pair<Integer, Integer> h(InputStream stream) throws IOException {
        d(stream);
        if (e(stream) != 47) {
            return null;
        }
        int i11 = stream.read() & 255;
        int i12 = stream.read();
        return new Pair<>(Integer.valueOf((i11 | ((i12 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((i12 & 192) >> 6)) + 1));
    }

    private final Pair<Integer, Integer> i(InputStream stream) throws IOException {
        stream.skip(8L);
        return new Pair<>(Integer.valueOf(j(stream) + 1), Integer.valueOf(j(stream) + 1));
    }

    private final int j(InputStream stream) {
        return (e(stream) << 16) | (e(stream) << 8) | e(stream);
    }
}

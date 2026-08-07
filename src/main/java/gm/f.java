package gm;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgm/f;", "", "<init>", "()V", "", "value", "", "a", "(Ljava/lang/String;)[B", "byteArray", "pattern", "", "c", "([B[B)Z", "", "offset", "b", "([B[BI)Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f69224a = new f();

    private f() {
    }

    public static final byte[] a(String value) {
        s.k(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            s.j(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            s.j(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }

    public static final boolean b(byte[] byteArray, byte[] pattern, int offset) {
        s.k(byteArray, "byteArray");
        s.k(pattern, "pattern");
        if (pattern.length + offset > byteArray.length) {
            return false;
        }
        Iterable iterableM0 = n.m0(pattern);
        if ((iterableM0 instanceof Collection) && ((Collection) iterableM0).isEmpty()) {
            return true;
        }
        Iterator it = iterableM0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            if (byteArray[offset + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(byte[] byteArray, byte[] pattern) {
        s.k(byteArray, "byteArray");
        s.k(pattern, "pattern");
        return b(byteArray, pattern, 0);
    }
}

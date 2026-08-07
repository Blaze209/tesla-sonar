package ou;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f100006a;

    private i(String str) {
        this.f100006a = (String) p.m(str);
    }

    public static i f(char c11) {
        return new i(String.valueOf(c11));
    }

    public static i g(String str) {
        return new i(str);
    }

    public <A extends Appendable> A a(A a11, Iterator<?> it) throws IOException {
        p.m(a11);
        if (it.hasNext()) {
            a11.append(h(it.next()));
            while (it.hasNext()) {
                a11.append(this.f100006a);
                a11.append(h(it.next()));
            }
        }
        return a11;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<?> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<?> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public String d(Iterable<?> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<?> it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}

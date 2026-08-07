package u0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Comparable<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f115241a = c(1, 0, 0, "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f115242b = c(1, 1, 0, "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f115243c = c(1, 2, 0, "");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f115244d = c(1, 3, 0, "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f115245e = c(1, 4, 0, "");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f115246f = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    q() {
    }

    @NonNull
    public static q c(int i11, int i12, int i13, @NonNull String str) {
        return new d(i11, i12, i13, str);
    }

    private static BigInteger d(q qVar) {
        return BigInteger.valueOf(qVar.f()).shiftLeft(32).or(BigInteger.valueOf(qVar.g())).shiftLeft(32).or(BigInteger.valueOf(qVar.h()));
    }

    public static q i(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f115246f.matcher(str);
        if (matcher.matches()) {
            return c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public int a(int i11, int i12) {
        return f() == i11 ? Integer.compare(g(), i12) : Integer.compare(f(), i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull q qVar) {
        return d(this).compareTo(d(qVar));
    }

    abstract String e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Integer.valueOf(f()).equals(Integer.valueOf(qVar.f())) && Integer.valueOf(g()).equals(Integer.valueOf(qVar.g())) && Integer.valueOf(h()).equals(Integer.valueOf(qVar.h()));
    }

    public abstract int f();

    abstract int g();

    abstract int h();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(f()), Integer.valueOf(g()), Integer.valueOf(h()));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(f() + "." + g() + "." + h());
        if (!TextUtils.isEmpty(e())) {
            sb2.append("-" + e());
        }
        return sb2.toString();
    }
}

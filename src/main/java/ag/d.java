package ag;

import cg.q;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<q> f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f1020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f1021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1023f;

    public d(List<q> list, char c11, double d11, double d12, String str, String str2) {
        this.f1018a = list;
        this.f1019b = c11;
        this.f1020c = d11;
        this.f1021d = d12;
        this.f1022e = str;
        this.f1023f = str2;
    }

    public static int c(char c11, String str, String str2) {
        return (((c11 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f1018a;
    }

    public double b() {
        return this.f1021d;
    }

    public int hashCode() {
        return c(this.f1019b, this.f1023f, this.f1022e);
    }
}

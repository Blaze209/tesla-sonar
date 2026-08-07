package p2;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lp2/b;", "", "<init>", "()V", "Lu1/i;", "interaction", "Lp1/i;", "Lw4/h;", "a", "(Lu1/i;)Lp1/i;", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f100767a = new b();

    private b() {
    }

    public final p019p1.i<w4.h> a(u1.i interaction) {
        if ((interaction instanceof u1.n.b) || (interaction instanceof u1.b) || (interaction instanceof u1.g) || (interaction instanceof u1.d)) {
            return c.f100769b;
        }
        return null;
    }

    public final p019p1.i<w4.h> b(u1.i interaction) {
        if (!(interaction instanceof u1.n.b) && !(interaction instanceof u1.b)) {
            if (interaction instanceof u1.g) {
                return c.f100771d;
            }
            if (interaction instanceof u1.d) {
                return c.f100770c;
            }
            return null;
        }
        return c.f100770c;
    }
}

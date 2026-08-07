package p009i2;

import p013kotlin.Metadata;
import p019p1.i;
import u1.b;
import u1.d;
import u1.g;
import u1.n;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Li2/q0;", "", "<init>", "()V", "Lu1/i;", "interaction", "Lp1/i;", "Lw4/h;", "a", "(Lu1/i;)Lp1/i;", "b", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f74973a = new q0();

    private q0() {
    }

    public final i<h> a(u1.i interaction) {
        if ((interaction instanceof n.b) || (interaction instanceof b) || (interaction instanceof g) || (interaction instanceof d)) {
            return r0.f75074a;
        }
        return null;
    }

    public final i<h> b(u1.i interaction) {
        if (!(interaction instanceof n.b) && !(interaction instanceof b)) {
            if (interaction instanceof g) {
                return r0.f75076c;
            }
            if (interaction instanceof d) {
                return r0.f75075b;
            }
            return null;
        }
        return r0.f75075b;
    }
}

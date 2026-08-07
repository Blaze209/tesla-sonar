package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j3.g;
import j3.i;
import j3.m;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.l;
import p013kotlin.jvm.internal.r;
import w4.h;
import w4.j;
import w4.n;
import w4.o;
import w4.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\".\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0010\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017\"\u0015\u0010\u0010\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001a\"\u0015\u0010\u0010\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u0010\u001a\u00020 *\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lj3/i;", "a", "Lj3/i;", "rectVisibilityThreshold", "", "Lp1/p1;", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "visibilityThresholdMap", "Lw4/n$a;", "Lw4/n;", "e", "(Lw4/n$a;)J", "VisibilityThreshold", "Lj3/g$a;", "Lj3/g;", "c", "(Lj3/g$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/r;)I", "Lw4/h$a;", "Lw4/h;", "(Lw4/h$a;)F", "Lj3/m$a;", "Lj3/m;", DateTokenConverter.CONVERTER_KEY, "(Lj3/m$a;)J", "Lw4/r$a;", "Lw4/r;", "f", "(Lw4/r$a;)J", "Lj3/i$a;", "g", "(Lj3/i$a;)Lj3/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f100369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<p1<?, ?>, Float> f100370b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f100369a = new i(0.5f, 0.5f, 0.5f, 0.5f);
        p1<Integer, m> p1VarF = r1.f(r.f86532a);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairA = x.a(p1VarF, fValueOf2);
        Pair pairA2 = x.a(r1.j(w4.r.INSTANCE), fValueOf2);
        Pair pairA3 = x.a(r1.i(n.INSTANCE), fValueOf2);
        Pair pairA4 = x.a(r1.e(l.f86526a), Float.valueOf(0.01f));
        Pair pairA5 = x.a(r1.c(i.INSTANCE), fValueOf);
        Pair pairA6 = x.a(r1.d(m.INSTANCE), fValueOf);
        Pair pairA7 = x.a(r1.b(g.INSTANCE), fValueOf);
        p1<h, m> p1VarG = r1.g(h.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        f100370b = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, x.a(p1VarG, fValueOf3), x.a(r1.h(j.INSTANCE), fValueOf3));
    }

    public static final float a(h.Companion companion) {
        return h.g(0.1f);
    }

    public static final int b(r rVar) {
        return 1;
    }

    public static final long c(g.Companion companion) {
        return j3.h.a(0.5f, 0.5f);
    }

    public static final long d(m.Companion companion) {
        return j3.n.a(0.5f, 0.5f);
    }

    public static final long e(n.Companion companion) {
        return o.a(1, 1);
    }

    public static final long f(w4.r.Companion companion) {
        return s.a(1, 1);
    }

    public static final i g(i.Companion companion) {
        return f100369a;
    }

    public static final Map<p1<?, ?>, Float> h() {
        return f100370b;
    }
}

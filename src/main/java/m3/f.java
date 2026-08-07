package m3;

import j3.m;
import j3.n;
import k3.b1;
import k3.d3;
import k3.h1;
import k3.i3;
import k3.q1;
import k3.t3;
import k3.u3;
import p013kotlin.Metadata;
import w4.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 V2\u00020\u0001:\u0001WJ\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jj\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010!\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JX\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$JN\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(Jv\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102Jb\u00105\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b5\u00106Jb\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b7\u00108JX\u0010;\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b;\u0010<Jp\u0010A\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bA\u0010BJp\u0010C\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bC\u0010DJL\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJL\u0010I\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010:\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0014\u0010U\u001a\u00020R8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010Tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006XÀ\u0006\u0003"}, d2 = {"Lm3/f;", "Lw4/d;", "Lj3/m;", "Lj3/g;", "offset", "H1", "(JJ)J", "Lk3/h1;", "brush", "start", "end", "", "strokeWidth", "Lk3/i4;", "cap", "Lk3/u3;", "pathEffect", "alpha", "Lk3/q1;", "colorFilter", "Lk3/b1;", "blendMode", "Ljn0/h0;", "r0", "(Lk3/h1;JJFILk3/u3;FLk3/q1;I)V", "Lk3/p1;", "color", "Z0", "(JJJFILk3/u3;FLk3/q1;I)V", "topLeft", "size", "Lm3/g;", "style", "h0", "(Lk3/h1;JJFLm3/g;Lk3/q1;I)V", "w0", "(JJJFLm3/g;Lk3/q1;I)V", "Lk3/i3;", "image", "p1", "(Lk3/i3;JFLm3/g;Lk3/q1;I)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "Lk3/d3;", "filterQuality", "l0", "(Lk3/i3;JJJJFLm3/g;Lk3/q1;II)V", "Lj3/a;", "cornerRadius", "W0", "(Lk3/h1;JJJFLm3/g;Lk3/q1;I)V", "A1", "(JJJJLm3/g;FLk3/q1;I)V", "radius", "center", "C1", "(JFJFLm3/g;Lk3/q1;I)V", "startAngle", "sweepAngle", "", "useCenter", "V0", "(Lk3/h1;FFZJJFLm3/g;Lk3/q1;I)V", "z1", "(JFFZJJFLm3/g;Lk3/q1;I)V", "Lk3/t3;", "path", "e0", "(Lk3/t3;JFLm3/g;Lk3/q1;I)V", "E1", "(Lk3/t3;Lk3/h1;FLm3/g;Lk3/q1;I)V", "Lm3/d;", "D0", "()Lm3/d;", "drawContext", "J0", "()J", "b", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "F1", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f extends w4.d {

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f90963a;

    /* JADX INFO: renamed from: m3.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lm3/f$a;", "", "<init>", "()V", "Lk3/b1;", "b", "I", "a", "()I", "DefaultBlendMode", "Lk3/d3;", "c", "DefaultFilterQuality", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f90963a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultBlendMode = b1.INSTANCE.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality = d3.INSTANCE.a();

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    static /* synthetic */ void B0(f fVar, h1 h1Var, long j11, long j12, long j13, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i12 & 2) != 0 ? j3.g.INSTANCE.c() : j11;
        fVar.W0(h1Var, jC, (i12 & 4) != 0 ? fVar.H1(fVar.b(), jC) : j12, (i12 & 8) != 0 ? j3.a.INSTANCE.a() : j13, (i12 & 16) != 0 ? 1.0f : f11, (i12 & 32) != 0 ? j.f90966a : gVar, (i12 & 64) != 0 ? null : q1Var, (i12 & 128) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void C0(f fVar, long j11, long j12, long j13, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i12 & 2) != 0 ? j3.g.INSTANCE.c() : j12;
        fVar.w0(j11, jC, (i12 & 4) != 0 ? fVar.H1(fVar.b(), jC) : j13, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? j.f90966a : gVar, (i12 & 32) != 0 ? null : q1Var, (i12 & 64) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void D1(f fVar, long j11, long j12, long j13, long j14, g gVar, float f11, q1 q1Var, int i11, int i12, Object obj) {
        f fVar2;
        long jH1;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jC = (i12 & 2) != 0 ? j3.g.INSTANCE.c() : j12;
        if ((i12 & 4) != 0) {
            fVar2 = fVar;
            jH1 = fVar2.H1(fVar.b(), jC);
        } else {
            fVar2 = fVar;
            jH1 = j13;
        }
        fVar2.A1(j11, jC, jH1, (i12 & 8) != 0 ? j3.a.INSTANCE.a() : j14, (i12 & 16) != 0 ? j.f90966a : gVar, (i12 & 32) != 0 ? 1.0f : f11, (i12 & 64) != 0 ? null : q1Var, (i12 & 128) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void F0(f fVar, h1 h1Var, long j11, long j12, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i12 & 2) != 0 ? j3.g.INSTANCE.c() : j11;
        fVar.h0(h1Var, jC, (i12 & 4) != 0 ? fVar.H1(fVar.b(), jC) : j12, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? j.f90966a : gVar, (i12 & 32) != 0 ? null : q1Var, (i12 & 64) != 0 ? INSTANCE.a() : i11);
    }

    private default long H1(long j11, long j12) {
        return n.a(m.k(j11) - j3.g.m(j12), m.i(j11) - j3.g.n(j12));
    }

    static /* synthetic */ void I1(f fVar, h1 h1Var, long j11, long j12, float f11, int i11, u3 u3Var, float f12, q1 q1Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        fVar.r0(h1Var, j11, j12, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? Stroke.INSTANCE.a() : i11, (i13 & 32) != 0 ? null : u3Var, (i13 & 64) != 0 ? 1.0f : f12, (i13 & 128) != 0 ? null : q1Var, (i13 & 256) != 0 ? INSTANCE.a() : i12);
    }

    static /* synthetic */ void K1(f fVar, t3 t3Var, h1 h1Var, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            gVar = j.f90966a;
        }
        g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            q1Var = null;
        }
        q1 q1Var2 = q1Var;
        if ((i12 & 32) != 0) {
            i11 = INSTANCE.a();
        }
        fVar.E1(t3Var, h1Var, f12, gVar2, q1Var2, i11);
    }

    static /* synthetic */ void Q0(f fVar, long j11, long j12, long j13, float f11, int i11, u3 u3Var, float f12, q1 q1Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fVar.Z0(j11, j12, j13, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? Stroke.INSTANCE.a() : i11, (i13 & 32) != 0 ? null : u3Var, (i13 & 64) != 0 ? 1.0f : f12, (i13 & 128) != 0 ? null : q1Var, (i13 & 256) != 0 ? INSTANCE.a() : i12);
    }

    static /* synthetic */ void S(f fVar, long j11, float f11, float f12, boolean z11, long j12, long j13, float f13, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        f fVar2;
        long jH1;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i12 & 16) != 0 ? j3.g.INSTANCE.c() : j12;
        if ((i12 & 32) != 0) {
            fVar2 = fVar;
            jH1 = fVar2.H1(fVar.b(), jC);
        } else {
            fVar2 = fVar;
            jH1 = j13;
        }
        fVar2.z1(j11, f11, f12, z11, jC, jH1, (i12 & 64) != 0 ? 1.0f : f13, (i12 & 128) != 0 ? j.f90966a : gVar, (i12 & 256) != 0 ? null : q1Var, (i12 & 512) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void S1(f fVar, i3 i3Var, long j11, long j12, long j13, long j14, float f11, g gVar, q1 q1Var, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i13 & 2) != 0 ? w4.n.INSTANCE.a() : j11;
        long jA2 = (i13 & 4) != 0 ? s.a(i3Var.getWidth(), i3Var.getHeight()) : j12;
        fVar.l0(i3Var, jA, jA2, (i13 & 8) != 0 ? w4.n.INSTANCE.a() : j13, (i13 & 16) != 0 ? jA2 : j14, (i13 & 32) != 0 ? 1.0f : f11, (i13 & 64) != 0 ? j.f90966a : gVar, (i13 & 128) != 0 ? null : q1Var, (i13 & 256) != 0 ? INSTANCE.a() : i11, (i13 & 512) != 0 ? INSTANCE.b() : i12);
    }

    static /* synthetic */ void W(f fVar, t3 t3Var, long j11, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            gVar = j.f90966a;
        }
        g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            q1Var = null;
        }
        fVar.e0(t3Var, j11, f12, gVar2, q1Var, (i12 & 32) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void Z(f fVar, long j11, float f11, long j12, float f12, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i12 & 2) != 0) {
            f11 = m.j(fVar.b()) / 2.0f;
        }
        fVar.C1(j11, f11, (i12 & 4) != 0 ? fVar.J0() : j12, (i12 & 8) != 0 ? 1.0f : f12, (i12 & 16) != 0 ? j.f90966a : gVar, (i12 & 32) != 0 ? null : q1Var, (i12 & 64) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void j0(f fVar, i3 i3Var, long j11, float f11, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        fVar.p1(i3Var, (i12 & 2) != 0 ? j3.g.INSTANCE.c() : j11, (i12 & 4) != 0 ? 1.0f : f11, (i12 & 8) != 0 ? j.f90966a : gVar, (i12 & 16) != 0 ? null : q1Var, (i12 & 32) != 0 ? INSTANCE.a() : i11);
    }

    static /* synthetic */ void p0(f fVar, h1 h1Var, float f11, float f12, boolean z11, long j11, long j12, float f13, g gVar, q1 q1Var, int i11, int i12, Object obj) {
        f fVar2;
        long jH1;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jC = (i12 & 16) != 0 ? j3.g.INSTANCE.c() : j11;
        if ((i12 & 32) != 0) {
            fVar2 = fVar;
            jH1 = fVar2.H1(fVar.b(), jC);
        } else {
            fVar2 = fVar;
            jH1 = j12;
        }
        fVar2.V0(h1Var, f11, f12, z11, jC, jH1, (i12 & 64) != 0 ? 1.0f : f13, (i12 & 128) != 0 ? j.f90966a : gVar, (i12 & 256) != 0 ? null : q1Var, (i12 & 512) != 0 ? INSTANCE.a() : i11);
    }

    void A1(long color, long topLeft, long size, long cornerRadius, g style, float alpha, q1 colorFilter, int blendMode);

    void C1(long color, float radius, long center, float alpha, g style, q1 colorFilter, int blendMode);

    /* JADX INFO: renamed from: D0 */
    d getDrawContext();

    void E1(t3 path, h1 brush, float alpha, g style, q1 colorFilter, int blendMode);

    default long J0() {
        return n.b(getDrawContext().b());
    }

    void V0(h1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode);

    void W0(h1 brush, long topLeft, long size, long cornerRadius, float alpha, g style, q1 colorFilter, int blendMode);

    void Z0(long color, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, q1 colorFilter, int blendMode);

    default long b() {
        return getDrawContext().b();
    }

    void e0(t3 path, long color, float alpha, g style, q1 colorFilter, int blendMode);

    t getLayoutDirection();

    void h0(h1 brush, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode);

    default void l0(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, q1 colorFilter, int blendMode, int filterQuality) {
        S1(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    void p1(i3 image, long topLeft, float alpha, g style, q1 colorFilter, int blendMode);

    void r0(h1 brush, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, q1 colorFilter, int blendMode);

    void w0(long color, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode);

    void z1(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode);
}

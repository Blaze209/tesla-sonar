package b4;

import k3.i3;
import k3.t3;
import k3.u3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJq\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JO\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'Jw\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020*2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020.H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101Jk\u00109\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jk\u0010;\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<JM\u0010?\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@JM\u0010A\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJY\u0010C\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJY\u0010E\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJc\u0010I\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJc\u0010K\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020N*\u00020MH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020M*\u00020QH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020M*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u001a\u0010V\u001a\u00020M*\u00020NH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020X*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\t*\u00020MH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010UJ\u0017\u0010\\\u001a\u00020\t*\u00020QH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010SJ\u0017\u0010]\u001a\u00020\u0010*\u00020XH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010ZJ\u0017\u0010^\u001a\u00020Q*\u00020MH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u00020Q*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020\u0019H\u0016¢\u0006\u0004\ba\u0010bJ#\u0010h\u001a\u00020\u0019*\u00020c2\u0006\u0010e\u001a\u00020d2\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ<\u0010n\u001a\u00020\u00192\u0006\u0010e\u001a\u00020d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\b\u0010g\u001a\u0004\u0018\u00010fH\u0000ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ<\u0010p\u001a\u00020\u00192\u0006\u0010e\u001a\u00020d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020c2\b\u0010g\u001a\u0004\u0018\u00010fH\u0000ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0018\u0010m\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010!\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010{R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bv\u0010y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Lb4/i0;", "Lm3/f;", "Lm3/c;", "Lm3/a;", "canvasDrawScope", "<init>", "(Lm3/a;)V", "Lk3/h1;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Lj3/g;", "topLeft", "Lj3/m;", "size", "alpha", "Lm3/g;", "style", "Lk3/q1;", "colorFilter", "Lk3/b1;", "blendMode", "Ljn0/h0;", "V0", "(Lk3/h1;FFZJJFLm3/g;Lk3/q1;I)V", "Lk3/p1;", "color", "z1", "(JFFZJJFLm3/g;Lk3/q1;I)V", "radius", "center", "C1", "(JFJFLm3/g;Lk3/q1;I)V", "Lk3/i3;", "image", "p1", "(Lk3/i3;JFLm3/g;Lk3/q1;I)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "Lk3/d3;", "filterQuality", "l0", "(Lk3/i3;JJJJFLm3/g;Lk3/q1;II)V", "start", "end", "strokeWidth", "Lk3/i4;", "cap", "Lk3/u3;", "pathEffect", "r0", "(Lk3/h1;JJFILk3/u3;FLk3/q1;I)V", "Z0", "(JJJFILk3/u3;FLk3/q1;I)V", "Lk3/t3;", "path", "E1", "(Lk3/t3;Lk3/h1;FLm3/g;Lk3/q1;I)V", "e0", "(Lk3/t3;JFLm3/g;Lk3/q1;I)V", "h0", "(Lk3/h1;JJFLm3/g;Lk3/q1;I)V", "w0", "(JJJFLm3/g;Lk3/q1;I)V", "Lj3/a;", "cornerRadius", "W0", "(Lk3/h1;JJJFLm3/g;Lk3/q1;I)V", "A1", "(JJJJLm3/g;FLk3/q1;I)V", "Lw4/h;", "", "i1", "(F)I", "Lw4/v;", "p", "(J)F", "x", "(F)F", "w", "(I)F", "Lw4/k;", "o", "(J)J", "O1", "m1", "C", "E", "(F)J", "s", "M0", "()V", "Lb4/r;", "Lk3/j1;", "canvas", "Ln3/c;", "layer", "q", "(Lb4/r;Lk3/j1;Ln3/c;)V", "Lb4/z0;", "coordinator", "Landroidx/compose/ui/d$c;", "drawNode", "c", "(Lk3/j1;JLb4/z0;Landroidx/compose/ui/d$c;Ln3/c;)V", "n", "(Lk3/j1;JLb4/z0;Lb4/r;Ln3/c;)V", "a", "Lm3/a;", "getCanvasDrawScope", "()Lm3/a;", "b", "Lb4/r;", "J0", "()J", "getDensity", "()F", "density", "Lm3/d;", "D0", "()Lm3/d;", "drawContext", "M1", "fontScale", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 implements m3.f, m3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m3.a canvasDrawScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r drawNode;

    public i0(m3.a aVar) {
        this.canvasDrawScope = aVar;
    }

    @Override // m3.f
    public void A1(long color, long topLeft, long size, long cornerRadius, m3.g style, float alpha, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.A1(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // w4.d
    public long C(long j11) {
        return this.canvasDrawScope.C(j11);
    }

    @Override // m3.f
    public void C1(long color, float radius, long center, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.C1(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // m3.f
    /* JADX INFO: renamed from: D0 */
    public m3.d getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // w4.l
    public long E(float f11) {
        return this.canvasDrawScope.E(f11);
    }

    @Override // m3.f
    public void E1(t3 path, k3.h1 brush, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.E1(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // m3.f
    public long J0() {
        return this.canvasDrawScope.J0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // m3.c
    public void M0() {
        k3.j1 j1VarA = getDrawContext().a();
        r rVar = this.drawNode;
        p013kotlin.jvm.internal.s.h(rVar);
        androidx.compose.ui.d.c cVarB = j0.b(rVar);
        if (cVarB == 0) {
            z0 z0VarH = k.h(rVar, b1.a(4));
            if (z0VarH.H2() == rVar.getNode()) {
                z0VarH = z0VarH.getWrapped();
                p013kotlin.jvm.internal.s.h(z0VarH);
            }
            z0VarH.d3(j1VarA, getDrawContext().getGraphicsLayer());
            return;
        }
        int iA = b1.a(4);
        t2.b bVar = null;
        while (cVarB != 0) {
            if (cVarB instanceof r) {
                q((r) cVarB, j1VarA, getDrawContext().getGraphicsLayer());
            } else if ((cVarB.getKindSet() & iA) != 0 && (cVarB instanceof m)) {
                androidx.compose.ui.d.c delegate = ((m) cVarB).getDelegate();
                int i11 = 0;
                cVarB = cVarB;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i11++;
                        if (i11 == 1) {
                            cVarB = delegate;
                        } else {
                            if (bVar == null) {
                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (cVarB != 0) {
                                bVar.b(cVarB);
                                cVarB = 0;
                            }
                            bVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    cVarB = cVarB;
                }
                if (i11 == 1) {
                }
            }
            cVarB = k.g(bVar);
        }
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // w4.d
    public float O1(float f11) {
        return this.canvasDrawScope.O1(f11);
    }

    @Override // m3.f
    public void V0(k3.h1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.V0(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // m3.f
    public void W0(k3.h1 brush, long topLeft, long size, long cornerRadius, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.W0(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // m3.f
    public void Z0(long color, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.Z0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // m3.f
    public long b() {
        return this.canvasDrawScope.b();
    }

    public final void c(k3.j1 canvas, long size, z0 coordinator, androidx.compose.ui.d.c drawNode, n3.c layer) {
        int iA = b1.a(4);
        androidx.compose.ui.d.c cVarG = drawNode;
        t2.b bVar = null;
        while (cVarG != null) {
            if (cVarG instanceof r) {
                n(canvas, size, coordinator, (r) cVarG, layer);
            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                int i11 = 0;
                for (androidx.compose.ui.d.c delegate = ((m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i11++;
                        if (i11 == 1) {
                            cVarG = delegate;
                        } else {
                            if (bVar == null) {
                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                            }
                            if (cVarG != null) {
                                bVar.b(cVarG);
                                cVarG = null;
                            }
                            bVar.b(delegate);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            cVarG = k.g(bVar);
        }
    }

    @Override // m3.f
    public void e0(t3 path, long color, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.e0(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // w4.d
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // m3.f
    public w4.t getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // m3.f
    public void h0(k3.h1 brush, long topLeft, long size, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.h0(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // w4.d
    public int i1(float f11) {
        return this.canvasDrawScope.i1(f11);
    }

    @Override // m3.f
    public void l0(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, m3.g style, k3.q1 colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.l0(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // w4.d
    public float m1(long j11) {
        return this.canvasDrawScope.m1(j11);
    }

    public final void n(k3.j1 canvas, long size, z0 coordinator, r drawNode, n3.c layer) {
        r rVar = this.drawNode;
        this.drawNode = drawNode;
        m3.a aVar = this.canvasDrawScope;
        w4.t layoutDirection = coordinator.getLayoutDirection();
        w4.d density = aVar.getDrawContext().getDensity();
        w4.t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
        k3.j1 j1VarA = aVar.getDrawContext().a();
        long jB = aVar.getDrawContext().b();
        n3.c graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
        m3.d drawContext = aVar.getDrawContext();
        drawContext.d(coordinator);
        drawContext.c(layoutDirection);
        drawContext.h(canvas);
        drawContext.f(size);
        drawContext.e(layer);
        canvas.u();
        try {
            drawNode.F(this);
            canvas.o();
            m3.d drawContext2 = aVar.getDrawContext();
            drawContext2.d(density);
            drawContext2.c(layoutDirection2);
            drawContext2.h(j1VarA);
            drawContext2.f(jB);
            drawContext2.e(graphicsLayer);
            this.drawNode = rVar;
        } catch (Throwable th2) {
            canvas.o();
            m3.d drawContext3 = aVar.getDrawContext();
            drawContext3.d(density);
            drawContext3.c(layoutDirection2);
            drawContext3.h(j1VarA);
            drawContext3.f(jB);
            drawContext3.e(graphicsLayer);
            throw th2;
        }
    }

    @Override // w4.d
    public long o(long j11) {
        return this.canvasDrawScope.o(j11);
    }

    @Override // w4.l
    public float p(long j11) {
        return this.canvasDrawScope.p(j11);
    }

    @Override // m3.f
    public void p1(i3 image, long topLeft, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.p1(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    public final void q(r rVar, k3.j1 j1Var, n3.c cVar) {
        z0 z0VarH = k.h(rVar, b1.a(4));
        z0VarH.getLayoutNode().a0().n(j1Var, w4.s.d(z0VarH.e()), z0VarH, rVar, cVar);
    }

    @Override // m3.f
    public void r0(k3.h1 brush, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.r0(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // w4.d
    public long s(float f11) {
        return this.canvasDrawScope.s(f11);
    }

    @Override // w4.d
    public float w(int i11) {
        return this.canvasDrawScope.w(i11);
    }

    @Override // m3.f
    public void w0(long color, long topLeft, long size, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.w0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // w4.d
    public float x(float f11) {
        return this.canvasDrawScope.x(f11);
    }

    @Override // m3.f
    public void z1(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, m3.g style, k3.q1 colorFilter, int blendMode) {
        this.canvasDrawScope.z1(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    public /* synthetic */ i0(m3.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new m3.a() : aVar);
    }
}

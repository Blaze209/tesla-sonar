package p024x1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import w4.t;
import wn0.l;
import z3.a;
import z3.c1;
import z3.i1;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJb\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 *\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 *\u00020\u001dH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J(\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\u00020\u001a*\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010$J\u0019\u0010-\u001a\u00020\u001a*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u001a*\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u0019\u00100\u001a\u00020\u001d*\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\u00020\u001d*\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0016\u00105\u001a\u000204*\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\u000203*\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R<\u0010D\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0@j\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Lx1/y;", "Lx1/x;", "Lz3/k0;", "Lx1/r;", "itemContentFactory", "Lz3/i1;", "subcomposeMeasureScope", "<init>", "(Lx1/r;Lz3/i1;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "", "Lz3/a;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", "Ljn0/h0;", "rulers", "Lz3/w0$a;", "placementBlock", "Lz3/j0;", "Y", "(IILjava/util/Map;Lwn0/l;Lwn0/l;)Lz3/j0;", "b1", "(IILjava/util/Map;Lwn0/l;)Lz3/j0;", "Lw4/h;", "i1", "(F)I", "Lw4/v;", "Q1", "(J)I", "", "O1", "(F)F", "m1", "(J)F", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "Lz3/w0;", "c0", "(IJ)Ljava/util/List;", "p", "w", "(I)F", "x", "s", "(F)J", "E", "Lw4/k;", "Lj3/m;", "C", "(J)J", "o", "a", "Lx1/r;", "b", "Lz3/i1;", "Lx1/t;", "c", "Lx1/t;", "itemProvider", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/HashMap;", "placeablesCache", "getDensity", "()F", "density", "M1", "fontScale", "", "d1", "()Z", "isLookingAhead", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements x, k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r itemContentFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 subcomposeMeasureScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t itemProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, List<w0>> placeablesCache = new HashMap<>();

    public y(r rVar, i1 i1Var) {
        this.itemContentFactory = rVar;
        this.subcomposeMeasureScope = i1Var;
        this.itemProvider = rVar.d().invoke();
    }

    @Override // p024x1.x, w4.d
    public long C(long j11) {
        return this.subcomposeMeasureScope.C(j11);
    }

    @Override // p024x1.x, w4.l
    public long E(float f11) {
        return this.subcomposeMeasureScope.E(f11);
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // w4.d
    public float O1(float f11) {
        return this.subcomposeMeasureScope.O1(f11);
    }

    @Override // w4.d
    public int Q1(long j11) {
        return this.subcomposeMeasureScope.Q1(j11);
    }

    @Override // z3.k0
    public j0 Y(int width, int height, Map<a, Integer> alignmentLines, l<? super c1, h0> rulers, l<? super w0.a, h0> placementBlock) {
        return this.subcomposeMeasureScope.Y(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // z3.k0
    public j0 b1(int width, int height, Map<a, Integer> alignmentLines, l<? super w0.a, h0> placementBlock) {
        return this.subcomposeMeasureScope.b1(width, height, alignmentLines, placementBlock);
    }

    @Override // p024x1.x
    public List<w0> c0(int index, long constraints) {
        List<w0> list = this.placeablesCache.get(Integer.valueOf(index));
        if (list != null) {
            return list;
        }
        Object objC = this.itemProvider.c(index);
        List<z3.h0> listC1 = this.subcomposeMeasureScope.c1(objC, this.itemContentFactory.b(index, objC, this.itemProvider.d(index)));
        int size = listC1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listC1.get(i11).x0(constraints));
        }
        this.placeablesCache.put(Integer.valueOf(index), arrayList);
        return arrayList;
    }

    @Override // z3.r
    public boolean d1() {
        return this.subcomposeMeasureScope.d1();
    }

    @Override // w4.d
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // z3.r
    public t getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // w4.d
    public int i1(float f11) {
        return this.subcomposeMeasureScope.i1(f11);
    }

    @Override // w4.d
    public float m1(long j11) {
        return this.subcomposeMeasureScope.m1(j11);
    }

    @Override // p024x1.x, w4.d
    public long o(long j11) {
        return this.subcomposeMeasureScope.o(j11);
    }

    @Override // p024x1.x, w4.l
    public float p(long j11) {
        return this.subcomposeMeasureScope.p(j11);
    }

    @Override // p024x1.x, w4.d
    public long s(float f11) {
        return this.subcomposeMeasureScope.s(f11);
    }

    @Override // p024x1.x, w4.d
    public float w(int i11) {
        return this.subcomposeMeasureScope.w(i11);
    }

    @Override // p024x1.x, w4.d
    public float x(float f11) {
        return this.subcomposeMeasureScope.x(f11);
    }
}

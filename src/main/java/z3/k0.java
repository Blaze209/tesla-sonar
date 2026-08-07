package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJa\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lz3/k0;", "Lz3/r;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "", "Lz3/a;", "alignmentLines", "Lkotlin/Function1;", "Lz3/w0$a;", "Ljn0/h0;", "placementBlock", "Lz3/j0;", "b1", "(IILjava/util/Map;Lwn0/l;)Lz3/j0;", "Lz3/c1;", "rulers", "Y", "(IILjava/util/Map;Lwn0/l;Lwn0/l;)Lz3/j0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface k0 extends r {

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"z3/k0$a", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "a", "I", "getWidth", "()I", Snapshot.WIDTH, "b", "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "c", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Lz3/c1;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "g", "()Lwn0/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<z3.a, Integer> alignmentLines;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<c1, jn0.h0> rulers;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f126772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f126773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<w0.a, jn0.h0> f126774g;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i11, int i12, Map<z3.a, Integer> map, wn0.l<? super c1, jn0.h0> lVar, k0 k0Var, wn0.l<? super w0.a, jn0.h0> lVar2) {
            this.f126772e = i11;
            this.f126773f = k0Var;
            this.f126774g = lVar2;
            this.width = i11;
            this.height = i12;
            this.alignmentLines = map;
            this.rulers = lVar;
        }

        @Override // z3.j0
        public wn0.l<c1, jn0.h0> g() {
            return this.rulers;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getF16250b() {
            return this.height;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getF16249a() {
            return this.width;
        }

        @Override // z3.j0
        public void k() {
            k0 k0Var = this.f126773f;
            if (k0Var instanceof b4.p0) {
                this.f126774g.invoke(((b4.p0) k0Var).getPlacementScope());
            } else {
                this.f126774g.invoke(new f1(this.f126772e, this.f126773f.getLayoutDirection()));
            }
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.alignmentLines;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ j0 N1(k0 k0Var, int i11, int i12, Map map, wn0.l lVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i13 & 4) != 0) {
            map = p013kotlin.collections.v0.i();
        }
        return k0Var.b1(i11, i12, map, lVar);
    }

    default j0 Y(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super c1, jn0.h0> rulers, wn0.l<? super w0.a, jn0.h0> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            y3.a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, this, placementBlock);
    }

    default j0 b1(int width, int height, Map<z3.a, Integer> alignmentLines, wn0.l<? super w0.a, jn0.h0> placementBlock) {
        return Y(width, height, alignmentLines, null, placementBlock);
    }
}

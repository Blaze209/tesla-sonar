package p025y1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p021s1.p;
import w4.n;
import w4.o;
import w4.t;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b,\u00101R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010'R\u0018\u0010E\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Ly1/e;", "Ly1/f;", "", "index", "size", "", "Lz3/w0;", "placeables", "Lw4/n;", "visualOffset", "", Action.KEY_ATTRIBUTE, "Ls1/p;", "orientation", "Ld3/c$b;", "horizontalAlignment", "Ld3/c$c;", "verticalAlignment", "Lw4/t;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Ls1/p;Ld3/c$b;Ld3/c$c;Lw4/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "(I)J", "offset", "layoutWidth", "layoutHeight", "Ljn0/h0;", "h", "(III)V", "Lz3/w0$a;", "scope", "g", "(Lz3/w0$a;)V", "delta", "a", "(I)V", "I", "getIndex", "()I", "b", "f", "c", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "J", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ld3/c$b;", "Ld3/c$c;", "Lw4/t;", IntegerTokenConverter.CONVERTER_KEY, "Z", "j", "isVertical", "k", "crossAxisSize", "", "l", "[I", "placeableOffsets", "<set-?>", "m", "getOffset", "n", "mainAxisLayoutSize", "(Lz3/w0;)I", "mainAxisSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<w0> placeables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.b horizontalAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c.InterfaceC1212c verticalAlignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    public /* synthetic */ e(int i11, int i12, List list, long j11, Object obj, p pVar, c.b bVar, c.InterfaceC1212c interfaceC1212c, t tVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, list, j11, obj, pVar, bVar, interfaceC1212c, tVar, z11);
    }

    private final int d(w0 w0Var) {
        return this.isVertical ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
    }

    private final long e(int index) {
        int[] iArr = this.placeableOffsets;
        int i11 = index * 2;
        return o.a(iArr[i11], iArr[i11 + 1]);
    }

    public final void a(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z11 = this.isVertical;
            if ((z11 && i11 % 2 == 1) || (!z11 && i11 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i11] = iArr[i11] + delta;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void g(w0.a scope) {
        w0.a aVar;
        int iH;
        int i11;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        int i12 = 0;
        while (i12 < size) {
            w0 w0Var = this.placeables.get(i12);
            long jE = e(i12);
            if (this.reverseLayout) {
                if (this.isVertical) {
                    iH = n.h(jE);
                } else {
                    iH = (this.mainAxisLayoutSize - n.h(jE)) - d(w0Var);
                }
                if (this.isVertical) {
                    i11 = (this.mainAxisLayoutSize - n.i(jE)) - d(w0Var);
                } else {
                    i11 = n.i(jE);
                }
                jE = o.a(iH, i11);
            }
            long jL = n.l(jE, this.visualOffset);
            if (this.isVertical) {
                aVar = scope;
                w0.a.y(aVar, w0Var, jL, BitmapDescriptorFactory.HUE_RED, null, 6, null);
            } else {
                aVar = scope;
                w0.a.s(aVar, w0Var, jL, BitmapDescriptorFactory.HUE_RED, null, 6, null);
            }
            i12++;
            scope = aVar;
        }
    }

    @Override // p025y1.f
    public int getIndex() {
        return this.index;
    }

    @Override // p025y1.f
    public int getOffset() {
        return this.offset;
    }

    public final void h(int offset, int layoutWidth, int layoutHeight) {
        int i11;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<w0> list = this.placeables;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            w0 w0Var = list.get(i12);
            int i13 = i12 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i13] = bVar.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i13 + 1] = offset;
                i11 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i13] = offset;
                int i14 = i13 + 1;
                c.InterfaceC1212c interfaceC1212c = this.verticalAlignment;
                if (interfaceC1212c == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i14] = interfaceC1212c.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), layoutHeight);
                i11 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            }
            offset += i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(int i11, int i12, List<? extends w0> list, long j11, Object obj, p pVar, c.b bVar, c.InterfaceC1212c interfaceC1212c, t tVar, boolean z11) {
        this.index = i11;
        this.size = i12;
        this.placeables = list;
        this.visualOffset = j11;
        this.key = obj;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC1212c;
        this.layoutDirection = tVar;
        this.reverseLayout = z11;
        this.isVertical = pVar == p.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            w0 w0Var = (w0) list.get(i13);
            iMax = Math.max(iMax, !this.isVertical ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}

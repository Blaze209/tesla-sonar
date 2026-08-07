package w1;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00109R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00109R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u0010HR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010H\u001a\u0004\b<\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\bT\u0010;R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bV\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bG\u0010;R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bF\u0010;R\u001a\u0010\\\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bD\u0010;R\u0017\u0010^\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\bI\u0010;R\"\u0010a\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b_\u0010?\u001a\u0004\bQ\u0010A\"\u0004\b>\u0010`R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00109R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00109R\u0016\u0010f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00109R\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010kR\u0018\u0010n\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010mR\u0014\u0010o\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Lw1/s;", "Lw1/k;", "Lx1/z;", "", "index", "", "Lz3/w0;", "placeables", "", "isVertical", "Ld3/c$b;", "horizontalAlignment", "Ld3/c$c;", "verticalAlignment", "Lw4/t;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Lw4/n;", "visualOffset", "", Action.KEY_ATTRIBUTE, CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(ILjava/util/List;ZLd3/c$b;Ld3/c$c;Lw4/t;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "g", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "Ljn0/h0;", "e", "(IIII)V", "q", "(III)V", "mainAxisLayoutSize", "r", "(I)V", "h", "(I)J", "delta", "updateAnimations", "k", "(IZ)V", "Lz3/w0$a;", "scope", "isLookingAhead", "p", "(Lz3/w0$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/util/List;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Ld3/c$b;", "Ld3/c$c;", "f", "Lw4/t;", IntegerTokenConverter.CONVERTER_KEY, "j", "J", "l", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "m", "getContentType", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "o", "()J", "<set-?>", "getOffset", "offset", "getSize", "size", "lane", "s", "span", "t", "mainAxisSizeWithSpacings", "u", "crossAxisSize", "v", "(Z)V", "nonScrollableItem", "w", "x", "minMainAxisOffset", "y", "maxMainAxisOffset", "", "z", "[I", "placeableOffsets", "(J)I", "mainAxis", "(Lz3/w0;)I", "mainAxisSize", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements k, p024x1.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<w0> placeables;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d3.c.b horizontalAlignment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d3.c.InterfaceC1212c verticalAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w4.t layoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int spacing;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Object contentType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<s> animator;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lane;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int span;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    public /* synthetic */ s(int i11, List list, boolean z11, d3.c.b bVar, d3.c.InterfaceC1212c interfaceC1212c, w4.t tVar, boolean z12, int i12, int i13, int i14, long j11, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list, z11, bVar, interfaceC1212c, tVar, z12, i12, i13, i14, j11, obj, obj2, lazyLayoutItemAnimator, j12);
    }

    private final int m(long j11) {
        return getIsVertical() ? w4.n.i(j11) : w4.n.h(j11);
    }

    private final int n(w0 w0Var) {
        return getIsVertical() ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
    }

    @Override // p024x1.z
    public int a() {
        return this.placeables.size();
    }

    @Override // p024x1.z
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // p024x1.z
    public void c(boolean z11) {
        this.nonScrollableItem = z11;
    }

    @Override // p024x1.z
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // p024x1.z
    public void e(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        q(mainAxisOffset, layoutWidth, layoutHeight);
    }

    @Override // p024x1.z
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // p024x1.z
    public Object g(int index) {
        return this.placeables.get(index).c();
    }

    @Override // w1.k, p024x1.z
    public int getIndex() {
        return this.index;
    }

    @Override // p024x1.z
    public Object getKey() {
        return this.key;
    }

    @Override // w1.k
    public int getOffset() {
        return this.offset;
    }

    @Override // w1.k
    public int getSize() {
        return this.size;
    }

    @Override // p024x1.z
    public long h(int index) {
        int[] iArr = this.placeableOffsets;
        int i11 = index * 2;
        return w4.o.a(iArr[i11], iArr[i11 + 1]);
    }

    @Override // p024x1.z
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    @Override // p024x1.z
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getLane() {
        return this.lane;
    }

    public final void k(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((getIsVertical() && i11 % 2 == 1) || (!getIsVertical() && i11 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i11] = iArr[i11] + delta;
            }
        }
        if (updateAnimations) {
            int iA = a();
            for (int i12 = 0; i12 < iA; i12++) {
                androidx.compose.foundation.lazy.layout.b bVarE = this.animator.e(getKey(), i12);
                if (bVarE != null) {
                    long rawOffset = bVarE.getRawOffset();
                    int iH = getIsVertical() ? w4.n.h(rawOffset) : Integer.valueOf(w4.n.h(rawOffset) + delta).intValue();
                    boolean isVertical = getIsVertical();
                    int i13 = w4.n.i(rawOffset);
                    if (isVertical) {
                        i13 += delta;
                    }
                    bVarE.J(w4.o.a(iH, i13));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void p(w0.a scope, boolean isLookingAhead) {
        n3.c layer;
        w0.a aVar;
        int iH;
        int i11;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iA = a();
        int i12 = 0;
        while (i12 < iA) {
            w0 w0Var = this.placeables.get(i12);
            int iN = this.minMainAxisOffset - n(w0Var);
            int i13 = this.maxMainAxisOffset;
            long jH = h(i12);
            androidx.compose.foundation.lazy.layout.b bVarE = this.animator.e(getKey(), i12);
            if (bVarE != null) {
                if (isLookingAhead) {
                    bVarE.F(jH);
                } else {
                    if (!w4.n.g(bVarE.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.b.INSTANCE.a())) {
                        jH = bVarE.getLookaheadOffset();
                    }
                    long jL = w4.n.l(jH, bVarE.r());
                    if ((m(jH) <= iN && m(jL) <= iN) || (m(jH) >= i13 && m(jL) >= i13)) {
                        bVarE.n();
                    }
                    jH = jL;
                }
                layer = bVarE.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                if (getIsVertical()) {
                    iH = w4.n.h(jH);
                } else {
                    iH = (this.mainAxisLayoutSize - w4.n.h(jH)) - n(w0Var);
                }
                if (getIsVertical()) {
                    i11 = (this.mainAxisLayoutSize - w4.n.i(jH)) - n(w0Var);
                } else {
                    i11 = w4.n.i(jH);
                }
                jH = w4.o.a(iH, i11);
            }
            long jL2 = w4.n.l(jH, this.visualOffset);
            if (!isLookingAhead && bVarE != null) {
                bVarE.E(jL2);
            }
            if (!getIsVertical()) {
                aVar = scope;
                n3.c cVar = layer;
                if (cVar != null) {
                    w0.a.t(aVar, w0Var, jL2, cVar, BitmapDescriptorFactory.HUE_RED, 4, null);
                } else {
                    w0.a.s(aVar, w0Var, jL2, BitmapDescriptorFactory.HUE_RED, null, 6, null);
                }
            } else if (layer != null) {
                aVar = scope;
                w0.a.z(aVar, w0Var, jL2, layer, BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                aVar = scope;
                w0.a.y(aVar, w0Var, jL2, BitmapDescriptorFactory.HUE_RED, null, 6, null);
            }
            i12++;
            scope = aVar;
        }
    }

    public final void q(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int i11;
        this.offset = mainAxisOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        List<w0> list = this.placeables;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            w0 w0Var = list.get(i12);
            int i13 = i12 * 2;
            if (getIsVertical()) {
                int[] iArr = this.placeableOffsets;
                d3.c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i13] = bVar.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i13 + 1] = mainAxisOffset;
                i11 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i13] = mainAxisOffset;
                int i14 = i13 + 1;
                d3.c.InterfaceC1212c interfaceC1212c = this.verticalAlignment;
                if (interfaceC1212c == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i14] = interfaceC1212c.a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), layoutHeight);
                i11 = w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            }
            mainAxisOffset += i11;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void r(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s(int i11, List<? extends w0> list, boolean z11, d3.c.b bVar, d3.c.InterfaceC1212c interfaceC1212c, w4.t tVar, boolean z12, int i12, int i13, int i14, long j11, Object obj, Object obj2, LazyLayoutItemAnimator<s> lazyLayoutItemAnimator, long j12) {
        this.index = i11;
        this.placeables = list;
        this.isVertical = z11;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC1212c;
        this.layoutDirection = tVar;
        this.reverseLayout = z12;
        this.beforeContentPadding = i12;
        this.afterContentPadding = i13;
        this.spacing = i14;
        this.visualOffset = j11;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j12;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i15 = 0;
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            w0 w0Var = (w0) list.get(i16);
            i15 += getIsVertical() ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            iMax = Math.max(iMax, !getIsVertical() ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
        }
        this.size = i15;
        this.mainAxisSizeWithSpacings = bo0.n.f(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }
}

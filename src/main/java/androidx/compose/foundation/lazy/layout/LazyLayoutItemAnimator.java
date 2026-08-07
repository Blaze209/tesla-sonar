package androidx.compose.foundation.lazy.layout;

import androidx.collection.k0;
import androidx.collection.l0;
import androidx.collection.u0;
import androidx.collection.w0;
import b4.r;
import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import jn0.h0;
import k3.g3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p024x1.a0;
import p024x1.q;
import p024x1.z;
import w4.n;
import w4.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003X36B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\b\u0002\u0010\u000e\u001a\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0089\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0005J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b0\u00101R*\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020/0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0017\u0010P\u001a\u00020M8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bJ\u0010OR\u0018\u0010R\u001a\u00020\u0011*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010QR\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010SR\u0018\u0010T\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010SR\u0017\u0010W\u001a\u00020U8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lx1/z;", "T", "", "<init>", "()V", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "n", "(Ljava/lang/Object;)V", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "itemInfo", "k", "(Lx1/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V", "", "isMovingAway", "p", "(Lx1/z;Z)V", "", "r", "([ILx1/z;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "Lx1/a0;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lk3/g3;", "graphicsContext", "m", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;Lx1/a0;ZZIZIILkotlinx/coroutines/CoroutineScope;Lk3/g3;)V", "o", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/b;", "e", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;", "Landroidx/collection/k0;", "a", "Landroidx/collection/k0;", "keyToItemInfoMap", "b", "Landroidx/compose/foundation/lazy/layout/c;", "c", "I", "firstVisibleIndex", "Landroidx/collection/l0;", DateTokenConverter.CONVERTER_KEY, "Landroidx/collection/l0;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", IntegerTokenConverter.CONVERTER_KEY, "disappearingItems", "Lb4/r;", "j", "Lb4/r;", "displayingNode", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "(Lx1/z;)Z", "hasAnimations", "(Lx1/z;)I", "crossAxisOffset", "Lw4/r;", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutItemAnimator<T extends z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.c keyIndexMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private r displayingNode;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0<Object, LazyLayoutItemAnimator<T>.b> keyToItemInfoMap = u0.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l0<Object> movingAwayKeys = w0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromStartBound = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromEndBound = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToStartBound = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToEndBound = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<androidx.compose.foundation.lazy.layout.b> disappearingItems = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d modifier = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Lb4/s0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "o", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends s0<DisplayingDisappearingItemsNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && s.f(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void m(DisplayingDisappearingItemsNode node) {
            node.x2(this.animator);
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/ui/d$c;", "Lb4/r;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "Lm3/c;", "Ljn0/h0;", Gender.FEMALE, "(Lm3/c;)V", "h2", "()V", "i2", "x2", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsNode extends androidx.compose.ui.d.c implements r {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // b4.r
        public void F(m3.c cVar) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i11);
                n3.c layer = bVar.getLayer();
                if (layer != null) {
                    float fH = n.h(bVar.getFinalOffset());
                    float fI = n.i(bVar.getFinalOffset());
                    float fH2 = fH - n.h(layer.getTopLeft());
                    float fI2 = fI - n.i(layer.getTopLeft());
                    cVar.getDrawContext().getTransform().c(fH2, fI2);
                    try {
                        n3.e.a(cVar, layer);
                        cVar.getDrawContext().getTransform().c(-fH2, -fI2);
                    } catch (Throwable th2) {
                        cVar.getDrawContext().getTransform().c(-fH2, -fI2);
                        throw th2;
                    }
                }
            }
            cVar.M0();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && s.f(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        @Override // androidx.compose.ui.d.c
        public void h2() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.d.c
        public void i2() {
            this.animator.o();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final void x2(LazyLayoutItemAnimator<?> animator) {
            if (s.f(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.o();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lk3/g3;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "Ljn0/h0;", "k", "(Lx1/z;Lkotlinx/coroutines/CoroutineScope;Lk3/g3;III)V", "", "Landroidx/compose/foundation/lazy/layout/b;", "<set-?>", "a", "[Landroidx/compose/foundation/lazy/layout/b;", "()[Landroidx/compose/foundation/lazy/layout/b;", "animations", "Lw4/b;", "b", "Lw4/b;", "()Lw4/b;", "setConstraints-_Sx5XlM", "(Lw4/b;)V", CryptoServicesPermission.CONSTRAINTS, "c", "I", "()I", "setCrossAxisOffset", "(I)V", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "lane", "e", "g", "j", "span", "f", "", "h", "()Z", "isRunningPlacement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private w4.b constraints;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int crossAxisOffset;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lane;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int layoutMinOffset;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int layoutMaxOffset;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.foundation.lazy.layout.b[] animations = q.f122645a;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int span = 1;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx1/z;", "T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator<T> f4715c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f4715c = lazyLayoutItemAnimator;
            }

            public final void b() {
                r rVar = ((LazyLayoutItemAnimator) this.f4715c).displayingNode;
                if (rVar != null) {
                    b4.s.a(rVar);
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.b bVar : this.animations) {
                if (bVar != null && bVar.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, z zVar, CoroutineScope coroutineScope, g3 g3Var, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 32) != 0) {
                i13 = LazyLayoutItemAnimator.this.f(zVar);
            }
            bVar.k(zVar, coroutineScope, g3Var, i11, i12, i13);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.b[] getAnimations() {
            return this.animations;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final w4.b getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void i(int i11) {
            this.lane = i11;
        }

        public final void j(int i11) {
            this.span = i11;
        }

        public final void k(T positionedItem, CoroutineScope coroutineScope, g3 graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!h()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iA = positionedItem.a(); iA < length; iA++) {
                androidx.compose.foundation.lazy.layout.b bVar = this.animations[iA];
                if (bVar != null) {
                    bVar.y();
                }
            }
            if (this.animations.length != positionedItem.a()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.a());
                s.j(objArrCopyOf, "copyOf(this, newSize)");
                this.animations = (androidx.compose.foundation.lazy.layout.b[]) objArrCopyOf;
            }
            this.constraints = w4.b.a(positionedItem.getOrg.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int iA2 = positionedItem.a();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i11 = 0; i11 < iA2; i11++) {
                p024x1.i iVarC = q.c(positionedItem.g(i11));
                if (iVarC == null) {
                    androidx.compose.foundation.lazy.layout.b bVar2 = this.animations[i11];
                    if (bVar2 != null) {
                        bVar2.y();
                    }
                    this.animations[i11] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.b bVar3 = this.animations[i11];
                    if (bVar3 == null) {
                        bVar3 = new androidx.compose.foundation.lazy.layout.b(coroutineScope, graphicsContext, new a(lazyLayoutItemAnimator));
                        this.animations[i11] = bVar3;
                    }
                    bVar3.C(iVarC.x2());
                    bVar3.I(iVarC.z2());
                    bVar3.D(iVarC.y2());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f4716a;

        public c(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f4716a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(this.f4716a.b(((z) t11).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())), Integer.valueOf(this.f4716a.b(((z) t12).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f4717a;

        public d(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f4717a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(this.f4717a.b(((z) t11).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())), Integer.valueOf(this.f4717a.b(((z) t12).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f4718a;

        public e(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f4718a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(this.f4718a.b(((z) t12).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())), Integer.valueOf(this.f4718a.b(((z) t11).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f4719a;

        public f(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f4719a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(this.f4719a.b(((z) t12).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())), Integer.valueOf(this.f4719a.b(((z) t11).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(z zVar) {
        long jH = zVar.h(0);
        return !zVar.getIsVertical() ? n.i(jH) : n.h(jH);
    }

    private final boolean g(T t11) {
        int iA = t11.a();
        for (int i11 = 0; i11 < iA; i11++) {
            if (q.c(t11.g(i11)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(z zVar) {
        long jH = zVar.h(0);
        return zVar.getIsVertical() ? n.i(jH) : n.h(jH);
    }

    private final void k(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.b itemInfo) {
        int i11 = 0;
        long jH = item.h(0);
        long jE = item.getIsVertical() ? n.e(jH, 0, mainAxisOffset, 1, null) : n.e(jH, mainAxisOffset, 0, 2, null);
        androidx.compose.foundation.lazy.layout.b[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i12 = 0;
        while (i11 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = animations[i11];
            int i13 = i12 + 1;
            if (bVar != null) {
                bVar.J(n.l(jE, n.k(item.h(i12), jH)));
            }
            i11++;
            i12 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, int i11, b bVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            LazyLayoutItemAnimator<T>.b bVarC = lazyLayoutItemAnimator.keyToItemInfoMap.c(zVar.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
            s.h(bVarC);
            bVar = bVarC;
        }
        lazyLayoutItemAnimator.k(zVar, i11, bVar);
    }

    private final void n(Object key) {
        androidx.compose.foundation.lazy.layout.b[] animations;
        LazyLayoutItemAnimator<T>.b bVarP = this.keyToItemInfoMap.p(key);
        if (bVarP == null || (animations = bVarP.getAnimations()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar : animations) {
            if (bVar != null) {
                bVar.y();
            }
        }
    }

    private final void p(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.b bVarC = this.keyToItemInfoMap.c(item.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
        s.h(bVarC);
        androidx.compose.foundation.lazy.layout.b[] animations = bVarC.getAnimations();
        int length = animations.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = animations[i11];
            int i13 = i12 + 1;
            if (bVar != null) {
                long jH = item.h(i12);
                long rawOffset = bVar.getRawOffset();
                if (!n.g(rawOffset, androidx.compose.foundation.lazy.layout.b.INSTANCE.a()) && !n.g(rawOffset, jH)) {
                    bVar.m(n.k(jH, rawOffset), isMovingAway);
                }
                bVar.J(jH);
            }
            i11++;
            i12 = i13;
        }
    }

    static /* synthetic */ void q(LazyLayoutItemAnimator lazyLayoutItemAnimator, z zVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        lazyLayoutItemAnimator.p(zVar, z11);
    }

    private final int r(int[] iArr, T t11) {
        int lane = t11.getLane();
        int span = t11.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t11.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    public final androidx.compose.foundation.lazy.layout.b e(Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.layout.b[] animations;
        LazyLayoutItemAnimator<T>.b bVarC = this.keyToItemInfoMap.c(key);
        if (bVarC == null || (animations = bVarC.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    public final long i() {
        long jA = w4.r.INSTANCE.a();
        List<androidx.compose.foundation.lazy.layout.b> list = this.disappearingItems;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.foundation.lazy.layout.b bVar = list.get(i11);
            n3.c layer = bVar.getLayer();
            if (layer != null) {
                jA = w4.s.a(Math.max(w4.r.g(jA), n.h(bVar.getRawOffset()) + w4.r.g(layer.getSize())), Math.max(w4.r.f(jA), n.i(bVar.getRawOffset()) + w4.r.f(layer.getSize())));
            }
        }
        return jA;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r34v1, types: [androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b] */
    public final void m(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, androidx.compose.foundation.lazy.layout.c keyIndexMap, a0<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, CoroutineScope coroutineScope, g3 graphicsContext) {
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        ?? r11;
        androidx.compose.foundation.lazy.layout.b[] bVarArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long[] jArr3;
        int i18 = laneCount;
        androidx.compose.foundation.lazy.layout.c cVar = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                if (!this.keyToItemInfoMap.f()) {
                    break;
                }
                o();
                return;
            } else if (g(positionedItems.get(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int i21 = this.firstVisibleIndex;
        z zVar = (z) v.q0(positionedItems);
        this.firstVisibleIndex = zVar != null ? zVar.getIndex() : 0;
        long jA = isVertical ? o.a(0, consumedScroll) : o.a(consumedScroll, 0);
        boolean z11 = isLookingAhead || !hasLookaheadOccurred;
        k0<Object, LazyLayoutItemAnimator<T>.b> k0Var = this.keyToItemInfoMap;
        Object[] objArr3 = k0Var.keys;
        long[] jArr4 = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i22 = 0;
            while (true) {
                long j11 = jArr4[i22];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                    int i24 = 0;
                    while (i24 < i23) {
                        if ((j11 & 255) < 128) {
                            this.movingAwayKeys.h(objArr3[(i22 << 3) + i24]);
                        }
                        j11 >>= 8;
                        i24++;
                        jArr4 = jArr4;
                    }
                    jArr3 = jArr4;
                    if (i23 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr4;
                }
                if (i22 == length) {
                    break;
                }
                i22++;
                jArr4 = jArr3;
            }
        }
        int size2 = positionedItems.size();
        int i25 = 0;
        while (i25 < size2) {
            T t11 = positionedItems.get(i25);
            this.movingAwayKeys.x(t11.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
            if (g(t11)) {
                LazyLayoutItemAnimator<T>.b bVarC = this.keyToItemInfoMap.c(t11.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
                int iB = cVar != null ? cVar.b(t11.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String()) : -1;
                boolean z12 = iB == -1 && cVar != null;
                if (bVarC == null) {
                    LazyLayoutItemAnimator<T>.b bVar = new b();
                    b.l(bVar, t11, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i13 = size2;
                    this.keyToItemInfoMap.s(t11.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), bVar);
                    if (t11.getIndex() == iB || iB == -1) {
                        long jH = t11.h(0);
                        k(t11, t11.getIsVertical() ? n.i(jH) : n.h(jH), bVar);
                        if (z12) {
                            androidx.compose.foundation.lazy.layout.b[] animations = bVar.getAnimations();
                            for (androidx.compose.foundation.lazy.layout.b bVar2 : animations) {
                                if (bVar2 != null) {
                                    bVar2.k();
                                    h0 h0Var = h0.f84049a;
                                }
                            }
                        }
                    } else if (iB < i21) {
                        this.movingInFromStartBound.add(t11);
                    } else {
                        this.movingInFromEndBound.add(t11);
                    }
                } else {
                    i13 = size2;
                    if (z11) {
                        b.l(bVarC, t11, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        androidx.compose.foundation.lazy.layout.b[] animations2 = bVarC.getAnimations();
                        int length2 = animations2.length;
                        int i26 = 0;
                        while (i26 < length2) {
                            androidx.compose.foundation.lazy.layout.b bVar3 = animations2[i26];
                            androidx.compose.foundation.lazy.layout.b[] bVarArr2 = animations2;
                            int i27 = i21;
                            if (bVar3 != null) {
                                i16 = i25;
                                i17 = length2;
                                if (!n.g(bVar3.getRawOffset(), androidx.compose.foundation.lazy.layout.b.INSTANCE.a())) {
                                    bVar3.J(n.l(bVar3.getRawOffset(), jA));
                                }
                            } else {
                                i16 = i25;
                                i17 = length2;
                            }
                            i26++;
                            animations2 = bVarArr2;
                            i21 = i27;
                            i25 = i16;
                            length2 = i17;
                        }
                        i14 = i21;
                        i15 = i25;
                        if (z12) {
                            for (androidx.compose.foundation.lazy.layout.b bVar4 : bVarC.getAnimations()) {
                                if (bVar4 != null) {
                                    if (bVar4.v()) {
                                        this.disappearingItems.remove(bVar4);
                                        r rVar = this.displayingNode;
                                        if (rVar != null) {
                                            b4.s.a(rVar);
                                            h0 h0Var2 = h0.f84049a;
                                        }
                                    }
                                    bVar4.k();
                                }
                            }
                        }
                        q(this, t11, false, 2, null);
                    }
                }
                i14 = i21;
                i15 = i25;
            } else {
                i13 = size2;
                i14 = i21;
                i15 = i25;
                n(t11.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
            }
            i25 = i15 + 1;
            i21 = i14;
            size2 = i13;
        }
        int i28 = 2;
        int[] iArr = new int[i18];
        for (int i29 = 0; i29 < i18; i29++) {
            iArr[i29] = 0;
        }
        if (!z11 || cVar == null) {
            i11 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i11 = 2;
            } else {
                List<T> list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    v.C(list, new e(cVar));
                }
                List<T> list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i31 = 0;
                while (i31 < size3) {
                    T t12 = list2.get(i31);
                    int i32 = i28;
                    l(this, t12, layoutMinOffset - r(iArr, t12), null, 4, null);
                    q(this, t12, false, i32, null);
                    i31++;
                    i28 = i32;
                }
                i11 = i28;
                p013kotlin.collections.n.B(iArr, 0, 0, 0, 6, null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list3 = this.movingInFromEndBound;
                if (list3.size() > 1) {
                    v.C(list3, new c(cVar));
                }
                List<T> list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i33 = 0; i33 < size4; i33++) {
                    T t13 = list4.get(i33);
                    l(this, t13, (layoutMaxOffset + r(iArr, t13)) - t13.getMainAxisSizeWithSpacings(), null, 4, null);
                    q(this, t13, false, i11, null);
                }
                p013kotlin.collections.n.B(iArr, 0, 0, 0, 6, null);
            }
        }
        l0<Object> l0Var = this.movingAwayKeys;
        Object[] objArr4 = l0Var.elements;
        long[] jArr5 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length3 = jArr5.length - i11;
        if (length3 >= 0) {
            int i34 = 0;
            while (true) {
                long j12 = jArr5[i34];
                long[] jArr6 = jArr5;
                Object[] objArr5 = objArr4;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i35 = 8 - ((~(i34 - length3)) >>> 31);
                    int i36 = 0;
                    while (i36 < i35) {
                        if ((j12 & 255) < 128) {
                            Object obj = objArr5[(i34 << 3) + i36];
                            i12 = i36;
                            LazyLayoutItemAnimator<T>.b bVarC2 = this.keyToItemInfoMap.c(obj);
                            s.h(bVarC2);
                            LazyLayoutItemAnimator<T>.b bVar5 = bVarC2;
                            objArr2 = objArr5;
                            int iB2 = keyIndexMap.b(obj);
                            jArr2 = jArr6;
                            bVar5.j(Math.min(i18, bVar5.getSpan()));
                            bVar5.i(Math.min(i18 - bVar5.getSpan(), bVar5.getLane()));
                            if (iB2 == -1) {
                                androidx.compose.foundation.lazy.layout.b[] animations3 = bVar5.getAnimations();
                                int length4 = animations3.length;
                                int i37 = 0;
                                boolean z13 = false;
                                int i38 = 0;
                                while (i37 < length4) {
                                    ?? r34 = r11;
                                    androidx.compose.foundation.lazy.layout.b bVar6 = animations3[i37];
                                    int i39 = i38 + 1;
                                    if (bVar6 != null) {
                                        if (bVar6.v()) {
                                            r11 = bVar5;
                                            bVarArr = animations3;
                                        } else {
                                            if (bVar6.u()) {
                                                bVar6.y();
                                                r34.getAnimations()[i38] = null;
                                                bVarArr = animations3;
                                                this.disappearingItems.remove(bVar6);
                                                r rVar2 = this.displayingNode;
                                                if (rVar2 != null) {
                                                    r11 = bVar5;
                                                    b4.s.a(rVar2);
                                                    h0 h0Var3 = h0.f84049a;
                                                }
                                            } else {
                                                bVarArr = animations3;
                                                if (bVar6.getLayer() != null) {
                                                    r11 = bVar5;
                                                    bVar6.l();
                                                }
                                                r11 = bVar5;
                                                if (bVar6.v()) {
                                                    this.disappearingItems.add(bVar6);
                                                    r rVar3 = this.displayingNode;
                                                    if (rVar3 != null) {
                                                        b4.s.a(rVar3);
                                                        h0 h0Var4 = h0.f84049a;
                                                    }
                                                } else {
                                                    bVar6.y();
                                                    r34.getAnimations()[i38] = null;
                                                }
                                            }
                                            i37++;
                                            i38 = i39;
                                            animations3 = bVarArr;
                                            r11 = r34;
                                        }
                                        z13 = true;
                                        i37++;
                                        i38 = i39;
                                        animations3 = bVarArr;
                                        r11 = r34;
                                    } else {
                                        r11 = bVar5;
                                        bVarArr = animations3;
                                    }
                                    r11 = bVar5;
                                    i37++;
                                    i38 = i39;
                                    animations3 = bVarArr;
                                    r11 = r34;
                                }
                                r11 = bVar5;
                                if (!z13) {
                                    n(obj);
                                }
                            } else {
                                w4.b constraints = bVar5.getConstraints();
                                s.h(constraints);
                                z zVarA = itemProvider.a(iB2, bVar5.getLane(), bVar5.getSpan(), constraints.getValue());
                                zVarA.c(true);
                                androidx.compose.foundation.lazy.layout.b[] animations4 = bVar5.getAnimations();
                                int length5 = animations4.length;
                                int i41 = 0;
                                while (true) {
                                    if (i41 < length5) {
                                        androidx.compose.foundation.lazy.layout.b bVar7 = animations4[i41];
                                        int i42 = i41;
                                        if (bVar7 != null && bVar7.w()) {
                                        }
                                        i41 = i42 + 1;
                                        length5 = length5;
                                    } else if (cVar != null && iB2 == cVar.b(obj)) {
                                        n(obj);
                                    }
                                    bVar5.k(zVarA, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, bVar5.getCrossAxisOffset());
                                    if (iB2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add((T) zVarA);
                                    } else {
                                        this.movingAwayToEndBound.add((T) zVarA);
                                    }
                                }
                            }
                        } else {
                            i12 = i36;
                            objArr2 = objArr5;
                            jArr2 = jArr6;
                        }
                        j12 >>= 8;
                        i18 = laneCount;
                        i36 = i12 + 1;
                        jArr6 = jArr2;
                        objArr5 = objArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr6;
                    if (i35 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr6;
                }
                if (i34 == length3) {
                    break;
                }
                i34++;
                i18 = laneCount;
                objArr4 = objArr;
                jArr5 = jArr;
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<T> list5 = this.movingAwayToStartBound;
            if (list5.size() > 1) {
                v.C(list5, new f(keyIndexMap));
            }
            List<T> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i43 = 0; i43 < size5; i43++) {
                T t14 = list6.get(i43);
                LazyLayoutItemAnimator<T>.b bVarC3 = this.keyToItemInfoMap.c(t14.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
                s.h(bVarC3);
                LazyLayoutItemAnimator<T>.b bVar8 = bVarC3;
                t14.e((isLookingAhead ? h((z) v.o0(positionedItems)) : bVar8.getLayoutMinOffset()) - r(iArr, t14), bVar8.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z11) {
                    p(t14, true);
                }
            }
            p013kotlin.collections.n.B(iArr, 0, 0, 0, 6, null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                v.C(list7, new d(keyIndexMap));
            }
            List<T> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i44 = 0; i44 < size6; i44++) {
                T t15 = list8.get(i44);
                LazyLayoutItemAnimator<T>.b bVarC4 = this.keyToItemInfoMap.c(t15.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String());
                s.h(bVarC4);
                LazyLayoutItemAnimator<T>.b bVar9 = bVarC4;
                t15.e((isLookingAhead ? h((z) v.A0(positionedItems)) : bVar9.getLayoutMaxOffset() - t15.getMainAxisSizeWithSpacings()) + r(iArr, t15), bVar9.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z11) {
                    p(t15, true);
                }
            }
        }
        List<T> list9 = this.movingAwayToStartBound;
        v.a0(list9);
        h0 h0Var5 = h0.f84049a;
        positionedItems.addAll(0, list9);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.m();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[LOOP:0: B:7:0x0015->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[EDGE_INSN: B:27:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:7:0x0015->B:22:0x005b], SYNTHETIC] */
    public final void o() {
        if (this.keyToItemInfoMap.g()) {
            k0<Object, LazyLayoutItemAnimator<T>.b> k0Var = this.keyToItemInfoMap;
            Object[] objArr = k0Var.values;
            long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                for (androidx.compose.foundation.lazy.layout.b bVar : ((b) objArr[(i11 << 3) + i13]).getAnimations()) {
                                    if (bVar != null) {
                                        bVar.y();
                                    }
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            this.keyToItemInfoMap.i();
        }
        this.keyIndexMap = androidx.compose.foundation.lazy.layout.c.INSTANCE;
        this.firstVisibleIndex = -1;
    }
}

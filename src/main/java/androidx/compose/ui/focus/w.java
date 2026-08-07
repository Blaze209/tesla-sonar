package androidx.compose.ui.focus;

import b4.b1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lj3/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILj3/i;Lwn0/l;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILwn0/l;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Lj3/i;ILwn0/l;)Z", "r", "Lb4/j;", "Lt2/b;", "accessibleChildren", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/j;Lt2/b;)V", "focusRect", "j", "(Lt2/b;Lj3/i;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Lj3/i;Lj3/i;Lj3/i;I)Z", "source", "rect1", "rect2", "c", "s", "(Lj3/i;)Lj3/i;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5401a;

        static {
            int[] iArr = new int[i3.p.values().length];
            try {
                iArr[i3.p.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i3.p.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i3.p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5401a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/h$a;", "", "a", "(Lz3/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<z3.h.a, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j3.i f5403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<FocusTargetNode, Boolean> f5405f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, j3.i iVar, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f5402c = focusTargetNode;
            this.f5403d = iVar;
            this.f5404e = i11;
            this.f5405f = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z3.h.a aVar) {
            boolean zR = w.r(this.f5402c, this.f5403d, this.f5404e, this.f5405f);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.E2() != i3.p.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = t.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(j3.i iVar, j3.i iVar2, j3.i iVar3, int i11) {
        if (d(iVar3, i11, iVar) || !d(iVar2, i11, iVar)) {
            return false;
        }
        if (!e(iVar3, i11, iVar)) {
            return true;
        }
        d.Companion companion = d.INSTANCE;
        return d.l(i11, companion.d()) || d.l(i11, companion.g()) || f(iVar2, i11, iVar) < g(iVar3, i11, iVar);
    }

    private static final boolean d(j3.i iVar, int i11, j3.i iVar2) {
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.d()) ? true : d.l(i11, companion.g())) {
            return iVar.getBottom() > iVar2.getTop() && iVar.getTop() < iVar2.getBottom();
        }
        if (d.l(i11, companion.h()) ? true : d.l(i11, companion.a())) {
            return iVar.getRight() > iVar2.getLeft() && iVar.getLeft() < iVar2.getRight();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(j3.i iVar, int i11, j3.i iVar2) {
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.d())) {
            return iVar2.getLeft() >= iVar.getRight();
        }
        if (d.l(i11, companion.g())) {
            return iVar2.getRight() <= iVar.getLeft();
        }
        if (d.l(i11, companion.h())) {
            return iVar2.getTop() >= iVar.getBottom();
        }
        if (d.l(i11, companion.a())) {
            return iVar2.getBottom() <= iVar.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final float f(j3.i iVar, int i11, j3.i iVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f11;
        d.Companion companion = d.INSTANCE;
        if (!d.l(i11, companion.d())) {
            if (d.l(i11, companion.g())) {
                top = iVar.getLeft();
                bottom = iVar2.getRight();
            } else if (d.l(i11, companion.h())) {
                top2 = iVar2.getTop();
                bottom2 = iVar.getBottom();
            } else {
                if (!d.l(i11, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = iVar.getTop();
                bottom = iVar2.getBottom();
            }
            f11 = top - bottom;
            return Math.max(BitmapDescriptorFactory.HUE_RED, f11);
        }
        top2 = iVar2.getLeft();
        bottom2 = iVar.getRight();
        f11 = top2 - bottom2;
        return Math.max(BitmapDescriptorFactory.HUE_RED, f11);
    }

    private static final float g(j3.i iVar, int i11, j3.i iVar2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f11;
        d.Companion companion = d.INSTANCE;
        if (!d.l(i11, companion.d())) {
            if (d.l(i11, companion.g())) {
                bottom = iVar.getRight();
                bottom2 = iVar2.getRight();
            } else if (d.l(i11, companion.h())) {
                top = iVar2.getTop();
                top2 = iVar.getTop();
            } else {
                if (!d.l(i11, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = iVar.getBottom();
                bottom2 = iVar2.getBottom();
            }
            f11 = bottom - bottom2;
            return Math.max(1.0f, f11);
        }
        top = iVar2.getLeft();
        top2 = iVar.getLeft();
        f11 = top - top2;
        return Math.max(1.0f, f11);
    }

    private static final j3.i h(j3.i iVar) {
        return new j3.i(iVar.getRight(), iVar.getBottom(), iVar.getRight(), iVar.getBottom());
    }

    private static final void i(b4.j jVar, t2.b<FocusTargetNode> bVar) {
        int iA = b1.a(1024);
        if (!jVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = jVar.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, jVar.getNode());
        } else {
            bVar2.b(child);
        }
        while (bVar2.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                if (focusTargetNode.getIsAttached() && !b4.k.m(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.C2().getCanFocus()) {
                                        bVar.b(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, bVar);
                                    }
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i11 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
    }

    private static final FocusTargetNode j(t2.b<FocusTargetNode> bVar, j3.i iVar, int i11) {
        j3.i iVarT;
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.d())) {
            iVarT = iVar.t(iVar.o() + 1, BitmapDescriptorFactory.HUE_RED);
        } else if (d.l(i11, companion.g())) {
            iVarT = iVar.t(-(iVar.o() + 1), BitmapDescriptorFactory.HUE_RED);
        } else if (d.l(i11, companion.h())) {
            iVarT = iVar.t(BitmapDescriptorFactory.HUE_RED, iVar.h() + 1);
        } else {
            if (!d.l(i11, companion.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            iVarT = iVar.t(BitmapDescriptorFactory.HUE_RED, -(iVar.h() + 1));
        }
        int size = bVar.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] focusTargetNodeArrM = bVar.m();
            int i12 = 0;
            do {
                FocusTargetNode focusTargetNode2 = focusTargetNodeArrM[i12];
                if (t.g(focusTargetNode2)) {
                    j3.i iVarD = t.d(focusTargetNode2);
                    if (m(iVarD, iVarT, iVar, i11)) {
                        focusTargetNode = focusTargetNode2;
                        iVarT = iVarD;
                    }
                }
                i12++;
            } while (i12 < size);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        j3.i iVarH;
        t2.b bVar = new t2.b(new FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        if (bVar.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (bVar.p() ? null : bVar.m()[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.b())) {
            i11 = companion.g();
        }
        if (d.l(i11, companion.g()) ? true : d.l(i11, companion.a())) {
            iVarH = s(t.d(focusTargetNode));
        } else {
            if (!(d.l(i11, companion.d()) ? true : d.l(i11, companion.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            iVarH = h(t.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(bVar, iVarH, i11);
        if (focusTargetNodeJ != null) {
            return lVar.invoke(focusTargetNodeJ).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, j3.i iVar, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        if (r(focusTargetNode, iVar, i11, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i11, new b(focusTargetNode, iVar, i11, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(j3.i iVar, j3.i iVar2, j3.i iVar3, int i11) {
        if (!n(iVar, i11, iVar3)) {
            return false;
        }
        if (n(iVar2, i11, iVar3) && !c(iVar3, iVar, iVar2, i11)) {
            return !c(iVar3, iVar2, iVar, i11) && q(i11, iVar3, iVar) < q(i11, iVar3, iVar2);
        }
        return true;
    }

    private static final boolean n(j3.i iVar, int i11, j3.i iVar2) {
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.d())) {
            return (iVar2.getRight() > iVar.getRight() || iVar2.getLeft() >= iVar.getRight()) && iVar2.getLeft() > iVar.getLeft();
        }
        if (d.l(i11, companion.g())) {
            return (iVar2.getLeft() < iVar.getLeft() || iVar2.getRight() <= iVar.getLeft()) && iVar2.getRight() < iVar.getRight();
        }
        if (d.l(i11, companion.h())) {
            return (iVar2.getBottom() > iVar.getBottom() || iVar2.getTop() >= iVar.getBottom()) && iVar2.getTop() > iVar.getTop();
        }
        if (d.l(i11, companion.a())) {
            return (iVar2.getTop() < iVar.getTop() || iVar2.getBottom() <= iVar.getTop()) && iVar2.getBottom() < iVar.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final float o(j3.i iVar, int i11, j3.i iVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f11;
        d.Companion companion = d.INSTANCE;
        if (!d.l(i11, companion.d())) {
            if (d.l(i11, companion.g())) {
                top = iVar.getLeft();
                bottom = iVar2.getRight();
            } else if (d.l(i11, companion.h())) {
                top2 = iVar2.getTop();
                bottom2 = iVar.getBottom();
            } else {
                if (!d.l(i11, companion.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = iVar.getTop();
                bottom = iVar2.getBottom();
            }
            f11 = top - bottom;
            return Math.max(BitmapDescriptorFactory.HUE_RED, f11);
        }
        top2 = iVar2.getLeft();
        bottom2 = iVar.getRight();
        f11 = top2 - bottom2;
        return Math.max(BitmapDescriptorFactory.HUE_RED, f11);
    }

    private static final float p(j3.i iVar, int i11, j3.i iVar2) {
        float f11;
        float left;
        float left2;
        float fO;
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.d()) ? true : d.l(i11, companion.g())) {
            f11 = 2;
            left = iVar2.getTop() + (iVar2.h() / f11);
            left2 = iVar.getTop();
            fO = iVar.h();
        } else {
            if (!(d.l(i11, companion.h()) ? true : d.l(i11, companion.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = 2;
            left = iVar2.getLeft() + (iVar2.o() / f11);
            left2 = iVar.getLeft();
            fO = iVar.o();
        }
        return left - (left2 + (fO / f11));
    }

    private static final long q(int i11, j3.i iVar, j3.i iVar2) {
        long jAbs = (long) Math.abs(o(iVar2, i11, iVar));
        long jAbs2 = (long) Math.abs(p(iVar2, i11, iVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, j3.i iVar, int i11, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode focusTargetNodeJ;
        t2.b bVar = new t2.b(new FocusTargetNode[16], 0);
        int iA = b1.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        t2.b bVar2 = new t2.b(new androidx.compose.ui.d.c[16], 0);
        androidx.compose.ui.d.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            b4.k.c(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child);
        }
        while (bVar2.q()) {
            androidx.compose.ui.d.c cVarG = (androidx.compose.ui.d.c) bVar2.v(bVar2.getSize() - 1);
            if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                b4.k.c(bVar2, cVarG);
            } else {
                while (cVarG != null) {
                    if ((cVarG.getKindSet() & iA) != 0) {
                        t2.b bVar3 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
                                if (focusTargetNode2.getIsAttached()) {
                                    bVar.b(focusTargetNode2);
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof b4.m)) {
                                int i12 = 0;
                                for (androidx.compose.ui.d.c delegate = ((b4.m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVarG = delegate;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar3.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar3.b(delegate);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVarG = b4.k.g(bVar3);
                        }
                        break;
                    }
                    cVarG = cVarG.getChild();
                }
            }
        }
        while (bVar.q() && (focusTargetNodeJ = j(bVar, iVar, i11)) != null) {
            if (focusTargetNodeJ.C2().getCanFocus()) {
                return lVar.invoke(focusTargetNodeJ).booleanValue();
            }
            if (l(focusTargetNodeJ, iVar, i11, lVar)) {
                return true;
            }
            bVar.t(focusTargetNodeJ);
        }
        return false;
    }

    private static final j3.i s(j3.i iVar) {
        return new j3.i(iVar.getLeft(), iVar.getTop(), iVar.getLeft(), iVar.getTop());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i11, j3.i iVar, wn0.l<? super FocusTargetNode, Boolean> lVar) {
        i3.p pVarE2 = focusTargetNode.E2();
        int[] iArr = a.f5401a;
        int i12 = iArr[pVarE2.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i11, lVar));
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (focusTargetNode.C2().getCanFocus()) {
                return lVar.invoke(focusTargetNode);
            }
            return iVar == null ? Boolean.valueOf(k(focusTargetNode, i11, lVar)) : Boolean.valueOf(r(focusTargetNode, iVar, i11, lVar));
        }
        FocusTargetNode focusTargetNodeF = t.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i13 = iArr[focusTargetNodeF.E2().ordinal()];
        if (i13 == 1) {
            Boolean boolT = t(focusTargetNodeF, i11, iVar, lVar);
            if (!p013kotlin.jvm.internal.s.f(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (iVar == null) {
                iVar = t.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, iVar, i11, lVar));
        }
        if (i13 == 2 || i13 == 3) {
            if (iVar == null) {
                iVar = t.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, iVar, i11, lVar));
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}

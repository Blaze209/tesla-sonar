package w1;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import k3.g3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p020r2.p1;
import p024x1.m0;
import z3.j0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0013\u001a\u009e\u0002\u0010/\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2*\u0010-\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)\u0012\u0004\u0012\u00020,0(H\u0000ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001ac\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b5\u00106\u001a;\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b8\u00109\u001a\u0093\u0001\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"", "itemsCount", "Lw1/t;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "isVertical", "", "headerIndexes", "Lv1/b$m;", "verticalArrangement", "Lv1/b$e;", "horizontalArrangement", "reverseLayout", "Lw4/d;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lw1/s;", "itemAnimator", "beyondBoundsItemCount", "pinnedItems", "hasLookaheadPassOccurred", "isLookingAhead", "Lw1/p;", "postLookaheadLayoutInfo", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lx1/m0;", "placementScopeInvalidator", "Lk3/g3;", "graphicsContext", "Lkotlin/Function3;", "Lkotlin/Function1;", "Lz3/w0$a;", "Ljn0/h0;", "Lz3/j0;", "layout", "Lw1/r;", "e", "(ILw1/t;IIIIIIFJZLjava/util/List;Lv1/b$m;Lv1/b$e;ZLw4/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLw1/p;Lkotlinx/coroutines/CoroutineScope;Lr2/p1;Lk3/g3;Lwn0/q;)Lw1/r;", "", "visibleItems", "consumedScroll", "lastPostLookaheadLayoutInfo", "c", "(Ljava/util/List;Lw1/t;IILjava/util/List;FZLw1/p;)Ljava/util/List;", "currentFirstItemIndex", DateTokenConverter.CONVERTER_KEY, "(ILw1/t;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLv1/b$m;Lv1/b$e;ZLw4/d;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<s> f120413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f120414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f120415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p1<h0> f120416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<s> list, s sVar, boolean z11, p1<h0> p1Var) {
            super(1);
            this.f120413c = list;
            this.f120414d = sVar;
            this.f120415e = z11;
            this.f120416f = p1Var;
        }

        public final void a(w0.a aVar) {
            List<s> list = this.f120413c;
            s sVar = this.f120414d;
            boolean z11 = this.f120415e;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                s sVar2 = list.get(i11);
                if (sVar2 != sVar) {
                    sVar2.p(aVar, z11);
                }
            }
            s sVar3 = this.f120414d;
            if (sVar3 != null) {
                sVar3.p(aVar, this.f120415e);
            }
            m0.a(this.f120416f);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    private static final List<s> a(List<s> list, List<s> list2, List<s> list3, int i11, int i12, int i13, int i14, int i15, boolean z11, v1.b.m mVar, v1.b.e eVar, boolean z12, w4.d dVar) {
        int i16 = z11 ? i12 : i11;
        boolean z13 = i13 < Math.min(i16, i14);
        if (z13 && i15 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z13) {
            int size = list2.size();
            int mainAxisSizeWithSpacings = i15;
            for (int i17 = 0; i17 < size; i17++) {
                s sVar = list2.get(i17);
                mainAxisSizeWithSpacings -= sVar.getMainAxisSizeWithSpacings();
                sVar.q(mainAxisSizeWithSpacings, i11, i12);
                arrayList.add(sVar);
            }
            int size2 = list.size();
            int mainAxisSizeWithSpacings2 = i15;
            for (int i18 = 0; i18 < size2; i18++) {
                s sVar2 = list.get(i18);
                sVar2.q(mainAxisSizeWithSpacings2, i11, i12);
                arrayList.add(sVar2);
                mainAxisSizeWithSpacings2 += sVar2.getMainAxisSizeWithSpacings();
            }
            int size3 = list3.size();
            for (int i19 = 0; i19 < size3; i19++) {
                s sVar3 = list3.get(i19);
                sVar3.q(mainAxisSizeWithSpacings2, i11, i12);
                arrayList.add(sVar3);
                mainAxisSizeWithSpacings2 += sVar3.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i21 = 0; i21 < size4; i21++) {
                iArr[i21] = list.get(b(i21, z12, size4)).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i22 = 0; i22 < size4; i22++) {
                iArr2[i22] = 0;
            }
            if (z11) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.c(dVar, i16, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                eVar.b(dVar, i16, iArr, w4.t.Ltr, iArr2);
            }
            bo0.h hVarO0 = p013kotlin.collections.n.o0(iArr2);
            if (z12) {
                hVarO0 = bo0.n.t(hVarO0);
            }
            int first = hVarO0.getFirst();
            int last = hVarO0.getLast();
            int step = hVarO0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size5 = iArr2[first];
                    s sVar4 = list.get(b(first, z12, size4));
                    if (z12) {
                        size5 = (i16 - size5) - sVar4.getSize();
                    }
                    sVar4.q(size5, i11, i12);
                    arrayList.add(sVar4);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    private static final List<s> c(List<s> list, t tVar, int i11, int i12, List<Integer> list2, float f11, boolean z11, p pVar) {
        ArrayList arrayList;
        k kVar;
        s sVar;
        s sVar2;
        int mainAxisSizeWithSpacings;
        s sVar3;
        int index;
        int iMin;
        s sVar4;
        s sVar5;
        int i13 = i11 - 1;
        int iMin2 = Math.min(((s) p013kotlin.collections.v.A0(list)).getIndex() + i12, i13);
        int index2 = ((s) p013kotlin.collections.v.A0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i14 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t.e(tVar, i14, 0L, 2, null));
                if (i14 == iMin2) {
                    break;
                }
                i14++;
            }
        } else {
            arrayList = null;
        }
        if (z11 && pVar != null && !pVar.j().isEmpty()) {
            List<k> listJ = pVar.j();
            int size = listJ.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    kVar = null;
                    break;
                }
                if (listJ.get(size).getIndex() > iMin2 && (size == 0 || listJ.get(size - 1).getIndex() <= iMin2)) {
                    kVar = listJ.get(size);
                    break;
                }
            }
            k kVar2 = (k) p013kotlin.collections.v.A0(pVar.j());
            if (kVar != null && (index = kVar.getIndex()) <= (iMin = Math.min(kVar2.getIndex(), i13))) {
                int i15 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size2) {
                                sVar5 = null;
                                break;
                            }
                            sVar5 = arrayList.get(i16);
                            if (sVar5.getIndex() == i15) {
                                break;
                            }
                            i16++;
                        }
                        sVar4 = sVar5;
                    } else {
                        sVar4 = null;
                    }
                    if (sVar4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(t.e(tVar, i15, 0L, 2, null));
                    }
                    if (i15 == iMin) {
                        break;
                    }
                    i15++;
                }
            }
            float viewportEndOffset = ((pVar.getViewportEndOffset() - kVar2.getOffset()) - kVar2.getSize()) - f11;
            if (viewportEndOffset > BitmapDescriptorFactory.HUE_RED) {
                int index3 = kVar2.getIndex() + 1;
                int i17 = 0;
                while (index3 < i11 && i17 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size3) {
                                sVar3 = null;
                                break;
                            }
                            sVar3 = list.get(i18);
                            if (sVar3.getIndex() == index3) {
                                break;
                            }
                            i18++;
                        }
                        sVar = sVar3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size4) {
                                sVar2 = null;
                                break;
                            }
                            sVar2 = arrayList.get(i19);
                            if (sVar2.getIndex() == index3) {
                                break;
                            }
                            i19++;
                        }
                        sVar = sVar2;
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        index3++;
                        mainAxisSizeWithSpacings = sVar.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(t.e(tVar, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((s) p013kotlin.collections.v.A0(arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i17 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((s) p013kotlin.collections.v.A0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((s) p013kotlin.collections.v.A0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i21 = 0; i21 < size5; i21++) {
            int iIntValue = list2.get(i21).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t.e(tVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? p013kotlin.collections.v.m() : arrayList;
    }

    private static final List<s> d(int i11, t tVar, int i12, List<Integer> list) {
        t tVar2;
        int iMax = Math.max(0, i11 - i12);
        int i13 = i11 - 1;
        ArrayList arrayList = null;
        if (iMax <= i13) {
            int i14 = i13;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                tVar2 = tVar;
                arrayList.add(t.e(tVar2, i14, 0L, 2, null));
                if (i14 == iMax) {
                    break;
                }
                i14--;
                tVar = tVar2;
            }
        } else {
            tVar2 = tVar;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i15 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t.e(tVar2, iIntValue, 0L, 2, null));
                }
                if (i15 < 0) {
                    break;
                }
                size = i15;
            }
        }
        return arrayList == null ? p013kotlin.collections.v.m() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0375  */
    public static final r e(int i11, t tVar, int i12, int i13, int i14, int i15, int i16, int i17, float f11, long j11, boolean z11, List<Integer> list, v1.b.m mVar, v1.b.e eVar, boolean z12, w4.d dVar, LazyLayoutItemAnimator<s> lazyLayoutItemAnimator, int i18, List<Integer> list2, boolean z13, boolean z14, p pVar, CoroutineScope coroutineScope, p1<h0> p1Var, g3 g3Var, wn0.q<? super Integer, ? super Integer, ? super wn0.l<? super w0.a, h0>, ? extends j0> qVar) {
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        List<s> list3;
        p021s1.p pVar2;
        int i31;
        int i32 = i13;
        if (i32 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if (i11 <= 0) {
            int iN = w4.b.n(j11);
            int iM = w4.b.m(j11);
            lazyLayoutItemAnimator.m(0, iN, iM, new ArrayList(), tVar.g(), tVar, z11, z14, 1, z13, 0, 0, coroutineScope, g3Var);
            if (!z14) {
                long jI = lazyLayoutItemAnimator.i();
                if (!w4.r.e(jI, w4.r.INSTANCE.a())) {
                    iN = w4.c.i(j11, w4.r.g(jI));
                    iM = w4.c.h(j11, w4.r.f(jI));
                }
            }
            return new r(null, 0, false, BitmapDescriptorFactory.HUE_RED, qVar.invoke(Integer.valueOf(iN), Integer.valueOf(iM), a.f120412c), BitmapDescriptorFactory.HUE_RED, false, coroutineScope, dVar, tVar.getChildConstraints(), p013kotlin.collections.v.m(), -i32, i12 + i14, 0, z12, z11 ? p021s1.p.Vertical : p021s1.p.Horizontal, i14, i15, null);
        }
        int i33 = i16;
        if (i33 >= i11) {
            i33 = i11 - 1;
            i19 = 0;
        } else {
            i19 = i17;
        }
        int iRound = Math.round(f11);
        int i34 = i19 - iRound;
        if (i33 == 0 && i34 < 0) {
            iRound += i34;
            i34 = 0;
        }
        int i35 = iRound;
        p013kotlin.collections.m mVar2 = new p013kotlin.collections.m();
        int i36 = -i32;
        int i37 = (i15 < 0 ? i15 : 0) + i36;
        int mainAxisSizeWithSpacings = i34 + i37;
        int iMax = 0;
        while (mainAxisSizeWithSpacings < 0 && i33 > 0) {
            int i38 = i33 - 1;
            int i39 = i37;
            s sVarE = t.e(tVar, i38, 0L, 2, null);
            mVar2.add(0, sVarE);
            iMax = Math.max(iMax, sVarE.getCrossAxisSize());
            mainAxisSizeWithSpacings = sVarE.getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings;
            i33 = i38;
            i37 = i39;
            i36 = i36;
            i35 = i35;
        }
        int i41 = iMax;
        int i42 = i35;
        int i43 = i36;
        int i44 = mainAxisSizeWithSpacings;
        int i45 = i37;
        if (i44 < i45) {
            i22 = i42 + i44;
            i21 = i45;
        } else {
            i21 = i44;
            i22 = i42;
        }
        int i46 = i21 - i45;
        int i47 = i12 + i14;
        int iF = bo0.n.f(i47, 0);
        int mainAxisSizeWithSpacings2 = -i46;
        int i48 = i33;
        int i49 = 0;
        boolean z15 = false;
        while (i49 < mVar2.size()) {
            if (mainAxisSizeWithSpacings2 >= iF) {
                mVar2.remove(i49);
                z15 = true;
            } else {
                i48++;
                mainAxisSizeWithSpacings2 += ((s) mVar2.get(i49)).getMainAxisSizeWithSpacings();
                i49++;
            }
        }
        int i51 = i33;
        int i52 = i41;
        int mainAxisSizeWithSpacings3 = i46;
        int i53 = mainAxisSizeWithSpacings2;
        boolean z16 = z15;
        int i54 = i47;
        int i55 = i48;
        while (i55 < i11 && (i53 < iF || i53 <= 0 || mVar2.isEmpty())) {
            int i56 = i54;
            int i57 = i53;
            int i58 = iF;
            int i59 = i51;
            int i61 = mainAxisSizeWithSpacings3;
            int i62 = i52;
            s sVarE2 = t.e(tVar, i55, 0L, 2, null);
            int i63 = i55;
            int mainAxisSizeWithSpacings4 = sVarE2.getMainAxisSizeWithSpacings() + i57;
            if (mainAxisSizeWithSpacings4 > i45 || i63 == i11 - 1) {
                int iMax2 = Math.max(i62, sVarE2.getCrossAxisSize());
                mVar2.add(sVarE2);
                mainAxisSizeWithSpacings3 = i61;
                i62 = iMax2;
                i31 = i59;
            } else {
                i31 = i63 + 1;
                mainAxisSizeWithSpacings3 = i61 - sVarE2.getMainAxisSizeWithSpacings();
                z16 = true;
            }
            i53 = mainAxisSizeWithSpacings4;
            i54 = i56;
            i55 = i63 + 1;
            i52 = i62;
            i51 = i31;
            iF = i58;
        }
        int i64 = i54;
        int i65 = i51;
        int i66 = mainAxisSizeWithSpacings3;
        int iMax3 = i52;
        int i67 = i55;
        int i68 = i53;
        if (i68 < i12) {
            int i69 = i12 - i68;
            int i71 = i68 + i69;
            int mainAxisSizeWithSpacings5 = i66 - i69;
            i25 = i65;
            while (mainAxisSizeWithSpacings5 < i32 && i25 > 0) {
                i25--;
                int i72 = mainAxisSizeWithSpacings5;
                s sVarE3 = t.e(tVar, i25, 0L, 2, null);
                mVar2.add(0, sVarE3);
                iMax3 = Math.max(iMax3, sVarE3.getCrossAxisSize());
                mainAxisSizeWithSpacings5 = i72 + sVarE3.getMainAxisSizeWithSpacings();
                i67 = i67;
                i32 = i13;
            }
            i23 = i67;
            int i73 = mainAxisSizeWithSpacings5;
            i24 = 0;
            i26 = i69 + i22;
            if (i73 < 0) {
                i26 += i73;
                int i74 = i71 + i73;
                i28 = 0;
                i27 = i74;
            } else {
                i27 = i71;
                i28 = i73;
            }
        } else {
            i23 = i67;
            i24 = 0;
            i25 = i65;
            i26 = i22;
            i27 = i68;
            i28 = i66;
        }
        float f12 = (yn0.a.a(Math.round(f11)) != yn0.a.a(i26) || Math.abs(Math.round(f11)) < Math.abs(i26)) ? f11 : i26;
        float f13 = f11 - f12;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        if (z14 && i26 > i22 && f13 <= BitmapDescriptorFactory.HUE_RED) {
            f14 = (i26 - i22) + f13;
        }
        float f15 = f14;
        if (i28 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i75 = -i28;
        s sVar = (s) mVar2.first();
        if (i13 > 0 || i15 < 0) {
            int size = mVar2.size();
            int i76 = i24;
            while (i76 < size) {
                int mainAxisSizeWithSpacings6 = ((s) mVar2.get(i76)).getMainAxisSizeWithSpacings();
                if (i28 == 0 || mainAxisSizeWithSpacings6 > i28 || i76 == p013kotlin.collections.v.o(mVar2)) {
                    break;
                }
                i28 -= mainAxisSizeWithSpacings6;
                i76++;
                sVar = (s) mVar2.get(i76);
            }
        }
        t tVar2 = tVar;
        int i77 = i28;
        s sVar2 = sVar;
        List<s> listD = d(i25, tVar2, i18, list2);
        int size2 = listD.size();
        int i78 = 0;
        while (i78 < size2) {
            iMax3 = Math.max(iMax3, listD.get(i78).getCrossAxisSize());
            i78++;
            tVar2 = tVar;
        }
        List<s> listC = c(mVar2, tVar2, i11, i18, list2, f12, z14, pVar);
        int size3 = listC.size();
        for (int i79 = 0; i79 < size3; i79++) {
            iMax3 = Math.max(iMax3, listC.get(i79).getCrossAxisSize());
        }
        boolean z17 = p013kotlin.jvm.internal.s.f(sVar2, mVar2.first()) && listD.isEmpty() && listC.isEmpty();
        int i81 = w4.c.i(j11, z11 ? iMax3 : i27);
        if (z11) {
            iMax3 = i27;
        }
        int iH = w4.c.h(j11, iMax3);
        int i82 = i81;
        float f16 = f12;
        List<s> listA = a(mVar2, listD, listC, i82, iH, i27, i12, i75, z11, mVar, eVar, z12, dVar);
        lazyLayoutItemAnimator.m((int) f16, i82, iH, listA, tVar.g(), tVar, z11, z14, 1, z13, i77, i27, coroutineScope, g3Var);
        int i83 = i27;
        if (z14) {
            i29 = iH;
        } else {
            long jI2 = lazyLayoutItemAnimator.i();
            if (w4.r.e(jI2, w4.r.INSTANCE.a())) {
                i29 = iH;
            } else {
                int i84 = z11 ? iH : i82;
                i82 = w4.c.i(j11, Math.max(i82, w4.r.g(jI2)));
                int iH2 = w4.c.h(j11, Math.max(iH, w4.r.f(jI2)));
                int i85 = z11 ? iH2 : i82;
                if (i85 != i84) {
                    int size4 = listA.size();
                    for (int i86 = 0; i86 < size4; i86++) {
                        listA.get(i86).r(i85);
                    }
                }
                i29 = iH2;
            }
        }
        int i87 = i82;
        s sVarA = !list.isEmpty() ? h.a(listA, tVar, list, i13, i87, i29) : null;
        boolean z18 = i23 < i11 || i83 > i12;
        j0 j0VarInvoke = qVar.invoke(Integer.valueOf(i87), Integer.valueOf(i29), new b(listA, sVarA, z14, p1Var));
        if (!z17) {
            ArrayList arrayList = new ArrayList(listA.size());
            int size5 = listA.size();
            for (int i88 = 0; i88 < size5; i88++) {
                s sVar3 = listA.get(i88);
                s sVar4 = sVar3;
                if ((sVar4.getIndex() >= ((s) mVar2.first()).getIndex() && sVar4.getIndex() <= ((s) mVar2.last()).getIndex()) || sVar4 == sVarA) {
                    arrayList.add(sVar3);
                }
            }
            list3 = arrayList;
        }
        if (z11) {
            list3 = listA;
            pVar2 = p021s1.p.Vertical;
        } else {
            list3 = listA;
            pVar2 = p021s1.p.Horizontal;
        }
        return new r(sVar2, i77, z18, f16, j0VarInvoke, f15, z16, coroutineScope, dVar, tVar.getChildConstraints(), list3, i43, i64, i11, z12, pVar2, i14, i15, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f120412c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }

        public final void a(w0.a aVar) {
        }
    }
}

package p025y1;

import bo0.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.m;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;
import p020r2.p1;
import p021s1.p;
import p024x1.m0;
import p024x1.x;
import t1.j;
import t1.k;
import w4.t;
import wn0.l;
import wn0.q;
import z3.j0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001aì\u0001\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2*\u0010&\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020%0!H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aO\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020,0\"H\u0002¢\u0006\u0004\b.\u0010/\u001aG\u00101\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u00100\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020,0\"H\u0002¢\u0006\u0004\b1\u00102\u001aO\u00106\u001a\u0004\u0018\u00010,2\u0006\u00103\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b6\u00107\u001aj\u0010<\u001a\u00020,*\u00020\u00002\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u0093\u0001\u0010I\u001a\b\u0012\u0004\u0012\u00020,0H*\u00020\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020,0\u00192\f\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\u00192\f\u0010@\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010G\u001a\u00020F2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Lx1/x;", "", "pageCount", "Ly1/r;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Ls1/p;", "orientation", "Ld3/c$c;", "verticalAlignment", "Ld3/c$b;", "horizontalAlignment", "", "reverseLayout", "Lw4/n;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Lt1/j;", "snapPosition", "Lx1/m0;", "placementScopeInvalidator", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function3;", "Lkotlin/Function1;", "Lz3/w0$a;", "Ljn0/h0;", "Lz3/j0;", "layout", "Ly1/u;", "h", "(Lx1/x;ILy1/r;IIIIIIJLs1/p;Ld3/c$c;Ld3/c$b;ZJIILjava/util/List;Lt1/j;Lr2/p1;Lkotlinx/coroutines/CoroutineScope;Lwn0/q;)Ly1/u;", "currentLastPage", "pagesCount", "Ly1/e;", "getAndMeasure", "e", "(IIILjava/util/List;Lwn0/l;)Ljava/util/List;", "currentFirstPage", "f", "(IILjava/util/List;Lwn0/l;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "b", "(ILjava/util/List;IIILt1/j;I)Ly1/e;", "index", "childConstraints", "Lw4/t;", "layoutDirection", "g", "(Lx1/x;IJLy1/r;JLs1/p;Ld3/c$b;Ld3/c$c;Lw4/t;ZI)Ly1/e;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Lw4/d;", "density", "", "c", "(Lx1/x;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILs1/p;ZLw4/d;II)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<e> f124587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<h0> f124588d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<e> list, p1<h0> p1Var) {
            super(1);
            this.f124587c = list;
            this.f124588d = p1Var;
        }

        public final void a(w0.a aVar) {
            List<e> list = this.f124587c;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).g(aVar);
            }
            m0.a(this.f124588d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ly1/e;", "a", "(I)Ly1/e;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<Integer, e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f124590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f124591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f124592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f124593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f124594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d3.c.b f124595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ d3.c.InterfaceC1212c f124596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f124597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f124598k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x xVar, long j11, r rVar, long j12, p pVar, d3.c.b bVar, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, int i11) {
            super(1);
            this.f124590c = xVar;
            this.f124591d = j11;
            this.f124592e = rVar;
            this.f124593f = j12;
            this.f124594g = pVar;
            this.f124595h = bVar;
            this.f124596i = interfaceC1212c;
            this.f124597j = z11;
            this.f124598k = i11;
        }

        public final e a(int i11) {
            x xVar = this.f124590c;
            return s.g(xVar, i11, this.f124591d, this.f124592e, this.f124593f, this.f124594g, this.f124595h, this.f124596i, xVar.getLayoutDirection(), this.f124597j, this.f124598k);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ly1/e;", "a", "(I)Ly1/e;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Integer, e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f124599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f124600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f124601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f124602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f124603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d3.c.b f124604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ d3.c.InterfaceC1212c f124605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f124606j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f124607k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, long j11, r rVar, long j12, p pVar, d3.c.b bVar, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, int i11) {
            super(1);
            this.f124599c = xVar;
            this.f124600d = j11;
            this.f124601e = rVar;
            this.f124602f = j12;
            this.f124603g = pVar;
            this.f124604h = bVar;
            this.f124605i = interfaceC1212c;
            this.f124606j = z11;
            this.f124607k = i11;
        }

        public final e a(int i11) {
            x xVar = this.f124599c;
            return s.g(xVar, i11, this.f124600d, this.f124601e, this.f124602f, this.f124603g, this.f124604h, this.f124605i, xVar.getLayoutDirection(), this.f124606j, this.f124607k);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private static final e b(int i11, List<e> list, int i12, int i13, int i14, j jVar, int i15) {
        e eVar;
        if (list.isEmpty()) {
            eVar = null;
        } else {
            e eVar2 = list.get(0);
            e eVar3 = eVar2;
            float f11 = -Math.abs(k.a(i11, i12, i13, i14, eVar3.getOffset(), eVar3.getIndex(), jVar, i15));
            int iO = v.o(list);
            if (1 <= iO) {
                int i16 = 1;
                while (true) {
                    e eVar4 = list.get(i16);
                    e eVar5 = eVar4;
                    float f12 = -Math.abs(k.a(i11, i12, i13, i14, eVar5.getOffset(), eVar5.getIndex(), jVar, i15));
                    if (Float.compare(f11, f12) < 0) {
                        f11 = f12;
                        eVar2 = eVar4;
                    }
                    if (i16 == iO) {
                        break;
                    }
                    i16++;
                }
            }
            eVar = eVar2;
        }
        return eVar;
    }

    private static final List<e> c(x xVar, List<e> list, List<e> list2, List<e> list3, int i11, int i12, int i13, int i14, int i15, p pVar, boolean z11, w4.d dVar, int i16, int i17) {
        int i18 = i15;
        int i19 = i17 + i16;
        int i21 = pVar == p.Vertical ? i12 : i11;
        boolean z12 = i13 < Math.min(i21, i14);
        if (z12 && i18 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i18).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z12) {
            int size = list2.size();
            int i22 = i18;
            for (int i23 = 0; i23 < size; i23++) {
                e eVar = list2.get(i23);
                i22 -= i19;
                eVar.h(i22, i11, i12);
                arrayList.add(eVar);
            }
            int size2 = list.size();
            for (int i24 = 0; i24 < size2; i24++) {
                e eVar2 = list.get(i24);
                eVar2.h(i18, i11, i12);
                arrayList.add(eVar2);
                i18 += i19;
            }
            int size3 = list3.size();
            for (int i25 = 0; i25 < size3; i25++) {
                e eVar3 = list3.get(i25);
                eVar3.h(i18, i11, i12);
                arrayList.add(eVar3);
                i18 += i19;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i26 = 0; i26 < size4; i26++) {
                iArr[i26] = i17;
            }
            int[] iArr2 = new int[size4];
            for (int i27 = 0; i27 < size4; i27++) {
                iArr2[i27] = 0;
            }
            v1.b.f fVarC = v1.b.a.f117453a.c(xVar.w(i16));
            if (pVar == p.Vertical) {
                fVarC.c(dVar, i21, iArr, iArr2);
            } else {
                fVarC.b(dVar, i21, iArr, t.Ltr, iArr2);
            }
            h hVarO0 = n.o0(iArr2);
            if (z11) {
                hVarO0 = bo0.n.t(hVarO0);
            }
            int first = hVarO0.getFirst();
            int last = hVarO0.getLast();
            int step = hVarO0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size5 = iArr2[first];
                    e eVar4 = list.get(d(first, z11, size4));
                    if (z11) {
                        size5 = (i21 - size5) - eVar4.getSize();
                    }
                    eVar4.h(size5, i11, i12);
                    arrayList.add(eVar4);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int d(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    private static final List<e> e(int i11, int i12, int i13, List<Integer> list, l<? super Integer, e> lVar) {
        int iMin = Math.min(i13 + i11, i12 - 1);
        int i14 = i11 + 1;
        ArrayList arrayList = null;
        if (i14 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i14)));
                if (i14 == iMin) {
                    break;
                }
                i14++;
            }
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iIntValue = list.get(i15).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i12) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? v.m() : arrayList;
    }

    private static final List<e> f(int i11, int i12, List<Integer> list, l<? super Integer, e> lVar) {
        int iMax = Math.max(0, i11 - i12);
        int i13 = i11 - 1;
        ArrayList arrayList = null;
        if (iMax <= i13) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i13)));
                if (i13 == iMax) {
                    break;
                }
                i13--;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = list.get(i14).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? v.m() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e g(x xVar, int i11, long j11, r rVar, long j12, p pVar, d3.c.b bVar, d3.c.InterfaceC1212c interfaceC1212c, t tVar, boolean z11, int i12) {
        return new e(i11, i12, xVar.c0(i11, j11), j12, rVar.c(i11), pVar, bVar, interfaceC1212c, tVar, z11, null);
    }

    public static final u h(x xVar, int i11, r rVar, int i12, int i13, int i14, int i15, int i16, int i17, long j11, p pVar, d3.c.InterfaceC1212c interfaceC1212c, d3.c.b bVar, boolean z11, long j12, int i18, int i19, List<Integer> list, j jVar, p1<h0> p1Var, CoroutineScope coroutineScope, q<? super Integer, ? super Integer, ? super l<? super w0.a, h0>, ? extends j0> qVar) {
        int i21;
        int iMax;
        int i22;
        int i23;
        int i24;
        List<e> arrayList;
        List arrayList2;
        List arrayList3;
        int i25;
        if (i13 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int iF = bo0.n.f(i18 + i15, 0);
        if (i11 <= 0) {
            return new u(v.m(), i18, i15, i14, pVar, -i13, i12 + i14, false, i19, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, jVar, qVar.invoke(Integer.valueOf(w4.b.n(j11)), Integer.valueOf(w4.b.m(j11)), b.f124589c), false, null, null, coroutineScope, 393216, null);
        }
        p pVar2 = pVar;
        p pVar3 = p.Vertical;
        long jB = w4.c.b(0, pVar2 == pVar3 ? w4.b.l(j11) : i18, 0, pVar2 != pVar3 ? w4.b.k(j11) : i18, 5, null);
        int i26 = i16;
        int i27 = i17;
        while (i26 > 0 && i27 > 0) {
            i26--;
            i27 -= iF;
        }
        int i28 = i27 * (-1);
        if (i26 >= i11) {
            i26 = i11 - 1;
            i28 = 0;
        }
        m mVar = new m();
        int i29 = -i13;
        int i31 = (i15 < 0 ? i15 : 0) + i29;
        int i32 = i28 + i31;
        int iMax2 = 0;
        while (i32 < 0 && i26 > 0) {
            int i33 = i26 - 1;
            e eVarG = g(xVar, i33, jB, rVar, j12, pVar2, bVar, interfaceC1212c, xVar.getLayoutDirection(), z11, i18);
            mVar.add(0, eVarG);
            iMax2 = Math.max(iMax2, eVarG.getCrossAxisSize());
            i32 += iF;
            i31 = i31;
            i26 = i33;
            pVar2 = pVar;
        }
        int i34 = i31;
        int i35 = iMax2;
        if (i32 < i34) {
            i32 = i34;
        }
        int i36 = i32 - i34;
        int i37 = i12 + i14;
        int i38 = i26;
        int iF2 = bo0.n.f(i37, 0);
        int i39 = -i36;
        int i41 = i38;
        int i42 = 0;
        boolean z12 = false;
        while (i42 < mVar.size()) {
            if (i39 >= iF2) {
                mVar.remove(i42);
                z12 = true;
            } else {
                i41++;
                i39 += iF;
                i42++;
            }
        }
        int iMax3 = i35;
        int i43 = i41;
        boolean z13 = z12;
        int i44 = i36;
        while (i43 < i11 && (i39 < iF2 || i39 <= 0 || mVar.isEmpty())) {
            int i45 = iF2;
            int i46 = i43;
            e eVarG2 = g(xVar, i46, jB, rVar, j12, pVar, bVar, interfaceC1212c, xVar.getLayoutDirection(), z11, i18);
            int i47 = i44;
            int i48 = i11 - 1;
            i39 += i46 == i48 ? i18 : iF;
            if (i39 > i34 || i46 == i48) {
                iMax3 = Math.max(iMax3, eVarG2.getCrossAxisSize());
                mVar.add(eVarG2);
                i25 = i38;
                i44 = i47;
            } else {
                i25 = i46 + 1;
                i44 = i47 - iF;
                z13 = true;
            }
            i43 = i46 + 1;
            i38 = i25;
            iF2 = i45;
        }
        int i49 = i44;
        if (i39 < i12) {
            int i51 = i12 - i39;
            i22 = i49 - i51;
            i39 += i51;
            iMax = iMax3;
            i23 = i38;
            while (i22 < i13 && i23 > 0) {
                int i52 = i23 - 1;
                e eVarG3 = g(xVar, i52, jB, rVar, j12, pVar, bVar, interfaceC1212c, xVar.getLayoutDirection(), z11, i18);
                mVar.add(0, eVarG3);
                iMax = Math.max(iMax, eVarG3.getCrossAxisSize());
                i22 += iF;
                i43 = i43;
                i23 = i52;
            }
            i21 = i43;
            if (i22 < 0) {
                i39 += i22;
                i22 = 0;
            }
        } else {
            i21 = i43;
            iMax = iMax3;
            i22 = i49;
            i23 = i38;
        }
        if (i22 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i53 = iMax;
        int i54 = -i22;
        e eVar = (e) mVar.first();
        if (i13 > 0 || i15 < 0) {
            int size = mVar.size();
            i24 = i54;
            int i55 = 0;
            while (i55 < size && i22 != 0 && iF <= i22 && i55 != v.o(mVar)) {
                i22 -= iF;
                i55++;
                eVar = (e) mVar.get(i55);
            }
        } else {
            i24 = i54;
        }
        int i56 = i22;
        e eVar2 = eVar;
        List<e> listF = f(i23, i19, list, new d(xVar, jB, rVar, j12, pVar, bVar, interfaceC1212c, z11, i18));
        int size2 = listF.size();
        int iMax4 = i53;
        int i57 = 0;
        while (i57 < size2) {
            iMax4 = Math.max(iMax4, listF.get(i57).getCrossAxisSize());
            i57++;
            listF = listF;
        }
        List<e> list2 = listF;
        List<e> listE = e(((e) mVar.last()).getIndex(), i11, i19, list, new c(xVar, jB, rVar, j12, pVar, bVar, interfaceC1212c, z11, i18));
        int size3 = listE.size();
        for (int i58 = 0; i58 < size3; i58++) {
            iMax4 = Math.max(iMax4, listE.get(i58).getCrossAxisSize());
        }
        boolean z14 = p013kotlin.jvm.internal.s.f(eVar2, mVar.first()) && list2.isEmpty() && listE.isEmpty();
        p pVar4 = p.Vertical;
        int i59 = w4.c.i(j11, pVar == pVar4 ? iMax4 : i39);
        if (pVar == pVar4) {
            iMax4 = i39;
        }
        int iH = w4.c.h(j11, iMax4);
        int i61 = i21;
        int i62 = i39;
        List<e> listC = c(xVar, mVar, list2, listE, i59, iH, i62, i12, i24, pVar, z11, xVar, i15, i18);
        if (z14) {
            arrayList = listC;
        } else {
            arrayList = new ArrayList<>(listC.size());
            int size4 = listC.size();
            int i63 = 0;
            while (i63 < size4) {
                e eVar3 = listC.get(i63);
                e eVar4 = eVar3;
                e eVar5 = eVar2;
                int i64 = i61;
                if (eVar4.getIndex() >= ((e) mVar.first()).getIndex() && eVar4.getIndex() <= ((e) mVar.last()).getIndex()) {
                    arrayList.add(eVar3);
                }
                i63++;
                i61 = i64;
                eVar2 = eVar5;
            }
        }
        e eVar6 = eVar2;
        int i65 = i61;
        if (list2.isEmpty()) {
            arrayList2 = v.m();
        } else {
            arrayList2 = new ArrayList(listC.size());
            int size5 = listC.size();
            for (int i66 = 0; i66 < size5; i66++) {
                e eVar7 = listC.get(i66);
                if (eVar7.getIndex() < ((e) mVar.first()).getIndex()) {
                    arrayList2.add(eVar7);
                }
            }
        }
        List list3 = arrayList2;
        if (listE.isEmpty()) {
            arrayList3 = v.m();
        } else {
            arrayList3 = new ArrayList(listC.size());
            int size6 = listC.size();
            for (int i67 = 0; i67 < size6; i67++) {
                e eVar8 = listC.get(i67);
                if (eVar8.getIndex() > ((e) mVar.last()).getIndex()) {
                    arrayList3.add(eVar8);
                }
            }
        }
        List list4 = arrayList3;
        e eVarB = b(pVar == p.Vertical ? iH : i59, arrayList, i13, i14, iF, jVar, i11);
        return new u(arrayList, i18, i15, i14, pVar, i29, i37, z11, i19, eVar6, eVarB, r4 == 0 ? BitmapDescriptorFactory.HUE_RED : bo0.n.m((jVar.a(i12, i18, i13, i14, eVarB != null ? eVarB.getIndex() : 0, i11) - (eVarB != null ? eVarB.getOffset() : 0)) / iF, -0.5f, 0.5f), i56, i65 < i11 || i62 > i12, jVar, qVar.invoke(Integer.valueOf(i59), Integer.valueOf(iH), new a(listC, p1Var)), z13, list3, list4, coroutineScope);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f124589c = new b();

        b() {
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

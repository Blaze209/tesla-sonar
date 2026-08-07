package z80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p010i90.IdentifierSpec;
import p010i90.SameAsShippingElement;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lz80/a0;", "Li90/b;", "Li90/g0;", "identifier", "", "", "rawValuesMap", "", "countryCodes", "Li90/y;", "countryDropdownFieldController", "Li90/d1;", "sameAsShippingElement", "shippingValuesMap", "Lw80/c;", "collectionMode", "<init>", "(Li90/g0;Ljava/util/Map;Ljava/util/Set;Li90/y;Li90/d1;Ljava/util/Map;Lw80/c;)V", "t", "Lw80/c;", "Lkotlinx/coroutines/flow/StateFlow;", "u", "Lkotlinx/coroutines/flow/StateFlow;", "w", "()Lkotlinx/coroutines/flow/StateFlow;", "hiddenIdentifiers", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a0 extends p010i90.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final w80.c collectionMode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countryCode", "", "Li90/g0;", "a", "(Ljava/lang/String;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<String, Set<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: z80.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C2768a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ EnumEntries<g90.f> f127343a = on0.a.a(g90.f.values());
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f127344a;

            static {
                int[] iArr = new int[w80.c.values().length];
                try {
                    iArr[w80.c.Never.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w80.c.Full.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[w80.c.Automatic.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f127344a = iArr;
            }
        }

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<IdentifierSpec> invoke(String str) {
            int iHashCode;
            int i11 = b.f127344a[a0.this.collectionMode.ordinal()];
            if (i11 == 1) {
                EnumEntries<g90.f> enumEntries = C2768a.f127343a;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(enumEntries, 10));
                Iterator<g90.f> it = enumEntries.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getIdentifierSpec());
                }
                return p013kotlin.collections.v.r1(arrayList);
            }
            if (i11 == 2) {
                return p013kotlin.collections.d1.d();
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (str == null || ((iHashCode = str.hashCode()) == 2142 ? !str.equals("CA") : iHashCode == 2267 ? !str.equals("GB") : !(iHashCode == 2718 && str.equals("US")))) {
                EnumEntries<g90.f> enumEntries2 = C2768a.f127343a;
                ArrayList arrayList2 = new ArrayList();
                for (g90.f fVar : enumEntries2) {
                    if (fVar != g90.f.Name) {
                        arrayList2.add(fVar);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((g90.f) it2.next()).getIdentifierSpec());
                }
                return p013kotlin.collections.v.r1(arrayList3);
            }
            EnumEntries<g90.f> enumEntries3 = C2768a.f127343a;
            ArrayList arrayList4 = new ArrayList();
            for (g90.f fVar2 : enumEntries3) {
                g90.f fVar3 = fVar2;
                if (fVar3 != g90.f.PostalCode && fVar3 != g90.f.Name) {
                    arrayList4.add(fVar2);
                }
            }
            ArrayList arrayList5 = new ArrayList(p013kotlin.collections.v.y(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((g90.f) it3.next()).getIdentifierSpec());
            }
            return p013kotlin.collections.v.r1(arrayList5);
        }
    }

    public /* synthetic */ a0(IdentifierSpec identifierSpec, Map map, Set set, p010i90.y yVar, SameAsShippingElement sameAsShippingElement, Map map2, w80.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Set set2;
        p010i90.y yVar2;
        Map mapI = (i11 & 2) != 0 ? p013kotlin.collections.v0.i() : map;
        Set setD = (i11 & 4) != 0 ? p013kotlin.collections.d1.d() : set;
        if ((i11 & 8) != 0) {
            set2 = setD;
            yVar2 = new p010i90.y(new p010i90.t(set2, null, false, false, null, null, 62, null), (String) mapI.get(IdentifierSpec.INSTANCE.l()));
        } else {
            set2 = setD;
            yVar2 = yVar;
        }
        this(identifierSpec, mapI, set2, yVar2, sameAsShippingElement, map2, (i11 & 64) != 0 ? w80.c.Automatic : cVar);
    }

    public final StateFlow<Set<IdentifierSpec>> w() {
        return this.hiddenIdentifiers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(IdentifierSpec identifier, Map<IdentifierSpec, String> rawValuesMap, Set<String> countryCodes, p010i90.y countryDropdownFieldController, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, w80.c collectionMode) {
        super(identifier, rawValuesMap, new p010i90.i.Normal(null, 1, null), countryCodes, countryDropdownFieldController, sameAsShippingElement, map, null, false, KyberEngine.KyberPolyBytes, null);
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(rawValuesMap, "rawValuesMap");
        p013kotlin.jvm.internal.s.k(countryCodes, "countryCodes");
        p013kotlin.jvm.internal.s.k(countryDropdownFieldController, "countryDropdownFieldController");
        p013kotlin.jvm.internal.s.k(collectionMode, "collectionMode");
        this.collectionMode = collectionMode;
        this.hiddenIdentifiers = r90.g.m(countryDropdownFieldController.x(), new a());
    }
}

package g90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jn0.h0;
import o4.y;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.AdministrativeAreaElement;
import p010i90.IdentifierSpec;
import p010i90.SimpleTextElement;
import p010i90.a1;
import p010i90.j;
import p010i90.j1;
import p010i90.n1;
import p010i90.q1;
import p010i90.r1;
import p010i90.u1;
import p010i90.x0;
import p010i90.z0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wo0.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aF\u0010\u0013\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a6\u0010\u0016\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "Lg90/d;", "", "countryCode", "Li90/j1;", "g", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lg90/f;", "Li90/g0;", "identifierSpec", "", AnnotatedPrivateKey.LABEL, "Lo4/x;", "capitalization", "Lo4/y;", "keyboardType", "", "showOptionalLabel", "Li90/n1;", "f", "(Lg90/f;Li90/g0;IIILjava/lang/String;Z)Li90/n1;", "Li90/u1;", "e", "(Lg90/f;IIILjava/lang/String;)Li90/u1;", "countryAddressElements", "a", "(Ljava/util/List;)Ljava/util/List;", "element1", "element2", DateTokenConverter.CONVERTER_KEY, "(Li90/n1;Li90/n1;)Z", "c", "(Li90/g0;)Z", "Lg90/e;", "fieldSchema", "b", "(Lg90/e;)I", "Lwo0/b;", "Lwo0/b;", "format", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wo0.b f67669a = u.b(null, b.f67671c, 1, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67670a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.AdministrativeArea.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.PostalCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67670a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwo0/d;", "Ljn0/h0;", "a", "(Lwo0/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements l<wo0.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f67671c = new b();

        b() {
            super(1);
        }

        public final void a(wo0.d Json) {
            s.k(Json, "$this$Json");
            Json.h(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(wo0.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    private static final List<j1> a(List<? extends n1> list) {
        List listM = v.m();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            n1 n1Var = (n1) obj;
            if (i12 >= list.size() || !d(list.get(i11), list.get(i12))) {
                listM = v.C0(listM) instanceof a1 ? v.Q0(listM, null) : v.Q0(listM, n1Var);
            } else {
                List listP = v.p(list.get(i11), list.get(i12));
                listM = v.Q0(listM, new a1(IdentifierSpec.INSTANCE.a("row_" + UUID.randomUUID().getLeastSignificantBits()), listP, new z0(listP)));
            }
            i11 = i12;
        }
        return v.l0(listM);
    }

    private static final int b(e eVar) {
        return (eVar == null || !eVar.getIsNumeric()) ? y.INSTANCE.h() : y.INSTANCE.e();
    }

    private static final boolean c(IdentifierSpec identifierSpec) {
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        return s.f(identifierSpec, companion.u()) || s.f(identifierSpec, companion.k());
    }

    private static final boolean d(n1 n1Var, n1 n1Var2) {
        return c(n1Var.getIdentifier()) && c(n1Var2.getIdentifier());
    }

    private static final u1 e(f fVar, int i11, int i12, int i13, String str) {
        return a.f67670a[fVar.ordinal()] == 2 ? new x0(i11, null, str, 2, null) : new q1(Integer.valueOf(i11), i12, i13, null, 8, null);
    }

    private static final n1 f(f fVar, IdentifierSpec identifierSpec, int i11, int i12, int i13, String str, boolean z11) {
        j.a us2;
        SimpleTextElement simpleTextElement = new SimpleTextElement(identifierSpec, new r1(e(fVar, i11, i12, i13, str), z11, null, 4, null));
        if (a.f67670a[fVar.ordinal()] != 1 || !v.p("CA", "US").contains(str)) {
            return simpleTextElement;
        }
        if (s.f(str, "CA")) {
            us2 = new j.a.Canada(0, null, 3, null);
        } else {
            if (!s.f(str, "US")) {
                throw new IllegalArgumentException();
            }
            us2 = new j.a.US(0, null, 3, null);
        }
        return new AdministrativeAreaElement(identifierSpec, new p010i90.y(new j(us2), null, 2, null));
    }

    public static final List<j1> g(List<d> list, String countryCode) {
        String str;
        n1 n1VarF;
        g nameType;
        s.k(list, "<this>");
        s.k(countryCode, "countryCode");
        ArrayList<d> arrayList = new ArrayList();
        for (Object obj : list) {
            d dVar = (d) obj;
            if (dVar.getType() != f.SortingCode && dVar.getType() != f.DependentLocality) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (d dVar2 : arrayList) {
            f type = dVar2.getType();
            if (type != null) {
                IdentifierSpec identifierSpec = dVar2.getType().getIdentifierSpec();
                e schema = dVar2.getSchema();
                str = countryCode;
                n1VarF = f(type, identifierSpec, (schema == null || (nameType = schema.getNameType()) == null) ? dVar2.getType().getDefaultLabel() : nameType.getStringResId(), dVar2.getType().mo385capitalizationIUNYP9k(), b(dVar2.getSchema()), str, !dVar2.getRequired());
            } else {
                str = countryCode;
                n1VarF = null;
            }
            if (n1VarF != null) {
                arrayList2.add(n1VarF);
            }
            countryCode = str;
        }
        return a(arrayList2);
    }
}

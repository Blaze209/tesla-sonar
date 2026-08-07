package po0;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lpo0/s;", "Output", "Lpo0/n;", "", "", "strings", "Lpo0/a;", "setter", "whatThisExpects", "<init>", "(Ljava/util/Collection;Lpo0/a;Ljava/lang/String;)V", PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lpo0/j;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "Lpo0/a;", "b", "Ljava/lang/String;", "Lpo0/s$a;", "c", "Lpo0/s$a;", "trie", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s<Output> implements n<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final po0.a<Output, String> setter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String whatThisExpects;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a trie;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR)\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpo0/s$a;", "", "", "Lkotlin/Pair;", "", "children", "", "isTerminal", "<init>", "(Ljava/util/List;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "c", "(Z)V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<String, a>> children;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isTerminal;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final List<Pair<String, a>> a() {
            return this.children;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTerminal() {
            return this.isTerminal;
        }

        public final void c(boolean z11) {
            this.isTerminal = z11;
        }

        public a(List<Pair<String, a>> children, boolean z11) {
            p013kotlin.jvm.internal.s.k(children, "children");
            this.children = children;
            this.isTerminal = z11;
        }

        public /* synthetic */ a(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d((String) ((Pair) t11).e(), (String) ((Pair) t12).e());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<Output> f103527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f103528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f103529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l0 f103530f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s<Output> sVar, CharSequence charSequence, int i11, l0 l0Var) {
            super(0);
            this.f103527c = sVar;
            this.f103528d = charSequence;
            this.f103529e = i11;
            this.f103530f = l0Var;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Expected " + ((s) this.f103527c).whatThisExpects + " but got " + this.f103528d.subSequence(this.f103529e, this.f103530f.f86527a).toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "b", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.l<Pair<? extends String, ? extends a>, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparable f103531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Comparable comparable) {
            super(1);
            this.f103531c = comparable;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Pair<? extends String, ? extends a> pair) {
            return Integer.valueOf(mn0.a.d(pair.e(), this.f103531c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Collection<String> strings, po0.a<? super Output, String> setter, String whatThisExpects) {
        p013kotlin.jvm.internal.s.k(strings, "strings");
        p013kotlin.jvm.internal.s.k(setter, "setter");
        p013kotlin.jvm.internal.s.k(whatThisExpects, "whatThisExpects");
        this.setter = setter;
        this.whatThisExpects = whatThisExpects;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z11 = false;
        int i11 = 3;
        this.trie = new a(null, z11, i11, 0 == true ? 1 : 0);
        for (String str : strings) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.whatThisExpects).toString());
            }
            a aVarF = this.trie;
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                List<Pair<String, a>> listA = aVarF.a();
                int iJ = v.j(listA, 0, listA.size(), new d(String.valueOf(cCharAt)));
                if (iJ < 0) {
                    a aVar = new a(objArr2 == true ? 1 : 0, z11, i11, objArr == true ? 1 : 0);
                    aVarF.a().add((-iJ) - 1, x.a(String.valueOf(cCharAt), aVar));
                    aVarF = aVar;
                } else {
                    aVarF = aVarF.a().get(iJ).f();
                }
            }
            if (aVarF.getIsTerminal()) {
                throw new IllegalArgumentException(("The string '" + str + "' was passed several times").toString());
            }
            aVarF.c(true);
        }
        b(this.trie);
    }

    private static final void b(a aVar) {
        Iterator<Pair<String, a>> it = aVar.a().iterator();
        while (it.hasNext()) {
            b(it.next().b());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, a> pair : aVar.a()) {
            String strA = pair.a();
            a aVarB = pair.b();
            if (aVarB.getIsTerminal() || aVarB.a().size() != 1) {
                arrayList.add(x.a(strA, aVarB));
            } else {
                Pair pair2 = (Pair) v.U0(aVarB.a());
                String str = (String) pair2.a();
                arrayList.add(x.a(strA + str, (a) pair2.b()));
            }
        }
        aVar.a().clear();
        aVar.a().addAll(v.a1(arrayList, new b()));
    }

    @Override // po0.n
    public Object a(Output storage, CharSequence input, int startIndex) {
        String strA;
        a aVarB;
        CharSequence charSequence;
        p013kotlin.jvm.internal.s.k(input, "input");
        a aVar = this.trie;
        l0 l0Var = new l0();
        l0Var.f86527a = startIndex;
        Integer numValueOf = null;
        loop0: while (l0Var.f86527a <= input.length()) {
            if (aVar.getIsTerminal()) {
                numValueOf = Integer.valueOf(l0Var.f86527a);
            }
            Iterator<Pair<String, a>> it = aVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Pair<String, a> next = it.next();
                strA = next.a();
                aVarB = next.b();
                charSequence = input;
                if (p013kotlin.text.t.k1(charSequence, strA, l0Var.f86527a, false, 4, null)) {
                    break;
                }
                input = charSequence;
            }
            l0Var.f86527a += strA.length();
            aVar = aVarB;
            input = charSequence;
        }
        CharSequence charSequence2 = input;
        return numValueOf != null ? o.c(this.setter, storage, charSequence2.subSequence(startIndex, numValueOf.intValue()).toString(), startIndex, numValueOf.intValue()) : j.INSTANCE.a(startIndex, new c(this, charSequence2, startIndex, l0Var));
    }
}

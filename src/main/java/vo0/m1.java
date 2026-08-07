package vo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b3\u0010+R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u000108058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010>R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010@R%\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0001058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010+R\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010W¨\u0006Y"}, d2 = {"Lvo0/m1;", "Lto0/f;", "Lvo0/l;", "", "serialName", "Lvo0/e0;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lvo0/e0;I)V", "", "q", "()Ljava/util/Map;", "name", "", "isOptional", "Ljn0/h0;", "o", "(Ljava/lang/String;Z)V", "", "annotation", "v", "(Ljava/lang/annotation/Annotation;)V", "a", "w", "index", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "", "g", "(I)Ljava/util/List;", "f", "(I)Ljava/lang/String;", "c", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "h", "b", "Lvo0/e0;", "I", "e", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lro0/d;", "j", "Lkotlin/Lazy;", "s", "()[Lro0/d;", "childSerializers", "k", "t", "()[Lto0/f;", "typeParameterDescriptors", "l", "u", "_hashCode", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class m1 implements to0.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0<?> generatedSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int added;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] names;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] propertiesAnnotations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Annotation> classAnnotations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementsOptionality;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Map<String, Integer> indices;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy childSerializers;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy typeParameterDescriptors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy _hashCode;

    public m1(String serialName, e0<?> e0Var, int i11) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = e0Var;
        this.elementsCount = i11;
        this.added = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i13 = this.elementsCount;
        this.propertiesAnnotations = new List[i13];
        this.elementsOptionality = new boolean[i13];
        this.indices = p013kotlin.collections.v0.i();
        jn0.p pVar = jn0.p.PUBLICATION;
        this.childSerializers = jn0.m.a(pVar, new wn0.a() { // from class: vo0.j1
            @Override // wn0.a
            public final Object invoke() {
                return m1.r(this.f119634a);
            }
        });
        this.typeParameterDescriptors = jn0.m.a(pVar, new wn0.a() { // from class: vo0.k1
            @Override // wn0.a
            public final Object invoke() {
                return m1.y(this.f119639a);
            }
        });
        this._hashCode = jn0.m.a(pVar, new wn0.a() { // from class: vo0.l1
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(m1.n(this.f119642a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(m1 m1Var) {
        return n1.a(m1Var, m1Var.t());
    }

    public static /* synthetic */ void p(m1 m1Var, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m1Var.o(str, z11);
    }

    private final Map<String, Integer> q() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i11 = 0; i11 < length; i11++) {
            map.put(this.names[i11], Integer.valueOf(i11));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro0.d[] r(m1 m1Var) {
        ro0.d<?>[] dVarArrChildSerializers;
        e0<?> e0Var = m1Var.generatedSerializer;
        return (e0Var == null || (dVarArrChildSerializers = e0Var.childSerializers()) == null) ? o1.f119667a : dVarArrChildSerializers;
    }

    private final ro0.d<?>[] s() {
        return (ro0.d[]) this.childSerializers.getValue();
    }

    private final int u() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x(m1 m1Var, int i11) {
        return m1Var.f(i11) + ": " + m1Var.d(i11).getSerialName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f[] y(m1 m1Var) {
        ArrayList arrayList;
        ro0.d<?>[] dVarArrTypeParametersSerializers;
        e0<?> e0Var = m1Var.generatedSerializer;
        if (e0Var == null || (dVarArrTypeParametersSerializers = e0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(dVarArrTypeParametersSerializers.length);
            for (ro0.d<?> dVar : dVarArrTypeParametersSerializers) {
                arrayList.add(dVar.getDescriptor());
            }
        }
        return g1.b(arrayList);
    }

    @Override // vo0.l
    public Set<String> a() {
        return this.indices.keySet();
    }

    @Override // to0.f
    public boolean b() {
        return to0.f.a.c(this);
    }

    @Override // to0.f
    public int c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // to0.f
    public to0.f d(int index) {
        return s()[index].getDescriptor();
    }

    @Override // to0.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m1)) {
            return false;
        }
        to0.f fVar = (to0.f) other;
        if (!p013kotlin.jvm.internal.s.f(getSerialName(), fVar.getSerialName()) || !Arrays.equals(t(), ((m1) other).t()) || getElementsCount() != fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!p013kotlin.jvm.internal.s.f(d(i11).getSerialName(), fVar.d(i11).getSerialName()) || !p013kotlin.jvm.internal.s.f(d(i11).getKind(), fVar.d(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // to0.f
    public String f(int index) {
        return this.names[index];
    }

    @Override // to0.f
    public List<Annotation> g(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    @Override // to0.f
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    @Override // to0.f
    public to0.n getKind() {
        return to0.o.a.f114906a;
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return u();
    }

    @Override // to0.f
    public boolean i(int index) {
        return this.elementsOptionality[index];
    }

    @Override // to0.f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return to0.f.a.b(this);
    }

    public final void o(String name, boolean isOptional) {
        p013kotlin.jvm.internal.s.k(name, "name");
        String[] strArr = this.names;
        int i11 = this.added + 1;
        this.added = i11;
        strArr[i11] = name;
        this.elementsOptionality[i11] = isOptional;
        this.propertiesAnnotations[i11] = null;
        if (i11 == this.elementsCount - 1) {
            this.indices = q();
        }
    }

    public final to0.f[] t() {
        return (to0.f[]) this.typeParameterDescriptors.getValue();
    }

    public String toString() {
        return p013kotlin.collections.v.y0(bo0.n.w(0, this.elementsCount), ", ", getSerialName() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new wn0.l() { // from class: vo0.i1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m1.x(this.f119629a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final void v(Annotation annotation) {
        p013kotlin.jvm.internal.s.k(annotation, "annotation");
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void w(Annotation a11) {
        p013kotlin.jvm.internal.s.k(a11, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        p013kotlin.jvm.internal.s.h(list);
        list.add(a11);
    }

    public /* synthetic */ m1(String str, e0 e0Var, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : e0Var, i11);
    }
}

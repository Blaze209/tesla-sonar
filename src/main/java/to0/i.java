package to0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import vo0.g1;
import vo0.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010\"R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b%\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00109R\u001b\u0010I\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\"¨\u0006J"}, d2 = {"Lto0/i;", "Lto0/f;", "Lvo0/l;", "", "serialName", "Lto0/n;", "kind", "", "elementsCount", "", "typeParameters", "Lto0/a;", "builder", "<init>", "(Ljava/lang/String;Lto0/n;ILjava/util/List;Lto0/a;)V", "index", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "g", "(I)Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "b", "Lto0/n;", "getKind", "()Lto0/n;", "I", "e", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lto0/f;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Lkotlin/Lazy;", "m", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements f, vo0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n kind;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation> annotations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String[] elementNames;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f[] elementDescriptors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] elementAnnotations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementOptionality;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> name2Index;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f[] typeParametersDescriptors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy _hashCode;

    public i(String serialName, n kind, int i11, List<? extends f> typeParameters, a builder) {
        s.k(serialName, "serialName");
        s.k(kind, "kind");
        s.k(typeParameters, "typeParameters");
        s.k(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i11;
        this.annotations = builder.c();
        this.serialNames = v.k1(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = g1.b(builder.e());
        this.elementAnnotations = (List[]) builder.d().toArray(new List[0]);
        this.elementOptionality = v.f1(builder.g());
        Iterable<IndexedValue> iterableK1 = p013kotlin.collections.n.K1(strArr);
        ArrayList arrayList = new ArrayList(v.y(iterableK1, 10));
        for (IndexedValue indexedValue : iterableK1) {
            arrayList.add(x.a(indexedValue.d(), Integer.valueOf(indexedValue.c())));
        }
        this.name2Index = v0.y(arrayList);
        this.typeParametersDescriptors = g1.b(typeParameters);
        this._hashCode = jn0.m.b(new wn0.a() { // from class: to0.g
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(i.l(this.f114884a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(i iVar) {
        return n1.a(iVar, iVar.typeParametersDescriptors);
    }

    private final int m() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence n(i iVar, int i11) {
        return iVar.f(i11) + ": " + iVar.d(i11).getSerialName();
    }

    @Override // vo0.l
    public Set<String> a() {
        return this.serialNames;
    }

    @Override // to0.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // to0.f
    public int c(String name) {
        s.k(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // to0.f
    public f d(int index) {
        return this.elementDescriptors[index];
    }

    @Override // to0.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        f fVar = (f) other;
        if (!s.f(getSerialName(), fVar.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((i) other).typeParametersDescriptors) || getElementsCount() != fVar.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            if (!s.f(d(i11).getSerialName(), fVar.d(i11).getSerialName()) || !s.f(d(i11).getKind(), fVar.d(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // to0.f
    public String f(int index) {
        return this.elementNames[index];
    }

    @Override // to0.f
    public List<Annotation> g(int index) {
        return this.elementAnnotations[index];
    }

    @Override // to0.f
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // to0.f
    public n getKind() {
        return this.kind;
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return m();
    }

    @Override // to0.f
    public boolean i(int index) {
        return this.elementOptionality[index];
    }

    @Override // to0.f
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return f.a.b(this);
    }

    public String toString() {
        return v.y0(bo0.n.w(0, getElementsCount()), ", ", getSerialName() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new wn0.l() { // from class: to0.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return i.n(this.f114885a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}

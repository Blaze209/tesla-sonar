package vo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lvo0/x;", "Lvo0/m1;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lto0/f;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lto0/n;", "m", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "", "n", "Lkotlin/Lazy;", "B", "()[Lto0/f;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final to0.n kind;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy elementDescriptors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(final String name, final int i11) {
        super(name, null, i11, 2, null);
        p013kotlin.jvm.internal.s.k(name, "name");
        this.kind = to0.n.b.f114905a;
        this.elementDescriptors = jn0.m.b(new wn0.a() { // from class: vo0.w
            @Override // wn0.a
            public final Object invoke() {
                return x.A(i11, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f[] A(int i11, String str, x xVar) {
        to0.f[] fVarArr = new to0.f[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fVarArr[i12] = to0.m.h(str + CoreConstants.DOT + xVar.f(i12), to0.o.d.f114909a, new to0.f[0], null, 8, null);
        }
        return fVarArr;
    }

    private final to0.f[] B() {
        return (to0.f[]) this.elementDescriptors.getValue();
    }

    @Override // vo0.m1, to0.f
    public to0.f d(int index) {
        return B()[index];
    }

    @Override // vo0.m1
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof to0.f)) {
            return false;
        }
        to0.f fVar = (to0.f) other;
        return fVar.getKind() == to0.n.b.f114905a && p013kotlin.jvm.internal.s.f(getSerialName(), fVar.getSerialName()) && p013kotlin.jvm.internal.s.f(g1.a(this), g1.a(fVar));
    }

    @Override // vo0.m1, to0.f
    public to0.n getKind() {
        return this.kind;
    }

    @Override // vo0.m1
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = to0.j.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i11 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i11 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // vo0.m1
    public String toString() {
        return p013kotlin.collections.v.y0(to0.j.b(this), ", ", getSerialName() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, null, 56, null);
    }
}

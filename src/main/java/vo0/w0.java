package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvo0/w0;", "Lvo0/c2;", "", "<init>", "()V", "Lto0/f;", "", "index", "g0", "(Lto0/f;I)Ljava/lang/String;", "nestedName", "h0", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "f0", "parentName", "childName", "e0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i0", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class w0 extends c2<String> {
    protected abstract String e0(String parentName, String childName);

    protected String f0(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return descriptor.f(index);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(to0.f fVar, int i11) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        return h0(f0(fVar, i11));
    }

    protected final String h0(String nestedName) {
        p013kotlin.jvm.internal.s.k(nestedName, "nestedName");
        String strY = Y();
        if (strY == null) {
            strY = "";
        }
        return e0(strY, nestedName);
    }

    protected final String i0() {
        return a0().isEmpty() ? "$" : p013kotlin.collections.v.y0(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}

package to0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo0.u1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"$\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lyo0/c;", "Lto0/f;", "descriptor", "b", "(Lyo0/c;Lto0/f;)Lto0/f;", "Lco0/d;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Lto0/f;Lco0/d;)Lto0/f;", "a", "(Lto0/f;)Lco0/d;", "getCapturedKClass$annotations", "(Lto0/f;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final co0.d<?> a(f fVar) {
        s.k(fVar, "<this>");
        if (fVar instanceof ContextDescriptor) {
            return ((ContextDescriptor) fVar).kClass;
        }
        if (fVar instanceof u1) {
            return a(((u1) fVar).getOriginal());
        }
        return null;
    }

    public static final f b(yo0.c cVar, f descriptor) {
        ro0.d dVarC;
        s.k(cVar, "<this>");
        s.k(descriptor, "descriptor");
        co0.d<?> dVarA = a(descriptor);
        if (dVarA == null || (dVarC = yo0.c.c(cVar, dVarA, null, 2, null)) == null) {
            return null;
        }
        return dVarC.getDescriptor();
    }

    public static final f c(f fVar, co0.d<?> context) {
        s.k(fVar, "<this>");
        s.k(context, "context");
        return new ContextDescriptor(fVar, context);
    }
}

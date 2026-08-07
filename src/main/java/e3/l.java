package e3;

import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Le3/l;", "", "<init>", "()V", "Le3/k;", "autofillNode", "Ljn0/h0;", "c", "(Le3/k;)V", "", "id", "", "value", "b", "(ILjava/lang/String;)Ljn0/h0;", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, k> children = new LinkedHashMap();

    public final Map<Integer, k> a() {
        return this.children;
    }

    public final h0 b(int id2, String value) {
        wn0.l<String, h0> lVarF;
        k kVar = this.children.get(Integer.valueOf(id2));
        if (kVar == null || (lVarF = kVar.f()) == null) {
            return null;
        }
        lVarF.invoke(value);
        return h0.f84049a;
    }

    public final void c(k autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}

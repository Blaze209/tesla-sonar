package np0;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnp0/a;", "Ljp0/b;", "<init>", "()V", "", "", "b", "(Ljava/lang/Object;)Z", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95284a = new a();

    private a() {
    }

    private final boolean b(Object obj) {
        if (obj != null) {
            return (obj instanceof String) && ((CharSequence) obj).length() == 0;
        }
        return true;
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Object> f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!f95284a.b(c.f95286a.f(obj, data))) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

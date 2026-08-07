package ec;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import rc.ImageRequest;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lec/l;", "Lec/l$c;", Action.KEY_ATTRIBUTE, "c", "(Lec/l;Lec/l$c;)Ljava/lang/Object;", "Lrc/g;", "a", "(Lrc/g;Lec/l$c;)Ljava/lang/Object;", "Lrc/n;", "b", "(Lrc/n;Lec/l$c;)Ljava/lang/Object;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final <T> T a(ImageRequest imageRequest, Extras.c<T> cVar) {
        T t11 = (T) imageRequest.getExtras().c(cVar);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) imageRequest.getDefaults().getExtras().c(cVar);
        return t12 == null ? cVar.a() : t12;
    }

    public static final <T> T b(Options options, Extras.c<T> cVar) {
        T t11 = (T) options.getExtras().c(cVar);
        return t11 == null ? cVar.a() : t11;
    }

    public static final <T> T c(Extras extras, Extras.c<T> cVar) {
        T t11 = (T) extras.c(cVar);
        return t11 == null ? cVar.a() : t11;
    }
}

package a30;

import org.slf4j.Marker;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La30/g;", "", "", "a", "()Ljava/lang/String;", "compatibilityKey", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f140a;

    /* JADX INFO: renamed from: a30.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La30/g$a;", "", "<init>", "()V", "value", "", "name", "a", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f140a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ String b(Companion companion, Object obj, String str, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            return companion.a(obj, str);
        }

        public final String a(Object value, String name) {
            p013kotlin.jvm.internal.s.k(value, "value");
            p013kotlin.jvm.internal.s.k(name, "name");
            g gVar = value instanceof g ? (g) value : null;
            String strA = gVar != null ? gVar.a() : null;
            if (strA == null) {
                strA = value.getClass().getName();
            }
            return p013kotlin.jvm.internal.s.t(strA, name.length() == 0 ? "" : p013kotlin.jvm.internal.s.t(Marker.ANY_NON_NULL_MARKER, name));
        }
    }

    String a();
}

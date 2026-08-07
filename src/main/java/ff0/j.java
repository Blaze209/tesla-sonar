package ff0;

import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.g2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lff0/j;", "", "", "bitmask", "<init>", "(I)V", "a", "I", "()I", "b", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int bitmask;

    /* JADX INFO: renamed from: ff0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lff0/j$a;", "", "<init>", "()V", "", "Lvc0/g2$c;", "permissions", "Lff0/j;", "a", "(Ljava/util/Set;)Lff0/j;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Set<? extends g2.c> permissions) {
            s.k(permissions, "permissions");
            Iterator<T> it = permissions.iterator();
            int value = 0;
            while (it.hasNext()) {
                value |= 1 << ((g2.c) it.next()).getValue();
            }
            return new j(value, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ j(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBitmask() {
        return this.bitmask;
    }

    private j(int i11) {
        this.bitmask = i11;
    }
}

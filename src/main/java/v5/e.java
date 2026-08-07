package v5;

import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lv5/e;", "", "<init>", "()V", "a", "b", "c", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv5/e$a;", "Lv5/e;", "Lv5/k;", Kind.DEVICE, "<init>", "(Lv5/k;)V", "a", "Lv5/k;", "getDevice", "()Lv5/k;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k device;

        public a(k device) {
            s.k(device, "device");
            this.device = device;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv5/e$b;", "Lv5/e;", "Lv5/k;", Kind.DEVICE, "<init>", "(Lv5/k;)V", "a", "Lv5/k;", "getDevice", "()Lv5/k;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k device;

        public b(k device) {
            s.k(device, "device");
            this.device = device;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv5/e$c;", "Lv5/e;", "Lv5/k;", Kind.DEVICE, "Lv5/d;", "position", "<init>", "(Lv5/k;Lv5/d;)V", "a", "Lv5/k;", "getDevice", "()Lv5/k;", "b", "Lv5/d;", "()Lv5/d;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k device;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d position;

        public c(k device, d position) {
            s.k(device, "device");
            s.k(position, "position");
            this.device = device;
            this.position = position;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getPosition() {
            return this.position;
        }
    }
}

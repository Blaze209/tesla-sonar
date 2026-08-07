package lb;

import java.util.List;
import p013kotlin.Metadata;
import sb.WorkGenerationalId;
import sb.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Llb/y;", "", "Lsb/z;", "id", "Llb/x;", "b", "(Lsb/z;)Llb/x;", "a", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lsb/z;)Z", "Lsb/m0;", "spec", "c", "(Lsb/m0;)Llb/x;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f89911a;

    /* JADX INFO: renamed from: lb.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llb/y$a;", "", "<init>", "()V", "", "synchronized", "Llb/y;", "b", "(Z)Llb/y;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f89911a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ y c(Companion companion, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            return companion.b(z11);
        }

        public final y a() {
            return c(this, false, 1, null);
        }

        public final y b(boolean z11) {
            z zVar = new z();
            return z11 ? new a0(zVar) : zVar;
        }
    }

    static y create() {
        return INSTANCE.a();
    }

    static y d(boolean z11) {
        return INSTANCE.b(z11);
    }

    x a(WorkGenerationalId id2);

    x b(WorkGenerationalId id2);

    default x c(sb.m0 spec) {
        p013kotlin.jvm.internal.s.k(spec, "spec");
        return b(v1.a(spec));
    }

    boolean e(WorkGenerationalId id2);

    List<x> remove(String workSpecId);
}

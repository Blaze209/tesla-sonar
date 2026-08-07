package p020r2;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lr2/x;", "", "T", "Lr2/u;", Action.KEY_ATTRIBUTE, "b", "(Lr2/u;)Ljava/lang/Object;", "G1", "a", "Lr2/z1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x {

    /* JADX INFO: renamed from: G1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f106866a;

    /* JADX INFO: renamed from: r2.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lr2/x$a;", "", "<init>", "()V", "Lr2/x;", "b", "Lr2/x;", "a", "()Lr2/x;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f106866a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final x Empty = f.a();

        private Companion() {
        }

        public final x a() {
            return Empty;
        }
    }

    <T> T b(u<T> key);
}

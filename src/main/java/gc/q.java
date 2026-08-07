package gc;

import com.reactnativecommunity.clipboard.ClipboardModule;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lgc/q;", "", "", "mimeType", "Lokio/j;", "source", "", "e", "(Ljava/lang/String;Lokio/j;)Z", "a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f67826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f67823b = new q() { // from class: gc.n
        @Override // gc.q
        public final boolean e(String str, okio.j jVar) {
            return q.g(str, jVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f67824c = new q() { // from class: gc.o
        @Override // gc.q
        public final boolean e(String str, okio.j jVar) {
            return q.c(str, jVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f67825d = new q() { // from class: gc.p
        @Override // gc.q
        public final boolean e(String str, okio.j jVar) {
            return q.f(str, jVar);
        }
    };

    /* JADX INFO: renamed from: gc.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"Lgc/q$a;", "", "<init>", "()V", "Lgc/q;", "IGNORE", "Lgc/q;", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f67826a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean c(String str, okio.j jVar) {
        if (str != null) {
            return p013kotlin.jvm.internal.s.f(str, ClipboardModule.MIMETYPE_JPEG) || p013kotlin.jvm.internal.s.f(str, ClipboardModule.MIMETYPE_WEBP) || p013kotlin.jvm.internal.s.f(str, ClipboardModule.MIMETYPE_HEIC) || p013kotlin.jvm.internal.s.f(str, ClipboardModule.MIMETYPE_HEIF);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean f(String str, okio.j jVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean g(String str, okio.j jVar) {
        return false;
    }

    boolean e(String mimeType, okio.j source);
}

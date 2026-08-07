package p021s1;

import androidx.compose.ui.d;
import b4.x1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Ls1/v;", "Landroidx/compose/ui/d$c;", "Lb4/x1;", "", "enabled", "<init>", "(Z)V", "Ljn0/h0;", "y2", "", "n", "Ljava/lang/Object;", "P0", "()Ljava/lang/Object;", "traverseKey", "<set-?>", "o", "Z", "x2", "()Z", "p", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v extends d.c implements x1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f109631q = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: s1.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls1/v$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public v(boolean z11) {
        this.enabled = z11;
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void y2(boolean enabled) {
        this.enabled = enabled;
    }
}

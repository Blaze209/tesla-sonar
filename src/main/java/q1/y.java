package q1;

import b4.x1;
import b4.y1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lq1/y;", "Landroidx/compose/ui/d$c;", "Lb4/x1;", "Lb4/t;", "<init>", "()V", "Ljn0/h0;", "y2", "", "focused", "z2", "(Z)V", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "n", "Z", "isFocused", "o", "c2", "()Z", "shouldAutoInvalidate", "p", "Lz3/v;", "layoutCoordinates", "Lq1/z;", "x2", "()Lq1/z;", "observer", "", "P0", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y extends androidx.compose.ui.d.c implements x1, b4.t {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f104364r = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private z3.v layoutCoordinates;

    /* JADX INFO: renamed from: q1.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq1/y$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final z x2() {
        if (getIsAttached()) {
            x1 x1VarA = y1.a(this, z.INSTANCE);
            if (x1VarA instanceof z) {
                return (z) x1VarA;
            }
        }
        return null;
    }

    private final void y2() {
        z zVarX2;
        z3.v vVar = this.layoutCoordinates;
        if (vVar != null) {
            p013kotlin.jvm.internal.s.h(vVar);
            if (!vVar.b0() || (zVarX2 = x2()) == null) {
                return;
            }
            zVarX2.x2(this.layoutCoordinates);
        }
    }

    @Override // b4.t
    public void P(z3.v coordinates) {
        this.layoutCoordinates = coordinates;
        if (this.isFocused) {
            if (coordinates.b0()) {
                y2();
                return;
            }
            z zVarX2 = x2();
            if (zVarX2 != null) {
                zVarX2.x2(null);
            }
        }
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0 */
    public Object getTraverseKey() {
        return INSTANCE;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void z2(boolean focused) {
        if (focused == this.isFocused) {
            return;
        }
        if (focused) {
            y2();
        } else {
            z zVarX2 = x2();
            if (zVarX2 != null) {
                zVarX2.x2(null);
            }
        }
        this.isFocused = focused;
    }
}

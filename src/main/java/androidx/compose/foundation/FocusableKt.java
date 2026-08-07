package androidx.compose.foundation;

import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import b4.s0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import q1.t;
import q1.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\n\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "Lu1/l;", "interactionSource", "a", "(Landroidx/compose/ui/d;ZLu1/l;)Landroidx/compose/ui/d;", "Landroidx/compose/ui/platform/n1;", "Landroidx/compose/ui/platform/n1;", "focusGroupInspectorInfo", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "b", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n1 f4174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f4175b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends u implements wn0.l<q1, h0> {
        public a() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("focusGroup");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f4174a = new n1(o1.b() ? new a() : o1.a());
        f4175b = new s0<t>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object other) {
                return this == other;
            }

            public int hashCode() {
                return x.a(this);
            }

            @Override // b4.s0
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public t i() {
                return new t();
            }

            @Override // b4.s0
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public void m(t node) {
            }
        };
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11, u1.l lVar) {
        return dVar.g(z11 ? new FocusableElement(lVar) : androidx.compose.ui.d.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z11, u1.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        return a(dVar, z11, lVar);
    }
}

package kotlin;

import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.r2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i3.f;
import jn0.h0;
import o4.r;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lb2/x;", "Lb2/y;", "Landroidx/compose/ui/platform/r2;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/r2;)V", "Lo4/r;", "imeAction", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(I)V", "a", "Landroidx/compose/ui/platform/r2;", "Lb2/z;", "b", "Lb2/z;", "c", "()Lb2/z;", "f", "(Lb2/z;)V", "keyboardActions", "Li3/f;", "Li3/f;", "()Li3/f;", "e", "(Li3/f;)V", "focusManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r2 keyboardController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public z keyboardActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public f focusManager;

    public x(r2 r2Var) {
        this.keyboardController = r2Var;
    }

    public void a(int imeAction) {
        r.Companion companion = r.INSTANCE;
        if (r.m(imeAction, companion.d())) {
            b().h(d.INSTANCE.e());
            return;
        }
        if (r.m(imeAction, companion.f())) {
            b().h(d.INSTANCE.f());
            return;
        }
        if (!r.m(imeAction, companion.b())) {
            if (r.m(imeAction, companion.c()) ? true : r.m(imeAction, companion.g()) ? true : r.m(imeAction, companion.h()) ? true : r.m(imeAction, companion.a())) {
                return;
            }
            r.m(imeAction, companion.e());
        } else {
            r2 r2Var = this.keyboardController;
            if (r2Var != null) {
                r2Var.hide();
            }
        }
    }

    public final f b() {
        f fVar = this.focusManager;
        if (fVar != null) {
            return fVar;
        }
        s.B("focusManager");
        return null;
    }

    public final z c() {
        z zVar = this.keyboardActions;
        if (zVar != null) {
            return zVar;
        }
        s.B("keyboardActions");
        return null;
    }

    public final void d(int imeAction) {
        l<y, h0> lVarG;
        r.Companion companion = r.INSTANCE;
        h0 h0Var = null;
        if (r.m(imeAction, companion.b())) {
            lVarG = c().b();
        } else if (r.m(imeAction, companion.c())) {
            lVarG = c().c();
        } else if (r.m(imeAction, companion.d())) {
            lVarG = c().d();
        } else if (r.m(imeAction, companion.f())) {
            lVarG = c().e();
        } else if (r.m(imeAction, companion.g())) {
            lVarG = c().f();
        } else if (r.m(imeAction, companion.h())) {
            lVarG = c().g();
        } else {
            if (!(r.m(imeAction, companion.a()) ? true : r.m(imeAction, companion.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            lVarG = null;
        }
        if (lVarG != null) {
            lVarG.invoke(this);
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            a(imeAction);
        }
    }

    public final void e(f fVar) {
        this.focusManager = fVar;
    }

    public final void f(z zVar) {
        this.keyboardActions = zVar;
    }
}

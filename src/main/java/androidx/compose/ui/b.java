package androidx.compose.ui;

import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.r1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.l;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/ui/d$b;", "Landroidx/compose/ui/platform/r1;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "Landroidx/compose/ui/d;", "factory", "<init>", "(Lwn0/l;Lwn0/q;)V", "c", "Lwn0/q;", IntegerTokenConverter.CONVERTER_KEY, "()Lwn0/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class b extends r1 implements d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q<d, l, Integer, d> factory;

    /* JADX WARN: Multi-variable type inference failed */
    public b(wn0.l<? super q1, h0> lVar, q<? super d, ? super l, ? super Integer, ? extends d> qVar) {
        super(lVar);
        this.factory = qVar;
    }

    public final q<d, l, Integer, d> i() {
        return this.factory;
    }
}

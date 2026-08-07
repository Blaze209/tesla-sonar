package androidx.compose.ui.layout;

import b4.a0;
import jn0.h0;
import p013kotlin.Metadata;
import w4.r;
import w4.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/d$c;", "Lb4/a0;", "Lkotlin/Function1;", "Lw4/r;", "Ljn0/h0;", "onSizeChanged", "<init>", "(Lwn0/l;)V", "x2", "size", "D", "(J)V", "n", "Lwn0/l;", "", "o", "Z", "c2", "()Z", "shouldAutoInvalidate", "p", "J", "previousSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f extends androidx.compose.ui.d.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private l<? super r, h0> onSizeChanged;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long previousSize = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public f(l<? super r, h0> lVar) {
        this.onSizeChanged = lVar;
    }

    @Override // b4.a0
    public void D(long size) {
        if (r.e(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(r.b(size));
        this.previousSize = size;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void x2(l<? super r, h0> onSizeChanged) {
        this.onSizeChanged = onSizeChanged;
        this.previousSize = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}

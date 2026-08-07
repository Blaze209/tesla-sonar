package h3;

import b4.r;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lh3/f;", "Landroidx/compose/ui/d$c;", "Lb4/r;", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "onDraw", "<init>", "(Lwn0/l;)V", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "n", "Lwn0/l;", "getOnDraw", "()Lwn0/l;", "x2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends androidx.compose.ui.d.c implements r {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super m3.f, h0> onDraw;

    public f(wn0.l<? super m3.f, h0> lVar) {
        this.onDraw = lVar;
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        this.onDraw.invoke(cVar);
        cVar.M0();
    }

    public final void x2(wn0.l<? super m3.f, h0> lVar) {
        this.onDraw = lVar;
    }
}

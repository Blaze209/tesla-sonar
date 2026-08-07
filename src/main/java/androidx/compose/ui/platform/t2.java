package androidx.compose.ui.platform;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/t2;", "Landroidx/compose/ui/d$c;", "Lb4/s1;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Lg4/y;", "Ljn0/h0;", "G0", "(Lg4/y;)V", "n", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "x2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class t2 extends androidx.compose.ui.d.c implements b4.s1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String tag;

    public t2(String str) {
        this.tag = str;
    }

    @Override // b4.s1
    public void G0(g4.y yVar) {
        g4.v.q0(yVar, this.tag);
    }

    public final void x2(String str) {
        this.tag = str;
    }
}

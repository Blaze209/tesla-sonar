package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb4/v1;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Ljn0/h0;", "h2", "i2", "", "n", "Z", "x2", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v1 extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean attachHasBeenRun;

    public v1() {
        n2(0);
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.attachHasBeenRun = false;
    }

    public String toString() {
        return "<tail>";
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }
}

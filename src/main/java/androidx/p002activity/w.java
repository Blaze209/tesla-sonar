package androidx.p002activity;

import android.view.Window;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/w;", "Landroidx/activity/v;", "<init>", "()V", "Landroid/view/Window;", "window", "Ljn0/h0;", "a", "(Landroid/view/Window;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w extends v {
    @Override // androidx.p002activity.u, androidx.p002activity.x, androidx.p002activity.y
    public void a(Window window) {
        s.k(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}

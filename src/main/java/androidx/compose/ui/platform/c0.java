package androidx.compose.ui.platform;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/c0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lg3/h;", "transferData", "Lg3/a;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Lg3/h;Lg3/a;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f5665a = new c0();

    private c0() {
    }

    public final boolean a(View view, g3.h transferData, g3.a dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}

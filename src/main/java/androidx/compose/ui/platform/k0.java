package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/k0;", "Landroidx/compose/ui/platform/u2;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lj3/i;", "rect", "Lkotlin/Function0;", "Ljn0/h0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "a", "(Lj3/i;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "hide", "()V", "Landroid/view/View;", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "Ld4/c;", "c", "Ld4/c;", "textActionModeCallback", "Landroidx/compose/ui/platform/w2;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/platform/w2;", "getStatus", "()Landroidx/compose/ui/platform/w2;", PermissionsResponse.STATUS_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ActionMode actionMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d4.c textActionModeCallback = new d4.c(new a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private w2 status = w2.Hidden;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        a() {
            super(0);
        }

        public final void b() {
            k0.this.actionMode = null;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    public k0(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.u2
    public void a(j3.i rect, wn0.a<jn0.h0> onCopyRequested, wn0.a<jn0.h0> onPasteRequested, wn0.a<jn0.h0> onCutRequested, wn0.a<jn0.h0> onSelectAllRequested) {
        this.textActionModeCallback.l(rect);
        this.textActionModeCallback.h(onCopyRequested);
        this.textActionModeCallback.i(onCutRequested);
        this.textActionModeCallback.j(onPasteRequested);
        this.textActionModeCallback.k(onSelectAllRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = w2.Shown;
            this.actionMode = v2.f5985a.b(this.view, new d4.a(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.u2
    public w2 getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.u2
    public void hide() {
        this.status = w2.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}

package d4;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import j3.i;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010-R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010-R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010-¨\u00064"}, d2 = {"Ld4/c;", "", "Lkotlin/Function0;", "Ljn0/h0;", "onActionModeDestroy", "Lj3/i;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(Lwn0/a;Lj3/i;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "Landroid/view/Menu;", "menu", "Ld4/b;", "item", "callback", "b", "(Landroid/view/Menu;Ld4/b;Lwn0/a;)V", "Landroid/view/ActionMode;", "mode", "", "e", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "g", "Landroid/view/MenuItem;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "f", "()V", "m", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;Ld4/b;)V", "Lwn0/a;", "getOnActionModeDestroy", "()Lwn0/a;", "Lj3/i;", "c", "()Lj3/i;", "l", "(Lj3/i;)V", "getOnCopyRequested", "h", "(Lwn0/a;)V", "getOnPasteRequested", "j", "getOnCutRequested", IntegerTokenConverter.CONVERTER_KEY, "getOnSelectAllRequested", "k", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onActionModeDestroy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i rect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onCopyRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onPasteRequested;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onCutRequested;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onSelectAllRequested;

    public c(wn0.a<h0> aVar, i iVar, wn0.a<h0> aVar2, wn0.a<h0> aVar3, wn0.a<h0> aVar4, wn0.a<h0> aVar5) {
        this.onActionModeDestroy = aVar;
        this.rect = iVar;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
    }

    private final void b(Menu menu, b item, wn0.a<h0> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            a(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void a(Menu menu, b item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getRect() {
        return this.rect;
    }

    public final boolean d(ActionMode mode, MenuItem item) {
        s.h(item);
        int itemId = item.getItemId();
        if (itemId == b.Copy.getId()) {
            wn0.a<h0> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.getId()) {
            wn0.a<h0> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.getId()) {
            wn0.a<h0> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != b.SelectAll.getId()) {
                return false;
            }
            wn0.a<h0> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean e(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            a(menu, b.Copy);
        }
        if (this.onPasteRequested != null) {
            a(menu, b.Paste);
        }
        if (this.onCutRequested != null) {
            a(menu, b.Cut);
        }
        if (this.onSelectAllRequested == null) {
            return true;
        }
        a(menu, b.SelectAll);
        return true;
    }

    public final void f() {
        wn0.a<h0> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(wn0.a<h0> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void i(wn0.a<h0> aVar) {
        this.onCutRequested = aVar;
    }

    public final void j(wn0.a<h0> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void k(wn0.a<h0> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void l(i iVar) {
        this.rect = iVar;
    }

    public final void m(Menu menu) {
        b(menu, b.Copy, this.onCopyRequested);
        b(menu, b.Paste, this.onPasteRequested);
        b(menu, b.Cut, this.onCutRequested);
        b(menu, b.SelectAll, this.onSelectAllRequested);
    }

    public /* synthetic */ c(wn0.a aVar, i iVar, wn0.a aVar2, wn0.a aVar3, wn0.a aVar4, wn0.a aVar5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? i.INSTANCE.a() : iVar, (i11 & 4) != 0 ? null : aVar2, (i11 & 8) != 0 ? null : aVar3, (i11 & 16) != 0 ? null : aVar4, (i11 & 32) != 0 ? null : aVar5);
    }
}

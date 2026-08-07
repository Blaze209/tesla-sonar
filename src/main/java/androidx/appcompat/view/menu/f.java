package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f2328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f2329d;

    public f(e eVar) {
        this.f2326a = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f2327b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(@NonNull e eVar, boolean z11) {
        if (z11 || eVar == this.f2326a) {
            a();
        }
        j.a aVar = this.f2329d;
        if (aVar != null) {
            aVar.b(eVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(@NonNull e eVar) {
        j.a aVar = this.f2329d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f2326a;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar.w());
        c cVar = new c(aVar.getContext(), i.g.f73835j);
        this.f2328c = cVar;
        cVar.i(this);
        this.f2326a.b(this.f2328c);
        aVar.a(this.f2328c.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.c(viewA);
        } else {
            aVar.d(eVar.y()).setTitle(eVar.z());
        }
        aVar.j(this);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        this.f2327b = bVarCreate;
        bVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2327b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2327b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        this.f2326a.N((g) this.f2328c.a().getItem(i11), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f2328c.b(this.f2326a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2327b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2327b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2326a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2326a.performShortcut(i11, keyEvent, 0);
    }
}

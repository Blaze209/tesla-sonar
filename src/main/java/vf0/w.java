package vf0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes8.dex */
final class w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119301a;

    w(b bVar) {
        this.f119301a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f119301a.f("cancel", null);
    }
}

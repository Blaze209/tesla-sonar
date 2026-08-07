package vf0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes8.dex */
final class x implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119302a;

    x(b bVar) {
        this.f119302a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f119302a.f119262c.dismiss();
    }
}

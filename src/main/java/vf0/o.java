package vf0;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119293a;

    o(b bVar) {
        this.f119293a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f119293a.finish();
    }
}

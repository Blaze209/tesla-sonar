package rj;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f108409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f108410b;

    d(@NonNull Context context, @NonNull b.a aVar) {
        this.f108409a = context.getApplicationContext();
        this.f108410b = aVar;
    }

    private void a() {
        r.a(this.f108409a).d(this.f108410b);
    }

    private void b() {
        r.a(this.f108409a).e(this.f108410b);
    }

    @Override // rj.l
    public void onStart() {
        a();
    }

    @Override // rj.l
    public void onStop() {
        b();
    }

    @Override // rj.l
    public void onDestroy() {
    }
}

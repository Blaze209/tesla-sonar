package hj;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g extends xj.h<dj.e, fj.c<?>> implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f72923e;

    public g(long j11) {
        super(j11);
    }

    @Override // hj.h
    @SuppressLint({"InlinedApi"})
    public void a(int i11) {
        if (i11 >= 40) {
            b();
        } else if (i11 >= 20 || i11 == 15) {
            m(h() / 2);
        }
    }

    @Override // hj.h
    public /* bridge */ /* synthetic */ fj.c c(@NonNull dj.e eVar) {
        return (fj.c) super.l(eVar);
    }

    @Override // hj.h
    public /* bridge */ /* synthetic */ fj.c d(@NonNull dj.e eVar, fj.c cVar) {
        return (fj.c) super.k(eVar, cVar);
    }

    @Override // hj.h
    public void e(@NonNull h.a aVar) {
        this.f72923e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xj.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(fj.c<?> cVar) {
        return cVar == null ? super.i(null) : cVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xj.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(@NonNull dj.e eVar, fj.c<?> cVar) {
        h.a aVar = this.f72923e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.b(cVar);
    }
}

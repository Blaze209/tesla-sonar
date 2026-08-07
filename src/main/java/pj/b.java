package pj;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements bj.a.InterfaceC0349a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f103082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.b f103083b;

    public b(gj.d dVar, gj.b bVar) {
        this.f103082a = dVar;
        this.f103083b = bVar;
    }

    @Override // bj.a.InterfaceC0349a
    @NonNull
    public byte[] a(int i11) {
        gj.b bVar = this.f103083b;
        return bVar == null ? new byte[i11] : (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // bj.a.InterfaceC0349a
    @NonNull
    public Bitmap b(int i11, int i12, @NonNull Bitmap.Config config) {
        return this.f103082a.e(i11, i12, config);
    }

    @Override // bj.a.InterfaceC0349a
    public void c(@NonNull Bitmap bitmap) {
        this.f103082a.c(bitmap);
    }

    @Override // bj.a.InterfaceC0349a
    @NonNull
    public int[] d(int i11) {
        gj.b bVar = this.f103083b;
        return bVar == null ? new int[i11] : (int[]) bVar.c(i11, int[].class);
    }

    @Override // bj.a.InterfaceC0349a
    public void e(@NonNull byte[] bArr) {
        gj.b bVar = this.f103083b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // bj.a.InterfaceC0349a
    public void f(@NonNull int[] iArr) {
        gj.b bVar = this.f103083b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}

package mj;

import androidx.annotation.NonNull;
import fj.c;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f92267a;

    public b(byte[] bArr) {
        this.f92267a = (byte[]) k.d(bArr);
    }

    @Override // fj.c
    @NonNull
    public Class<byte[]> a() {
        return byte[].class;
    }

    @Override // fj.c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f92267a;
    }

    @Override // fj.c
    public int getSize() {
        return this.f92267a.length;
    }

    @Override // fj.c
    public void recycle() {
    }
}

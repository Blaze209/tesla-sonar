package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class t implements dj.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final xj.h<Class<?>, byte[]> f20742j = new xj.h<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.b f20743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj.e f20744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dj.e f20745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f20748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dj.h f20749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dj.l<?> f20750i;

    t(gj.b bVar, dj.e eVar, dj.e eVar2, int i11, int i12, dj.l<?> lVar, Class<?> cls, dj.h hVar) {
        this.f20743b = bVar;
        this.f20744c = eVar;
        this.f20745d = eVar2;
        this.f20746e = i11;
        this.f20747f = i12;
        this.f20750i = lVar;
        this.f20748g = cls;
        this.f20749h = hVar;
    }

    private byte[] c() {
        xj.h<Class<?>, byte[]> hVar = f20742j;
        byte[] bArrG = hVar.g(this.f20748g);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f20748g.getName().getBytes(dj.e.f60683a);
        hVar.k(this.f20748g, bytes);
        return bytes;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f20743b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f20746e).putInt(this.f20747f).array();
        this.f20745d.b(messageDigest);
        this.f20744c.b(messageDigest);
        messageDigest.update(bArr);
        dj.l<?> lVar = this.f20750i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f20749h.b(messageDigest);
        messageDigest.update(c());
        this.f20743b.put(bArr);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f20747f == tVar.f20747f && this.f20746e == tVar.f20746e && xj.l.e(this.f20750i, tVar.f20750i) && this.f20748g.equals(tVar.f20748g) && this.f20744c.equals(tVar.f20744c) && this.f20745d.equals(tVar.f20745d) && this.f20749h.equals(tVar.f20749h)) {
                return true;
            }
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        int iHashCode = (((((this.f20744c.hashCode() * 31) + this.f20745d.hashCode()) * 31) + this.f20746e) * 31) + this.f20747f;
        dj.l<?> lVar = this.f20750i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f20748g.hashCode()) * 31) + this.f20749h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f20744c + ", signature=" + this.f20745d + ", width=" + this.f20746e + ", height=" + this.f20747f + ", decodedResourceClass=" + this.f20748g + ", transformation='" + this.f20750i + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.f20749h + CoreConstants.CURLY_RIGHT;
    }
}

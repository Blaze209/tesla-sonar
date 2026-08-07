package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class d implements dj.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.e f20581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj.e f20582c;

    d(dj.e eVar, dj.e eVar2) {
        this.f20581b = eVar;
        this.f20582c = eVar2;
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        this.f20581b.b(messageDigest);
        this.f20582c.b(messageDigest);
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f20581b.equals(dVar.f20581b) && this.f20582c.equals(dVar.f20582c)) {
                return true;
            }
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return (this.f20581b.hashCode() * 31) + this.f20582c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f20581b + ", signature=" + this.f20582c + CoreConstants.CURLY_RIGHT;
    }
}

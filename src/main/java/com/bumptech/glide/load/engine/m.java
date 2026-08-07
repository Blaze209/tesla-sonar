package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class m implements dj.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?> f20708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f20709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dj.e f20710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, dj.l<?>> f20711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dj.h f20712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20713j;

    m(Object obj, dj.e eVar, int i11, int i12, Map<Class<?>, dj.l<?>> map, Class<?> cls, Class<?> cls2, dj.h hVar) {
        this.f20705b = xj.k.d(obj);
        this.f20710g = (dj.e) xj.k.e(eVar, "Signature must not be null");
        this.f20706c = i11;
        this.f20707d = i12;
        this.f20711h = (Map) xj.k.d(map);
        this.f20708e = (Class) xj.k.e(cls, "Resource class must not be null");
        this.f20709f = (Class) xj.k.e(cls2, "Transcode class must not be null");
        this.f20712i = (dj.h) xj.k.d(hVar);
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f20705b.equals(mVar.f20705b) && this.f20710g.equals(mVar.f20710g) && this.f20707d == mVar.f20707d && this.f20706c == mVar.f20706c && this.f20711h.equals(mVar.f20711h) && this.f20708e.equals(mVar.f20708e) && this.f20709f.equals(mVar.f20709f) && this.f20712i.equals(mVar.f20712i)) {
                return true;
            }
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        if (this.f20713j == 0) {
            int iHashCode = this.f20705b.hashCode();
            this.f20713j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f20710g.hashCode()) * 31) + this.f20706c) * 31) + this.f20707d;
            this.f20713j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f20711h.hashCode();
            this.f20713j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f20708e.hashCode();
            this.f20713j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f20709f.hashCode();
            this.f20713j = iHashCode5;
            this.f20713j = (iHashCode5 * 31) + this.f20712i.hashCode();
        }
        return this.f20713j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f20705b + ", width=" + this.f20706c + ", height=" + this.f20707d + ", resourceClass=" + this.f20708e + ", transcodeClass=" + this.f20709f + ", signature=" + this.f20710g + ", hashCode=" + this.f20713j + ", transformations=" + this.f20711h + ", options=" + this.f20712i + CoreConstants.CURLY_RIGHT;
    }
}

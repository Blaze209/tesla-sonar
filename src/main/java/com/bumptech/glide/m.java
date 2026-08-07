package com.bumptech.glide;

import com.bumptech.glide.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vj.c<? super TranscodeType> f20859a = vj.a.b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    final vj.c<? super TranscodeType> b() {
        return this.f20859a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return xj.l.e(this.f20859a, ((m) obj).f20859a);
        }
        return false;
    }

    public int hashCode() {
        vj.c<? super TranscodeType> cVar = this.f20859a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}

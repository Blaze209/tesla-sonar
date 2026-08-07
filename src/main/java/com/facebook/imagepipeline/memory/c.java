package com.facebook.imagepipeline.memory;

import pk.k;
import tk.h;
import xm.a0;
import xm.u;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<byte[]> f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f21713b;

    class a implements h<byte[]> {
        a() {
        }

        @Override // tk.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            c.this.b(bArr);
        }
    }

    static class b extends d {
        public b(sk.d dVar, z zVar, a0 a0Var) {
            super(dVar, zVar, a0Var);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        com.facebook.imagepipeline.memory.a<byte[]> y(int i11) {
            return new f(q(i11), this.f21691c.f123794g, 0);
        }
    }

    public c(sk.d dVar, z zVar) {
        k.b(Boolean.valueOf(zVar.f123794g > 0));
        this.f21713b = new b(dVar, zVar, u.h());
        this.f21712a = new a();
    }

    public tk.a<byte[]> a(int i11) {
        return tk.a.k0(this.f21713b.get(i11), this.f21712a);
    }

    public void b(byte[] bArr) {
        this.f21713b.a(bArr);
    }
}

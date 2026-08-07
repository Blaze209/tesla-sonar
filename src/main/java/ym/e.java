package ym;

import android.os.Build;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import u5.g;
import xm.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lym/e;", "", "<init>", "()V", "Lxm/y;", "poolFactory", "", "gingerbreadDecoderEnabled", "useDecodeBufferHelper", "Lym/f;", "platformDecoderOptions", "Lym/d;", "a", "(Lxm/y;ZZLym/f;)Lym/d;", "Lu5/f;", "Ljava/nio/ByteBuffer;", "b", "(Lxm/y;Z)Lu5/f;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f125715a = new e();

    private e() {
    }

    public static final d a(y poolFactory, boolean gingerbreadDecoderEnabled, boolean useDecodeBufferHelper, f platformDecoderOptions) {
        s.k(poolFactory, "poolFactory");
        s.k(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            xm.d dVarB = poolFactory.b();
            s.j(dVarB, "getBitmapPool(...)");
            return new c(dVarB, b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
        }
        xm.d dVarB2 = poolFactory.b();
        s.j(dVarB2, "getBitmapPool(...)");
        return new a(dVarB2, b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
    }

    public static final u5.f<ByteBuffer> b(y poolFactory, boolean useDecodeBufferHelper) {
        s.k(poolFactory, "poolFactory");
        if (useDecodeBufferHelper) {
            sk.b INSTANCE = sk.b.f111318a;
            s.j(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iE = poolFactory.e();
        g gVar = new g(iE);
        for (int i11 = 0; i11 < iE; i11++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sk.b.e());
            s.j(byteBufferAllocate, "allocate(...)");
            gVar.a(byteBufferAllocate);
        }
        return gVar;
    }
}

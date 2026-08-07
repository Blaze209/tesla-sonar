package i8;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.m2;
import java.io.IOException;
import java.nio.ByteBuffer;
import p7.g0;
import p7.u;
import s7.q0;
import y7.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f<DecoderInputBuffer, i8.c, ImageDecoderException> implements i8.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f76195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f76196p;

    /* JADX INFO: renamed from: i8.a$a, reason: collision with other inner class name */
    class C1598a extends i8.c {
        C1598a() {
        }

        @Override // y7.e
        public void o() {
            a.this.t(this);
        }
    }

    @Deprecated
    public interface b {
    }

    public static final class c implements i8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f76198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f76199b;

        public c(Context context) {
            this(context, null);
        }

        @Override // i8.b.a
        public int b(u uVar) {
            String str = uVar.f101544o;
            if (str == null || !g0.q(str)) {
                return m2.g(0);
            }
            return q0.P0(uVar.f101544o) ? m2.g(4) : m2.g(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i8.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this.f76198a, null, this.f76199b, 0 == true ? 1 : 0);
        }

        private c(Context context, b bVar) {
            this.f76198a = context;
            this.f76199b = -1;
        }
    }

    /* synthetic */ a(Context context, b bVar, int i11, C1598a c1598a) {
        this(context, bVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException l(DecoderInputBuffer decoderInputBuffer, i8.c cVar, boolean z11) {
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(decoderInputBuffer.f9286d);
        s7.a.h(byteBuffer.hasArray());
        s7.a.a(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f76196p;
            if (iMax == -1) {
                Context context = this.f76195o;
                if (context != null) {
                    Point pointB0 = q0.b0(context);
                    int i11 = pointB0.x;
                    int i12 = pointB0.y;
                    u uVar = decoderInputBuffer.f9284b;
                    if (uVar != null) {
                        int i13 = uVar.N;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = uVar.O;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    iMax = (Math.max(i11, i12) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            cVar.f76200e = v7.b.a(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            cVar.f125193b = decoderInputBuffer.f9288f;
            return null;
        } catch (ParserException e11) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e11);
        } catch (IOException e12) {
            return new ImageDecoderException(e12);
        }
    }

    @Override // y7.f, y7.d, i8.b
    public /* bridge */ /* synthetic */ i8.c a() {
        return (i8.c) super.a();
    }

    @Override // y7.f
    protected DecoderInputBuffer i() {
        return new DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public i8.c j() {
        return new C1598a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException k(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    private a(Context context, b bVar, int i11) {
        super(new DecoderInputBuffer[1], new i8.c[1]);
        this.f76195o = context;
        this.f76196p = i11;
    }
}

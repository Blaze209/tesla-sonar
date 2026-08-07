package ec;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import gc.DecodeResult;
import p013kotlin.Metadata;
import rc.ErrorResult;
import rc.ImageRequest;
import rc.Options;
import rc.SuccessResult;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 :2\u00020\u0001:\u000257B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020,H\u0016¢\u0006\u0004\b/\u0010.J\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\bJ\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lec/j;", "Lrc/g$d;", "<init>", "()V", "Lrc/g;", "request", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lrc/g;)V", "Lsc/i;", "sizeResolver", "n", "(Lrc/g;Lsc/i;)V", "Lsc/g;", "size", "m", "(Lrc/g;Lsc/g;)V", "", "input", "l", "(Lrc/g;Ljava/lang/Object;)V", "output", "k", "j", "", IntegerTokenConverter.CONVERTER_KEY, "(Lrc/g;Ljava/lang/String;)V", "Lic/j;", "fetcher", "Lrc/n;", "options", "h", "(Lrc/g;Lic/j;Lrc/n;)V", "Lic/i;", "result", "g", "(Lrc/g;Lic/j;Lrc/n;Lic/i;)V", "Lgc/k;", "decoder", "f", "(Lrc/g;Lgc/k;Lrc/n;)V", "Lgc/i;", "e", "(Lrc/g;Lgc/k;Lrc/n;Lgc/i;)V", "Landroid/graphics/Bitmap;", "p", "(Lrc/g;Landroid/graphics/Bitmap;)V", "o", "Lxc/d;", "transition", "r", "(Lrc/g;Lxc/d;)V", "q", "c", "Lrc/e;", "b", "(Lrc/g;Lrc/e;)V", "Lrc/r;", "a", "(Lrc/g;Lrc/r;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j implements ImageRequest.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f62492b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ec/j$a", "Lec/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lec/j$c;", "", "Lrc/g;", "request", "Lec/j;", "b", "(Lrc/g;)Lec/j;", "a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f62495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f62494b = new c() { // from class: ec.k
            @Override // ec.j.c
            public final j b(ImageRequest imageRequest) {
                return j.c.a(imageRequest);
            }
        };

        /* JADX INFO: renamed from: ec.j$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lec/j$c$a;", "", "<init>", "()V", "Lec/j$c;", "NONE", "Lec/j$c;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f62495a = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static j a(ImageRequest imageRequest) {
            return j.f62492b;
        }

        j b(ImageRequest request);
    }

    @Override // rc.ImageRequest.d
    public void c(ImageRequest request) {
    }

    @Override // rc.ImageRequest.d
    public void d(ImageRequest request) {
    }

    @Override // rc.ImageRequest.d
    public void a(ImageRequest request, SuccessResult result) {
    }

    @Override // rc.ImageRequest.d
    public void b(ImageRequest request, ErrorResult result) {
    }

    public void i(ImageRequest request, String output) {
    }

    public void j(ImageRequest request, Object input) {
    }

    public void k(ImageRequest request, Object output) {
    }

    public void l(ImageRequest request, Object input) {
    }

    public void m(ImageRequest request, Size size) {
    }

    public void n(ImageRequest request, sc.i sizeResolver) {
    }

    public void o(ImageRequest request, Bitmap output) {
    }

    public void p(ImageRequest request, Bitmap input) {
    }

    public void q(ImageRequest request, xc.d transition) {
    }

    public void r(ImageRequest request, xc.d transition) {
    }

    public void f(ImageRequest request, gc.k decoder, Options options) {
    }

    public void h(ImageRequest request, ic.j fetcher, Options options) {
    }

    public void e(ImageRequest request, gc.k decoder, Options options, DecodeResult result) {
    }

    public void g(ImageRequest request, ic.j fetcher, Options options, ic.i result) {
    }
}

package rc;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.p003lifecycle.Lifecycle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ec.BitmapImage;
import ec.Extras;
import java.util.Map;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import sc.Size;
import yc.b0;
import yc.g0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010<¨\u0006>"}, d2 = {"Lrc/a;", "Lrc/p;", "Lec/r;", "imageLoader", "Lyc/b0;", "systemCallbacks", "Lyc/t;", "logger", "<init>", "(Lec/r;Lyc/b0;Lyc/t;)V", "Lrc/g;", "Landroidx/lifecycle/Lifecycle;", "f", "(Lrc/g;)Landroidx/lifecycle/Lifecycle;", "Lsc/i;", "m", "(Lrc/g;)Lsc/i;", "Lsc/f;", "l", "(Lrc/g;)Lsc/f;", "sizeResolver", "Lsc/c;", "k", "(Lrc/g;Lsc/i;)Lsc/c;", "Lsc/g;", "size", "Lec/l;", "j", "(Lrc/g;Lsc/g;)Lec/l;", "request", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", IntegerTokenConverter.CONVERTER_KEY, "(Lrc/g;Landroid/graphics/Bitmap$Config;)Z", "g", "(Lrc/g;Lsc/g;)Z", "Lrc/n;", "options", "h", "(Lrc/n;)Z", "Lkotlinx/coroutines/Job;", "job", "findLifecycle", "Lrc/o;", "a", "(Lrc/g;Lkotlinx/coroutines/Job;Z)Lrc/o;", DateTokenConverter.CONVERTER_KEY, "(Lrc/g;)Lrc/g;", "c", "(Lrc/g;Lsc/g;)Lrc/n;", "b", "(Lrc/n;)Lrc/n;", "Lmc/d$c;", "cacheValue", "e", "(Lrc/g;Lmc/d$c;)Z", "Lec/r;", "Lyc/b0;", "Lyc/n;", "Lyc/n;", "hardwareBitmapService", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yc.n hardwareBitmapService = yc.o.a(null);

    public a(ec.r rVar, b0 b0Var, yc.t tVar) {
        this.imageLoader = rVar;
        this.systemCallbacks = b0Var;
    }

    private final Lifecycle f(ImageRequest imageRequest) {
        vc.c target = imageRequest.getTarget();
        return yc.e.e(target instanceof vc.d ? ((vc.d) target).getView().getContext() : imageRequest.getContext());
    }

    private final boolean g(ImageRequest request, Size size) {
        return (h.g(request).isEmpty() || p013kotlin.collections.n.e0(g0.f(), i.g(request))) && (!yc.b.d(i.g(request)) || (i(request, i.g(request)) && this.hardwareBitmapService.a(size)));
    }

    private final boolean h(Options options) {
        return !yc.b.d(i.h(options)) || this.hardwareBitmapService.getAllowHardware();
    }

    private final boolean i(ImageRequest request, Bitmap.Config requestedConfig) {
        if (!yc.b.d(requestedConfig)) {
            return true;
        }
        if (!i.c(request)) {
            return false;
        }
        vc.c target = request.getTarget();
        if (target instanceof vc.d) {
            View view = ((vc.d) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    private final Extras j(ImageRequest imageRequest, Size size) {
        Bitmap.Config configG = i.g(imageRequest);
        boolean zE = i.e(imageRequest);
        if (!g(imageRequest, size)) {
            configG = Bitmap.Config.ARGB_8888;
        }
        boolean z11 = zE && h.g(imageRequest).isEmpty() && configG != Bitmap.Config.ALPHA_8;
        Extras.a aVar = new Extras.a((Map<Extras.c<?>, ? extends Object>) v0.r(imageRequest.getDefaults().getExtras().b(), imageRequest.getExtras().b()));
        if (configG != i.g(imageRequest)) {
            aVar = aVar.b(i.i(Extras.c.INSTANCE), configG);
        }
        if (z11 != i.e(imageRequest)) {
            aVar = aVar.b(i.d(Extras.c.INSTANCE), Boolean.valueOf(z11));
        }
        return aVar.a();
    }

    private final sc.c k(ImageRequest imageRequest, sc.i iVar) {
        if (imageRequest.getDefined().getSizeResolver() == null && p013kotlin.jvm.internal.s.f(iVar, sc.i.f111066b)) {
            return sc.c.INEXACT;
        }
        return ((imageRequest.getTarget() instanceof vc.d) && (iVar instanceof sc.k) && (((vc.d) imageRequest.getTarget()).getView() instanceof ImageView) && ((vc.d) imageRequest.getTarget()).getView() == ((sc.k) iVar).getView()) ? sc.c.INEXACT : sc.c.EXACT;
    }

    private final sc.f l(ImageRequest imageRequest) {
        vc.c target = imageRequest.getTarget();
        vc.d dVar = target instanceof vc.d ? (vc.d) target : null;
        View view = dVar != null ? dVar.getView() : null;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        return imageView != null ? g0.e(imageView) : imageRequest.getScale();
    }

    private final sc.i m(ImageRequest imageRequest) {
        ImageView.ScaleType scaleType;
        if (!(imageRequest.getTarget() instanceof vc.d)) {
            return sc.i.f111066b;
        }
        View view = ((vc.d) imageRequest.getTarget()).getView();
        return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? sc.i.f111066b : sc.l.b(view, false, 2, null);
    }

    @Override // rc.p
    public o a(ImageRequest request, Job job, boolean findLifecycle) {
        vc.c target = request.getTarget();
        if (target instanceof vc.d) {
            Lifecycle lifecycleK = i.k(request);
            if (lifecycleK == null) {
                lifecycleK = f(request);
            }
            return new t(this.imageLoader, request, (vc.d) target, lifecycleK, job);
        }
        Lifecycle lifecycleK2 = i.k(request);
        if (lifecycleK2 == null) {
            lifecycleK2 = findLifecycle ? f(request) : null;
        }
        return lifecycleK2 != null ? new k(lifecycleK2, job) : b.d(b.e(job));
    }

    @Override // rc.p
    public Options b(Options options) {
        boolean z11;
        Extras extras = options.getExtras();
        if (h(options)) {
            z11 = false;
        } else {
            extras = extras.d().b(i.i(Extras.c.INSTANCE), Bitmap.Config.ARGB_8888).a();
            z11 = true;
        }
        return z11 ? Options.b(options, null, null, null, null, null, null, null, null, null, extras, 511, null) : options;
    }

    @Override // rc.p
    public Options c(ImageRequest request, Size size) {
        return new Options(request.getContext(), size, request.getScale(), request.getPrecision(), request.getDiskCacheKey(), request.getFileSystem(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy(), j(request, size));
    }

    @Override // rc.p
    public ImageRequest d(ImageRequest request) {
        ImageRequest.a aVarE = ImageRequest.A(request, null, 1, null).e(this.imageLoader.c());
        sc.i sizeResolver = request.getDefined().getSizeResolver();
        if (sizeResolver == null) {
            sizeResolver = m(request);
            aVarE.o(sizeResolver);
        }
        if (request.getDefined().getScale() == null) {
            aVarE.l(l(request));
        }
        if (request.getDefined().getPrecision() == null) {
            aVarE.k(k(request, sizeResolver));
        }
        return aVarE.b();
    }

    @Override // rc.p
    public boolean e(ImageRequest request, mc.d.Value cacheValue) {
        ec.n image = cacheValue.getImage();
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        return i(request, yc.b.c(bitmapImage.getBitmap()));
    }
}

package ic;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.g0;
import ec.h0;
import ec.i0;
import ec.r;
import gc.v;
import java.io.FileNotFoundException;
import java.util.List;
import okio.c0;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lic/f;", "Lic/j;", "Lec/g0;", "data", "Lrc/n;", "options", "<init>", "(Lec/g0;Lrc/n;)V", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "()Landroid/os/Bundle;", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lec/g0;)Z", "c", "Lec/g0;", "Lrc/n;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lic/f$a;", "Lic/j$a;", "Lec/g0;", "<init>", "()V", "data", "", "c", "(Lec/g0;)Z", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "b", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements j.a<g0> {
        private final boolean c(g0 data) {
            return s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "content");
        }

        @Override // ic.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(g0 data, Options options, r imageLoader) {
            if (c(data)) {
                return new f(data, options);
            }
            return null;
        }
    }

    public f(g0 g0Var, Options options) {
        this.data = g0Var;
        this.options = options;
    }

    private final Bundle d() {
        sc.a width = this.options.getSize().getWidth();
        sc.a.C2364a c2364a = width instanceof sc.a.C2364a ? (sc.a.C2364a) width : null;
        if (c2364a == null) {
            return null;
        }
        int px2 = c2364a.getPx();
        sc.a height = this.options.getSize().getHeight();
        sc.a.C2364a c2364a2 = height instanceof sc.a.C2364a ? (sc.a.C2364a) height : null;
        if (c2364a2 == null) {
            return null;
        }
        int px3 = c2364a2.getPx();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(px2, px3));
        return bundle;
    }

    @Override // ic.j
    public Object a(Continuation<? super i> continuation) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriA = i0.a(this.data);
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (b(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriA + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriA + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriA, "image/*", d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriA + "'.").toString());
            }
        }
        return new SourceFetchResult(v.a(c0.d(c0.m(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.options.getFileSystem(), new gc.g(this.data, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriA), gc.h.DISK);
    }

    public final boolean b(g0 data) {
        return s.f(data.getAuthority(), "com.android.contacts") && s.f(p013kotlin.collections.v.C0(h0.f(data)), "display_photo");
    }

    public final boolean c(g0 data) {
        List<String> listF;
        int size;
        return s.f(data.getAuthority(), "media") && (size = (listF = h0.f(data)).size()) >= 3 && s.f(listF.get(size + (-3)), MediaStreamTrack.AUDIO_TRACK_KIND) && s.f(listF.get(size + (-2)), "albums");
    }
}

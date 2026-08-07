package o90;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import jn0.h0;
import jn0.m;
import jn0.t;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019R\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,R\u001d\u00101\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lo90/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cacheFolder", "", "maxSizeBytes", "<init>", "(Landroid/content/Context;Ljava/lang/String;J)V", ImagesContract.URL, "Landroid/graphics/Bitmap$CompressFormat;", "b", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap$CompressFormat;)I", "s", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "j", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/graphics/Bitmap;", "bitmap", "Lty/a$c;", "Lty/a;", "editor", "compressFormat", "compressQuality", "", "k", "(Landroid/graphics/Bitmap;Lty/a$c;Landroid/graphics/Bitmap$CompressFormat;I)Z", "uniqueName", "Ljava/io/File;", "f", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", Action.KEY_ATTRIBUTE, "data", "h", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "e", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;)Z", "a", "Lkotlin/Lazy;", "g", "()Lty/a;", "diskLruCache", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f96973b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96974c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy diskLruCache;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lo90/b$a;", "", "<init>", "()V", "", "APP_VERSION", "I", "IO_BUFFER_SIZE", "JPEG_COMPRESS_QUALITY", "PNG_COMPRESS_QUALITY", "", "TAG", "Ljava/lang/String;", "VALUE_COUNT", "WEBP_COMPRESS_QUALITY", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: o90.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C2072b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96976a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96976a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lty/a;", "b", "()Lty/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<ty.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f96978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f96979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f96980f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, long j11) {
            super(0);
            this.f96978d = context;
            this.f96979e = str;
            this.f96980f = j11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ty.a invoke() {
            try {
                return ty.a.s0(b.this.f(this.f96978d, this.f96979e), 1, 1, this.f96980f);
            } catch (IOException e11) {
                Log.e("stripe_image_disk_cache", "error opening cache", e11);
                return null;
            }
        }
    }

    public b(Context context, String cacheFolder, long j11) {
        s.k(context, "context");
        s.k(cacheFolder, "cacheFolder");
        this.diskLruCache = m.b(new c(context, cacheFolder, j11));
    }

    private final Bitmap.CompressFormat b(String url) {
        Bitmap.CompressFormat compressFormat;
        d dVarA = d.INSTANCE.a(url);
        if (dVarA != null && (compressFormat = dVarA.getCompressFormat()) != null) {
            return compressFormat;
        }
        throw new IllegalArgumentException("Unexpected image format: " + url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File f(Context context, String uniqueName) {
        String path = context.getCacheDir().getPath();
        s.j(path, "getPath(...)");
        return new File(path + File.separator + uniqueName);
    }

    private final ty.a g() {
        return (ty.a) this.diskLruCache.getValue();
    }

    private final int i(Bitmap.CompressFormat compressFormat) {
        int i11 = C2072b.f96976a[compressFormat.ordinal()];
        if (i11 == 1) {
            return 80;
        }
        if (i11 == 2) {
            return 100;
        }
        if (i11 == 3) {
            return 80;
        }
        throw new IllegalArgumentException("Unexpected compress format: " + compressFormat);
    }

    private final String j(String str) {
        return String.valueOf(str.hashCode());
    }

    private final boolean k(Bitmap bitmap, ty.a.c editor, Bitmap.CompressFormat compressFormat, int compressQuality) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(editor.f(0), PKIFailureInfo.certRevoked);
            try {
                boolean zCompress = bitmap.compress(compressFormat, compressQuality, bufferedOutputStream2);
                bufferedOutputStream2.close();
                return zCompress;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean c(String key) {
        s.k(key, "key");
        try {
            ty.a aVarG = g();
            ty.a.e eVarN0 = aVarG != null ? aVarG.n0(j(key)) : null;
            boolean z11 = eVarN0 != null;
            if (eVarN0 != null) {
                eVarN0.close();
            }
            return z11;
        } catch (IOException e11) {
            Log.e("stripe_image_disk_cache", "error reading from cache", e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    public final Bitmap e(String key) throws Throwable {
        ty.a.e eVar;
        String str;
        s.k(key, "key");
        String strJ = j(key);
        ty.a.e eVar2 = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            ty.a aVarG = g();
            ty.a.e eVarN0 = aVarG != null ? aVarG.n0(strJ) : null;
            try {
                if (eVarN0 == null) {
                    d("image not in cache: " + strJ);
                    return null;
                }
                InputStream inputStreamC = eVarN0.c(0);
                s.j(inputStreamC, "getInputStream(...)");
                bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStreamC, PKIFailureInfo.certRevoked));
                eVarN0.close();
                if (bitmapDecodeStream == null) {
                    str = "image not in cache: " + strJ;
                } else {
                    str = "image read from disk " + strJ;
                }
                d(str);
                return bitmapDecodeStream;
            } catch (IOException e11) {
                eVar = eVarN0;
                e = e11;
                try {
                    Log.e("stripe_image_disk_cache", "error getting bitmap from cache", e);
                    if (eVar != null) {
                        eVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                eVar2 = eVarN0;
                if (eVar2 != null) {
                    eVar2.close();
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            eVar = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void h(String key, Bitmap data) {
        ty.a.c cVarE0;
        s.k(key, "key");
        s.k(data, "data");
        String strJ = j(key);
        if (c(key)) {
            d("Image already cached");
            return;
        }
        h0 h0Var = null;
        try {
            ty.a aVarG = g();
            cVarE0 = aVarG != null ? aVarG.e0(strJ) : null;
            if (cVarE0 == null) {
                return;
            }
            try {
                Bitmap.CompressFormat compressFormatB = b(key);
                if (!k(data, cVarE0, compressFormatB, i(compressFormatB))) {
                    cVarE0.a();
                    Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + strJ);
                    return;
                }
                ty.a aVarG2 = g();
                if (aVarG2 != null) {
                    aVarG2.flush();
                }
                cVarE0.e();
                d("image put on disk cache " + strJ);
            } catch (IOException unused) {
                Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + strJ);
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    if (cVarE0 != null) {
                        cVarE0.a();
                        h0Var = h0.f84049a;
                    }
                    jn0.s.b(h0Var);
                } catch (Throwable th2) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    jn0.s.b(t.a(th2));
                }
            }
        } catch (IOException unused2) {
            cVarE0 = null;
        }
    }

    public /* synthetic */ b(Context context, String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE : j11);
    }

    private final void d(String s11) {
    }
}

package gm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\nR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lgm/b;", "", "<init>", "()V", "Lgm/c;", "imageFormat", "", "b", "(Lgm/c;)Z", "a", "Lgm/c;", "JPEG", "c", "PNG", DateTokenConverter.CONVERTER_KEY, "GIF", "e", "BMP", "f", "ICO", "g", "WEBP_SIMPLE", "h", "WEBP_LOSSLESS", IntegerTokenConverter.CONVERTER_KEY, "WEBP_EXTENDED", "j", "WEBP_EXTENDED_WITH_ALPHA", "k", "WEBP_ANIMATED", "l", "HEIF", "m", "DNG", "n", "BINARY_XML", "o", "AVIF", "", "p", "Ljava/util/List;", "defaultFormats", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f69198a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final c JPEG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final c PNG;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final c GIF;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final c BMP;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final c ICO;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final c WEBP_SIMPLE;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final c WEBP_LOSSLESS;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final c WEBP_EXTENDED;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final c WEBP_EXTENDED_WITH_ALPHA;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final c WEBP_ANIMATED;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final c HEIF;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final c DNG;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final c BINARY_XML;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final c AVIF;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final List<c> defaultFormats;

    static {
        c cVar = new c("JPEG", "jpeg");
        JPEG = cVar;
        c cVar2 = new c("PNG", "png");
        PNG = cVar2;
        c cVar3 = new c("GIF", "gif");
        GIF = cVar3;
        c cVar4 = new c("BMP", "bmp");
        BMP = cVar4;
        c cVar5 = new c("ICO", "ico");
        ICO = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        WEBP_SIMPLE = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        WEBP_LOSSLESS = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        WEBP_EXTENDED = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        WEBP_EXTENDED_WITH_ALPHA = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        WEBP_ANIMATED = cVar10;
        c cVar11 = new c("HEIF", "heif");
        HEIF = cVar11;
        DNG = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        BINARY_XML = cVar12;
        c cVar13 = new c("AVIF", "avif");
        AVIF = cVar13;
        defaultFormats = v.p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        s.k(imageFormat, "imageFormat");
        return imageFormat == WEBP_SIMPLE || imageFormat == WEBP_LOSSLESS || imageFormat == WEBP_EXTENDED || imageFormat == WEBP_EXTENDED_WITH_ALPHA;
    }

    public static final boolean b(c imageFormat) {
        s.k(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == WEBP_ANIMATED;
    }
}

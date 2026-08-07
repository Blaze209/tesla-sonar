package ezvcard.parameter;

import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes8.dex */
public class ImageType extends MediaTypeParameter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b<ImageType> f63546d = new b<>(ImageType.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImageType f63547e = new ImageType("GIF", "image/gif", "gif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImageType f63548f = new ImageType("JPEG", ClipboardModule.MIMETYPE_JPEG, "jpg");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ImageType f63549g = new ImageType("PNG", ClipboardModule.MIMETYPE_PNG, "png");

    private ImageType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static ImageType f(String str, String str2, String str3) {
        return f63546d.d(new String[]{str, str2, str3});
    }

    public static ImageType g(String str, String str2, String str3) {
        return f63546d.e(new String[]{str, str2, str3});
    }
}

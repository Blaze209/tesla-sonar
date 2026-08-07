package i4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li4/z;", "spanStyle", "Li4/y;", "paragraphStyle", "Li4/b0;", "a", "(Li4/z;Li4/y;)Li4/b0;", "start", "stop", "", "fraction", "b", "(Li4/y;Li4/y;F)Li4/y;", "c", "(Li4/z;Li4/z;F)Li4/z;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final PlatformTextStyle a(z zVar, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(zVar, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f11) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((g) e0.d(g.d(platformParagraphStyle.getEmojiSupportMatch()), g.d(platformParagraphStyle2.getEmojiSupportMatch()), f11)).getValue(), ((Boolean) e0.d(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f11)).booleanValue(), null);
    }

    public static final z c(z zVar, z zVar2, float f11) {
        return zVar;
    }
}

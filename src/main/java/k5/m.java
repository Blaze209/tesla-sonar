package k5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m extends n {
    private Font i(FontFamily fontFamily, int i11) {
        FontStyle fontStyle = new FontStyle((i11 & 1) != 0 ? 700 : 400, (i11 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iK = k(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int iK2 = k(fontStyle, font2.getStyle());
            if (iK2 < iK) {
                font = font2;
                iK = iK2;
            }
        }
        return font;
    }

    private static FontFamily j(CancellationSignal cancellationSignal, r5.g.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (r5.g.b bVar : bVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e11) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e11);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static int k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // k5.n
    public Typeface a(Context context, j5.e.c cVar, Resources resources, int i11) {
        try {
            FontFamily.Builder builder = null;
            for (j5.e.d dVar : cVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(i(fontFamilyBuild, i11).getStyle()).build();
        } catch (Exception e11) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e11);
            return null;
        }
    }

    @Override // k5.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, r5.g.b[] bVarArr, int i11) {
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyJ).setStyle(i(fontFamilyJ, i11).getStyle()).build();
        } catch (Exception e11) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e11);
            return null;
        }
    }

    @Override // k5.n
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<r5.g.b[]> list, int i11) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            for (int i12 = 1; i12 < list.size(); i12++) {
                FontFamily fontFamilyJ2 = j(cancellationSignal, list.get(i12), contentResolver);
                if (fontFamilyJ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyJ2);
                }
            }
            return customFallbackBuilder.setStyle(i(fontFamilyJ, i11).getStyle()).build();
        } catch (Exception e11) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e11);
            return null;
        }
    }

    @Override // k5.n
    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        try {
            Font fontBuild = new Font.Builder(resources, i11).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e11) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e11);
            return null;
        }
    }

    @Override // k5.n
    protected r5.g.b h(r5.g.b[] bVarArr, int i11) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

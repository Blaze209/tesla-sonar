package kn;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003#!\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lkn/a;", "", "<init>", "()V", "", "fontFamilyName", "", "style", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/graphics/Typeface;", "e", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "weight", "", "italic", "f", "(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;IILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "Lkn/a$c;", "typefaceStyle", "g", "(Ljava/lang/String;Lkn/a$c;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "typeface", "Ljn0/h0;", "h", "(Ljava/lang/String;ILandroid/graphics/Typeface;)V", "", "Lkn/a$a;", "a", "Ljava/util/Map;", "fontCache", "b", "customTypefaceCache", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f86319d = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f86320e = {".ttf", ".otf"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f86321f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C1849a> fontCache = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Typeface> customTypefaceCache = new LinkedHashMap();

    /* JADX INFO: renamed from: kn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkn/a$a;", "", "<init>", "()V", "", "style", "Landroid/graphics/Typeface;", "a", "(I)Landroid/graphics/Typeface;", "typeface", "Ljn0/h0;", "b", "(ILandroid/graphics/Typeface;)V", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "typefaceSparseArray", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C1849a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SparseArray<Typeface> typefaceSparseArray = new SparseArray<>(4);

        public final Typeface a(int style) {
            return this.typefaceSparseArray.get(style);
        }

        public final void b(int style, Typeface typeface) {
            this.typefaceSparseArray.put(style, typeface);
        }
    }

    /* JADX INFO: renamed from: kn.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkn/a$b;", "", "<init>", "()V", "", "fontFamilyName", "", "style", "Landroid/content/res/AssetManager;", "assetManager", "Landroid/graphics/Typeface;", "b", "(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;", "Lkn/a;", "c", "()Lkn/a;", "", "EXTENSIONS", "[Ljava/lang/String;", "FILE_EXTENSIONS", "FONTS_ASSET_PATH", "Ljava/lang/String;", "_instance", "Lkn/a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String fontFamilyName, int style, AssetManager assetManager) {
            if (assetManager != null) {
                String str = a.f86319d[style];
                for (String str2 : a.f86320e) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + fontFamilyName + str + str2);
                        s.j(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(fontFamilyName, style);
            s.j(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final a c() {
            return a.f86321f;
        }

        private Companion() {
        }
    }

    public final Typeface d(String fontFamilyName, int style, int weight, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(style, weight), assetManager);
    }

    public final Typeface e(String fontFamilyName, int style, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(style, 0, 2, null), assetManager);
    }

    public final Typeface f(String fontFamilyName, int weight, boolean italic, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        return g(fontFamilyName, new c(weight, italic), assetManager);
    }

    public final Typeface g(String fontFamilyName, c typefaceStyle, AssetManager assetManager) {
        s.k(fontFamilyName, "fontFamilyName");
        s.k(typefaceStyle, "typefaceStyle");
        if (this.customTypefaceCache.containsKey(fontFamilyName)) {
            return typefaceStyle.a(this.customTypefaceCache.get(fontFamilyName));
        }
        Map<String, C1849a> map = this.fontCache;
        C1849a c1849a = map.get(fontFamilyName);
        if (c1849a == null) {
            c1849a = new C1849a();
            map.put(fontFamilyName, c1849a);
        }
        C1849a c1849a2 = c1849a;
        int iB = typefaceStyle.b();
        Typeface typefaceA = c1849a2.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceB = INSTANCE.b(fontFamilyName, iB, assetManager);
        c1849a2.b(iB, typefaceB);
        return typefaceB;
    }

    public final void h(String fontFamilyName, int style, Typeface typeface) {
        s.k(fontFamilyName, "fontFamilyName");
        if (typeface != null) {
            Map<String, C1849a> map = this.fontCache;
            C1849a c1849a = map.get(fontFamilyName);
            if (c1849a == null) {
                c1849a = new C1849a();
                map.put(fontFamilyName, c1849a);
            }
            c1849a.b(style, typeface);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkn/a$c;", "", "", "weight", "", "italic", "<init>", "(IZ)V", "style", "(II)V", "Landroid/graphics/Typeface;", "typeface", "a", "(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;", "Z", "b", "I", "()I", "nearestStyle", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean italic;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int weight;

        public c(int i11, boolean z11) {
            this.italic = z11;
            this.weight = i11 == -1 ? 400 : i11;
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, b());
                s.h(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.weight, this.italic);
            s.h(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int b() {
            if (this.weight < 700) {
                return this.italic ? 2 : 0;
            }
            return this.italic ? 3 : 1;
        }

        public /* synthetic */ c(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i13 & 2) != 0 ? -1 : i12);
        }

        public c(int i11, int i12) {
            i11 = i11 == -1 ? 0 : i11;
            this.italic = (i11 & 2) != 0;
            this.weight = i12 == -1 ? (i11 & 1) != 0 ? 700 : 400 : i12;
        }
    }
}

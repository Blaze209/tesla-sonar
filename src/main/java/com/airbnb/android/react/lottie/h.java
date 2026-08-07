package com.airbnb.android.react.lottie;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import tf.d0;
import tf.k0;
import tf.l0;
import tf.m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0018\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001bR$\u0010/\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00102\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00108\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00104\u001a\u0004\b5\u00106\"\u0004\b)\u00107R$\u0010;\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00107R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\b=\u0010IR$\u0010M\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0011\u001a\u0004\bL\u0010\u001a\"\u0004\b\u0014\u0010\u001bR$\u0010O\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0011\u001a\u0004\bN\u0010\u001a\"\u0004\b\u001e\u0010\u001bR$\u0010R\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u001a\u0004\bP\u0010\u001a\"\u0004\bQ\u0010\u001bR$\u0010X\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010T\u001a\u0004\bU\u0010V\"\u0004\bK\u0010WR$\u0010[\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010*\u001a\u0004\bZ\u0010,\"\u0004\bE\u0010.R$\u0010]\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b\\\u0010,\"\u0004\b%\u0010.R$\u0010`\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010T\u001a\u0004\b_\u0010V\"\u0004\bY\u0010W¨\u0006a"}, d2 = {"Lcom/airbnb/android/react/lottie/h;", "", "Lcom/airbnb/lottie/LottieAnimationView;", "view", "<init>", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "Lcom/facebook/react/bridge/ReadableMap;", "colorFilter", "Ljn0/h0;", "b", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/airbnb/lottie/LottieAnimationView;)V", "a", "()V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "viewWeakReference", "", "Ljava/lang/String;", "TAG", "", "c", "Z", "animationNameDirty", "value", DateTokenConverter.CONVERTER_KEY, "getAnimationName", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "animationName", "Landroid/widget/ImageView$ScaleType;", "e", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "o", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "f", "getImageAssetsFolder", "j", "imageAssetsFolder", "g", "Ljava/lang/Boolean;", "getEnableMergePaths", "()Ljava/lang/Boolean;", "h", "(Ljava/lang/Boolean;)V", "enableMergePaths", "getEnableSafeMode", IntegerTokenConverter.CONVERTER_KEY, "enableSafeMode", "Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/ReadableArray;", "getColorFilters", "()Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)V", "colorFilters", "getTextFilters", "r", "textFilters", "Ltf/k0;", "k", "Ltf/k0;", "getRenderMode", "()Ltf/k0;", "n", "(Ltf/k0;)V", "renderMode", "", "l", "Ljava/lang/Integer;", "getLayerType", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "layerType", "m", "getAnimationJson", "animationJson", "getAnimationURL", "animationURL", "getSourceDotLottie", "p", "sourceDotLottie", "", "Ljava/lang/Float;", "getProgress", "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", ReactProgressBarViewManager.PROP_PROGRESS, "q", "getLoop", "loop", "getAutoPlay", "autoPlay", "s", "getSpeed", "speed", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<LottieAnimationView> viewWeakReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean animationNameDirty;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String animationName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ImageView.ScaleType scaleType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String imageAssetsFolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Boolean enableMergePaths;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Boolean enableSafeMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ReadableArray colorFilters;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ReadableArray textFilters;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private k0 renderMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Integer layerType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String animationJson;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String animationURL;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String sourceDotLottie;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Float progress;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Boolean loop;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Boolean autoPlay;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Float speed;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/airbnb/android/react/lottie/h$a", "Ltf/b;", "", "fontFamily", "Landroid/graphics/Typeface;", "a", "(Ljava/lang/String;)Landroid/graphics/Typeface;", "fontStyle", "fontName", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Typeface;", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends tf.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f19859a;

        a(LottieAnimationView lottieAnimationView) {
            this.f19859a = lottieAnimationView;
        }

        @Override // tf.b
        public Typeface a(String fontFamily) {
            s.k(fontFamily, "fontFamily");
            com.facebook.react.views.text.d dVarA = com.facebook.react.views.text.d.INSTANCE.a();
            AssetManager assets = this.f19859a.getContext().getAssets();
            s.j(assets, "getAssets(...)");
            return dVarA.d(fontFamily, -1, -1, assets);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        @Override // tf.b
        public Typeface b(String fontFamily, String fontStyle, String fontName) {
            int i11;
            s.k(fontFamily, "fontFamily");
            s.k(fontStyle, "fontStyle");
            s.k(fontName, "fontName");
            switch (fontStyle) {
                case "Medium":
                    i11 = 500;
                    break;
                case "Normal":
                case "Regular":
                    i11 = 400;
                    break;
                case "Bold":
                    i11 = 700;
                    break;
                case "Thin":
                    i11 = 100;
                    break;
                case "Black":
                    i11 = 900;
                    break;
                case "Light":
                    i11 = 200;
                    break;
                default:
                    i11 = -1;
                    break;
            }
            com.facebook.react.views.text.d dVarA = com.facebook.react.views.text.d.INSTANCE.a();
            AssetManager assets = this.f19859a.getContext().getAssets();
            s.j(assets, "getAssets(...)");
            return dVarA.d(fontName, -1, i11, assets);
        }
    }

    public h(LottieAnimationView view) {
        s.k(view, "view");
        this.TAG = "lottie-react-native";
        this.viewWeakReference = new WeakReference<>(view);
        view.setFontAssetDelegate(new a(view));
    }

    private final void b(ReadableMap colorFilter, LottieAnimationView view) {
        int iIntValue;
        List listM;
        if (colorFilter.getType("color") == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(colorFilter.getMap("color"), view.getContext());
            iIntValue = color != null ? color.intValue() : 0;
        } else {
            iIntValue = colorFilter.getInt("color");
        }
        String str = colorFilter.getString("keypath") + ".**";
        String strQuote = Pattern.quote(".");
        s.j(strQuote, "quote(...)");
        List<String> listM2 = new q(strQuote).m(str, 0);
        if (listM2.isEmpty()) {
            listM = v.m();
        } else {
            ListIterator<String> listIterator = listM2.listIterator(listM2.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listM = v.d1(listM2, listIterator.nextIndex() + 1);
                }
            }
            listM = v.m();
        }
        String[] strArr = (String[]) listM.toArray(new String[0]);
        view.k(new ag.e((String[]) Arrays.copyOf(strArr, strArr.length)), d0.K, new ig.c(new l0(iIntValue)));
    }

    public final void a() {
        Object objB;
        LottieAnimationView lottieAnimationView = this.viewWeakReference.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.textFilters;
        if (readableArray != null && readableArray.size() > 0) {
            m0 m0Var = new m0(lottieAnimationView);
            int size = readableArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = readableArray.getMap(i11);
                if (map != null) {
                    m0Var.e(map.getString("find"), map.getString(Parser.REPLACE_CONVERTER_WORD));
                }
            }
            lottieAnimationView.setTextDelegate(m0Var);
        }
        String str = this.animationJson;
        if (str != null) {
            lottieAnimationView.setAnimationFromJson(str, String.valueOf(str.hashCode()));
            this.animationJson = null;
        }
        String str2 = this.animationURL;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.setAnimation(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.setAnimationFromUrl(str2, String.valueOf(str2.hashCode()));
            }
            this.animationURL = null;
        }
        String str3 = this.sourceDotLottie;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.setAnimation(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.sourceDotLottie = null;
                return;
            }
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(Uri.parse(str3).getScheme());
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            String str4 = (String) objB;
            if (str4 != null) {
                if (s.f(str4, Action.FILE_ATTRIBUTE)) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        lottieAnimationView.setAnimation(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    } else {
                        Log.w(this.TAG, "URI path is null for asset: " + str3);
                    }
                } else {
                    lottieAnimationView.setAnimationFromUrl(str3);
                }
                this.sourceDotLottie = null;
                return;
            }
            int identifier = lottieAnimationView.getResources().getIdentifier(str3, "raw", lottieAnimationView.getContext().getPackageName());
            if (identifier == 0) {
                uo.c.b("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            lottieAnimationView.setAnimation(identifier);
            this.animationNameDirty = false;
            this.sourceDotLottie = null;
        }
        if (this.animationNameDirty) {
            lottieAnimationView.setAnimation(this.animationName);
            this.animationNameDirty = false;
        }
        Float f11 = this.progress;
        if (f11 != null) {
            lottieAnimationView.setProgress(f11.floatValue());
            this.progress = null;
        }
        Boolean bool = this.loop;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.loop = null;
        }
        Boolean bool2 = this.autoPlay;
        if (bool2 != null && bool2.booleanValue() && !lottieAnimationView.t()) {
            lottieAnimationView.v();
        }
        Float f12 = this.speed;
        if (f12 != null) {
            lottieAnimationView.setSpeed(f12.floatValue());
            this.speed = null;
        }
        ImageView.ScaleType scaleType = this.scaleType;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.scaleType = null;
        }
        k0 k0Var = this.renderMode;
        if (k0Var != null) {
            lottieAnimationView.setRenderMode(k0Var);
            this.renderMode = null;
        }
        Integer num = this.layerType;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str5 = this.imageAssetsFolder;
        if (str5 != null) {
            lottieAnimationView.setImageAssetsFolder(str5);
            this.imageAssetsFolder = null;
        }
        Boolean bool3 = this.enableMergePaths;
        if (bool3 != null) {
            lottieAnimationView.p(bool3.booleanValue());
            this.enableMergePaths = null;
        }
        Boolean bool4 = this.enableSafeMode;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.enableSafeMode = null;
        }
        ReadableArray readableArray2 = this.colorFilters;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ReadableMap map2 = readableArray2.getMap(i12);
            if (map2 != null) {
                b(map2, lottieAnimationView);
            }
        }
    }

    public final void c(String str) {
        this.animationJson = str;
    }

    public final void d(String str) {
        this.animationName = str;
        this.animationNameDirty = true;
    }

    public final void e(String str) {
        this.animationURL = str;
    }

    public final void f(Boolean bool) {
        this.autoPlay = bool;
    }

    public final void g(ReadableArray readableArray) {
        this.colorFilters = readableArray;
    }

    public final void h(Boolean bool) {
        this.enableMergePaths = bool;
    }

    public final void i(Boolean bool) {
        this.enableSafeMode = bool;
    }

    public final void j(String str) {
        this.imageAssetsFolder = str;
    }

    public final void k(Integer num) {
        this.layerType = num;
    }

    public final void l(Boolean bool) {
        this.loop = bool;
    }

    public final void m(Float f11) {
        this.progress = f11;
    }

    public final void n(k0 k0Var) {
        this.renderMode = k0Var;
    }

    public final void o(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public final void p(String str) {
        this.sourceDotLottie = str;
    }

    public final void q(Float f11) {
        this.speed = f11;
    }

    public final void r(ReadableArray readableArray) {
        this.textFilters = readableArray;
    }
}

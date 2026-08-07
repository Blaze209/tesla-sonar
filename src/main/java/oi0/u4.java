package oi0;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ic.SourceFetchResult;
import java.nio.charset.Charset;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import rc.ImageRequest;
import rc.Options;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Loi0/l4;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "Landroid/view/View;", "m", "(Loi0/l4;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Landroid/view/View;", "n", "s", "Landroid/widget/ImageView;", "imageView", "", "uri", "Ljn0/h0;", "j", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "k", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "originalSvg", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)Ljava/lang/String;", "originalHex", "newHex", "fallbackColor", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u4 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97780a;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97780a = iArr;
        }
    }

    private static final String i(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        String strV;
        Integer originalStrokeColorValue;
        String strG;
        Integer originalBackgroundColorValue;
        String strG2;
        Integer originalHighlightColorValue;
        String strG3;
        Integer originalFillColorValue;
        String strG4;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle == null || (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) == null) {
            strV = str;
        } else {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            strV = (newFillColorValue == null || yh0.h.g(newFillColorValue.intValue()) == null) ? str : p013kotlin.text.t.V(str, yh0.h.g(iIntValue), "{{ fill_color }}", false, 4, null);
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && yh0.h.g(newHighlightColorValue.intValue()) != null) {
                strV = p013kotlin.text.t.V(strV, yh0.h.g(iIntValue2), "{{ highlight_color }}", false, 4, null);
            }
        }
        String strV2 = strV;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && yh0.h.g(newBackgroundColorValue.intValue()) != null) {
                strV2 = p013kotlin.text.t.V(strV2, yh0.h.g(iIntValue3), "{{ background_color }}", false, 4, null);
            }
        }
        String strW = strV2;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && yh0.h.g(newStrokeColorValue.intValue()) != null) {
                strW = p013kotlin.text.t.V(strW, yh0.h.g(iIntValue4), "{{ stroke_color }}", false, 4, null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (strG4 = yh0.h.g(newFillColorValue2.intValue())) != null) {
                strW = w(strW, "{{ fill_color }}", strG4, yh0.h.g(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (strG3 = yh0.h.g(newHighlightColorValue2.intValue())) != null) {
                strW = w(strW, "{{ highlight_color }}", strG3, yh0.h.g(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (strG2 = yh0.h.g(newBackgroundColorValue2.intValue())) != null) {
                strW = w(strW, "{{ background_color }}", strG2, yh0.h.g(iIntValue7));
            }
        }
        if (remoteImageComponentStyle != null && (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue8 = originalStrokeColorValue.intValue();
            Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue2 != null && (strG = yh0.h.g(newStrokeColorValue2.intValue())) != null) {
                return w(strW, "{{ stroke_color }}", strG, yh0.h.g(iIntValue8));
            }
        }
        return strW;
    }

    private static final void j(ImageView imageView, String str) {
        Context context = imageView.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        ec.r.a aVar = new ec.r.a(context);
        ec.h.a aVar2 = new ec.h.a();
        aVar2.g(new tc.d.a(false, false, false, 7, null));
        rc.i.a(rc.h.a(aVar.f(aVar2.p()), true), 500).c().b(rc.i.o(new ImageRequest.a(imageView.getContext()).c(str), imageView).b());
    }

    private static final void k(ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        ec.r rVarC = rc.i.a(rc.h.a(new ec.r.a(context), true), 500).c();
        ImageRequest.a aVarO = rc.i.o(new ImageRequest.a(imageView.getContext()).c(str), imageView);
        aVarO.d(new gc.k.a() { // from class: oi0.s4
            @Override // gc.k.a
            public final gc.k a(SourceFetchResult sourceFetchResult, Options options, ec.r rVar) {
                return u4.l(remoteImageComponentStyle, sourceFetchResult, options, rVar);
            }
        });
        rVarC.b(aVarO.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gc.k l(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, SourceFetchResult result, Options options, ec.r rVar) {
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(rVar, "<unused var>");
        byte[] bArrV0 = result.getSource().source().V0();
        Charset charset = p013kotlin.text.d.UTF_8;
        byte[] bytes = i(new String(bArrV0, charset), remoteImageComponentStyle).getBytes(charset);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return new tc.d(gc.v.c(new okio.h().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    public static final View m(RemoteImageComponent remoteImageComponent, p5 uiComponentHelper, RemoteImage config) {
        p013kotlin.jvm.internal.s.k(remoteImageComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        View viewN = n(remoteImageComponent, uiComponentHelper, config);
        return viewN == null ? s(remoteImageComponent, uiComponentHelper, config) : viewN;
    }

    private static final View n(RemoteImageComponent remoteImageComponent, p5 p5Var, final RemoteImage remoteImage) {
        Integer numG;
        gb.a aVar;
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        Context context = p5Var.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        if (localAssetName != null && localAssetContentType != null) {
            final p013kotlin.jvm.internal.j0 j0Var = new p013kotlin.jvm.internal.j0();
            int[] iArr = a.f97780a;
            int i11 = iArr[localAssetContentType.ordinal()];
            if (i11 == 1) {
                numG = yh0.s.g(context, localAssetName, yh0.t.Raw);
            } else if (i11 == 2) {
                numG = yh0.s.g(context, localAssetName, yh0.t.Drawable);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                numG = yh0.s.g(context, localAssetName, yh0.t.Raw);
                if (numG != null) {
                    j0Var.f86523a = true;
                } else {
                    numG = yh0.s.g(context, localAssetName, yh0.t.Drawable);
                }
            }
            if (numG != null) {
                final int iIntValue = numG.intValue();
                int i12 = iArr[localAssetContentType.ordinal()];
                if (i12 == 1) {
                    final bi0.e eVarC = bi0.e.c(p5Var.getLayoutInflater());
                    p5Var.d(new wn0.a() { // from class: oi0.p4
                        @Override // wn0.a
                        public final Object invoke() {
                            return u4.o(eVarC, remoteImage);
                        }
                    });
                    eVarC.f17431b.setAnimation(iIntValue);
                    aVar = eVarC;
                } else if (i12 == 2) {
                    final bi0.f fVarC = bi0.f.c(p5Var.getLayoutInflater());
                    p5Var.d(new wn0.a() { // from class: oi0.q4
                        @Override // wn0.a
                        public final Object invoke() {
                            return u4.p(fVarC, remoteImage, iIntValue);
                        }
                    });
                    aVar = fVarC;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final bi0.f fVarC2 = bi0.f.c(p5Var.getLayoutInflater());
                    p5Var.d(new wn0.a() { // from class: oi0.r4
                        @Override // wn0.a
                        public final Object invoke() {
                            return u4.q(fVarC2, remoteImage, j0Var, iIntValue);
                        }
                    });
                    aVar = fVarC2;
                }
                return aVar.getRoot();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o(bi0.e eVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.f(lottieView, remoteImage);
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p(bi0.f fVar, RemoteImage remoteImage, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ui0.g.f(imageView, remoteImage);
        fVar.f17433b.setImageResource(i11);
        fVar.f17433b.setScaleType(ImageView.ScaleType.FIT_XY);
        fVar.f17433b.setAdjustViewBounds(true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q(bi0.f fVar, final RemoteImage remoteImage, p013kotlin.jvm.internal.j0 j0Var, int i11) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ui0.g.f(imageView, remoteImage);
        if (j0Var.f86523a) {
            Context context = fVar.f17433b.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            ec.r rVarC = new ec.r.a(context).c();
            ImageView imageView2 = fVar.f17433b;
            p013kotlin.jvm.internal.s.j(imageView2, "imageView");
            ImageRequest.a aVarO = rc.i.o(new ImageRequest.a(imageView2.getContext()).c(Integer.valueOf(i11)), imageView2);
            aVarO.d(new gc.k.a() { // from class: oi0.t4
                @Override // gc.k.a
                public final gc.k a(SourceFetchResult sourceFetchResult, Options options, ec.r rVar) {
                    return u4.r(remoteImage, sourceFetchResult, options, rVar);
                }
            });
            rVarC.b(aVarO.b());
        } else {
            fVar.f17433b.setImageResource(i11);
        }
        fVar.f17433b.setScaleType(ImageView.ScaleType.FIT_XY);
        fVar.f17433b.setAdjustViewBounds(true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gc.k r(RemoteImage remoteImage, SourceFetchResult result, Options options, ec.r rVar) {
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(rVar, "<unused var>");
        byte[] bArrV0 = result.getSource().source().V0();
        Charset charset = p013kotlin.text.d.UTF_8;
        byte[] bytes = i(new String(bArrV0, charset), remoteImage.getStyles()).getBytes(charset);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return new tc.d(gc.v.c(new okio.h().write(bytes), options.getFileSystem(), null, 4, null), options, false, false, false, 28, null);
    }

    private static final View s(RemoteImageComponent remoteImageComponent, p5 p5Var, final RemoteImage remoteImage) {
        gb.a aVar;
        final RemoteImage.Attributes attributes = remoteImage.getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i11 = contentType == null ? -1 : a.f97780a[contentType.ordinal()];
        if (i11 == 1) {
            final bi0.e eVarC = bi0.e.c(p5Var.getLayoutInflater());
            p5Var.d(new wn0.a() { // from class: oi0.n4
                @Override // wn0.a
                public final Object invoke() {
                    return u4.t(eVarC, remoteImage);
                }
            });
            eVarC.f17431b.G(attributes.getUrl());
            aVar = eVarC;
        } else if (i11 != 3) {
            final bi0.f fVarC = bi0.f.c(p5Var.getLayoutInflater());
            p5Var.d(new wn0.a() { // from class: oi0.o4
                @Override // wn0.a
                public final Object invoke() {
                    return u4.u(fVarC, remoteImage, attributes);
                }
            });
            aVar = fVarC;
        } else {
            final bi0.f fVarC2 = bi0.f.c(p5Var.getLayoutInflater());
            p5Var.d(new wn0.a() { // from class: oi0.m4
                @Override // wn0.a
                public final Object invoke() {
                    return u4.v(fVarC2, remoteImage, attributes);
                }
            });
            aVar = fVarC2;
        }
        View root = aVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t(bi0.e eVar, RemoteImage remoteImage) {
        ThemeableLottieAnimationView lottieView = eVar.f17431b;
        p013kotlin.jvm.internal.s.j(lottieView, "lottieView");
        ui0.g.f(lottieView, remoteImage);
        eVar.f17431b.setRepeatMode(1);
        eVar.f17431b.setRepeatCount(-1);
        eVar.f17431b.v();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u(bi0.f fVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ui0.g.f(imageView, remoteImage);
        String url = attributes != null ? attributes.getUrl() : null;
        ImageView imageView2 = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView2, "imageView");
        j(imageView2, url);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v(bi0.f fVar, RemoteImage remoteImage, RemoteImage.Attributes attributes) {
        ImageView imageView = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView, "imageView");
        ui0.g.f(imageView, remoteImage);
        ImageView imageView2 = fVar.f17433b;
        p013kotlin.jvm.internal.s.j(imageView2, "imageView");
        k(imageView2, attributes.getUrl(), remoteImage.getStyles());
        return jn0.h0.f84049a;
    }

    private static final String w(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        try {
            Color.parseColor(str3);
            str5 = str;
            str6 = str2;
            try {
                return p013kotlin.text.t.V(str5, str6, str3, false, 4, null);
            } catch (IllegalArgumentException unused) {
                return p013kotlin.text.t.V(str5, str6, str4, false, 4, null);
            }
        } catch (IllegalArgumentException unused2) {
            str5 = str;
            str6 = str2;
        }
    }
}
